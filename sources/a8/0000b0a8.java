package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class o<T> {

    /* loaded from: classes4.dex */
    class a extends o<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d */
        public void a(retrofit2.q qVar, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            for (T t11 : iterable) {
                o.this.a(qVar, t11);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends o<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.o
        void a(retrofit2.q qVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i11 = 0; i11 < length; i11++) {
                o.this.a(qVar, Array.get(obj, i11));
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49434a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49435b;

        /* renamed from: c  reason: collision with root package name */
        private final retrofit2.f<T, RequestBody> f49436c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Method method, int i11, retrofit2.f<T, RequestBody> fVar) {
            this.f49434a = method;
            this.f49435b = i11;
            this.f49436c = fVar;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            if (t11 != null) {
                try {
                    qVar.l(this.f49436c.convert(t11));
                    return;
                } catch (IOException e11) {
                    Method method = this.f49434a;
                    int i11 = this.f49435b;
                    throw x.p(method, e11, i11, "Unable to convert " + t11 + " to RequestBody", new Object[0]);
                }
            }
            throw x.o(this.f49434a, this.f49435b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class d<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f49437a;

        /* renamed from: b  reason: collision with root package name */
        private final retrofit2.f<T, String> f49438b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f49439c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, retrofit2.f<T, String> fVar, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.f49437a = str;
            this.f49438b = fVar;
            this.f49439c = z11;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            String convert;
            if (t11 == null || (convert = this.f49438b.convert(t11)) == null) {
                return;
            }
            qVar.a(this.f49437a, convert, this.f49439c);
        }
    }

    /* loaded from: classes4.dex */
    static final class e<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49440a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49441b;

        /* renamed from: c  reason: collision with root package name */
        private final retrofit2.f<T, String> f49442c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f49443d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Method method, int i11, retrofit2.f<T, String> fVar, boolean z11) {
            this.f49440a = method;
            this.f49441b = i11;
            this.f49442c = fVar;
            this.f49443d = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d */
        public void a(retrofit2.q qVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.f49442c.convert(value);
                            if (convert != null) {
                                qVar.a(key, convert, this.f49443d);
                            } else {
                                Method method = this.f49440a;
                                int i11 = this.f49441b;
                                throw x.o(method, i11, "Field map value '" + value + "' converted to null by " + this.f49442c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f49440a;
                            int i12 = this.f49441b;
                            throw x.o(method2, i12, "Field map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f49440a, this.f49441b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f49440a, this.f49441b, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class f<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f49444a;

        /* renamed from: b  reason: collision with root package name */
        private final retrofit2.f<T, String> f49445b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(String str, retrofit2.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f49444a = str;
            this.f49445b = fVar;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            String convert;
            if (t11 == null || (convert = this.f49445b.convert(t11)) == null) {
                return;
            }
            qVar.b(this.f49444a, convert);
        }
    }

    /* loaded from: classes4.dex */
    static final class g<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49446a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49447b;

        /* renamed from: c  reason: collision with root package name */
        private final retrofit2.f<T, String> f49448c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Method method, int i11, retrofit2.f<T, String> fVar) {
            this.f49446a = method;
            this.f49447b = i11;
            this.f49448c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d */
        public void a(retrofit2.q qVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            qVar.b(key, this.f49448c.convert(value));
                        } else {
                            Method method = this.f49446a;
                            int i11 = this.f49447b;
                            throw x.o(method, i11, "Header map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f49446a, this.f49447b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f49446a, this.f49447b, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends o<Headers> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49449a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49450b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(Method method, int i11) {
            this.f49449a = method;
            this.f49450b = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d */
        public void a(retrofit2.q qVar, Headers headers) {
            if (headers != null) {
                qVar.c(headers);
                return;
            }
            throw x.o(this.f49449a, this.f49450b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class i<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49451a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49452b;

        /* renamed from: c  reason: collision with root package name */
        private final Headers f49453c;

        /* renamed from: d  reason: collision with root package name */
        private final retrofit2.f<T, RequestBody> f49454d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public i(Method method, int i11, Headers headers, retrofit2.f<T, RequestBody> fVar) {
            this.f49451a = method;
            this.f49452b = i11;
            this.f49453c = headers;
            this.f49454d = fVar;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            if (t11 == null) {
                return;
            }
            try {
                qVar.d(this.f49453c, this.f49454d.convert(t11));
            } catch (IOException e11) {
                Method method = this.f49451a;
                int i11 = this.f49452b;
                throw x.o(method, i11, "Unable to convert " + t11 + " to RequestBody", e11);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class j<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49455a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49456b;

        /* renamed from: c  reason: collision with root package name */
        private final retrofit2.f<T, RequestBody> f49457c;

        /* renamed from: d  reason: collision with root package name */
        private final String f49458d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(Method method, int i11, retrofit2.f<T, RequestBody> fVar, String str) {
            this.f49455a = method;
            this.f49456b = i11;
            this.f49457c = fVar;
            this.f49458d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d */
        public void a(retrofit2.q qVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            qVar.d(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f49458d), this.f49457c.convert(value));
                        } else {
                            Method method = this.f49455a;
                            int i11 = this.f49456b;
                            throw x.o(method, i11, "Part map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f49455a, this.f49456b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f49455a, this.f49456b, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class k<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49459a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49460b;

        /* renamed from: c  reason: collision with root package name */
        private final String f49461c;

        /* renamed from: d  reason: collision with root package name */
        private final retrofit2.f<T, String> f49462d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f49463e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public k(Method method, int i11, String str, retrofit2.f<T, String> fVar, boolean z11) {
            this.f49459a = method;
            this.f49460b = i11;
            Objects.requireNonNull(str, "name == null");
            this.f49461c = str;
            this.f49462d = fVar;
            this.f49463e = z11;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            if (t11 != null) {
                qVar.f(this.f49461c, this.f49462d.convert(t11), this.f49463e);
                return;
            }
            Method method = this.f49459a;
            int i11 = this.f49460b;
            throw x.o(method, i11, "Path parameter \"" + this.f49461c + "\" value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class l<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f49464a;

        /* renamed from: b  reason: collision with root package name */
        private final retrofit2.f<T, String> f49465b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f49466c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public l(String str, retrofit2.f<T, String> fVar, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.f49464a = str;
            this.f49465b = fVar;
            this.f49466c = z11;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            String convert;
            if (t11 == null || (convert = this.f49465b.convert(t11)) == null) {
                return;
            }
            qVar.g(this.f49464a, convert, this.f49466c);
        }
    }

    /* loaded from: classes4.dex */
    static final class m<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49467a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49468b;

        /* renamed from: c  reason: collision with root package name */
        private final retrofit2.f<T, String> f49469c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f49470d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public m(Method method, int i11, retrofit2.f<T, String> fVar, boolean z11) {
            this.f49467a = method;
            this.f49468b = i11;
            this.f49469c = fVar;
            this.f49470d = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d */
        public void a(retrofit2.q qVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.f49469c.convert(value);
                            if (convert != null) {
                                qVar.g(key, convert, this.f49470d);
                            } else {
                                Method method = this.f49467a;
                                int i11 = this.f49468b;
                                throw x.o(method, i11, "Query map value '" + value + "' converted to null by " + this.f49469c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f49467a;
                            int i12 = this.f49468b;
                            throw x.o(method2, i12, "Query map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f49467a, this.f49468b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f49467a, this.f49468b, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class n<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final retrofit2.f<T, String> f49471a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f49472b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public n(retrofit2.f<T, String> fVar, boolean z11) {
            this.f49471a = fVar;
            this.f49472b = z11;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            if (t11 == null) {
                return;
            }
            qVar.g(this.f49471a.convert(t11), null, this.f49472b);
        }
    }

    /* renamed from: retrofit2.o$o  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C1080o extends o<MultipartBody.Part> {

        /* renamed from: a  reason: collision with root package name */
        static final C1080o f49473a = new C1080o();

        private C1080o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.o
        /* renamed from: d */
        public void a(retrofit2.q qVar, MultipartBody.Part part) {
            if (part != null) {
                qVar.e(part);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends o<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final Method f49474a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49475b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public p(Method method, int i11) {
            this.f49474a = method;
            this.f49475b = i11;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, Object obj) {
            if (obj != null) {
                qVar.m(obj);
                return;
            }
            throw x.o(this.f49474a, this.f49475b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class q<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        final Class<T> f49476a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public q(Class<T> cls) {
            this.f49476a = cls;
        }

        @Override // retrofit2.o
        void a(retrofit2.q qVar, T t11) {
            qVar.h(this.f49476a, t11);
        }
    }

    o() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(retrofit2.q qVar, T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o<Object> b() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o<Iterable<T>> c() {
        return new a();
    }
}