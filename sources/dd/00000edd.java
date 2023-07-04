package c1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class d0 implements Iterator<n1.b>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final i1 f8444a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8445b;

    /* renamed from: c  reason: collision with root package name */
    private int f8446c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8447d;

    /* loaded from: classes.dex */
    public static final class a implements n1.b, Iterable<n1.b>, i00.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8449b;

        a(int i11) {
            this.f8449b = i11;
        }

        @Override // java.lang.Iterable
        public Iterator<n1.b> iterator() {
            int z11;
            d0.this.e();
            i1 b11 = d0.this.b();
            int i11 = this.f8449b;
            z11 = j1.z(d0.this.b().h(), this.f8449b);
            return new d0(b11, i11 + 1, i11 + z11);
        }
    }

    public d0(i1 table, int i11, int i12) {
        kotlin.jvm.internal.s.g(table, "table");
        this.f8444a = table;
        this.f8445b = i12;
        this.f8446c = i11;
        this.f8447d = table.m();
        if (table.n()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        if (this.f8444a.m() != this.f8447d) {
            throw new ConcurrentModificationException();
        }
    }

    public final i1 b() {
        return this.f8444a;
    }

    @Override // java.util.Iterator
    /* renamed from: c */
    public n1.b next() {
        int z11;
        e();
        int i11 = this.f8446c;
        z11 = j1.z(this.f8444a.h(), i11);
        this.f8446c = z11 + i11;
        return new a(i11);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8446c < this.f8445b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}