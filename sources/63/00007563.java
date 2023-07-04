package ii;

import ak.k0;
import android.net.Uri;
import ci.h;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.common.base.v;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zj.e;

/* loaded from: classes3.dex */
public class a extends e implements HttpDataSource {

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f30422s;

    /* renamed from: e  reason: collision with root package name */
    private final Call.Factory f30423e;

    /* renamed from: f  reason: collision with root package name */
    private final HttpDataSource.c f30424f;

    /* renamed from: g  reason: collision with root package name */
    private final String f30425g;

    /* renamed from: h  reason: collision with root package name */
    private final CacheControl f30426h;

    /* renamed from: i  reason: collision with root package name */
    private final HttpDataSource.c f30427i;

    /* renamed from: j  reason: collision with root package name */
    private v<String> f30428j;

    /* renamed from: k  reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.b f30429k;

    /* renamed from: l  reason: collision with root package name */
    private Response f30430l;

    /* renamed from: m  reason: collision with root package name */
    private InputStream f30431m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f30432n;

    /* renamed from: o  reason: collision with root package name */
    private long f30433o;

    /* renamed from: p  reason: collision with root package name */
    private long f30434p;

    /* renamed from: q  reason: collision with root package name */
    private long f30435q;

    /* renamed from: r  reason: collision with root package name */
    private long f30436r;

    static {
        h.a("goog.exo.okhttp");
        f30422s = new byte[4096];
    }

    @Deprecated
    public a(Call.Factory factory, String str, CacheControl cacheControl, HttpDataSource.c cVar) {
        this(factory, str, cacheControl, cVar, null);
    }

    private void s() {
        Response response = this.f30430l;
        if (response != null) {
            ((ResponseBody) ak.a.e(response.body())).close();
            this.f30430l = null;
        }
        this.f30431m = null;
    }

    private Request t(com.google.android.exoplayer2.upstream.b bVar) {
        long j11 = bVar.f14637f;
        long j12 = bVar.f14638g;
        HttpUrl parse = HttpUrl.parse(bVar.f14632a.toString());
        if (parse != null) {
            Request.Builder url = new Request.Builder().url(parse);
            CacheControl cacheControl = this.f30426h;
            if (cacheControl != null) {
                url.cacheControl(cacheControl);
            }
            HashMap hashMap = new HashMap();
            HttpDataSource.c cVar = this.f30427i;
            if (cVar != null) {
                hashMap.putAll(cVar.a());
            }
            hashMap.putAll(this.f30424f.a());
            hashMap.putAll(bVar.f14636e);
            for (Map.Entry entry : hashMap.entrySet()) {
                url.header((String) entry.getKey(), (String) entry.getValue());
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
                url.addHeader("Range", sb3);
            }
            String str = this.f30425g;
            if (str != null) {
                url.addHeader(NetworkConstantsKt.HEADER_USER_AGENT, str);
            }
            if (!bVar.d(1)) {
                url.addHeader("Accept-Encoding", "identity");
            }
            byte[] bArr = bVar.f14635d;
            RequestBody requestBody = null;
            if (bArr != null) {
                requestBody = RequestBody.create((MediaType) null, bArr);
            } else if (bVar.f14634c == 2) {
                requestBody = RequestBody.create((MediaType) null, k0.f482f);
            }
            url.method(bVar.b(), requestBody);
            return url.build();
        }
        throw new HttpDataSource.HttpDataSourceException("Malformed URL", bVar, 1);
    }

    private int u(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f30434p;
        if (j11 != -1) {
            long j12 = j11 - this.f30436r;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        int read = ((InputStream) k0.j(this.f30431m)).read(bArr, i11, i12);
        if (read == -1) {
            if (this.f30434p == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f30436r += read;
        o(read);
        return read;
    }

    private void v() {
        byte[] bArr;
        if (this.f30435q == this.f30433o) {
            return;
        }
        while (true) {
            long j11 = this.f30435q;
            long j12 = this.f30433o;
            if (j11 == j12) {
                return;
            }
            long j13 = j12 - j11;
            int read = ((InputStream) k0.j(this.f30431m)).read(f30422s, 0, (int) Math.min(j13, bArr.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read != -1) {
                this.f30435q += read;
                o(read);
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> c() {
        Response response = this.f30430l;
        return response == null ? Collections.emptyMap() : response.headers().toMultimap();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.f30432n) {
            this.f30432n = false;
            p();
            s();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(com.google.android.exoplayer2.upstream.b bVar) {
        byte[] bArr;
        this.f30429k = bVar;
        long j11 = 0;
        this.f30436r = 0L;
        this.f30435q = 0L;
        q(bVar);
        try {
            Response execute = this.f30423e.newCall(t(bVar)).execute();
            this.f30430l = execute;
            ResponseBody responseBody = (ResponseBody) ak.a.e(execute.body());
            this.f30431m = responseBody.byteStream();
            int code = execute.code();
            if (!execute.isSuccessful()) {
                try {
                    bArr = k0.P0((InputStream) ak.a.e(this.f30431m));
                } catch (IOException unused) {
                    bArr = k0.f482f;
                }
                Map<String, List<String>> multimap = execute.headers().toMultimap();
                s();
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(code, execute.message(), multimap, bVar, bArr);
                if (code == 416) {
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                }
                throw invalidResponseCodeException;
            }
            MediaType contentType = responseBody.contentType();
            String mediaType = contentType != null ? contentType.toString() : "";
            v<String> vVar = this.f30428j;
            if (vVar != null && !vVar.apply(mediaType)) {
                s();
                throw new HttpDataSource.InvalidContentTypeException(mediaType, bVar);
            }
            if (code == 200) {
                long j12 = bVar.f14637f;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            this.f30433o = j11;
            long j13 = bVar.f14638g;
            if (j13 != -1) {
                this.f30434p = j13;
            } else {
                long contentLength = responseBody.contentLength();
                this.f30434p = contentLength != -1 ? contentLength - this.f30433o : -1L;
            }
            this.f30432n = true;
            r(bVar);
            return this.f30434p;
        } catch (IOException e11) {
            String message = e11.getMessage();
            if (message != null && k0.R0(message).matches("cleartext communication.*not permitted.*")) {
                throw new HttpDataSource.CleartextNotPermittedException(e11, bVar);
            }
            throw new HttpDataSource.HttpDataSourceException("Unable to connect", e11, bVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        Response response = this.f30430l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().toString());
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        try {
            v();
            return u(bArr, i11, i12);
        } catch (IOException e11) {
            throw new HttpDataSource.HttpDataSourceException(e11, (com.google.android.exoplayer2.upstream.b) ak.a.e(this.f30429k), 2);
        }
    }

    private a(Call.Factory factory, String str, CacheControl cacheControl, HttpDataSource.c cVar, v<String> vVar) {
        super(true);
        this.f30423e = (Call.Factory) ak.a.e(factory);
        this.f30425g = str;
        this.f30426h = cacheControl;
        this.f30427i = cVar;
        this.f30428j = vVar;
        this.f30424f = new HttpDataSource.c();
    }
}