package com.example.aplikasisatu

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentAktaLahir : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_akta_lahir, container, false)
        listen_akta_lahir(view)
        return view
    }


    companion object {
        fun newInstance() :FragmentAktaLahir{
            return FragmentAktaLahir()
        }
    }


}
