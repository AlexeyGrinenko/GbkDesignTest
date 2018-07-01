package com.alexg.gbkdesigntest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.Window;
import android.widget.CompoundButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_profile);
        final SwitchCompat facebookSwitch = findViewById(R.id.profile_switch_facebook);
        facebookSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    facebookSwitch.setBackgroundResource(R.drawable.bg_switch_on);
                } else {
                    facebookSwitch.setBackgroundResource(R.drawable.bg_switch_off);
                }

            }
        });

        final SwitchCompat twitterSwitch = findViewById(R.id.profile_switch_twitter);
        twitterSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    twitterSwitch.setBackgroundResource(R.drawable.bg_switch_on);
                } else {
                    twitterSwitch.setBackgroundResource(R.drawable.bg_switch_off);
                }

            }
        });
    }

}
