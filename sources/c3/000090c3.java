package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class ASN1ParsingException extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43011a;

    public ASN1ParsingException(String str) {
        super(str);
    }

    public ASN1ParsingException(String str, Throwable th2) {
        super(str);
        this.f43011a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43011a;
    }
}