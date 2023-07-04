package e60;

import java.io.OutputStream;
import java.security.KeyStore;

/* loaded from: classes5.dex */
public class k implements KeyStore.LoadStoreParameter {
    private final boolean forDEREncoding;
    private final OutputStream out;
    private final KeyStore.ProtectionParameter protectionParameter;

    public k(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(outputStream, protectionParameter, false);
    }

    public k(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z11) {
        this.out = outputStream;
        this.protectionParameter = protectionParameter;
        this.forDEREncoding = z11;
    }

    public k(OutputStream outputStream, char[] cArr) {
        this(outputStream, cArr, false);
    }

    public k(OutputStream outputStream, char[] cArr, boolean z11) {
        this(outputStream, new KeyStore.PasswordProtection(cArr), z11);
    }

    public OutputStream getOutputStream() {
        return this.out;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.protectionParameter;
    }

    public boolean isForDEREncoding() {
        return this.forDEREncoding;
    }
}