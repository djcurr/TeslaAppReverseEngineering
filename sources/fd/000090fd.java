package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class s extends n implements e40.h {

    /* renamed from: a  reason: collision with root package name */
    final int f43098a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f43099b;

    /* renamed from: c  reason: collision with root package name */
    final e40.b f43100c;

    public s(boolean z11, int i11, e40.b bVar) {
        Objects.requireNonNull(bVar, "'obj' cannot be null");
        this.f43098a = i11;
        this.f43099b = z11 || (bVar instanceof e40.a);
        this.f43100c = bVar;
    }

    public static s p(Object obj) {
        if (obj == null || (obj instanceof s)) {
            return (s) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return p(n.k((byte[]) obj));
        } catch (IOException e11) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e11.getMessage());
        }
    }

    public static s q(s sVar, boolean z11) {
        if (z11) {
            return p(sVar.r());
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof s) {
            s sVar = (s) nVar;
            if (this.f43098a == sVar.f43098a && this.f43099b == sVar.f43099b) {
                n aSN1Primitive = this.f43100c.toASN1Primitive();
                n aSN1Primitive2 = sVar.f43100c.toASN1Primitive();
                return aSN1Primitive == aSN1Primitive2 || aSN1Primitive.e(aSN1Primitive2);
            }
            return false;
        }
        return false;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // e40.c
    public int hashCode() {
        return (this.f43098a ^ (this.f43099b ? 15 : 240)) ^ this.f43100c.toASN1Primitive().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        return new z0(this.f43099b, this.f43098a, this.f43100c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n o() {
        return new o1(this.f43099b, this.f43098a, this.f43100c);
    }

    public n r() {
        return this.f43100c.toASN1Primitive();
    }

    public int s() {
        return this.f43098a;
    }

    public boolean t() {
        return this.f43099b;
    }

    public String toString() {
        return "[" + this.f43098a + "]" + this.f43100c;
    }
}