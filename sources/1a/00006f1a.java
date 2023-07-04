package g1;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final TrieNodeBaseIterator<K, V, T>[] f27317a;

    /* renamed from: b  reason: collision with root package name */
    private int f27318b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27319c;

    public e(t<K, V> node, TrieNodeBaseIterator<K, V, T>[] path) {
        kotlin.jvm.internal.s.g(node, "node");
        kotlin.jvm.internal.s.g(path, "path");
        this.f27317a = path;
        this.f27319c = true;
        path[0].k(node.p(), node.m() * 2);
        this.f27318b = 0;
        c();
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void c() {
        if (this.f27317a[this.f27318b].f()) {
            return;
        }
        int i11 = this.f27318b;
        if (i11 >= 0) {
            while (true) {
                int i12 = i11 - 1;
                int f11 = f(i11);
                if (f11 == -1 && this.f27317a[i11].h()) {
                    this.f27317a[i11].j();
                    f11 = f(i11);
                }
                if (f11 != -1) {
                    this.f27318b = f11;
                    return;
                }
                if (i11 > 0) {
                    this.f27317a[i11 - 1].j();
                }
                this.f27317a[i11].k(t.f27337e.a().p(), 0);
                if (i12 < 0) {
                    break;
                }
                i11 = i12;
            }
        }
        this.f27319c = false;
    }

    private final int f(int i11) {
        if (this.f27317a[i11].f()) {
            return i11;
        }
        if (this.f27317a[i11].h()) {
            t<? extends K, ? extends V> b11 = this.f27317a[i11].b();
            if (i11 == 6) {
                this.f27317a[i11 + 1].k(b11.p(), b11.p().length);
            } else {
                this.f27317a[i11 + 1].k(b11.p(), b11.m() * 2);
            }
            return f(i11 + 1);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final K b() {
        a();
        return (K) this.f27317a[this.f27318b].a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TrieNodeBaseIterator<K, V, T>[] e() {
        return this.f27317a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i11) {
        this.f27318b = i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27319c;
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        T t11 = (T) this.f27317a[this.f27318b].next();
        c();
        return t11;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}