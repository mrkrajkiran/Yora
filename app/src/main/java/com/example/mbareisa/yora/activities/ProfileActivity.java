package com.example.mbareisa.yora.activities;

import android.os.Bundle;

import com.example.mbareisa.yora.R;
import com.example.mbareisa.yora.views.MainNavDrawer;

public class ProfileActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onYoraCreate(Bundle savedInstance) {
        setContentView(R.layout.activity_profile);
        setNavDrawer(new MainNavDrawer(this));
    }
}
