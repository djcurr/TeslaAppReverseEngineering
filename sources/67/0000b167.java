package s0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.m0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.c0;

/* loaded from: classes.dex */
public final class r implements q0.e {

    /* renamed from: a  reason: collision with root package name */
    private final int f49869a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49870b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f49871c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49872d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49873e;

    /* renamed from: f  reason: collision with root package name */
    private final int f49874f;

    /* renamed from: g  reason: collision with root package name */
    private final int f49875g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f49876h;

    /* renamed from: i  reason: collision with root package name */
    private final List<q> f49877i;

    /* renamed from: j  reason: collision with root package name */
    private final i f49878j;

    /* renamed from: k  reason: collision with root package name */
    private final long f49879k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f49880l;

    private r(int i11, int i12, Object obj, int i13, int i14, int i15, int i16, boolean z11, List<q> list, i iVar, long j11) {
        this.f49869a = i11;
        this.f49870b = i12;
        this.f49871c = obj;
        this.f49872d = i13;
        this.f49873e = i14;
        this.f49874f = i15;
        this.f49875g = i16;
        this.f49876h = z11;
        this.f49877i = list;
        this.f49878j = iVar;
        this.f49879k = j11;
        int i17 = i();
        boolean z12 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                break;
            }
            int i19 = i18 + 1;
            if (a(i18) != null) {
                z12 = true;
                break;
            }
            i18 = i19;
        }
        this.f49880l = z12;
    }

    public /* synthetic */ r(int i11, int i12, Object obj, int i13, int i14, int i15, int i16, boolean z11, List list, i iVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, obj, i13, i14, i15, i16, z11, list, iVar, j11);
    }

    private final int d(long j11) {
        return this.f49876h ? x2.k.i(j11) : x2.k.h(j11);
    }

    private final int f(m0 m0Var) {
        return this.f49876h ? m0Var.w0() : m0Var.B0();
    }

    public final c0<x2.k> a(int i11) {
        Object b11 = this.f49877i.get(i11).b();
        if (b11 instanceof c0) {
            return (c0) b11;
        }
        return null;
    }

    public final boolean b() {
        return this.f49880l;
    }

    public Object c() {
        return this.f49871c;
    }

    public final int e(int i11) {
        return f(this.f49877i.get(i11).c());
    }

    public int g() {
        return this.f49869a;
    }

    @Override // q0.e
    public int getIndex() {
        return this.f49870b;
    }

    public final long h(int i11) {
        return this.f49877i.get(i11).a();
    }

    public final int i() {
        return this.f49877i.size();
    }

    public int j() {
        return this.f49872d;
    }

    public final int k() {
        return this.f49873e;
    }

    public final void l(m0.a scope) {
        long h11;
        kotlin.jvm.internal.s.g(scope, "scope");
        int i11 = i();
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 >= i11) {
                return;
            }
            i12 = i13 + 1;
            m0 c11 = this.f49877i.get(i13).c();
            int f11 = this.f49874f - f(c11);
            int i14 = this.f49875g;
            if (a(i13) != null) {
                h11 = this.f49878j.b(c(), i13, f11, i14, h(i13));
            } else {
                h11 = h(i13);
            }
            if (d(h11) > f11 && d(h11) < i14) {
                if (this.f49876h) {
                    long j11 = this.f49879k;
                    m0.a.x(scope, c11, x2.l.a(x2.k.h(h11) + x2.k.h(j11), x2.k.i(h11) + x2.k.i(j11)), BitmapDescriptorFactory.HUE_RED, null, 6, null);
                } else {
                    long j12 = this.f49879k;
                    m0.a.t(scope, c11, x2.l.a(x2.k.h(h11) + x2.k.h(j12), x2.k.i(h11) + x2.k.i(j12)), BitmapDescriptorFactory.HUE_RED, null, 6, null);
                }
            }
        }
    }
}