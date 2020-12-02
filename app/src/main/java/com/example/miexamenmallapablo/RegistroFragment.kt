package com.example.miexamenmallapablo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.miexamenmallapablo.databinding.FragmentInicioFragmentBinding
import com.example.miexamenmallapablo.databinding.FragmentRegistroBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [RegistroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistroFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentRegistroBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_registro,container,false)
        binding.btnRegistrar.setOnClickListener{view: View ->

            view.findNavController().navigate(RegistroFragmentDirections.actionRegistroFragmentToInicioFragmentFragment())
        }

        return binding.root

    }

}