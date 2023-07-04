package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: g  reason: collision with root package name */
    static final b f10520g = new a();

    /* renamed from: a  reason: collision with root package name */
    private final na.g f10521a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10522b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10523c;

    /* renamed from: d  reason: collision with root package name */
    private HttpURLConnection f10524d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f10525e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f10526f;

    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url);
    }

    public j(na.g gVar, int i11) {
        this(gVar, i11, f10520g);
    }

    private HttpURLConnection b(URL url, Map<String, String> map) {
        try {
            HttpURLConnection a11 = this.f10523c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a11.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a11.setConnectTimeout(this.f10522b);
            a11.setReadTimeout(this.f10522b);
            a11.setUseCaches(false);
            a11.setDoInput(true);
            a11.setInstanceFollowRedirects(false);
            return a11;
        } catch (IOException e11) {
            throw new HttpException("URL.openConnection threw", 0, e11);
        }
    }

    private static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e11);
                return -1;
            }
            return -1;
        }
    }

    private InputStream f(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f10525e = bb.c.g(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f10525e = httpURLConnection.getInputStream();
            }
            return this.f10525e;
        } catch (IOException e11) {
            throw new HttpException("Failed to obtain InputStream", e(httpURLConnection), e11);
        }
    }

    private static boolean g(int i11) {
        return i11 / 100 == 2;
    }

    private static boolean h(int i11) {
        return i11 / 100 == 3;
    }

    private InputStream i(URL url, int i11, URL url2, Map<String, String> map) {
        if (i11 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection b11 = b(url, map);
            this.f10524d = b11;
            try {
                b11.connect();
                this.f10525e = this.f10524d.getInputStream();
                if (this.f10526f) {
                    return null;
                }
                int e11 = e(this.f10524d);
                if (g(e11)) {
                    return f(this.f10524d);
                }
                if (!h(e11)) {
                    if (e11 == -1) {
                        throw new HttpException(e11);
                    }
                    try {
                        throw new HttpException(this.f10524d.getResponseMessage(), e11);
                    } catch (IOException e12) {
                        throw new HttpException("Failed to get a response message", e11, e12);
                    }
                }
                String headerField = this.f10524d.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    try {
                        URL url3 = new URL(url, headerField);
                        cleanup();
                        return i(url3, i11 + 1, url, map);
                    } catch (MalformedURLException e13) {
                        throw new HttpException("Bad redirect url: " + headerField, e11, e13);
                    }
                }
                throw new HttpException("Received empty or null redirect url", e11);
            } catch (IOException e14) {
                throw new HttpException("Failed to connect or obtain data", e(this.f10524d), e14);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f10526f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.f10525e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10524d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10524d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(com.bumptech.glide.h hVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long b11 = bb.f.b();
        try {
            try {
                aVar.e(i(this.f10521a.i(), 0, null, this.f10521a.e()));
            } catch (IOException e11) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e11);
                }
                aVar.b(e11);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
                sb2 = new StringBuilder();
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(bb.f.a(b11));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + bb.f.a(b11));
            }
            throw th2;
        }
    }

    j(na.g gVar, int i11, b bVar) {
        this.f10521a = gVar;
        this.f10522b = i11;
        this.f10523c = bVar;
    }
}