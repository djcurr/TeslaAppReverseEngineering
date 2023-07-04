package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import r2.j;
import r2.k;
import t1.a0;
import x2.r;
import x2.t;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private Parcel f3108a;

    public t0() {
        Parcel obtain = Parcel.obtain();
        kotlin.jvm.internal.s.f(obtain, "obtain()");
        this.f3108a = obtain;
    }

    public final void a(byte b11) {
        this.f3108a.writeByte(b11);
    }

    public final void b(float f11) {
        this.f3108a.writeFloat(f11);
    }

    public final void c(int i11) {
        this.f3108a.writeInt(i11);
    }

    public final void d(String string) {
        kotlin.jvm.internal.s.g(string, "string");
        this.f3108a.writeString(string);
    }

    public final void e(n2.s spanStyle) {
        kotlin.jvm.internal.s.g(spanStyle, "spanStyle");
        long c11 = spanStyle.c();
        a0.a aVar = t1.a0.f51365b;
        if (!t1.a0.n(c11, aVar.f())) {
            a((byte) 1);
            m(spanStyle.c());
        }
        long f11 = spanStyle.f();
        r.a aVar2 = x2.r.f56957b;
        if (!x2.r.e(f11, aVar2.a())) {
            a((byte) 2);
            j(spanStyle.f());
        }
        r2.l i11 = spanStyle.i();
        if (i11 != null) {
            a((byte) 3);
            f(i11);
        }
        r2.j g11 = spanStyle.g();
        if (g11 != null) {
            int i12 = g11.i();
            a((byte) 4);
            o(i12);
        }
        r2.k h11 = spanStyle.h();
        if (h11 != null) {
            int m11 = h11.m();
            a((byte) 5);
            l(m11);
        }
        String e11 = spanStyle.e();
        if (e11 != null) {
            a((byte) 6);
            d(e11);
        }
        if (!x2.r.e(spanStyle.j(), aVar2.a())) {
            a((byte) 7);
            j(spanStyle.j());
        }
        w2.a b11 = spanStyle.b();
        if (b11 != null) {
            float h12 = b11.h();
            a((byte) 8);
            k(h12);
        }
        w2.g n11 = spanStyle.n();
        if (n11 != null) {
            a((byte) 9);
            i(n11);
        }
        if (!t1.a0.n(spanStyle.a(), aVar.f())) {
            a((byte) 10);
            m(spanStyle.a());
        }
        w2.e m12 = spanStyle.m();
        if (m12 != null) {
            a((byte) 11);
            h(m12);
        }
        t1.a1 l11 = spanStyle.l();
        if (l11 == null) {
            return;
        }
        a((byte) 12);
        g(l11);
    }

    public final void f(r2.l fontWeight) {
        kotlin.jvm.internal.s.g(fontWeight, "fontWeight");
        c(fontWeight.k());
    }

    public final void g(t1.a1 shadow) {
        kotlin.jvm.internal.s.g(shadow, "shadow");
        m(shadow.c());
        b(s1.f.l(shadow.d()));
        b(s1.f.m(shadow.d()));
        b(shadow.b());
    }

    public final void h(w2.e textDecoration) {
        kotlin.jvm.internal.s.g(textDecoration, "textDecoration");
        c(textDecoration.e());
    }

    public final void i(w2.g textGeometricTransform) {
        kotlin.jvm.internal.s.g(textGeometricTransform, "textGeometricTransform");
        b(textGeometricTransform.b());
        b(textGeometricTransform.c());
    }

    public final void j(long j11) {
        long g11 = x2.r.g(j11);
        t.a aVar = x2.t.f56961b;
        byte b11 = 0;
        if (!x2.t.g(g11, aVar.c())) {
            if (x2.t.g(g11, aVar.b())) {
                b11 = 1;
            } else if (x2.t.g(g11, aVar.a())) {
                b11 = 2;
            }
        }
        a(b11);
        if (x2.t.g(x2.r.g(j11), aVar.c())) {
            return;
        }
        b(x2.r.h(j11));
    }

    public final void k(float f11) {
        b(f11);
    }

    public final void l(int i11) {
        k.a aVar = r2.k.f49085b;
        byte b11 = 0;
        if (!r2.k.h(i11, aVar.b())) {
            if (r2.k.h(i11, aVar.a())) {
                b11 = 1;
            } else if (r2.k.h(i11, aVar.d())) {
                b11 = 2;
            } else if (r2.k.h(i11, aVar.c())) {
                b11 = 3;
            }
        }
        a(b11);
    }

    public final void m(long j11) {
        n(j11);
    }

    public final void n(long j11) {
        this.f3108a.writeLong(j11);
    }

    public final void o(int i11) {
        j.a aVar = r2.j.f49081b;
        byte b11 = 0;
        if (!r2.j.f(i11, aVar.b()) && r2.j.f(i11, aVar.a())) {
            b11 = 1;
        }
        a(b11);
    }

    public final String p() {
        String encodeToString = Base64.encodeToString(this.f3108a.marshall(), 0);
        kotlin.jvm.internal.s.f(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void q() {
        this.f3108a.recycle();
        Parcel obtain = Parcel.obtain();
        kotlin.jvm.internal.s.f(obtain, "obtain()");
        this.f3108a = obtain;
    }
}