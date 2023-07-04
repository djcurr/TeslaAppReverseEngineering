package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class n1 implements e40.f {

    /* renamed from: a  reason: collision with root package name */
    private r f43069a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(r rVar) {
        this.f43069a = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new m1(this.f43069a.d());
    }

    @Override // e40.b
    public n toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException(e11.getMessage(), e11);
        }
    }
}