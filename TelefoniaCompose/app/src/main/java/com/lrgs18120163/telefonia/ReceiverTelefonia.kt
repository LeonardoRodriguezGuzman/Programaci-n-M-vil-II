package com.lrgs18120163.telefonia

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony

class ReceiverTelefonia : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val action : String? = intent?.getAction()
        if (action == Intent.ACTION_BOOT_COMPLETED){

        }

        if (Intent.ACTION_INPUT_METHOD_CHANGED === action){

        }
        if (action == Intent.ACTION_BOOT_COMPLETED){

        }
        if (action == Telephony.Sms.Intents.SMS_RECEIVED_ACTION){
            val bndSms : Bundle? = intent.getExtras()
            val pdus = bndSms?.get("pdus") as Array<Any>?
            val sms =
        }
    }

}