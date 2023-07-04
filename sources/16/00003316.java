package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzfc {
    private static final zzjb zza;

    static {
        zzja zzjaVar = new zzja();
        zzjaVar.zza(zzck.NONE, "NONE");
        zzjaVar.zza(zzck.PSK, "WPA_PSK");
        zzjaVar.zza(zzck.EAP, "WPA_EAP");
        zzjaVar.zza(zzck.OTHER, "SECURED_NONE");
        zza = zzjaVar.zzb();
    }

    public static Integer zza(Location location) {
        if (location == null) {
            return null;
        }
        float accuracy = location.getAccuracy();
        if (!location.hasAccuracy() || accuracy <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return Integer.valueOf(Math.round(accuracy * 100.0f));
    }

    public static String zzb(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            String concat = TextUtils.isEmpty(str) ? null : "country:".concat(String.valueOf(str.toLowerCase(Locale.US)));
            if (concat != null) {
                if (sb2.length() != 0) {
                    sb2.append('|');
                }
                sb2.append(concat);
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public static String zzc(Location location) {
        if (location == null) {
            return null;
        }
        return zzh(location.getLatitude(), location.getLongitude());
    }

    public static String zzd(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzh(latLng.latitude, latLng.longitude);
    }

    public static String zze(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zzi((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String zzf(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zzi((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    public static String zzg(zziy zziyVar, int i11) {
        StringBuilder sb2 = new StringBuilder();
        int size = zziyVar.size();
        for (int i12 = 0; i12 < size; i12++) {
            zzcl zzclVar = (zzcl) zziyVar.get(i12);
            String str = sb2.length() > 0 ? "|" : "";
            zzja zzjaVar = new zzja();
            zzjaVar.zza("mac", zzclVar.zzd());
            zzjaVar.zza("strength_dbm", Integer.valueOf(zzclVar.zzb()));
            zzjaVar.zza("wifi_auth_type", zza.get(zzclVar.zzc()));
            zzjaVar.zza("is_connected", Boolean.valueOf(zzclVar.zze()));
            zzjaVar.zza("frequency_mhz", Integer.valueOf(zzclVar.zza()));
            zzjb zzb = zzjaVar.zzb();
            zzib zzc = zzib.zzc(",");
            Iterator<E> it2 = zzb.entrySet().iterator();
            StringBuilder sb3 = new StringBuilder();
            try {
                zzia.zza(sb3, it2, zzc, "=");
                String concat = str.concat(sb3.toString());
                if (sb2.length() + concat.length() > 4000) {
                    break;
                }
                sb2.append(concat);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
        return sb2.toString();
    }

    private static String zzh(double d11, double d12) {
        return String.format(Locale.US, "%.15f,%.15f", Double.valueOf(d11), Double.valueOf(d12));
    }

    private static String zzi(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d11 = southwest.latitude;
        double d12 = southwest.longitude;
        LatLng northeast = rectangularBounds.getNortheast();
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", Double.valueOf(d11), Double.valueOf(d12), Double.valueOf(northeast.latitude), Double.valueOf(northeast.longitude));
    }
}