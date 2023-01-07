package com.gbhat.dsv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle((CharSequence) "Settings");
        getFragmentManager().beginTransaction().replace(16908290, new SettingsFragment()).commit();
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.anim_new_out, R.animator.anim_old_in);
    }
}
