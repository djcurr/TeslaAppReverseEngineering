package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f2757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f2758b;

        a(h<T> hVar) {
            this.f2758b = hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2757a < this.f2758b.p();
        }

        @Override // java.util.Iterator
        public T next() {
            h hVar = this.f2758b;
            int i11 = this.f2757a;
            this.f2757a = i11 + 1;
            return (T) hVar.q(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> Iterator<T> a(h<T> receiver$0) {
        s.h(receiver$0, "receiver$0");
        return new a(receiver$0);
    }
}