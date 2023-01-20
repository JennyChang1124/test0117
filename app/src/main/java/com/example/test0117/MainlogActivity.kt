package com.example.test0117

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.main.*
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainlogActivity : AppCompatActivity() {

    private lateinit var navigationView: NavigationView
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        sure.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java);
            startActivity(intent)
        }

        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigation)

        navController = findNavController(androidx.fragment.R.id.fragment_container_view_tag)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.id_home_fragment,
                R.id.id_info_fragment,
                R.id.id_settings_fragment
            )
        )
        setupActionBarWithNavController(navController, drawerLayout)
        navigationView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=findNavController(androidx.fragment.R.id.fragment_container_view_tag)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}