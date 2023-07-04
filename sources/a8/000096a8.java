package org.bouncycastle.util.encoders;

/* loaded from: classes5.dex */
public class DecoderException extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43211a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecoderException(String str, Throwable th2) {
        super(str);
        this.f43211a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43211a;
    }
}