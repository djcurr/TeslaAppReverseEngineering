package org.spongycastle.pqc.crypto.newhope;

/* loaded from: classes4.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    Reduce() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short barrett(short s11) {
        int i11 = s11 & 65535;
        return (short) (i11 - (((i11 * 5) >>> 16) * 12289));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short montgomery(int i11) {
        return (short) (((((i11 * QInv) & RMask) * 12289) + i11) >>> 18);
    }
}