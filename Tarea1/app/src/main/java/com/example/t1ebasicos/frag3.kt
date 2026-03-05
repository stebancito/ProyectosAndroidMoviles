package com.example.t1ebasicos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class frag3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Chips
        val chipGroup = view.findViewById<ChipGroup>(R.id.chipGroup)
        for (i in 0 until chipGroup.childCount) {
            val chip = chipGroup.getChildAt(i) as? Chip
            chip?.setOnClickListener {
                Toast.makeText(requireContext(), "Chip: ${chip.text}", Toast.LENGTH_SHORT).show()
            }
        }

        // CheckBox
        view.findViewById<CheckBox>(R.id.checkBox).setOnCheckedChangeListener { _, isChecked ->
            val estado = if (isChecked) "marcado" else "desmarcado"
            Toast.makeText(requireContext(), "CheckBox $estado", Toast.LENGTH_SHORT).show()
        }

        // RadioGroup
        view.findViewById<RadioGroup>(R.id.radioGroup).setOnCheckedChangeListener { _, checkedId ->
            val radio = view.findViewById<RadioButton>(checkedId)
            Toast.makeText(requireContext(), "Opción seleccionada: ${radio.text}", Toast.LENGTH_SHORT).show()
        }

        // ToggleButton
        view.findViewById<ToggleButton>(R.id.toggleButton2).setOnCheckedChangeListener { _, isChecked ->
            val estado = if (isChecked) "encendido" else "apagado"
            Toast.makeText(requireContext(), "ToggleButton $estado", Toast.LENGTH_SHORT).show()
        }

        // Switch
        view.findViewById<Switch>(R.id.switch1).setOnCheckedChangeListener { _, isChecked ->
            val estado = if (isChecked) "activado" else "desactivado"
            Toast.makeText(requireContext(), "Switch $estado", Toast.LENGTH_SHORT).show()
        }

        // RatingBar
        view.findViewById<RatingBar>(R.id.ratingBar).setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(requireContext(), "Puntuación: $rating", Toast.LENGTH_SHORT).show()
        }

        // SeekBar
        view.findViewById<SeekBar>(R.id.seekBar).setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    Toast.makeText(requireContext(), "Valor: $progress", Toast.LENGTH_SHORT).show()
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}