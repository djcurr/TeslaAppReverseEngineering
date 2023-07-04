package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* loaded from: classes3.dex */
public final class zzfb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str) {
        char c11;
        if (str == null) {
            return 13;
        }
        switch (str.hashCode()) {
            case -1698126997:
                if (str.equals("REQUEST_DENIED")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1125000185:
                if (str.equals("INVALID_REQUEST")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -813482689:
                if (str.equals("ZERO_RESULTS")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 2524:
                if (str.equals("OK")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 1023286998:
                if (str.equals("NOT_FOUND")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 1831775833:
                if (str.equals("OVER_QUERY_LIMIT")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1) {
            return 0;
        }
        if (c11 != 2) {
            if (c11 != 3) {
                if (c11 != 4) {
                    if (c11 != 5) {
                        return 13;
                    }
                    return PlacesStatusCodes.NOT_FOUND;
                }
                return PlacesStatusCodes.INVALID_REQUEST;
            }
            return PlacesStatusCodes.REQUEST_DENIED;
        }
        return PlacesStatusCodes.OVER_QUERY_LIMIT;
    }

    public static String zzb(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }
}