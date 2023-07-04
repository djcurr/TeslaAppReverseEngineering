package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.a;
import retrofit2.c;
import retrofit2.f;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Method, u<?>> f49535a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    final Call.Factory f49536b;

    /* renamed from: c  reason: collision with root package name */
    final HttpUrl f49537c;

    /* renamed from: d  reason: collision with root package name */
    final List<f.a> f49538d;

    /* renamed from: e  reason: collision with root package name */
    final List<c.a> f49539e;

    /* renamed from: f  reason: collision with root package name */
    final Executor f49540f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f49541g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final p f49542a = p.f();

        /* renamed from: b  reason: collision with root package name */
        private final Object[] f49543b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f49544c;

        a(Class cls) {
            this.f49544c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f49543b;
            }
            if (this.f49542a.h(method)) {
                return this.f49542a.g(method, this.f49544c, obj, objArr);
            }
            return t.this.c(method).a(objArr);
        }
    }

    t(Call.Factory factory, HttpUrl httpUrl, List<f.a> list, List<c.a> list2, Executor executor, boolean z11) {
        this.f49536b = factory;
        this.f49537c = httpUrl;
        this.f49538d = list;
        this.f49539e = list2;
        this.f49540f = executor;
        this.f49541g = z11;
    }

    private void j(Class<?> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f49541g) {
                p f11 = p.f();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!f11.h(method) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    u<?> c(Method method) {
        u<?> uVar;
        u<?> uVar2 = this.f49535a.get(method);
        if (uVar2 != null) {
            return uVar2;
        }
        synchronized (this.f49535a) {
            uVar = this.f49535a.get(method);
            if (uVar == null) {
                uVar = u.b(this, method);
                this.f49535a.put(method, uVar);
            }
        }
        return uVar;
    }

    public c<?, ?> d(c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f49539e.indexOf(aVar) + 1;
        int size = this.f49539e.size();
        for (int i11 = indexOf; i11 < size; i11++) {
            c<?, ?> cVar = this.f49539e.get(i11).get(type, annotationArr, this);
            if (cVar != null) {
                return cVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < indexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f49539e.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f49539e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f49539e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, RequestBody> e(f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f49538d.indexOf(aVar) + 1;
        int size = this.f49538d.size();
        for (int i11 = indexOf; i11 < size; i11++) {
            f<T, RequestBody> fVar = (f<T, RequestBody>) this.f49538d.get(i11).c(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < indexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f49538d.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f49538d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f49538d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<ResponseBody, T> f(f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f49538d.indexOf(aVar) + 1;
        int size = this.f49538d.size();
        for (int i11 = indexOf; i11 < size; i11++) {
            f<ResponseBody, T> fVar = (f<ResponseBody, T>) this.f49538d.get(i11).d(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < indexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(this.f49538d.get(i12).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f49538d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f49538d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, RequestBody> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> f<ResponseBody, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> f<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f49538d.size();
        for (int i11 = 0; i11 < size; i11++) {
            f<T, String> fVar = (f<T, String>) this.f49538d.get(i11).e(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return a.d.f49372a;
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final p f49546a;

        /* renamed from: b  reason: collision with root package name */
        private Call.Factory f49547b;

        /* renamed from: c  reason: collision with root package name */
        private HttpUrl f49548c;

        /* renamed from: d  reason: collision with root package name */
        private final List<f.a> f49549d;

        /* renamed from: e  reason: collision with root package name */
        private final List<c.a> f49550e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f49551f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f49552g;

        b(p pVar) {
            this.f49549d = new ArrayList();
            this.f49550e = new ArrayList();
            this.f49546a = pVar;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.f49550e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(f.a aVar) {
            List<f.a> list = this.f49549d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(HttpUrl.get(str));
        }

        public b d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f49548c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public t e() {
            if (this.f49548c != null) {
                Call.Factory factory = this.f49547b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f49551f;
                if (executor == null) {
                    executor = this.f49546a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f49550e);
                arrayList.addAll(this.f49546a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f49549d.size() + 1 + this.f49546a.d());
                arrayList2.add(new retrofit2.a());
                arrayList2.addAll(this.f49549d);
                arrayList2.addAll(this.f49546a.c());
                return new t(factory2, this.f49548c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f49552g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f49547b = factory;
            return this;
        }

        public b g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }

        public b() {
            this(p.f());
        }
    }
}