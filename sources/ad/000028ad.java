package com.google.android.gms.internal.mlkit_vision_face;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import lm.c;

/* loaded from: classes3.dex */
public final class zzcz {
    private final Map zza;
    private final Map zzb;
    private final c zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcz(Map map, Map map2, c cVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = cVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcw(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}