package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class TintContextWrapper extends ContextWrapper {
    private Resources mResources;

    public static Context wrap(Context context) {
        if (!(context instanceof TintContextWrapper)) {
            return new TintContextWrapper(context);
        }
        return context;
    }

    private TintContextWrapper(Context base) {
        super(base);
    }

    public Resources getResources() {
        if (this.mResources == null) {
            this.mResources = new TintResources(super.getResources(), TintManager.get(this));
        }
        return this.mResources;
    }

    static class TintResources extends ResourcesWrapper {
        private final TintManager mTintManager;

        public TintResources(Resources resources, TintManager tintManager) {
            super(resources);
            this.mTintManager = tintManager;
        }

        public Drawable getDrawable(int id) throws Resources.NotFoundException {
            Drawable d = super.getDrawable(id);
            if (d != null) {
                this.mTintManager.tintDrawableUsingColorFilter(id, d);
            }
            return d;
        }
    }
}
