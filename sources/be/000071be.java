package h1;

import e1.g;
import g1.d;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.i;

/* loaded from: classes.dex */
public final class b<E> extends i<E> implements g<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f28536e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final b f28537f;

    /* renamed from: b  reason: collision with root package name */
    private final Object f28538b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f28539c;

    /* renamed from: d  reason: collision with root package name */
    private final d<E, h1.a> f28540d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> g<E> a() {
            return b.f28537f;
        }
    }

    static {
        i1.c cVar = i1.c.f29556a;
        f28537f = new b(cVar, cVar, d.f27313c.a());
    }

    public b(Object obj, Object obj2, d<E, h1.a> hashMap) {
        s.g(hashMap, "hashMap");
        this.f28538b = obj;
        this.f28539c = obj2;
        this.f28540d = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, e1.g
    public g<E> add(E e11) {
        if (this.f28540d.containsKey(e11)) {
            return this;
        }
        if (isEmpty()) {
            return new b(e11, e11, this.f28540d.r(e11, new h1.a()));
        }
        Object obj = this.f28539c;
        h1.a aVar = this.f28540d.get(obj);
        s.e(aVar);
        return new b(this.f28538b, e11, this.f28540d.r(obj, aVar.e(e11)).r(e11, new h1.a(obj)));
    }

    @Override // wz.a
    public int b() {
        return this.f28540d.size();
    }

    @Override // wz.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f28540d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new c(this.f28538b, this.f28540d);
    }

    @Override // java.util.Collection, java.util.Set, e1.g
    public g<E> remove(E e11) {
        h1.a aVar = this.f28540d.get(e11);
        if (aVar == null) {
            return this;
        }
        d<E, h1.a> s11 = this.f28540d.s(e11);
        if (aVar.b()) {
            h1.a aVar2 = s11.get(aVar.d());
            s.e(aVar2);
            s11 = s11.r(aVar.d(), aVar2.e(aVar.c()));
        }
        if (aVar.a()) {
            h1.a aVar3 = s11.get(aVar.c());
            s.e(aVar3);
            s11 = s11.r(aVar.c(), aVar3.f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f28538b, !aVar.a() ? aVar.d() : this.f28539c, s11);
    }
}