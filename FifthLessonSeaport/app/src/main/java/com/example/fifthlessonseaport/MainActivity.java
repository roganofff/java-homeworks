package com.example.fifthlessonseaport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.fifthlessonseaport.entity.Income;
import com.example.fifthlessonseaport.entity.IncomeRent;
import com.example.fifthlessonseaport.entity.IncomeService;

public class MainActivity extends AppCompatActivity {

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);

        Income rent = new IncomeRent(1, "Аренда площадей порта", 170000);
        Income service = new IncomeService(2, "Обслуживание морских судов", 125, 3500);

        float total = rent.monthlyIncome() + service.monthlyIncome();

        output.setText("Заработок от морского порта за 1 месяц составляет: " + total + " монет.");

    }
}