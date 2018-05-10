package tester_boo.com.interviewtester2.model

import android.net.Uri

data class User(var firstName: String,
                var lastName: String,
                var email: String? = null,
                var picUri: Uri? = null,
                var phoneNumber: String? = null) {
}