// SeoulOpenService.java
package com.example.companymaps;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(
   mv = {1, 7, 1},
   k = 1,
   d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"},
   d2 = {"Lcom/example/companymaps/SeoulOpenService;", "", "getLibraries", "Lretrofit2/Call;", "Lcom/example/companymaps/data/Library;", "key", "", "CompanyMaps.app.main"}
)
public interface SeoulOpenService {
   @GET("{api_key}/companymap.json")
   @NotNull
   Call getLibraries(@Path("api_key") @NotNull String var1);
}
// SeoulSodokApi.java
package com.example.companymaps;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 7, 1},
   k = 1,
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"},
   d2 = {"Lcom/example/companymaps/SeoulSodokApi;", "", "()V", "Companion", "CompanyMaps.app.main"}
)
public final class SeoulSodokApi {
   @NotNull
   private static final String DOMAIN = "https://gist.githubusercontent.com/im-una/8663f448c83a0087132b68ac0b7e4373/raw/";
   @NotNull
   private static final String API_KEY = "dd7a12eafdb50447d53554e822b3f55b54a481e6";
   @NotNull
   public static final SeoulSodokApi.Companion Companion = new SeoulSodokApi.Companion((DefaultConstructorMarker)null);

   @Metadata(
      mv = {1, 7, 1},
      k = 1,
      d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"},
      d2 = {"Lcom/example/companymaps/SeoulSodokApi$Companion;", "", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "DOMAIN", "getDOMAIN", "CompanyMaps.app.main"}
   )
   public static final class Companion {
      @NotNull
      public final String getDOMAIN() {
         return SeoulSodokApi.DOMAIN;
      }

      @NotNull
      public final String getAPI_KEY() {
         return SeoulSodokApi.API_KEY;
      }

      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
