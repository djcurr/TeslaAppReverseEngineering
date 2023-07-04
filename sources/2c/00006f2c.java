package g1;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f27345a = t.f27337e.a().p();

    /* renamed from: b  reason: collision with root package name */
    private int f27346b;

    /* renamed from: c  reason: collision with root package name */
    private int f27347c;

    public final K a() {
        i1.a.a(f());
        return (K) this.f27345a[this.f27347c];
    }

    public final t<? extends K, ? extends V> b() {
        i1.a.a(h());
        Object obj = this.f27345a[this.f27347c];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] c() {
        return this.f27345a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int e() {
        return this.f27347c;
    }

    public final boolean f() {
        return this.f27347c < this.f27346b;
    }

    public final boolean h() {
        i1.a.a(this.f27347c >= this.f27346b);
        return this.f27347c < this.f27345a.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void i() {
        i1.a.a(f());
        this.f27347c += 2;
    }

    public final void j() {
        i1.a.a(h());
        this.f27347c++;
    }

    public final void k(Object[] buffer, int i11) {
        kotlin.jvm.internal.s.g(buffer, "buffer");
        m(buffer, i11, 0);
    }

    public final void m(Object[] buffer, int i11, int i12) {
        kotlin.jvm.internal.s.g(buffer, "buffer");
        this.f27345a = buffer;
        this.f27346b = i11;
        this.f27347c = i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(int i11) {
        this.f27347c = i11;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}