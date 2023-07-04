package on;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public abstract class m {

    /* loaded from: classes2.dex */
    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f42836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f42837b;

        a(Method method, Object obj) {
            this.f42836a = method;
            this.f42837b = obj;
        }

        @Override // on.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f42836a.invoke(this.f42837b, cls);
        }
    }

    /* loaded from: classes2.dex */
    class b extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f42838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42839b;

        b(Method method, int i11) {
            this.f42838a = method;
            this.f42839b = i11;
        }

        @Override // on.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f42838a.invoke(null, cls, Integer.valueOf(this.f42839b));
        }
    }

    /* loaded from: classes2.dex */
    class c extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f42840a;

        c(Method method) {
            this.f42840a = method;
        }

        @Override // on.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f42840a.invoke(null, cls, Object.class);
        }
    }

    /* loaded from: classes2.dex */
    class d extends m {
        d() {
        }

        @Override // on.m
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (Modifier.isAbstract(modifiers)) {
                throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
            }
            return;
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    public static m b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}