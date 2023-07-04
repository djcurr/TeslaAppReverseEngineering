package com.google.android.exoplayer2.upstream;

import ak.k0;
import ak.o;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.common.base.v;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import zj.n;

/* loaded from: classes3.dex */
public class e extends zj.e implements HttpDataSource {

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f14666v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14667e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14668f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14669g;

    /* renamed from: h  reason: collision with root package name */
    private final String f14670h;

    /* renamed from: i  reason: collision with root package name */
    private final HttpDataSource.c f14671i;

    /* renamed from: j  reason: collision with root package name */
    private final HttpDataSource.c f14672j;

    /* renamed from: k  reason: collision with root package name */
    private v<String> f14673k;

    /* renamed from: l  reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.b f14674l;

    /* renamed from: m  reason: collision with root package name */
    private HttpURLConnection f14675m;

    /* renamed from: n  reason: collision with root package name */
    private InputStream f14676n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f14677o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f14678p;

    /* renamed from: q  reason: collision with root package name */
    private int f14679q;

    /* renamed from: r  reason: collision with root package name */
    private long f14680r;

    /* renamed from: s  reason: collision with root package name */
    private long f14681s;

    /* renamed from: t  reason: collision with root package name */
    private long f14682t;

    /* renamed from: u  reason: collision with root package name */
    private long f14683u;

    /* loaded from: classes3.dex */
    public static final class b implements HttpDataSource.b {

        /* renamed from: b  reason: collision with root package name */
        private n f14685b;

        /* renamed from: c  reason: collision with root package name */
        private v<String> f14686c;

        /* renamed from: d  reason: collision with root package name */
        private String f14687d;

        /* renamed from: g  reason: collision with root package name */
        private boolean f14690g;

        /* renamed from: a  reason: collision with root package name */
        private final HttpDataSource.c f14684a = new HttpDataSource.c();

        /* renamed from: e  reason: collision with root package name */
        private int f14688e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f14689f = 8000;

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0258a
        /* renamed from: b */
        public e a() {
            e eVar = new e(this.f14687d, this.f14688e, this.f14689f, this.f14690g, this.f14684a, this.f14686c);
            n nVar = this.f14685b;
            if (nVar != null) {
                eVar.b(nVar);
            }
            return eVar;
        }

        public b c(String str) {
            this.f14687d = str;
            return this;
        }
    }

    private int B(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f14681s;
        if (j11 != -1) {
            long j12 = j11 - this.f14683u;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        int read = ((InputStream) k0.j(this.f14676n)).read(bArr, i11, i12);
        if (read == -1) {
            if (this.f14681s == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f14683u += read;
        o(read);
        return read;
    }

    private void C() {
        if (this.f14682t == this.f14680r) {
            return;
        }
        if (this.f14677o == null) {
            this.f14677o = new byte[4096];
        }
        while (true) {
            long j11 = this.f14682t;
            long j12 = this.f14680r;
            if (j11 == j12) {
                return;
            }
            int read = ((InputStream) k0.j(this.f14676n)).read(this.f14677o, 0, (int) Math.min(j12 - j11, this.f14677o.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read != -1) {
                this.f14682t += read;
                o(read);
            } else {
                throw new EOFException();
            }
        }
    }

    private void t() {
        HttpURLConnection httpURLConnection = this.f14675m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e11);
            }
            this.f14675m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long u(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L36
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L38
        L15:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            ak.o.c(r3, r1)
        L36:
            r4 = -1
        L38:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto Ld7
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.upstream.e.f14666v
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto Ld7
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> Lb6
            java.lang.Object r6 = ak.a.e(r6)     // Catch: java.lang.NumberFormatException -> Lb6
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> Lb6
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Lb6
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> Lb6
            java.lang.Object r1 = ak.a.e(r1)     // Catch: java.lang.NumberFormatException -> Lb6
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> Lb6
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> Lb6
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L7a
            r4 = r6
            goto Ld7
        L7a:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto Ld7
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lb6
            int r1 = r1.length()     // Catch: java.lang.NumberFormatException -> Lb6
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch: java.lang.NumberFormatException -> Lb6
            int r8 = r8.length()     // Catch: java.lang.NumberFormatException -> Lb6
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lb6
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> Lb6
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch: java.lang.NumberFormatException -> Lb6
            r8.append(r0)     // Catch: java.lang.NumberFormatException -> Lb6
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch: java.lang.NumberFormatException -> Lb6
            r8.append(r10)     // Catch: java.lang.NumberFormatException -> Lb6
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> Lb6
            java.lang.String r0 = r8.toString()     // Catch: java.lang.NumberFormatException -> Lb6
            ak.o.h(r3, r0)     // Catch: java.lang.NumberFormatException -> Lb6
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> Lb6
            r4 = r0
            goto Ld7
        Lb6:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            ak.o.c(r3, r10)
        Ld7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.e.u(java.net.HttpURLConnection):long");
    }

    private static URL v(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            String valueOf = String.valueOf(protocol);
            throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
        }
        throw new ProtocolException("Null location redirect");
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection x(com.google.android.exoplayer2.upstream.b bVar) {
        HttpURLConnection y11;
        com.google.android.exoplayer2.upstream.b bVar2 = bVar;
        URL url = new URL(bVar2.f14632a.toString());
        int i11 = bVar2.f14634c;
        byte[] bArr = bVar2.f14635d;
        long j11 = bVar2.f14637f;
        long j12 = bVar2.f14638g;
        int i12 = 1;
        boolean d11 = bVar2.d(1);
        if (this.f14667e) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                if (i13 <= 20) {
                    byte[] bArr2 = bArr;
                    int i15 = i12;
                    long j13 = j12;
                    long j14 = j11;
                    y11 = y(url, i11, bArr, j11, j12, d11, false, bVar2.f14636e);
                    int responseCode = y11.getResponseCode();
                    String headerField = y11.getHeaderField("Location");
                    if ((i11 == i15 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                        y11.disconnect();
                        url = v(url, headerField);
                    } else if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    } else {
                        y11.disconnect();
                        url = v(url, headerField);
                        bArr2 = null;
                        i11 = i15;
                    }
                    i13 = i14;
                    i12 = i15;
                    bArr = bArr2;
                    j12 = j13;
                    j11 = j14;
                    bVar2 = bVar;
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Too many redirects: ");
                    sb2.append(i14);
                    throw new NoRouteToHostException(sb2.toString());
                }
            }
            return y11;
        }
        return y(url, i11, bArr, j11, j12, d11, true, bVar2.f14636e);
    }

    private HttpURLConnection y(URL url, int i11, byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map<String, String> map) {
        HttpURLConnection A = A(url);
        A.setConnectTimeout(this.f14668f);
        A.setReadTimeout(this.f14669g);
        HashMap hashMap = new HashMap();
        HttpDataSource.c cVar = this.f14671i;
        if (cVar != null) {
            hashMap.putAll(cVar.a());
        }
        hashMap.putAll(this.f14672j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j11 != 0 || j12 != -1) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("bytes=");
            sb2.append(j11);
            sb2.append("-");
            String sb3 = sb2.toString();
            if (j12 != -1) {
                String valueOf = String.valueOf(sb3);
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 20);
                sb4.append(valueOf);
                sb4.append((j11 + j12) - 1);
                sb3 = sb4.toString();
            }
            A.setRequestProperty("Range", sb3);
        }
        String str = this.f14670h;
        if (str != null) {
            A.setRequestProperty(NetworkConstantsKt.HEADER_USER_AGENT, str);
        }
        A.setRequestProperty("Accept-Encoding", z11 ? "gzip" : "identity");
        A.setInstanceFollowRedirects(z12);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(com.google.android.exoplayer2.upstream.b.c(i11));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    private static void z(HttpURLConnection httpURLConnection, long j11) {
        int i11;
        if (httpURLConnection != null && (i11 = k0.f477a) >= 19 && i11 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j11 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j11 <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) ak.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    HttpURLConnection A(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f14675m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        try {
            InputStream inputStream = this.f14676n;
            if (inputStream != null) {
                z(this.f14675m, s());
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    throw new HttpDataSource.HttpDataSourceException(e11, (com.google.android.exoplayer2.upstream.b) k0.j(this.f14674l), 3);
                }
            }
        } finally {
            this.f14676n = null;
            t();
            if (this.f14678p) {
                this.f14678p = false;
                p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(com.google.android.exoplayer2.upstream.b bVar) {
        byte[] bArr;
        this.f14674l = bVar;
        long j11 = 0;
        this.f14683u = 0L;
        this.f14682t = 0L;
        q(bVar);
        try {
            HttpURLConnection x11 = x(bVar);
            this.f14675m = x11;
            try {
                this.f14679q = x11.getResponseCode();
                String responseMessage = x11.getResponseMessage();
                int i11 = this.f14679q;
                if (i11 >= 200 && i11 <= 299) {
                    String contentType = x11.getContentType();
                    v<String> vVar = this.f14673k;
                    if (vVar != null && !vVar.apply(contentType)) {
                        t();
                        throw new HttpDataSource.InvalidContentTypeException(contentType, bVar);
                    }
                    if (this.f14679q == 200) {
                        long j12 = bVar.f14637f;
                        if (j12 != 0) {
                            j11 = j12;
                        }
                    }
                    this.f14680r = j11;
                    boolean w11 = w(x11);
                    if (!w11) {
                        long j13 = bVar.f14638g;
                        if (j13 != -1) {
                            this.f14681s = j13;
                        } else {
                            long u11 = u(x11);
                            this.f14681s = u11 != -1 ? u11 - this.f14680r : -1L;
                        }
                    } else {
                        this.f14681s = bVar.f14638g;
                    }
                    try {
                        this.f14676n = x11.getInputStream();
                        if (w11) {
                            this.f14676n = new GZIPInputStream(this.f14676n);
                        }
                        this.f14678p = true;
                        r(bVar);
                        return this.f14681s;
                    } catch (IOException e11) {
                        t();
                        throw new HttpDataSource.HttpDataSourceException(e11, bVar, 1);
                    }
                }
                Map<String, List<String>> headerFields = x11.getHeaderFields();
                InputStream errorStream = x11.getErrorStream();
                try {
                    bArr = errorStream != null ? k0.P0(errorStream) : k0.f482f;
                } catch (IOException unused) {
                    bArr = k0.f482f;
                }
                byte[] bArr2 = bArr;
                t();
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.f14679q, responseMessage, headerFields, bVar, bArr2);
                if (this.f14679q == 416) {
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                }
                throw invalidResponseCodeException;
            } catch (IOException e12) {
                t();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e12, bVar, 1);
            }
        } catch (IOException e13) {
            String message = e13.getMessage();
            if (message != null && k0.R0(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new HttpDataSource.CleartextNotPermittedException(e13, bVar);
            }
            throw new HttpDataSource.HttpDataSourceException("Unable to connect", e13, bVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        HttpURLConnection httpURLConnection = this.f14675m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        try {
            C();
            return B(bArr, i11, i12);
        } catch (IOException e11) {
            throw new HttpDataSource.HttpDataSourceException(e11, (com.google.android.exoplayer2.upstream.b) k0.j(this.f14674l), 2);
        }
    }

    protected final long s() {
        long j11 = this.f14681s;
        return j11 == -1 ? j11 : j11 - this.f14683u;
    }

    private e(String str, int i11, int i12, boolean z11, HttpDataSource.c cVar, v<String> vVar) {
        super(true);
        this.f14670h = str;
        this.f14668f = i11;
        this.f14669g = i12;
        this.f14667e = z11;
        this.f14671i = cVar;
        this.f14673k = vVar;
        this.f14672j = new HttpDataSource.c();
    }
}