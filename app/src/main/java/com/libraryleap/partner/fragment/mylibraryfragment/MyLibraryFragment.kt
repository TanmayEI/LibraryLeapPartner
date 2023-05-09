package com.libraryleap.partner.fragment.mylibraryfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.libraryleap.partner.databinding.FragmentMyLibraryBinding
import com.topcutlawn.Fragments.HomeFragment.Adapters.StudentListAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MyLibraryFragment : Fragment() {

    private var _binding: FragmentMyLibraryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var studentListAdapter: StudentListAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMyLibraryBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



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