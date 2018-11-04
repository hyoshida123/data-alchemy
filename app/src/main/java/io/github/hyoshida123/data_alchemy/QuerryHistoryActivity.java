package io.github.hyoshida123.data_alchemy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuerryHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_querry_history);
    }

    public void back(View view) {
        Intent intent =new Intent(this, CameraActivity.class);
        startActivity(intent);
    }
}
