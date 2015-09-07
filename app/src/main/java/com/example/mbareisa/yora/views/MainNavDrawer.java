package com.example.mbareisa.yora.views;

import android.view.View;
import android.widget.Toast;

import com.example.mbareisa.yora.R;
import com.example.mbareisa.yora.activities.BaseActivity;
import com.example.mbareisa.yora.activities.MainActivity;

public class MainNavDrawer extends NavDrawer {
    public MainNavDrawer(final BaseActivity activity) {
        super(activity);

        //adds activity item
        addItem(new ActivityNavDrawerItem(MainActivity.class,
                "Inbox", null, R.drawable.ic_action_unread, R.id.include_main_nav_drawer_topItems));

        addItem(new BasicNavDrawerItem("Logout", null, R.drawable.ic_action_backspace,
                R.id.include_main_nav_drawer_bottomItems) {
            @Override
        public void onClick(View view){
                Toast.makeText(activity, "You have logged out!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}