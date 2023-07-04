package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.GoppaCode;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

/* loaded from: classes4.dex */
public class McEliecePrivateKeyParameters extends McElieceKeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* renamed from: h  reason: collision with root package name */
    private GF2Matrix f43807h;

    /* renamed from: k  reason: collision with root package name */
    private int f43808k;

    /* renamed from: n  reason: collision with root package name */
    private int f43809n;
    private String oid;

    /* renamed from: p1  reason: collision with root package name */
    private Permutation f43810p1;

    /* renamed from: p2  reason: collision with root package name */
    private Permutation f43811p2;
    private PolynomialGF2mSmallM[] qInv;
    private GF2Matrix sInv;

    public McEliecePrivateKeyParameters(int i11, int i12, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix) {
        super(true, null);
        this.f43808k = i12;
        this.f43809n = i11;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.sInv = gF2Matrix;
        this.f43810p1 = permutation;
        this.f43811p2 = permutation2;
        this.f43807h = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        this.qInv = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f43807h;
    }

    public int getK() {
        return this.f43808k;
    }

    public int getN() {
        return this.f43809n;
    }

    public Permutation getP1() {
        return this.f43810p1;
    }

    public Permutation getP2() {
        return this.f43811p2;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public GF2Matrix getSInv() {
        return this.sInv;
    }

    public McEliecePrivateKeyParameters(int i11, int i12, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.f43809n = i11;
        this.f43808k = i12;
        GF2mField gF2mField = new GF2mField(bArr);
        this.field = gF2mField;
        this.goppaPoly = new PolynomialGF2mSmallM(gF2mField, bArr2);
        this.sInv = new GF2Matrix(bArr3);
        this.f43810p1 = new Permutation(bArr4);
        this.f43811p2 = new Permutation(bArr5);
        this.f43807h = new GF2Matrix(bArr6);
        this.qInv = new PolynomialGF2mSmallM[bArr7.length];
        for (int i13 = 0; i13 < bArr7.length; i13++) {
            this.qInv[i13] = new PolynomialGF2mSmallM(this.field, bArr7[i13]);
        }
    }
}