package com.gbhat.dsv;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class TreeActivity extends AppCompatActivity {
    public static int TREE_TYPE_AVL = 3;
    public static int TREE_TYPE_BST = 1;
    public static int TREE_TYPE_RB = 2;
    private final int Show_null_leaves = 321;
    private boolean animationRunning = true;
    private boolean nullLeavesShown = false;
    /* access modifiers changed from: private */
    public EditText selectedEditText;
    private int treetype;
    /* access modifiers changed from: private */
    public WebView webView;
    private FrameLayout webViewHolder;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tree);
        initView();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (this.webView != null) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    TreeActivity.this.webView.loadUrl("javascript:setAnimationSpeed(" + TreeActivity.this.getAnimSpeed() + ")");
                }
            }, 500);
        }
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#F0F0F0"));
        super.onResume();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sub, menu);
        if (this.treetype != TREE_TYPE_RB) {
            return true;
        }
        menu.add(0, 321, 100, "Show Null Leaves");
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.treetype == TREE_TYPE_RB) {
            MenuItem item = menu.findItem(321);
            if (this.nullLeavesShown) {
                item.setTitle("Hide Null Leaves");
            } else {
                item.setTitle("Show Null Leaves");
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == 321) {
            if (this.nullLeavesShown) {
                this.nullLeavesShown = false;
                this.webView.loadUrl("javascript:hideNullLeaves()");
            } else {
                this.nullLeavesShown = true;
                this.webView.loadUrl("javascript:showNullLeaves()");
            }
        }
        if (id == R.id.zoomin) {
            this.webView.zoomIn();
        }
        if (id == R.id.zoomout) {
            this.webView.zoomOut();
        }
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        if (this.webView != null) {
            this.webViewHolder.removeView(this.webView);
        }
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 2) {
            setContentView((int) R.layout.activity_tree_land);
        } else {
            setContentView((int) R.layout.activity_tree);
        }
        initView();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.webView.saveState(outState);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        this.webView.restoreState(savedInstanceState);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.anim_new_out, R.animator.anim_old_in);
    }

    private void initView() {
        View keyboard;
        if (getResources().getConfiguration().orientation == 1) {
            keyboard = getLayoutInflater().inflate(R.layout.layout_keyboard, (ViewGroup) null);
        } else {
            keyboard = getLayoutInflater().inflate(R.layout.layout_keyboard_land, (ViewGroup) null);
        }
        ((FrameLayout) findViewById(R.id.keyboardHolder)).addView(keyboard);
        hideKeyboard();
        int ds = getIntent().getIntExtra("TreeType", 1);
        if (ds == 1) {
            this.treetype = TREE_TYPE_BST;
        } else if (ds == 2) {
            this.treetype = TREE_TYPE_RB;
        } else if (ds == 3) {
            this.treetype = TREE_TYPE_AVL;
        }
        if (this.treetype == TREE_TYPE_BST) {
            setTitle("Binary Search Tree");
        } else if (this.treetype == TREE_TYPE_RB) {
            setTitle("Red Black Tree");
        } else {
            setTitle("AVL Tree");
        }
        if (this.animationRunning) {
            ((ImageView) findViewById(R.id.animPause)).setImageResource(R.drawable.pause);
        } else {
            ((ImageView) findViewById(R.id.animPause)).setImageResource(R.drawable.play);
        }
        ((Button) findViewById(R.id.insertButton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TreeActivity.this.hideKeyboard();
                EditText insertField = (EditText) TreeActivity.this.findViewById(R.id.insertField);
                if (insertField.getText().length() > 0) {
                    TreeActivity.this.webView.loadUrl("javascript:insertNode(" + insertField.getText().toString() + ");");
                }
                insertField.setText("");
            }
        });
        ((Button) findViewById(R.id.deleteButton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TreeActivity.this.hideKeyboard();
                EditText deleteField = (EditText) TreeActivity.this.findViewById(R.id.deleteField);
                if (deleteField.getText().length() > 0) {
                    TreeActivity.this.webView.loadUrl("javascript:deleteNode(" + deleteField.getText().toString() + ");");
                }
                deleteField.setText("");
            }
        });
        ((Button) findViewById(R.id.findButton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TreeActivity.this.hideKeyboard();
                EditText findField = (EditText) TreeActivity.this.findViewById(R.id.findField);
                if (findField.getText().length() > 0) {
                    TreeActivity.this.webView.loadUrl("javascript:findNode(" + findField.getText().toString() + ");");
                }
                findField.setText("");
            }
        });
        ((Button) findViewById(R.id.printButton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TreeActivity.this.hideKeyboard();
                TreeActivity.this.webView.loadUrl("javascript:printTree();");
            }
        });
        setupEditText((EditText) findViewById(R.id.insertField));
        setupEditText((EditText) findViewById(R.id.deleteField));
        setupEditText((EditText) findViewById(R.id.findField));
        this.webViewHolder = (FrameLayout) findViewById(R.id.webViewHolder);
        if (this.webView != null) {
            this.webViewHolder.removeView(this.webView);
        }
        if (this.webView == null) {
            this.webView = new WebView(this);
            this.webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.webView.setScrollBarStyle(33554432);
            this.webView.setScrollbarFadingEnabled(true);
            this.webView.getSettings().setLoadsImagesAutomatically(true);
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setSupportZoom(true);
            this.webView.setOverScrollMode(2);
            this.webView.setInitialScale(getScale());
            this.webView.setBackgroundColor(Color.parseColor("#F0F0F0"));
            this.webView.addJavascriptInterface(new JavaScriptInterface(this), "JSInterface");
            if (this.treetype == TREE_TYPE_BST) {
                this.webView.loadUrl("file:///android_asset/html/BST.html");
            } else if (this.treetype == TREE_TYPE_RB) {
                this.webView.loadUrl("file:///android_asset/html/RedBlack.html");
            } else if (this.treetype == TREE_TYPE_AVL) {
                this.webView.loadUrl("file:///android_asset/html/AVLtree.html");
            }
            this.webView.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView view, String url) {
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            TreeActivity.this.webView.loadUrl("javascript:setAnimationSpeed(" + TreeActivity.this.getAnimSpeed() + ")");
                        }
                    }, 500);
                }

                public void onScaleChanged(WebView view, float oldScale, float newScale) {
                    TreeActivity.this.saveScale(newScale);
                }
            });
        }
        this.webViewHolder.addView(this.webView);
    }

    /* access modifiers changed from: private */
    public void saveScale(float scale) {
        SharedPreferences.Editor spEditor = getSharedPreferences("pref_zoom_control", 0).edit();
        spEditor.putInt("pref_tree_zoom_scale", Math.round(100.0f * scale));
        spEditor.commit();
    }

    /* access modifiers changed from: private */
    public int getAnimSpeed() {
        return PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getInt("pref_animation_speed", 50);
    }

    private int getScale() {
        return getSharedPreferences("pref_zoom_control", 0).getInt("pref_tree_zoom_scale", 0);
    }

    private void setupEditText(final EditText editText) {
        editText.setInputType(0);
        editText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText unused = TreeActivity.this.selectedEditText = editText;
                TreeActivity.this.showKeyboard();
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    EditText unused = TreeActivity.this.selectedEditText = editText;
                    TreeActivity.this.showKeyboard();
                } else {
                    EditText unused2 = TreeActivity.this.selectedEditText = null;
                }
                TreeActivity.this.hideKeyboard();
            }
        });
    }

    /* access modifiers changed from: private */
    public void showKeyboard() {
        View keyboard = findViewById(R.id.keyBoard);
        if (keyboard != null) {
            keyboard.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void hideKeyboard() {
        View keyboard = findViewById(R.id.keyBoard);
        if (keyboard != null) {
            keyboard.setVisibility(8);
        }
    }

    public void onKeyboardClick(View view) {
        int no = 0;
        if (view.getId() == R.id.kbdBtnBack) {
            String text = this.selectedEditText.getText().toString();
            if (text.length() > 0) {
                this.selectedEditText.setText(text.substring(0, text.length() - 1));
                return;
            }
            return;
        }
        switch (view.getId()) {
            case R.id.kbdBtn1:
                no = 1;
                break;
            case R.id.kbdBtn2:
                no = 2;
                break;
            case R.id.kbdBtn3:
                no = 3;
                break;
            case R.id.kbdBtn4:
                no = 4;
                break;
            case R.id.kbdBtn5:
                no = 5;
                break;
            case R.id.kbdBtn6:
                no = 6;
                break;
            case R.id.kbdBtn7:
                no = 7;
                break;
            case R.id.kbdBtn8:
                no = 8;
                break;
            case R.id.kbdBtn9:
                no = 9;
                break;
            case R.id.kbdBtn0:
                no = 0;
                break;
        }
        if (this.selectedEditText != null) {
            this.selectedEditText.setText(this.selectedEditText.getText().toString() + no);
        }
    }

    public void onAnimControlClick(View view) {
        final ImageView imgView = (ImageView) view;
        imgView.setColorFilter(Color.argb(128, 0, 0, 0));
        new Handler().postDelayed(new Runnable() {
            public void run() {
                imgView.clearColorFilter();
            }
        }, 350);
        switch (view.getId()) {
            case R.id.animSkipBack:
                this.webView.loadUrl("javascript:animSkipBack()");
                return;
            case R.id.animStepBack:
                this.webView.loadUrl("javascript:animStepBack()");
                return;
            case R.id.animPause:
                this.webView.loadUrl("javascript:animPause()");
                if (this.animationRunning) {
                    this.animationRunning = false;
                    ((ImageView) findViewById(R.id.animPause)).setImageResource(R.drawable.play);
                    return;
                }
                this.animationRunning = true;
                ((ImageView) findViewById(R.id.animPause)).setImageResource(R.drawable.pause);
                return;
            case R.id.animStepForward:
                this.webView.loadUrl("javascript:animStepForward()");
                return;
            case R.id.animSkipForward:
                this.webView.loadUrl("javascript:animSkipForward()");
                return;
            default:
                return;
        }
    }

    class JavaScriptInterface {
        Context mContext;

        JavaScriptInterface(Context c) {
            this.mContext = c;
        }

        @JavascriptInterface
        public void disableUI() {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    JavaScriptInterface.this.enableUIControls(false);
                }
            }, 10);
        }

        @JavascriptInterface
        public void enableUI() {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    JavaScriptInterface.this.enableUIControls(true);
                }
            }, 10);
        }

        @JavascriptInterface
        public boolean canScroll() {
            return PreferenceManager.getDefaultSharedPreferences(TreeActivity.this.getApplicationContext()).getBoolean("pref_scroll_auto", true);
        }

        @JavascriptInterface
        public void showMessage(final String text) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    JavaScriptInterface.this.doShowMessage(text);
                }
            }, 10);
        }

        /* access modifiers changed from: private */
        public void enableUIControls(final boolean enabled) {
            TreeActivity.this.runOnUiThread(new Runnable() {
                public void run() {
                    TreeActivity.this.findViewById(R.id.insertField).setEnabled(enabled);
                    TreeActivity.this.findViewById(R.id.insertButton).setEnabled(enabled);
                    TreeActivity.this.findViewById(R.id.deleteField).setEnabled(enabled);
                    TreeActivity.this.findViewById(R.id.deleteButton).setEnabled(enabled);
                    TreeActivity.this.findViewById(R.id.findField).setEnabled(enabled);
                    TreeActivity.this.findViewById(R.id.findButton).setEnabled(enabled);
                    TreeActivity.this.findViewById(R.id.printButton).setEnabled(enabled);
                }
            });
        }

        /* access modifiers changed from: private */
        public void doShowMessage(final String text) {
            TreeActivity.this.runOnUiThread(new Runnable() {
                public void run() {
                    ((TextView) TreeActivity.this.findViewById(R.id.messageText)).setText(text);
                }
            });
        }
    }
}
