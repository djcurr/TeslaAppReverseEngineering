package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzmg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zziy zziyVar) {
        StringBuilder sb2 = new StringBuilder(zziyVar.zzd());
        for (int i11 = 0; i11 < zziyVar.zzd(); i11++) {
            byte zza = zziyVar.zza(i11);
            if (zza == 34) {
                sb2.append("\\\"");
            } else if (zza == 39) {
                sb2.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (zza >= 32 && zza <= 126) {
                            sb2.append((char) zza);
                            continue;
                        } else {
                            sb2.append(CoreConstants.ESCAPE_CHAR);
                            sb2.append((char) (((zza >>> 6) & 3) + 48));
                            sb2.append((char) (((zza >>> 3) & 7) + 48));
                            sb2.append((char) ((zza & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}