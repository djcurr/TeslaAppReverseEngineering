package x1;

import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import t1.k0;
import t1.q0;
import v1.g;
import vz.b0;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: b  reason: collision with root package name */
    private float[] f56644b;

    /* renamed from: c  reason: collision with root package name */
    private final List<j> f56645c;

    /* renamed from: d  reason: collision with root package name */
    private List<? extends f> f56646d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56647e;

    /* renamed from: f  reason: collision with root package name */
    private q0 f56648f;

    /* renamed from: g  reason: collision with root package name */
    private h f56649g;

    /* renamed from: h  reason: collision with root package name */
    private h00.a<b0> f56650h;

    /* renamed from: i  reason: collision with root package name */
    private String f56651i;

    /* renamed from: j  reason: collision with root package name */
    private float f56652j;

    /* renamed from: k  reason: collision with root package name */
    private float f56653k;

    /* renamed from: l  reason: collision with root package name */
    private float f56654l;

    /* renamed from: m  reason: collision with root package name */
    private float f56655m;

    /* renamed from: n  reason: collision with root package name */
    private float f56656n;

    /* renamed from: o  reason: collision with root package name */
    private float f56657o;

    /* renamed from: p  reason: collision with root package name */
    private float f56658p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f56659q;

    public b() {
        super(null);
        this.f56645c = new ArrayList();
        this.f56646d = p.e();
        this.f56647e = true;
        this.f56651i = "";
        this.f56655m = 1.0f;
        this.f56656n = 1.0f;
        this.f56659q = true;
    }

    private final boolean g() {
        return !this.f56646d.isEmpty();
    }

    private final void t() {
        if (g()) {
            h hVar = this.f56649g;
            if (hVar == null) {
                hVar = new h();
                this.f56649g = hVar;
            } else {
                hVar.e();
            }
            q0 q0Var = this.f56648f;
            if (q0Var == null) {
                q0Var = t1.n.a();
                this.f56648f = q0Var;
            } else {
                q0Var.reset();
            }
            hVar.b(this.f56646d).D(q0Var);
        }
    }

    private final void u() {
        float[] fArr = this.f56644b;
        if (fArr == null) {
            fArr = k0.b(null, 1, null);
            this.f56644b = fArr;
        } else {
            k0.e(fArr);
        }
        k0.i(fArr, this.f56653k + this.f56657o, this.f56654l + this.f56658p, BitmapDescriptorFactory.HUE_RED, 4, null);
        k0.f(fArr, this.f56652j);
        k0.g(fArr, this.f56655m, this.f56656n, 1.0f);
        k0.i(fArr, -this.f56653k, -this.f56654l, BitmapDescriptorFactory.HUE_RED, 4, null);
    }

    @Override // x1.j
    public void a(v1.e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        if (this.f56659q) {
            u();
            this.f56659q = false;
        }
        if (this.f56647e) {
            t();
            this.f56647e = false;
        }
        v1.d j02 = eVar.j0();
        long c11 = j02.c();
        j02.b().m();
        v1.g a11 = j02.a();
        float[] fArr = this.f56644b;
        if (fArr != null) {
            a11.d(fArr);
        }
        q0 q0Var = this.f56648f;
        if (g() && q0Var != null) {
            g.a.a(a11, q0Var, 0, 2, null);
        }
        List<j> list = this.f56645c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).a(eVar);
        }
        j02.b().h();
        j02.d(c11);
    }

    @Override // x1.j
    public h00.a<b0> b() {
        return this.f56650h;
    }

    @Override // x1.j
    public void d(h00.a<b0> aVar) {
        this.f56650h = aVar;
        List<j> list = this.f56645c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).d(aVar);
        }
    }

    public final String e() {
        return this.f56651i;
    }

    public final int f() {
        return this.f56645c.size();
    }

    public final void h(int i11, j instance) {
        kotlin.jvm.internal.s.g(instance, "instance");
        if (i11 < f()) {
            this.f56645c.set(i11, instance);
        } else {
            this.f56645c.add(instance);
        }
        instance.d(b());
        c();
    }

    public final void i(int i11, int i12, int i13) {
        int i14 = 0;
        if (i11 > i12) {
            while (i14 < i13) {
                i14++;
                this.f56645c.remove(i11);
                this.f56645c.add(i12, this.f56645c.get(i11));
                i12++;
            }
        } else {
            while (i14 < i13) {
                i14++;
                this.f56645c.remove(i11);
                this.f56645c.add(i12 - 1, this.f56645c.get(i11));
            }
        }
        c();
    }

    public final void j(int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            i13++;
            if (i11 < this.f56645c.size()) {
                this.f56645c.get(i11).d(null);
                this.f56645c.remove(i11);
            }
        }
        c();
    }

    public final void k(List<? extends f> value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f56646d = value;
        this.f56647e = true;
        c();
    }

    public final void l(String value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f56651i = value;
        c();
    }

    public final void m(float f11) {
        this.f56653k = f11;
        this.f56659q = true;
        c();
    }

    public final void n(float f11) {
        this.f56654l = f11;
        this.f56659q = true;
        c();
    }

    public final void o(float f11) {
        this.f56652j = f11;
        this.f56659q = true;
        c();
    }

    public final void p(float f11) {
        this.f56655m = f11;
        this.f56659q = true;
        c();
    }

    public final void q(float f11) {
        this.f56656n = f11;
        this.f56659q = true;
        c();
    }

    public final void r(float f11) {
        this.f56657o = f11;
        this.f56659q = true;
        c();
    }

    public final void s(float f11) {
        this.f56658p = f11;
        this.f56659q = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f56651i);
        List<j> list = this.f56645c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            sb2.append(list.get(i11).toString());
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "sb.toString()");
        return sb3;
    }
}