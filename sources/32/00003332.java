package com.google.android.libraries.places.internal;

import android.content.Context;
import java.io.IOException;
import nh.c;
import nh.e;
import nh.f;
import ph.t;

/* loaded from: classes3.dex */
public final class zzgd {
    private final f zza;

    public zzgd(Context context) {
        t.f(context.getApplicationContext());
        this.zza = t.c().g("cct").b("LE", zzmn.class, new e() { // from class: com.google.android.libraries.places.internal.zzgc
            @Override // nh.e
            public final Object apply(Object obj) {
                zzmn zzmnVar = (zzmn) obj;
                try {
                    byte[] bArr = new byte[zzmnVar.zzv()];
                    zzael zzC = zzael.zzC(bArr);
                    zzmnVar.zzK(zzC);
                    zzC.zzD();
                    return bArr;
                } catch (IOException e11) {
                    String name = zzmnVar.getClass().getName();
                    throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e11);
                }
            }
        });
    }

    public final void zza(zzmn zzmnVar) {
        this.zza.a(c.d(zzmnVar));
    }
}