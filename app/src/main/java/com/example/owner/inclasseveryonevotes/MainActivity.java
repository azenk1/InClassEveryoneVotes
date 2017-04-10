package com.example.owner.inclasseveryonevotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText editTextVote;
    EditText editTextAllVotes;
    Button buttonVote;
    DatabaseReference myDbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up widget links to layout
        editTextVote = (EditText) findViewById(R.id.editTextVote);
        editTextAllVotes = (EditText) findViewById(R.id.editTextAllVotes);
        buttonVote = (Button) findViewById(R.id.buttonSaveVote);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myDbRef = database.getReference("Everyone Votes");

    }
}
