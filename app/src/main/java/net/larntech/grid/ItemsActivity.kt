package net.larntech.grid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_items.*

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        var data = intent.getStringExtra("name");

        Log.e("TAG", " data ===> $data");

        when(data){
            "Mango" ->
                imageView.setImageResource(R.drawable.mango);
            "Banana" ->
                imageView.setImageResource(R.drawable.banana)
        }

    }
}