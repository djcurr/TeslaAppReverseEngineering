package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class zzah {
    public static final zzah zza = new zzah(null, null);
    private final EnumMap zzb;

    public zzah(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzag.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzag.AD_STORAGE, (zzag) bool);
        enumMap.put((EnumMap) zzag.ANALYTICS_STORAGE, (zzag) bool2);
    }

    public static zzah zza(Bundle bundle) {
        zzag[] values;
        if (bundle == null) {
            return zza;
        }
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzagVar : zzag.values()) {
            enumMap.put((EnumMap) zzagVar, (zzag) zzm(bundle.getString(zzagVar.zzd)));
        }
        return new zzah(enumMap);
    }

    public static zzah zzb(String str) {
        EnumMap enumMap = new EnumMap(zzag.class);
        if (str != null) {
            int i11 = 0;
            while (true) {
                zzag[] zzagVarArr = zzag.zzc;
                int length = zzagVarArr.length;
                if (i11 >= 2) {
                    break;
                }
                zzag zzagVar = zzagVarArr[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    char charAt = str.charAt(i12);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) zzagVar, (zzag) bool);
                }
                i11++;
            }
        }
        return new zzah(enumMap);
    }

    public static String zzg(Bundle bundle) {
        zzag[] values;
        String string;
        for (zzag zzagVar : zzag.values()) {
            if (bundle.containsKey(zzagVar.zzd) && (string = bundle.getString(zzagVar.zzd)) != null && zzm(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzj(int i11, int i12) {
        return i11 <= i12;
    }

    static final int zzl(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzm(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(PermissionsResponse.GRANTED_KEY)) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        zzag[] values;
        if (obj instanceof zzah) {
            zzah zzahVar = (zzah) obj;
            for (zzag zzagVar : zzag.values()) {
                if (zzl((Boolean) this.zzb.get(zzagVar)) != zzl((Boolean) zzahVar.zzb.get(zzagVar))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = 17;
        for (Boolean bool : this.zzb.values()) {
            i11 = (i11 * 31) + zzl(bool);
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: ");
        zzag[] values = zzag.values();
        int length = values.length;
        for (int i11 = 0; i11 < length; i11++) {
            zzag zzagVar = values[i11];
            if (i11 != 0) {
                sb2.append(", ");
            }
            sb2.append(zzagVar.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.zzb.get(zzagVar);
            if (!this.zzb.containsKey(zzagVar) && bool != null) {
                sb2.append(true != bool.booleanValue() ? "denied" : PermissionsResponse.GRANTED_KEY);
            } else {
                sb2.append("uninitialized");
            }
        }
        return sb2.toString();
    }

    public final zzah zzc(zzah zzahVar) {
        zzag[] values;
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzagVar : zzag.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzagVar);
            Boolean bool2 = (Boolean) zzahVar.zzb.get(zzagVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) zzagVar, (zzag) bool);
        }
        return new zzah(enumMap);
    }

    public final zzah zzd(zzah zzahVar) {
        zzag[] values;
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzagVar : zzag.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzagVar);
            if (bool == null) {
                bool = (Boolean) zzahVar.zzb.get(zzagVar);
            }
            enumMap.put((EnumMap) zzagVar, (zzag) bool);
        }
        return new zzah(enumMap);
    }

    public final Boolean zze() {
        return (Boolean) this.zzb.get(zzag.AD_STORAGE);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzag.ANALYTICS_STORAGE);
    }

    public final String zzh() {
        char c11;
        StringBuilder sb2 = new StringBuilder("G1");
        zzag[] zzagVarArr = zzag.zzc;
        int length = zzagVarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            Boolean bool = (Boolean) this.zzb.get(zzagVarArr[i11]);
            if (bool == null) {
                c11 = CoreConstants.DASH_CHAR;
            } else {
                c11 = bool.booleanValue() ? '1' : '0';
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public final boolean zzi(zzag zzagVar) {
        Boolean bool = (Boolean) this.zzb.get(zzagVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzk(zzah zzahVar) {
        zzag[] zzagVarArr;
        for (zzag zzagVar : (zzag[]) this.zzb.keySet().toArray(new zzag[0])) {
            Boolean bool = (Boolean) this.zzb.get(zzagVar);
            Boolean bool2 = (Boolean) zzahVar.zzb.get(zzagVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzah(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzag.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
    }
}