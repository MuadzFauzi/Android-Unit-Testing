package com.example.simpletestassignment

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /* * INSTRUMENTAL TEST CASE 1: Cek Visibilitas Layout Utama
     * Deskripsi: Memastikan layout utama (root) muncul saat aplikasi dibuka.
     * Alasan: Memastikan aktivitas berhasil di-launch tanpa crash.
     */
    @Test
    fun testLayoutIsDisplayed() {
        onView(withParent(withId(android.R.id.content))).check(matches(isDisplayed()))
    }

    /* * INSTRUMENTAL TEST CASE 2: Cek Komponen Tertentu
     * Deskripsi: Memastikan UI mengandung elemen penting (misal: mengecek ID default).
     * Alasan: Memastikan desain UI tidak hilang saat proses build.
     */
    @Test
    fun testAppNameIsVisible() {
        // Kita mengecek apakah ada view yang ditampilkan (dummy test untuk kesederhanaan)
        onView(withText("SimpleTestAssignment")).check(matches(isDisplayed()))
    }
}