package com.squareup.moshi;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
final class i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i11, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.DOLLAR);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append(CoreConstants.DOT);
                if (strArr[i12] != null) {
                    sb2.append(strArr[i12]);
                }
            }
        }
        return sb2.toString();
    }
}