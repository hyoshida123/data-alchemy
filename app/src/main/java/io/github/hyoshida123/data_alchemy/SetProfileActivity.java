package io.github.hyoshida123.data_alchemy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SetProfileActivity extends AppCompatActivity implements
        View.OnClickListener {

    private EditText mNameField;
    private EditText mAgeField;

    private Button mSendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_profile);

        mNameField = findViewById(R.id.nameText);
        mAgeField = findViewById(R.id.ageText);

        mSendButton = findViewById(R.id.sendButton);
        mSendButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("name");
        myRef.setValue(mNameField.getText().toString());
        myRef = database.getReference("age");
        myRef.setPriority(mAgeField.getText().toString());

        Intent intent =new Intent(this, CameraActivity.class);
        startActivity(intent);
    }
}
