package com.example.t1ebasicos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class frag2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(requireContext(), "Botón normal pulsado", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
            Toast.makeText(requireContext(), "ImageButton pulsado", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener {
            Toast.makeText(requireContext(), "FAB pulsado", Toast.LENGTH_SHORT).show()
        }
    }
}