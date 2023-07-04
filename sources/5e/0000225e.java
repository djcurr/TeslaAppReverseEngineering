package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzc {
    final zzf zza;
    zzg zzb;
    final zzab zzc;
    private final zzz zzd;

    public zzc() {
        zzf zzfVar = new zzf();
        this.zza = zzfVar;
        this.zzb = zzfVar.zzb.zza();
        this.zzc = new zzab();
        this.zzd = new zzz();
        zzfVar.zzd.zza("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            {
                zzc.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzc.this.zzb();
            }
        });
        zzfVar.zzd.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(zzc.this.zzc);
            }
        });
    }

    public final zzab zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzai zzb() {
        return new zzv(this.zzd);
    }

    public final void zzc(zzgo zzgoVar) {
        zzai zzaiVar;
        try {
            this.zzb = this.zza.zzb.zza();
            if (!(this.zza.zza(this.zzb, (zzgt[]) zzgoVar.zzc().toArray(new zzgt[0])) instanceof zzag)) {
                for (zzgm zzgmVar : zzgoVar.zza().zzd()) {
                    List zzc = zzgmVar.zzc();
                    String zzb = zzgmVar.zzb();
                    Iterator it2 = zzc.iterator();
                    while (it2.hasNext()) {
                        zzap zza = this.zza.zza(this.zzb, (zzgt) it2.next());
                        if (zza instanceof zzam) {
                            zzg zzgVar = this.zzb;
                            if (zzgVar.zzh(zzb)) {
                                zzap zzd = zzgVar.zzd(zzb);
                                if (!(zzd instanceof zzai)) {
                                    String valueOf = String.valueOf(zzb);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                }
                                zzaiVar = (zzai) zzd;
                            } else {
                                zzaiVar = null;
                            }
                            if (zzaiVar == null) {
                                String valueOf2 = String.valueOf(zzb);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                            }
                            zzaiVar.zza(this.zzb, Collections.singletonList(zza));
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final void zzd(String str, Callable callable) {
        this.zza.zzd.zza(str, callable);
    }

    public final boolean zze(zzaa zzaaVar) {
        try {
            this.zzc.zzd(zzaaVar);
            this.zza.zzc.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.zzd.zzb(this.zzb.zza(), this.zzc);
            if (zzg()) {
                return true;
            }
            return zzf();
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final boolean zzf() {
        return !this.zzc.zzc().isEmpty();
    }

    public final boolean zzg() {
        zzab zzabVar = this.zzc;
        return !zzabVar.zzb().equals(zzabVar.zza());
    }
}