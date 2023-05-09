package com.libraryleap.partner.fragment.membershipfragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraryleap.partner.R
import com.libraryleap.partner.activity.LoginActivity
import com.libraryleap.partner.databinding.FragmentMembershipBinding
import com.topcutlawn.Fragments.HomeFragment.Adapters.MembershipAdapter
import com.topcutlawn.Fragments.HomeFragment.TodayEnquiryViewModel

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MembershipFragment : Fragment() {

    private var _binding: FragmentMembershipBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var homeAdapter: MembershipAdapter
    private lateinit var homedetailslist: List<TodayEnquiryViewModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMembershipBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

/*
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
*/
        home_list()
        binding.membership.layoutManager = LinearLayoutManager(requireContext())
        binding.membership.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        homeAdapter = MembershipAdapter(homedetailslist,requireContext())

        binding.membership.adapter = homeAdapter
/*
        Handler().postDelayed({


        }, 1000)
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