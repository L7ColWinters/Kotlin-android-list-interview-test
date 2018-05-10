package tester_boo.com.interviewtester2.repository

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserRepositoryModule {

    @Provides
    @Singleton
    fun providesUserRepository(): UserRepository = InMemoryRepository()
}