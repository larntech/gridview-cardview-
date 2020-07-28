package net.larntech.grid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardApple.setOnClickListener {
            startActivity(Intent(this,AppleActivity::class.java))
        }
        cardLemon.setOnClickListener {
            startActivity(Intent(this,LemonActivity::class.java))
        }
        cardMango.setOnClickListener {
            startActivity(Intent(this,ItemsActivity::class.java).putExtra("name","Mango"))
        }
        cardBanana.setOnClickListener {
            startActivity(Intent(this,ItemsActivity::class.java).putExtra("name","Banana"))
        }
    }
}