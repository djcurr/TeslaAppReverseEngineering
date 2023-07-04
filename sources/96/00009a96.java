package org.spongycastle.cms;

/* loaded from: classes5.dex */
public class CMSException extends Exception {

    /* renamed from: e  reason: collision with root package name */
    Exception f43432e;

    public CMSException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43432e;
    }

    public Exception getUnderlyingException() {
        return this.f43432e;
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f43432e = exc;
    }
}