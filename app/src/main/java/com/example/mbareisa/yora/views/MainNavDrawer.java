package com.example.mbareisa.yora.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mbareisa.yora.R;
import com.example.mbareisa.yora.activities.BaseActivity;
import com.example.mbareisa.yora.activities.ContactsActivity;
import com.example.mbareisa.yora.activities.MainActivity;
import com.example.mbareisa.yora.activities.ProfileActivity;
import com.example.mbareisa.yora.activities.SentMessagesActivity;
import com.example.mbareisa.yora.infrastructure.User;

public class MainNavDrawer extends NavDrawer {
    private final TextView displayNameText;
    private final ImageView avatarImage;

    public MainNavDrawer(final BaseActivity activity) {
        super(activity);

        //adds activity item
        addItem(new ActivityNavDrawerItem(MainActivity.class, "Inbox", null, R.drawable.ic_action_unread, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(SentMessagesActivity.class, "Sent Messages", null, R.drawable.ic_action_send_now, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(ContactsActivity.class, "Contacts", null, R.drawable.ic_action_group, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(ProfileActivity.class, "Profiles", null, R.drawable.ic_action_person, R.id.include_main_nav_drawer_topItems));

        addItem(new BasicNavDrawerItem("Logout", null, R.drawable.ic_action_backspace,
                R.id.include_main_nav_drawer_bottomItems) {
            @Override
        public void onClick(View view){
                Toast.makeText(activity, "You have logged out!", Toast.LENGTH_SHORT).show();
            }
        });

        displayNameText = (TextView) navDrawerView.findViewById(R.id.include_main_nav_drawer_displayName);
        avatarImage = (ImageView) navDrawerView.findViewById(R.id.include_main_nav_drawer_avatar);

        User loggedInUser = activity.getYoraApplication().getAuth().getUser();
        displayNameText.setText(loggedInUser.getDisplayName());

        // todo: change avatarImage to avatarUrl from loggedInUser

    }
}