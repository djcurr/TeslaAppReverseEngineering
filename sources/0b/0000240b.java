package com.google.android.gms.internal.mlkit_common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import lm.c;

/* loaded from: classes3.dex */
public final class zzbq {
    private final Map zza;
    private final Map zzb;
    private final c zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(Map map, Map map2, c cVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = cVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbn(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}