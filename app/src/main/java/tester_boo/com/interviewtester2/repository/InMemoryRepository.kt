package tester_boo.com.interviewtester2.repository

import tester_boo.com.interviewtester2.model.User

class InMemoryRepository : UserRepository{

    private var users : MutableList<User> = ArrayList()

    init {
        users.add(User("Umesh", "Garg"))
        users.add(User("Joelle", "Gernez"))
        users.add(User("Brian", "Shuman"))
        users.add(User("Kurt", "Ishisaka", "kurt@pinger.com"))
        users.add(User("Bin", "Zhou"))
        users.add(User("George", "Lui"))
        users.add(User("Elita", "Ng"))
        users.add(User("Martin", "Stein"))
    }

    override fun getUsers(): List<User> = users

    override fun addUser(user: User) {
        users.add(user)
    }

    override fun updateUser(user: User) {
        //just go with it
        users.remove(user)
        users.add(user)
    }

    override fun deleteUser(user: User) {
        users.remove(user)
    }
}