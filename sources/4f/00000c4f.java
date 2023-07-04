package bb;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, a<Y>> f7577a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    private long f7578b;

    /* renamed from: c  reason: collision with root package name */
    private long f7579c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        final Y f7580a;

        /* renamed from: b  reason: collision with root package name */
        final int f7581b;

        a(Y y11, int i11) {
            this.f7580a = y11;
            this.f7581b = i11;
        }
    }

    public g(long j11) {
        this.f7578b = j11;
    }

    private void f() {
        m(this.f7578b);
    }

    public void d() {
        m(0L);
    }

    public synchronized Y g(T t11) {
        a<Y> aVar;
        aVar = this.f7577a.get(t11);
        return aVar != null ? aVar.f7580a : null;
    }

    public synchronized long h() {
        return this.f7578b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int i(Y y11) {
        return 1;
    }

    protected void j(T t11, Y y11) {
    }

    public synchronized Y k(T t11, Y y11) {
        int i11 = i(y11);
        long j11 = i11;
        if (j11 >= this.f7578b) {
            j(t11, y11);
            return null;
        }
        if (y11 != null) {
            this.f7579c += j11;
        }
        a<Y> put = this.f7577a.put(t11, y11 == null ? null : new a<>(y11, i11));
        if (put != null) {
            this.f7579c -= put.f7581b;
            if (!put.f7580a.equals(y11)) {
                j(t11, put.f7580a);
            }
        }
        f();
        return put != null ? put.f7580a : null;
    }

    public synchronized Y l(T t11) {
        a<Y> remove = this.f7577a.remove(t11);
        if (remove == null) {
            return null;
        }
        this.f7579c -= remove.f7581b;
        return remove.f7580a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void m(long j11) {
        while (this.f7579c > j11) {
            Iterator<Map.Entry<T, a<Y>>> it2 = this.f7577a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it2.next();
            a<Y> value = next.getValue();
            this.f7579c -= value.f7581b;
            T key = next.getKey();
            it2.remove();
            j(key, value.f7580a);
        }
    }
}