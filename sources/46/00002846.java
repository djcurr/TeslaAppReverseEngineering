package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import nh.c;
import nh.e;
import nh.f;
import nh.g;
import ph.t;
import sm.b;

/* loaded from: classes3.dex */
public final class zzlf implements zzky {
    private b zza;
    private final b zzb;
    private final zzkt zzc;

    public zzlf(Context context, zzkt zzktVar) {
        this.zzc = zzktVar;
        a aVar = a.f12990g;
        t.f(context);
        final g h11 = t.c().h(aVar);
        if (aVar.a().contains(nh.b.b("json"))) {
            this.zza = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzlc
                @Override // sm.b
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzle
                        @Override // nh.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzld
            @Override // sm.b
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzlb
                    @Override // nh.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zzkt zzktVar, zzkr zzkrVar) {
        return c.e(zzkrVar.zzd(zzktVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzky
    public final void zza(zzkr zzkrVar) {
        if (this.zzc.zza() != 0) {
            ((f) this.zzb.get()).a(zzb(this.zzc, zzkrVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((f) bVar.get()).a(zzb(this.zzc, zzkrVar));
        }
    }
}