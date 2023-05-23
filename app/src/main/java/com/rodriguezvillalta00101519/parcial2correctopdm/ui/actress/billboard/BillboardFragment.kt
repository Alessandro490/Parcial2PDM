package com.rodriguezvillalta00101519.parcial2correctopdm.ui.actress.billboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.rodriguezvillalta00101519.parcial2correctopdm.R

class BillboardFragment : Fragment() {

    private lateinit var actionToNewActress : FloatingActionButton
    private lateinit var actionToDescription : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionToNewActress = view.findViewById(R.id.btnNavCreateNewNumber)

        actionToDescription = view.findViewById(R.id.billboard_list_cardview)

        actionToNewActress.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_actressFragment)
        }

        actionToDescription.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_newActressFragment)
        }
    }

}