package kg.zkdev.blue_print_pos

import android.util.Log
import kg.zkdev.blue_print_pos.BuildConfig

object Logger {
    fun log(message: String) {
        if (BuildConfig.DEBUG) {
            Log.d("BluePrintPos", message)
        }
    }
}