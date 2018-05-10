package tester_boo.com.interviewtester2.repository

import tester_boo.com.interviewtester2.model.User

interface UserRepository {

    fun getUsers(): List<User>

    fun addUser(user: User)

    fun updateUser(user: User)

    fun deleteUser(user: User)
}