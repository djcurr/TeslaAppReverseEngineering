package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import nh.c;
import nh.e;
import nh.f;
import nh.g;
import ph.t;
import sm.b;

/* loaded from: classes3.dex */
public final class zzok implements zzob {
    private b zza;
    private final b zzb;
    private final zznt zzc;

    public zzok(Context context, zznt zzntVar) {
        this.zzc = zzntVar;
        a aVar = a.f12990g;
        t.f(context);
        final g h11 = t.c().h(aVar);
        if (aVar.a().contains(nh.b.b("json"))) {
            this.zza = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // sm.b
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // nh.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // sm.b
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // nh.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zznt zzntVar, zznr zznrVar) {
        int zza = zzntVar.zza();
        if (zznrVar.zza() != 0) {
            return c.d(zznrVar.zze(zza, false));
        }
        return c.e(zznrVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        if (this.zzc.zza() != 0) {
            ((f) this.zzb.get()).a(zzb(this.zzc, zznrVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((f) bVar.get()).a(zzb(this.zzc, zznrVar));
        }
    }
}