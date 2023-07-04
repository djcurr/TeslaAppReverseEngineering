package xa;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<C1303a<?>> f57343a = new ArrayList();

    /* renamed from: xa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C1303a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f57344a;

        /* renamed from: b  reason: collision with root package name */
        final ha.a<T> f57345b;

        C1303a(Class<T> cls, ha.a<T> aVar) {
            this.f57344a = cls;
            this.f57345b = aVar;
        }

        boolean a(Class<?> cls) {
            return this.f57344a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, ha.a<T> aVar) {
        this.f57343a.add(new C1303a<>(cls, aVar));
    }

    public synchronized <T> ha.a<T> b(Class<T> cls) {
        for (C1303a<?> c1303a : this.f57343a) {
            if (c1303a.a(cls)) {
                return (ha.a<T>) c1303a.f57345b;
            }
        }
        return null;
    }
}