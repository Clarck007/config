package com.im.clarck.im;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();

    }


    private void test() {
        BigInteger bigInteger = new BigInteger("123123123123434435465465676576867865745634564");
        BigInteger bigInteger1 = new BigInteger("1");
        BigInteger add = bigInteger.add(bigInteger1);
        Toast.makeText(getApplicationContext(),add.toString(),Toast.LENGTH_LONG);

    }
}
