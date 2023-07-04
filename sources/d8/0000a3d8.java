package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes4.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g  reason: collision with root package name */
    private GF2Matrix f43812g;

    /* renamed from: n  reason: collision with root package name */
    private int f43813n;

    /* renamed from: t  reason: collision with root package name */
    private int f43814t;

    public McEliecePublicKeyParameters(int i11, int i12, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f43813n = i11;
        this.f43814t = i12;
        this.f43812g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f43812g;
    }

    public int getK() {
        return this.f43812g.getNumRows();
    }

    public int getN() {
        return this.f43813n;
    }

    public int getT() {
        return this.f43814t;
    }
}