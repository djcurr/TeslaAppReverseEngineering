package com.adyen.checkout.core.api;

import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class b<T> implements Callable<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, String> f9573c;

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f9574d;

    /* renamed from: a  reason: collision with root package name */
    private HttpURLConnection f9575a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9576b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        GET("GET", false),
        POST("POST", true);
        
        private final boolean mDoOutput;
        private final String mValue;

        a(String str, boolean z11) {
            this.mValue = str;
            this.mDoOutput = z11;
        }

        String getValue() {
            return this.mValue;
        }

        boolean isDoOutput() {
            return this.mDoOutput;
        }
    }

    static {
        o7.a.c();
        f9573c = Collections.singletonMap(NetworkConstantsKt.HEADER_CONTENT_TYPE, "application/json");
        f9574d = StandardCharsets.UTF_8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(String str) {
        this.f9576b = str;
    }

    private byte[] c(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        while (read > 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private HttpURLConnection e(String str, Map<String, String> map, a aVar) {
        HttpURLConnection a11 = e.c().a(str);
        a11.setRequestMethod(aVar.getValue());
        a11.setUseCaches(false);
        a11.setDoInput(true);
        a11.setDoOutput(aVar.isDoOutput());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a11.addRequestProperty(entry.getKey(), entry.getValue());
        }
        return a11;
    }

    private byte[] f(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                byte[] c11 = c(inputStream);
                if (c11 != null) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return c11;
                } else if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th2) {
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        throw g(c(errorStream));
    }

    private IOException g(byte[] bArr) {
        return new IOException(bArr != null ? new String(bArr, f9574d) : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] a() {
        return b(Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] b(Map<String, String> map) {
        if (this.f9575a == null) {
            try {
                HttpURLConnection e11 = e(this.f9576b, map, a.GET);
                this.f9575a = e11;
                e11.connect();
                return f(this.f9575a);
            } finally {
                HttpURLConnection httpURLConnection = this.f9575a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        throw new RuntimeException("Connection already initiated");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return this.f9576b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] h(Map<String, String> map, byte[] bArr) {
        if (this.f9575a == null) {
            try {
                HttpURLConnection e11 = e(this.f9576b, map, a.POST);
                this.f9575a = e11;
                e11.connect();
                OutputStream outputStream = this.f9575a.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
                return f(this.f9575a);
            } finally {
                HttpURLConnection httpURLConnection = this.f9575a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        throw new RuntimeException("Connection already initiated");
    }
}