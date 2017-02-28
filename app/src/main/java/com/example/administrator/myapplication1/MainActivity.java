package com.example.administrator.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends Activity {
    private CheckBox cbk_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbk_test=(CheckBox)findViewById(R.id.cbk_test);
        cbk_test.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    cbk_test.setText(R.string.cbk_checked);
                }
                else
                    cbk_test.setText(R.string.cbk_unchecked);
            }
        });
    }
}
