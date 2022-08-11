package com.example.itunes_mysia


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class PopFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerview: RecyclerView
    private lateinit var musicArrayList: ArrayList<Music>

    lateinit var artistName: Array<String>
    lateinit var trackName: Array<String>
    lateinit var previewUrl: Array<String>
    lateinit var artworkUrl60: Array<String>
    lateinit var trackPrice: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_main, container, false)
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            PopFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populateMusic()
        val layoutManager = LinearLayoutManager(context)
        recyclerview = view.findViewById(R.id.recycler_view)
        recyclerview.layoutManager = layoutManager
        recyclerview.setHasFixedSize(true)
        adapter = MyAdapter(musicArrayList)
        recyclerview.adapter = adapter
    }

    private fun populateMusic() {
        artistName = arrayOf(
            getString(R.string.journey)
        )
        trackName = arrayOf(
            getString(R.string.everybody_backstreet_s_back)
        )
        previewUrl = arrayOf(
            getString(R.string.journeyurl)
        )
        artworkUrl60 = arrayOf(
            getString(R.string.journeyartwork)
        )
        trackPrice = arrayOf(
            getString(R.string.journeytrackprice)
        )

    }
}