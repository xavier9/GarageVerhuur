package com.ehb.xavier.garageverhuur.GarageActions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.classes.Adres;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Garage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GarageAddActivity extends Activity implements View.OnClickListener{
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_add);
        Button b = (Button) findViewById(R.id.AddOpslag);
        b.setOnClickListener(this);
        db = new DatabaseHelper(this);
        Spinner spinner = (Spinner) findViewById(R.id.spinneradd);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.mogelijkheden, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner

        spinner.setAdapter(adapter);
    }
    EditText price,scale,start, end, straat,nr, bus,postcode,gemeente, land;
    ImageView im1, im2,im3,im4,im5,im6,im7,im8,im9,im10;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date date= null;
    Date date1 = null;
    @Override
    public void onClick(View v) {

        price = (EditText) findViewById(R.id.price);

        int p = 0;
        scale = (EditText) findViewById(R.id.scale);

        start = (EditText) findViewById(R.id.startdate);


        end = (EditText) findViewById(R.id.enddate);
        straat = (EditText) findViewById(R.id.Street);
        nr = (EditText) findViewById(R.id.Nr);
        int a = 0;
        bus = (EditText) findViewById(R.id.Bus);
        postcode = (EditText) findViewById(R.id.Postcode);
        gemeente = (EditText) findViewById(R.id.City);
        land = (EditText) findViewById(R.id.Country);
        Spinner spinner = (Spinner) findViewById(R.id.spinneradd);




        im1 = (ImageView) findViewById(R.id.imageView1);
        im1.setVisibility(View.INVISIBLE);
        im2 = (ImageView) findViewById(R.id.imageView2);
        im2.setVisibility(View.INVISIBLE);
        im3 = (ImageView) findViewById(R.id.imageView3);
        im3.setVisibility(View.INVISIBLE);
        im4 = (ImageView) findViewById(R.id.imageView4);
        im4.setVisibility(View.INVISIBLE);
        im5 = (ImageView) findViewById(R.id.imageView5);
        im5.setVisibility(View.INVISIBLE);
        im6 = (ImageView) findViewById(R.id.imageView6);
        im6.setVisibility(View.INVISIBLE);
        im7 = (ImageView) findViewById(R.id.imageView7);
        im7.setVisibility(View.INVISIBLE);
        im8 = (ImageView) findViewById(R.id.imageView8);
        im8.setVisibility(View.INVISIBLE);
        im9 = (ImageView) findViewById(R.id.imageView9);
        im9.setVisibility(View.INVISIBLE);
        im10 = (ImageView) findViewById(R.id.imageView10);
        im10.setVisibility(View.INVISIBLE);
        //spinner = (Spinner) findViewById(R.id.spinneradd);
       // Log.e("Boolean", String.valueOf(stringequeal(straat.getText().toString())));
        //db.deleteAdresAll();
        if(!stringequeal(price.getText().toString()) ||
                !stringequeal(start.getText().toString()) ||
                !stringequeal(end.getText().toString()) ||
                !stringequeal(nr.getText().toString()) ||
                !stringequeal(scale.getText().toString()) ||
                !stringequeal(straat.getText().toString()) ||
                !stringequeal(bus.getText().toString()) ||
                !stringequeal(postcode.getText().toString()) ||
                !stringequeal(gemeente.getText().toString()) ||
                !stringequeal(land.getText().toString())) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    if (!stringequeal(price.getText().toString())) {

                        im1.setVisibility(View.VISIBLE);
                    } else {

                        im1.setVisibility(View.INVISIBLE);
                    }
                    if (!stringequeal(scale.getText().toString())) {

                        im2.setVisibility(View.VISIBLE);
                    } else {

                        im2.setVisibility(View.INVISIBLE);
                    }
                    if (!stringequeal(start.getText().toString())) {

                        im3.setVisibility(View.VISIBLE);
                    } else {

                        im3.setVisibility(View.INVISIBLE);

                    }
                    if (!stringequeal(end.getText().toString())) {

                        im4.setVisibility(View.VISIBLE);
                    } else {

                        im4.setVisibility(View.INVISIBLE);

                    }
                    if (!stringequeal(straat.getText().toString())) {

                        im5.setVisibility(View.VISIBLE);
                    } else {

                        im5.setVisibility(View.INVISIBLE);
                    }
                    if (!stringequeal(nr.getText().toString())) {

                        im6.setVisibility(View.VISIBLE);
                    } else {

                        im6.setVisibility(View.INVISIBLE);
                    }

                    if (!stringequeal(postcode.getText().toString())) {

                        im8.setVisibility(View.VISIBLE);
                    } else {

                        im8.setVisibility(View.INVISIBLE);
                    }
                    if (!stringequeal(gemeente.getText().toString())) {

                        im9.setVisibility(View.VISIBLE);
                    } else {

                        im9.setVisibility(View.INVISIBLE);
                    }
                    if (!stringequeal(land.getText().toString())) {

                        im10.setVisibility(View.VISIBLE);
                    } else {

                        im10.setVisibility(View.INVISIBLE);
                    }
                }}).run();

        }else {
            p = Integer.parseInt(price.getText().toString());
            a = Integer.parseInt(nr.getText().toString());
            try {
                date1 = format.parse(end.getText().toString());
                System.out.println(date1);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                date = format.parse(start.getText().toString());
                System.out.println(date);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if(date != null && date1 != null) {
                Adres adres = new Adres(straat.getText().toString(), bus.getText().toString(), gemeente.getText().toString(), land.getText().toString(), postcode.getText().toString(), a);
                db.addAdresData(adres);
                Garage garage = new Garage(db.getAdresByID(adres.getID()), date1, String.valueOf(spinner.getSelectedItem()),
                        scale.getText().toString(), date, p);
                Log.e("Garage", garage.toString());
                db.addGarageData(garage);
                Intent intent = new Intent(getApplication(), GarageGetActivity.class);
                startActivity(intent);
            }else {
                im3.setVisibility(View.VISIBLE);
                im4.setVisibility(View.VISIBLE);
            }
        }




    }

    public boolean stringequeal(String string){

        if(!string.equals("") && !string.equals(" ") ){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_garage_add, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Tapping on top left ActionBar icon navigates "up" to hierarchical parent screen.
                // The parent is defined in the AndroidManifest entry for this activity via the
                // parentActivityName attribute (and via meta-data tag for OS versions before API
                // Level 16). See the "Tasks and Back Stack" guide for more information:
                // http://developer.android.com/guide/components/tasks-and-back-stack.html
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        // Otherwise, pass the item to the super implementation for handling, as described in the
        // documentation.
        return super.onOptionsItemSelected(item);
    }


}
