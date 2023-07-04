package org.spongycastle.jcajce;

import javax.crypto.interfaces.PBEKey;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i11) {
        super(cArr);
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i11;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.iterationCount;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.salt;
    }

    public PKCS12KeyWithParameters(char[] cArr, boolean z11, byte[] bArr, int i11) {
        super(cArr, z11);
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i11;
    }
}