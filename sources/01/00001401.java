package com.alipay.android.phone.mrpc.core;

import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public class ad implements HttpRequestRetryHandler {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10068a = ad.class.getSimpleName();

    public boolean retryRequest(IOException iOException, int i11, HttpContext httpContext) {
        if (i11 >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            return true;
        }
        return ((iOException instanceof SocketException) || (iOException instanceof SSLException)) && iOException.getMessage() != null && iOException.getMessage().contains("Broken pipe");
    }
}