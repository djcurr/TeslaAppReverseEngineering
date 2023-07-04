package u20;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.q;

/* loaded from: classes5.dex */
final class i<T> extends j<T> implements Iterator<T>, zz.d<b0>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private int f53059a;

    /* renamed from: b  reason: collision with root package name */
    private T f53060b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<? extends T> f53061c;

    /* renamed from: d  reason: collision with root package name */
    private zz.d<? super b0> f53062d;

    private final Throwable c() {
        int i11 = this.f53059a;
        if (i11 != 4) {
            if (i11 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f53059a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T e() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // u20.j
    public Object b(T t11, zz.d<? super b0> dVar) {
        Object d11;
        Object d12;
        Object d13;
        this.f53060b = t11;
        this.f53059a = 3;
        this.f53062d = dVar;
        d11 = a00.d.d();
        d12 = a00.d.d();
        if (d11 == d12) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d13 = a00.d.d();
        return d11 == d13 ? d11 : b0.f54756a;
    }

    public final void f(zz.d<? super b0> dVar) {
        this.f53062d = dVar;
    }

    @Override // zz.d
    public zz.g getContext() {
        return zz.h.f61280a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i11 = this.f53059a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return true;
                    }
                    if (i11 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator<? extends T> it2 = this.f53061c;
                s.e(it2);
                if (it2.hasNext()) {
                    this.f53059a = 2;
                    return true;
                }
                this.f53061c = null;
            }
            this.f53059a = 5;
            zz.d<? super b0> dVar = this.f53062d;
            s.e(dVar);
            this.f53062d = null;
            q.a aVar = vz.q.f54772b;
            dVar.resumeWith(vz.q.b(b0.f54756a));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i11 = this.f53059a;
        if (i11 == 0 || i11 == 1) {
            return e();
        }
        if (i11 == 2) {
            this.f53059a = 1;
            Iterator<? extends T> it2 = this.f53061c;
            s.e(it2);
            return it2.next();
        } else if (i11 == 3) {
            this.f53059a = 0;
            T t11 = this.f53060b;
            this.f53060b = null;
            return t11;
        } else {
            throw c();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        vz.r.b(obj);
        this.f53059a = 4;
    }
}