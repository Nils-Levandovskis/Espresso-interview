package com.task.ui.component.details

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.IdlingResource
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.task.R
import com.task.RECIPE_ITEM_KEY
import com.task.TestUtil.initData
import com.task.TestUtil.recipes
import com.task.utils.EspressoIdlingResource
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Created by AhmedEltaher
 */

@HiltAndroidTest
class DetailsActivityTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var mActivityTestRule = ActivityTestRule(DetailsActivity::class.java, true, false)
    private var mIdlingResource: IdlingResource? = null


    @Before
    fun setup() {
        //Setup TestUtil
        //Pass the 1st TestUtil recipes.recipesList item to the activity via Intent
        //Setup EspressoIdlingResource
    }

    @Test
    fun testRecipeDetails() {
        //Against the 1st TestUtil recipes.recipesList item:
        //Assert Recipe Title
        //Assert Recipe Description
    }

    @After
    fun shutDown() {
        //Finish work with EspressoIdlingResource
    }
}
