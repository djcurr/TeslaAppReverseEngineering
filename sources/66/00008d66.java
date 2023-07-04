package o1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import o1.a;
import x2.l;
import x2.o;
import x2.q;

/* loaded from: classes.dex */
public final class b implements o1.a {

    /* renamed from: b  reason: collision with root package name */
    private final float f42052b;

    /* renamed from: c  reason: collision with root package name */
    private final float f42053c;

    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private final float f42054a;

        public a(float f11) {
            this.f42054a = f11;
        }

        @Override // o1.a.b
        public int a(int i11, int i12, q layoutDirection) {
            int c11;
            s.g(layoutDirection, "layoutDirection");
            c11 = j00.c.c(((i12 - i11) / 2.0f) * (1 + (layoutDirection == q.Ltr ? this.f42054a : (-1) * this.f42054a)));
            return c11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.c(Float.valueOf(this.f42054a), Float.valueOf(((a) obj).f42054a));
        }

        public int hashCode() {
            return Float.hashCode(this.f42054a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f42054a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* renamed from: o1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0827b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final float f42055a;

        public C0827b(float f11) {
            this.f42055a = f11;
        }

        @Override // o1.a.c
        public int a(int i11, int i12) {
            int c11;
            c11 = j00.c.c(((i12 - i11) / 2.0f) * (1 + this.f42055a));
            return c11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0827b) && s.c(Float.valueOf(this.f42055a), Float.valueOf(((C0827b) obj).f42055a));
        }

        public int hashCode() {
            return Float.hashCode(this.f42055a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f42055a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public b(float f11, float f12) {
        this.f42052b = f11;
        this.f42053c = f12;
    }

    @Override // o1.a
    public long a(long j11, long j12, q layoutDirection) {
        float f11;
        int c11;
        int c12;
        s.g(layoutDirection, "layoutDirection");
        float g11 = (o.g(j12) - o.g(j11)) / 2.0f;
        float f12 = (o.f(j12) - o.f(j11)) / 2.0f;
        if (layoutDirection == q.Ltr) {
            f11 = this.f42052b;
        } else {
            f11 = (-1) * this.f42052b;
        }
        float f13 = 1;
        c11 = j00.c.c(g11 * (f11 + f13));
        c12 = j00.c.c(f12 * (f13 + this.f42053c));
        return l.a(c11, c12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(Float.valueOf(this.f42052b), Float.valueOf(bVar.f42052b)) && s.c(Float.valueOf(this.f42053c), Float.valueOf(bVar.f42053c));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f42052b) * 31) + Float.hashCode(this.f42053c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f42052b + ", verticalBias=" + this.f42053c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}