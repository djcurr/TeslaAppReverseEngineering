package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes6.dex */
public class ASN1Exception extends IOException {
    private Throwable cause;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Exception(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Exception(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}