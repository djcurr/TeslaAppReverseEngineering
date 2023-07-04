package mq;

import com.nimbusds.jose.shaded.ow2asm.MethodTooLargeException;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import mq.c;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t extends s {

    /* renamed from: b0  reason: collision with root package name */
    private static final int[] f38834b0 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    private b A;
    private b B;
    private int C;
    private b[] D;
    private int E;
    private b[] F;
    private b G;
    private b H;
    private d I;
    private int J;
    private d K;
    private c L;
    private final int M;
    private r N;
    private r O;
    private r P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int[] U;
    private int[] V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f38835a0;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f38836b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38837c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38838d;

    /* renamed from: e  reason: collision with root package name */
    private final String f38839e;

    /* renamed from: f  reason: collision with root package name */
    private final int f38840f;

    /* renamed from: g  reason: collision with root package name */
    private final String f38841g;

    /* renamed from: h  reason: collision with root package name */
    private int f38842h;

    /* renamed from: i  reason: collision with root package name */
    private int f38843i;

    /* renamed from: j  reason: collision with root package name */
    private final d f38844j;

    /* renamed from: k  reason: collision with root package name */
    private q f38845k;

    /* renamed from: l  reason: collision with root package name */
    private q f38846l;

    /* renamed from: m  reason: collision with root package name */
    private int f38847m;

    /* renamed from: n  reason: collision with root package name */
    private d f38848n;

    /* renamed from: o  reason: collision with root package name */
    private int f38849o;

    /* renamed from: p  reason: collision with root package name */
    private d f38850p;

    /* renamed from: q  reason: collision with root package name */
    private int f38851q;

    /* renamed from: r  reason: collision with root package name */
    private d f38852r;

    /* renamed from: s  reason: collision with root package name */
    private int f38853s;

    /* renamed from: t  reason: collision with root package name */
    private d f38854t;

    /* renamed from: u  reason: collision with root package name */
    private b f38855u;

    /* renamed from: v  reason: collision with root package name */
    private b f38856v;

    /* renamed from: w  reason: collision with root package name */
    private c f38857w;

    /* renamed from: x  reason: collision with root package name */
    private final int f38858x;

    /* renamed from: y  reason: collision with root package name */
    private final int[] f38859y;

    /* renamed from: z  reason: collision with root package name */
    private final int f38860z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a0 a0Var, int i11, String str, String str2, String str3, String[] strArr, int i12) {
        super(589824);
        this.f38844j = new d();
        this.f38836b = a0Var;
        this.f38837c = "<init>".equals(str) ? 262144 | i11 : i11;
        this.f38838d = a0Var.D(str);
        this.f38839e = str;
        this.f38840f = a0Var.D(str2);
        this.f38841g = str2;
        this.f38860z = str3 == null ? 0 : a0Var.D(str3);
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f38858x = length;
            this.f38859y = new int[length];
            for (int i13 = 0; i13 < this.f38858x; i13++) {
                this.f38859y[i13] = a0Var.e(strArr[i13]).f38895a;
            }
        } else {
            this.f38858x = 0;
            this.f38859y = null;
        }
        this.M = i12;
        if (i12 != 0) {
            int c11 = b0.c(str2) >> 2;
            c11 = (i11 & 8) != 0 ? c11 - 1 : c11;
            this.f38843i = c11;
            this.S = c11;
            r rVar = new r();
            this.N = rVar;
            o(rVar);
        }
    }

    private void F(int i11, r rVar) {
        r rVar2 = this.P;
        rVar2.f38831l = new l(i11, rVar, rVar2.f38831l);
    }

    private void I() {
        q qVar = this.f38845k;
        while (true) {
            if (qVar == null) {
                break;
            }
            String str = qVar.f38817e;
            int g11 = o.g(this.f38836b, str != null ? str : "java/lang/Throwable");
            r e11 = qVar.f38815c.e();
            e11.f38820a = (short) (e11.f38820a | 2);
            r e12 = qVar.f38814b.e();
            for (r e13 = qVar.f38813a.e(); e13 != e12; e13 = e13.f38830k) {
                e13.f38831l = new l(g11, e11, e13.f38831l);
            }
            qVar = qVar.f38818f;
        }
        o oVar = this.N.f38829j;
        oVar.u(this.f38836b, this.f38837c, this.f38841g, this.f38843i);
        oVar.a(this);
        r rVar = this.N;
        rVar.f38832m = r.f38819n;
        int i11 = 0;
        while (rVar != r.f38819n) {
            r rVar2 = rVar.f38832m;
            rVar.f38832m = null;
            rVar.f38820a = (short) (rVar.f38820a | 8);
            int j11 = rVar.f38829j.j() + rVar.f38827h;
            if (j11 > i11) {
                i11 = j11;
            }
            for (l lVar = rVar.f38831l; lVar != null; lVar = lVar.f38786c) {
                r e14 = lVar.f38785b.e();
                if (rVar.f38829j.m(this.f38836b, e14.f38829j, lVar.f38784a) && e14.f38832m == null) {
                    e14.f38832m = rVar2;
                    rVar2 = e14;
                }
            }
            rVar = rVar2;
        }
        for (r rVar3 = this.N; rVar3 != null; rVar3 = rVar3.f38830k) {
            if ((rVar3.f38820a & 10) == 10) {
                rVar3.f38829j.a(this);
            }
            if ((rVar3.f38820a & 8) == 0) {
                r rVar4 = rVar3.f38830k;
                int i12 = rVar3.f38823d;
                int i13 = (rVar4 == null ? this.f38844j.f38727b : rVar4.f38823d) - 1;
                if (i13 >= i12) {
                    for (int i14 = i12; i14 < i13; i14++) {
                        this.f38844j.f38726a[i14] = 0;
                    }
                    this.f38844j.f38726a[i13] = -65;
                    this.V[V(i12, 0, 1)] = o.g(this.f38836b, "java/lang/Throwable");
                    U();
                    this.f38845k = q.d(this.f38845k, rVar3, rVar4);
                    i11 = Math.max(i11, 1);
                }
            }
        }
        this.f38842h = i11;
    }

    private void J() {
        for (q qVar = this.f38845k; qVar != null; qVar = qVar.f38818f) {
            r rVar = qVar.f38815c;
            r rVar2 = qVar.f38814b;
            for (r rVar3 = qVar.f38813a; rVar3 != rVar2; rVar3 = rVar3.f38830k) {
                if ((rVar3.f38820a & 16) == 0) {
                    rVar3.f38831l = new l(Integer.MAX_VALUE, rVar, rVar3.f38831l);
                } else {
                    l lVar = rVar3.f38831l.f38786c;
                    lVar.f38786c = new l(Integer.MAX_VALUE, rVar, lVar.f38786c);
                }
            }
        }
        if (this.W) {
            this.N.f((short) 1);
            short s11 = 1;
            for (short s12 = 1; s12 <= s11; s12 = (short) (s12 + 1)) {
                for (r rVar4 = this.N; rVar4 != null; rVar4 = rVar4.f38830k) {
                    if ((rVar4.f38820a & 16) != 0 && rVar4.f38828i == s12) {
                        r rVar5 = rVar4.f38831l.f38786c.f38785b;
                        if (rVar5.f38828i == 0) {
                            s11 = (short) (s11 + 1);
                            rVar5.f(s11);
                        }
                    }
                }
            }
            for (r rVar6 = this.N; rVar6 != null; rVar6 = rVar6.f38830k) {
                if ((rVar6.f38820a & 16) != 0) {
                    rVar6.f38831l.f38786c.f38785b.d(rVar6);
                }
            }
        }
        r rVar7 = this.N;
        rVar7.f38832m = r.f38819n;
        int i11 = this.f38842h;
        while (rVar7 != r.f38819n) {
            r rVar8 = rVar7.f38832m;
            short s13 = rVar7.f38825f;
            int i12 = rVar7.f38827h + s13;
            if (i12 > i11) {
                i11 = i12;
            }
            l lVar2 = rVar7.f38831l;
            if ((rVar7.f38820a & 16) != 0) {
                lVar2 = lVar2.f38786c;
            }
            rVar7 = rVar8;
            while (lVar2 != null) {
                r rVar9 = lVar2.f38785b;
                if (rVar9.f38832m == null) {
                    int i13 = lVar2.f38784a;
                    rVar9.f38825f = (short) (i13 == Integer.MAX_VALUE ? 1 : i13 + s13);
                    rVar9.f38832m = rVar7;
                    rVar7 = rVar9;
                }
                lVar2 = lVar2.f38786c;
            }
        }
        this.f38842h = i11;
    }

    private void L() {
        int i11 = this.M;
        if (i11 != 4) {
            if (i11 == 1) {
                this.P.f38827h = (short) this.R;
                this.P = null;
                return;
            }
            return;
        }
        r rVar = new r();
        rVar.f38829j = new o(rVar);
        d dVar = this.f38844j;
        rVar.i(dVar.f38726a, dVar.f38727b);
        this.O.f38830k = rVar;
        this.O = rVar;
        this.P = null;
    }

    private void O(int i11, int i12) {
        while (i11 < i12) {
            o.s(this.f38836b, this.V[i11], this.f38854t);
            i11++;
        }
    }

    private void P() {
        int i11;
        char c11;
        int[] iArr = this.V;
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = 0;
        if (this.f38836b.R() < 50) {
            this.f38854t.k(this.V[0]).k(i12);
            int i15 = i12 + 3;
            O(3, i15);
            this.f38854t.k(i13);
            O(i15, i13 + i15);
            return;
        }
        if (this.f38853s == 0) {
            i11 = this.V[0];
        } else {
            i11 = (this.V[0] - this.U[0]) - 1;
        }
        int i16 = this.U[1];
        int i17 = i12 - i16;
        if (i13 == 0) {
            switch (i17) {
                case BaseResp.ErrCode.ERR_SENT_FAILED /* -3 */:
                case -2:
                case -1:
                    c11 = 248;
                    break;
                case 0:
                    if (i11 >= 64) {
                        c11 = 251;
                        break;
                    } else {
                        c11 = 0;
                        break;
                    }
                case 1:
                case 2:
                case 3:
                    c11 = 252;
                    break;
                default:
                    c11 = 255;
                    break;
            }
        } else {
            if (i17 == 0 && i13 == 1) {
                c11 = i11 < 63 ? '@' : (char) 247;
            }
            c11 = 255;
        }
        if (c11 != 255) {
            int i18 = 3;
            while (true) {
                if (i14 < i16 && i14 < i12) {
                    if (this.V[i18] != this.U[i18]) {
                        c11 = 255;
                    } else {
                        i18++;
                        i14++;
                    }
                }
            }
        }
        if (c11 == 0) {
            this.f38854t.g(i11);
        } else if (c11 == '@') {
            this.f38854t.g(i11 + 64);
            O(i12 + 3, i12 + 4);
        } else if (c11 == 247) {
            this.f38854t.g(247).k(i11);
            O(i12 + 3, i12 + 4);
        } else if (c11 == 248) {
            this.f38854t.g(i17 + 251).k(i11);
        } else if (c11 == 251) {
            this.f38854t.g(251).k(i11);
        } else if (c11 != 252) {
            this.f38854t.g(255).k(i11).k(i12);
            int i19 = i12 + 3;
            O(3, i19);
            this.f38854t.k(i13);
            O(i19, i13 + i19);
        } else {
            this.f38854t.g(i17 + 251).k(i11);
            O(i16 + 3, i12 + 3);
        }
    }

    private void Q(Object obj) {
        if (obj instanceof Integer) {
            this.f38854t.g(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.f38854t.g(7).k(this.f38836b.e((String) obj).f38895a);
        } else {
            this.f38854t.g(8).k(((r) obj).f38823d);
        }
    }

    private void W(r rVar, r[] rVarArr) {
        r rVar2 = this.P;
        if (rVar2 != null) {
            int i11 = this.M;
            if (i11 == 4) {
                rVar2.f38829j.d(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 0, null, null);
                F(0, rVar);
                r e11 = rVar.e();
                e11.f38820a = (short) (e11.f38820a | 2);
                for (r rVar3 : rVarArr) {
                    F(0, rVar3);
                    r e12 = rVar3.e();
                    e12.f38820a = (short) (e12.f38820a | 2);
                }
            } else if (i11 == 1) {
                int i12 = this.Q - 1;
                this.Q = i12;
                F(i12, rVar);
                for (r rVar4 : rVarArr) {
                    F(this.Q, rVar4);
                }
            }
            L();
        }
    }

    @Override // mq.s
    public a A(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b i12 = b.i(this.f38836b, i11, c0Var, str, this.f38855u);
            this.f38855u = i12;
            return i12;
        }
        b i13 = b.i(this.f38836b, i11, c0Var, str, this.f38856v);
        this.f38856v = i13;
        return i13;
    }

    @Override // mq.s
    public void B(r rVar, r rVar2, r rVar3, String str) {
        q qVar = new q(rVar, rVar2, rVar3, str != null ? this.f38836b.e(str).f38895a : 0, str);
        if (this.f38845k == null) {
            this.f38845k = qVar;
        } else {
            this.f38846l.f38818f = qVar;
        }
        this.f38846l = qVar;
    }

    @Override // mq.s
    public a C(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b i12 = b.i(this.f38836b, i11, c0Var, str, this.G);
            this.G = i12;
            return i12;
        }
        b i13 = b.i(this.f38836b, i11, c0Var, str, this.H);
        this.H = i13;
        return i13;
    }

    @Override // mq.s
    public void D(int i11, String str) {
        this.Y = this.f38844j.f38727b;
        z e11 = this.f38836b.e(str);
        this.f38844j.e(i11, e11.f38895a);
        r rVar = this.P;
        if (rVar != null) {
            int i12 = this.M;
            if (i12 == 4 || i12 == 3) {
                rVar.f38829j.d(i11, this.Y, e11, this.f38836b);
            } else if (i11 == 187) {
                int i13 = this.Q + 1;
                if (i13 > this.R) {
                    this.R = i13;
                }
                this.Q = i13;
            }
        }
    }

    @Override // mq.s
    public void E(int i11, int i12) {
        d dVar = this.f38844j;
        this.Y = dVar.f38727b;
        if (i12 < 4 && i11 != 169) {
            dVar.g((i11 < 54 ? ((i11 - 21) << 2) + 26 : ((i11 - 54) << 2) + 59) + i12);
        } else if (i12 >= 256) {
            dVar.g(196).e(i11, i12);
        } else {
            dVar.c(i11, i12);
        }
        r rVar = this.P;
        if (rVar != null) {
            int i13 = this.M;
            if (i13 == 4 || i13 == 3) {
                rVar.f38829j.d(i11, i12, null, null);
            } else if (i11 == 169) {
                rVar.f38820a = (short) (rVar.f38820a | 64);
                rVar.f38826g = (short) this.Q;
                L();
            } else {
                int i14 = this.Q + f38834b0[i11];
                if (i14 > this.R) {
                    this.R = i14;
                }
                this.Q = i14;
            }
        }
        int i15 = this.M;
        if (i15 != 0) {
            int i16 = (i11 == 22 || i11 == 24 || i11 == 55 || i11 == 57) ? i12 + 2 : i12 + 1;
            if (i16 > this.f38843i) {
                this.f38843i = i16;
            }
        }
        if (i11 < 54 || i15 != 4 || this.f38845k == null) {
            return;
        }
        o(new r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G(e eVar, boolean z11, boolean z12, int i11, int i12, int i13) {
        if (eVar == this.f38836b.S() && i11 == this.f38840f && i12 == this.f38860z) {
            if (z12 == ((this.f38837c & 131072) != 0)) {
                if (z11 != (this.f38836b.R() < 49 && (this.f38837c & 4096) != 0)) {
                    return false;
                }
                if (i13 == 0) {
                    if (this.f38858x != 0) {
                        return false;
                    }
                } else if (eVar.I(i13) == this.f38858x) {
                    int i14 = i13 + 2;
                    for (int i15 = 0; i15 < this.f38858x; i15++) {
                        if (eVar.I(i14) != this.f38859y[i15]) {
                            return false;
                        }
                        i14 += 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(c.a aVar) {
        aVar.b(this.L);
        aVar.b(this.f38857w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int K() {
        int i11;
        if (this.Z != 0) {
            return this.f38835a0 + 6;
        }
        int i12 = this.f38844j.f38727b;
        if (i12 <= 0) {
            i11 = 8;
        } else if (i12 <= 65535) {
            this.f38836b.D("Code");
            i11 = this.f38844j.f38727b + 16 + q.b(this.f38845k) + 8;
            if (this.f38854t != null) {
                this.f38836b.D(this.f38836b.R() >= 50 ? "StackMapTable" : "StackMap");
                i11 += this.f38854t.f38727b + 8;
            }
            if (this.f38848n != null) {
                this.f38836b.D("LineNumberTable");
                i11 += this.f38848n.f38727b + 8;
            }
            if (this.f38850p != null) {
                this.f38836b.D("LocalVariableTable");
                i11 += this.f38850p.f38727b + 8;
            }
            if (this.f38852r != null) {
                this.f38836b.D("LocalVariableTypeTable");
                i11 += this.f38852r.f38727b + 8;
            }
            b bVar = this.f38855u;
            if (bVar != null) {
                i11 += bVar.f("RuntimeVisibleTypeAnnotations");
            }
            b bVar2 = this.f38856v;
            if (bVar2 != null) {
                i11 += bVar2.f("RuntimeInvisibleTypeAnnotations");
            }
            c cVar = this.f38857w;
            if (cVar != null) {
                a0 a0Var = this.f38836b;
                d dVar = this.f38844j;
                i11 += cVar.c(a0Var, dVar.f38726a, dVar.f38727b, this.f38842h, this.f38843i);
            }
        } else {
            throw new MethodTooLargeException(this.f38836b.O(), this.f38839e, this.f38841g, this.f38844j.f38727b);
        }
        if (this.f38858x > 0) {
            this.f38836b.D("Exceptions");
            i11 += (this.f38858x * 2) + 8;
        }
        int b11 = i11 + c.b(this.f38836b, this.f38837c, this.f38860z) + b.g(this.A, this.B, this.G, this.H);
        b[] bVarArr = this.D;
        if (bVarArr != null) {
            int i13 = this.C;
            if (i13 == 0) {
                i13 = bVarArr.length;
            }
            b11 += b.h("RuntimeVisibleParameterAnnotations", bVarArr, i13);
        }
        b[] bVarArr2 = this.F;
        if (bVarArr2 != null) {
            int i14 = this.E;
            if (i14 == 0) {
                i14 = bVarArr2.length;
            }
            b11 += b.h("RuntimeInvisibleParameterAnnotations", bVarArr2, i14);
        }
        if (this.I != null) {
            this.f38836b.D("AnnotationDefault");
            b11 += this.I.f38727b + 6;
        }
        if (this.K != null) {
            this.f38836b.D("MethodParameters");
            b11 += this.K.f38727b + 7;
        }
        c cVar2 = this.L;
        return cVar2 != null ? b11 + cVar2.a(this.f38836b) : b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M() {
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        return this.f38853s > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(d dVar) {
        int i11;
        boolean z11 = this.f38836b.R() < 49;
        dVar.k((~(z11 ? 4096 : 0)) & this.f38837c).k(this.f38838d).k(this.f38840f);
        if (this.Z != 0) {
            dVar.h(this.f38836b.S().f38729b, this.Z, this.f38835a0);
            return;
        }
        int i12 = this.f38844j.f38727b > 0 ? 1 : 0;
        if (this.f38858x > 0) {
            i12++;
        }
        int i13 = this.f38837c;
        if ((i13 & 4096) != 0 && z11) {
            i12++;
        }
        if (this.f38860z != 0) {
            i12++;
        }
        if ((131072 & i13) != 0) {
            i12++;
        }
        if (this.A != null) {
            i12++;
        }
        if (this.B != null) {
            i12++;
        }
        if (this.D != null) {
            i12++;
        }
        if (this.F != null) {
            i12++;
        }
        if (this.G != null) {
            i12++;
        }
        if (this.H != null) {
            i12++;
        }
        if (this.I != null) {
            i12++;
        }
        if (this.K != null) {
            i12++;
        }
        c cVar = this.L;
        if (cVar != null) {
            i12 += cVar.d();
        }
        dVar.k(i12);
        int i14 = this.f38844j.f38727b;
        if (i14 > 0) {
            int b11 = i14 + 10 + q.b(this.f38845k);
            d dVar2 = this.f38854t;
            if (dVar2 != null) {
                b11 += dVar2.f38727b + 8;
                i11 = 1;
            } else {
                i11 = 0;
            }
            d dVar3 = this.f38848n;
            if (dVar3 != null) {
                b11 += dVar3.f38727b + 8;
                i11++;
            }
            d dVar4 = this.f38850p;
            if (dVar4 != null) {
                b11 += dVar4.f38727b + 8;
                i11++;
            }
            d dVar5 = this.f38852r;
            if (dVar5 != null) {
                b11 += dVar5.f38727b + 8;
                i11++;
            }
            b bVar = this.f38855u;
            if (bVar != null) {
                b11 += bVar.f("RuntimeVisibleTypeAnnotations");
                i11++;
            }
            b bVar2 = this.f38856v;
            if (bVar2 != null) {
                b11 += bVar2.f("RuntimeInvisibleTypeAnnotations");
                i11++;
            }
            c cVar2 = this.f38857w;
            if (cVar2 != null) {
                a0 a0Var = this.f38836b;
                d dVar6 = this.f38844j;
                b11 += cVar2.c(a0Var, dVar6.f38726a, dVar6.f38727b, this.f38842h, this.f38843i);
                i11 += this.f38857w.d();
            }
            d i15 = dVar.k(this.f38836b.D("Code")).i(b11).k(this.f38842h).k(this.f38843i).i(this.f38844j.f38727b);
            d dVar7 = this.f38844j;
            i15.h(dVar7.f38726a, 0, dVar7.f38727b);
            q.c(this.f38845k, dVar);
            dVar.k(i11);
            if (this.f38854t != null) {
                d k11 = dVar.k(this.f38836b.D(this.f38836b.R() >= 50 ? "StackMapTable" : "StackMap")).i(this.f38854t.f38727b + 2).k(this.f38853s);
                d dVar8 = this.f38854t;
                k11.h(dVar8.f38726a, 0, dVar8.f38727b);
            }
            if (this.f38848n != null) {
                d k12 = dVar.k(this.f38836b.D("LineNumberTable")).i(this.f38848n.f38727b + 2).k(this.f38847m);
                d dVar9 = this.f38848n;
                k12.h(dVar9.f38726a, 0, dVar9.f38727b);
            }
            if (this.f38850p != null) {
                d k13 = dVar.k(this.f38836b.D("LocalVariableTable")).i(this.f38850p.f38727b + 2).k(this.f38849o);
                d dVar10 = this.f38850p;
                k13.h(dVar10.f38726a, 0, dVar10.f38727b);
            }
            if (this.f38852r != null) {
                d k14 = dVar.k(this.f38836b.D("LocalVariableTypeTable")).i(this.f38852r.f38727b + 2).k(this.f38851q);
                d dVar11 = this.f38852r;
                k14.h(dVar11.f38726a, 0, dVar11.f38727b);
            }
            b bVar3 = this.f38855u;
            if (bVar3 != null) {
                bVar3.k(this.f38836b.D("RuntimeVisibleTypeAnnotations"), dVar);
            }
            b bVar4 = this.f38856v;
            if (bVar4 != null) {
                bVar4.k(this.f38836b.D("RuntimeInvisibleTypeAnnotations"), dVar);
            }
            c cVar3 = this.f38857w;
            if (cVar3 != null) {
                a0 a0Var2 = this.f38836b;
                d dVar12 = this.f38844j;
                cVar3.h(a0Var2, dVar12.f38726a, dVar12.f38727b, this.f38842h, this.f38843i, dVar);
            }
        }
        if (this.f38858x > 0) {
            dVar.k(this.f38836b.D("Exceptions")).i((this.f38858x * 2) + 2).k(this.f38858x);
            for (int i16 : this.f38859y) {
                dVar.k(i16);
            }
        }
        c.f(this.f38836b, this.f38837c, this.f38860z, dVar);
        b.l(this.f38836b, this.A, this.B, this.G, this.H, dVar);
        if (this.D != null) {
            int D = this.f38836b.D("RuntimeVisibleParameterAnnotations");
            b[] bVarArr = this.D;
            int i17 = this.C;
            if (i17 == 0) {
                i17 = bVarArr.length;
            }
            b.m(D, bVarArr, i17, dVar);
        }
        if (this.F != null) {
            int D2 = this.f38836b.D("RuntimeInvisibleParameterAnnotations");
            b[] bVarArr2 = this.F;
            int i18 = this.E;
            if (i18 == 0) {
                i18 = bVarArr2.length;
            }
            b.m(D2, bVarArr2, i18, dVar);
        }
        if (this.I != null) {
            d i19 = dVar.k(this.f38836b.D("AnnotationDefault")).i(this.I.f38727b);
            d dVar13 = this.I;
            i19.h(dVar13.f38726a, 0, dVar13.f38727b);
        }
        if (this.K != null) {
            d g11 = dVar.k(this.f38836b.D("MethodParameters")).i(this.K.f38727b + 1).g(this.J);
            d dVar14 = this.K;
            g11.h(dVar14.f38726a, 0, dVar14.f38727b);
        }
        c cVar4 = this.L;
        if (cVar4 != null) {
            cVar4.g(this.f38836b, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(int i11, int i12) {
        this.Z = i11 + 6;
        this.f38835a0 = i12 - 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i11, int i12) {
        this.V[i11] = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        if (this.U != null) {
            if (this.f38854t == null) {
                this.f38854t = new d();
            }
            P();
            this.f38853s++;
        }
        this.U = this.V;
        this.V = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int V(int i11, int i12, int i13) {
        int i14 = i12 + 3 + i13;
        int[] iArr = this.V;
        if (iArr == null || iArr.length < i14) {
            this.V = new int[i14];
        }
        int[] iArr2 = this.V;
        iArr2[0] = i11;
        iArr2[1] = i12;
        iArr2[2] = i13;
        return 3;
    }

    @Override // mq.s
    public void a(int i11, boolean z11) {
        if (z11) {
            this.C = i11;
        } else {
            this.E = i11;
        }
    }

    @Override // mq.s
    public a b(String str, boolean z11) {
        if (z11) {
            b j11 = b.j(this.f38836b, str, this.A);
            this.A = j11;
            return j11;
        }
        b j12 = b.j(this.f38836b, str, this.B);
        this.B = j12;
        return j12;
    }

    @Override // mq.s
    public a c() {
        d dVar = new d();
        this.I = dVar;
        return new b(this.f38836b, false, dVar, null);
    }

    @Override // mq.s
    public void d(c cVar) {
        if (cVar.e()) {
            cVar.f38721c = this.f38857w;
            this.f38857w = cVar;
            return;
        }
        cVar.f38721c = this.L;
        this.L = cVar;
    }

    @Override // mq.s
    public void e() {
    }

    @Override // mq.s
    public void f() {
    }

    @Override // mq.s
    public void g(int i11, String str, String str2, String str3) {
        int i12;
        int i13;
        this.Y = this.f38844j.f38727b;
        z j11 = this.f38836b.j(str, str2, str3);
        this.f38844j.e(i11, j11.f38895a);
        r rVar = this.P;
        if (rVar != null) {
            int i14 = this.M;
            int i15 = 0;
            if (i14 != 4 && i14 != 3) {
                char charAt = str3.charAt(0);
                int i16 = 1;
                int i17 = -2;
                switch (i11) {
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                        i12 = this.Q + ((charAt == 'D' || charAt == 'J') ? 2 : 2);
                        break;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                        i13 = this.Q;
                        if (charAt != 'D' && charAt != 'J') {
                            i17 = -1;
                        }
                        i12 = i13 + i17;
                        break;
                    case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                        int i18 = this.Q;
                        if (charAt == 'D' || charAt == 'J') {
                            i15 = 1;
                        }
                        i12 = i18 + i15;
                        break;
                    default:
                        i13 = this.Q;
                        if (charAt == 'D' || charAt == 'J') {
                            i17 = -3;
                        }
                        i12 = i13 + i17;
                        break;
                }
                if (i12 > this.R) {
                    this.R = i12;
                }
                this.Q = i12;
                return;
            }
            rVar.f38829j.d(i11, 0, j11, this.f38836b);
        }
    }

    @Override // mq.s
    public void h(int i11, int i12, Object[] objArr, int i13, Object[] objArr2) {
        int i14;
        int i15 = this.M;
        if (i15 == 4) {
            return;
        }
        if (i15 == 3) {
            r rVar = this.P;
            o oVar = rVar.f38829j;
            if (oVar == null) {
                rVar.f38829j = new k(rVar);
                this.P.f38829j.u(this.f38836b, this.f38837c, this.f38841g, i12);
                this.P.f38829j.a(this);
            } else {
                if (i11 == -1) {
                    oVar.t(this.f38836b, i12, objArr, i13, objArr2);
                }
                this.P.f38829j.a(this);
            }
        } else if (i11 == -1) {
            if (this.U == null) {
                o oVar2 = new o(new r());
                oVar2.u(this.f38836b, this.f38837c, this.f38841g, b0.c(this.f38841g) >> 2);
                oVar2.a(this);
            }
            this.S = i12;
            int V = V(this.f38844j.f38727b, i12, i13);
            int i16 = 0;
            while (i16 < i12) {
                this.V[V] = o.e(this.f38836b, objArr[i16]);
                i16++;
                V++;
            }
            int i17 = 0;
            while (i17 < i13) {
                this.V[V] = o.e(this.f38836b, objArr2[i17]);
                i17++;
                V++;
            }
            U();
        } else if (this.f38836b.R() >= 50) {
            if (this.f38854t == null) {
                this.f38854t = new d();
                i14 = this.f38844j.f38727b;
            } else {
                i14 = (this.f38844j.f38727b - this.T) - 1;
                if (i14 < 0) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            if (i11 == 0) {
                this.S = i12;
                this.f38854t.g(255).k(i14).k(i12);
                for (int i18 = 0; i18 < i12; i18++) {
                    Q(objArr[i18]);
                }
                this.f38854t.k(i13);
                for (int i19 = 0; i19 < i13; i19++) {
                    Q(objArr2[i19]);
                }
            } else if (i11 == 1) {
                this.S += i12;
                this.f38854t.g(i12 + 251).k(i14);
                for (int i21 = 0; i21 < i12; i21++) {
                    Q(objArr[i21]);
                }
            } else if (i11 == 2) {
                this.S -= i12;
                this.f38854t.g(251 - i12).k(i14);
            } else if (i11 != 3) {
                if (i11 == 4) {
                    if (i14 < 64) {
                        this.f38854t.g(i14 + 64);
                    } else {
                        this.f38854t.g(247).k(i14);
                    }
                    Q(objArr2[0]);
                } else {
                    throw new IllegalArgumentException();
                }
            } else if (i14 < 64) {
                this.f38854t.g(i14);
            } else {
                this.f38854t.g(251).k(i14);
            }
            this.T = this.f38844j.f38727b;
            this.f38853s++;
        } else {
            throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
        }
        if (this.M == 2) {
            this.Q = i13;
            for (int i22 = 0; i22 < i13; i22++) {
                if (objArr2[i22] == w.f38882e || objArr2[i22] == w.f38881d) {
                    this.Q++;
                }
            }
            int i23 = this.Q;
            if (i23 > this.R) {
                this.R = i23;
            }
        }
        this.f38842h = Math.max(this.f38842h, i13);
        this.f38843i = Math.max(this.f38843i, this.S);
    }

    @Override // mq.s
    public void i(int i11, int i12) {
        int i13;
        int i14;
        d dVar = this.f38844j;
        this.Y = dVar.f38727b;
        if (i11 <= 255 && i12 <= 127 && i12 >= -128) {
            dVar.g(132).c(i11, i12);
        } else {
            dVar.g(196).e(132, i11).k(i12);
        }
        r rVar = this.P;
        if (rVar != null && ((i14 = this.M) == 4 || i14 == 3)) {
            rVar.f38829j.d(132, i11, null, null);
        }
        if (this.M == 0 || (i13 = i11 + 1) <= this.f38843i) {
            return;
        }
        this.f38843i = i13;
    }

    @Override // mq.s
    public void j(int i11) {
        d dVar = this.f38844j;
        this.Y = dVar.f38727b;
        dVar.g(i11);
        r rVar = this.P;
        if (rVar != null) {
            int i12 = this.M;
            if (i12 != 4 && i12 != 3) {
                int i13 = this.Q + f38834b0[i11];
                if (i13 > this.R) {
                    this.R = i13;
                }
                this.Q = i13;
            } else {
                rVar.f38829j.d(i11, 0, null, null);
            }
            if ((i11 < 172 || i11 > 177) && i11 != 191) {
                return;
            }
            L();
        }
    }

    @Override // mq.s
    public a k(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b i12 = b.i(this.f38836b, (i11 & (-16776961)) | (this.Y << 8), c0Var, str, this.f38855u);
            this.f38855u = i12;
            return i12;
        }
        b i13 = b.i(this.f38836b, (i11 & (-16776961)) | (this.Y << 8), c0Var, str, this.f38856v);
        this.f38856v = i13;
        return i13;
    }

    @Override // mq.s
    public void l(int i11, int i12) {
        d dVar = this.f38844j;
        this.Y = dVar.f38727b;
        if (i11 == 17) {
            dVar.e(i11, i12);
        } else {
            dVar.c(i11, i12);
        }
        r rVar = this.P;
        if (rVar != null) {
            int i13 = this.M;
            if (i13 == 4 || i13 == 3) {
                rVar.f38829j.d(i11, i12, null, null);
            } else if (i11 != 188) {
                int i14 = this.Q + 1;
                if (i14 > this.R) {
                    this.R = i14;
                }
                this.Q = i14;
            }
        }
    }

    @Override // mq.s
    public void m(String str, String str2, p pVar, Object... objArr) {
        this.Y = this.f38844j.f38727b;
        z o11 = this.f38836b.o(str, str2, pVar, objArr);
        this.f38844j.e(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, o11.f38895a);
        this.f38844j.k(0);
        r rVar = this.P;
        if (rVar != null) {
            int i11 = this.M;
            if (i11 != 4 && i11 != 3) {
                int a11 = o11.a();
                int i12 = this.Q + ((a11 & 3) - (a11 >> 2)) + 1;
                if (i12 > this.R) {
                    this.R = i12;
                }
                this.Q = i12;
                return;
            }
            rVar.f38829j.d(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 0, o11, this.f38836b);
        }
    }

    @Override // mq.s
    public void n(int i11, r rVar) {
        boolean z11;
        d dVar = this.f38844j;
        int i12 = dVar.f38727b;
        this.Y = i12;
        int i13 = i11 >= 200 ? i11 - 33 : i11;
        if ((rVar.f38820a & 4) == 0 || rVar.f38823d - i12 >= -32768) {
            if (i13 != i11) {
                dVar.g(i11);
                d dVar2 = this.f38844j;
                rVar.h(dVar2, dVar2.f38727b - 1, true);
            } else {
                dVar.g(i13);
                d dVar3 = this.f38844j;
                rVar.h(dVar3, dVar3.f38727b - 1, false);
            }
            z11 = false;
        } else {
            if (i13 == 167) {
                dVar.g(200);
            } else if (i13 == 168) {
                dVar.g(201);
            } else {
                dVar.g(i13 >= 198 ? i13 ^ 1 : ((i13 + 1) ^ 1) - 1);
                this.f38844j.k(8);
                this.f38844j.g(220);
                this.X = true;
                z11 = true;
                d dVar4 = this.f38844j;
                rVar.h(dVar4, dVar4.f38727b - 1, true);
            }
            z11 = false;
            d dVar42 = this.f38844j;
            rVar.h(dVar42, dVar42.f38727b - 1, true);
        }
        r rVar2 = this.P;
        if (rVar2 != null) {
            int i14 = this.M;
            r rVar3 = null;
            if (i14 == 4) {
                rVar2.f38829j.d(i13, 0, null, null);
                r e11 = rVar.e();
                e11.f38820a = (short) (e11.f38820a | 2);
                F(0, rVar);
                if (i13 != 167) {
                    rVar3 = new r();
                }
            } else if (i14 == 3) {
                rVar2.f38829j.d(i13, 0, null, null);
            } else if (i14 == 2) {
                this.Q += f38834b0[i13];
            } else if (i13 == 168) {
                short s11 = rVar.f38820a;
                if ((s11 & 32) == 0) {
                    rVar.f38820a = (short) (s11 | 32);
                    this.W = true;
                }
                rVar2.f38820a = (short) (rVar2.f38820a | 16);
                F(this.Q + 1, rVar);
                rVar3 = new r();
            } else {
                int i15 = this.Q + f38834b0[i13];
                this.Q = i15;
                F(i15, rVar);
            }
            if (rVar3 != null) {
                if (z11) {
                    rVar3.f38820a = (short) (rVar3.f38820a | 2);
                }
                o(rVar3);
            }
            if (i13 == 167) {
                L();
            }
        }
    }

    @Override // mq.s
    public void o(r rVar) {
        boolean z11 = this.X;
        d dVar = this.f38844j;
        this.X = z11 | rVar.i(dVar.f38726a, dVar.f38727b);
        short s11 = rVar.f38820a;
        if ((s11 & 1) != 0) {
            return;
        }
        int i11 = this.M;
        if (i11 == 4) {
            r rVar2 = this.P;
            if (rVar2 != null) {
                if (rVar.f38823d == rVar2.f38823d) {
                    rVar2.f38820a = (short) ((s11 & 2) | rVar2.f38820a);
                    rVar.f38829j = rVar2.f38829j;
                    return;
                }
                F(0, rVar);
            }
            r rVar3 = this.O;
            if (rVar3 != null) {
                if (rVar.f38823d == rVar3.f38823d) {
                    rVar3.f38820a = (short) (rVar3.f38820a | (rVar.f38820a & 2));
                    rVar.f38829j = rVar3.f38829j;
                    this.P = rVar3;
                    return;
                }
                rVar3.f38830k = rVar;
            }
            this.O = rVar;
            this.P = rVar;
            rVar.f38829j = new o(rVar);
        } else if (i11 == 3) {
            r rVar4 = this.P;
            if (rVar4 == null) {
                this.P = rVar;
            } else {
                rVar4.f38829j.f38799a = rVar;
            }
        } else if (i11 == 1) {
            r rVar5 = this.P;
            if (rVar5 != null) {
                rVar5.f38827h = (short) this.R;
                F(this.Q, rVar);
            }
            this.P = rVar;
            this.Q = 0;
            this.R = 0;
            r rVar6 = this.O;
            if (rVar6 != null) {
                rVar6.f38830k = rVar;
            }
            this.O = rVar;
        } else if (i11 == 2 && this.P == null) {
            this.P = rVar;
        }
    }

    @Override // mq.s
    public void p(Object obj) {
        char charAt;
        this.Y = this.f38844j.f38727b;
        z d11 = this.f38836b.d(obj);
        int i11 = d11.f38895a;
        int i12 = d11.f38896b;
        boolean z11 = i12 == 5 || i12 == 6 || (i12 == 17 && ((charAt = d11.f38899e.charAt(0)) == 'J' || charAt == 'D'));
        if (z11) {
            this.f38844j.e(20, i11);
        } else if (i11 >= 256) {
            this.f38844j.e(19, i11);
        } else {
            this.f38844j.c(18, i11);
        }
        r rVar = this.P;
        if (rVar != null) {
            int i13 = this.M;
            if (i13 != 4 && i13 != 3) {
                int i14 = this.Q + (z11 ? 2 : 1);
                if (i14 > this.R) {
                    this.R = i14;
                }
                this.Q = i14;
                return;
            }
            rVar.f38829j.d(18, 0, d11, this.f38836b);
        }
    }

    @Override // mq.s
    public void q(int i11, r rVar) {
        if (this.f38848n == null) {
            this.f38848n = new d();
        }
        this.f38847m++;
        this.f38848n.k(rVar.f38823d);
        this.f38848n.k(i11);
    }

    @Override // mq.s
    public void r(String str, String str2, String str3, r rVar, r rVar2, int i11) {
        int i12 = 1;
        if (str3 != null) {
            if (this.f38852r == null) {
                this.f38852r = new d();
            }
            this.f38851q++;
            this.f38852r.k(rVar.f38823d).k(rVar2.f38823d - rVar.f38823d).k(this.f38836b.D(str)).k(this.f38836b.D(str3)).k(i11);
        }
        if (this.f38850p == null) {
            this.f38850p = new d();
        }
        this.f38849o++;
        this.f38850p.k(rVar.f38823d).k(rVar2.f38823d - rVar.f38823d).k(this.f38836b.D(str)).k(this.f38836b.D(str2)).k(i11);
        if (this.M != 0) {
            char charAt = str2.charAt(0);
            int i13 = i11 + ((charAt == 'J' || charAt == 'D') ? 2 : 2);
            if (i13 > this.f38843i) {
                this.f38843i = i13;
            }
        }
    }

    @Override // mq.s
    public a s(int i11, c0 c0Var, r[] rVarArr, r[] rVarArr2, int[] iArr, String str, boolean z11) {
        d dVar = new d();
        dVar.g(i11 >>> 24).k(rVarArr.length);
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            dVar.k(rVarArr[i12].f38823d).k(rVarArr2[i12].f38823d - rVarArr[i12].f38823d).k(iArr[i12]);
        }
        c0.d(c0Var, dVar);
        dVar.k(this.f38836b.D(str)).k(0);
        if (z11) {
            b bVar = new b(this.f38836b, true, dVar, this.f38855u);
            this.f38855u = bVar;
            return bVar;
        }
        b bVar2 = new b(this.f38836b, true, dVar, this.f38856v);
        this.f38856v = bVar2;
        return bVar2;
    }

    @Override // mq.s
    public void t(r rVar, int[] iArr, r[] rVarArr) {
        d dVar = this.f38844j;
        this.Y = dVar.f38727b;
        dVar.g(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384).h(null, 0, (4 - (this.f38844j.f38727b % 4)) % 4);
        rVar.h(this.f38844j, this.Y, true);
        this.f38844j.i(rVarArr.length);
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            this.f38844j.i(iArr[i11]);
            rVarArr[i11].h(this.f38844j, this.Y, true);
        }
        W(rVar, rVarArr);
    }

    @Override // mq.s
    public void u(int i11, int i12) {
        int i13 = this.M;
        if (i13 == 4) {
            I();
        } else if (i13 == 1) {
            J();
        } else if (i13 == 2) {
            this.f38842h = this.R;
        } else {
            this.f38842h = i11;
            this.f38843i = i12;
        }
    }

    @Override // mq.s
    public void v(int i11, String str, String str2, String str3, boolean z11) {
        int i12;
        this.Y = this.f38844j.f38727b;
        z x11 = this.f38836b.x(str, str2, str3, z11);
        if (i11 == 185) {
            this.f38844j.e(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, x11.f38895a).c(x11.a() >> 2, 0);
        } else {
            this.f38844j.e(i11, x11.f38895a);
        }
        r rVar = this.P;
        if (rVar != null) {
            int i13 = this.M;
            if (i13 != 4 && i13 != 3) {
                int a11 = x11.a();
                int i14 = (a11 & 3) - (a11 >> 2);
                if (i11 == 184) {
                    i12 = this.Q + i14 + 1;
                } else {
                    i12 = this.Q + i14;
                }
                if (i12 > this.R) {
                    this.R = i12;
                }
                this.Q = i12;
                return;
            }
            rVar.f38829j.d(i11, 0, x11, this.f38836b);
        }
    }

    @Override // mq.s
    public void w(String str, int i11) {
        this.Y = this.f38844j.f38727b;
        z e11 = this.f38836b.e(str);
        this.f38844j.e(197, e11.f38895a).g(i11);
        r rVar = this.P;
        if (rVar != null) {
            int i12 = this.M;
            if (i12 != 4 && i12 != 3) {
                this.Q += 1 - i11;
            } else {
                rVar.f38829j.d(197, i11, e11, this.f38836b);
            }
        }
    }

    @Override // mq.s
    public void x(String str, int i11) {
        if (this.K == null) {
            this.K = new d();
        }
        this.J++;
        this.K.k(str == null ? 0 : this.f38836b.D(str)).k(i11);
    }

    @Override // mq.s
    public a y(int i11, String str, boolean z11) {
        if (z11) {
            if (this.D == null) {
                this.D = new b[b0.b(this.f38841g).length];
            }
            b[] bVarArr = this.D;
            b j11 = b.j(this.f38836b, str, bVarArr[i11]);
            bVarArr[i11] = j11;
            return j11;
        }
        if (this.F == null) {
            this.F = new b[b0.b(this.f38841g).length];
        }
        b[] bVarArr2 = this.F;
        b j12 = b.j(this.f38836b, str, bVarArr2[i11]);
        bVarArr2[i11] = j12;
        return j12;
    }

    @Override // mq.s
    public void z(int i11, int i12, r rVar, r... rVarArr) {
        d dVar = this.f38844j;
        this.Y = dVar.f38727b;
        dVar.g(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256).h(null, 0, (4 - (this.f38844j.f38727b % 4)) % 4);
        rVar.h(this.f38844j, this.Y, true);
        this.f38844j.i(i11).i(i12);
        for (r rVar2 : rVarArr) {
            rVar2.h(this.f38844j, this.Y, true);
        }
        W(rVar, rVarArr);
    }
}