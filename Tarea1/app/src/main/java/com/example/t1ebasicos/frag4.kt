package com.example.t1ebasicos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class frag4 : Fragment() {

    // Datos de ejemplo (los usaremos en todas las listas)
    private val frutas = listOf("Manzana", "Banana", "Naranja", "Uva", "Pera", "Sandía")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // LISTVIEW
        val listView = view.findViewById<ListView>(R.id.listViews)
        val adaptadorListView = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, frutas)
        listView.adapter = adaptadorListView
        // Cuando el usuario hace clic en un elemento, mostramos un mensaje
        listView.setOnItemClickListener { _, _, posicion, _ ->
            val frutaSeleccionada = frutas[posicion]
            Toast.makeText(requireContext(), "ListView: $frutaSeleccionada", Toast.LENGTH_SHORT).show()
        }

        // SPINNER
        val spinner = view.findViewById<Spinner>(R.id.spinnerr)
        val adaptadorSpinner = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, frutas)
        adaptadorSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptadorSpinner
        // Detectamos cuando el usuario selecciona algo
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, posicion: Int, id: Long) {
                val frutaSeleccionada = frutas[posicion]
                Toast.makeText(requireContext(), "Spinner: $frutaSeleccionada", Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        // RECYCLERVIEW (lista vertical)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerVieww)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                val vista = LayoutInflater.from(parent.context)
                    .inflate(android.R.layout.simple_list_item_1, parent, false)
                return object : RecyclerView.ViewHolder(vista) {}
            }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                val texto = holder.itemView.findViewById<TextView>(android.R.id.text1)
                texto.text = frutas[position]
                holder.itemView.setOnClickListener {
                    Toast.makeText(requireContext(), "RecyclerView: ${frutas[position]}", Toast.LENGTH_SHORT).show()
                }
            }

            override fun getItemCount() = frutas.size
        }

        // EXPANDABLELISTVIEW (lista con grupos)
        val expandableListView = view.findViewById<ExpandableListView>(R.id.expandableListVieww)
        val grupos = listOf("Frutas", "Verduras")
        val hijos = mapOf(
            "Frutas" to listOf("Manzana", "Banana", "Naranja"),
            "Verduras" to listOf("Zanahoria", "Lechuga", "Tomate")
        )

        // Adaptador para ExpandableListView
        val adaptadorExpandable = object : BaseExpandableListAdapter() {
            override fun getGroupCount(): Int = grupos.size

            override fun getChildrenCount(groupPosition: Int): Int {
                val grupo = grupos[groupPosition]
                return hijos[grupo]?.size ?: 0
            }

            override fun getGroup(groupPosition: Int): Any = grupos[groupPosition]

            override fun getChild(groupPosition: Int, childPosition: Int): Any {
                val grupo = grupos[groupPosition]
                return hijos[grupo]?.get(childPosition) ?: ""
            }

            override fun getGroupId(groupPosition: Int): Long = groupPosition.toLong()

            override fun getChildId(groupPosition: Int, childPosition: Int): Long = childPosition.toLong()

            override fun hasStableIds(): Boolean = false

            override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
                val vista = convertView ?: LayoutInflater.from(requireContext())
                    .inflate(android.R.layout.simple_expandable_list_item_1, parent, false)
                val texto = vista.findViewById<TextView>(android.R.id.text1)
                texto.text = grupos[groupPosition]
                return vista
            }

            override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
                val vista = convertView ?: LayoutInflater.from(requireContext())
                    .inflate(android.R.layout.simple_list_item_1, parent, false)
                val texto = vista.findViewById<TextView>(android.R.id.text1)
                val grupo = grupos[groupPosition]
                texto.text = hijos[grupo]?.get(childPosition) ?: ""
                return vista
            }

            override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean = true
        }
        expandableListView.setAdapter(adaptadorExpandable)

        // Al hacer clic en un hijo del ExpandableListView
        expandableListView.setOnChildClickListener { _, _, groupPosition, childPosition, _ ->
            val grupo = grupos[groupPosition]
            val elemento = hijos[grupo]?.get(childPosition) ?: ""
            Toast.makeText(requireContext(), "Expandable: $elemento", Toast.LENGTH_SHORT).show()
            true
        }
    }
}