package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzas implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i11 = this.zzb;
        str = this.zza.zza;
        return i11 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i11 = this.zzb;
        zzat zzatVar = this.zza;
        str = zzatVar.zza;
        if (i11 < str.length()) {
            str2 = zzatVar.zza;
            this.zzb = i11 + 1;
            return new zzat(String.valueOf(str2.charAt(i11)));
        }
        throw new NoSuchElementException();
    }
}