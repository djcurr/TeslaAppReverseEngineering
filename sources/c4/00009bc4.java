package org.spongycastle.crypto.ec;

import org.spongycastle.math.ec.ECPoint;

/* loaded from: classes4.dex */
public class ECPair {

    /* renamed from: x  reason: collision with root package name */
    private final ECPoint f43471x;

    /* renamed from: y  reason: collision with root package name */
    private final ECPoint f43472y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f43471x = eCPoint;
        this.f43472y = eCPoint2;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f43471x;
    }

    public ECPoint getY() {
        return this.f43472y;
    }

    public int hashCode() {
        return this.f43471x.hashCode() + (this.f43472y.hashCode() * 37);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }
}