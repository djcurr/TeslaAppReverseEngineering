package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class a0 implements e40.b, e40.h {

    /* renamed from: a  reason: collision with root package name */
    private final int f43015a;

    /* renamed from: b  reason: collision with root package name */
    private final r f43016b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(int i11, r rVar) {
        this.f43015a = i11;
        this.f43016b = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new z(this.f43015a, this.f43016b.d());
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