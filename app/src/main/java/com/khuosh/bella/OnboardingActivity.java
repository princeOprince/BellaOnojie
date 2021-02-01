package com.khuosh.bella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Bella_Launcher_Onboarding);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
    }

    public void login(View view) {
        startActivity(new Intent(OnboardingActivity.this,));
    }
}