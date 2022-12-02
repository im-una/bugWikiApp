package com.example.companymaps.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 7, 1},
   k = 1,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"},
   d2 = {"Lcom/example/companymaps/data/Field;", "", "name", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}
)
public final class Field {
   @NotNull
   private final String name;
   @NotNull
   private final String type;

   @NotNull
   public final String getName() {
      return this.name;
   }

   @NotNull
   public final String getType() {
      return this.type;
   }

   public Field(@NotNull String name, @NotNull String type) {
      Intrinsics.checkNotNullParameter(name, "name");
      Intrinsics.checkNotNullParameter(type, "type");
      super();
      this.name = name;
      this.type = type;
   }

   @NotNull
   public final String component1() {
      return this.name;
   }

   @NotNull
   public final String component2() {
      return this.type;
   }

   @NotNull
   public final Field copy(@NotNull String name, @NotNull String type) {
      Intrinsics.checkNotNullParameter(name, "name");
      Intrinsics.checkNotNullParameter(type, "type");
      return new Field(name, type);
   }

   // $FF: synthetic method
   public static Field copy$default(Field var0, String var1, String var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.name;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.type;
      }

      return var0.copy(var1, var2);
   }

   @NotNull
   public String toString() {
      return "Field(name=" + this.name + ", type=" + this.type + ")";
   }

   public int hashCode() {
      String var10000 = this.name;
      int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
      String var10001 = this.type;
      return var1 + (var10001 != null ? var10001.hashCode() : 0);
   }

   public boolean equals(@Nullable Object var1) {
      if (this != var1) {
         if (var1 instanceof Field) {
            Field var2 = (Field)var1;
            if (Intrinsics.areEqual(this.name, var2.name) && Intrinsics.areEqual(this.type, var2.type)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
