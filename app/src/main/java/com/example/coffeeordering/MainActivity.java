package com.example.coffeeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cream, chocolate;
    TextView quantity;
    Button increase , decrease, order;
    TextView et_cream , et_chocola, et_quantity, et_price;
    Integer quan;
    Double price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cream = findViewById(R.id.checkbox_cream);
        chocolate = findViewById(R.id.checkbox_chocolate);

        quantity = findViewById(R.id.quantity_id);

        increase = findViewById(R.id.increase_id);
        decrease = findViewById(R.id.decrease_id);
        order = findViewById(R.id.order_id);

        et_cream = findViewById(R.id.et_cream_id);
        et_chocola = findViewById(R.id.et_chocolate_id);
        et_quantity = findViewById(R.id.et_quantity_id);
        et_price = findViewById(R.id.et_price_id);


        quan =Integer.parseInt(quantity.getText().toString());

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quan ++;
                quantity.setText(quan.toString());
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quan --;
                quantity.setText(quan.toString());
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et_quantity.setText(quan.toString());

                quan = quan * 4;
                price =Double.parseDouble( quan.toString()) ;

                if(cream.isChecked()){
                    et_cream.setText("yes");
                    price = price + .5;
                }else {
                    et_cream.setText("no");
                }

                if(chocolate.isChecked()){
                    et_cream.setText("yes");
                    price = price + 1;
                }else {
                    et_cream.setText("no");
                }

                et_price.setText(price.toString());

            }
        });



    }
}
