package tcnews.singledevapps.tcnews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import tcnews.singledevapps.tcnews.adapters.NewsAdapter

class MainActivity : AppCompatActivity() {
    private val newsList:ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = GridLayoutManager(this,1)
        recycler_view.adapter = NewsAdapter(newsList,this)
    }
}
