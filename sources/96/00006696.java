package e1;

import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public interface c<E> extends List<E>, e1.b<E>, i00.a {

    /* loaded from: classes.dex */
    public static final class a {
        public static <E> c<E> a(c<? extends E> cVar, int i11, int i12) {
            s.g(cVar, "this");
            return new b(cVar, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b<E> extends wz.c<E> implements c<E> {

        /* renamed from: b  reason: collision with root package name */
        private final c<E> f24401b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24402c;

        /* renamed from: d  reason: collision with root package name */
        private final int f24403d;

        /* renamed from: e  reason: collision with root package name */
        private int f24404e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(c<? extends E> source, int i11, int i12) {
            s.g(source, "source");
            this.f24401b = source;
            this.f24402c = i11;
            this.f24403d = i12;
            i1.d.c(i11, i12, source.size());
            this.f24404e = i12 - i11;
        }

        @Override // wz.a
        public int b() {
            return this.f24404e;
        }

        @Override // wz.c, java.util.List
        /* renamed from: c */
        public c<E> subList(int i11, int i12) {
            i1.d.c(i11, i12, this.f24404e);
            c<E> cVar = this.f24401b;
            int i13 = this.f24402c;
            return new b(cVar, i11 + i13, i13 + i12);
        }

        @Override // wz.c, java.util.List
        public E get(int i11) {
            i1.d.a(i11, this.f24404e);
            return this.f24401b.get(this.f24402c + i11);
        }
    }
}