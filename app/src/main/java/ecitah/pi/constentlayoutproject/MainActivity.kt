package ecitah.pi.constraintlayoutproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textInputEditTextUsername: TextInputEditText =
                findViewById(R.id.textInputEditTextUsername)

        val textInputEditTextPassword: TextInputEditText =
                findViewById(R.id.textInputEditTextPassword)

        val buttonLogin: MaterialButton =
                findViewById(R.id.buttonLogin)

        /*button.Login.text = "ABC"*/

        buttonLogin.setOnClickListener {
            Toast.makeText(
                    context:this,
                    text:"${textInputEditTextUsername.text} - ${textInputEditTextPassword.text}",
                    Toast.LENGTH_LONG
            ).show()

        }
    }
}