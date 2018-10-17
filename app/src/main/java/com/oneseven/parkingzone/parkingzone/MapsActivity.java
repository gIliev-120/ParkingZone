package com.oneseven.parkingzone.parkingzone;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Arrays;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private  static final List<LatLng> blueZonePolygon = Arrays.asList(
            new LatLng(42.698864, 23.315678),
            new LatLng(42.697698, 23.315319),
            new LatLng(42.697177, 23.315232),
            new LatLng(42.694747, 23.315223),
            new LatLng(42.689499, 23.313984),
            new LatLng(42.686194, 23.318098),
            new LatLng(42.685940, 23.321303),
            new LatLng(42.687777, 23.328588),
            new LatLng(42.692384, 23.334040),
            new LatLng(42.696327, 23.335199),
            new LatLng(42.696792, 23.335553),
            new LatLng(42.698716, 23.334652),
            new LatLng(42.697462, 23.323344),
            new LatLng(42.698400, 23.318366));

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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151); // currentLocation
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
