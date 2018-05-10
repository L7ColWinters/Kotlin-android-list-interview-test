package tester_boo.com.interviewtester2.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import tester_boo.com.interviewtester2.InterviewApplication
import tester_boo.com.interviewtester2.model.User

class MainViewModel : ViewModel() {

    private val usersLiveData = MutableLiveData<ArrayList<User>>()
    val users: LiveData<ArrayList<User>>
        get() = usersLiveData

    init {
        usersLiveData.value = ArrayList(InterviewApplication.graph.getUserRepo().getUsers())
    }

    fun addUser(user: User) {


    }

}
