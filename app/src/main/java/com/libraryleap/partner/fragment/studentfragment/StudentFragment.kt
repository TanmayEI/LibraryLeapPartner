package com.libraryleap.partner.fragment.studentfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.activity.registeractivity.RegistrationActivity
import com.libraryleap.partner.databinding.FragmentStudentBinding
import com.libraryleap.partner.fragment.studentfragment.activity.AddNewStudentActivity
import com.topcutlawn.Fragments.HomeFragment.Adapters.StudentListAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class StudentFragment : Fragment() {

    private var _binding: FragmentStudentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var studentListAdapter: StudentListAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentStudentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.addNewStudent.setOnClickListener {
            val intent = Intent(requireContext(), AddNewStudentActivity::class.java)
            startActivity(intent)
        }

        home_list()
        binding.studentList.layoutManager = LinearLayoutManager(requireContext())
        binding.studentList.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        studentListAdapter = StudentListAdapter(homedetailslist,requireContext())

        binding.studentList.adapter = studentListAdapter


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