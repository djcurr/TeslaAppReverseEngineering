package g1;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> {

    /* renamed from: d  reason: collision with root package name */
    private final f<K, V> f27326d;

    /* renamed from: e  reason: collision with root package name */
    private K f27327e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27328f;

    /* renamed from: g  reason: collision with root package name */
    private int f27329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f<K, V> builder, TrieNodeBaseIterator<K, V, T>[] path) {
        super(builder.i(), path);
        kotlin.jvm.internal.s.g(builder, "builder");
        kotlin.jvm.internal.s.g(path, "path");
        this.f27326d = builder;
        this.f27329g = builder.h();
    }

    private final void i() {
        if (this.f27326d.h() != this.f27329g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j() {
        if (!this.f27328f) {
            throw new IllegalStateException();
        }
    }

    private final void k(int i11, t<?, ?> tVar, K k11, int i12) {
        int i13 = i12 * 5;
        if (i13 > 30) {
            e()[i12].m(tVar.p(), tVar.p().length, 0);
            while (!kotlin.jvm.internal.s.c(e()[i12].a(), k11)) {
                e()[i12].i();
            }
            h(i12);
            return;
        }
        int f11 = 1 << x.f(i11, i13);
        if (tVar.q(f11)) {
            e()[i12].m(tVar.p(), tVar.m() * 2, tVar.n(f11));
            h(i12);
            return;
        }
        int O = tVar.O(f11);
        t<?, ?> N = tVar.N(O);
        e()[i12].m(tVar.p(), tVar.m() * 2, O);
        k(i11, N, k11, i12 + 1);
    }

    public final void m(K k11, V v11) {
        if (this.f27326d.containsKey(k11)) {
            if (hasNext()) {
                K b11 = b();
                this.f27326d.put(k11, v11);
                k(b11 == null ? 0 : b11.hashCode(), this.f27326d.i(), b11, 0);
            } else {
                this.f27326d.put(k11, v11);
            }
            this.f27329g = this.f27326d.h();
        }
    }

    @Override // g1.e, java.util.Iterator
    public T next() {
        i();
        this.f27327e = b();
        this.f27328f = true;
        return (T) super.next();
    }

    @Override // g1.e, java.util.Iterator
    public void remove() {
        j();
        if (hasNext()) {
            K b11 = b();
            this.f27326d.remove(this.f27327e);
            k(b11 == null ? 0 : b11.hashCode(), this.f27326d.i(), b11, 0);
        } else {
            this.f27326d.remove(this.f27327e);
        }
        this.f27327e = null;
        this.f27328f = false;
        this.f27329g = this.f27326d.h();
    }
}