package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzaw {
    final List zza = new ArrayList();

    public abstract zzap zza(String str, zzg zzgVar, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzap zzb(String str) {
        if (this.zza.contains(zzh.zze(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}