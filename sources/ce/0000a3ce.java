package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes4.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* renamed from: n  reason: collision with root package name */
    private int f43783n;

    /* renamed from: t  reason: collision with root package name */
    private int f43784t;

    public McElieceCCA2PublicKeyParameters(int i11, int i12, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f43783n = i11;
        this.f43784t = i12;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f43783n;
    }

    public int getT() {
        return this.f43784t;
    }
}