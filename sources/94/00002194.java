package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzv implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(zzx zzxVar, CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzh;
        zzh = this.zzb.zzh(this.zza);
        return zzh;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it2 = iterator();
        try {
            if (it2.hasNext()) {
                sb2.append(zzq.zza(it2.next(), ", "));
                while (it2.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(zzq.zza(it2.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}