package org.spongycastle.cms;

/* loaded from: classes5.dex */
public class CMSAttributeTableGenerationException extends CMSRuntimeException {

    /* renamed from: e  reason: collision with root package name */
    Exception f43431e;

    public CMSAttributeTableGenerationException(String str) {
        super(str);
    }

    @Override // org.spongycastle.cms.CMSRuntimeException, java.lang.Throwable
    public Throwable getCause() {
        return this.f43431e;
    }

    @Override // org.spongycastle.cms.CMSRuntimeException
    public Exception getUnderlyingException() {
        return this.f43431e;
    }

    public CMSAttributeTableGenerationException(String str, Exception exc) {
        super(str);
        this.f43431e = exc;
    }
}