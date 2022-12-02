package com.example.companymaps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 7, 1},
   k = 1,
   d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"},
   d2 = {"Lcom/example/companymaps/data/Library;", "", "data", "", "Lcom/example/companymaps/data/Data;", "schema", "Lcom/example/companymaps/data/Schema;", "(Ljava/util/List;Lcom/example/companymaps/data/Schema;)V", "getData", "()Ljava/util/List;", "getSchema", "()Lcom/example/companymaps/data/Schema;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}
)
public final class Library {
   @NotNull
   private final List data;
   @NotNull
   private final Schema schema;

   @NotNull
   public final List getData() {
      return this.data;
   }

   @NotNull
   public final Schema getSchema() {
      return this.schema;
   }

   public Library(@NotNull List data, @NotNull Schema schema) {
      Intrinsics.checkNotNullParameter(data, "data");
      Intrinsics.checkNotNullParameter(schema, "schema");
      super();
      this.data = data;
      this.schema = schema;
   }

   @NotNull
   public final List component1() {
      return this.data;
   }

   @NotNull
   public final Schema component2() {
      return this.schema;
   }

   @NotNull
   public final Library copy(@NotNull List data, @NotNull Schema schema) {
      Intrinsics.checkNotNullParameter(data, "data");
      Intrinsics.checkNotNullParameter(schema, "schema");
      return new Library(data, schema);
   }

   // $FF: synthetic method
   public static Library copy$default(Library var0, List var1, Schema var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.data;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.schema;
      }

      return var0.copy(var1, var2);
   }

   @NotNull
   public String toString() {
      return "Library(data=" + this.data + ", schema=" + this.schema + ")";
   }

   public int hashCode() {
      List var10000 = this.data;
      int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
      Schema var10001 = this.schema;
      return var1 + (var10001 != null ? var10001.hashCode() : 0);
   }

   public boolean equals(@Nullable Object var1) {
      if (this != var1) {
         if (var1 instanceof Library) {
            Library var2 = (Library)var1;
            if (Intrinsics.areEqual(this.data, var2.data) && Intrinsics.areEqual(this.schema, var2.schema)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
