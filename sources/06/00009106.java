package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class v implements e40.b, e40.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f43108a;

    /* renamed from: b  reason: collision with root package name */
    private final r f43109b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(int i11, r rVar) {
        this.f43108a = i11;
        this.f43109b = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new u(this.f43108a, this.f43109b.d());
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