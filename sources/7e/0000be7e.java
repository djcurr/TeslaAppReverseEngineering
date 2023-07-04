package x1;

import java.util.List;
import t1.a0;
import t1.f1;
import t1.g1;
import t1.s0;
import wz.w;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final List<f> f56860a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f56861b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f56862c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f56863d;

    static {
        List<f> i11;
        i11 = w.i();
        f56860a = i11;
        f56861b = f1.f51429b.a();
        f56862c = g1.f51434b.b();
        t1.p.f51470a.z();
        a0.f51365b.e();
        f56863d = s0.f51503b.b();
    }

    public static final List<f> a(String str) {
        if (str == null) {
            return f56860a;
        }
        return new h().p(str).C();
    }

    public static final int b() {
        return f56863d;
    }

    public static final int c() {
        return f56861b;
    }

    public static final int d() {
        return f56862c;
    }

    public static final List<f> e() {
        return f56860a;
    }
}