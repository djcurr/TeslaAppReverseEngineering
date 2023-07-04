package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgx extends zzhc {
    private final CancellationTokenSource zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgx(CancellationTokenSource cancellationTokenSource, String str) {
        this.zza = cancellationTokenSource;
        Objects.requireNonNull(str, "Null placeId");
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhc) {
            zzhc zzhcVar = (zzhc) obj;
            if (this.zza.equals(zzhcVar.zza()) && this.zzb.equals(zzhcVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        return "PlaceRequest{source=" + obj + ", placeId=" + str + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzhe
    public final CancellationTokenSource zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzhc
    public final String zzb() {
        return this.zzb;
    }
}