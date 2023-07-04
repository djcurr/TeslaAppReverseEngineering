package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class y implements e40.d {

    /* renamed from: a  reason: collision with root package name */
    private r f43121a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(r rVar) {
        this.f43121a = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new x(t70.a.c(getOctetStream()));
    }

    @Override // e40.d
    public InputStream getOctetStream() {
        return new h0(this.f43121a);
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