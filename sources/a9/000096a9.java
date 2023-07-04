package org.bouncycastle.util.encoders;

/* loaded from: classes5.dex */
public class EncoderException extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EncoderException(String str, Throwable th2) {
        super(str);
        this.f43212a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43212a;
    }
}