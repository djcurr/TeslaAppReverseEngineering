package s2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final u f50098a;

    /* renamed from: b  reason: collision with root package name */
    private int f50099b;

    /* renamed from: c  reason: collision with root package name */
    private int f50100c;

    /* renamed from: d  reason: collision with root package name */
    private int f50101d;

    /* renamed from: e  reason: collision with root package name */
    private int f50102e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    private g(n2.a aVar, long j11) {
        this.f50098a = new u(aVar.g());
        this.f50099b = n2.y.l(j11);
        this.f50100c = n2.y.k(j11);
        this.f50101d = -1;
        this.f50102e = -1;
        int l11 = n2.y.l(j11);
        int k11 = n2.y.k(j11);
        if (l11 >= 0 && l11 <= aVar.length()) {
            if (k11 < 0 || k11 > aVar.length()) {
                throw new IndexOutOfBoundsException("end (" + k11 + ") offset is outside of text region " + aVar.length());
            } else if (l11 <= k11) {
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + l11 + " > " + k11);
            }
        }
        throw new IndexOutOfBoundsException("start (" + l11 + ") offset is outside of text region " + aVar.length());
    }

    public /* synthetic */ g(n2.a aVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j11);
    }

    public final void a() {
        this.f50101d = -1;
        this.f50102e = -1;
    }

    public final void b(int i11, int i12) {
        long b11 = n2.z.b(i11, i12);
        this.f50098a.c(i11, i12, "");
        long a11 = h.a(n2.z.b(this.f50099b, this.f50100c), b11);
        this.f50099b = n2.y.l(a11);
        this.f50100c = n2.y.k(a11);
        if (j()) {
            long a12 = h.a(n2.z.b(this.f50101d, this.f50102e), b11);
            if (n2.y.h(a12)) {
                a();
                return;
            }
            this.f50101d = n2.y.l(a12);
            this.f50102e = n2.y.k(a12);
        }
    }

    public final char c(int i11) {
        return this.f50098a.a(i11);
    }

    public final int d() {
        return this.f50102e;
    }

    public final int e() {
        return this.f50101d;
    }

    public final int f() {
        int i11 = this.f50099b;
        int i12 = this.f50100c;
        if (i11 == i12) {
            return i12;
        }
        return -1;
    }

    public final int g() {
        return this.f50098a.b();
    }

    public final int h() {
        return this.f50100c;
    }

    public final int i() {
        return this.f50099b;
    }

    public final boolean j() {
        return this.f50101d != -1;
    }

    public final void k(int i11, int i12, String text) {
        kotlin.jvm.internal.s.g(text, "text");
        if (i11 >= 0 && i11 <= this.f50098a.b()) {
            if (i12 < 0 || i12 > this.f50098a.b()) {
                throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.f50098a.b());
            } else if (i11 <= i12) {
                this.f50098a.c(i11, i12, text);
                this.f50099b = text.length() + i11;
                this.f50100c = i11 + text.length();
                this.f50101d = -1;
                this.f50102e = -1;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + i11 + " > " + i12);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.f50098a.b());
    }

    public final void l(int i11, int i12) {
        if (i11 >= 0 && i11 <= this.f50098a.b()) {
            if (i12 < 0 || i12 > this.f50098a.b()) {
                throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.f50098a.b());
            } else if (i11 < i12) {
                this.f50101d = i11;
                this.f50102e = i12;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i11 + " > " + i12);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.f50098a.b());
    }

    public final void m(int i11) {
        n(i11, i11);
    }

    public final void n(int i11, int i12) {
        if (i11 >= 0 && i11 <= this.f50098a.b()) {
            if (i12 < 0 || i12 > this.f50098a.b()) {
                throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.f50098a.b());
            } else if (i11 <= i12) {
                this.f50099b = i11;
                this.f50100c = i12;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + i11 + " > " + i12);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.f50098a.b());
    }

    public final n2.a o() {
        return new n2.a(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.f50098a.toString();
    }
}