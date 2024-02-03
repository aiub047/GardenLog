package com.mak.gardening_journal

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mak.gardening_journal.viewmodel.GardenLogViewModel

class GardenLog : Fragment() {

    companion object {
        fun newInstance() = GardenLog()
    }

    private lateinit var viewModel: GardenLogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_garden_log, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GardenLogViewModel::class.java)
        // TODO: Use the ViewModel
    }

}