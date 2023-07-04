package m1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
abstract class y<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final t<K, V> f38257a;

    /* renamed from: b  reason: collision with root package name */
    private final Iterator<Map.Entry<K, V>> f38258b;

    /* renamed from: c  reason: collision with root package name */
    private int f38259c;

    /* renamed from: d  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f38260d;

    /* renamed from: e  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f38261e;

    /* JADX WARN: Multi-variable type inference failed */
    public y(t<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        kotlin.jvm.internal.s.g(map, "map");
        kotlin.jvm.internal.s.g(iterator, "iterator");
        this.f38257a = map;
        this.f38258b = iterator;
        this.f38259c = map.h();
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f38260d = this.f38261e;
        this.f38261e = this.f38258b.hasNext() ? this.f38258b.next() : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> e() {
        return (Map.Entry<? extends K, ? extends V>) this.f38260d;
    }

    public final t<K, V> f() {
        return this.f38257a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> h() {
        return (Map.Entry<? extends K, ? extends V>) this.f38261e;
    }

    public final boolean hasNext() {
        return this.f38261e != null;
    }

    protected final void i(Map.Entry<? extends K, ? extends V> entry) {
        this.f38260d = entry;
    }

    public final void remove() {
        if (f().h() == this.f38259c) {
            Map.Entry<K, V> e11 = e();
            if (e11 != null) {
                f().remove(e11.getKey());
                i(null);
                vz.b0 b0Var = vz.b0.f54756a;
                this.f38259c = f().h();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}