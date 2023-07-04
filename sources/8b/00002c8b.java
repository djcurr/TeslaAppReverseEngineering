package com.google.android.gms.internal.vision;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzik {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(zzeo zzeoVar) {
        zzil zzilVar = new zzil(zzeoVar);
        StringBuilder sb2 = new StringBuilder(zzilVar.size());
        for (int i11 = 0; i11 < zzilVar.size(); i11++) {
            byte zzai = zzilVar.zzai(i11);
            if (zzai == 34) {
                sb2.append("\\\"");
            } else if (zzai == 39) {
                sb2.append("\\'");
            } else if (zzai != 92) {
                switch (zzai) {
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
                        if (zzai >= 32 && zzai <= 126) {
                            sb2.append((char) zzai);
                            continue;
                        } else {
                            sb2.append(CoreConstants.ESCAPE_CHAR);
                            sb2.append((char) (((zzai >>> 6) & 3) + 48));
                            sb2.append((char) (((zzai >>> 3) & 7) + 48));
                            sb2.append((char) ((zzai & 7) + 48));
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}