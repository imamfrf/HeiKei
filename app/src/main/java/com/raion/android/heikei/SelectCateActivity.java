package com.raion.android.heikei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SelectCateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_cate);

        CategoryActivity ca = new CategoryActivity();
        String category = ca.getCategory();


        TextView tv_selectedCat = (TextView) findViewById(R.id.tv_selectedcat);
        Button bt_kA = (Button) findViewById(R.id.bt_kA);
        Button bt_kB = (Button) findViewById(R.id.bt_kB);
        Button bt_kC = (Button) findViewById(R.id.bt_kC);
        Button bt_kD = (Button) findViewById(R.id.bt_kD);

        tv_selectedCat.setText(category);


    }
}
