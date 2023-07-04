package na;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final r f40736a;

    /* renamed from: b  reason: collision with root package name */
    private final a f40737b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, C0801a<?>> f40738a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: na.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0801a<Model> {

            /* renamed from: a  reason: collision with root package name */
            final List<n<Model, ?>> f40739a;

            public C0801a(List<n<Model, ?>> list) {
                this.f40739a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f40738a.clear();
        }

        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0801a<?> c0801a = this.f40738a.get(cls);
            if (c0801a == null) {
                return null;
            }
            return (List<n<Model, ?>>) c0801a.f40739a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f40738a.put(cls, new C0801a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(v3.f<List<Throwable>> fVar) {
        this(new r(fVar));
    }

    private static <A> Class<A> b(A a11) {
        return (Class<A>) a11.getClass();
    }

    private synchronized <A> List<n<A, ?>> e(Class<A> cls) {
        List<n<A, ?>> b11;
        b11 = this.f40737b.b(cls);
        if (b11 == null) {
            b11 = Collections.unmodifiableList(this.f40736a.c(cls));
            this.f40737b.c(cls, b11);
        }
        return b11;
    }

    private <Model, Data> void g(List<o<? extends Model, ? extends Data>> list) {
        for (o<? extends Model, ? extends Data> oVar : list) {
            oVar.a();
        }
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.f40736a.b(cls, cls2, oVar);
        this.f40737b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f40736a.g(cls);
    }

    public <A> List<n<A, ?>> d(A a11) {
        List<n<A, ?>> e11 = e(b(a11));
        if (!e11.isEmpty()) {
            int size = e11.size();
            List<n<A, ?>> emptyList = Collections.emptyList();
            boolean z11 = true;
            for (int i11 = 0; i11 < size; i11++) {
                n<A, ?> nVar = e11.get(i11);
                if (nVar.a(a11)) {
                    if (z11) {
                        emptyList = new ArrayList<>(size - i11);
                        z11 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (emptyList.isEmpty()) {
                throw new Registry.NoModelLoaderAvailableException(a11, e11);
            }
            return emptyList;
        }
        throw new Registry.NoModelLoaderAvailableException(a11);
    }

    public synchronized <Model, Data> void f(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        g(this.f40736a.j(cls, cls2, oVar));
        this.f40737b.a();
    }

    private p(r rVar) {
        this.f40737b = new a();
        this.f40736a = rVar;
    }
}