package com.libraryleap.partner.fragment.homefragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.databinding.FragmentHomeBinding
import com.libraryleap.partner.fragment.homefragment.activity.AttendanceManagementActivity
import com.libraryleap.partner.fragment.homefragment.activity.EnquiryManagementActivity
import com.libraryleap.partner.fragment.homefragment.activity.StudentRegistrationActivity
import com.libraryleap.partner.fragment.homefragment.activity.TodayAttendanceActivity
import com.topcutlawn.Fragments.HomeFragment.Adapters.MembershipAdapter
import com.topcutlawn.Fragments.HomeFragment.Adapters.TodayEnquiryAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var homeAdapter: TodayEnquiryAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        home_list()
        binding.todayEnquiry.layoutManager = LinearLayoutManager(requireContext())
        binding.todayEnquiry.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        homeAdapter = TodayEnquiryAdapter(homedetailslist,requireContext())

        binding.todayEnquiry.adapter = homeAdapter


        binding.newStudentReg.layoutManager = LinearLayoutManager(requireContext())
        binding.newStudentReg.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        homeAdapter = TodayEnquiryAdapter(homedetailslist,requireContext())

        binding.newStudentReg.adapter = homeAdapter

        binding.todayAttendance.setOnClickListener {
            val intent = Intent(requireContext(), TodayAttendanceActivity::class.java)
            startActivity(intent)
        }

        binding.monthlyMember.setOnClickListener {
            val intent = Intent(requireContext(), AttendanceManagementActivity::class.java)
            startActivity(intent)
        }
        binding.viewAllStudentReg.setOnClickListener {
            val intent = Intent(requireContext(), StudentRegistrationActivity::class.java)
            startActivity(intent)
        }

        binding.viewAll.setOnClickListener {
            val intent = Intent(requireContext(), EnquiryManagementActivity::class.java)
            startActivity(intent)
        }




/*
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
*/
    }

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


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}