package cz.lyosoft.aionmemory;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class WeeklyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);
        load(findViewById(android.R.id.content));
    }

    public void reset(View view) {
        CheckBox chk = findViewById(R.id.chkb121);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb122);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb123);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb124);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb125);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb126);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb127);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb128);
        chk.setChecked(false);

        chk = findViewById(R.id.chkb129);
        chk.setChecked(false);

    }

    public void save(View view) {
        SharedPreferences garisons = getSharedPreferences("garissons", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = garisons.edit();
        editor.putBoolean("chkb121", ((CheckBox)findViewById(R.id.chkb121)).isChecked());
        editor.putBoolean("chkb122", ((CheckBox)findViewById(R.id.chkb122)).isChecked());
        editor.putBoolean("chkb123", ((CheckBox)findViewById(R.id.chkb123)).isChecked());
        editor.putBoolean("chkb124", ((CheckBox)findViewById(R.id.chkb124)).isChecked());
        editor.putBoolean("chkb125", ((CheckBox)findViewById(R.id.chkb125)).isChecked());
        editor.putBoolean("chkb126", ((CheckBox)findViewById(R.id.chkb126)).isChecked());
        editor.putBoolean("chkb127", ((CheckBox)findViewById(R.id.chkb127)).isChecked());
        editor.putBoolean("chkb128", ((CheckBox)findViewById(R.id.chkb128)).isChecked());
        editor.putBoolean("chkb129", ((CheckBox)findViewById(R.id.chkb129)).isChecked());
        editor.apply();;
    }
    
    public void load(View view) {
        // Load
        SharedPreferences garisons = getSharedPreferences("garissons", Context.MODE_PRIVATE);
        ((CheckBox)findViewById(R.id.chkb121)).setChecked(garisons.getBoolean("chkb121", false));
        ((CheckBox)findViewById(R.id.chkb122)).setChecked(garisons.getBoolean("chkb122", false));
        ((CheckBox)findViewById(R.id.chkb123)).setChecked(garisons.getBoolean("chkb123", false));
        ((CheckBox)findViewById(R.id.chkb124)).setChecked(garisons.getBoolean("chkb124", false));
        ((CheckBox)findViewById(R.id.chkb125)).setChecked(garisons.getBoolean("chkb125", false));
        ((CheckBox)findViewById(R.id.chkb126)).setChecked(garisons.getBoolean("chkb126", false));
        ((CheckBox)findViewById(R.id.chkb127)).setChecked(garisons.getBoolean("chkb127", false));
        ((CheckBox)findViewById(R.id.chkb128)).setChecked(garisons.getBoolean("chkb128", false));
        ((CheckBox)findViewById(R.id.chkb129)).setChecked(garisons.getBoolean("chkb129", false));
    }
}
