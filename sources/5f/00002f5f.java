package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzim extends zzf {
    @VisibleForTesting
    protected zzif zza;
    private volatile zzif zzb;
    private volatile zzif zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzif zzg;
    private zzif zzh;
    private boolean zzi;
    private final Object zzj;
    private zzif zzk;
    private String zzl;

    public zzim(zzft zzftVar) {
        super(zzftVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(Activity activity, zzif zzifVar, boolean z11) {
        zzif zzifVar2;
        zzif zzifVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzifVar.zzb == null) {
            zzifVar2 = new zzif(zzifVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzifVar.zzc, zzifVar.zze, zzifVar.zzf);
        } else {
            zzifVar2 = zzifVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzifVar2;
        this.zzs.zzaz().zzp(new zzih(this, zzifVar2, zzifVar3, this.zzs.zzav().elapsedRealtime(), z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zzif zzifVar, zzif zzifVar2, long j11, boolean z11, Bundle bundle) {
        Bundle bundle2;
        long j12;
        long j13;
        zzg();
        boolean z12 = false;
        boolean z13 = (zzifVar2 != null && zzifVar2.zzc == zzifVar.zzc && zzky.zzak(zzifVar2.zzb, zzifVar.zzb) && zzky.zzak(zzifVar2.zza, zzifVar.zza)) ? false : true;
        if (z11 && this.zza != null) {
            z12 = true;
        }
        if (z13) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            zzky.zzJ(zzifVar, bundle3, true);
            if (zzifVar2 != null) {
                String str = zzifVar2.zza;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = zzifVar2.zzb;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", zzifVar2.zzc);
            }
            if (z12) {
                zzka zzkaVar = this.zzs.zzu().zzb;
                long j14 = j11 - zzkaVar.zzb;
                zzkaVar.zzb = j11;
                if (j14 > 0) {
                    this.zzs.zzv().zzH(bundle3, j14);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != zzifVar.zze ? "auto" : Stripe3ds2AuthParams.FIELD_APP;
            long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
            if (zzifVar.zze) {
                j12 = currentTimeMillis;
                long j15 = zzifVar.zzf;
                if (j15 != 0) {
                    j13 = j15;
                    this.zzs.zzq().zzH(str3, "_vs", j13, bundle3);
                }
            } else {
                j12 = currentTimeMillis;
            }
            j13 = j12;
            this.zzs.zzq().zzH(str3, "_vs", j13, bundle3);
        }
        if (z12) {
            zzC(this.zza, true, j11);
        }
        this.zza = zzifVar;
        if (zzifVar.zze) {
            this.zzh = zzifVar;
        }
        this.zzs.zzt().zzG(zzifVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzC(zzif zzifVar, boolean z11, long j11) {
        this.zzs.zzd().zzf(this.zzs.zzav().elapsedRealtime());
        if (!this.zzs.zzu().zzb.zzd(zzifVar != null && zzifVar.zzd, z11, j11) || zzifVar == null) {
            return;
        }
        zzifVar.zzd = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzp(zzim zzimVar, Bundle bundle, zzif zzifVar, zzif zzifVar2, long j11) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzimVar.zzB(zzifVar, zzifVar2, j11, true, zzimVar.zzs.zzv().zzy(null, "screen_view", bundle, null, false));
    }

    private final zzif zzz(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzif zzifVar = (zzif) this.zzd.get(activity);
        if (zzifVar == null) {
            zzif zzifVar2 = new zzif(null, zzl(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.zzd.put(activity, zzifVar2);
            zzifVar = zzifVar2;
        }
        return this.zzg != null ? this.zzg : zzifVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final zzif zzi() {
        return this.zzb;
    }

    public final zzif zzj(boolean z11) {
        zza();
        zzg();
        if (z11) {
            zzif zzifVar = this.zza;
            return zzifVar != null ? zzifVar : this.zzh;
        }
        return this.zza;
    }

    @VisibleForTesting
    final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 > 100) {
            this.zzs.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzif(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzij(this, elapsedRealtime));
            return;
        }
        zzif zzz = zzz(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzs.zzaz().zzp(new zzik(this, zzz, elapsedRealtime));
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.zzg = null;
                    this.zzs.zzaz().zzp(new zzil(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzs.zzaz().zzp(new zzii(this));
            return;
        }
        zzA(activity, zzz(activity), false);
        zzd zzd = this.zzs.zzd();
        zzd.zzs.zzaz().zzp(new zzc(zzd, zzd.zzs.zzav().elapsedRealtime()));
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zzif zzifVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zzifVar = (zzif) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzifVar.zzc);
        bundle2.putString("name", zzifVar.zza);
        bundle2.putString("referrer_name", zzifVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzw(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzft r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            boolean r0 = r0.zzu()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzft r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.zza(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.zzif r0 = r3.zzb
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzft r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.zza(r5)
            return
        L30:
            java.util.Map r1 = r3.zzd
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.zzft r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.zza(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.zzl(r6, r1)
        L54:
            java.lang.String r1 = r0.zzb
            boolean r1 = com.google.android.gms.measurement.internal.zzky.zzak(r1, r6)
            java.lang.String r0 = r0.zza
            boolean r0 = com.google.android.gms.measurement.internal.zzky.zzak(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.zzft r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.zza(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.zzft r1 = r3.zzs
            r1.zzf()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.zzft r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzl()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.zzft r1 = r3.zzs
            r1.zzf()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.zzft r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzl()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.zzft r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzej r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzeh r0 = r0.zzj()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.zzc(r2, r1, r6)
            com.google.android.gms.measurement.internal.zzif r0 = new com.google.android.gms.measurement.internal.zzif
            com.google.android.gms.measurement.internal.zzft r1 = r3.zzs
            com.google.android.gms.measurement.internal.zzky r1 = r1.zzv()
            long r1 = r1.zzq()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.zzd
            r5.put(r4, r0)
            r5 = 1
            r3.zzA(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzim.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzim.zzx(android.os.Bundle, long):void");
    }

    public final void zzy(String str, zzif zzifVar) {
        zzg();
        synchronized (this) {
            String str2 = this.zzl;
            if (str2 == null || str2.equals(str) || zzifVar != null) {
                this.zzl = str;
                this.zzk = zzifVar;
            }
        }
    }
}