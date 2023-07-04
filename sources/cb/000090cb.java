package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class c0 implements e40.e {

    /* renamed from: a  reason: collision with root package name */
    private r f43026a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(r rVar) {
        this.f43026a = rVar;
    }

    @Override // e40.h
    public n getLoadedObject() {
        return new b0(this.f43026a.d());
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