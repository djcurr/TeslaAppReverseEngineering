package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class e0 implements e40.f {

    /* renamed from: a  reason: collision with root package name */
    private r f43036a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(r rVar) {
        this.f43036a = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new d0(this.f43036a.d());
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