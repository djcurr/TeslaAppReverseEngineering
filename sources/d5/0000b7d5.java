package ul;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class a implements e {
    @Override // ul.e
    public <T> T a(Class<T> cls) {
        sm.b<T> d11 = d(cls);
        if (d11 == null) {
            return null;
        }
        return d11.get();
    }

    @Override // ul.e
    public <T> Set<T> c(Class<T> cls) {
        return b(cls).get();
    }
}