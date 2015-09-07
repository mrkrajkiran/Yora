package com.example.mbareisa.yora.activities;

import android.os.Bundle;

import com.example.mbareisa.yora.R;
import com.example.mbareisa.yora.views.MainNavDrawer;

public class SentMessagesActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onYoraCreate(Bundle savedInstance) {
        setContentView(R.layout.activity_sent_messages);
        setNavDrawer(new MainNavDrawer(this));
    }
}
