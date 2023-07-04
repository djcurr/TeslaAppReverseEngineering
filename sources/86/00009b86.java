package org.spongycastle.crypto.digests;

import ch.qos.logback.core.joran.action.ActionConst;
import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.Digest;

/* loaded from: classes4.dex */
public class NullDigest implements Digest {
    private ByteArrayOutputStream bOut = new ByteArrayOutputStream();

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        byte[] byteArray = this.bOut.toByteArray();
        System.arraycopy(byteArray, 0, bArr, i11, byteArray.length);
        reset();
        return byteArray.length;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return ActionConst.NULL;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.bOut.size();
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.bOut.reset();
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b11) {
        this.bOut.write(b11);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        this.bOut.write(bArr, i11, i12);
    }
}