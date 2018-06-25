package elvedincuskic.socialpush.fcm

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class SocialPushFirebaseInstanceIdService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {

        val refreshedToken = FirebaseInstanceId.getInstance().token

        Log.d("onTokenRefresh: ", refreshedToken)

        // Here we usually send refreshed token to a real backend.
        // sendRegistrationToServer(refreshedToken);
    }
}