package com.example.hello_world

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class MyLifecycleObserver : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event.toString()){
            "ON_CREATE" -> Log.d("myLog", "ON_CREATE event")
            "ON_START" -> Log.d("myLog", "ON_START event")
            "ON_RESUME" -> Log.d("myLog", "ON_RESUME event")
            "ON_PAUSE" -> Log.d("myLog", "ON_PAUSE event")
            "ON_STOP" -> Log.d("myLog", "ON_STOP event")
            "ON_DESTROY" -> Log.d("myLog", "ON_DESTROY event")
        }
    }
}