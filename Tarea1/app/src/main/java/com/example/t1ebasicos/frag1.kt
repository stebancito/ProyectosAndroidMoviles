package com.example.t1ebasicos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText

class frag1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView2).setOnClickListener {
            Toast.makeText(requireContext(), "TextView pulsado", Toast.LENGTH_SHORT).show()
        }

        // CheckedTextView que cambia de estado
        val checkedTextView = view.findViewById<CheckedTextView>(R.id.checkedTextView)
        checkedTextView.setOnClickListener {
            checkedTextView.isChecked = !checkedTextView.isChecked
            val estado = if (checkedTextView.isChecked) "marcado" else "desmarcado"
            Toast.makeText(requireContext(), "CheckedTextView $estado", Toast.LENGTH_SHORT).show()
        }

    }
}