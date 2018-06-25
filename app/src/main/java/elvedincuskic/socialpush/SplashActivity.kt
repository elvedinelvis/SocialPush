package elvedincuskic.socialpush

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val firebaseUser = FirebaseAuth.getInstance().currentUser
        val isLoggedIn = firebaseUser != null

        when (isLoggedIn) {
            true -> startActivity(MainActivity.newIntent(this))
            false -> startActivity(LoginActivity.newIntent(this))
        }

        finish()
    }
}