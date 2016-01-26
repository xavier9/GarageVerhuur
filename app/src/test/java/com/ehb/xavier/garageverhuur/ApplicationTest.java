package com.ehb.xavier.garageverhuur;


import android.content.Intent;
import android.widget.Button;

import com.ehb.xavier.garageverhuur.GarageActions.GarageGetActivity;
import com.ehb.xavier.garageverhuur.UserActions.UserAddActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;
import org.robolectric.shadows.ShadowIntent;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.robolectric.Shadows.shadowOf;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ApplicationTest {

    private UserAddActivity activity;

    private Button pressMeButton;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(UserAddActivity.class).create().get();
        pressMeButton = (Button) activity.findViewById(R.id.AddAdres);
    }

    @Test
    public void pressingTheButtonShouldStartTheListActivity() throws Exception {
        pressMeButton.performClick();

        ShadowActivity shadowActivity = shadowOf(activity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();
        ShadowIntent shadowIntent = shadowOf(startedIntent);
        assertThat(shadowIntent.getComponent().getClassName(), equalTo(GarageGetActivity.class.getName()));
    }



}