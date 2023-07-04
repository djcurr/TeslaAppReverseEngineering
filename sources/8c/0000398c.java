package com.google.firebase.perf.network;

import com.google.firebase.perf.util.h;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class b extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f16978a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpsURLConnection f16979b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(HttpsURLConnection httpsURLConnection, h hVar, gn.c cVar) {
        super(httpsURLConnection.getURL());
        this.f16979b = httpsURLConnection;
        this.f16978a = new c(httpsURLConnection, hVar, cVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f16978a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f16978a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f16978a.c();
    }

    public boolean equals(Object obj) {
        return this.f16978a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f16978a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f16979b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f16978a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f16978a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f16978a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f16978a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f16978a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f16978a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f16978a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f16978a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f16978a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f16978a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f16978a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f16978a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i11) {
        return this.f16978a.r(i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j11) {
        return this.f16978a.t(str, j11);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i11) {
        return this.f16978a.u(str, i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i11) {
        return this.f16978a.v(i11);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j11) {
        return this.f16978a.w(str, j11);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f16978a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f16979b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f16978a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f16978a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f16978a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f16978a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f16979b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f16979b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f16978a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f16979b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f16978a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f16978a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f16978a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f16978a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f16978a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f16978a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f16978a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f16979b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f16979b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f16978a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f16978a.L();
    }

    public int hashCode() {
        return this.f16978a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z11) {
        this.f16978a.M(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i11) {
        this.f16978a.N(i11);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i11) {
        this.f16978a.O(i11);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z11) {
        this.f16978a.P(z11);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z11) {
        this.f16978a.Q(z11);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z11) {
        this.f16978a.R(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i11) {
        this.f16978a.S(i11);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f16979b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j11) {
        this.f16978a.U(j11);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z11) {
        this.f16978a.V(z11);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i11) {
        this.f16978a.W(i11);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f16978a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f16978a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f16979b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z11) {
        this.f16978a.Z(z11);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f16978a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f16978a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f16978a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f16978a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j11) {
        this.f16978a.T(j11);
    }
}