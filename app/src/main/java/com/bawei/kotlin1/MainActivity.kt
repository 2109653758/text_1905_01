package com.bawei.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.StringCallback
import com.lzy.okgo.model.Response


class MainActivity : AppCompatActivity() {

    lateinit var re :RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val  mJavaBean = JavaBean("小沈",15)
//        System.out.println("123"+mJavaBean.name);
//
//        val mBean = JavaBean.bean("你好")
//        System.out.println("999"+mBean.name)
        re = findViewById(R.id.re);
        name()
    }

    fun name(){
        OkGo.get<String>("http://www.qubaobei.com/ios/cf/dish_list.php?stage_id=1&limit=20&page=1")
            .execute(object : StringCallback() {
                override fun onSuccess(response: Response<String>) {
                    var s = response.body()
                    System.out.println(s+"")

                    var gson = Gson()
                    var data =gson.fromJson(s,FoodBean::class.java)
                    var dat = data.data;

                    var myAdapter = MyAdapter(dat);

                    var layout = LinearLayoutManager(this@MainActivity)
                    re.adapter = myAdapter
                    re.layoutManager = layout
                }
            })
    }


}