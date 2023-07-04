package cb;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final g<Object> f9034a = new C0178a();

    /* renamed from: cb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0178a implements g<Object> {
        C0178a() {
        }

        @Override // cb.a.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // cb.a.d
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // cb.a.g
        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e<T> implements v3.f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f9035a;

        /* renamed from: b  reason: collision with root package name */
        private final g<T> f9036b;

        /* renamed from: c  reason: collision with root package name */
        private final v3.f<T> f9037c;

        e(v3.f<T> fVar, d<T> dVar, g<T> gVar) {
            this.f9037c = fVar;
            this.f9035a = dVar;
            this.f9036b = gVar;
        }

        @Override // v3.f
        public boolean a(T t11) {
            if (t11 instanceof f) {
                ((f) t11).d().b(true);
            }
            this.f9036b.a(t11);
            return this.f9037c.a(t11);
        }

        @Override // v3.f
        public T b() {
            T b11 = this.f9037c.b();
            if (b11 == null) {
                b11 = this.f9035a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b11.getClass());
                }
            }
            if (b11 instanceof f) {
                ((f) b11).d().b(false);
            }
            return b11;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        cb.c d();
    }

    /* loaded from: classes.dex */
    public interface g<T> {
        void a(T t11);
    }

    private static <T extends f> v3.f<T> a(v3.f<T> fVar, d<T> dVar) {
        return b(fVar, dVar, c());
    }

    private static <T> v3.f<T> b(v3.f<T> fVar, d<T> dVar, g<T> gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) f9034a;
    }

    public static <T extends f> v3.f<T> d(int i11, d<T> dVar) {
        return a(new v3.g(i11), dVar);
    }

    public static <T> v3.f<List<T>> e() {
        return f(20);
    }

    public static <T> v3.f<List<T>> f(int i11) {
        return b(new v3.g(i11), new b(), new c());
    }
}