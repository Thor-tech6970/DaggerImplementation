package com.example.daggerimplementation

import dagger.Module
import dagger.Provides

@Module
class DataStorageServiceModule {

    @Provides
    fun getStorageFirebaseService() : DataStorageService{
        return StorageFirebaseService()
    }

//    @Provides
//    fun getLocalDBStorageService() : DataStorageService{
//        return StorageLocalDBService()
//    }


}