package com.ehb.xavier.garageverhuur.GarageActions;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.ehb.xavier.garageverhuur.BuildConfig;
import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.UserActions.UserAddActivity;
import com.ehb.xavier.garageverhuur.Utils;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Garage;

public class GarageDetailActivity extends FragmentActivity implements CompoundButton.OnCheckedChangeListener{
    private boolean mIsTwoPaneLayout;
    DatabaseHelper db;
    Garage con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_garage_detail);
        if (BuildConfig.DEBUG) {
            // Enable strict mode checks when in debug modes
            Utils.enableStrictMode();
        }
        super.onCreate(savedInstanceState);
        db = new DatabaseHelper(this);
        Intent intent = getIntent();
        //int g =  intent.getIntExtra("Garage", 0);
        // String g = intent.getStringExtra("Garage");
        Log.e("GarageID", intent.getIntExtra("detailid", 0) + "");

        // This activity expects to receive an intent that contains the uri of a contact
        setContentView(R.layout.activety_detail);

        GarageDetailFragment detail = (GarageDetailFragment) getSupportFragmentManager().findFragmentById(R.id.garagefragment);

        if(detail != null) {
            con = db.getGarageByID(intent.getIntExtra("detailid", 0));
            detail.chanceData(db.getGarageByID(intent.getIntExtra("detailid", 0)));
        }
        ((RadioButton) findViewById(R.id.radio_button0))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button1))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button2))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button3))
                .setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Intent intent;
        buttonView.setChecked(true);
        if (isChecked) {
            switch (buttonView.getId()) {
                case R.id.radio_button0:
                    buttonView.setChecked(true);
                    intent = new Intent(getApplication(), GarageAddActivity.class);
                    startActivity(intent);

                    break;
                case R.id.radio_button1:
                    buttonView.setChecked(true);
//                    ContactEditFragment fragment = (ContactEditFragment) getFragmentManager().findFragmentById(R.id.contact_edit);
                    //con = GarageDetailActivityFragment.getContact();
                    if (con != null) {
                        Log.e("Con", con.toString());
                        intent = new Intent(getApplication(), GarageEditActivity.class);
                        intent.putExtra("Garage", con.getID());
                        startActivity(intent);
                    }

                    break;
                case R.id.radio_button2:
                    buttonView.setChecked(true);
                    db = new DatabaseHelper(this);
                    // Garagecommunicator gcom = (Garagecommunicator) this;
                    AlertDialog a = new AlertDialog.Builder(this)
                            .setTitle("Garage")
                            .setMessage("Verwijderen ? ")

                            .setPositiveButton("Ja", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {

                                            //Log.e("con", con.toString());
                                            if (con != null) {
                                                db.deleteGaragebyid(con.getID());
                                                Log.e("contact", con.toString());
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
                //Extra's
                case R.id.radio_button3:
                    buttonView.setChecked(true);
                    if (con != null) {
                        //db.deleteGaragebyid(con.getID());
                        Log.e("contact", con.toString());
                        Intent intent11 = new Intent(getApplication(), UserAddActivity.class);
                        startActivity(intent11);
                    }
                    break;
                /*case R.id.radio_button4:
                    buttonView.setChecked(true);
                    Toast.makeText(this, R.string.action_settings, Toast.LENGTH_SHORT)
                            .show();
                    break;*/

            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_garage_detail, menu);
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
