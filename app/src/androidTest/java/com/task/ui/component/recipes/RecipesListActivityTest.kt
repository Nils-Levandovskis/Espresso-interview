package com.task.ui.component.recipes

import android.view.KeyEvent
import android.widget.AutoCompleteTextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.IdlingResource
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.task.DataStatus
import com.task.R
import com.task.TestUtil.dataStatus
import com.task.TestUtil.recipes
import com.task.utils.EspressoIdlingResource
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.hamcrest.CoreMatchers
import org.hamcrest.Matchers.not
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.lang.Thread.sleep

@HiltAndroidTest
class RecipesListActivityTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var mActivityTestRule = ActivityTestRule(RecipesListActivity::class.java, false, false)
    private var mIdlingResource: IdlingResource? = null

    @Before
    fun setup() {
        //Setup EspressoIdlingResource
    }

    @Test
    fun displayRecipesList() {
        //Use TestUtil dataStatus to mock recipe list data
        //Check that received recipe list was received successfully
        //Check loading indicator is not displayed
    }

    @Test
    fun testRefresh() {
        //Use TestUtil dataStatus to mock recipe list data
        //Check that received recipe list was received successfully
        //Check loading indicator is not displayed
        //Refresh
        //Check everything again after refresh
    }

    @Test
    fun noData() {
        //Use TestUtil dataStatus to mock recipe list data
        //Check that received recipe list was NOT received successfully
        //Check loading indicator is not displayed
        //Check that we are notified about not receiving data
    }


    @Test
    fun testSearch() {
        //Use TestUtil dataStatus to mock recipe list data
        //Check that received recipe list was received successfully
        //Check loading indicator is not displayed
        //Search the name of the first recipe in TestUtils' recipes.recipesList via search bar
        //Check that we received recipe details (name, description)
    }

    @Test
    fun testScroll() {
        //Use TestUtil dataStatus to mock recipe list data
        //Check that received recipe list was received successfully
        //Check loading indicator is not displayed
        //Click on the 7th item in the recipe list
        //Check that we are notified about not receiving data
        //Check that we received recipe details (name, description)
    }

    @After
    fun shutDown() {
        //Finish work with EspressoIdlingResource
    }
}
