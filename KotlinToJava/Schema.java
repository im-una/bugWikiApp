package com.example.companymaps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 7, 1},
   k = 1,
   d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"},
   d2 = {"Lcom/example/companymaps/data/Schema;", "", "fields", "", "Lcom/example/companymaps/data/Field;", "pandas_version", "", "primaryKey", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getFields", "()Ljava/util/List;", "getPandas_version", "()Ljava/lang/String;", "getPrimaryKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}
)
public final class Schema {
   @NotNull
   private final List fields;
   @NotNull
   private final String pandas_version;
   @NotNull
   private final List primaryKey;

   @NotNull
   public final List getFields() {
      return this.fields;
   }

   @NotNull
   public final String getPandas_version() {
      return this.pandas_version;
   }

   @NotNull
   public final List getPrimaryKey() {
      return this.primaryKey;
   }

   public Schema(@NotNull List fields, @NotNull String pandas_version, @NotNull List primaryKey) {
      Intrinsics.checkNotNullParameter(fields, "fields");
      Intrinsics.checkNotNullParameter(pandas_version, "pandas_version");
      Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
      super();
      this.fields = fields;
      this.pandas_version = pandas_version;
      this.primaryKey = primaryKey;
   }

   @NotNull
   public final List component1() {
      return this.fields;
   }

   @NotNull
   public final String component2() {
      return this.pandas_version;
   }

   @NotNull
   public final List component3() {
      return this.primaryKey;
   }

   @NotNull
   public final Schema copy(@NotNull List fields, @NotNull String pandas_version, @NotNull List primaryKey) {
      Intrinsics.checkNotNullParameter(fields, "fields");
      Intrinsics.checkNotNullParameter(pandas_version, "pandas_version");
      Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
      return new Schema(fields, pandas_version, primaryKey);
   }

   // $FF: synthetic method
   public static Schema copy$default(Schema var0, List var1, String var2, List var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.fields;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.pandas_version;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.primaryKey;
      }

      return var0.copy(var1, var2, var3);
   }

   @NotNull
   public String toString() {
      return "Schema(fields=" + this.fields + ", pandas_version=" + this.pandas_version + ", primaryKey=" + this.primaryKey + ")";
   }

   public int hashCode() {
      List var10000 = this.fields;
      int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
      String var10001 = this.pandas_version;
      var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
      List var2 = this.primaryKey;
      return var1 + (var2 != null ? var2.hashCode() : 0);
   }

   public boolean equals(@Nullable Object var1) {
      if (this != var1) {
         if (var1 instanceof Schema) {
            Schema var2 = (Schema)var1;
            if (Intrinsics.areEqual(this.fields, var2.fields) && Intrinsics.areEqual(this.pandas_version, var2.pandas_version) && Intrinsics.areEqual(this.primaryKey, var2.primaryKey)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
