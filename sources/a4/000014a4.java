package com.android.volley.toolbox;

import android.os.SystemClock;
import com.adyen.checkout.components.model.payments.request.Address;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.a;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* loaded from: classes.dex */
final class n {

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f10351a;

        /* renamed from: b  reason: collision with root package name */
        private final VolleyError f10352b;

        private b(String str, VolleyError volleyError) {
            this.f10351a = str;
            this.f10352b = volleyError;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(com.android.volley.i<?> iVar, b bVar) {
        com.android.volley.m retryPolicy = iVar.getRetryPolicy();
        int timeoutMs = iVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f10352b);
            iVar.addMarker(String.format("%s-retry [timeout=%s]", bVar.f10351a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e11) {
            iVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.f10351a, Integer.valueOf(timeoutMs)));
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.android.volley.h b(com.android.volley.i<?> iVar, long j11, List<com.android.volley.e> list) {
        a.C0196a cacheEntry = iVar.getCacheEntry();
        if (cacheEntry == null) {
            return new com.android.volley.h(304, (byte[]) null, true, j11, list);
        }
        return new com.android.volley.h(304, cacheEntry.f10250a, true, j11, g.a(list, cacheEntry));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(InputStream inputStream, int i11, d dVar) {
        byte[] bArr;
        o oVar = new o(dVar, i11);
        try {
            bArr = dVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    oVar.write(bArr, 0, read);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            com.android.volley.n.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    dVar.b(bArr);
                    oVar.close();
                    throw th;
                }
            }
            byte[] byteArray = oVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                com.android.volley.n.e("Error occurred when closing InputStream", new Object[0]);
            }
            dVar.b(bArr);
            oVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(long j11, com.android.volley.i<?> iVar, byte[] bArr, int i11) {
        if (com.android.volley.n.f10307b || j11 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = iVar;
            objArr[1] = Long.valueOf(j11);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : Address.ADDRESS_NULL_PLACEHOLDER;
            objArr[3] = Integer.valueOf(i11);
            objArr[4] = Integer.valueOf(iVar.getRetryPolicy().a());
            com.android.volley.n.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b e(com.android.volley.i<?> iVar, IOException iOException, long j11, h hVar, byte[] bArr) {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + iVar.getUrl(), iOException);
        } else if (hVar != null) {
            int d11 = hVar.d();
            com.android.volley.n.c("Unexpected response code %d for %s", Integer.valueOf(d11), iVar.getUrl());
            if (bArr != null) {
                com.android.volley.h hVar2 = new com.android.volley.h(d11, bArr, false, SystemClock.elapsedRealtime() - j11, hVar.c());
                if (d11 == 401 || d11 == 403) {
                    return new b("auth", new AuthFailureError(hVar2));
                }
                if (d11 >= 400 && d11 <= 499) {
                    throw new ClientError(hVar2);
                }
                if (d11 >= 500 && d11 <= 599 && iVar.shouldRetryServerErrors()) {
                    return new b("server", new ServerError(hVar2));
                }
                throw new ServerError(hVar2);
            }
            return new b("network", new NetworkError());
        } else if (iVar.shouldRetryConnectionErrors()) {
            return new b("connection", new NoConnectionError());
        } else {
            throw new NoConnectionError(iOException);
        }
    }
}