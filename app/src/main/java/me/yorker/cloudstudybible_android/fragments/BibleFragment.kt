package me.yorker.cloudstudybible_android.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.yorker.cloudstudybible_android.R
import me.yorker.cloudstudybible_android.viewmodels.BibleViewModel


class BibleFragment : Fragment() {

    companion object {
        fun newInstance() = BibleFragment()
    }

    private lateinit var viewModel: BibleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bible_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BibleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
