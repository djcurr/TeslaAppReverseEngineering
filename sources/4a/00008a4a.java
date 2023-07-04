package na;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import na.n;

/* loaded from: classes.dex */
public class r {

    /* renamed from: e  reason: collision with root package name */
    private static final c f40749e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final n<Object, Object> f40750f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<b<?, ?>> f40751a;

    /* renamed from: b  reason: collision with root package name */
    private final c f40752b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b<?, ?>> f40753c;

    /* renamed from: d  reason: collision with root package name */
    private final v3.f<List<Throwable>> f40754d;

    /* loaded from: classes.dex */
    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // na.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // na.n
        public n.a<Object> b(Object obj, int i11, int i12, ha.e eVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Model> f40755a;

        /* renamed from: b  reason: collision with root package name */
        final Class<Data> f40756b;

        /* renamed from: c  reason: collision with root package name */
        final o<? extends Model, ? extends Data> f40757c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f40755a = cls;
            this.f40756b = cls2;
            this.f40757c = oVar;
        }

        public boolean a(Class<?> cls) {
            return this.f40755a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f40756b.isAssignableFrom(cls2);
        }
    }

    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public <Model, Data> q<Model, Data> a(List<n<Model, Data>> list, v3.f<List<Throwable>> fVar) {
            return new q<>(list, fVar);
        }
    }

    public r(v3.f<List<Throwable>> fVar) {
        this(fVar, f40749e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar, boolean z11) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f40751a;
        list.add(z11 ? list.size() : 0, bVar);
    }

    private <Model, Data> n<Model, Data> e(b<?, ?> bVar) {
        return (n) bb.j.d(bVar.f40757c.c(this));
    }

    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f40750f;
    }

    private <Model, Data> o<Model, Data> h(b<?, ?> bVar) {
        return (o<Model, Data>) bVar.f40757c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model> List<n<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f40751a) {
                if (!this.f40753c.contains(bVar) && bVar.a(cls)) {
                    this.f40753c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f40753c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f40753c.clear();
            throw th2;
        }
        return arrayList;
    }

    public synchronized <Model, Data> n<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            for (b<?, ?> bVar : this.f40751a) {
                if (this.f40753c.contains(bVar)) {
                    z11 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f40753c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f40753c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f40752b.a(arrayList, this.f40754d);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z11) {
                return f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f40753c.clear();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f40751a) {
            if (!arrayList.contains(bVar.f40756b) && bVar.a(cls)) {
                arrayList.add(bVar.f40756b);
            }
        }
        return arrayList;
    }

    synchronized <Model, Data> List<o<? extends Model, ? extends Data>> i(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it2 = this.f40751a.iterator();
        while (it2.hasNext()) {
            b<?, ?> next = it2.next();
            if (next.b(cls, cls2)) {
                it2.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> j(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        List<o<? extends Model, ? extends Data>> i11;
        i11 = i(cls, cls2);
        b(cls, cls2, oVar);
        return i11;
    }

    r(v3.f<List<Throwable>> fVar, c cVar) {
        this.f40751a = new ArrayList();
        this.f40753c = new HashSet();
        this.f40754d = fVar;
        this.f40752b = cVar;
    }
}