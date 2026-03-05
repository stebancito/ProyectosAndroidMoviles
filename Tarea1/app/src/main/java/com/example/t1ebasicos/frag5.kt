package com.example.t1ebasicos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.w3c.dom.Text

class frag5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TextView
        view.findViewById<TextView>(R.id.TextViewInfo).setOnClickListener {
            Toast.makeText(requireContext(), "TextView pulsado", Toast.LENGTH_SHORT).show()
        }

        // ImageView
        view.findViewById<ImageView>(R.id.imageViewInfo).setOnClickListener {
            Toast.makeText(requireContext(), "ImageView pulsado", Toast.LENGTH_SHORT).show()
        }

        // ProgressBar horizontal: incrementar al pulsar boton
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBarHorizontal)
        view.findViewById<Button>(R.id.btnIncrementar).setOnClickListener {
            val progress = progressBar.progress
            if (progress < progressBar.max) {
                progressBar.progress = progress + 10
            } else {
                progressBar.progress = 0
            }
            Toast.makeText(requireContext(), "Progreso: ${progressBar.progress}", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<ProgressBar>(R.id.progressBarCircular).setOnClickListener {
            Toast.makeText(requireContext(), "ProgressBar circular", Toast.LENGTH_SHORT).show()
        }
    }
}