package com.adyen.checkout.core.api;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final SSLSocketFactory f9589a;

    static {
        try {
            f9589a = a();
        } catch (KeyManagementException | NoSuchAlgorithmException e11) {
            throw new RuntimeException("Could not initialize SSLSocketFactory.", e11);
        }
    }

    private static SSLSocketFactory a() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        return sSLContext.getSocketFactory();
    }
}