package com.example.json

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonObject = JSONObject()
        jsonObject.put("nama_toko", "Laundry DCS")
        jsonObject.put("lokasi", "Tegal, Jawa Tengah")
        jsonObject.put("jumlah_cabang", 100)
        val  arrayCustomer = JSONArray()
        jsonObject.put("list_pelanggan",
            arrayCustomer
                .put(JSONObject()
                    .put("member_vip", null)
                    .put("nama", "Bae Suzy")
                    .put("berat_laundry", 20)
                    .put("pembayaran_sukses", true)
                ).put(JSONObject()
                    .put("member_vip", null)
                    .put("nama", "Lee min hoo")
                    .put("berat_laundry", 30)
                    .put("pembayaran_sukses", false)
                ).put(JSONObject()
                    .put("member_vip", null)
                    .put("nama", "mba agti")
                    .put("berat_laundry", 40)
                    .put("pembayaran_sukses", true)
                )
            )
    }
}