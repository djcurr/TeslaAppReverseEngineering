package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public abstract class n extends e40.c {
    public static n k(byte[] bArr) {
        h hVar = new h(bArr);
        try {
            n D = hVar.D();
            if (hVar.available() == 0) {
                return D;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // e40.c
    public void b(OutputStream outputStream) {
        m.a(outputStream).t(this);
    }

    @Override // e40.c
    public void c(OutputStream outputStream, String str) {
        m.b(outputStream, str).t(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean e(n nVar);

    @Override // e40.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e40.b) && e(((e40.b) obj).toASN1Primitive());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f(m mVar, boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h();

    public final boolean i(e40.b bVar) {
        return this == bVar || (bVar != null && e(bVar.toASN1Primitive()));
    }

    public final boolean j(n nVar) {
        return this == nVar || e(nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: package-private */
    public n n() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n o() {
        return this;
    }

    @Override // e40.c, e40.b
    public final n toASN1Primitive() {
        return this;
    }
}