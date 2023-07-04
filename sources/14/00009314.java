package org.bouncycastle.jcajce.provider.config;

import e60.k;
import java.io.OutputStream;
import java.security.KeyStore;

/* loaded from: classes5.dex */
public class PKCS12StoreParameter extends k {
    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        super(outputStream, protectionParameter, false);
    }

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z11) {
        super(outputStream, protectionParameter, z11);
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr) {
        super(outputStream, cArr, false);
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr, boolean z11) {
        super(outputStream, new KeyStore.PasswordProtection(cArr), z11);
    }
}