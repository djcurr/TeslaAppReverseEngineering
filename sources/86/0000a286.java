package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class SecP521R1Curve extends ECCurve.AbstractFp {
    private static final int SecP521R1_DEFAULT_COORDS = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final BigInteger f43736q = new BigInteger(1, Hex.decode("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    protected SecP521R1Point infinity;

    public SecP521R1Curve() {
        super(f43736q);
        this.infinity = new SecP521R1Point(this, null, null);
        this.f43693a = fromBigInteger(new BigInteger(1, Hex.decode("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f43694b = fromBigInteger(new BigInteger(1, Hex.decode("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.order = new BigInteger(1, Hex.decode("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.spongycastle.math.ec.ECCurve
    protected ECCurve cloneCurve() {
        return new SecP521R1Curve();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z11) {
        return new SecP521R1Point(this, eCFieldElement, eCFieldElement2, z11);
    }

    @Override // org.spongycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP521R1FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f43736q.bitLength();
    }

    @Override // org.spongycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f43736q;
    }

    @Override // org.spongycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i11) {
        return i11 == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z11) {
        return new SecP521R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z11);
    }
}