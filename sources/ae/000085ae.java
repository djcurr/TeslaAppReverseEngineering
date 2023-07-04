package m1;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class k {
    public static final int b(int[] iArr, int i11) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        int length = iArr.length - 1;
        int i12 = 0;
        while (i12 <= length) {
            int i13 = (i12 + length) >>> 1;
            int i14 = iArr[i13];
            if (i11 > i14) {
                i12 = i13 + 1;
            } else if (i11 >= i14) {
                return i13;
            } else {
                length = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(long j11) {
        int i11 = 32;
        if ((4294967295L & j11) == 0) {
            j11 >>= 32;
        } else {
            i11 = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j11) == 0) {
            i11 += 16;
            j11 >>= 16;
        }
        if ((255 & j11) == 0) {
            i11 += 8;
            j11 >>= 8;
        }
        if ((15 & j11) == 0) {
            i11 += 4;
            j11 >>= 4;
        }
        if ((1 & j11) != 0) {
            return i11;
        }
        if ((2 & j11) != 0) {
            return i11 + 1;
        }
        if ((4 & j11) != 0) {
            return i11 + 2;
        }
        if ((j11 & 8) != 0) {
            return i11 + 3;
        }
        return -1;
    }
}