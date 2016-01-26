package com.ehb.xavier.garageverhuur.UserActions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.ehb.xavier.garageverhuur.GarageActions.GarageGetActivity;
import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.classes.Adres;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Garage;
import com.ehb.xavier.garageverhuur.classes.Persoon;
import com.ehb.xavier.garageverhuur.classes.Verhuurd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserAddActivity extends Activity {
    DatabaseHelper cda;
    Adres adres = new Adres();
    ImageView im1, im2,im3,im4,im5,im6,im7,im8,im9,im10, im11,im12,im13;
    EditText straat,nr, bus,postcode,gemeente, land, naam, anaam, email,nationalitijd, rnr,geslacht,gdate;
    Date date= null;

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        im11 = (ImageView) findViewById(R.id.imageView11);
        im11.setVisibility(View.INVISIBLE);
        im12 = (ImageView) findViewById(R.id.imageView12);
        im12.setVisibility(View.INVISIBLE);
        im13 = (ImageView) findViewById(R.id.imageView13);
        im13.setVisibility(View.INVISIBLE);

        cda = new DatabaseHelper(this);

        Button addadres = (Button) findViewById(R.id.AddAdres);
        addadres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                naam = (EditText) findViewById(R.id.Name);
                anaam = (EditText) findViewById(R.id.Lastname);
                email = (EditText) findViewById(R.id.Email);
                nationalitijd = (EditText) findViewById(R.id.Nationaliteit);
                geslacht = (EditText) findViewById(R.id.geslacht);
                rnr = (EditText) findViewById(R.id.rnr);
                gdate = (EditText) findViewById(R.id.geboortedatum);
                                 straat = (EditText) findViewById(R.id.Street);
                        nr = (EditText) findViewById(R.id.Nr);
                        int a = 0;

                        bus = (EditText) findViewById(R.id.Bus);
                         postcode = (EditText) findViewById(R.id.Postcode);
                        gemeente = (EditText) findViewById(R.id.City);
                        land = (EditText) findViewById(R.id.Country);
                if( !stringequeal(naam.getText().toString())||
                        !stringequeal(anaam.getText().toString())||
                        !stringequeal(email.getText().toString()) ||
                        !stringequeal(rnr.getText().toString())||
                        !stringequeal(nationalitijd.getText().toString())||
                        !stringequeal(geslacht.getText().toString())||
                        !stringequeal(gdate.getText().toString())||
                        !stringequeal(nr.getText().toString()) ||
                        !stringequeal(straat.getText().toString()) ||
                        !stringequeal(bus.getText().toString()) ||
                        !stringequeal(postcode.getText().toString()) ||
                        !stringequeal(gemeente.getText().toString()) ||
                        !stringequeal(land.getText().toString())) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            if (!stringequeal(naam.getText().toString())) {

                                im1.setVisibility(View.VISIBLE);
                            } else {

                                im1.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(anaam.getText().toString())) {

                                im2.setVisibility(View.VISIBLE);
                            } else {

                                im2.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(email.getText().toString())) {

                                im3.setVisibility(View.VISIBLE);
                            } else {

                                im3.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(rnr.getText().toString())) {

                                im4.setVisibility(View.VISIBLE);
                            } else {

                                im4.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(nationalitijd.getText().toString())) {

                                im5.setVisibility(View.VISIBLE);
                            } else {

                                im5.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(geslacht.getText().toString())) {

                                im6.setVisibility(View.VISIBLE);
                            } else {

                                im6.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(gdate.getText().toString())) {

                                im7.setVisibility(View.VISIBLE);
                            } else {

                                im7.setVisibility(View.INVISIBLE);

                            }
                            if (!stringequeal(straat.getText().toString())) {

                                im8.setVisibility(View.VISIBLE);
                            } else {

                                im8.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(nr.getText().toString())) {

                                im9.setVisibility(View.VISIBLE);
                            } else {

                                im9.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(bus.getText().toString())) {

                                im10.setVisibility(View.VISIBLE);
                            } else {

                                im10.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(postcode.getText().toString())) {

                                im11.setVisibility(View.VISIBLE);
                            } else {

                                im11.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(gemeente.getText().toString())) {

                                im12.setVisibility(View.VISIBLE);
                            } else {

                                im12.setVisibility(View.INVISIBLE);
                            }
                            if (!stringequeal(land.getText().toString())) {

                                im13.setVisibility(View.VISIBLE);
                            } else {

                                im13.setVisibility(View.INVISIBLE);
                            }
                        }
                    }).run();
                }else {
                    a = Integer.parseInt(nr.getText().toString());
                    try {
                        date = format.parse(gdate.getText().toString());
                        System.out.println(date);
                    } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (date != null){
                        adres = new Adres(straat.getText().toString(), bus.getText().toString(), gemeente.getText().toString(), land.getText().toString(), postcode.getText().toString(), a);
                    cda.addAdresData(adres);

                    Log.e("Adres", adres.toString());
                    Persoon p = new Persoon(cda.getAdresByID(adres.getID()), anaam.getText().toString(), email.getText().toString(), date, geslacht.getText().toString(), naam.getText().toString(), nationalitijd.getText().toString(), rnr.getText().toString());
                    cda.addPersoonData(p);
                    Log.e("Persoon:", p.toString());
                    Intent intent = getIntent();
                    Garage garage = cda.getGarageByID(intent.getIntExtra("Verhuur", 0));
                    cda.addVerhuurdData(new Verhuurd(garage, p));

                    //Intent intents = new Intent(MainActivity.this, GetAdresActivity.class);
                    startActivity(new Intent(UserAddActivity.this, GarageGetActivity.class));
                }else {
                        im7.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
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
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
