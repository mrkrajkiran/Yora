package com.example.mbareisa.yora.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.mbareisa.yora.R;
import com.example.mbareisa.yora.views.MainNavDrawer;

public class ProfileActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onYoraCreate(Bundle savedInstance) {
        setContentView(R.layout.activity_profile);
        setNavDrawer(new MainNavDrawer(this));

        if (!isTablet){
            View textFields = findViewById(R.id.activity_profile_textFields);

            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) textFields.getLayoutParams();
            params.setMargins(0, params.getMarginStart(), 0, 0);
            params.removeRule(RelativeLayout.END_OF);
            params.addRule(RelativeLayout.BELOW, R.id.activity_profile_change_avatar);
            textFields.setLayoutParams(params);
        }
    }
}
