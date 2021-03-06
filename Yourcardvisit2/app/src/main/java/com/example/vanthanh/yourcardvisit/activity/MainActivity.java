package com.example.vanthanh.yourcardvisit.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.vanthanh.yourcardvisit.R;
import com.example.vanthanh.yourcardvisit.controls.Func_fragment;
import com.example.vanthanh.yourcardvisit.staticvalues.StaticValues;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity {
    String PREF ="state";
    SharedPreferences mSharedPrefer;
    SharedPreferences.Editor editor;



    private CallbackManager mCallbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        setContentView(R.layout.activity_main);
        final RelativeLayout layout=(RelativeLayout)findViewById(R.id.main);

        mCallbackManager = CallbackManager.Factory.create();
        final LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email", "public_profile", "user_friends");
        loginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d(StaticValues.TAG, "facebook:onSuccess:" + loginResult.getAccessToken().getUserId());
                StaticValues.idfacebook = loginResult.getAccessToken().getUserId().toString();

                Func_fragment.setFragment(MainActivity.this, StaticValues.TAG_FRAGMENTMAIN);
                layout.setBackgroundColor(Color.WHITE);
                loginButton.setVisibility(View.GONE);

                editor.putBoolean(PREF, true);
                editor.commit();
            }

            @Override
            public void onCancel() {
                Log.d(StaticValues.TAG, "facebook:onCancel");
                // ...
            }

            @Override
            public void onError(FacebookException error) {
                Log.d(StaticValues.TAG, "facebook:onError", error);
                // ...
            }
        });
        AccessTokenTracker accessTokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(
                    AccessToken oldAccessToken,
                    AccessToken currentAccessToken) {

                if (currentAccessToken == null){
                    editor.putBoolean(PREF,false);
                    editor.commit();
                }
            }
        };
        accessTokenTracker.startTracking();
        mSharedPrefer =getSharedPreferences(PREF, 0);
        editor=mSharedPrefer.edit();
        boolean flag=mSharedPrefer.getBoolean(PREF,false);
        if(flag){
            Func_fragment.setFragment(MainActivity.this, StaticValues.TAG_FRAGMENTMAIN);
            layout.setBackgroundColor(Color.WHITE);
            loginButton.setVisibility(View.GONE);
        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }



}
