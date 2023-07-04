package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes4.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private Digest digest;
    private int fieldPoly;

    /* renamed from: m  reason: collision with root package name */
    private int f43800m;

    /* renamed from: n  reason: collision with root package name */
    private int f43801n;

    /* renamed from: t  reason: collision with root package name */
    private int f43802t;

    public McElieceParameters() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f43800m;
    }

    public int getN() {
        return this.f43801n;
    }

    public int getT() {
        return this.f43802t;
    }

    public McElieceParameters(Digest digest) {
        this(11, 50, digest);
    }

    public McElieceParameters(int i11) {
        this(i11, (Digest) null);
    }

    public McElieceParameters(int i11, Digest digest) {
        if (i11 >= 1) {
            this.f43800m = 0;
            this.f43801n = 1;
            while (true) {
                int i12 = this.f43801n;
                if (i12 < i11) {
                    this.f43801n = i12 << 1;
                    this.f43800m++;
                } else {
                    int i13 = i12 >>> 1;
                    this.f43802t = i13;
                    int i14 = this.f43800m;
                    this.f43802t = i13 / i14;
                    this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i14);
                    this.digest = digest;
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("key size must be positive");
        }
    }

    public McElieceParameters(int i11, int i12) {
        this(i11, i12, (Digest) null);
    }

    public McElieceParameters(int i11, int i12, Digest digest) {
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 <= 32) {
            this.f43800m = i11;
            int i13 = 1 << i11;
            this.f43801n = i13;
            if (i12 < 0) {
                throw new IllegalArgumentException("t must be positive");
            }
            if (i12 <= i13) {
                this.f43802t = i12;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
                this.digest = digest;
                return;
            }
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        throw new IllegalArgumentException("m is too large");
    }

    public McElieceParameters(int i11, int i12, int i13) {
        this(i11, i12, i13, null);
    }

    public McElieceParameters(int i11, int i12, int i13, Digest digest) {
        this.f43800m = i11;
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 <= 32) {
            int i14 = 1 << i11;
            this.f43801n = i14;
            this.f43802t = i12;
            if (i12 < 0) {
                throw new IllegalArgumentException("t must be positive");
            }
            if (i12 <= i14) {
                if (PolynomialRingGF2.degree(i13) == i11 && PolynomialRingGF2.isIrreducible(i13)) {
                    this.fieldPoly = i13;
                    this.digest = digest;
                    return;
                }
                throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
            }
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        throw new IllegalArgumentException(" m is too large");
    }
}