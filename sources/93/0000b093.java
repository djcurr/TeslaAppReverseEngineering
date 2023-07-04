package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class j<ResponseT, ReturnT> extends u<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    private final r f49394a;

    /* renamed from: b  reason: collision with root package name */
    private final Call.Factory f49395b;

    /* renamed from: c  reason: collision with root package name */
    private final f<ResponseBody, ResponseT> f49396c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        private final retrofit2.c<ResponseT, ReturnT> f49397d;

        a(r rVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, retrofit2.c<ResponseT, ReturnT> cVar) {
            super(rVar, factory, fVar);
            this.f49397d = cVar;
        }

        @Override // retrofit2.j
        protected ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            return this.f49397d.adapt(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f49398d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f49399e;

        b(r rVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar, boolean z11) {
            super(rVar, factory, fVar);
            this.f49398d = cVar;
            this.f49399e = z11;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> adapt = this.f49398d.adapt(bVar);
            zz.d dVar = (zz.d) objArr[objArr.length - 1];
            try {
                if (this.f49399e) {
                    return l.b(adapt, dVar);
                }
                return l.a(adapt, dVar);
            } catch (Exception e11) {
                return l.d(e11, dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f49400d;

        c(r rVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar) {
            super(rVar, factory, fVar);
            this.f49400d = cVar;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> adapt = this.f49400d.adapt(bVar);
            zz.d dVar = (zz.d) objArr[objArr.length - 1];
            try {
                return l.c(adapt, dVar);
            } catch (Exception e11) {
                return l.d(e11, dVar);
            }
        }
    }

    j(r rVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar) {
        this.f49394a = rVar;
        this.f49395b = factory;
        this.f49396c = fVar;
    }

    private static <ResponseT, ReturnT> retrofit2.c<ResponseT, ReturnT> d(t tVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (retrofit2.c<ResponseT, ReturnT>) tVar.a(type, annotationArr);
        } catch (RuntimeException e11) {
            throw x.n(method, e11, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> f<ResponseBody, ResponseT> e(t tVar, Method method, Type type) {
        try {
            return tVar.h(type, method.getAnnotations());
        } catch (RuntimeException e11) {
            throw x.n(method, e11, "Unable to create converter for %s", type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <ResponseT, ReturnT> j<ResponseT, ReturnT> f(t tVar, Method method, r rVar) {
        Type genericReturnType;
        boolean z11;
        boolean z12 = rVar.f49506k;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f11 = x.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (x.h(f11) == s.class && (f11 instanceof ParameterizedType)) {
                f11 = x.g(0, (ParameterizedType) f11);
                z11 = true;
            } else {
                z11 = false;
            }
            genericReturnType = new x.b(null, retrofit2.b.class, f11);
            annotations = w.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z11 = false;
        }
        retrofit2.c d11 = d(tVar, method, genericReturnType, annotations);
        Type responseType = d11.responseType();
        if (responseType != Response.class) {
            if (responseType != s.class) {
                if (rVar.f49498c.equals("HEAD") && !Void.class.equals(responseType)) {
                    throw x.m(method, "HEAD method must use Void as response type.", new Object[0]);
                }
                f e11 = e(tVar, method, responseType);
                Call.Factory factory = tVar.f49536b;
                if (z12) {
                    if (z11) {
                        return new c(rVar, factory, e11, d11);
                    }
                    return new b(rVar, factory, e11, d11, false);
                }
                return new a(rVar, factory, e11, d11);
            }
            throw x.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        throw x.m(method, "'" + x.h(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // retrofit2.u
    public final ReturnT a(Object[] objArr) {
        return c(new m(this.f49394a, objArr, this.f49395b, this.f49396c), objArr);
    }

    protected abstract ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr);
}