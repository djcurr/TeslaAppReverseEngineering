package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class l extends n implements e40.d {

    /* renamed from: a  reason: collision with root package name */
    byte[] f43063a;

    public l(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        this.f43063a = bArr;
    }

    public static l p(Object obj) {
        if (obj == null || (obj instanceof l)) {
            return (l) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return p(n.k((byte[]) obj));
            } catch (IOException e11) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e11.getMessage());
            }
        }
        if (obj instanceof e40.b) {
            n aSN1Primitive = ((e40.b) obj).toASN1Primitive();
            if (aSN1Primitive instanceof l) {
                return (l) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static l q(s sVar, boolean z11) {
        if (z11) {
            if (sVar.t()) {
                return p(sVar.r());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        n r11 = sVar.r();
        if (sVar.t()) {
            l p11 = p(r11);
            return sVar instanceof f0 ? new x(new l[]{p11}) : (l) new x(new l[]{p11}).o();
        } else if (r11 instanceof l) {
            l lVar = (l) r11;
            return sVar instanceof f0 ? lVar : (l) lVar.o();
        } else if (r11 instanceof p) {
            p pVar = (p) r11;
            return sVar instanceof f0 ? x.u(pVar) : (l) x.u(pVar).o();
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + sVar.getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof l) {
            return org.bouncycastle.util.a.c(this.f43063a, ((l) nVar).f43063a);
        }
        return false;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // e40.d
    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.f43063a);
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        return new s0(this.f43063a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n o() {
        return new s0(this.f43063a);
    }

    public byte[] r() {
        return this.f43063a;
    }

    public String toString() {
        return "#" + r70.m.b(org.bouncycastle.util.encoders.b.d(this.f43063a));
    }
}