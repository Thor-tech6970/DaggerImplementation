package com.example.daggerimplementation

import android.util.Log
import android.widget.Toast
import javax.inject.Inject

//class EmailService @Inject constructor(){
//
//    fun sendEmail(email: String , password: String) {
//        Log.d("EMAIL SERVICE RESULT", "Email sent to user.")
//    }
//}

interface NotificationService{

    fun sendNotification(email : String , password : String)
//    {
//        Log.d("EMAIL SERVICE RESULT" , "Email sent to user.")
//    }

}

class SendEmailService @Inject constructor() : NotificationService{
    override fun sendNotification(email: String, password: String) {
        Log.d("EMAIL SERVICE RESULT" , "Email sent to user.")
    }
}

class SendTextMessageService : NotificationService{
    override fun sendNotification(email: String, password: String) {
        Log.d("TEXT MSG SERVICE RESULT" , "text message sent to user.")
    }

}