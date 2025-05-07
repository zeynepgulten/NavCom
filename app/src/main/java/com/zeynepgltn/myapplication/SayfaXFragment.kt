package com.zeynepgltn.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zeynepgltn.myapplication.databinding.FragmentSayfaXBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SayfaXFragment : Fragment() {
    private lateinit var binding:FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaXFragment_to_sayfaYFragment)
        }

        return binding.root
    }
}