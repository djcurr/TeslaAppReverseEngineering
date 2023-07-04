package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import nh.c;
import nh.e;
import nh.f;
import nh.g;
import ph.t;
import sm.b;

/* loaded from: classes3.dex */
public final class zzmy implements zzmp {
    private b zza;
    private final b zzb;
    private final zzmj zzc;

    public zzmy(Context context, zzmj zzmjVar) {
        this.zzc = zzmjVar;
        a aVar = a.f12990g;
        t.f(context);
        final g h11 = t.c().h(aVar);
        if (aVar.a().contains(nh.b.b("json"))) {
            this.zza = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzmv
                @Override // sm.b
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("json"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzmx
                        @Override // nh.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new ul.t(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzmw
            @Override // sm.b
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, nh.b.b("proto"), new e() { // from class: com.google.android.gms.internal.mlkit_common.zzmu
                    @Override // nh.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c zzb(zzmj zzmjVar, zzmh zzmhVar) {
        return c.e(zzmhVar.zze(zzmjVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmp
    public final void zza(zzmh zzmhVar) {
        if (this.zzc.zza() != 0) {
            ((f) this.zzb.get()).a(zzb(this.zzc, zzmhVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((f) bVar.get()).a(zzb(this.zzc, zzmhVar));
        }
    }
}