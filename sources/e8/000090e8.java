package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class l1 implements e40.e {

    /* renamed from: a  reason: collision with root package name */
    private r f43065a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(r rVar) {
        this.f43065a = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new k1(this.f43065a.d());
    }

    @Override // e40.b
    public n toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new IllegalStateException(e11.getMessage());
        }
    }
}