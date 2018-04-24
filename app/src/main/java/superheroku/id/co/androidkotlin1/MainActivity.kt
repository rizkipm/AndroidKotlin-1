package superheroku.id.co.androidkotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textNama = findViewById(R.id.txtNama) as EditText
        val buttonSubmit = findViewById(R.id.btnSubmit) as Button
        buttonSubmit.setOnClickListener {
            Toast.makeText(this, "Hi dude i'm " + textNama.text, Toast.LENGTH_SHORT).show()
        }
    }
}
