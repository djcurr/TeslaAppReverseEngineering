package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import nh.c;
import nh.e;
import nh.f;
import nh.g;
import ph.t;
import sm.b;

/* loaded from: classes3.dex */
public final class zzoy implements zzop {
    private b zza;
    private final b zzb;
    private final zzoh zzc;

    public zzoy(Context context, zzoh zzohVar) {
        this.zzc = zzohVar;
        a aVar = a.f12990g;
        t.f(context);
        final g h11 = t.c().h(aVar);
        if (aVar.a().contains(nh.b.b("json"))) {
            this.zza = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzov
                @Override // sm.b
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzox
                        @Override // nh.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzow
            @Override // sm.b
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzou
                    @Override // nh.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zzoh zzohVar, zzof zzofVar) {
        int zza = zzohVar.zza();
        if (zzofVar.zza() != 0) {
            return c.d(zzofVar.zze(zza, false));
        }
        return c.e(zzofVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzop
    public final void zza(zzof zzofVar) {
        if (this.zzc.zza() != 0) {
            ((f) this.zzb.get()).a(zzb(this.zzc, zzofVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((f) bVar.get()).a(zzb(this.zzc, zzofVar));
        }
    }
}