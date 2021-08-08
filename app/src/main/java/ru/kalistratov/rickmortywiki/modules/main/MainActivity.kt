package ru.kalistratov.rickmortywiki.modules.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kalistratov.rickmortywiki.R
import ru.kalistratov.rickmortywiki.modules.main.view.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}