package sy;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class k<T> extends hy.i<T> {

    /* renamed from: a  reason: collision with root package name */
    final T[] f50815a;

    /* loaded from: classes5.dex */
    static final class a<T> extends oy.c<T> {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super T> f50816a;

        /* renamed from: b  reason: collision with root package name */
        final T[] f50817b;

        /* renamed from: c  reason: collision with root package name */
        int f50818c;

        /* renamed from: d  reason: collision with root package name */
        boolean f50819d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f50820e;

        a(hy.k<? super T> kVar, T[] tArr) {
            this.f50816a = kVar;
            this.f50817b = tArr;
        }

        void a() {
            T[] tArr = this.f50817b;
            int length = tArr.length;
            for (int i11 = 0; i11 < length && !isDisposed(); i11++) {
                T t11 = tArr[i11];
                if (t11 == null) {
                    hy.k<? super T> kVar = this.f50816a;
                    kVar.onError(new NullPointerException("The element at index " + i11 + " is null"));
                    return;
                }
                this.f50816a.b(t11);
            }
            if (isDisposed()) {
                return;
            }
            this.f50816a.onComplete();
        }

        @Override // ny.h
        public void clear() {
            this.f50818c = this.f50817b.length;
        }

        @Override // iy.b
        public void dispose() {
            this.f50820e = true;
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50820e;
        }

        @Override // ny.h
        public boolean isEmpty() {
            return this.f50818c == this.f50817b.length;
        }

        @Override // ny.h
        public T poll() {
            int i11 = this.f50818c;
            T[] tArr = this.f50817b;
            if (i11 != tArr.length) {
                this.f50818c = i11 + 1;
                T t11 = tArr[i11];
                Objects.requireNonNull(t11, "The array element is null");
                return t11;
            }
            return null;
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            if ((i11 & 1) != 0) {
                this.f50819d = true;
                return 1;
            }
            return 0;
        }
    }

    public k(T[] tArr) {
        this.f50815a = tArr;
    }

    @Override // hy.i
    public void L(hy.k<? super T> kVar) {
        a aVar = new a(kVar, this.f50815a);
        kVar.a(aVar);
        if (aVar.f50819d) {
            return;
        }
        aVar.a();
    }
}