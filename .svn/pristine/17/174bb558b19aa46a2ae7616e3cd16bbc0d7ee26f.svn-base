package com.ehb.xavier.garageverhuur.GarageActions;

import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SearchView;

import com.ehb.xavier.garageverhuur.BuildConfig;
import com.ehb.xavier.garageverhuur.R;
import com.ehb.xavier.garageverhuur.UserActions.UserAddActivity;
import com.ehb.xavier.garageverhuur.UserActions.UserGetActivity;
import com.ehb.xavier.garageverhuur.Utils;
import com.ehb.xavier.garageverhuur.classes.DatabaseHelper;
import com.ehb.xavier.garageverhuur.classes.Garage;


public class GarageGetActivity extends FragmentActivity implements CompoundButton.OnCheckedChangeListener, Communicator{
    private GarageDetailFragment mContactDetailFragment;
    // If true, this is a larger screen device which fits two panes

    DatabaseHelper cdb;
    Garage con;
    private boolean isSearchResultView = false;
    private boolean isTwoPaneLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isTwoPaneLayout = getResources().getBoolean(R.bool.dual_pane);
        if (BuildConfig.DEBUG) {
            Utils.enableStrictMode();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        // Check if two pane bool is set based on resource directories

        ((RadioButton) findViewById(R.id.radio_button0))
                .setOnCheckedChangeListener(this);
        if (isTwoPaneLayout) {
            ((RadioButton) findViewById(R.id.radio_button1))
                    .setOnCheckedChangeListener(this);
            ((RadioButton) findViewById(R.id.radio_button2))
                    .setOnCheckedChangeListener(this);
            ((RadioButton) findViewById(R.id.radio_button3))
                    .setOnCheckedChangeListener(this);
        }


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
                    if(con != null){
                        Log.e("Con", con.toString());
                        intent = new Intent(getApplication(), GarageEditActivity.class);
                        intent.putExtra("Garage", con.getID());
                        startActivity(intent);
                    }else{

                    }

                    break;
                case R.id.radio_button2:

                    buttonView.setChecked(true);
                    cdb = new DatabaseHelper(this);
                   // Garagecommunicator gcom = (Garagecommunicator) this;
                    if(con != null) {
                        AlertDialog a = new AlertDialog.Builder(this)
                                        .setTitle("Garage")
                                        .setMessage("Verwijderen ? ")

                                        .setPositiveButton("Ja", new DialogInterface.OnClickListener() {
                                                    public void onClick(DialogInterface dialog, int which) {

                                                        //Log.e("con", con.toString());
                                                        if (con != null) {
                                                            cdb.deleteGaragebyid(con.getID());
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

                    }else{

                    }

                    break;
                //Extra's
                case R.id.radio_button3:
                    buttonView.setChecked(true);
                    cdb = new DatabaseHelper(this);
                    if (con != null) {
                        ///cdb.deleteGaragebyid(con.getID());

                        Log.e("contact", con.toString() + " " + con.getID());

                            if (cdb.getVerhuurdByGarageID(con.getID()) != null && cdb.getVerhuurdByGarageID(con.getID()).size() != 0) {
                                Intent intent11 = new Intent(this, UserGetActivity.class);
                                intent11.putExtra("Verhuur", con.getID());
                                startActivity(intent11);
                            } else {
                                Intent intent11 = new Intent(this, UserAddActivity.class);
                                intent11.putExtra("Verhuur", con.getID());
                                startActivity(intent11);
                            }

                    }else{

                    }
                    break;
               /* case R.id.radio_button4:
                    buttonView.setChecked(true);
                    Toast.makeText(this, R.string.action_settings, Toast.LENGTH_SHORT)
                            .show();
                    break;*/

            }
        }

    }
    @Override
    public boolean onSearchRequested() {
        // Don't allow another search if this activity instance is already showing
        // search results. Only used pre-HC.
        return !isSearchResultView && super.onSearchRequested();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the options menu from XML
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_garage, menu);

        // Get the SearchView and set the searchable configuration
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        // Assumes current activity is the searchable activity
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false); // Do not iconify the widget; expand it by default

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


    @Override
    public void respond(Garage g) {
        FragmentManager manager = getSupportFragmentManager();
        GarageDetailFragment gdetail = (GarageDetailFragment) manager.findFragmentById(R.id.garagefragment);
        con = g;
        gdetail.chanceData(g);
    }
}
