package org.spongycastle.cms;

/* loaded from: classes5.dex */
public class CMSRuntimeException extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    Exception f43433e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43433e;
    }

    public Exception getUnderlyingException() {
        return this.f43433e;
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f43433e = exc;
    }
}