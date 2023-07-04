package xa;

import ha.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?>> f57357a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f57358a;

        /* renamed from: b  reason: collision with root package name */
        final g<T> f57359b;

        a(Class<T> cls, g<T> gVar) {
            this.f57358a = cls;
            this.f57359b = gVar;
        }

        boolean a(Class<?> cls) {
            return this.f57358a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, g<Z> gVar) {
        this.f57357a.add(new a<>(cls, gVar));
    }

    public synchronized <Z> g<Z> b(Class<Z> cls) {
        int size = this.f57357a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a<?> aVar = this.f57357a.get(i11);
            if (aVar.a(cls)) {
                return (g<Z>) aVar.f57359b;
            }
        }
        return null;
    }
}