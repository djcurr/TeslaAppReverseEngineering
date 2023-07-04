package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzjm extends zzf {
    private final zzjl zza;
    private zzdz zzb;
    private volatile Boolean zzc;
    private final zzan zzd;
    private final zzkd zze;
    private final List zzf;
    private final zzan zzg;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjm(zzft zzftVar) {
        super(zzftVar);
        this.zzf = new ArrayList();
        this.zze = new zzkd(zzftVar.zzav());
        this.zza = new zzjl(this);
        this.zzd = new zziw(this, zzftVar);
        this.zzg = new zziy(this, zzftVar);
    }

    private final zzp zzO(boolean z11) {
        Pair zza;
        this.zzs.zzaw();
        zzea zzh = this.zzs.zzh();
        String str = null;
        if (z11) {
            zzej zzay = this.zzs.zzay();
            if (zzay.zzs.zzm().zzb != null && (zza = zzay.zzs.zzm().zzb.zza()) != null && zza != zzey.zza) {
                String valueOf = String.valueOf(zza.second);
                String str2 = (String) zza.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable runnable : this.zzf) {
            try {
                runnable.run();
            } catch (RuntimeException e11) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e11);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzan zzanVar = this.zzd;
        this.zzs.zzf();
        zzanVar.zzd(((Long) zzdw.zzI.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzs.zzf();
        if (size >= 1000) {
            this.zzs.zzay().zzd().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzs.zzaw();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzjm zzjmVar, ComponentName componentName) {
        zzjmVar.zzg();
        if (zzjmVar.zzb != null) {
            zzjmVar.zzb = null;
            zzjmVar.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjmVar.zzg();
            zzjmVar.zzr();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzA(zzau zzauVar, String str) {
        Preconditions.checkNotNull(zzauVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjb(this, true, zzO(true), this.zzs.zzi().zzo(zzauVar), zzauVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzau zzauVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            this.zzs.zzay().zzk().zza("Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzR(zzcfVar, new byte[0]);
            return;
        }
        zzR(new zzix(this, zzauVar, str, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzC() {
        zzg();
        zza();
        zzp zzO = zzO(false);
        zzS();
        this.zzs.zzi().zzj();
        zzR(new zziq(this, zzO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzD(zzdz zzdzVar, AbstractSafeParcelable abstractSafeParcelable, zzp zzpVar) {
        int i11;
        zzg();
        zza();
        zzS();
        this.zzs.zzf();
        int i12 = 0;
        int i13 = 100;
        while (i12 < 1001 && i13 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzs.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i11 = zzi.size();
            } else {
                i11 = 0;
            }
            if (abstractSafeParcelable != null && i11 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i14);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        zzdzVar.zzk((zzau) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e11) {
                        this.zzs.zzay().zzd().zzb("Failed to send event to the service", e11);
                    }
                } else if (abstractSafeParcelable2 instanceof zzku) {
                    try {
                        zzdzVar.zzt((zzku) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e12) {
                        this.zzs.zzay().zzd().zzb("Failed to send user property to the service", e12);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        zzdzVar.zzn((zzab) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e13) {
                        this.zzs.zzay().zzd().zzb("Failed to send conditional user property to the service", e13);
                    }
                } else {
                    this.zzs.zzay().zzd().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i12++;
            i13 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzE(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zza();
        this.zzs.zzaw();
        zzR(new zzjc(this, true, zzO(true), this.zzs.zzi().zzn(zzabVar), new zzab(zzabVar), zzabVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzF(boolean z11) {
        zzg();
        zza();
        if (z11) {
            zzS();
            this.zzs.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzja(this, zzO(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzG(zzif zzifVar) {
        zzg();
        zza();
        zzR(new zziu(this, zzifVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zziv(this, zzO(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzI() {
        zzg();
        zza();
        zzR(new zziz(this, zzO(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final void zzJ(zzdz zzdzVar) {
        zzg();
        Preconditions.checkNotNull(zzdzVar);
        this.zzb = zzdzVar;
        zzQ();
        zzP();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzK(zzku zzkuVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzio(this, zzO(true), this.zzs.zzi().zzp(zzkuVar), zzkuVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzs.zzv().zzm() >= ((Integer) zzdw.zzai.zza(null)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzN() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjm.zzN():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzj() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzq() {
        zzg();
        zza();
        zzp zzO = zzO(true);
        this.zzs.zzi().zzk();
        zzR(new zzit(this, zzO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (!zzN()) {
            if (this.zzs.zzf().zzx()) {
                return;
            }
            this.zzs.zzaw();
            List<ResolveInfo> queryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context zzau = this.zzs.zzau();
                this.zzs.zzaw();
                intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zzb(intent);
                return;
            }
            this.zzs.zzay().zzd().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.zza.zzc();
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzis(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzir(this, atomicReference, zzO(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzje(this, str, str2, zzO(false), zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjd(this, atomicReference, null, str2, str3, zzO(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzx(AtomicReference atomicReference, boolean z11) {
        zzg();
        zza();
        zzR(new zzip(this, atomicReference, zzO(false), z11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z11) {
        zzg();
        zza();
        zzR(new zzin(this, str, str2, zzO(false), z11, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z11) {
        zzg();
        zza();
        zzR(new zzjf(this, atomicReference, null, str2, str3, zzO(false), z11));
    }
}