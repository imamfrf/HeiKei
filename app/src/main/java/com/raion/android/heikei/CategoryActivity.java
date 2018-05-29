package com.raion.android.heikei;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {
    public static String category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Button bt_vege = (Button) findViewById(R.id.bt_vege);
        Button bt_anak = (Button) findViewById(R.id.bt_anak);
        Button bt_hamil = (Button) findViewById(R.id.bt_hamil);
        Button bt_diet = (Button) findViewById(R.id.bt_diet);
        //Button bt_sekali = (Button) findViewById(R.id.bt_sekali);
        TextView tv_vege = (TextView) findViewById(R.id.tv_vege);
        TextView tv_anak = (TextView) findViewById(R.id.tv_anak);
        TextView tv_hamil = (TextView) findViewById(R.id.tv_hamil);
        TextView tv_diet = (TextView) findViewById(R.id.tv_diet);
        ImageView img_vege = (ImageView) findViewById(R.id.img_vege);
        ImageView img_anak1 = (ImageView) findViewById(R.id.img_anak1);
        ImageView img_anak2 = (ImageView) findViewById(R.id.img_anak2);
        ImageView img_hamil = (ImageView) findViewById(R.id.img_hamil);
        ImageView img_diet = (ImageView) findViewById(R.id.img_diet);
        bt_vege.setOnClickListener(this);
        bt_anak.setOnClickListener(this);
        bt_hamil.setOnClickListener(this);
        bt_diet.setOnClickListener(this);
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void onClick(View view) {
        Button b = (Button)view;
//        ImageView i = (ImageView)view;
//        TextView t = (TextView)view;
        //setCategory(b.getText().toString());
        //Intent selectCate = new Intent(CategoryActivity.this, SelectCateActivity.class);
        //startActivity(selectCate);
    }
}
