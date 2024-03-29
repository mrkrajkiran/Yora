package com.example.mbareisa.yora.activities;

import android.os.Bundle;
import com.example.mbareisa.yora.R;
import com.example.mbareisa.yora.views.MainNavDrawer;

public class MainActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onYoraCreate(Bundle savedInstance) {
        setContentView(R.layout.activity_main);
        assert getSupportActionBar() != null; //this could cause some problems in the future.
        getSupportActionBar().setTitle("Inbox");

        //applying a particular navDrawer
        setNavDrawer(new MainNavDrawer(this));
    }
}
