package com.google.android.gms.internal.vision;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzhf zzhfVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zza(zzhfVar, sb2, 0);
        return sb2.toString();
    }

    private static final String zzq(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e6, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e8, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f8, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0209, code lost:
        if (((java.lang.Float) r11).floatValue() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021b, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.vision.zzhf r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhi.zza(com.google.android.gms.internal.vision.zzhf, java.lang.StringBuilder, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zza(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb2, i11, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb2, i11, str, entry);
            }
        } else {
            sb2.append('\n');
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzik.zzd(zzeo.zzl((String) obj)));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zzeo) {
                sb2.append(": \"");
                sb2.append(zzik.zzd((zzeo) obj));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zzfy) {
                sb2.append(" {");
                zza((zzfy) obj, sb2, i11 + 2);
                sb2.append("\n");
                while (i12 < i11) {
                    sb2.append(' ');
                    i12++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i14 = i11 + 2;
                zza(sb2, i14, Action.KEY_ATTRIBUTE, entry2.getKey());
                zza(sb2, i14, "value", entry2.getValue());
                sb2.append("\n");
                while (i12 < i11) {
                    sb2.append(' ');
                    i12++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }
}