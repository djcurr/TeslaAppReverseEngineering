package com.google.firebase.perf.network;

import com.google.firebase.perf.util.h;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends HttpURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f16977a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(HttpURLConnection httpURLConnection, h hVar, gn.c cVar) {
        super(httpURLConnection.getURL());
        this.f16977a = new c(httpURLConnection, hVar, cVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f16977a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f16977a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f16977a.c();
    }

    public boolean equals(Object obj) {
        return this.f16977a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f16977a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f16977a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f16977a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f16977a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f16977a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f16977a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f16977a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f16977a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f16977a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f16977a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f16977a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f16977a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f16977a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i11) {
        return this.f16977a.r(i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j11) {
        return this.f16977a.t(str, j11);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i11) {
        return this.f16977a.u(str, i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i11) {
        return this.f16977a.v(i11);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j11) {
        return this.f16977a.w(str, j11);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f16977a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f16977a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f16977a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f16977a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f16977a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f16977a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f16977a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f16977a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f16977a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f16977a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f16977a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f16977a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f16977a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f16977a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f16977a.L();
    }

    public int hashCode() {
        return this.f16977a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z11) {
        this.f16977a.M(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i11) {
        this.f16977a.N(i11);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i11) {
        this.f16977a.O(i11);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z11) {
        this.f16977a.P(z11);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z11) {
        this.f16977a.Q(z11);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z11) {
        this.f16977a.R(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i11) {
        this.f16977a.S(i11);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j11) {
        this.f16977a.U(j11);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z11) {
        this.f16977a.V(z11);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i11) {
        this.f16977a.W(i11);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f16977a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f16977a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z11) {
        this.f16977a.Z(z11);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f16977a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f16977a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f16977a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f16977a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j11) {
        this.f16977a.T(j11);
    }
}