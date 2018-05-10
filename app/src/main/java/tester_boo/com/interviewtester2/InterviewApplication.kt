package tester_boo.com.interviewtester2

import android.app.Application

class InterviewApplication : Application() {

    override fun onCreate() {
        super.onCreate()

       graph = DaggerAppComponent.builder().build()
    }

    companion object {
        lateinit var graph: AppComponent
    }
}