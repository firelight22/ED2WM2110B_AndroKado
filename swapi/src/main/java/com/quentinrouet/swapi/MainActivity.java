package com.quentinrouet.swapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHttpClient client = new OkHttpClient();
        Request requestStarships = new Request.Builder()
                .url("https://swapi.dev/api/starships")
                .build();
        client.newCall(requestStarships).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                Log.i(TAG, "onResponse: " + response.code());
                String resultatString = response.body().string();
                try {
                    JSONObject resultatJson = new JSONObject(resultatString);
                    JSONArray starshipsJson = resultatJson.getJSONArray("results");
                    for(int i =0; i< starshipsJson.length(); i++){
                        JSONObject starship = starshipsJson.getJSONObject(i);
                        Log.i(TAG, "onResponse: " + starship.getString("name"));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                runOnUiThread(() -> {
                    Toast.makeText(MainActivity.this, "Requête OK", Toast.LENGTH_SHORT).show();
                });

            }
        });
    }
}