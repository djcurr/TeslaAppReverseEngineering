package m1;

import e1.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m1.b0;
import m1.h;

/* loaded from: classes.dex */
public final class r<T> implements List<T>, b0, i00.d {

    /* renamed from: a  reason: collision with root package name */
    private c0 f38222a = new a(e1.a.b());

    /* loaded from: classes.dex */
    public static final class a<T> extends c0 {

        /* renamed from: c  reason: collision with root package name */
        private e1.e<? extends T> f38223c;

        /* renamed from: d  reason: collision with root package name */
        private int f38224d;

        public a(e1.e<? extends T> list) {
            kotlin.jvm.internal.s.g(list, "list");
            this.f38223c = list;
        }

        @Override // m1.c0
        public void a(c0 value) {
            Object obj;
            kotlin.jvm.internal.s.g(value, "value");
            obj = s.f38228a;
            synchronized (obj) {
                i(((a) value).g());
                j(((a) value).h());
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }

        @Override // m1.c0
        public c0 b() {
            return new a(this.f38223c);
        }

        public final e1.e<T> g() {
            return (e1.e<? extends T>) this.f38223c;
        }

        public final int h() {
            return this.f38224d;
        }

        public final void i(e1.e<? extends T> eVar) {
            kotlin.jvm.internal.s.g(eVar, "<set-?>");
            this.f38223c = eVar;
        }

        public final void j(int i11) {
            this.f38224d = i11;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<List<T>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f38225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Collection<T> f38226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i11, Collection<? extends T> collection) {
            super(1);
            this.f38225a = i11;
            this.f38226b = collection;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(List<T> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(it2.addAll(this.f38225a, this.f38226b));
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<List<T>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection<T> f38227a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f38227a = collection;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(List<T> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(it2.retainAll(this.f38227a));
        }
    }

    private final boolean j(h00.l<? super List<T>, Boolean> lVar) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        Boolean invoke;
        Object obj2;
        h a11;
        boolean z11;
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e.a<T> g12 = g11.g();
            invoke = lVar.invoke(g12);
            e1.e<T> build = g12.build();
            if (kotlin.jvm.internal.s.c(build, g11)) {
                break;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return invoke.booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t11) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        boolean z11;
        Object obj2;
        h a11;
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e1.e<T> add = g11.add((e1.e<T>) t11);
            z11 = false;
            if (kotlin.jvm.internal.s.c(add, g11)) {
                return false;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    if (aVar4.h() == h11) {
                        aVar4.i(add);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends T> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        return j(new b(i11, elements));
    }

    @Override // m1.b0
    public c0 b() {
        return this.f38222a;
    }

    @Override // m1.b0
    public c0 c(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        return b0.a.a(this, c0Var, c0Var2, c0Var3);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Object obj;
        h a11;
        obj = s.f38228a;
        synchronized (obj) {
            a aVar = (a) b();
            l.A();
            synchronized (l.z()) {
                a11 = h.f38186d.a();
                a aVar2 = (a) l.T(aVar, this, a11);
                aVar2.i(e1.a.b());
                aVar2.j(aVar2.h() + 1);
            }
            l.F(a11, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return h().g().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        return h().g().containsAll(elements);
    }

    @Override // m1.b0
    public void e(c0 value) {
        kotlin.jvm.internal.s.g(value, "value");
        value.e(b());
        this.f38222a = (a) value;
    }

    public final int f() {
        return ((a) l.x((a) b(), h.f38186d.a())).h();
    }

    @Override // java.util.List
    public T get(int i11) {
        return h().g().get(i11);
    }

    public final a<T> h() {
        return (a) l.K((a) b(), this);
    }

    public int i() {
        return h().g().size();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return h().g().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return h().g().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    public T k(int i11) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        Object obj2;
        h a11;
        boolean z11;
        T t11 = get(i11);
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e1.e<T> J = g11.J(i11);
            if (kotlin.jvm.internal.s.c(J, g11)) {
                break;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(J);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return t11;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return h().g().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new w(this, 0);
    }

    public final void m(int i11, int i12) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        Object obj2;
        h a11;
        boolean z11;
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e.a<T> g12 = g11.g();
            g12.subList(i11, i12).clear();
            e1.e<T> build = g12.build();
            if (kotlin.jvm.internal.s.c(build, g11)) {
                return;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
    }

    public final int n(Collection<? extends T> elements, int i11, int i12) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        Object obj2;
        h a11;
        boolean z11;
        kotlin.jvm.internal.s.g(elements, "elements");
        int size = size();
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e.a<T> g12 = g11.g();
            g12.subList(i11, i12).retainAll(elements);
            e1.e<T> build = g12.build();
            if (kotlin.jvm.internal.s.c(build, g11)) {
                break;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return size - size();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i11) {
        return k(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        boolean z11;
        Object obj2;
        h a11;
        kotlin.jvm.internal.s.g(elements, "elements");
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e1.e<T> removeAll = g11.removeAll((Collection<? extends T>) elements);
            z11 = false;
            if (kotlin.jvm.internal.s.c(removeAll, g11)) {
                return false;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    if (aVar4.h() == h11) {
                        aVar4.i(removeAll);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        return j(new c(elements));
    }

    @Override // java.util.List
    public T set(int i11, T t11) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        Object obj2;
        h a11;
        boolean z11;
        T t12 = get(i11);
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e1.e<T> eVar = g11.set(i11, (int) t11);
            if (kotlin.jvm.internal.s.c(eVar, g11)) {
                break;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(eVar);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return t12;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.List
    public List<T> subList(int i11, int i12) {
        boolean z11 = true;
        if (!(i11 >= 0 && i11 <= i12) || i12 > size()) {
            z11 = false;
        }
        if (z11) {
            return new d0(this, i11, i12);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.g(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        boolean z11;
        Object obj2;
        h a11;
        kotlin.jvm.internal.s.g(elements, "elements");
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e1.e<T> addAll = g11.addAll(elements);
            z11 = false;
            if (kotlin.jvm.internal.s.c(addAll, g11)) {
                return false;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    if (aVar4.h() == h11) {
                        aVar4.i(addAll);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i11) {
        return new w(this, i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        boolean z11;
        Object obj3;
        h a11;
        do {
            obj2 = s.f38228a;
            synchronized (obj2) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e1.e<T> remove = g11.remove((e1.e<T>) obj);
            z11 = false;
            if (kotlin.jvm.internal.s.c(remove, g11)) {
                return false;
            }
            obj3 = s.f38228a;
            synchronized (obj3) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    if (aVar4.h() == h11) {
                        aVar4.i(remove);
                        aVar4.j(aVar4.h() + 1);
                        z11 = true;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
        return true;
    }

    @Override // java.util.List
    public void add(int i11, T t11) {
        Object obj;
        h.a aVar;
        int h11;
        e1.e<T> g11;
        Object obj2;
        h a11;
        boolean z11;
        do {
            obj = s.f38228a;
            synchronized (obj) {
                aVar = h.f38186d;
                a aVar2 = (a) l.x((a) b(), aVar.a());
                h11 = aVar2.h();
                g11 = aVar2.g();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            kotlin.jvm.internal.s.e(g11);
            e1.e<T> add = g11.add(i11, (int) t11);
            if (kotlin.jvm.internal.s.c(add, g11)) {
                return;
            }
            obj2 = s.f38228a;
            synchronized (obj2) {
                a aVar3 = (a) b();
                l.A();
                synchronized (l.z()) {
                    a11 = aVar.a();
                    a aVar4 = (a) l.T(aVar3, this, a11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(add);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                l.F(a11, this);
            }
        } while (!z11);
    }
}