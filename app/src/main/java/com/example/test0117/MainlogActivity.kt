package com.example.test0117

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.main.*
import kotlinx.android.synthetic.main.toolbar.*


class MainlogActivity : AppCompatActivity() {
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)


        setSupportActionBar(toolbar)
        val actionBar=supportActionBar
        actionBar?.title=""


        drawerLayout=findViewById(R.id.drawerLayout)
        val navigationView:NavigationView=findViewById(R.id.navigation)


        toggle =ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(false)



        navigation.setNavigationItemSelectedListener {
            it.isChecked=true
            when(it.itemId){
                R.id.id_home_fragment->replaceFragment(HomeFragment(),it.title.toString())
                R.id.id_settings_fragment->replaceFragment(settingsFragment(),it.title.toString())
                R.id.id_info_fragment->replaceFragment(infoFragment(),it.title.toString())
                R.id.user->Toast.makeText(applicationContext,"我的帳戶",Toast.LENGTH_SHORT).show()
                R.id.signout->Toast.makeText(applicationContext,"登出",Toast.LENGTH_SHORT).show()
            }
            true
        }
    }


    private fun replaceFragment(fragment: Fragment, title:String){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }

}



