package com.example.companymaps;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.companymaps.data.Data;
import com.example.companymaps.data.Library;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Converter.Factory;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(
   mv = {1, 7, 1},
   k = 1,
   d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"},
   d2 = {"Lcom/example/companymaps/MapsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "loadLibraries", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "showLibraries", "result", "Lcom/example/companymaps/data/Library;", "CompanyMaps.app.main"}
)
public final class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {
   private GoogleMap mMap;

   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      this.setContentView(1300000);
      Fragment var10000 = this.getSupportFragmentManager().findFragmentById(1000000);
      if (var10000 == null) {
         throw new NullPointerException("null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
      } else {
         SupportMapFragment mapFragment = (SupportMapFragment)var10000;
         mapFragment.getMapAsync((OnMapReadyCallback)this);
      }
   }

   public void onMapReady(@NotNull GoogleMap googleMap) {
      Intrinsics.checkNotNullParameter(googleMap, "googleMap");
      this.mMap = googleMap;
      this.loadLibraries();
   }

   public final void loadLibraries() {
      Retrofit retrofit = (new Builder()).baseUrl(SeoulSodokApi.Companion.getDOMAIN()).addConverterFactory((Factory)GsonConverterFactory.create()).build();
      SeoulOpenService service = (SeoulOpenService)retrofit.create(SeoulOpenService.class);
      service.getLibraries(SeoulSodokApi.Companion.getAPI_KEY()).enqueue((Callback)(new Callback() {
         public void onFailure(@NotNull Call call, @NotNull Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            Toast.makeText((Context)MapsActivity.this, (CharSequence)"데이터를 가져올 수 없습니다", 1).show();
         }

         public void onResponse(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            Library result = (Library)response.body();
            MapsActivity.this.showLibraries(result);
         }
      }));
   }

   public final void showLibraries(@Nullable Library result) {
      if (result != null) {
         int var4 = false;
         com.google.android.gms.maps.model.LatLngBounds.Builder latlngBounds = new com.google.android.gms.maps.model.LatLngBounds.Builder();
         Iterator var6 = result.getData().iterator();

         GoogleMap var10;
         while(var6.hasNext()) {
            Data library = (Data)var6.next();
            LatLng position = new LatLng(library.get위도(), library.get경도());
            MarkerOptions var10000 = (new MarkerOptions()).position(position).title(library.get사업장명()).snippet(library.get전화번호());
            Intrinsics.checkNotNullExpressionValue(var10000, "MarkerOptions().position…장명).snippet(library.전화번호)");
            MarkerOptions marker = var10000;
            var10 = this.mMap;
            if (var10 == null) {
               Intrinsics.throwUninitializedPropertyAccessException("mMap");
            }

            var10.addMarker(marker);
            latlngBounds.include(position);
         }

         LatLngBounds var11 = latlngBounds.build();
         Intrinsics.checkNotNullExpressionValue(var11, "latlngBounds.build()");
         LatLngBounds bounds = var11;
         int padding = 0;
         CameraUpdate var13 = CameraUpdateFactory.newLatLngBounds(bounds, padding);
         Intrinsics.checkNotNullExpressionValue(var13, "CameraUpdateFactory.newL…ngBounds(bounds, padding)");
         CameraUpdate camera = var13;
         var10 = this.mMap;
         if (var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMap");
         }

         var10.moveCamera(camera);
      }

   }
}
