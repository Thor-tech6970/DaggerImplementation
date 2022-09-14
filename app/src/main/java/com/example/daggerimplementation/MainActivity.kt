package com.example.daggerimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var registerUserRepository: RegisterUserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DIInterfaceInstance = DaggerDIInterface.builder().build()
        DIInterfaceInstance.injectMainActivity(this)
        registerUserRepository.registerUser("kunalchhabra127@gmail.com" , "radheychutia")

    }
}