package mq;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.shaded.ow2asm.ClassTooLargeException;
import mq.c;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public class g extends f {
    private int A;
    private d B;
    private y C;
    private y D;
    private c E;
    private int F;

    /* renamed from: a  reason: collision with root package name */
    private int f38735a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f38736b;

    /* renamed from: c  reason: collision with root package name */
    private int f38737c;

    /* renamed from: d  reason: collision with root package name */
    private int f38738d;

    /* renamed from: e  reason: collision with root package name */
    private int f38739e;

    /* renamed from: f  reason: collision with root package name */
    private int f38740f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f38741g;

    /* renamed from: h  reason: collision with root package name */
    private n f38742h;

    /* renamed from: i  reason: collision with root package name */
    private n f38743i;

    /* renamed from: j  reason: collision with root package name */
    private t f38744j;

    /* renamed from: k  reason: collision with root package name */
    private t f38745k;

    /* renamed from: l  reason: collision with root package name */
    private int f38746l;

    /* renamed from: m  reason: collision with root package name */
    private d f38747m;

    /* renamed from: n  reason: collision with root package name */
    private int f38748n;

    /* renamed from: o  reason: collision with root package name */
    private int f38749o;

    /* renamed from: p  reason: collision with root package name */
    private int f38750p;

    /* renamed from: q  reason: collision with root package name */
    private int f38751q;

    /* renamed from: r  reason: collision with root package name */
    private d f38752r;

    /* renamed from: s  reason: collision with root package name */
    private b f38753s;

    /* renamed from: t  reason: collision with root package name */
    private b f38754t;

    /* renamed from: u  reason: collision with root package name */
    private b f38755u;

    /* renamed from: v  reason: collision with root package name */
    private b f38756v;

    /* renamed from: w  reason: collision with root package name */
    private v f38757w;

    /* renamed from: x  reason: collision with root package name */
    private int f38758x;

    /* renamed from: y  reason: collision with root package name */
    private int f38759y;

    /* renamed from: z  reason: collision with root package name */
    private d f38760z;

    public g(int i11) {
        this(null, i11);
    }

    private c[] p() {
        c.a aVar = new c.a();
        aVar.b(this.E);
        for (n nVar = this.f38742h; nVar != null; nVar = (n) nVar.f38787a) {
            nVar.e(aVar);
        }
        for (t tVar = this.f38744j; tVar != null; tVar = (t) tVar.f38833a) {
            tVar.H(aVar);
        }
        for (y yVar = this.C; yVar != null; yVar = (y) yVar.f38885a) {
            yVar.e(aVar);
        }
        return aVar.d();
    }

    private byte[] s(byte[] bArr, boolean z11) {
        c[] p11 = p();
        this.f38742h = null;
        this.f38743i = null;
        this.f38744j = null;
        this.f38745k = null;
        this.f38753s = null;
        this.f38754t = null;
        this.f38755u = null;
        this.f38756v = null;
        this.f38757w = null;
        this.f38758x = 0;
        this.f38759y = 0;
        this.f38760z = null;
        this.A = 0;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = z11 ? 3 : 0;
        new e(bArr, 0, false).a(this, p11, (z11 ? 8 : 0) | 256);
        return t();
    }

    @Override // mq.f
    public final void a(int i11, int i12, String str, String str2, String str3, String[] strArr) {
        this.f38735a = i11;
        this.f38737c = i12;
        a0 a0Var = this.f38736b;
        int i13 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f38738d = a0Var.f0(i13, str);
        if (str2 != null) {
            this.f38750p = this.f38736b.D(str2);
        }
        this.f38739e = str3 == null ? 0 : this.f38736b.e(str3).f38895a;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f38740f = length;
            this.f38741g = new int[length];
            for (int i14 = 0; i14 < this.f38740f; i14++) {
                this.f38741g[i14] = this.f38736b.e(strArr[i14]).f38895a;
            }
        }
        if (this.F != 1 || i13 < 51) {
            return;
        }
        this.F = 2;
    }

    @Override // mq.f
    public final a b(String str, boolean z11) {
        if (z11) {
            b j11 = b.j(this.f38736b, str, this.f38753s);
            this.f38753s = j11;
            return j11;
        }
        b j12 = b.j(this.f38736b, str, this.f38754t);
        this.f38754t = j12;
        return j12;
    }

    @Override // mq.f
    public final void c(c cVar) {
        cVar.f38721c = this.E;
        this.E = cVar;
    }

    @Override // mq.f
    public final void d() {
    }

    @Override // mq.f
    public final m e(int i11, String str, String str2, String str3, Object obj) {
        n nVar = new n(this.f38736b, i11, str, str2, str3, obj);
        if (this.f38742h == null) {
            this.f38742h = nVar;
        } else {
            this.f38743i.f38787a = nVar;
        }
        this.f38743i = nVar;
        return nVar;
    }

    @Override // mq.f
    public final void f(String str, String str2, String str3, int i11) {
        if (this.f38747m == null) {
            this.f38747m = new d();
        }
        z e11 = this.f38736b.e(str);
        if (e11.f38901g == 0) {
            this.f38746l++;
            this.f38747m.k(e11.f38895a);
            this.f38747m.k(str2 == null ? 0 : this.f38736b.e(str2).f38895a);
            this.f38747m.k(str3 != null ? this.f38736b.D(str3) : 0);
            this.f38747m.k(i11);
            e11.f38901g = this.f38746l;
        }
    }

    @Override // mq.f
    public final s g(int i11, String str, String str2, String str3, String[] strArr) {
        t tVar = new t(this.f38736b, i11, str, str2, str3, strArr, this.F);
        if (this.f38744j == null) {
            this.f38744j = tVar;
        } else {
            this.f38745k.f38833a = tVar;
        }
        this.f38745k = tVar;
        return tVar;
    }

    @Override // mq.f
    public final u h(String str, int i11, String str2) {
        a0 a0Var = this.f38736b;
        v vVar = new v(a0Var, a0Var.y(str).f38895a, i11, str2 == null ? 0 : this.f38736b.D(str2));
        this.f38757w = vVar;
        return vVar;
    }

    @Override // mq.f
    public final void i(String str) {
        this.f38758x = this.f38736b.e(str).f38895a;
    }

    @Override // mq.f
    public final void j(String str) {
        if (this.f38760z == null) {
            this.f38760z = new d();
        }
        this.f38759y++;
        this.f38760z.k(this.f38736b.e(str).f38895a);
    }

    @Override // mq.f
    public final void k(String str, String str2, String str3) {
        this.f38748n = this.f38736b.e(str).f38895a;
        if (str2 == null || str3 == null) {
            return;
        }
        this.f38749o = this.f38736b.z(str2, str3);
    }

    @Override // mq.f
    public final void l(String str) {
        if (this.B == null) {
            this.B = new d();
        }
        this.A++;
        this.B.k(this.f38736b.e(str).f38895a);
    }

    @Override // mq.f
    public final x m(String str, String str2, String str3) {
        y yVar = new y(this.f38736b, str, str2, str3);
        if (this.C == null) {
            this.C = yVar;
        } else {
            this.D.f38885a = yVar;
        }
        this.D = yVar;
        return yVar;
    }

    @Override // mq.f
    public final void n(String str, String str2) {
        if (str != null) {
            this.f38751q = this.f38736b.D(str);
        }
        if (str2 != null) {
            this.f38752r = new d().a(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // mq.f
    public final a o(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b i12 = b.i(this.f38736b, i11, c0Var, str, this.f38755u);
            this.f38755u = i12;
            return i12;
        }
        b i13 = b.i(this.f38736b, i11, c0Var, str, this.f38756v);
        this.f38756v = i13;
        return i13;
    }

    protected ClassLoader q() {
        return g.class.getClassLoader();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String r(String str, String str2) {
        ClassLoader q11 = q();
        try {
            Class<?> cls = Class.forName(str.replace('/', CoreConstants.DOT), false, q11);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', CoreConstants.DOT), false, q11);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace(CoreConstants.DOT, '/');
            } catch (ClassNotFoundException e11) {
                throw new TypeNotPresentException(str2, e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new TypeNotPresentException(str, e12);
        }
    }

    public byte[] t() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = (this.f38740f * 2) + 24;
        int i17 = 0;
        for (n nVar = this.f38742h; nVar != null; nVar = (n) nVar.f38787a) {
            i17++;
            i16 += nVar.f();
        }
        int i18 = 0;
        for (t tVar = this.f38744j; tVar != null; tVar = (t) tVar.f38833a) {
            i18++;
            i16 += tVar.K();
        }
        d dVar = this.f38747m;
        if (dVar != null) {
            i16 += dVar.f38727b + 8;
            this.f38736b.D("InnerClasses");
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.f38748n != 0) {
            i11++;
            i16 += 10;
            this.f38736b.D("EnclosingMethod");
        }
        if ((this.f38737c & 4096) != 0 && (this.f38735a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
            i11++;
            i16 += 6;
            this.f38736b.D("Synthetic");
        }
        if (this.f38750p != 0) {
            i11++;
            i16 += 8;
            this.f38736b.D("Signature");
        }
        if (this.f38751q != 0) {
            i11++;
            i16 += 8;
            this.f38736b.D("SourceFile");
        }
        d dVar2 = this.f38752r;
        if (dVar2 != null) {
            i11++;
            i16 += dVar2.f38727b + 6;
            this.f38736b.D("SourceDebugExtension");
        }
        if ((this.f38737c & 131072) != 0) {
            i11++;
            i16 += 6;
            this.f38736b.D("Deprecated");
        }
        b bVar = this.f38753s;
        if (bVar != null) {
            i11++;
            i16 += bVar.f("RuntimeVisibleAnnotations");
        }
        b bVar2 = this.f38754t;
        if (bVar2 != null) {
            i11++;
            i16 += bVar2.f("RuntimeInvisibleAnnotations");
        }
        b bVar3 = this.f38755u;
        if (bVar3 != null) {
            i11++;
            i16 += bVar3.f("RuntimeVisibleTypeAnnotations");
        }
        b bVar4 = this.f38756v;
        if (bVar4 != null) {
            i11++;
            i16 += bVar4.f("RuntimeInvisibleTypeAnnotations");
        }
        if (this.f38736b.L() > 0) {
            i11++;
            i16 += this.f38736b.L();
        }
        v vVar = this.f38757w;
        if (vVar != null) {
            i11 += vVar.j();
            i16 += this.f38757w.i();
        }
        if (this.f38758x != 0) {
            i11++;
            i16 += 8;
            this.f38736b.D("NestHost");
        }
        d dVar3 = this.f38760z;
        if (dVar3 != null) {
            i11++;
            i16 += dVar3.f38727b + 8;
            this.f38736b.D("NestMembers");
        }
        d dVar4 = this.B;
        if (dVar4 != null) {
            i11++;
            i16 += dVar4.f38727b + 8;
            this.f38736b.D("PermittedSubclasses");
        }
        if ((this.f38737c & 65536) == 0 && this.C == null) {
            i12 = 0;
            i13 = 0;
        } else {
            i12 = 0;
            i13 = 0;
            for (y yVar = this.C; yVar != null; yVar = (y) yVar.f38885a) {
                i13++;
                i12 += yVar.f();
            }
            i11++;
            i16 += i12 + 8;
            this.f38736b.D("Record");
        }
        c cVar = this.E;
        if (cVar != null) {
            int d11 = i11 + cVar.d();
            i16 += this.E.a(this.f38736b);
            i11 = d11;
        }
        int Q = i16 + this.f38736b.Q();
        int P = this.f38736b.P();
        if (P <= 65535) {
            d dVar5 = new d(Q);
            dVar5.i(-889275714).i(this.f38735a);
            this.f38736b.e0(dVar5);
            dVar5.k((~((this.f38735a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49 ? 4096 : 0)) & this.f38737c).k(this.f38738d).k(this.f38739e);
            dVar5.k(this.f38740f);
            for (int i19 = 0; i19 < this.f38740f; i19++) {
                dVar5.k(this.f38741g[i19]);
            }
            dVar5.k(i17);
            for (n nVar2 = this.f38742h; nVar2 != null; nVar2 = (n) nVar2.f38787a) {
                nVar2.g(dVar5);
            }
            dVar5.k(i18);
            boolean z11 = false;
            boolean z12 = false;
            for (t tVar2 = this.f38744j; tVar2 != null; tVar2 = (t) tVar2.f38833a) {
                z11 |= tVar2.N();
                z12 |= tVar2.M();
                tVar2.R(dVar5);
            }
            dVar5.k(i11);
            if (this.f38747m != null) {
                d k11 = dVar5.k(this.f38736b.D("InnerClasses")).i(this.f38747m.f38727b + 2).k(this.f38746l);
                d dVar6 = this.f38747m;
                k11.h(dVar6.f38726a, 0, dVar6.f38727b);
            }
            if (this.f38748n != 0) {
                dVar5.k(this.f38736b.D("EnclosingMethod")).i(4).k(this.f38748n).k(this.f38749o);
            }
            if ((this.f38737c & 4096) != 0 && (this.f38735a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
                dVar5.k(this.f38736b.D("Synthetic")).i(0);
            }
            if (this.f38750p != 0) {
                i14 = 2;
                dVar5.k(this.f38736b.D("Signature")).i(2).k(this.f38750p);
            } else {
                i14 = 2;
            }
            if (this.f38751q != 0) {
                dVar5.k(this.f38736b.D("SourceFile")).i(i14).k(this.f38751q);
            }
            d dVar7 = this.f38752r;
            if (dVar7 != null) {
                int i21 = dVar7.f38727b;
                i15 = 0;
                dVar5.k(this.f38736b.D("SourceDebugExtension")).i(i21).h(this.f38752r.f38726a, 0, i21);
            } else {
                i15 = 0;
            }
            if ((this.f38737c & 131072) != 0) {
                dVar5.k(this.f38736b.D("Deprecated")).i(i15);
            }
            b.l(this.f38736b, this.f38753s, this.f38754t, this.f38755u, this.f38756v, dVar5);
            this.f38736b.d0(dVar5);
            v vVar2 = this.f38757w;
            if (vVar2 != null) {
                vVar2.k(dVar5);
            }
            if (this.f38758x != 0) {
                dVar5.k(this.f38736b.D("NestHost")).i(2).k(this.f38758x);
            }
            if (this.f38760z != null) {
                d k12 = dVar5.k(this.f38736b.D("NestMembers")).i(this.f38760z.f38727b + 2).k(this.f38759y);
                d dVar8 = this.f38760z;
                k12.h(dVar8.f38726a, 0, dVar8.f38727b);
            }
            if (this.B != null) {
                d k13 = dVar5.k(this.f38736b.D("PermittedSubclasses")).i(this.B.f38727b + 2).k(this.A);
                d dVar9 = this.B;
                k13.h(dVar9.f38726a, 0, dVar9.f38727b);
            }
            if ((this.f38737c & 65536) != 0 || this.C != null) {
                dVar5.k(this.f38736b.D("Record")).i(i12 + 2).k(i13);
                for (y yVar2 = this.C; yVar2 != null; yVar2 = (y) yVar2.f38885a) {
                    yVar2.g(dVar5);
                }
            }
            c cVar2 = this.E;
            if (cVar2 != null) {
                cVar2.g(this.f38736b, dVar5);
            }
            if (z12) {
                return s(dVar5.f38726a, z11);
            }
            return dVar5.f38726a;
        }
        throw new ClassTooLargeException(this.f38736b.O(), P);
    }

    public g(e eVar, int i11) {
        super(589824);
        this.f38736b = eVar == null ? new a0(this) : new a0(this, eVar);
        if ((i11 & 2) != 0) {
            this.F = 4;
        } else if ((i11 & 1) != 0) {
            this.F = 1;
        } else {
            this.F = 0;
        }
    }
}