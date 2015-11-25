package com.example.ghada.x_ogame;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;
import android.graphics.Color;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
   String v1,v2,text;
    TextView t;


   private int f=0,i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        v1=b1.getText().toString();



    }
    public void onButtonClick1(View v)
    {
        b1=(Button)findViewById(R.id.b1);
        if(b1.getText().toString()== v1)
        {
            if(f==0)
            {

                b1.setText("X");
                b1.setTextColor(Color.RED);
                f=1;
            }
            else
            {

                b1.setText("O");
                b1.setTextColor(Color.BLUE);

                f=0;
            }

        }




        check1();


    }
    public void onButtonClick2(View v)
    {
        b2=(Button)findViewById(R.id.b2);
        if(b2.getText().toString()==v1)
        {
            if(f==0) {
                b2.setText("X");
                b2.setTextColor(Color.RED);
                f=1;
            }
            else
            {

                b2.setText("O");
                b2.setTextColor(Color.BLUE);
                f=0;

            }

        }

     check2();


    }

    public void onButtonClick3(View v)
    {
        b3=(Button)findViewById(R.id.b3);
        if(b3.getText().toString()==v1)
        {
            if(f==0) {
                b3.setText("X");
                b3.setTextColor(Color.RED);
                f=1;
            }
            else
            {

                b3.setText("O");
                b3.setTextColor(Color.BLUE);
                f=0;

            }

        }

      check3();


    }
    public void onButtonClick4(View v)
    {
        b4=(Button)findViewById(R.id.b4);
        if(b4.getText().toString()==v1)
        {
            if(f==0) {
                b4.setText("X");
                b4.setTextColor(Color.RED);
                f=1;
            }
            else
            {

                b4.setText("O");
                b4.setTextColor(Color.BLUE);
                f=0;

            }

        }

      check4();

    }

    public void onButtonClick5(View v) {
        b5 = (Button) findViewById(R.id.b5);
        if (b5.getText().toString() == v1) {
            if (f == 0) {
                b5.setText("X");
                b5.setTextColor(Color.RED);
                f = 1;
            } else {

                b5.setText("O");
                b5.setTextColor(Color.BLUE);
                f = 0;

            }

        }


      check5();


    }

    public void onButtonClick6(View v)
    {
        b6=(Button)findViewById(R.id.b6);
        if(b6.getText().toString()==v1)
        {
            if(f==0) {
                b6.setText("X");
                b6.setTextColor(Color.RED);
                f=1;
            }
            else
            {

                b6.setText("O");
                b6.setTextColor(Color.BLUE);
                f=0;

            }

        }

     check6();
    }
    public void onButtonClick7(View v)
    {
        b7=(Button)findViewById(R.id.b7);
        if(b7.getText().toString()==v1)
        {
            if(f==0) {
                b7.setText("X");
                b7.setTextColor(Color.RED);
                f=1;
            }
            else
            {

                b7.setText("O");
                b7.setTextColor(Color.BLUE);
                f=0;

            }

        }

        check7();




    }
    public void onButtonClick8(View v)
    {
        b8=(Button)findViewById(R.id.b8);
        if(b8.getText().toString()==v1)
        {
            if(f==0) {
                b8.setText("X");
                b8.setTextColor(Color.RED);
                f=1;
            }
            else
            {

                b8.setText("O");
                b8.setTextColor(Color.BLUE);
                f=0;

            }

        }

   check8();

    }
    public void onButtonClick9(View v) {
        b9 = (Button) findViewById(R.id.b9);
        if (b9.getText().toString() == v1) {
            if (f == 0) {
                b9.setText("X");
                b9.setTextColor(Color.RED);
                f = 1;
            } else {

                b9.setText("O");
                b9.setTextColor(Color.BLUE);
                f = 0;

            }

        }

        check9();


    }

public void check1()
{

    if (b1.getText() == b2.getText() && b1.getText() == b3.getText()) {

        text="Player " +b1.getText().toString() +" Won";
        Context context=getApplicationContext();
        int duration= Toast.LENGTH_SHORT;
        Toast toast=Toast.makeText(context,text,duration);
        toast.show();





    }
    if (b1.getText() == b4.getText() && b1.getText() == b7.getText()) {

        text="Player " +b1.getText().toString() +" Won";
        Context context=getApplicationContext();
        int duration= Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(context,text,duration);
        toast.show();


    }

    if (b1.getText() == b5.getText() && b1.getText() == b9.getText()) {

        text="Player " +b1.getText().toString() +" Won";
        Context context=getApplicationContext();
        int duration= Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(context, text, duration);
        toast.show();

    }
}
 public  void check2()
 {
     if (b2.getText() == b5.getText() && b2.getText() == b8.getText()) {

         text="Player " + b2.getText().toString() +" Won";
         Context context=getApplicationContext();
         int duration= Toast.LENGTH_LONG;
         Toast toast=Toast.makeText(context,text,duration);
         toast.show();
     }
         if (b1.getText() == b2.getText() && b1.getText() == b3.getText()) {

             text="Player " + b2.getText().toString() +" Won";
             Context context=getApplicationContext();
             int duration= Toast.LENGTH_LONG;
             Toast toast=Toast.makeText(context,text,duration);
             toast.show();
         }



 }
    public void check3()
    {
        if (b1.getText() == b2.getText() && b1.getText() == b3.getText()) {

            text="Player " + b3.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();
        }
        if (b3.getText() == b6.getText() && b3.getText() == b9.getText()) {

            text="Player " + b3.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }
        if (b3.getText() == b5.getText() && b3.getText() == b7.getText()) {

            text="Player " + b3.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }
    }
    public void check4()
    {
        if (b4.getText() == b5.getText() && b4.getText() == b6.getText()) {

            text="Player " + b4.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }
        if (b1.getText() == b4.getText() && b1.getText() == b7.getText()) {

            text="Player " + b4.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }
    }
    public void check5()
    {

        if (b4.getText() == b5.getText() && b4.getText() == b6.getText()) {

            text="Player " + b5.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();

        }
        if (b2.getText() == b5.getText() && b2.getText() == b8.getText()) {

            text="Player " + b5.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();
        }




}
    public void check6() {



        if (b6.getText() == b4.getText() && b6.getText() == b5.getText()) {

            text="Player " + b6.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }


    }
        public void check7()
    {
        if (b7.getText() == b8.getText() && b7.getText() == b9.getText()) {

            text="Player " + b7.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();
        }
        if (b1.getText() == b4.getText() && b1.getText() == b7.getText()) {

            text="Player " + b7.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }
        if (b7.getText() == b5.getText() && b7.getText() == b3.getText()) {

            text="Player " + b7.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }

    }
    public void check8()
    {
        if (b7.getText() == b8.getText() && b7.getText() == b9.getText()) {

            text="Player " + b8.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();

        }
        if (b2.getText() == b5.getText() && b2.getText() == b8.getText()) {

            text="Player " + b8.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();
        }
    }
    public void check9()
    {
        if (b7.getText() == b8.getText() && b7.getText() == b9.getText()) {

            text="Player " + b9.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();

        }
        if (b3.getText() == b6.getText() && b3.getText() == b9.getText()) {

            text="Player " + b9.getText().toString() +" Won";
            Context context=getApplicationContext();
            int duration= Toast.LENGTH_LONG;
            Toast toast=Toast.makeText(context,text,duration);
            toast.show();


        }
    }


    }

