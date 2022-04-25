package com.example.proconomyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.nav_bar.*

class nav_bar_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_bar)

        val firstFragment=first_frag()
        val secondFragment=second_frag()
        val thirdFragment=third_frag()
        val forthFragment=forth_frag()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.explore_tab->setCurrentFragment(firstFragment)
                R.id.favorite_tab->setCurrentFragment(secondFragment)
                R.id.conversation_tab->setCurrentFragment(thirdFragment)
                R.id.account_tab->setCurrentFragment(forthFragment)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}