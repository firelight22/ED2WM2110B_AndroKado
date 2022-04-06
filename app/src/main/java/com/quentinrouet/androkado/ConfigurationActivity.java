package com.quentinrouet.androkado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Switch;

public class ConfigurationActivity extends AppCompatActivity {
    private static final String SP_FILE_NAME = "SPCONFIGANDROKADO";
    public static final String KEY_TRI_PRIX = "KEYTRIPRIX";
    public static final String KEY_PRIX_DEF = "KEYPRIXDEF";

    private Switch switchTriPrix;
    private EditText editTextPrixDef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        switchTriPrix = findViewById(R.id.switchTriPrix);
        editTextPrixDef = findViewById(R.id.editTextPrixDef);
        boolean triPrix = getSharedPreferences(SP_FILE_NAME,MODE_PRIVATE).getBoolean(KEY_TRI_PRIX, false);
        int prixDef = getSharedPreferences(SP_FILE_NAME,MODE_PRIVATE).getInt(KEY_PRIX_DEF,12);
        switchTriPrix.setChecked(triPrix);
        editTextPrixDef.setText(String.valueOf(prixDef));

    }

    @Override
    protected void onStop() {
        super.onStop();
        boolean triPrix = switchTriPrix.isChecked();
        int prixDef = Integer.parseInt(editTextPrixDef.getText().toString());
        getSharedPreferences(SP_FILE_NAME,MODE_PRIVATE).edit()
                .putBoolean(KEY_TRI_PRIX, triPrix)
                .putInt(KEY_PRIX_DEF,prixDef).commit();

    }
}