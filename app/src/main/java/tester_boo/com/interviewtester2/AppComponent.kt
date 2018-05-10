package tester_boo.com.interviewtester2

import dagger.Component
import tester_boo.com.interviewtester2.repository.UserRepository
import tester_boo.com.interviewtester2.repository.UserRepositoryModule
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRepositoryModule::class])
interface AppComponent {

    fun getUserRepo(): UserRepository
}