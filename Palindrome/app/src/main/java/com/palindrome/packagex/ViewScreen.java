package com.palindrome.packagex;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.*;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ViewScreen extends Activity implements View.OnClickListener {
    //creating UI
    EditText plndEdittext;
    Button Vbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_screen);
        plndEdittext = (EditText)findViewById(R.id.editText1);
        Vbtn = (Button)findViewById(R.id.Validatebtn);
        Vbtn.setOnClickListener(this);

    }
    //onclick event for button and Validating input
    public void onClick(View v)
    {
        String palindromeW = plndEdittext.getText().toString();
        Palindrome palindrome = new Palindrome();
       if (!palindromeW.equals("") )
       {
           if (palindromeW != null)
           {
               boolean y = palindrome.compareWord(palindromeW);

               if (y == true)
               {
                   Toast.makeText(ViewScreen.this,"your word is a palindrome: "+palindromeW,Toast.LENGTH_SHORT).show();

               }
               else
               {
                   Toast.makeText(ViewScreen.this,"your word is not a palindrome: "+ palindromeW,Toast.LENGTH_SHORT).show();
               }
           }
           else
           {
               Toast.makeText(ViewScreen.this,"palindrome  cannot be null",Toast.LENGTH_SHORT).show();
           }
       }
       else
       {
           Toast.makeText(ViewScreen.this,"palindrome  cannot be empty",Toast.LENGTH_SHORT).show();
       }


    }



    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
