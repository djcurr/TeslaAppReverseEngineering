package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgw extends zzhb {
    private final CancellationTokenSource zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgw(CancellationTokenSource cancellationTokenSource, String str) {
        this.zza = cancellationTokenSource;
        Objects.requireNonNull(str, "Null query");
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhb) {
            zzhb zzhbVar = (zzhb) obj;
            if (this.zza.equals(zzhbVar.zza()) && this.zzb.equals(zzhbVar.zzb())) {
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
        return "AutocompleteRequest{source=" + obj + ", query=" + str + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzhe
    public final CancellationTokenSource zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzhb
    public final String zzb() {
        return this.zzb;
    }
}