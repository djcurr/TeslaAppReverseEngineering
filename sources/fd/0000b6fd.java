package u20;

import java.util.Iterator;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class n extends m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f53064a;

        public a(Iterator it2) {
            this.f53064a = it2;
        }

        @Override // u20.h
        public Iterator<T> iterator() {
            return this.f53064a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class b<T> extends u implements h00.l<h<? extends T>, Iterator<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f53065a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Iterator<T> invoke(h<? extends T> it2) {
            s.g(it2, "it");
            return (Iterator<? extends T>) it2.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class c<T> extends u implements h00.l<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53066a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Iterator<T> invoke(Iterable<? extends T> it2) {
            s.g(it2, "it");
            return (Iterator<? extends T>) it2.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class d<T> extends u implements h00.l<T, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f53067a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        public final T invoke(T t11) {
            return t11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class e<T> extends u implements h00.l<T, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<T> f53068a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(h00.a<? extends T> aVar) {
            super(1);
            this.f53068a = aVar;
        }

        @Override // h00.l
        public final T invoke(T it2) {
            s.g(it2, "it");
            return this.f53068a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class f<T> extends u implements h00.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f53069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t11) {
            super(0);
            this.f53069a = t11;
        }

        @Override // h00.a
        public final T invoke() {
            return this.f53069a;
        }
    }

    public static <T> h<T> c(Iterator<? extends T> it2) {
        h<T> d11;
        s.g(it2, "<this>");
        d11 = d(new a(it2));
        return d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> h<T> d(h<? extends T> hVar) {
        s.g(hVar, "<this>");
        return hVar instanceof u20.a ? hVar : new u20.a(hVar);
    }

    public static <T> h<T> e() {
        return u20.d.f53040a;
    }

    public static final <T> h<T> f(h<? extends h<? extends T>> hVar) {
        s.g(hVar, "<this>");
        return g(hVar, b.f53065a);
    }

    private static final <T, R> h<R> g(h<? extends T> hVar, h00.l<? super T, ? extends Iterator<? extends R>> lVar) {
        if (hVar instanceof r) {
            return ((r) hVar).d(lVar);
        }
        return new u20.f(hVar, d.f53067a, lVar);
    }

    public static <T> h<T> h(h<? extends Iterable<? extends T>> hVar) {
        s.g(hVar, "<this>");
        return g(hVar, c.f53066a);
    }

    public static <T> h<T> i(h00.a<? extends T> nextFunction) {
        h<T> d11;
        s.g(nextFunction, "nextFunction");
        d11 = d(new g(nextFunction, new e(nextFunction)));
        return d11;
    }

    public static <T> h<T> j(h00.a<? extends T> seedFunction, h00.l<? super T, ? extends T> nextFunction) {
        s.g(seedFunction, "seedFunction");
        s.g(nextFunction, "nextFunction");
        return new g(seedFunction, nextFunction);
    }

    public static <T> h<T> k(T t11, h00.l<? super T, ? extends T> nextFunction) {
        s.g(nextFunction, "nextFunction");
        if (t11 == null) {
            return u20.d.f53040a;
        }
        return new g(new f(t11), nextFunction);
    }

    public static <T> h<T> l(T... elements) {
        h<T> B;
        h<T> e11;
        s.g(elements, "elements");
        if (elements.length == 0) {
            e11 = e();
            return e11;
        }
        B = wz.p.B(elements);
        return B;
    }
}