package com.example.daggerimplementation

import javax.inject.Inject

class RegisterUserRepository @Inject constructor(val notificationService : NotificationService , val dataStorageService: DataStorageService) {

    fun registerUser(email : String , password : String){
        notificationService.sendNotification(email , password)
        dataStorageService.saveUserData()
    }

}