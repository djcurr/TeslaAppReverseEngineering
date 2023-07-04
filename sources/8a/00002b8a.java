package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import nh.c;
import nh.e;
import nh.f;
import nh.g;
import ph.t;
import sm.b;

/* loaded from: classes3.dex */
public final class zzoo implements zzof {
    private b zza;
    private final b zzb;
    private final zznx zzc;

    public zzoo(Context context, zznx zznxVar) {
        this.zzc = zznxVar;
        a aVar = a.f12990g;
        t.f(context);
        final g h11 = t.c().h(aVar);
        if (aVar.a().contains(nh.b.b("json"))) {
            this.zza = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzol
                @Override // sm.b
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzon
                        @Override // nh.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzom
            @Override // sm.b
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzok
                    @Override // nh.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zznx zznxVar, zznv zznvVar) {
        int zza = zznxVar.zza();
        if (zznvVar.zza() != 0) {
            return c.d(zznvVar.zze(zza, false));
        }
        return c.e(zznvVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzof
    public final void zza(zznv zznvVar) {
        if (this.zzc.zza() != 0) {
            ((f) this.zzb.get()).a(zzb(this.zzc, zznvVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((f) bVar.get()).a(zzb(this.zzc, zznvVar));
        }
    }
}