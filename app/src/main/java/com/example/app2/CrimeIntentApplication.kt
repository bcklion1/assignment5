package com.example.app2

import android.app.Application

class CrimeIntentApplication : Application() {

    override fun onCreate(){
        super.onCreate()
        CrimeRepository.initalize(this)
    }
}