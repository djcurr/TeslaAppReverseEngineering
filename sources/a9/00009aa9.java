package org.spongycastle.cms;

import java.io.IOException;

/* loaded from: classes5.dex */
public class CMSStreamException extends IOException {
    private final Throwable underlying;

    CMSStreamException(String str) {
        super(str);
        this.underlying = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlying;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CMSStreamException(String str, Throwable th2) {
        super(str);
        this.underlying = th2;
    }
}