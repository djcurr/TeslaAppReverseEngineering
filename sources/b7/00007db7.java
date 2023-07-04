package ka;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j implements ka.b {

    /* renamed from: a  reason: collision with root package name */
    private final h<a, Object> f34518a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    private final b f34519b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f34520c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, ka.a<?>> f34521d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f34522e;

    /* renamed from: f  reason: collision with root package name */
    private int f34523f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f34524a;

        /* renamed from: b  reason: collision with root package name */
        int f34525b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f34526c;

        a(b bVar) {
            this.f34524a = bVar;
        }

        @Override // ka.m
        public void a() {
            this.f34524a.c(this);
        }

        void b(int i11, Class<?> cls) {
            this.f34525b = i11;
            this.f34526c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f34525b == aVar.f34525b && this.f34526c == aVar.f34526c;
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f34525b * 31;
            Class<?> cls = this.f34526c;
            return i11 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f34525b + "array=" + this.f34526c + CoreConstants.CURLY_RIGHT;
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ka.d
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        a e(int i11, Class<?> cls) {
            a b11 = b();
            b11.b(i11, cls);
            return b11;
        }
    }

    public j(int i11) {
        this.f34522e = i11;
    }

    private void b(int i11, Class<?> cls) {
        NavigableMap<Integer, Integer> m11 = m(cls);
        Integer num = (Integer) m11.get(Integer.valueOf(i11));
        if (num != null) {
            if (num.intValue() == 1) {
                m11.remove(Integer.valueOf(i11));
                return;
            } else {
                m11.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i11 + ", this: " + this);
    }

    private void c() {
        h(this.f34522e);
    }

    private void h(int i11) {
        while (this.f34523f > i11) {
            Object f11 = this.f34518a.f();
            bb.j.d(f11);
            ka.a i12 = i(f11);
            this.f34523f -= i12.b(f11) * i12.a();
            b(i12.b(f11), f11.getClass());
            if (Log.isLoggable(i12.getTag(), 2)) {
                Log.v(i12.getTag(), "evicted: " + i12.b(f11));
            }
        }
    }

    private <T> ka.a<T> i(T t11) {
        return j(t11.getClass());
    }

    private <T> ka.a<T> j(Class<T> cls) {
        i iVar = (ka.a<T>) this.f34521d.get(cls);
        if (iVar == null) {
            if (cls.equals(int[].class)) {
                iVar = new i();
            } else if (cls.equals(byte[].class)) {
                iVar = new g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f34521d.put(cls, iVar);
        }
        return iVar;
    }

    private <T> T k(a aVar) {
        return (T) this.f34518a.a(aVar);
    }

    private <T> T l(a aVar, Class<T> cls) {
        ka.a<T> j11 = j(cls);
        T t11 = (T) k(aVar);
        if (t11 != null) {
            this.f34523f -= j11.b(t11) * j11.a();
            b(j11.b(t11), cls);
        }
        if (t11 == null) {
            if (Log.isLoggable(j11.getTag(), 2)) {
                Log.v(j11.getTag(), "Allocated " + aVar.f34525b + " bytes");
            }
            return j11.newArray(aVar.f34525b);
        }
        return t11;
    }

    private NavigableMap<Integer, Integer> m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f34520c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f34520c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private boolean n() {
        int i11 = this.f34523f;
        return i11 == 0 || this.f34522e / i11 >= 2;
    }

    private boolean o(int i11) {
        return i11 <= this.f34522e / 2;
    }

    private boolean p(int i11, Integer num) {
        return num != null && (n() || num.intValue() <= i11 * 8);
    }

    @Override // ka.b
    public synchronized void a(int i11) {
        try {
            if (i11 >= 40) {
                d();
            } else if (i11 >= 20 || i11 == 15) {
                h(this.f34522e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ka.b
    public synchronized void d() {
        h(0);
    }

    @Override // ka.b
    public synchronized <T> void e(T t11) {
        Class<?> cls = t11.getClass();
        ka.a<T> j11 = j(cls);
        int b11 = j11.b(t11);
        int a11 = j11.a() * b11;
        if (o(a11)) {
            a e11 = this.f34519b.e(b11, cls);
            this.f34518a.d(e11, t11);
            NavigableMap<Integer, Integer> m11 = m(cls);
            Integer num = (Integer) m11.get(Integer.valueOf(e11.f34525b));
            Integer valueOf = Integer.valueOf(e11.f34525b);
            int i11 = 1;
            if (num != null) {
                i11 = 1 + num.intValue();
            }
            m11.put(valueOf, Integer.valueOf(i11));
            this.f34523f += a11;
            c();
        }
    }

    @Override // ka.b
    public synchronized <T> T f(int i11, Class<T> cls) {
        a e11;
        Integer ceilingKey = m(cls).ceilingKey(Integer.valueOf(i11));
        if (p(i11, ceilingKey)) {
            e11 = this.f34519b.e(ceilingKey.intValue(), cls);
        } else {
            e11 = this.f34519b.e(i11, cls);
        }
        return (T) l(e11, cls);
    }

    @Override // ka.b
    public synchronized <T> T g(int i11, Class<T> cls) {
        return (T) l(this.f34519b.e(i11, cls), cls);
    }
}