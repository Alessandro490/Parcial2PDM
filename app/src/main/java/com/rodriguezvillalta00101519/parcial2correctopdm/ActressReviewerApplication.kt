package com.rodriguezvillalta00101519.parcial2correctopdm

import android.app.Application
import com.rodriguezvillalta00101519.parcial2correctopdm.data.actresses
import com.rodriguezvillalta00101519.parcial2correctopdm.repository.ActressRepository

class ActressReviewerApplication : Application() {
    val ActressRepository: ActressRepository by lazy {
        ActressRepository(actresses)
    }
}