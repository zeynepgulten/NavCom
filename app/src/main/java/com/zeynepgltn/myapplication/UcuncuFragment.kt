package com.zeynepgltn.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zeynepgltn.myapplication.databinding.FragmentUcuncuBinding

class UcuncuFragment : Fragment() {
    private lateinit var binding:FragmentUcuncuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentUcuncuBinding.inflate(inflater, container, false)

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_SayfaBFragment_to_sayfaYFragment)
        }

        return binding.root
    }
}