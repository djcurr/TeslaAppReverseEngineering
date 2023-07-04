package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzcl {
    private final String zza;
    private final int zzb;
    private final zzck zzc;
    private final boolean zzd;
    private final int zze;

    public zzcl(WifiInfo wifiInfo, ScanResult scanResult) {
        zzck zzckVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i11 = scanResult.level;
        int i12 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            zzckVar = zzck.OTHER;
        } else {
            String upperCase = str2.toUpperCase();
            if (!upperCase.equals("[ESS]") && !upperCase.equals("[IBSS]")) {
                if (upperCase.matches(".*WPA[0-9]*-PSK.*")) {
                    zzckVar = zzck.PSK;
                } else if (upperCase.matches(".*WPA[0-9]*-EAP.*")) {
                    zzckVar = zzck.EAP;
                } else {
                    zzckVar = zzck.OTHER;
                }
            } else {
                zzckVar = zzck.NONE;
            }
        }
        boolean z11 = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z11 = true;
        }
        this.zza = str;
        this.zzb = i11;
        this.zzc = zzckVar;
        this.zzd = z11;
        this.zze = i12;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzck zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzd;
    }
}