package com.example.metanit21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final static String TAG="MainActivity";
    private final static String ACTION="SHOW_SECOND_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
    }
    public void onClick(View view){

        final EditText nameText=findViewById(R.id.name);
        final EditText companyText=findViewById(R.id.company);
        final EditText priceText=findViewById(R.id.price);

        String name=nameText.getText().toString();
        String company=companyText.getText().toString();
        Integer price=Integer.parseInt(priceText.getText().toString());

        Product product=new Product(name,company,price);
        Intent intent=new Intent(this, SecondActivity.class);
        //Intent intent=new Intent(ACTION);

        intent.putExtra(Product.class.getSimpleName(),product);
        //intent.putExtra("name",name);
        //intent.putExtra("company",company);
        //intent.putExtra("price", price);
        startActivity(intent);
    }
}
