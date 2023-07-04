package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* renamed from: x  reason: collision with root package name */
    private int[] f43566x;

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j11, byte[] bArr) {
        int[] oneAsInts = GCMUtil.oneAsInts();
        if (j11 > 0) {
            int[] clone = Arrays.clone(this.f43566x);
            do {
                if ((1 & j11) != 0) {
                    GCMUtil.multiply(oneAsInts, clone);
                }
                GCMUtil.multiply(clone, clone);
                j11 >>>= 1;
            } while (j11 > 0);
            GCMUtil.asBytes(oneAsInts, bArr);
        }
        GCMUtil.asBytes(oneAsInts, bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f43566x = GCMUtil.asInts(bArr);
    }
}