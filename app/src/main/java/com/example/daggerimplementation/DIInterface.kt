package com.example.daggerimplementation

import dagger.Component

@Component(modules = [NotificationServiceModule::class , DataStorageServiceModule::class])
interface DIInterface {

//    fun getRegisterUserRepository() : RegisterUserRepository

    fun injectMainActivity(mainActivity: MainActivity)

}