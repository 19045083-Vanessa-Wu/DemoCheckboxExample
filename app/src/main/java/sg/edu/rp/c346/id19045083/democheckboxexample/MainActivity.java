package sg.edu.rp.c346.id19045083.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare variables & Link UI components
        CheckBox cbEnabled = findViewById(R.id.checkBoxDiscount);
        Button btnCheck = findViewById(R.id.buttonChecked);
        TextView tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                Log.i("MyActivity", "Inside onClick()");

                Toast.makeText(MainActivity.this,"Button Click", Toast.LENGTH_LONG).show();

                if (cbEnabled.isChecked()){
                    double pay = calcPay(100, 20);
                    tvShow.setText("The discount is given. You need to pay " + pay);
                } else {
                    double pay = calcPay(100, 0);
                    tvShow.setText("The discount is not given. You need to pay " + pay);
                }

            }
        });
    }

    private double calcPay(double price, double discount) {
        double pay = price * (1 - discount / 100);
        return pay;
    }
}