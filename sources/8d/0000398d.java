package com.google.firebase.perf.network;

import android.os.Build;
import com.google.firebase.perf.util.h;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final fn.a f16980f = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f16981a;

    /* renamed from: b  reason: collision with root package name */
    private final gn.c f16982b;

    /* renamed from: c  reason: collision with root package name */
    private long f16983c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f16984d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final h f16985e;

    public c(HttpURLConnection httpURLConnection, h hVar, gn.c cVar) {
        this.f16981a = httpURLConnection;
        this.f16982b = cVar;
        this.f16985e = hVar;
        cVar.v(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f16983c == -1) {
            this.f16985e.e();
            long d11 = this.f16985e.d();
            this.f16983c = d11;
            this.f16982b.p(d11);
        }
        String F = F();
        if (F != null) {
            this.f16982b.k(F);
        } else if (o()) {
            this.f16982b.k("POST");
        } else {
            this.f16982b.k("GET");
        }
    }

    public boolean A() {
        return this.f16981a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f16981a.getLastModified();
    }

    public OutputStream C() {
        try {
            OutputStream outputStream = this.f16981a.getOutputStream();
            return outputStream != null ? new in.b(outputStream, this.f16982b, this.f16985e) : outputStream;
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }

    public Permission D() {
        try {
            return this.f16981a.getPermission();
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }

    public int E() {
        return this.f16981a.getReadTimeout();
    }

    public String F() {
        return this.f16981a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f16981a.getRequestProperties();
    }

    public String H(String str) {
        return this.f16981a.getRequestProperty(str);
    }

    public int I() {
        a0();
        if (this.f16984d == -1) {
            long b11 = this.f16985e.b();
            this.f16984d = b11;
            this.f16982b.u(b11);
        }
        try {
            int responseCode = this.f16981a.getResponseCode();
            this.f16982b.l(responseCode);
            return responseCode;
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }

    public String J() {
        a0();
        if (this.f16984d == -1) {
            long b11 = this.f16985e.b();
            this.f16984d = b11;
            this.f16982b.u(b11);
        }
        try {
            String responseMessage = this.f16981a.getResponseMessage();
            this.f16982b.l(this.f16981a.getResponseCode());
            return responseMessage;
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }

    public URL K() {
        return this.f16981a.getURL();
    }

    public boolean L() {
        return this.f16981a.getUseCaches();
    }

    public void M(boolean z11) {
        this.f16981a.setAllowUserInteraction(z11);
    }

    public void N(int i11) {
        this.f16981a.setChunkedStreamingMode(i11);
    }

    public void O(int i11) {
        this.f16981a.setConnectTimeout(i11);
    }

    public void P(boolean z11) {
        this.f16981a.setDefaultUseCaches(z11);
    }

    public void Q(boolean z11) {
        this.f16981a.setDoInput(z11);
    }

    public void R(boolean z11) {
        this.f16981a.setDoOutput(z11);
    }

    public void S(int i11) {
        this.f16981a.setFixedLengthStreamingMode(i11);
    }

    public void T(long j11) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f16981a.setFixedLengthStreamingMode(j11);
        }
    }

    public void U(long j11) {
        this.f16981a.setIfModifiedSince(j11);
    }

    public void V(boolean z11) {
        this.f16981a.setInstanceFollowRedirects(z11);
    }

    public void W(int i11) {
        this.f16981a.setReadTimeout(i11);
    }

    public void X(String str) {
        this.f16981a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if (NetworkConstantsKt.HEADER_USER_AGENT.equalsIgnoreCase(str)) {
            this.f16982b.w(str2);
        }
        this.f16981a.setRequestProperty(str, str2);
    }

    public void Z(boolean z11) {
        this.f16981a.setUseCaches(z11);
    }

    public void a(String str, String str2) {
        this.f16981a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f16983c == -1) {
            this.f16985e.e();
            long d11 = this.f16985e.d();
            this.f16983c = d11;
            this.f16982b.p(d11);
        }
        try {
            this.f16981a.connect();
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }

    public boolean b0() {
        return this.f16981a.usingProxy();
    }

    public void c() {
        this.f16982b.t(this.f16985e.b());
        this.f16982b.b();
        this.f16981a.disconnect();
    }

    public boolean d() {
        return this.f16981a.getAllowUserInteraction();
    }

    public int e() {
        return this.f16981a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f16981a.equals(obj);
    }

    public Object f() {
        a0();
        this.f16982b.l(this.f16981a.getResponseCode());
        try {
            Object content = this.f16981a.getContent();
            if (content instanceof InputStream) {
                this.f16982b.q(this.f16981a.getContentType());
                return new in.a((InputStream) content, this.f16982b, this.f16985e);
            }
            this.f16982b.q(this.f16981a.getContentType());
            this.f16982b.r(this.f16981a.getContentLength());
            this.f16982b.t(this.f16985e.b());
            this.f16982b.b();
            return content;
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }

    public Object g(Class[] clsArr) {
        a0();
        this.f16982b.l(this.f16981a.getResponseCode());
        try {
            Object content = this.f16981a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f16982b.q(this.f16981a.getContentType());
                return new in.a((InputStream) content, this.f16982b, this.f16985e);
            }
            this.f16982b.q(this.f16981a.getContentType());
            this.f16982b.r(this.f16981a.getContentLength());
            this.f16982b.t(this.f16985e.b());
            this.f16982b.b();
            return content;
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }

    public String h() {
        a0();
        return this.f16981a.getContentEncoding();
    }

    public int hashCode() {
        return this.f16981a.hashCode();
    }

    public int i() {
        a0();
        return this.f16981a.getContentLength();
    }

    public long j() {
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f16981a.getContentLengthLong();
        }
        return 0L;
    }

    public String k() {
        a0();
        return this.f16981a.getContentType();
    }

    public long l() {
        a0();
        return this.f16981a.getDate();
    }

    public boolean m() {
        return this.f16981a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f16981a.getDoInput();
    }

    public boolean o() {
        return this.f16981a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f16982b.l(this.f16981a.getResponseCode());
        } catch (IOException unused) {
            f16980f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f16981a.getErrorStream();
        return errorStream != null ? new in.a(errorStream, this.f16982b, this.f16985e) : errorStream;
    }

    public long q() {
        a0();
        return this.f16981a.getExpiration();
    }

    public String r(int i11) {
        a0();
        return this.f16981a.getHeaderField(i11);
    }

    public String s(String str) {
        a0();
        return this.f16981a.getHeaderField(str);
    }

    public long t(String str, long j11) {
        a0();
        return this.f16981a.getHeaderFieldDate(str, j11);
    }

    public String toString() {
        return this.f16981a.toString();
    }

    public int u(String str, int i11) {
        a0();
        return this.f16981a.getHeaderFieldInt(str, i11);
    }

    public String v(int i11) {
        a0();
        return this.f16981a.getHeaderFieldKey(i11);
    }

    public long w(String str, long j11) {
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f16981a.getHeaderFieldLong(str, j11);
        }
        return 0L;
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f16981a.getHeaderFields();
    }

    public long y() {
        return this.f16981a.getIfModifiedSince();
    }

    public InputStream z() {
        a0();
        this.f16982b.l(this.f16981a.getResponseCode());
        this.f16982b.q(this.f16981a.getContentType());
        try {
            InputStream inputStream = this.f16981a.getInputStream();
            return inputStream != null ? new in.a(inputStream, this.f16982b, this.f16985e) : inputStream;
        } catch (IOException e11) {
            this.f16982b.t(this.f16985e.b());
            in.d.d(this.f16982b);
            throw e11;
        }
    }
}