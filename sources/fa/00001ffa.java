package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import androidx.collection.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

@Deprecated
/* loaded from: classes3.dex */
public class InstanceID {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String ERROR_TIMEOUT = "TIMEOUT";
    private static final zzaj<Boolean> zzbu = zzai.zzy().zzd("gcm_check_for_different_iid_in_token", true);
    private static Map<String, InstanceID> zzbv = new a();
    private static final long zzbw = TimeUnit.DAYS.toMillis(7);
    private static zzak zzbx;
    private static zzaf zzby;
    private static String zzbz;
    private String zzca;
    private Context zzl;

    @ShowFirstParty
    private InstanceID(Context context, String str) {
        this.zzca = "";
        this.zzl = context.getApplicationContext();
        this.zzca = str;
    }

    @Deprecated
    public static InstanceID getInstance(Context context) {
        return getInstance(context, null);
    }

    private final KeyPair getKeyPair() {
        return zzbx.zzj(this.zzca).getKeyPair();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            String valueOf = String.valueOf(e11);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
            sb2.append("Never happens: can't find own package ");
            sb2.append(valueOf);
            Log.w("InstanceID", sb2.toString());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            String valueOf = String.valueOf(e11);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
            sb2.append("Never happens: can't find own package ");
            sb2.append(valueOf);
            Log.w("InstanceID", sb2.toString());
            return null;
        }
    }

    public static zzak zzp() {
        return zzbx;
    }

    @Deprecated
    public void deleteInstanceID() {
        zzd(Marker.ANY_MARKER, Marker.ANY_MARKER, null);
        zzo();
    }

    @Deprecated
    public void deleteToken(String str, String str2) {
        zzd(str, str2, null);
    }

    @Deprecated
    public long getCreationTime() {
        return zzbx.zzj(this.zzca).getCreationTime();
    }

    @Deprecated
    public String getId() {
        return zzd(getKeyPair());
    }

    @KeepForSdk
    public String getSubtype() {
        return this.zzca;
    }

    @Deprecated
    public String getToken(String str, String str2) {
        return getToken(str, str2, null);
    }

    public final String zze(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.zzca) ? str : this.zzca;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        String zzi = zzaf.zzi(zzby.zzd(bundle, getKeyPair()));
        if ("RST".equals(zzi) || zzi.startsWith("RST|")) {
            InstanceIDListenerService.zzd(this.zzl, zzbx);
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
        }
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzo() {
        zzbx.zzk(this.zzca);
    }

    @KeepForSdk
    public static synchronized InstanceID getInstance(Context context, Bundle bundle) {
        InstanceID instanceID;
        synchronized (InstanceID.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (zzbx == null) {
                String packageName = applicationContext.getPackageName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 73);
                sb2.append("Instance ID SDK is deprecated, ");
                sb2.append(packageName);
                sb2.append(" should update to use Firebase Instance ID");
                Log.w("InstanceID", sb2.toString());
                zzbx = new zzak(applicationContext);
                zzby = new zzaf(applicationContext);
            }
            zzbz = Integer.toString(zzg(applicationContext));
            instanceID = zzbv.get(string);
            if (instanceID == null) {
                instanceID = new InstanceID(applicationContext, string);
                zzbv.put(string, instanceID);
            }
        }
        return instanceID;
    }

    @Deprecated
    public String getToken(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String str3 = zzbx.get("appVersion");
            boolean z11 = true;
            if (str3 != null && str3.equals(zzbz)) {
                long zzg = zzbx.zzg(this.zzca, str, str2);
                if (zzg >= 0 && System.currentTimeMillis() - zzg < zzbw) {
                    z11 = false;
                }
            }
            String zzf = z11 ? null : zzbx.zzf(this.zzca, str, str2);
            if (zzf == null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String zze = zze(str, str2, bundle);
                if (zzbu.get().booleanValue() && zze.contains(":") && !zze.startsWith(String.valueOf(getId()).concat(":"))) {
                    InstanceIDListenerService.zzd(this.zzl, zzbx);
                    throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
                }
                if (zze != null) {
                    zzbx.zzd(this.zzca, str, str2, zze, zzbz);
                }
                return zze;
            }
            return zzf;
        }
        throw new IOException(ERROR_MAIN_THREAD);
    }

    @ShowFirstParty
    public final void zzd(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zzbx.zzh(this.zzca, str, str2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("sender", str);
            if (str2 != null) {
                bundle.putString("scope", str2);
            }
            bundle.putString("subscription", str);
            bundle.putString("delete", "1");
            bundle.putString("X-delete", "1");
            bundle.putString("subtype", "".equals(this.zzca) ? str : this.zzca);
            if (!"".equals(this.zzca)) {
                str = this.zzca;
            }
            bundle.putString("X-subtype", str);
            zzaf.zzi(zzby.zzd(bundle, getKeyPair()));
            return;
        }
        throw new IOException(ERROR_MAIN_THREAD);
    }
}