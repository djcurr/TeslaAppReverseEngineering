package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes4.dex */
public class McElieceKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* renamed from: m  reason: collision with root package name */
    private int f43864m;

    /* renamed from: n  reason: collision with root package name */
    private int f43865n;

    /* renamed from: t  reason: collision with root package name */
    private int f43866t;

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f43864m;
    }

    public int getN() {
        return this.f43865n;
    }

    public int getT() {
        return this.f43866t;
    }

    public McElieceKeyGenParameterSpec(int i11) {
        if (i11 >= 1) {
            this.f43864m = 0;
            this.f43865n = 1;
            while (true) {
                int i12 = this.f43865n;
                if (i12 < i11) {
                    this.f43865n = i12 << 1;
                    this.f43864m++;
                } else {
                    int i13 = i12 >>> 1;
                    this.f43866t = i13;
                    int i14 = this.f43864m;
                    this.f43866t = i13 / i14;
                    this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i14);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("key size must be positive");
        }
    }

    public McElieceKeyGenParameterSpec(int i11, int i12) {
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 <= 32) {
            this.f43864m = i11;
            int i13 = 1 << i11;
            this.f43865n = i13;
            if (i12 < 0) {
                throw new IllegalArgumentException("t must be positive");
            }
            if (i12 <= i13) {
                this.f43866t = i12;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
                return;
            }
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        throw new IllegalArgumentException("m is too large");
    }

    public McElieceKeyGenParameterSpec(int i11, int i12, int i13) {
        this.f43864m = i11;
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 <= 32) {
            int i14 = 1 << i11;
            this.f43865n = i14;
            this.f43866t = i12;
            if (i12 < 0) {
                throw new IllegalArgumentException("t must be positive");
            }
            if (i12 <= i14) {
                if (PolynomialRingGF2.degree(i13) == i11 && PolynomialRingGF2.isIrreducible(i13)) {
                    this.fieldPoly = i13;
                    return;
                }
                throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
            }
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        throw new IllegalArgumentException(" m is too large");
    }
}