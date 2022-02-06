package com.coooldoggy.tabling.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.coooldoggy.tabling.databinding.FragmentFavoriteBinding
import com.google.android.material.tabs.TabLayoutMediator

class FavoriteFragment: Fragment() {
    companion object{
        private val TAG = FavoriteFragment::class.java.simpleName
    }

    private var binding: FragmentFavoriteBinding? = null
    private var favoriteTabAdapter: FavoriteTabAdapter? = null
    private val tabTitle = arrayListOf("저장", "최근본")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        favoriteTabAdapter = FavoriteTabAdapter(this)
        with(binding){
            if (this == null) return@with
            vpTab.adapter = favoriteTabAdapter
            TabLayoutMediator(tbMy, vpTab){ tab, position ->
                tab.text = tabTitle[position]
            }.attach()

        }
    }

    inner class FavoriteTabAdapter(fragment: Fragment): FragmentStateAdapter(fragment){
        override fun getItemCount(): Int = 2

        override fun createFragment(position: Int): Fragment {
           return when (position){
                0 -> SavedContentFragment()
                else -> RecentViewFragment()
            }
        }

    }
}