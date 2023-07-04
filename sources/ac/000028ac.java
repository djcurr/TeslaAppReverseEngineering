package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import lm.c;
import lm.d;
import lm.e;
import mm.b;

/* loaded from: classes3.dex */
public final class zzcy implements b {
    public static final /* synthetic */ int zza = 0;
    private static final c zzb = new c() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzcx
        @Override // lm.c
        public final void encode(Object obj, Object obj2) {
            d dVar = (d) obj2;
            int i11 = zzcy.zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final c zze = zzb;

    @Override // mm.b
    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, c cVar) {
        this.zzc.put(cls, cVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzcz zza() {
        return new zzcz(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, e eVar) {
        this.zzd.put(cls, eVar);
        this.zzc.remove(cls);
        return this;
    }
}