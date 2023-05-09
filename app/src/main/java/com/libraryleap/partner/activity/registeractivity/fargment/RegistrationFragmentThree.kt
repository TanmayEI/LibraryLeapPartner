package com.libraryleap.partner.activity.registeractivity.fargment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.libraryleap.partner.R
import com.libraryleap.partner.databinding.FragmentHomeBinding
import com.libraryleap.partner.databinding.FragmentRegistrationOneBinding
import com.libraryleap.partner.databinding.FragmentRegistrationThreeBinding
import com.libraryleap.partner.databinding.FragmentRegistrationTwoBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RegistrationFragmentThree : Fragment() {

    private var _binding: FragmentRegistrationThreeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegistrationThreeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.next.setOnClickListener {
            findNavController().navigate(R.id.RegistrationFragmentFour)
        }

/*
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}