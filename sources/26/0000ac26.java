package q00;

import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static t20.b<String, Object> f47128a;

    static {
        t20.b<String, Object> b11 = t20.b.b();
        kotlin.jvm.internal.s.f(b11, "HashPMap.empty<String, Any>()");
        f47128a = b11;
    }

    public static final <T> h<T> a(Class<T> jClass) {
        kotlin.jvm.internal.s.g(jClass, "jClass");
        String name = jClass.getName();
        Object c11 = f47128a.c(name);
        if (c11 instanceof WeakReference) {
            h<T> hVar = (h) ((WeakReference) c11).get();
            if (kotlin.jvm.internal.s.c(hVar != null ? hVar.d() : null, jClass)) {
                return hVar;
            }
        } else if (c11 != null) {
            for (WeakReference weakReference : (WeakReference[]) c11) {
                h<T> hVar2 = (h) weakReference.get();
                if (kotlin.jvm.internal.s.c(hVar2 != null ? hVar2.d() : null, jClass)) {
                    return hVar2;
                }
            }
            int length = ((Object[]) c11).length;
            WeakReference[] weakReferenceArr = new WeakReference[length + 1];
            System.arraycopy(c11, 0, weakReferenceArr, 0, length);
            h<T> hVar3 = new h<>(jClass);
            weakReferenceArr[length] = new WeakReference(hVar3);
            t20.b<String, Object> f11 = f47128a.f(name, weakReferenceArr);
            kotlin.jvm.internal.s.f(f11, "K_CLASS_CACHE.plus(name, newArray)");
            f47128a = f11;
            return hVar3;
        }
        h<T> hVar4 = new h<>(jClass);
        t20.b<String, Object> f12 = f47128a.f(name, new WeakReference(hVar4));
        kotlin.jvm.internal.s.f(f12, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        f47128a = f12;
        return hVar4;
    }
}