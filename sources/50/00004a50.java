package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
abstract class c<T> {

    /* loaded from: classes2.dex */
    class a extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f20489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f20490b;

        a(Constructor constructor, Class cls) {
            this.f20489a = constructor;
            this.f20490b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f20489a.newInstance(null);
        }

        public String toString() {
            return this.f20490b.getName();
        }
    }

    /* loaded from: classes2.dex */
    class b extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f20491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f20492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f20493c;

        b(Method method, Object obj, Class cls) {
            this.f20491a = method;
            this.f20492b = obj;
            this.f20493c = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f20491a.invoke(this.f20492b, this.f20493c);
        }

        public String toString() {
            return this.f20493c.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0360c extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f20494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f20495b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f20496c;

        C0360c(Method method, Class cls, int i11) {
            this.f20494a = method;
            this.f20495b = cls;
            this.f20496c = i11;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f20494a.invoke(null, this.f20495b, Integer.valueOf(this.f20496c));
        }

        public String toString() {
            return this.f20495b.getName();
        }
    }

    /* loaded from: classes2.dex */
    class d extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f20497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f20498b;

        d(Method method, Class cls) {
            this.f20497a = method;
            this.f20498b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() {
            return (T) this.f20497a.invoke(null, this.f20498b, Object.class);
        }

        public String toString() {
            return this.f20498b.getName();
        }
    }

    c() {
    }

    public static <T> c<T> a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new C0360c(declaredMethod2, cls, intValue);
                    } catch (IllegalAccessException unused3) {
                        throw new AssertionError();
                    } catch (NoSuchMethodException unused4) {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod3.setAccessible(true);
                        return new d(declaredMethod3, cls);
                    } catch (InvocationTargetException e11) {
                        throw kr.b.r(e11);
                    }
                } catch (Exception unused5) {
                    throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                }
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T b();
}