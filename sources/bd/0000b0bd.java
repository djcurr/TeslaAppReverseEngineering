package retrofit2;

import com.stripe.android.core.networking.NetworkConstantsKt;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes4.dex */
final class q {

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f49481l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f49482m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    private final String f49483a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpUrl f49484b;

    /* renamed from: c  reason: collision with root package name */
    private String f49485c;

    /* renamed from: d  reason: collision with root package name */
    private HttpUrl.Builder f49486d;

    /* renamed from: e  reason: collision with root package name */
    private final Request.Builder f49487e = new Request.Builder();

    /* renamed from: f  reason: collision with root package name */
    private final Headers.Builder f49488f;

    /* renamed from: g  reason: collision with root package name */
    private MediaType f49489g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f49490h;

    /* renamed from: i  reason: collision with root package name */
    private MultipartBody.Builder f49491i;

    /* renamed from: j  reason: collision with root package name */
    private FormBody.Builder f49492j;

    /* renamed from: k  reason: collision with root package name */
    private RequestBody f49493k;

    /* loaded from: classes4.dex */
    private static class a extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        private final RequestBody f49494a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaType f49495b;

        a(RequestBody requestBody, MediaType mediaType) {
            this.f49494a = requestBody;
            this.f49495b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f49494a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f49495b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.g gVar) {
            this.f49494a.writeTo(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z11, boolean z12, boolean z13) {
        this.f49483a = str;
        this.f49484b = httpUrl;
        this.f49485c = str2;
        this.f49489g = mediaType;
        this.f49490h = z11;
        if (headers != null) {
            this.f49488f = headers.newBuilder();
        } else {
            this.f49488f = new Headers.Builder();
        }
        if (z12) {
            this.f49492j = new FormBody.Builder();
        } else if (z13) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f49491i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    private static String i(String str, boolean z11) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z11 || (codePointAt != 47 && codePointAt != 37))) {
                i11 += Character.charCount(codePointAt);
            } else {
                okio.f fVar = new okio.f();
                fVar.Z(str, 0, i11);
                j(fVar, str, i11, length, z11);
                return fVar.G0();
            }
        }
        return str;
    }

    private static void j(okio.f fVar, String str, int i11, int i12, boolean z11) {
        okio.f fVar2 = null;
        while (i11 < i12) {
            int codePointAt = str.codePointAt(i11);
            if (!z11 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z11 || (codePointAt != 47 && codePointAt != 37))) {
                    fVar.Q1(codePointAt);
                } else {
                    if (fVar2 == null) {
                        fVar2 = new okio.f();
                    }
                    fVar2.Q1(codePointAt);
                    while (!fVar2.N0()) {
                        int readByte = fVar2.readByte() & 255;
                        fVar.O0(37);
                        char[] cArr = f49481l;
                        fVar.O0(cArr[(readByte >> 4) & 15]);
                        fVar.O0(cArr[readByte & 15]);
                    }
                }
            }
            i11 += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z11) {
        if (z11) {
            this.f49492j.addEncoded(str, str2);
        } else {
            this.f49492j.add(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if (NetworkConstantsKt.HEADER_CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f49489g = MediaType.get(str2);
                return;
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e11);
            }
        }
        this.f49488f.add(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Headers headers) {
        this.f49488f.addAll(headers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Headers headers, RequestBody requestBody) {
        this.f49491i.addPart(headers, requestBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(MultipartBody.Part part) {
        this.f49491i.addPart(part);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(String str, String str2, boolean z11) {
        if (this.f49485c != null) {
            String i11 = i(str2, z11);
            String str3 = this.f49485c;
            String replace = str3.replace("{" + str + "}", i11);
            if (!f49482m.matcher(replace).matches()) {
                this.f49485c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(String str, String str2, boolean z11) {
        String str3 = this.f49485c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f49484b.newBuilder(str3);
            this.f49486d = newBuilder;
            if (newBuilder != null) {
                this.f49485c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f49484b + ", Relative: " + this.f49485c);
            }
        }
        if (z11) {
            this.f49486d.addEncodedQueryParameter(str, str2);
        } else {
            this.f49486d.addQueryParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void h(Class<T> cls, T t11) {
        this.f49487e.tag(cls, t11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request.Builder k() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.f49486d;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.f49484b.resolve(this.f49485c);
            if (resolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f49484b + ", Relative: " + this.f49485c);
            }
        }
        a aVar = this.f49493k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f49492j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f49491i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f49490h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f49489g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f49488f.add(NetworkConstantsKt.HEADER_CONTENT_TYPE, mediaType.toString());
            }
        }
        return this.f49487e.url(resolve).headers(this.f49488f.build()).method(this.f49483a, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(RequestBody requestBody) {
        this.f49493k = requestBody;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Object obj) {
        this.f49485c = obj.toString();
    }
}