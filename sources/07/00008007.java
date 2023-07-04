package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import vz.q;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final int f35476a = f(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    private static final h f35477b;

    /* loaded from: classes5.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((Constructor) t12).getParameterTypes().length), Integer.valueOf(((Constructor) t11).getParameterTypes().length));
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35478a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Void invoke(Throwable th2) {
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f35479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f35479a = constructor;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object b11;
            Object newInstance;
            try {
                q.a aVar = vz.q.f54772b;
                newInstance = this.f35479a.newInstance(th2.getMessage(), th2);
            } catch (Throwable th3) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th3));
            }
            if (newInstance != null) {
                b11 = vz.q.b((Throwable) newInstance);
                if (vz.q.g(b11)) {
                    b11 = null;
                }
                return (Throwable) b11;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f35480a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f35480a = constructor;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object b11;
            Object newInstance;
            try {
                q.a aVar = vz.q.f54772b;
                newInstance = this.f35480a.newInstance(th2);
            } catch (Throwable th3) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th3));
            }
            if (newInstance != null) {
                b11 = vz.q.b((Throwable) newInstance);
                if (vz.q.g(b11)) {
                    b11 = null;
                }
                return (Throwable) b11;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f35481a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f35481a = constructor;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object b11;
            Object newInstance;
            try {
                q.a aVar = vz.q.f54772b;
                newInstance = this.f35481a.newInstance(th2.getMessage());
            } catch (Throwable th3) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                b11 = vz.q.b(th4);
                if (vz.q.g(b11)) {
                    b11 = null;
                }
                return (Throwable) b11;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f35482a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f35482a = constructor;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object b11;
            Object newInstance;
            try {
                q.a aVar = vz.q.f54772b;
                newInstance = this.f35482a.newInstance(new Object[0]);
            } catch (Throwable th3) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                b11 = vz.q.b(th4);
                if (vz.q.g(b11)) {
                    b11 = null;
                }
                return (Throwable) b11;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    static {
        h hVar;
        try {
            hVar = m.a() ? n0.f35490a : kotlinx.coroutines.internal.e.f35454a;
        } catch (Throwable unused) {
            hVar = n0.f35490a;
        }
        f35477b = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> h00.l<Throwable, Throwable> b(Class<E> cls) {
        List<Constructor> k02;
        b bVar = b.f35478a;
        if (f35476a != f(cls, 0)) {
            return bVar;
        }
        k02 = wz.p.k0(cls.getConstructors(), new a());
        for (Constructor constructor : k02) {
            h00.l<Throwable, Throwable> c11 = c(constructor);
            if (c11 != null) {
                return c11;
            }
        }
        return bVar;
    }

    private static final h00.l<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && kotlin.jvm.internal.s.c(parameterTypes[0], String.class) && kotlin.jvm.internal.s.c(parameterTypes[1], Throwable.class)) {
                    return new c(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (kotlin.jvm.internal.s.c(cls, Throwable.class)) {
                return new d(constructor);
            }
            if (kotlin.jvm.internal.s.c(cls, String.class)) {
                return new e(constructor);
            }
            return null;
        }
        return new f(constructor);
    }

    private static final int d(Class<?> cls, int i11) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                Field field = declaredFields[i12];
                i12++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i13++;
                }
            }
            i11 += i13;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i11;
    }

    static /* synthetic */ int e(Class cls, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return d(cls, i11);
    }

    private static final int f(Class<?> cls, int i11) {
        Integer b11;
        g00.a.e(cls);
        try {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        Integer valueOf = Integer.valueOf(i11);
        if (vz.q.g(b11)) {
            b11 = valueOf;
        }
        return ((Number) b11).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E g(E e11) {
        Object b11;
        if (e11 instanceof v20.h0) {
            try {
                q.a aVar = vz.q.f54772b;
                b11 = vz.q.b(((v20.h0) e11).a());
            } catch (Throwable th2) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th2));
            }
            if (vz.q.g(b11)) {
                b11 = null;
            }
            return (E) b11;
        }
        return (E) f35477b.a(e11.getClass()).invoke(e11);
    }
}