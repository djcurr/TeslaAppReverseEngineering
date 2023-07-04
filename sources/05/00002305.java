package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzie implements Serializable, zzib {
    final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzie) {
            Object obj2 = this.zza;
            Object obj3 = ((zzie) obj).zza;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final Object zza() {
        return this.zza;
    }
}