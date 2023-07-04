package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzhy extends zzf {
    @VisibleForTesting
    protected zzhx zza;
    final zzr zzb;
    @VisibleForTesting
    protected boolean zzc;
    private zzgt zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzah zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzkx zzn;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhy(zzft zzftVar) {
        super(zzftVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhm(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzah(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzr(zzftVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzab */
    public final void zzB(Bundle bundle, long j11) {
        if (TextUtils.isEmpty(this.zzs.zzh().zzm())) {
            zzR(bundle, 0, j11);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(Boolean bool, boolean z11) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z11) {
            zzey zzm = this.zzs.zzm();
            zzft zzftVar = zzm.zzs;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            zzad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad() {
        zzg();
        String zza = this.zzs.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzZ(Stripe3ds2AuthParams.FIELD_APP, "_npa", null, this.zzs.zzav().currentTimeMillis());
            } else {
                zzZ(Stripe3ds2AuthParams.FIELD_APP, "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), this.zzs.zzav().currentTimeMillis());
            }
        }
        if (this.zzs.zzJ() && this.zzc) {
            this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzy();
            zzok.zzc();
            if (this.zzs.zzf().zzs(null, zzdw.zzad)) {
                this.zzs.zzu().zza.zza();
            }
            this.zzs.zzaz().zzp(new zzhb(this));
            return;
        }
        this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
        this.zzs.zzt().zzI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzhy zzhyVar, zzah zzahVar, int i11, long j11, boolean z11, boolean z12) {
        zzhyVar.zzg();
        zzhyVar.zza();
        if (j11 <= zzhyVar.zzl && zzah.zzj(zzhyVar.zzm, i11)) {
            zzhyVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzahVar);
            return;
        }
        zzey zzm = zzhyVar.zzs.zzm();
        zzft zzftVar = zzm.zzs;
        zzm.zzg();
        if (zzm.zzl(i11)) {
            SharedPreferences.Editor edit = zzm.zza().edit();
            edit.putString("consent_settings", zzahVar.zzh());
            edit.putInt("consent_source", i11);
            edit.apply();
            zzhyVar.zzl = j11;
            zzhyVar.zzm = i11;
            zzhyVar.zzs.zzt().zzF(z11);
            if (z12) {
                zzhyVar.zzs.zzt().zzu(new AtomicReference());
                return;
            }
            return;
        }
        zzhyVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i11));
    }

    public final void zzA() {
        if (!(this.zzs.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzae(obj)) {
                    this.zzs.zzv().zzM(this.zzn, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzky.zzag(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzky zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.zzZ("param", str, 100, obj)) {
                    this.zzs.zzv().zzN(zza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc = this.zzs.zzf().zzc();
        if (zza.size() > zzc) {
            int i11 = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                i11++;
                if (i11 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzs.zzv().zzM(this.zzn, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(zza);
        this.zzs.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) {
        String str3 = str == null ? Stripe3ds2AuthParams.FIELD_APP : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzky.zzak(str2, "screen_view")) {
            this.zzs.zzs().zzx(bundle2, j11);
            return;
        }
        boolean z13 = true;
        if (z12 && this.zzd != null && !zzky.zzag(str2)) {
            z13 = false;
        }
        zzM(str3, str2, j11, bundle2, z12, z13, z11, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzft.zzO();
        zzM("auto", str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH(String str, String str2, long j11, Bundle bundle) {
        zzg();
        zzI(str, str2, j11, bundle, true, this.zzd == null || zzky.zzag(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzI(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        boolean z14;
        String str4;
        long j12;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (this.zzs.zzJ()) {
            List zzn = this.zzs.zzh().zzn();
            if (zzn != null && !zzn.contains(str2)) {
                this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.zzf) {
                this.zzf = true;
                try {
                    if (!this.zzs.zzN()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                    } catch (Exception e11) {
                        this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e11);
                    }
                } catch (ClassNotFoundException unused) {
                    this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.zzs.zzaw();
                zzZ("auto", "_lgclid", bundle.getString("gclid"), this.zzs.zzav().currentTimeMillis());
            }
            this.zzs.zzaw();
            if (z11 && zzky.zzal(str2)) {
                this.zzs.zzv().zzK(bundle, this.zzs.zzm().zzr.zza());
            }
            if (!z13) {
                this.zzs.zzaw();
                if (!"_iap".equals(str2)) {
                    zzky zzv = this.zzs.zzv();
                    int i11 = 2;
                    if (zzv.zzab("event", str2)) {
                        if (zzv.zzY("event", zzgq.zza, zzgq.zzb, str2)) {
                            zzv.zzs.zzf();
                            if (zzv.zzX("event", 40, str2)) {
                                i11 = 0;
                            }
                        } else {
                            i11 = 13;
                        }
                    }
                    if (i11 != 0) {
                        this.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                        zzky zzv2 = this.zzs.zzv();
                        this.zzs.zzf();
                        this.zzs.zzv().zzM(this.zzn, null, i11, "_ev", zzv2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            zzpi.zzc();
            if (this.zzs.zzf().zzs(null, zzdw.zzat)) {
                this.zzs.zzaw();
                zzif zzj = this.zzs.zzs().zzj(false);
                if (zzj != null && !bundle.containsKey("_sc")) {
                    zzj.zzd = true;
                }
                zzky.zzJ(zzj, bundle, z11 && !z13);
            } else {
                this.zzs.zzaw();
                zzif zzj2 = this.zzs.zzs().zzj(false);
                if (zzj2 != null && !bundle.containsKey("_sc")) {
                    zzj2.zzd = true;
                }
                zzky.zzJ(zzj2, bundle, z11 && !z13);
            }
            boolean equals = "am".equals(str);
            boolean zzag = zzky.zzag(str2);
            if (!z11 || this.zzd == null || zzag) {
                z14 = equals;
            } else if (!equals) {
                this.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j11);
                return;
            } else {
                z14 = true;
            }
            if (this.zzs.zzM()) {
                int zzh = this.zzs.zzv().zzh(str2);
                if (zzh != 0) {
                    this.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzky zzv3 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().zzM(this.zzn, str3, zzh, "_ev", zzv3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle zzy = this.zzs.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z13);
                Preconditions.checkNotNull(zzy);
                this.zzs.zzaw();
                if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                    zzka zzkaVar = this.zzs.zzu().zzb;
                    long elapsedRealtime = zzkaVar.zzc.zzs.zzav().elapsedRealtime();
                    long j13 = elapsedRealtime - zzkaVar.zzb;
                    zzkaVar.zzb = elapsedRealtime;
                    if (j13 > 0) {
                        this.zzs.zzv().zzH(zzy, j13);
                    }
                }
                zzob.zzc();
                if (this.zzs.zzf().zzs(null, zzdw.zzac)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        zzky zzv4 = this.zzs.zzv();
                        String string = zzy.getString("_ffr");
                        if (Strings.isEmptyOrWhitespace(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!zzky.zzak(string, zzv4.zzs.zzm().zzo.zza())) {
                            zzv4.zzs.zzm().zzo.zzb(string);
                        } else {
                            zzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String zza = this.zzs.zzv().zzs.zzm().zzo.zza();
                        if (!TextUtils.isEmpty(zza)) {
                            zzy.putString("_ffr", zza);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzy);
                if (this.zzs.zzm().zzj.zza() > 0 && this.zzs.zzm().zzk(j11) && this.zzs.zzm().zzl.zzb()) {
                    this.zzs.zzay().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j12 = 0;
                    zzZ("auto", "_sid", null, this.zzs.zzav().currentTimeMillis());
                    zzZ("auto", "_sno", null, this.zzs.zzav().currentTimeMillis());
                    zzZ("auto", "_se", null, this.zzs.zzav().currentTimeMillis());
                } else {
                    str4 = "_ae";
                    j12 = 0;
                }
                if (zzy.getLong("extend_session", j12) == 1) {
                    this.zzs.zzay().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.zzs.zzu().zza.zzb(j11, true);
                }
                ArrayList arrayList2 = new ArrayList(zzy.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str7 = (String) arrayList2.get(i12);
                    if (str7 != null) {
                        this.zzs.zzv();
                        Object obj = zzy.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            zzy.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i13);
                    if (i13 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z12) {
                        bundle2 = this.zzs.zzv().zzt(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.zzs.zzt().zzA(new zzau(str6, new zzas(bundle3), str, j11), str3);
                    if (!z14) {
                        for (zzgu zzguVar : this.zze) {
                            zzguVar.onEvent(str, str2, new Bundle(bundle3), j11);
                        }
                    }
                }
                this.zzs.zzaw();
                if (this.zzs.zzs().zzj(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.zzs.zzu().zzb.zzd(true, true, this.zzs.zzav().elapsedRealtime());
                return;
            }
            return;
        }
        this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
    }

    public final void zzJ(zzgu zzguVar) {
        zza();
        Preconditions.checkNotNull(zzguVar);
        if (this.zze.add(zzguVar)) {
            return;
        }
        this.zzs.zzay().zzk().zza("OnEventListener already registered");
    }

    public final void zzK(long j11) {
        this.zzg.set(null);
        this.zzs.zzaz().zzp(new zzhg(this, j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzL(long j11, boolean z11) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzkc zzu = this.zzs.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        boolean zzJ = this.zzs.zzJ();
        zzey zzm = this.zzs.zzm();
        zzm.zzc.zzb(j11);
        if (!TextUtils.isEmpty(zzm.zzs.zzm().zzo.zza())) {
            zzm.zzo.zzb(null);
        }
        zzok.zzc();
        zzaf zzf = zzm.zzs.zzf();
        zzdv zzdvVar = zzdw.zzad;
        if (zzf.zzs(null, zzdvVar)) {
            zzm.zzj.zzb(0L);
        }
        if (!zzm.zzs.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzp.zzb(null);
        zzm.zzq.zzb(0L);
        zzm.zzr.zzb(null);
        if (z11) {
            this.zzs.zzt().zzC();
        }
        zzok.zzc();
        if (this.zzs.zzf().zzs(null, zzdvVar)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzM(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new zzhd(this, str, str2, j11, bundle2, z11, z12, z13, str3));
    }

    final void zzN(String str, String str2, long j11, Object obj) {
        this.zzs.zzaz().zzp(new zzhe(this, str, str2, obj, j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j11) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID))) {
            this.zzs.zzay().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID);
        Preconditions.checkNotNull(bundle2);
        zzgp.zza(bundle2, PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, String.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgp.zza(bundle2, "name", String.class, null);
        zzgp.zza(bundle2, "value", Object.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgp.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j11);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzs.zzv().zzl(string) == 0) {
            if (this.zzs.zzv().zzd(string, obj) == 0) {
                Object zzB = this.zzs.zzv().zzB(string, obj);
                if (zzB == null) {
                    this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
                    return;
                }
                zzgp.zzb(bundle2, zzB);
                long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    this.zzs.zzf();
                    if (j12 > 15552000000L || j12 < 1) {
                        this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j12));
                        return;
                    }
                }
                long j13 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                this.zzs.zzf();
                if (j13 <= 15552000000L && j13 >= 1) {
                    this.zzs.zzaz().zzp(new zzhh(this, bundle2));
                    return;
                } else {
                    this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j13));
                    return;
                }
            }
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
    }

    public final void zzR(Bundle bundle, int i11, long j11) {
        zza();
        String zzg = zzah.zzg(bundle);
        if (zzg != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzah.zza(bundle), i11, j11);
    }

    public final void zzS(zzah zzahVar, int i11, long j11) {
        boolean z11;
        boolean z12;
        zzah zzahVar2;
        boolean z13;
        zza();
        if (i11 != -10 && zzahVar.zze() == null && zzahVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            z11 = true;
            z12 = false;
            if (zzah.zzj(i11, this.zzj)) {
                boolean zzk = zzahVar.zzk(this.zzi);
                zzag zzagVar = zzag.ANALYTICS_STORAGE;
                if (zzahVar.zzi(zzagVar) && !this.zzi.zzi(zzagVar)) {
                    z12 = true;
                }
                zzah zzd = zzahVar.zzd(this.zzi);
                this.zzi = zzd;
                this.zzj = i11;
                zzahVar2 = zzd;
                z13 = z12;
                z12 = zzk;
            } else {
                zzahVar2 = zzahVar;
                z13 = false;
                z11 = false;
            }
        }
        if (!z11) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzahVar2);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z12) {
            this.zzg.set(null);
            this.zzs.zzaz().zzq(new zzhs(this, zzahVar2, j11, i11, andIncrement, z13));
        } else if (i11 != 30 && i11 != -10) {
            this.zzs.zzaz().zzp(new zzhu(this, zzahVar2, i11, andIncrement, z13));
        } else {
            this.zzs.zzaz().zzq(new zzht(this, zzahVar2, i11, andIncrement, z13));
        }
    }

    public final void zzT(final Bundle bundle, final long j11) {
        zzoe.zzc();
        if (this.zzs.zzf().zzs(null, zzdw.zzal)) {
            this.zzs.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgz
                {
                    zzhy.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzhy.this.zzB(bundle, j11);
                }
            });
        } else {
            zzB(bundle, j11);
        }
    }

    public final void zzU(zzgt zzgtVar) {
        zzgt zzgtVar2;
        zzg();
        zza();
        if (zzgtVar != null && zzgtVar != (zzgtVar2 = this.zzd)) {
            Preconditions.checkState(zzgtVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgtVar;
    }

    public final void zzV(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new zzhr(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzW(zzah zzahVar) {
        zzg();
        boolean z11 = (zzahVar.zzi(zzag.ANALYTICS_STORAGE) && zzahVar.zzi(zzag.AD_STORAGE)) || this.zzs.zzt().zzM();
        if (z11 != this.zzs.zzK()) {
            this.zzs.zzG(z11);
            zzey zzm = this.zzs.zzm();
            zzft zzftVar = zzm.zzs;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z11 || valueOf == null || valueOf.booleanValue()) {
                zzac(Boolean.valueOf(z11), false);
            }
        }
    }

    public final void zzX(String str, String str2, Object obj, boolean z11) {
        zzY("auto", "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzY(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto La
            java.lang.String r1 = "app"
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L1e
            com.google.android.gms.measurement.internal.zzft r3 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r3 = r3.zzv()
            int r3 = r3.zzl(r2)
        L1c:
            r11 = r3
            goto L46
        L1e:
            com.google.android.gms.measurement.internal.zzft r7 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r7 = r7.zzv()
            java.lang.String r8 = "user property"
            boolean r9 = r7.zzab(r8, r2)
            if (r9 != 0) goto L2d
        L2c:
            goto L1c
        L2d:
            java.lang.String[] r9 = com.google.android.gms.measurement.internal.zzgs.zza
            r10 = 0
            boolean r9 = r7.zzY(r8, r9, r10, r2)
            if (r9 != 0) goto L39
            r3 = 15
            goto L1c
        L39:
            com.google.android.gms.measurement.internal.zzft r9 = r7.zzs
            r9.zzf()
            boolean r7 = r7.zzX(r8, r5, r2)
            if (r7 != 0) goto L45
            goto L2c
        L45:
            r11 = r4
        L46:
            r3 = 1
            if (r11 == 0) goto L6e
            com.google.android.gms.measurement.internal.zzft r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzft r1 = r6.zzs
            r1.zzf()
            java.lang.String r13 = r0.zzC(r2, r5, r3)
            if (r2 == 0) goto L5e
            int r4 = r17.length()
        L5e:
            r14 = r4
            com.google.android.gms.measurement.internal.zzft r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r8 = r0.zzv()
            com.google.android.gms.measurement.internal.zzkx r9 = r6.zzn
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.zzM(r9, r10, r11, r12, r13, r14)
            return
        L6e:
            if (r0 == 0) goto Lc0
            com.google.android.gms.measurement.internal.zzft r7 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r7 = r7.zzv()
            int r11 = r7.zzd(r2, r0)
            if (r11 == 0) goto Lab
            com.google.android.gms.measurement.internal.zzft r1 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzft r7 = r6.zzs
            r7.zzf()
            java.lang.String r13 = r1.zzC(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L93
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L9b
        L93:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L9b:
            r14 = r4
            com.google.android.gms.measurement.internal.zzft r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r8 = r0.zzv()
            com.google.android.gms.measurement.internal.zzkx r9 = r6.zzn
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.zzM(r9, r10, r11, r12, r13, r14)
            return
        Lab:
            com.google.android.gms.measurement.internal.zzft r3 = r6.zzs
            com.google.android.gms.measurement.internal.zzky r3 = r3.zzv()
            java.lang.Object r5 = r3.zzB(r2, r0)
            if (r5 == 0) goto Lbf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.zzN(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.zzN(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhy.zzY(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzZ(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzft r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzex r10 = r10.zzh
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.zzb(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            com.google.android.gms.measurement.internal.zzft r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzex r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            com.google.android.gms.measurement.internal.zzft r10 = r8.zzs
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L7e
            com.google.android.gms.measurement.internal.zzft r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzej r9 = r9.zzay()
            com.google.android.gms.measurement.internal.zzeh r9 = r9.zzj()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L7e:
            com.google.android.gms.measurement.internal.zzft r10 = r8.zzs
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L87
            return
        L87:
            com.google.android.gms.measurement.internal.zzku r10 = new com.google.android.gms.measurement.internal.zzku
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzft r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzjm r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhy.zzZ(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzaa(zzgu zzguVar) {
        zza();
        Preconditions.checkNotNull(zzguVar);
        if (this.zze.remove(zzguVar)) {
            return;
        }
        this.zzs.zzay().zzk().zza("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzhj(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzhq(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzhp(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzho(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzif zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzif zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzhn(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get conditional user properties", new zzhk(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzky.zzG(list);
    }

    public final List zzt(boolean z11) {
        zza();
        this.zzs.zzay().zzj().zza("Getting user properties (FE)");
        if (!this.zzs.zzaz().zzs()) {
            this.zzs.zzaw();
            if (zzaa.zza()) {
                this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhf(this, atomicReference, z11));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z11));
                return Collections.emptyList();
            }
            return list;
        }
        this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z11) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhl(this, atomicReference, null, str, str2, z11));
        List<zzku> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z11));
            return Collections.emptyMap();
        }
        a aVar = new a(list.size());
        for (zzku zzkuVar : list) {
            Object zza = zzkuVar.zza();
            if (zza != null) {
                aVar.put(zzkuVar.zzb, zza);
            }
        }
        return aVar;
    }

    public final void zzy() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzdw.zzX)) {
                zzaf zzf = this.zzs.zzf();
                zzf.zzs.zzaw();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzhy zzhyVar = zzhy.this;
                            zzhyVar.zzg();
                            if (!zzhyVar.zzs.zzm().zzm.zzb()) {
                                long zza = zzhyVar.zzs.zzm().zzn.zza();
                                zzhyVar.zzs.zzm().zzn.zzb(1 + zza);
                                zzhyVar.zzs.zzf();
                                if (zza >= 5) {
                                    zzhyVar.zzs.zzay().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    zzhyVar.zzs.zzm().zzm.zza(true);
                                    return;
                                }
                                zzhyVar.zzs.zzE();
                                return;
                            }
                            zzhyVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzey zzm = this.zzs.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new zzhi(this, bundle2));
    }
}