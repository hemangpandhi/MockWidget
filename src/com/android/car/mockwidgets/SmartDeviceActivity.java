package com.android.car.mockwidgets;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SmartDeviceActivity extends Activity {
    private static final String TAG = "SmartDeviceActivity";
    private boolean mGarageClosed = true;
    private boolean mLightsOff = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smart_device_widget);


        Button btnGarage = findViewById(R.id.btn_garage);
        btnGarage.setOnClickListener(v -> {
            mGarageClosed = !mGarageClosed;
            if (mGarageClosed) {
                btnGarage.setText("Closed");
                btnGarage.setBackgroundColor(0xFFFF9800); // Orange
            } else {
                btnGarage.setText("Open");
                btnGarage.setBackgroundColor(0xFF4CAF50); // Green
            }
        });

        Button btnLights = findViewById(R.id.btn_lights);
        btnLights.setOnClickListener(v -> {
            mLightsOff = !mLightsOff;
            if (mLightsOff) {
                btnLights.setText("OFF");
                btnLights.setBackgroundTintList(android.content.res.ColorStateList.valueOf(0x4DFFFFFF));
            } else {
                btnLights.setText("ON");
                btnLights.setBackgroundTintList(android.content.res.ColorStateList.valueOf(0xFF2196F3)); // Blue
            }
        });
    }
}
