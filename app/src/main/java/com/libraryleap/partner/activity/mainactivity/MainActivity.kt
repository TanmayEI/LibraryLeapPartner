package com.libraryleap.partner.activity.mainactivity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.libraryleap.partner.R
import com.libraryleap.partner.activity.LoginActivity
import com.libraryleap.partner.activity.bookingactivity.BookingManagementActivity
import com.libraryleap.partner.activity.notificationactivity.NotificationActivity
import com.libraryleap.partner.activity.paymentactivity.PaymentManagementActivity
import com.libraryleap.partner.databinding.ActivityMainBinding
import com.libraryleap.partner.fragment.homefragment.activity.AttendanceManagementActivity
import com.libraryleap.partner.fragment.homefragment.activity.EnquiryManagementActivity
import com.libraryleap.partner.fragment.homefragment.activity.TodayAttendanceActivity
import com.topcutlawn.Fragments.HomeFragment.Adapters.NavigationAdapter

class MainActivity : AppCompatActivity(),OnClickNavigator {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    lateinit var relative_layout:RelativeLayout
    lateinit var navi_view:ImageView
    lateinit var logo:ImageView
    lateinit var notification:ImageView
    lateinit var heading:TextView
    lateinit var relative_library:RelativeLayout
    lateinit var drawerLayout: DrawerLayout
    lateinit var cancel: ImageView
    lateinit var navController:NavController
   // private lateinit var adapter: NavigationRVAdapter
    private lateinit var adapter: NavigationAdapter
    private var items = arrayListOf(
        NavigationItemModel(R.drawable.menu, "Home"),
        NavigationItemModel(R.drawable.white_person, "My Library"),
        NavigationItemModel(R.drawable.membership, "Membership Renewable"),
        NavigationItemModel(R.drawable.white_student, "Students Management"),
        NavigationItemModel(R.drawable.white_time, "Attendance Management"),
        NavigationItemModel(R.drawable.booking, "Booking Management"),
        NavigationItemModel(R.drawable.enquiry, "Inquiry Management"),
        NavigationItemModel(R.drawable.payment, "Payment Management"),
        NavigationItemModel(R.drawable.logout, "Logout")
    )
    lateinit var navigationrecycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        navController= findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        relative_layout=findViewById(R.id.relative_layout) as RelativeLayout
        navi_view=findViewById(R.id.navi_view) as ImageView
        notification=findViewById(R.id.notification) as ImageView
        logo=findViewById(R.id.logo) as ImageView
        heading=findViewById(R.id.heading)
        relative_library=findViewById(R.id.relative_library)
        cancel=findViewById(R.id.cancel)

        notification.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        var bottomNav: BottomNavigationView
        bottomNav = findViewById(R.id.bottom_navigation) as BottomNavigationView


        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    relative_layout.setBackgroundColor(Color.WHITE)
                    logo.visibility=View.VISIBLE
                    navi_view.visibility=View.VISIBLE
                    relative_library.visibility=View.GONE
                    notification.setImageResource(R.drawable.notification)
                    heading.setText("")
                    relative_layout.visibility=View.VISIBLE
                    navController.navigate(R.id.FirstFragment)
                    true
                }
                R.id.memberahip -> {
                    relative_layout.setBackgroundColor(Color.parseColor("#1E437A"))
                    logo.visibility=View.GONE
                    navi_view.visibility=View.GONE
                    relative_layout.visibility=View.VISIBLE
                    notification.setImageResource(R.drawable.search)
                    heading.setText("Membership Renewable")
                  //  relative_layout.visibility=View.GONE
                    navController.navigate(R.id.SecondFragment)
                    true
                }
                R.id.my_student -> {
                    relative_layout.setBackgroundColor(Color.parseColor("#191464"))
                    logo.visibility=View.GONE
                    navi_view.visibility=View.VISIBLE
                    relative_layout.visibility=View.VISIBLE
                    notification.setImageResource(R.drawable.notification_white)
                    heading.setText("")
                    // relative_layout.visibility=View.VISIBLE
                    navController.navigate(R.id.StudentFragment)
                  //  navController.navigate(R.id.insurance_history)
                    true
                }

                R.id.my_lab -> {
                    relative_layout.setBackgroundColor(Color.parseColor("#191464"))
                    logo.visibility=View.GONE
                    navi_view.visibility=View.VISIBLE
                    notification.setImageResource(R.drawable.notification_white)
                    heading.setText("")
                    // relative_layout.visibility=View.GONE
                  //  relative_library.visibility=View.VISIBLE
                    navController.navigate(R.id.MyLibraryFragment)
                   // navController.navigate(R.id.profile)
                    true

                }


            }
            true
        }


        drawerLayout = findViewById(R.id.my_drawer_layout)
        navigationrecycler=findViewById(R.id.navigation_rv)

        cancel.setOnClickListener {
            drawerLayout.closeDrawer(GravityCompat.START)
        }

        navi_view.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat. START)
        }

        drawerLayout.closeDrawer(GravityCompat.START)

       // home_list()
        navigationrecycler.layoutManager = LinearLayoutManager(this)
        navigationrecycler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adapter = NavigationAdapter(items,this,this)

        navigationrecycler.adapter = adapter


        // Set the toolbar
        //setSupportActionBar(activity_main_toolbar)

        // Setup Recyclerview's Layout




    }
/*
    fun home_list(){
        homedetailslist = listOf(
            TodayEnquiryViewModel(
                "Residential Services",
            ),
            TodayEnquiryViewModel(
                "Commercial Services",
            ),
            TodayEnquiryViewModel(
                "Residential Services",
            )
        )
    }
*/

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {

    }

    override fun onClick(data: String) {
        if (data.equals("Home")){
            drawerLayout.closeDrawer(GravityCompat.START)
            relative_layout.setBackgroundColor(Color.WHITE)
            logo.visibility=View.VISIBLE
            navi_view.visibility=View.VISIBLE
            relative_library.visibility=View.GONE
            notification.setImageResource(R.drawable.notification)
            heading.setText("")
            relative_layout.visibility=View.VISIBLE
            navController.navigate(R.id.FirstFragment)
        }else if (data.equals("My Library")){
            drawerLayout.closeDrawer(GravityCompat.START)
            relative_layout.setBackgroundColor(Color.parseColor("#191464"))
            logo.visibility=View.GONE
            navi_view.visibility=View.VISIBLE
            notification.setImageResource(R.drawable.notification_white)
            heading.setText("")
            // relative_layout.visibility=View.GONE
            //  relative_library.visibility=View.VISIBLE
            navController.navigate(R.id.MyLibraryFragment)
        }else if (data.equals("Membership Renewable")){
            drawerLayout.closeDrawer(GravityCompat.START)
            relative_layout.setBackgroundColor(Color.parseColor("#1E437A"))
            logo.visibility=View.GONE
            navi_view.visibility=View.GONE
            relative_layout.visibility=View.VISIBLE
            notification.setImageResource(R.drawable.search)
            heading.setText("Membership Renewable")
            //  relative_layout.visibility=View.GONE
            navController.navigate(R.id.SecondFragment)
        }else if (data.equals("Students Management")){
            drawerLayout.closeDrawer(GravityCompat.START)
            val intent = Intent(this, TodayAttendanceActivity::class.java)
            startActivity(intent)
        }else if (data.equals("Attendance Management")){
            drawerLayout.closeDrawer(GravityCompat.START)
             val intent = Intent(this, AttendanceManagementActivity::class.java)
            startActivity(intent)
        }else if (data.equals("Booking Management")){
            drawerLayout.closeDrawer(GravityCompat.START)
            val intent = Intent(this, BookingManagementActivity::class.java)
            startActivity(intent)
        }else if (data.equals("Inquiry Management")){
            drawerLayout.closeDrawer(GravityCompat.START)
            val intent = Intent(this, EnquiryManagementActivity::class.java)
            startActivity(intent)
        }else if (data.equals("Payment Management")){
            drawerLayout.closeDrawer(GravityCompat.START)
            val intent = Intent(this, PaymentManagementActivity::class.java)
            startActivity(intent)
        }else if (data.equals("Logout")){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            drawerLayout.closeDrawer(GravityCompat.START)
        }
    }
}