package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes4.dex */
public class McElieceCCA2KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final String SHA1 = "SHA-1";
    public static final String SHA224 = "SHA-224";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";
    private final String digest;
    private int fieldPoly;

    /* renamed from: m  reason: collision with root package name */
    private final int f43861m;

    /* renamed from: n  reason: collision with root package name */
    private final int f43862n;

    /* renamed from: t  reason: collision with root package name */
    private final int f43863t;

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, SHA256);
    }

    public String getDigest() {
        return this.digest;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f43861m;
    }

    public int getN() {
        return this.f43862n;
    }

    public int getT() {
        return this.f43863t;
    }

    public McElieceCCA2KeyGenParameterSpec(int i11) {
        this(i11, SHA256);
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, String str) {
        int i12 = 1;
        if (i11 >= 1) {
            int i13 = 0;
            while (i12 < i11) {
                i12 <<= 1;
                i13++;
            }
            this.f43863t = (i12 >>> 1) / i13;
            this.f43861m = i13;
            this.f43862n = i12;
            this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i13);
            this.digest = str;
            return;
        }
        throw new IllegalArgumentException("key size must be positive");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12) {
        this(i11, i12, SHA256);
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, String str) {
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 <= 32) {
            this.f43861m = i11;
            int i13 = 1 << i11;
            this.f43862n = i13;
            if (i12 < 0) {
                throw new IllegalArgumentException("t must be positive");
            }
            if (i12 <= i13) {
                this.f43863t = i12;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
                this.digest = str;
                return;
            }
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        throw new IllegalArgumentException("m is too large");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, int i13) {
        this(i11, i12, i13, SHA256);
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, int i13, String str) {
        this.f43861m = i11;
        if (i11 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i11 <= 32) {
            int i14 = 1 << i11;
            this.f43862n = i14;
            this.f43863t = i12;
            if (i12 < 0) {
                throw new IllegalArgumentException("t must be positive");
            }
            if (i12 <= i14) {
                if (PolynomialRingGF2.degree(i13) == i11 && PolynomialRingGF2.isIrreducible(i13)) {
                    this.fieldPoly = i13;
                    this.digest = str;
                    return;
                }
                throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
            }
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        throw new IllegalArgumentException(" m is too large");
    }
}