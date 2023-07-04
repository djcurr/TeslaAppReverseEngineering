package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgp;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzie;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sl.a;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f16443a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b  reason: collision with root package name */
    private static final List f16444b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final List f16445c = Arrays.asList("auto", Stripe3ds2AuthParams.FIELD_APP, "am");

    /* renamed from: d  reason: collision with root package name */
    private static final List f16446d = Arrays.asList("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final List f16447e = Arrays.asList((String[]) ArrayUtils.concat(zzgs.zza, zzgs.zzb));

    /* renamed from: f  reason: collision with root package name */
    private static final List f16448f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f50446a;
        if (str != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        }
        String str2 = cVar.f50447b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f50448c;
        if (obj != null) {
            zzgp.zzb(bundle, obj);
        }
        String str3 = cVar.f50449d;
        if (str3 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f50450e);
        String str4 = cVar.f50451f;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str4);
        }
        Bundle bundle2 = cVar.f50452g;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str5 = cVar.f50453h;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str5);
        }
        Bundle bundle3 = cVar.f50454i;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f50455j);
        String str6 = cVar.f50456k;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str6);
        }
        Bundle bundle4 = cVar.f50457l;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f50458m);
        bundle.putBoolean("active", cVar.f50459n);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f50460o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        a.c cVar = new a.c();
        cVar.f50446a = (String) Preconditions.checkNotNull((String) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
        cVar.f50447b = (String) Preconditions.checkNotNull((String) zzgp.zza(bundle, "name", String.class, null));
        cVar.f50448c = zzgp.zza(bundle, "value", Object.class, null);
        cVar.f50449d = (String) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        cVar.f50450e = ((Long) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
        cVar.f50451f = (String) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        cVar.f50452g = (Bundle) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        cVar.f50453h = (String) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        cVar.f50454i = (Bundle) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        cVar.f50455j = ((Long) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
        cVar.f50456k = (String) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        cVar.f50457l = (Bundle) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        cVar.f50459n = ((Boolean) zzgp.zza(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f50458m = ((Long) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
        cVar.f50460o = ((Long) zzgp.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String zza = zzgq.zza(str);
        return zza != null ? zza : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        char c11;
        if ("_cmp".equals(str2)) {
            if (i(str) && bundle != null) {
                for (String str3 : f16446d) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                        c11 = 0;
                    }
                    c11 = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                        c11 = 2;
                    }
                    c11 = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c11 = 1;
                    }
                    c11 = 65535;
                }
                if (c11 == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c11 == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c11 != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f50446a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f50448c;
        if ((obj == null || zzie.zza(obj) != null) && i(str) && j(str, cVar.f50447b)) {
            String str2 = cVar.f50456k;
            if (str2 == null || (g(str2, cVar.f50457l) && e(str, cVar.f50456k, cVar.f50457l))) {
                String str3 = cVar.f50453h;
                if (str3 == null || (g(str3, cVar.f50454i) && e(str, cVar.f50453h, cVar.f50454i))) {
                    String str4 = cVar.f50451f;
                    if (str4 != null) {
                        return g(str4, cVar.f50452g) && e(str, cVar.f50451f, cVar.f50452g);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean g(String str, Bundle bundle) {
        if (f16444b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f16446d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean h(String str) {
        return !f16443a.contains(str);
    }

    public static boolean i(String str) {
        return !f16445c.contains(str);
    }

    public static boolean j(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        } else if (f16447e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f16448f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}