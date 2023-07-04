package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class s1 implements Enumeration {

    /* renamed from: a  reason: collision with root package name */
    private h f43101a;

    /* renamed from: b  reason: collision with root package name */
    private Object f43102b = a();

    public s1(byte[] bArr) {
        this.f43101a = new h(bArr, true);
    }

    private Object a() {
        try {
            return this.f43101a.D();
        } catch (IOException e11) {
            throw new ASN1ParsingException("malformed DER construction: " + e11, e11);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f43102b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f43102b;
        if (obj != null) {
            this.f43102b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}