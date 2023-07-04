package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzob;
import com.stripe.android.networking.FraudDetectionData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzft implements zzgo {
    private static volatile zzft zzd;
    private zzea zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;
    @VisibleForTesting
    protected Boolean zza;
    @VisibleForTesting
    protected Boolean zzb;
    @VisibleForTesting
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzaa zzj;
    private final zzaf zzk;
    private final zzey zzl;
    private final zzej zzm;
    private final zzfq zzn;
    private final zzkc zzo;
    private final zzky zzp;
    private final zzee zzq;
    private final Clock zzr;
    private final zzim zzs;
    private final zzhy zzt;
    private final zzd zzu;
    private final zzic zzv;
    private final String zzw;
    private zzec zzx;
    private zzjm zzy;
    private zzao zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    zzft(zzgw zzgwVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z11 = false;
        Preconditions.checkNotNull(zzgwVar);
        Context context = zzgwVar.zza;
        zzaa zzaaVar = new zzaa(context);
        this.zzj = zzaaVar;
        zzdt.zza = zzaaVar;
        this.zze = context;
        this.zzf = zzgwVar.zzb;
        this.zzg = zzgwVar.zzc;
        this.zzh = zzgwVar.zzd;
        this.zzi = zzgwVar.zzh;
        this.zzE = zzgwVar.zze;
        this.zzw = zzgwVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzgwVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhu.zze(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l11 = zzgwVar.zzi;
        if (l11 != null) {
            currentTimeMillis = l11.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zzc = currentTimeMillis;
        this.zzk = new zzaf(this);
        zzey zzeyVar = new zzey(this);
        zzeyVar.zzv();
        this.zzl = zzeyVar;
        zzej zzejVar = new zzej(this);
        zzejVar.zzv();
        this.zzm = zzejVar;
        zzky zzkyVar = new zzky(this);
        zzkyVar.zzv();
        this.zzp = zzkyVar;
        this.zzq = new zzee(new zzgv(zzgwVar, this));
        this.zzu = new zzd(this);
        zzim zzimVar = new zzim(this);
        zzimVar.zzb();
        this.zzs = zzimVar;
        zzhy zzhyVar = new zzhy(this);
        zzhyVar.zzb();
        this.zzt = zzhyVar;
        zzkc zzkcVar = new zzkc(this);
        zzkcVar.zzb();
        this.zzo = zzkcVar;
        zzic zzicVar = new zzic(this);
        zzicVar.zzv();
        this.zzv = zzicVar;
        zzfq zzfqVar = new zzfq(this);
        zzfqVar.zzv();
        this.zzn = zzfqVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzgwVar.zzg;
        z11 = (zzclVar2 == null || zzclVar2.zzb == 0) ? true : z11;
        if (context.getApplicationContext() instanceof Application) {
            zzhy zzq = zzq();
            if (zzq.zzs.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzs.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzhx(zzq, null);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    zzq.zzs.zzay().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzay().zzk().zza("Application context is not an Application");
        }
        zzfqVar.zzp(new zzfs(this, zzgwVar));
    }

    public static /* bridge */ /* synthetic */ void zzA(zzft zzftVar, zzgw zzgwVar) {
        zzftVar.zzaz().zzg();
        zzftVar.zzk.zzn();
        zzao zzaoVar = new zzao(zzftVar);
        zzaoVar.zzv();
        zzftVar.zzz = zzaoVar;
        zzea zzeaVar = new zzea(zzftVar, zzgwVar.zzf);
        zzeaVar.zzb();
        zzftVar.zzA = zzeaVar;
        zzec zzecVar = new zzec(zzftVar);
        zzecVar.zzb();
        zzftVar.zzx = zzecVar;
        zzjm zzjmVar = new zzjm(zzftVar);
        zzjmVar.zzb();
        zzftVar.zzy = zzjmVar;
        zzftVar.zzp.zzw();
        zzftVar.zzl.zzw();
        zzftVar.zzA.zzc();
        zzeh zzi = zzftVar.zzay().zzi();
        zzftVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 60000L);
        zzftVar.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzeaVar.zzl();
        if (TextUtils.isEmpty(zzftVar.zzf)) {
            if (zzftVar.zzv().zzad(zzl)) {
                zzftVar.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzeh zzi2 = zzftVar.zzay().zzi();
                String valueOf = String.valueOf(zzl);
                zzi2.zza(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        zzftVar.zzay().zzc().zza("Debug-level message logging enabled");
        if (zzftVar.zzG != zzftVar.zzH.get()) {
            zzftVar.zzay().zzd().zzc("Not all components initialized", Integer.valueOf(zzftVar.zzG), Integer.valueOf(zzftVar.zzH.get()));
        }
        zzftVar.zzB = true;
    }

    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgm zzgmVar) {
        if (zzgmVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar != null) {
            if (!zzfVar.zze()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void zzR(zzgn zzgnVar) {
        if (zzgnVar != null) {
            if (!zzgnVar.zzx()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgnVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzft zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l11) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzft.class) {
                if (zzd == null) {
                    zzd = new zzft(new zzgw(context, zzclVar, l11));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    public final /* synthetic */ void zzC(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i11 != 200 && i11 != 204) {
            if (i11 == 304) {
                i11 = 304;
            }
            zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        if (th2 == null) {
            zzm().zzm.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble(FraudDetectionData.KEY_TIMESTAMP, 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzay().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzky zzv = zzv();
                    zzft zzftVar = zzv.zzs;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzs.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzG("auto", "_cmp", bundle);
                        zzky zzv2 = zzv();
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = zzv2.zzs.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong(FraudDetectionData.KEY_TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                zzv2.zzs.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e11) {
                            zzv2.zzs.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", e11);
                            return;
                        }
                    }
                    zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e12) {
                    zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e12);
                    return;
                }
            }
            zzay().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaz().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (this.zzk.zzr() && !((Boolean) zzb.second).booleanValue() && !TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzic zzr = zzr();
            zzr.zzu();
            ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzs.zze.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                zzky zzv = zzv();
                zzh().zzs.zzk.zzh();
                URL zzD = zzv.zzD(60000L, zzl, (String) zzb.first, zzm().zzn.zza() - 1);
                if (zzD != null) {
                    zzic zzr2 = zzr();
                    zzfr zzfrVar = new zzfr(this);
                    zzr2.zzg();
                    zzr2.zzu();
                    Preconditions.checkNotNull(zzD);
                    Preconditions.checkNotNull(zzfrVar);
                    zzr2.zzs.zzaz().zzo(new zzib(zzr2, zzl, zzD, null, null, zzfrVar, null));
                    return;
                }
                return;
            }
            zzay().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    public final void zzF(boolean z11) {
        this.zzE = Boolean.valueOf(z11);
    }

    public final void zzG(boolean z11) {
        zzaz().zzg();
        this.zzF = z11;
    }

    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzah zzahVar;
        zzaz().zzg();
        zzah zzc = zzm().zzc();
        zzey zzm = zzm();
        zzft zzftVar = zzm.zzs;
        zzm.zzg();
        int i11 = 100;
        int i12 = zzm.zza().getInt("consent_source", 100);
        zzaf zzafVar = this.zzk;
        zzft zzftVar2 = zzafVar.zzs;
        Boolean zzk = zzafVar.zzk("google_analytics_default_allow_ad_storage");
        zzaf zzafVar2 = this.zzk;
        zzft zzftVar3 = zzafVar2.zzs;
        Boolean zzk2 = zzafVar2.zzk("google_analytics_default_allow_analytics_storage");
        if ((zzk != null || zzk2 != null) && zzm().zzl(-10)) {
            zzahVar = new zzah(zzk, zzk2);
            i11 = -10;
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (i12 == 0 || i12 == 30 || i12 == 10 || i12 == 30 || i12 == 30 || i12 == 40)) {
                zzq().zzS(zzah.zza, -10, this.zzc);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                zzahVar = zzah.zza(zzclVar.zzg);
                if (!zzahVar.equals(zzah.zza)) {
                    i11 = 30;
                }
            }
            zzahVar = null;
        }
        if (zzahVar != null) {
            zzq().zzS(zzahVar, i11, this.zzc);
            zzc = zzahVar;
        }
        zzq().zzW(zzc);
        if (zzm().zzc.zza() == 0) {
            zzay().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (!zzM()) {
            if (zzJ()) {
                if (!zzv().zzac("android.permission.INTERNET")) {
                    zzay().zzd().zza("App is missing INTERNET permission");
                }
                if (!zzv().zzac("android.permission.ACCESS_NETWORK_STATE")) {
                    zzay().zzd().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                    if (!zzky.zzai(this.zze)) {
                        zzay().zzd().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzky.zzaj(this.zze, false)) {
                        zzay().zzd().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzay().zzd().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzky zzv = zzv();
                String zzm2 = zzh().zzm();
                zzey zzm3 = zzm();
                zzm3.zzg();
                String string = zzm3.zza().getString("gmp_app_id", null);
                String zzk3 = zzh().zzk();
                zzey zzm4 = zzm();
                zzm4.zzg();
                if (zzv.zzam(zzm2, string, zzk3, zzm4.zza().getString("admob_app_id", null))) {
                    zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzey zzm5 = zzm();
                    zzm5.zzg();
                    Boolean zzd2 = zzm5.zzd();
                    SharedPreferences.Editor edit = zzm5.zza().edit();
                    edit.clear();
                    edit.apply();
                    if (zzd2 != null) {
                        zzm5.zzh(zzd2);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzey zzm6 = zzm();
                String zzm7 = zzh().zzm();
                zzm6.zzg();
                SharedPreferences.Editor edit2 = zzm6.zza().edit();
                edit2.putString("gmp_app_id", zzm7);
                edit2.apply();
                zzey zzm8 = zzm();
                String zzk4 = zzh().zzk();
                zzm8.zzg();
                SharedPreferences.Editor edit3 = zzm8.zza().edit();
                edit3.putString("admob_app_id", zzk4);
                edit3.apply();
            }
            if (!zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzO(zzm().zze.zza());
            zzob.zzc();
            if (this.zzk.zzs(null, zzdw.zzac)) {
                try {
                    zzv().zzs.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzo.zza())) {
                        zzay().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzo.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zzJ);
                }
                if (zzJ) {
                    zzq().zzy();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzr.zza());
            }
        }
        zzm().zzi.zza(true);
    }

    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        zzaz().zzg();
        return this.zzF;
    }

    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    public final boolean zzM() {
        if (this.zzB) {
            zzaz().zzg();
            Boolean bool = this.zzC;
            if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
                this.zzD = this.zzr.elapsedRealtime();
                boolean z11 = true;
                Boolean valueOf = Boolean.valueOf(zzv().zzac("android.permission.INTERNET") && zzv().zzac("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzky.zzai(this.zze) && zzky.zzaj(this.zze, false))));
                this.zzC = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzv().zzW(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                        z11 = false;
                    }
                    this.zzC = Boolean.valueOf(z11);
                }
            }
            return this.zzC.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaz().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool == null || !bool.booleanValue()) {
            zzaz().zzg();
            if (this.zzF) {
                Boolean zzd2 = zzm().zzd();
                if (zzd2 != null) {
                    return zzd2.booleanValue() ? 0 : 3;
                }
                zzaf zzafVar = this.zzk;
                zzaa zzaaVar = zzafVar.zzs.zzj;
                Boolean zzk = zzafVar.zzk("firebase_analytics_collection_enabled");
                if (zzk != null) {
                    return zzk.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.zza;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final Context zzau() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final Clock zzav() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final zzaa zzaw() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final zzej zzay() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final zzfq zzaz() {
        zzR(this.zzn);
        return this.zzn;
    }

    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzaf zzf() {
        return this.zzk;
    }

    public final zzao zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    public final zzea zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    public final zzec zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    public final zzee zzj() {
        return this.zzq;
    }

    public final zzej zzl() {
        zzej zzejVar = this.zzm;
        if (zzejVar == null || !zzejVar.zzx()) {
            return null;
        }
        return zzejVar;
    }

    public final zzey zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    public final zzfq zzo() {
        return this.zzn;
    }

    public final zzhy zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    public final zzic zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    public final zzim zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    public final zzjm zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    public final zzkc zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    public final zzky zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzg;
    }

    public final String zzy() {
        return this.zzh;
    }

    public final String zzz() {
        return this.zzw;
    }
}