package z;

import android.util.Rational;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    private int f60029a;

    /* renamed from: b  reason: collision with root package name */
    private Rational f60030b;

    /* renamed from: c  reason: collision with root package name */
    private int f60031c;

    /* renamed from: d  reason: collision with root package name */
    private int f60032d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        private final Rational f60034b;

        /* renamed from: c  reason: collision with root package name */
        private final int f60035c;

        /* renamed from: a  reason: collision with root package name */
        private int f60033a = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f60036d = 0;

        public a(Rational rational, int i11) {
            this.f60034b = rational;
            this.f60035c = i11;
        }

        public z0 a() {
            v3.h.g(this.f60034b, "The crop aspect ratio must be set.");
            return new z0(this.f60033a, this.f60034b, this.f60035c, this.f60036d);
        }

        public a b(int i11) {
            this.f60036d = i11;
            return this;
        }

        public a c(int i11) {
            this.f60033a = i11;
            return this;
        }
    }

    z0(int i11, Rational rational, int i12, int i13) {
        this.f60029a = i11;
        this.f60030b = rational;
        this.f60031c = i12;
        this.f60032d = i13;
    }

    public Rational a() {
        return this.f60030b;
    }

    public int b() {
        return this.f60032d;
    }

    public int c() {
        return this.f60031c;
    }

    public int d() {
        return this.f60029a;
    }
}