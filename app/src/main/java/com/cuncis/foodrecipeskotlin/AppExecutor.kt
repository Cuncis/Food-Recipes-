package com.cuncis.foodrecipeskotlin

import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService

class AppExecutor {

    private var instance = AppExecutor()

    fun getInstance(): AppExecutor {
        return instance
    }

    private val networkIO: ScheduledExecutorService = Executors.newScheduledThreadPool(3)

    fun networkIO(): ScheduledExecutorService {
        return networkIO
    }

}