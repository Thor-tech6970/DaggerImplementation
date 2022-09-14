package com.example.daggerimplementation

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationServiceModule {

//    @Provides
//    fun getSendTextMessageService() : NotificationService{
//        return SendTextMessageService()
//    }

//    @Provides
//    fun getSendEmailService(emailService: SendEmailService) : NotificationService{
//        return emailService
//    }

    @Binds
    abstract fun getSendEmailService(emailService: SendEmailService) : NotificationService
}