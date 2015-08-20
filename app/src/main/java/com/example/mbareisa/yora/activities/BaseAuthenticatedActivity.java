package com.example.mbareisa.yora.activities;

import android.content.Intent;
import android.os.Bundle;

//activity is used when user is logged in
public abstract class BaseAuthenticatedActivity extends BaseActivity {

    @Override
    protected final void onCreate(Bundle savedState){
        super.onCreate(savedState);

        //when not logged in, open LoginActivity
        if(!application.getAuth().getUser().isLoggedIn()){
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }
        onYoraCreate(savedState);
    }
    //only gets invoked during onCreate if user is logged in
    protected abstract void onYoraCreate(Bundle savedInstance);
}
