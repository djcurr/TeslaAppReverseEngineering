package f1;

import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class k<E> extends a<E> {

    /* renamed from: c  reason: collision with root package name */
    private int f25506c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f25507d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] root, int i11, int i12, int i13) {
        super(i11, i12);
        s.g(root, "root");
        this.f25506c = i13;
        Object[] objArr = new Object[i13];
        this.f25507d = objArr;
        ?? r52 = i11 == i12 ? 1 : 0;
        this.f25508e = r52;
        objArr[0] = root;
        j(i11 - r52, 1);
    }

    private final E i() {
        Object obj = this.f25507d[this.f25506c - 1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[c() & 31];
    }

    private final void j(int i11, int i12) {
        int i13 = (this.f25506c - i12) * 5;
        while (i12 < this.f25506c) {
            Object[] objArr = this.f25507d;
            Object[] objArr2 = objArr[i12 - 1];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i12] = objArr2[l.a(i11, i13)];
            i13 -= 5;
            i12++;
        }
    }

    private final void k(int i11) {
        int i12 = 0;
        while (l.a(c(), i12) == i11) {
            i12 += 5;
        }
        if (i12 > 0) {
            j(c(), ((this.f25506c - 1) - (i12 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void m(Object[] root, int i11, int i12, int i13) {
        s.g(root, "root");
        f(i11);
        h(i12);
        this.f25506c = i13;
        if (this.f25507d.length < i13) {
            this.f25507d = new Object[i13];
        }
        this.f25507d[0] = root;
        ?? r02 = i11 == i12 ? 1 : 0;
        this.f25508e = r02;
        j(i11 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E i11 = i();
            f(c() + 1);
            if (c() == e()) {
                this.f25508e = true;
                return i11;
            }
            k(0);
            return i11;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            f(c() - 1);
            if (this.f25508e) {
                this.f25508e = false;
                return i();
            }
            k(31);
            return i();
        }
        throw new NoSuchElementException();
    }
}