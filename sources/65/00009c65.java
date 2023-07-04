package org.spongycastle.crypto.modes.gcm;

/* loaded from: classes4.dex */
public class BasicGCMMultiplier implements GCMMultiplier {
    private int[] H;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.H = GCMUtil.asInts(bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] asInts = GCMUtil.asInts(bArr);
        GCMUtil.multiply(asInts, this.H);
        GCMUtil.asBytes(asInts, bArr);
    }
}