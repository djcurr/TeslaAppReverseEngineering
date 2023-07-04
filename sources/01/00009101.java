package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class t0 implements e40.d {

    /* renamed from: a  reason: collision with root package name */
    private q1 f43104a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(q1 q1Var) {
        this.f43104a = q1Var;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new s0(this.f43104a.m());
    }

    @Override // e40.d
    public InputStream getOctetStream() {
        return this.f43104a;
    }

    @Override // e40.b
    public n toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e11.getMessage(), e11);
        }
    }
}