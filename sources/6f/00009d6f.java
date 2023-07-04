package org.spongycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes4.dex */
public class TlsFatalAlert extends IOException {
    private static final long serialVersionUID = 3584313123679111168L;
    protected Throwable alertCause;
    protected short alertDescription;

    public TlsFatalAlert(short s11) {
        this(s11, null);
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.alertCause;
    }

    public TlsFatalAlert(short s11, Throwable th2) {
        super(AlertDescription.getText(s11));
        this.alertDescription = s11;
        this.alertCause = th2;
    }
}