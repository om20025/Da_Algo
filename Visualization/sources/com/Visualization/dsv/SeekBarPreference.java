package com.gbhat.dsv;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends Preference implements SeekBar.OnSeekBarChangeListener {
    private static final String ANDROIDNS = "http://schemas.android.com/apk/res/android";
    private static final String APPLICATIONNS = "slider";
    private static final int DEFAULT_VALUE = 50;
    private int mCurrentValue;
    private int mInterval = 1;
    private int mMaxValue = 100;
    private int mMinValue = 0;
    private SeekBar mSeekBar;
    private TextView mStatusText;
    private String mUnitsLeft = "";
    private String mUnitsRight = "";

    public SeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPreference(context, attrs);
    }

    public SeekBarPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initPreference(context, attrs);
    }

    private void initPreference(Context context, AttributeSet attrs) {
        setValuesFromXml(attrs);
        setWidgetLayoutResource(R.layout.seek_bar_preference);
    }

    private void setValuesFromXml(AttributeSet attrs) {
        this.mMaxValue = attrs.getAttributeIntValue(ANDROIDNS, "max", 100);
        this.mMinValue = attrs.getAttributeIntValue(APPLICATIONNS, "min", 0);
        this.mUnitsLeft = getAttributeStringValue(attrs, APPLICATIONNS, "unitsLeft", "");
        this.mUnitsRight = getAttributeStringValue(attrs, APPLICATIONNS, "unitsRight", getAttributeStringValue(attrs, APPLICATIONNS, "units", ""));
        try {
            String newInterval = attrs.getAttributeValue(APPLICATIONNS, "interval");
            if (newInterval != null) {
                this.mInterval = Integer.parseInt(newInterval);
            }
        } catch (Exception e) {
        }
    }

    private String getAttributeStringValue(AttributeSet attrs, String namespace, String name, String defaultValue) {
        String value = attrs.getAttributeValue(namespace, name);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup parent) {
        View view = super.onCreateView(parent);
        ((LinearLayout) view).setOrientation(1);
        return view;
    }

    public void onBindView(View view) {
        super.onBindView(view);
        updateView(view);
    }

    /* access modifiers changed from: protected */
    public void updateView(View view) {
        try {
            this.mStatusText = (TextView) view.findViewById(R.id.seekBarPrefValue);
            this.mStatusText.setText(String.valueOf(this.mCurrentValue));
            this.mStatusText.setMinimumWidth(30);
            this.mSeekBar = (SeekBar) view.findViewById(R.id.seekBarPrefSeekBar);
            this.mSeekBar.setMax(this.mMaxValue - this.mMinValue);
            this.mSeekBar.setOnSeekBarChangeListener(this);
            this.mSeekBar.setProgress(this.mCurrentValue - this.mMinValue);
            ((TextView) view.findViewById(R.id.seekBarPrefUnitsRight)).setText(this.mUnitsRight);
            ((TextView) view.findViewById(R.id.seekBarPrefUnitsLeft)).setText(this.mUnitsLeft);
        } catch (Exception e) {
        }
    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int newValue = progress + this.mMinValue;
        if (newValue > this.mMaxValue) {
            newValue = this.mMaxValue;
        } else if (newValue < this.mMinValue) {
            newValue = this.mMinValue;
        } else if (!(this.mInterval == 1 || newValue % this.mInterval == 0)) {
            newValue = Math.round(((float) newValue) / ((float) this.mInterval)) * this.mInterval;
        }
        if (!callChangeListener(Integer.valueOf(newValue))) {
            seekBar.setProgress(this.mCurrentValue - this.mMinValue);
            return;
        }
        this.mCurrentValue = newValue;
        this.mStatusText.setText(String.valueOf(newValue));
        persistInt(newValue);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        notifyChanged();
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray ta, int index) {
        return Integer.valueOf(ta.getInt(index, 50));
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean restoreValue, Object defaultValue) {
        if (restoreValue) {
            this.mCurrentValue = getPersistedInt(this.mCurrentValue);
            return;
        }
        int temp = 0;
        try {
            temp = ((Integer) defaultValue).intValue();
        } catch (Exception e) {
        }
        persistInt(temp);
        this.mCurrentValue = temp;
    }

    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.mSeekBar.setEnabled(enabled);
    }

    public void onDependencyChanged(Preference dependency, boolean disableDependent) {
        super.onDependencyChanged(dependency, disableDependent);
        if (this.mSeekBar != null) {
            this.mSeekBar.setEnabled(!disableDependent);
        }
    }
}
