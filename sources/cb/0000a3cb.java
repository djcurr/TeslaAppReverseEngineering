package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public class McElieceCCA2Parameters extends McElieceParameters {
    private final String digest;

    public McElieceCCA2Parameters() {
        this(11, 50, McElieceCCA2KeyGenParameterSpec.SHA256);
    }

    public String getDigest() {
        return this.digest;
    }

    public McElieceCCA2Parameters(String str) {
        this(11, 50, str);
    }

    public McElieceCCA2Parameters(int i11) {
        this(i11, McElieceCCA2KeyGenParameterSpec.SHA256);
    }

    public McElieceCCA2Parameters(int i11, String str) {
        super(i11);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i11, int i12) {
        this(i11, i12, McElieceCCA2KeyGenParameterSpec.SHA256);
    }

    public McElieceCCA2Parameters(int i11, int i12, String str) {
        super(i11, i12);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i11, int i12, int i13) {
        this(i11, i12, i13, McElieceCCA2KeyGenParameterSpec.SHA256);
    }

    public McElieceCCA2Parameters(int i11, int i12, int i13, String str) {
        super(i11, i12, i13);
        this.digest = str;
    }
}