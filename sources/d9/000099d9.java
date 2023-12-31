package org.spongycastle.asn1.x9;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.util.Arrays;

/* loaded from: classes5.dex */
public class X9ECPoint extends ASN1Object {

    /* renamed from: c  reason: collision with root package name */
    private ECCurve f43423c;
    private final ASN1OctetString encoding;

    /* renamed from: p  reason: collision with root package name */
    private ECPoint f43424p;

    public X9ECPoint(ECPoint eCPoint) {
        this(eCPoint, false);
    }

    public synchronized ECPoint getPoint() {
        if (this.f43424p == null) {
            this.f43424p = this.f43423c.decodePoint(this.encoding.getOctets()).normalize();
        }
        return this.f43424p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte[] octets = this.encoding.getOctets();
        if (octets == null || octets.length <= 0) {
            return false;
        }
        return octets[0] == 2 || octets[0] == 3;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public X9ECPoint(ECPoint eCPoint, boolean z11) {
        this.f43424p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z11));
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f43423c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }
}