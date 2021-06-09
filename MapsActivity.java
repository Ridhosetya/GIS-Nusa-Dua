package com.example.gisnusadua;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String[] nama, alamat, jumlahkeluarga, pekerjaan;
    private Integer[] id;
    Boolean MarkerD[];
    int jumdata;
    private Double[] latitude, longitude;
    LatLng latLng[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
       // tampilpeta();
        // Add a marker in Sydney and move the camera
        LatLng okta = new LatLng(-8.803264634313038, 115.2164944140348);
         mMap.addMarker(new MarkerOptions().position(okta).title("Kadek Okta"));
         mMap.moveCamera(CameraUpdateFactory.newLatLng(okta));
        LatLng sura = new LatLng(-8.801150329907898, 115.21867730158483);
        mMap.addMarker(new MarkerOptions().position(sura).title("Ketut Sura"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sura));
        LatLng rudi = new LatLng(-8.800904799644039, 115.21824866813287);
        mMap.addMarker(new MarkerOptions().position(rudi).title("Wayan Rudi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rudi));
        LatLng yasa = new LatLng(-8.806339784847223, 115.2232086926937);
        mMap.addMarker(new MarkerOptions().position(yasa).title("Putu Yasa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yasa));
        LatLng badrul = new LatLng(-8.807472963081565, 115.22285463576323);
        mMap.addMarker(new MarkerOptions().position(badrul).title("Ketut Badrul"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(badrul));
        LatLng bontot = new LatLng(-8.804651472301957, 115.223280582385);
        mMap.addMarker(new MarkerOptions().position(bontot).title("Nyoman Bontot"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bontot));
        LatLng subagya = new LatLng(-8.80054889132585, 115.22374186252505);
        mMap.addMarker(new MarkerOptions().position(subagya).title("Putu Subagya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(subagya));
        LatLng wartana = new LatLng(-8.79977030959969, 115.22357599801502);
        mMap.addMarker(new MarkerOptions().position(wartana).title("Made Wartana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wartana));
        LatLng nurmantyo = new LatLng(-8.818687067168618, 115.2149869127919);
        mMap.addMarker(new MarkerOptions().position(nurmantyo).title("Ahmad Nurmantyo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nurmantyo));
        LatLng martina = new LatLng(-8.802236446034893, 115.23385411656214);
        mMap.addMarker(new MarkerOptions().position(martina).title("Kadek Martina"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(martina));
        LatLng paulus = new LatLng(-8.813414950876286, 115.22309629274707);
        mMap.addMarker(new MarkerOptions().position(paulus).title("Paulus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(paulus));
        LatLng dirga = new LatLng(-8.800235123758105, 115.22173164993005);
        mMap.addMarker(new MarkerOptions().position(dirga).title("Made Dirga"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dirga));
        LatLng pati = new LatLng(-8.799188562282941, 115.221223028369);
        mMap.addMarker(new MarkerOptions().position(pati).title("Nyoman Pati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pati));
        LatLng martinus = new LatLng(-8.79853539921696, 115.21977090652199);
        mMap.addMarker(new MarkerOptions().position(martinus).title("Martinus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(martinus));
        LatLng kakap = new LatLng(-8.798627258796978, 115.22494942340238);
        mMap.addMarker(new MarkerOptions().position(kakap).title("Made Kakap"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kakap));
    }

  /**  private void tampilpeta() {
        String Url = "http://192.168.43.20/peta/koneksi.php";
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, Url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                jumdata = response.length();
                Log.d("DEBUG", "Parse JSON");
                latLng = new LatLng[jumdata];
                MarkerD = new Boolean[jumdata];
                nama = new String[jumdata];
                alamat = new String[jumdata];
                jumlahkeluarga = new String[jumdata];
                pekerjaan = new String[jumdata];
                id = new Integer[jumdata];
                latitude = new Double[jumdata];
                longitude = new Double[jumdata];
                for (int i = 0; i < jumdata; i++) {
                    try {
                        JSONObject data = response.getJSONObject(i);
                        id[i] = data.getInt("id");
                        latLng[i] = new LatLng(data.getDouble("latitude"), data.getDouble("longitude"));
                        nama[i] = data.getString("nama");
                        alamat[i] = data.getString("alamat");
                        jumlahkeluarga[i] = data.getString("jumlahkeluarga");
                        pekerjaan[i] = data.getString("pekerjaan");
                        latitude[i] = data.getDouble("latitude");
                        longitude[i] = data.getDouble("longitude");
                        MarkerD[i] = false;
                        mMap.addMarker(new MarkerOptions()
                                .position(latLng[i])
                                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.icon))
                                .title(nama[i]));

                    } catch (JSONException e) {

                    }
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng[i], 15.5f));
                }
                mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(@NonNull Marker marker) {
                        for (int i=0; i<jumdata; i++){
                            if (marker.getTitle().equals(nama[i])){
                                if (MarkerD[i]){
                                    DetailActivity.nama=nama[i];
                                    DetailActivity.alamat=alamat[i];
                                    DetailActivity.jumlahkeluarga=jumlahkeluarga[i];
                                    DetailActivity.pekerjaan=pekerjaan[i];
                                    Intent pindahdetail = new Intent(MapsActivity.this, DetailActivity.class);
                                    startActivity(pindahdetail);
                                    MarkerD[i]=false;

                                }else{
                                    MarkerD[i]=true;
                                    marker.showInfoWindow();
                                    Toast pesan = Toast.makeText(MapsActivity.this, "Silahkan Klik untuk Melihat Detail Data", Toast.LENGTH_LONG);
                                    TextView tv = pesan.getView().findViewById(R.id.message);
                                    if (tv !=null)
                                        tv.setGravity(Gravity.CENTER);
                                    pesan.show();
                                }

                            }else{
                                MarkerD[i]=false;
                            }
                        }
                        return false;
                    }
                });
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MapsActivity.this);
                builder.setTitle("error");
                builder.setMessage("failed");
                builder.setPositiveButton("reload", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        tampilpeta();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }

        });
        Volley.newRequestQueue(this).add(request);

    }*/
}