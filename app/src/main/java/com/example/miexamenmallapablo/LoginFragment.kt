package com.example.miexamenmallapablo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.miexamenmallapablo.databinding.FragmentInicioFragmentBinding
import com.example.miexamenmallapablo.databinding.FragmentLoginBinding


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login,container,false)

        binding.btnLogin.setOnClickListener{view: View ->

            if (binding.editUsuario.getText().toString().equals("admin")&&binding.editTextTextPassword.getText().toString().equals("admin")){
                view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToInicioFragmentFragment())
            }

        }
        binding.btnRegistro.setOnClickListener{view: View ->

            view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegistroFragment())
        }

        return binding.root


    }

}