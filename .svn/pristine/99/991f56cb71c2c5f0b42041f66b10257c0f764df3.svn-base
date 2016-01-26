package com.ehb.xavier.garageverhuur.UserActions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.ehb.xavier.garageverhuur.GarageActions.GarageGetActivity;
import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.classes.Adres;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Persoon;
import com.ehb.xavier.garageverhuur.classes.Verhuurd;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class UserGetActivity extends Activity implements CompoundButton.OnCheckedChangeListener{
    DatabaseHelper cdb;
    Verhuurd v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_get);
        Intent inten = getIntent();
        int g = inten.getIntExtra("Verhuur", 0);
        Log.e("Verhuur", g+ "");
        cdb = new DatabaseHelper(this);
        //Log.e("Adressen : ", cdb.getAdresData().size()+"");
        ArrayList<Verhuurd> Verhuur = cdb.getVerhuurdByGarageID(g);
        for (Verhuurd v : Verhuur){
            Log.e("Verhuurd", v.toString());
        }
        v = null;
        for(int i  = 0; i < Verhuur.size();i++) {
             v = Verhuur.get(i);
        }
        Persoon p = cdb.getPersoonByID(v.getHuurder().getID());
        Log.e("Persoon", p.toString());
        TextView naam = (TextView) findViewById(R.id.Name);
        naam.setText(p.getVoornaam());
        TextView anaam = (TextView) findViewById(R.id.Lastname);
        anaam.setText(p.getNaam());
        TextView email = (TextView) findViewById(R.id.Email);
        email.setText(p.getEmail());
        TextView nationalitijd = (TextView) findViewById(R.id.Nationaliteit);
        nationalitijd.setText(p.getNationaliteit());
        TextView geslacht = (TextView) findViewById(R.id.geslacht);
        geslacht.setText(p.getGeslacht());
        TextView rnr = (TextView) findViewById(R.id.rnr);
        rnr.setText(p.getRijksregisternr());
        TextView gdate = (TextView) findViewById(R.id.geboortedatum);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        gdate.setText(sdf.format(p.getGeboortedatum()));
        Adres a = cdb.getAdresByID(p.getAdresID().getID());
        TextView straat = (TextView) findViewById(R.id.Street);
        straat.setText(a.getStraat());
        TextView nr = (TextView) findViewById(R.id.Nr);
        nr.setText(a.getNr()+"");
        TextView bus = (TextView) findViewById(R.id.Bus);
        bus.setText(a.getBus());
        TextView postcode = (TextView) findViewById(R.id.Postcode);
        postcode.setText(a.getPostcode());
        TextView gemeente = (TextView) findViewById(R.id.City);
        gemeente.setText(a.getGemente());
        TextView land = (TextView) findViewById(R.id.Country);
        land.setText(a.getLand());

        ((RadioButton) findViewById(R.id.radio_button1))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button2))
                .setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Intent intent;
        buttonView.setChecked(true);
        if (isChecked) {
            switch (buttonView.getId()) {

                case R.id.radio_button1:
                    buttonView.setChecked(true);
//                    ContactEditFragment fragment = (ContactEditFragment) getFragmentManager().findFragmentById(R.id.contact_edit);
                    //con = GarageDetailActivityFragment.getContact();
                    if(v != null){
                        Log.e("Con", v.toString());
                        intent = new Intent(getApplication(), UserEditActivity.class);
                        intent.putExtra("Verhuurd", v.getID());
                        startActivity(intent);
                    }

                    break;
                case R.id.radio_button2:
                    buttonView.setChecked(true);
                    cdb = new DatabaseHelper(this);
                    // Garagecommunicator gcom = (Garagecommunicator) this;
                    AlertDialog a = new AlertDialog.Builder(this)
                            .setTitle("Verhuurd")
                            .setMessage("Verwijderen ? ")

                            .setPositiveButton("Ja", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {

                                            //Log.e("con", con.toString());
                                            if (v != null) {
                                                cdb.deleteVerhuurdbyid(v.getID());
                                                Log.e("contact", v.toString());
                                                Intent intent11 = new Intent(getApplication(), GarageGetActivity.class);
                                                startActivity(intent11);
                                            } else {
                                                Log.e("con", "test");
                                            }
                                        }

                                    }
                            ).setNegativeButton("Neen", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })

                            .setIcon(android.R.drawable.ic_dialog_info)

                            .create();

                    a.show();

                    break;


            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_get, menu);
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
