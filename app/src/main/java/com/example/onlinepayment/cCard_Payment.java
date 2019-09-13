package com.example.onlinepayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

public class cCard_Payment extends AppCompatActivity {

    private CardForm cardForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cactivity_card__payment);

        cardForm = (CardForm) findViewById(R.id.cardform);
        TextView textView = (TextView) findViewById(R.id.payment_amount);
        Button button = (Button) findViewById(R.id.btn_pay);


        textView.setText("$1999");
        button.setText(String.format("Pay %s",textView.getText()));

        cardForm.setPayBtnClickListner (new OnPayBtnClickListner() {

            public void onClick(Card card) {
                Toast.makeText(cCard_Payment.this, "Payment Successful", Toast.LENGTH_SHORT).show();
                openUserProf();
            }


        });
    }

    public void openUserProf(){
        Intent intent = new Intent(this, cUserProf.class);
        startActivity(intent);
    }
}
