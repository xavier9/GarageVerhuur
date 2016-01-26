package com.ehb.xavier.garageverhuur.GarageActions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GarageEditActivity extends Activity implements View.OnClickListener{
    DatabaseHelper bdh;
    Garage garage  = new Garage();
    Adres adress = new Adres();
    Intent intent;
    int gid;
    ImageView im1, im2,im3,im4,im5,im6,im7,im8,im9,im10;
    EditText prijs,grote, start,end,straat,nr,bus,postcode,gemeente,land;
    Date date= null;
    Date date1 = null;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_edit);
bdh = new DatabaseHelper(this);
        intent = getIntent();
       //int g =  intent.getIntExtra("Garage", 0);
       // String g = intent.getStringExtra("Garage");
        Log.e("GarageID", intent.getIntExtra("Garage", 0) + "");


        garage = bdh.getGarageByID(intent.getIntExtra("Garage", 0));
        adress = bdh.getAdresByID(garage.getAdresID().getID());
        gid = intent.getIntExtra("Garage", 0);

        Log.e("Garage", garage.toString());

        Button edit = (Button) findViewById(R.id.EditOpslag);
        edit.setOnClickListener(this);

        prijs = (EditText) findViewById(R.id.price);
        prijs.setText(garage.getPrijs()+"");
        grote = (EditText) findViewById(R.id.scale);
        grote.setText(garage.getGroote());
        start = (EditText) findViewById(R.id.startdate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        start.setText(sdf.format(garage.getStartdate()));
        end = (EditText) findViewById(R.id.enddate);
        end.setText(sdf.format(garage.getEnddate().toString()));
        Adres adres = bdh.getAdresByID(garage.getAdresID().getID());
        straat = (EditText) findViewById(R.id.Street);
        straat.setText(adres.getStraat());
        nr = (EditText) findViewById(R.id.Nr);
        nr.setText(adres.getNr()+"");
        bus = (EditText) findViewById(R.id.Bus);
        bus.setText(adres.getBus());
        postcode = (EditText) findViewById(R.id.Postcode);
        postcode.setText(adres.getPostcode());
        gemeente = (EditText) findViewById(R.id.City);
        gemeente.setText(adres.getGemente());
        land = (EditText) findViewById(R.id.Country);
        land.setText(adres.getLand());
        Spinner sp1 = (Spinner) findViewById(R.id.spinneredit);

        android.widget.ArrayAdapter<CharSequence> adapter = android.widget.ArrayAdapter.createFromResource(this,
                R.array.mogelijkheden, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        List<String> mogelijk = Arrays.asList(getResources().getStringArray(R.array.mogelijkheden));
        sp1.setAdapter(adapter);
        sp1.setSelection(mogelijk.indexOf(garage.getMogelijkhijd()));
       // CheckBox verhuurd = (CheckBox) findViewById(R.id.verhuurd);
    }Adres adres = null;
    @Override
    public void onClick(View v) {
        prijs = (EditText) findViewById(R.id.price);

        grote = (EditText) findViewById(R.id.scale);
        start = (EditText) findViewById(R.id.startdate);

        end = (EditText) findViewById(R.id.enddate);
        straat = (EditText) findViewById(R.id.Street);
        nr = (EditText) findViewById(R.id.Nr);

        bus = (EditText) findViewById(R.id.Bus);
        postcode = (EditText) findViewById(R.id.Postcode);
        gemeente = (EditText) findViewById(R.id.City);
        land = (EditText) findViewById(R.id.Country);

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
                if(!stringequeal(prijs.getText().toString()) ||
                        !stringequeal(start.getText().toString()) ||
                        !stringequeal(end.getText().toString()) ||
                        !stringequeal(nr.getText().toString()) ||
                        !stringequeal(grote.getText().toString()) ||
                        !stringequeal(straat.getText().toString()) ||
                        !stringequeal(bus.getText().toString()) ||
                        !stringequeal(postcode.getText().toString()) ||
                        !stringequeal(gemeente.getText().toString()) ||
                        !stringequeal(land.getText().toString())) {

                    if(!stringequeal(prijs.getText().toString()) ){

                        im1.setVisibility(View.VISIBLE);
                    }else{

                        im1.setVisibility(View.INVISIBLE);
                    }
                    if(!stringequeal(grote.getText().toString())){

                        im2.setVisibility(View.VISIBLE);
                    }else{

                        im2.setVisibility(View.INVISIBLE);
                    }
                    if(!stringequeal(start.getText().toString())){

                        im3.setVisibility(View.VISIBLE);
                    }else{

                        im3.setVisibility(View.INVISIBLE);
                    }
                    if(!stringequeal(end.getText().toString())){

                        im4.setVisibility(View.VISIBLE);
                    }else{

                        im4.setVisibility(View.INVISIBLE);
                    }
                    if(!stringequeal(straat.getText().toString()) ){

                        im5.setVisibility(View.VISIBLE);
                    }else{

                        im5.setVisibility(View.INVISIBLE);
                    }
                    if(!stringequeal(nr.getText().toString())){

                        im6.setVisibility(View.VISIBLE);
                    }else{

                        im6.setVisibility(View.INVISIBLE);
                    }

                    if(!stringequeal(postcode.getText().toString())) {

                        im8.setVisibility(View.VISIBLE);
                    }else{

                        im8.setVisibility(View.INVISIBLE);
                    }
                    if(!stringequeal(gemeente.getText().toString())) {

                        im9.setVisibility(View.VISIBLE);
                    }else{

                        im9.setVisibility(View.INVISIBLE);
                    }
                    if(!stringequeal(land.getText().toString())) {

                        im10.setVisibility(View.VISIBLE);
                    }else{

                        im10.setVisibility(View.INVISIBLE);
                    }

                }else {
                    int p = Integer.parseInt(prijs.getText().toString());
                    int a = Integer.parseInt(nr.getText().toString());
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
                        //db.deleteAdresAll();
                        adres = new Adres(straat.getText().toString(), bus.getText().toString(), gemeente.getText().toString(), land.getText().toString(), postcode.getText().toString(), a, adress.getID());
                        bdh.updateAdresData(adres);


                        Garage garages = new Garage(bdh.getAdresByID(adres.getID()), date1, "",
                                grote.getText().toString(), date, p, garage.getID());


                        Log.e("Garage", garages.toString());
                        bdh.updateGarageData(garages);
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
        getMenuInflater().inflate(R.menu.menu_garage_edit, menu);
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
