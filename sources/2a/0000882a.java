package my;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a */
    static final ky.h<Object, Object> f39640a = new j();

    /* renamed from: b */
    public static final Runnable f39641b = new g();

    /* renamed from: c */
    public static final ky.a f39642c = new d();

    /* renamed from: d */
    static final ky.f<Object> f39643d = new e();

    /* renamed from: e */
    public static final ky.f<Throwable> f39644e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: my.a$a */
    /* loaded from: classes5.dex */
    public static final class C0765a<T> implements ky.f<T> {

        /* renamed from: a */
        final ky.a f39645a;

        C0765a(ky.a aVar) {
            this.f39645a = aVar;
        }

        @Override // ky.f
        public void accept(T t11) {
            this.f39645a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b<T1, T2, R> implements ky.h<Object[], R> {

        /* renamed from: a */
        final ky.c<? super T1, ? super T2, ? extends R> f39646a;

        b(ky.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f39646a = cVar;
        }

        @Override // ky.h
        /* renamed from: a */
        public R apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f39646a.a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c<T1, T2, T3, R> implements ky.h<Object[], R> {

        /* renamed from: a */
        final ky.g<T1, T2, T3, R> f39647a;

        c(ky.g<T1, T2, T3, R> gVar) {
            this.f39647a = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ky.h
        /* renamed from: a */
        public R apply(Object[] objArr) {
            if (objArr.length == 3) {
                return (R) this.f39647a.a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* loaded from: classes5.dex */
    static final class d implements ky.a {
        d() {
        }

        @Override // ky.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* loaded from: classes5.dex */
    static final class e implements ky.f<Object> {
        e() {
        }

        @Override // ky.f
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* loaded from: classes5.dex */
    static final class f {
        f() {
        }
    }

    /* loaded from: classes5.dex */
    static final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* loaded from: classes5.dex */
    static final class h implements ky.f<Throwable> {
        h() {
        }

        @Override // ky.f
        /* renamed from: a */
        public void accept(Throwable th2) {
            az.a.r(th2);
        }
    }

    /* loaded from: classes5.dex */
    static final class i implements ky.i<Object> {
        i() {
        }

        @Override // ky.i
        public boolean test(Object obj) {
            return false;
        }
    }

    /* loaded from: classes5.dex */
    static final class j implements ky.h<Object, Object> {
        j() {
        }

        @Override // ky.h
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k<T, U> implements Callable<U>, ky.j<U>, ky.h<T, U> {

        /* renamed from: a */
        final U f39648a;

        k(U u11) {
            this.f39648a = u11;
        }

        @Override // ky.h
        public U apply(T t11) {
            return this.f39648a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f39648a;
        }

        @Override // ky.j
        public U get() {
            return this.f39648a;
        }
    }

    /* loaded from: classes5.dex */
    static final class l implements ky.f<b80.c> {
        l() {
        }

        @Override // ky.f
        /* renamed from: a */
        public void accept(b80.c cVar) {
            cVar.request(Long.MAX_VALUE);
        }
    }

    /* loaded from: classes5.dex */
    static final class m implements ky.j<Object> {
        m() {
        }

        @Override // ky.j
        public Object get() {
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static final class n implements ky.f<Throwable> {
        n() {
        }

        @Override // ky.f
        /* renamed from: a */
        public void accept(Throwable th2) {
            az.a.r(new OnErrorNotImplementedException(th2));
        }
    }

    /* loaded from: classes5.dex */
    static final class o implements ky.i<Object> {
        o() {
        }

        @Override // ky.i
        public boolean test(Object obj) {
            return true;
        }
    }

    static {
        new h();
        f39644e = new n();
        new f();
        new o();
        new i();
        new m();
        new l();
    }

    public static <T> ky.f<T> a(ky.a aVar) {
        return new C0765a(aVar);
    }

    public static <T> ky.f<T> b() {
        return (ky.f<T>) f39643d;
    }

    public static <T> ky.h<T, T> c() {
        return (ky.h<T, T>) f39640a;
    }

    public static <T> ky.j<T> d(T t11) {
        return new k(t11);
    }

    public static <T1, T2, R> ky.h<Object[], R> e(ky.c<? super T1, ? super T2, ? extends R> cVar) {
        return new b(cVar);
    }

    public static <T1, T2, T3, R> ky.h<Object[], R> f(ky.g<T1, T2, T3, R> gVar) {
        return new c(gVar);
    }
}