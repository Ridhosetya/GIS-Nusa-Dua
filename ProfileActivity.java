package com.example.gisnusadua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class ProfileActivity extends AppCompatActivity {
    private TextView txnama, txalamat, txjumlahkeluarga, txpekerjaan;

    private RequestQueue requestQueue;
    private StringRequest stringRequest;

    ArrayList<HashMap<String, String>> list_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String url = "http://192.168.43.20/peta/getdata.php";
        txnama = (TextView)findViewById(R.id.txtnama);
        txalamat = (TextView)findViewById(R.id.txtalamat);
        txjumlahkeluarga = (TextView)findViewById(R.id.txtjumlahkeluarga);
        txpekerjaan = (TextView)findViewById(R.id.txtpekerjaan);

        requestQueue = Volley.newRequestQueue(ProfileActivity.this);

        list_data = new ArrayList<HashMap<String, String>>();

        stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("barang");
                    for (int a = 0; a < jsonArray.length(); a ++){
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map  = new HashMap<String, String>();
                        map.put("id", json.getString("id"));
                        map.put("nama", json.getString("nama"));
                        map.put("alamat", json.getString("alamat"));
                        map.put("jumlahkeluarga", json.getString("jumlahkeluarga"));
                        map.put("pekerjaan", json.getString("alamat"));
                        list_data.add(map);
                    }

                    txnama.setText(list_data.get(0).get("nama"));
                    txalamat.setText(list_data.get(0).get("alamat"));
                    txjumlahkeluarga.setText(list_data.get(0).get("jumlahkeluarga"));
                    txpekerjaan.setText(list_data.get(0).get("pekerjaan"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ProfileActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        requestQueue.add(stringRequest);
    }
}