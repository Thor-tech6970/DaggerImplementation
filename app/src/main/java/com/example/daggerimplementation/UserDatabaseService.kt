package com.example.daggerimplementation

import android.util.Log
import javax.inject.Inject

//class UserDatabaseService @Inject constructor(){
//    fun saveUserData(){
//        Log.d("USER DB SERVICE RESULT" , "User stored to DB")
//    }
//}

interface DataStorageService{

    fun saveUserData()
//    {
//        Log.d("USER DB SERVICE RESULT" , "User stored to DB")
//    }

}

class StorageLocalDBService @Inject constructor() : DataStorageService{
    override fun saveUserData() {
        Log.d("LOCAL DB SERVICE RESULT" , "Data stored to local DB.")
    }
}

class StorageFirebaseService() : DataStorageService{
    override fun saveUserData() {
        Log.d("FIREBASE STORAGE RESULT" , "Data stored to firebase.")
    }

}