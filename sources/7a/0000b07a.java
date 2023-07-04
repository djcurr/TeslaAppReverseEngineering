package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f49368a = true;

    /* renamed from: retrofit2.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C1078a implements retrofit2.f<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        static final C1078a f49369a = new C1078a();

        C1078a() {
        }

        @Override // retrofit2.f
        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) {
            try {
                return x.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b implements retrofit2.f<RequestBody, RequestBody> {

        /* renamed from: a  reason: collision with root package name */
        static final b f49370a = new b();

        b() {
        }

        @Override // retrofit2.f
        /* renamed from: a */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* loaded from: classes4.dex */
    static final class c implements retrofit2.f<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        static final c f49371a = new c();

        c() {
        }

        @Override // retrofit2.f
        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d implements retrofit2.f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        static final d f49372a = new d();

        d() {
        }

        @Override // retrofit2.f
        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes4.dex */
    static final class e implements retrofit2.f<ResponseBody, b0> {

        /* renamed from: a  reason: collision with root package name */
        static final e f49373a = new e();

        e() {
        }

        @Override // retrofit2.f
        /* renamed from: a */
        public b0 convert(ResponseBody responseBody) {
            responseBody.close();
            return b0.f54756a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f implements retrofit2.f<ResponseBody, Void> {

        /* renamed from: a  reason: collision with root package name */
        static final f f49374a = new f();

        f() {
        }

        @Override // retrofit2.f
        /* renamed from: a */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.f.a
    public retrofit2.f<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        if (RequestBody.class.isAssignableFrom(x.h(type))) {
            return b.f49370a;
        }
        return null;
    }

    @Override // retrofit2.f.a
    public retrofit2.f<ResponseBody, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        if (type == ResponseBody.class) {
            if (x.l(annotationArr, m80.w.class)) {
                return c.f49371a;
            }
            return C1078a.f49369a;
        } else if (type == Void.class) {
            return f.f49374a;
        } else {
            if (this.f49368a && type == b0.class) {
                try {
                    return e.f49373a;
                } catch (NoClassDefFoundError unused) {
                    this.f49368a = false;
                    return null;
                }
            }
            return null;
        }
    }
}