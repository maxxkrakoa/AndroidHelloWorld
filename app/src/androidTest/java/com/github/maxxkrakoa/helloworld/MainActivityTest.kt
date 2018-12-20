package com.github.maxxkrakoa.helloworld

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.After

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @get:Rule
    val reportHelper = Factory.getReportHelper() as ReportHelper

    @After
    fun TearDown() {
        reportHelper.label("Stopping App")
    }

    @Test fun buttonWorks() {
        onView(withId(R.id.textView)).check(matches(withText("Hello World!")))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("Clicked!")))
    }
}