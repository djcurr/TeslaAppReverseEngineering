package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import v20.l2;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f35522a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f35523b;

    /* renamed from: c  reason: collision with root package name */
    public static final l2 f35524c;

    static {
        w wVar = new w();
        f35522a = wVar;
        f35523b = g0.e("kotlinx.coroutines.fast.service.loader", true);
        f35524c = wVar.a();
    }

    private w() {
    }

    private final l2 a() {
        u20.h c11;
        List<MainDispatcherFactory> I;
        Object next;
        try {
            if (f35523b) {
                I = l.f35484a.c();
            } else {
                c11 = u20.n.c(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                I = u20.p.I(c11);
            }
            Iterator<T> it2 = I.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it2.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            l2 e11 = mainDispatcherFactory == null ? null : x.e(mainDispatcherFactory, I);
            return e11 == null ? x.b(null, null, 3, null) : e11;
        } catch (Throwable th2) {
            return x.b(th2, null, 2, null);
        }
    }
}