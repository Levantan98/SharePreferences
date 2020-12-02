package com.example.sharepreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.sharepreferences.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding  binding;
    private final String PREFERENCES_NAME = "levantan";
    private final String AGE= "1";
    private final String NAME = "name";
    private final String GT= "nam";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        super.onCreate(savedInstanceState);
       binding.btnSave.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               SharedPreferences preferences = getSharedPreferences(PREFERENCES_NAME,
                       Context.MODE_PRIVATE);
               SharedPreferences.Editor editor = preferences.edit();
               editor.putInt(AGE,10);
               editor.putString(NAME,"Letan");
               editor.putBoolean(GT,false);
               editor.apply();
               Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
               Log.d(AGE,"log");

           }
       });
    }
}