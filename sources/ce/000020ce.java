package com.google.android.gms.internal.clearcut;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzet {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(zzbb zzbbVar) {
        String str;
        zzeu zzeuVar = new zzeu(zzbbVar);
        StringBuilder sb2 = new StringBuilder(zzeuVar.size());
        for (int i11 = 0; i11 < zzeuVar.size(); i11++) {
            int zzj = zzeuVar.zzj(i11);
            if (zzj == 34) {
                str = "\\\"";
            } else if (zzj == 39) {
                str = "\\'";
            } else if (zzj != 92) {
                switch (zzj) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (zzj < 32 || zzj > 126) {
                            sb2.append(CoreConstants.ESCAPE_CHAR);
                            sb2.append((char) (((zzj >>> 6) & 3) + 48));
                            sb2.append((char) (((zzj >>> 3) & 7) + 48));
                            zzj = (zzj & 7) + 48;
                        }
                        sb2.append((char) zzj);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}