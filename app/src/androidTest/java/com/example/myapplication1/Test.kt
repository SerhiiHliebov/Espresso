package com.example.myapplication1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Test {

    @Test
    fun homeTest() {
        onView(withId(com.google.android.material.R.id.design_menu_item_text)).check(matches(isDisplayed()))
    }
    @Test
    fun galleryTest() {
        onView(withId(com.google.android.material.R.id.design_menu_item_text)).check(matches(
            isClickable()))
    }
}