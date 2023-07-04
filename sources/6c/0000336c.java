package com.google.android.libraries.places.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzih extends zzij {
    final /* synthetic */ zzii zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzih(zzii zziiVar, zzik zzikVar, CharSequence charSequence) {
        super(zzikVar, "2.7.0");
        this.zza = zziiVar;
    }

    @Override // com.google.android.libraries.places.internal.zzij
    final int zzc(int i11) {
        return i11 + 1;
    }

    @Override // com.google.android.libraries.places.internal.zzij
    final int zzd(int i11) {
        int length = "2.7.0".length();
        zzig.zzb(i11, length, "index");
        while (i11 < length) {
            if ("2.7.0".charAt(i11) == '.') {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}