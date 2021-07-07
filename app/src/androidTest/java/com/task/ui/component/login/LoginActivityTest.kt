package com.task.ui.component.login

import android.widget.Toast
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.ComponentNameMatchers.hasClassName
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import androidx.test.espresso.matcher.ViewMatchers.*
import com.task.R
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.lang.Thread.sleep


/**
 * Created by AhmedEltaher
 */
@HiltAndroidTest
class LoginActivityTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var mActivityTestRule = IntentsTestRule(LoginActivity::class.java, true, false)

    @Before
    fun setup() {
        mActivityTestRule.launchActivity(null)
    }

    @Test
    fun testLoginSuccess() {
        //Log in with username (ahmed@ahmed.ahmed), password (ahmed)
        //Check that we have the correct activity
    }

    @Test
    fun testWrongUserName() {
        //Try logging in with empty username
        //Check that we receive the Toast error message
    }

    @Test
    fun testWrongPassword() {
        //Try logging in with empty password
        //Check that we receive the Toast error message
    }

    @After
    fun shutDown() {
    }
}
