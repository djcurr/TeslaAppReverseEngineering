package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class l0 implements e40.b, e40.h {

    /* renamed from: a  reason: collision with root package name */
    private r f43064a;

    public l0(r rVar) {
        this.f43064a = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        try {
            return new g1(this.f43064a.d());
        } catch (IllegalArgumentException e11) {
            throw new ASN1Exception(e11.getMessage(), e11);
        }
    }

    @Override // e40.b
    public n toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException("unable to get DER object", e11);
        } catch (IllegalArgumentException e12) {
            throw new ASN1ParsingException("unable to get DER object", e12);
        }
    }
}