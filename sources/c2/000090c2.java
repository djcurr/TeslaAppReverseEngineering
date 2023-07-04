package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class ASN1Exception extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43010a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Exception(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Exception(String str, Throwable th2) {
        super(str);
        this.f43010a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43010a;
    }
}