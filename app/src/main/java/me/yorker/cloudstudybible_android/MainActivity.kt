package me.yorker.cloudstudybible_android

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import me.yorker.cloudstudybible_android.fragments.BibleFragment
import me.yorker.cloudstudybible_android.fragments.HomeFragment
import me.yorker.cloudstudybible_android.fragments.ProfileFragment
import me.yorker.cloudstudybible_android.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    lateinit var homeFragment: HomeFragment
    lateinit var bibleFragment: BibleFragment
    lateinit var profileFragment: ProfileFragment
    lateinit var settingsFragment: SettingsFragment

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.flFragmentContainer, homeFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_bible -> {
                supportFragmentManager.beginTransaction().replace(R.id.flFragmentContainer, bibleFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                supportFragmentManager.beginTransaction().replace(R.id.flFragmentContainer, profileFragment).commit()
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_settings -> {
                supportFragmentManager.beginTransaction().replace(R.id.flFragmentContainer, settingsFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private fun initialize() {
        homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().add(R.id.flFragmentContainer, homeFragment).commit()

        bibleFragment = BibleFragment()
        supportFragmentManager.beginTransaction().add(R.id.flFragmentContainer, bibleFragment).commit()

        profileFragment = ProfileFragment()
        supportFragmentManager.beginTransaction().add(R.id.flFragmentContainer, profileFragment).commit()

        settingsFragment = SettingsFragment()
        supportFragmentManager.beginTransaction().add(R.id.flFragmentContainer, settingsFragment).commit()

        // Select Home
        supportFragmentManager.beginTransaction().replace(R.id.flFragmentContainer, homeFragment).commit()
    }
}
