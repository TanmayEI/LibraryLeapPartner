package com.libraryleap.partner.fragment.studentfragment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.databinding.ActivityAddNewStudentBinding
import com.libraryleap.partner.databinding.ActivityMonthlyDetailsAttendanceBinding
import com.libraryleap.partner.fragment.studentfragment.activity.adapter.MonthlyAttendanceDetailsAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

class AddNewStudentActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityAddNewStudentBinding
    var email:String=""
    var password:String=""
    private lateinit var todayEnquiryAdapter: MonthlyAttendanceDetailsAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddNewStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setSupportActionBar(binding.toolbar)

        binding.back.setOnClickListener {
            onBackPressed()
        }




    }






}