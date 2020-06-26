package com.example.metanit21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16,16,16,16);
        textView.setText("Планшет стоит 180$");

        Bundle arguments=getIntent().getExtras();
        final Product product;
        if (arguments!=null){

            product=(Product)arguments.getSerializable(Product.class.getSimpleName());
            //String name=arguments.get("name").toString();
            //String company=arguments.getString("company");
            //int price=arguments.getInt("price");


            textView.setText("Name: "+product.getName()+"\nCompany: "+product.getCompany()+"\nPrice: " + product.getPrice());
        }
        setContentView(textView);
    }
}
