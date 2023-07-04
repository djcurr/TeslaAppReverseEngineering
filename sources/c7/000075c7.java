package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes5.dex */
final class e1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f30559a;

        a(b bVar) {
            this.f30559a = bVar;
        }

        @Override // java.util.Comparator
        public int compare(T t11, T t12) {
            int b11 = this.f30559a.b(t11) - this.f30559a.b(t12);
            return b11 != 0 ? b11 : t11.getClass().getName().compareTo(t12.getClass().getName());
        }
    }

    /* loaded from: classes5.dex */
    public interface b<T> {
        boolean a(T t11);

        int b(T t11);
    }

    private static <T> T a(Class<T> cls, Class<?> cls2) {
        try {
            return (T) cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
        }
    }

    static <T> Iterable<T> b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : iterable) {
            Object a11 = a(cls, cls2);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    public static <T> Iterable<T> c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T> List<T> e(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, b<T> bVar) {
        Iterable c11;
        if (d(classLoader)) {
            c11 = b(cls, iterable);
        } else {
            c11 = c(cls, classLoader);
        }
        ArrayList arrayList = new ArrayList();
        for (T t11 : c11) {
            if (bVar.a(t11)) {
                arrayList.add(t11);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a(bVar)));
        return Collections.unmodifiableList(arrayList);
    }
}