package d3;

import d3.e;
import f3.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a implements d {
    private float Z;

    /* renamed from: a  reason: collision with root package name */
    private Object f23497a;

    /* renamed from: a0  reason: collision with root package name */
    private float f23498a0;

    /* renamed from: b  reason: collision with root package name */
    final e f23499b;

    /* renamed from: c0  reason: collision with root package name */
    b f23502c0;

    /* renamed from: d0  reason: collision with root package name */
    b f23504d0;

    /* renamed from: e0  reason: collision with root package name */
    private Object f23506e0;

    /* renamed from: f0  reason: collision with root package name */
    private f3.e f23508f0;

    /* renamed from: g0  reason: collision with root package name */
    private HashMap<String, Integer> f23510g0;

    /* renamed from: h0  reason: collision with root package name */
    private HashMap<String, Float> f23512h0;

    /* renamed from: c  reason: collision with root package name */
    e3.a f23501c = null;

    /* renamed from: d  reason: collision with root package name */
    int f23503d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f23505e = 0;

    /* renamed from: f  reason: collision with root package name */
    float f23507f = -1.0f;

    /* renamed from: g  reason: collision with root package name */
    float f23509g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    float f23511h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    float f23513i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    protected int f23514j = 0;

    /* renamed from: k  reason: collision with root package name */
    protected int f23515k = 0;

    /* renamed from: l  reason: collision with root package name */
    protected int f23516l = 0;

    /* renamed from: m  reason: collision with root package name */
    protected int f23517m = 0;

    /* renamed from: n  reason: collision with root package name */
    protected int f23518n = 0;

    /* renamed from: o  reason: collision with root package name */
    protected int f23519o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f23520p = 0;

    /* renamed from: q  reason: collision with root package name */
    protected int f23521q = 0;

    /* renamed from: r  reason: collision with root package name */
    protected int f23522r = 0;

    /* renamed from: s  reason: collision with root package name */
    protected int f23523s = 0;

    /* renamed from: t  reason: collision with root package name */
    protected int f23524t = 0;

    /* renamed from: u  reason: collision with root package name */
    protected int f23525u = 0;

    /* renamed from: v  reason: collision with root package name */
    int f23526v = 0;

    /* renamed from: w  reason: collision with root package name */
    int f23527w = 0;

    /* renamed from: x  reason: collision with root package name */
    float f23528x = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    float f23529y = Float.NaN;

    /* renamed from: z  reason: collision with root package name */
    float f23530z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    int I = 0;
    protected Object J = null;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    protected Object T = null;
    protected Object U = null;
    Object V = null;
    Object W = null;
    Object X = null;
    Object Y = null;

    /* renamed from: b0  reason: collision with root package name */
    e.a f23500b0 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0453a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23531a;

        static {
            int[] iArr = new int[e.a.values().length];
            f23531a = iArr;
            try {
                iArr[e.a.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23531a[e.a.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23531a[e.a.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23531a[e.a.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23531a[e.a.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23531a[e.a.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23531a[e.a.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23531a[e.a.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23531a[e.a.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23531a[e.a.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23531a[e.a.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23531a[e.a.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23531a[e.a.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23531a[e.a.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23531a[e.a.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23531a[e.a.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23531a[e.a.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23531a[e.a.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public a(e eVar) {
        Object obj = b.f23533i;
        this.f23502c0 = b.b(obj);
        this.f23504d0 = b.b(obj);
        this.f23510g0 = new HashMap<>();
        this.f23512h0 = new HashMap<>();
        this.f23499b = eVar;
    }

    private void e(f3.e eVar, Object obj, e.a aVar) {
        f3.e o11 = o(obj);
        if (o11 == null) {
            return;
        }
        int[] iArr = C0453a.f23531a;
        int i11 = iArr[aVar.ordinal()];
        switch (iArr[aVar.ordinal()]) {
            case 1:
                d.b bVar = d.b.LEFT;
                eVar.m(bVar).a(o11.m(bVar), this.f23514j, this.f23520p, false);
                return;
            case 2:
                eVar.m(d.b.LEFT).a(o11.m(d.b.RIGHT), this.f23514j, this.f23520p, false);
                return;
            case 3:
                eVar.m(d.b.RIGHT).a(o11.m(d.b.LEFT), this.f23515k, this.f23521q, false);
                return;
            case 4:
                d.b bVar2 = d.b.RIGHT;
                eVar.m(bVar2).a(o11.m(bVar2), this.f23515k, this.f23521q, false);
                return;
            case 5:
                d.b bVar3 = d.b.LEFT;
                eVar.m(bVar3).a(o11.m(bVar3), this.f23516l, this.f23522r, false);
                return;
            case 6:
                eVar.m(d.b.LEFT).a(o11.m(d.b.RIGHT), this.f23516l, this.f23522r, false);
                return;
            case 7:
                eVar.m(d.b.RIGHT).a(o11.m(d.b.LEFT), this.f23517m, this.f23523s, false);
                return;
            case 8:
                d.b bVar4 = d.b.RIGHT;
                eVar.m(bVar4).a(o11.m(bVar4), this.f23517m, this.f23523s, false);
                return;
            case 9:
                d.b bVar5 = d.b.TOP;
                eVar.m(bVar5).a(o11.m(bVar5), this.f23518n, this.f23524t, false);
                return;
            case 10:
                eVar.m(d.b.TOP).a(o11.m(d.b.BOTTOM), this.f23518n, this.f23524t, false);
                return;
            case 11:
                eVar.m(d.b.BOTTOM).a(o11.m(d.b.TOP), this.f23519o, this.f23525u, false);
                return;
            case 12:
                d.b bVar6 = d.b.BOTTOM;
                eVar.m(bVar6).a(o11.m(bVar6), this.f23519o, this.f23525u, false);
                return;
            case 13:
                eVar.e0(d.b.BASELINE, o11, d.b.BOTTOM, this.f23526v, this.f23527w);
                return;
            case 14:
                eVar.e0(d.b.BASELINE, o11, d.b.TOP, this.f23526v, this.f23527w);
                return;
            case 15:
                d.b bVar7 = d.b.BASELINE;
                eVar.e0(bVar7, o11, bVar7, this.f23526v, this.f23527w);
                return;
            case 16:
                eVar.j(o11, this.Z, (int) this.f23498a0);
                return;
            default:
                return;
        }
    }

    private void j() {
        this.J = m(this.J);
        this.K = m(this.K);
        this.L = m(this.L);
        this.M = m(this.M);
        this.N = m(this.N);
        this.O = m(this.O);
        this.P = m(this.P);
        this.Q = m(this.Q);
        this.R = m(this.R);
        this.S = m(this.S);
        this.T = m(this.T);
        this.U = m(this.U);
        this.V = m(this.V);
        this.W = m(this.W);
        this.X = m(this.X);
    }

    private Object m(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f23499b.g(obj) : obj;
    }

    private f3.e o(Object obj) {
        if (obj instanceof d) {
            return ((d) obj).a();
        }
        return null;
    }

    public void A(Object obj) {
        this.f23506e0 = obj;
        f3.e eVar = this.f23508f0;
        if (eVar != null) {
            eVar.A0(obj);
        }
    }

    public a B(b bVar) {
        this.f23502c0 = bVar;
        return this;
    }

    public a C(Object obj) {
        this.f23500b0 = e.a.START_TO_END;
        this.O = obj;
        return this;
    }

    public a D(Object obj) {
        this.f23500b0 = e.a.START_TO_START;
        this.N = obj;
        return this;
    }

    public a E(Object obj) {
        this.f23500b0 = e.a.TOP_TO_BOTTOM;
        this.S = obj;
        return this;
    }

    public a F(Object obj) {
        this.f23500b0 = e.a.TOP_TO_TOP;
        this.R = obj;
        return this;
    }

    @Override // d3.d
    public f3.e a() {
        if (this.f23508f0 == null) {
            f3.e i11 = i();
            this.f23508f0 = i11;
            i11.A0(this.f23506e0);
        }
        return this.f23508f0;
    }

    @Override // d3.d
    public void apply() {
        if (this.f23508f0 == null) {
            return;
        }
        e3.a aVar = this.f23501c;
        if (aVar != null) {
            aVar.apply();
        }
        this.f23502c0.d(this.f23499b, this.f23508f0, 0);
        this.f23504d0.d(this.f23499b, this.f23508f0, 1);
        j();
        e(this.f23508f0, this.J, e.a.LEFT_TO_LEFT);
        e(this.f23508f0, this.K, e.a.LEFT_TO_RIGHT);
        e(this.f23508f0, this.L, e.a.RIGHT_TO_LEFT);
        e(this.f23508f0, this.M, e.a.RIGHT_TO_RIGHT);
        e(this.f23508f0, this.N, e.a.START_TO_START);
        e(this.f23508f0, this.O, e.a.START_TO_END);
        e(this.f23508f0, this.P, e.a.END_TO_START);
        e(this.f23508f0, this.Q, e.a.END_TO_END);
        e(this.f23508f0, this.R, e.a.TOP_TO_TOP);
        e(this.f23508f0, this.S, e.a.TOP_TO_BOTTOM);
        e(this.f23508f0, this.T, e.a.BOTTOM_TO_TOP);
        e(this.f23508f0, this.U, e.a.BOTTOM_TO_BOTTOM);
        e(this.f23508f0, this.V, e.a.BASELINE_TO_BASELINE);
        e(this.f23508f0, this.W, e.a.BASELINE_TO_TOP);
        e(this.f23508f0, this.X, e.a.BASELINE_TO_BOTTOM);
        e(this.f23508f0, this.Y, e.a.CIRCULAR_CONSTRAINT);
        int i11 = this.f23503d;
        if (i11 != 0) {
            this.f23508f0.M0(i11);
        }
        int i12 = this.f23505e;
        if (i12 != 0) {
            this.f23508f0.d1(i12);
        }
        float f11 = this.f23507f;
        if (f11 != -1.0f) {
            this.f23508f0.Q0(f11);
        }
        float f12 = this.f23509g;
        if (f12 != -1.0f) {
            this.f23508f0.h1(f12);
        }
        this.f23508f0.L0(this.f23511h);
        this.f23508f0.c1(this.f23513i);
        f3.e eVar = this.f23508f0;
        f fVar = eVar.f25724l;
        fVar.f23556f = this.f23528x;
        fVar.f23557g = this.f23529y;
        fVar.f23558h = this.f23530z;
        fVar.f23559i = this.A;
        fVar.f23560j = this.B;
        fVar.f23561k = this.C;
        fVar.f23562l = this.D;
        fVar.f23563m = this.E;
        fVar.f23564n = this.G;
        fVar.f23565o = this.H;
        fVar.f23566p = this.F;
        int i13 = this.I;
        fVar.f23568r = i13;
        eVar.i1(i13);
        HashMap<String, Integer> hashMap = this.f23510g0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f23508f0.f25724l.g(str, 902, this.f23510g0.get(str).intValue());
            }
        }
        HashMap<String, Float> hashMap2 = this.f23512h0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f23508f0.f25724l.f(str2, 901, this.f23512h0.get(str2).floatValue());
            }
        }
    }

    @Override // d3.d
    public void b(f3.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f23508f0 = eVar;
        eVar.A0(this.f23506e0);
    }

    @Override // d3.d
    public void c(Object obj) {
        this.f23497a = obj;
    }

    @Override // d3.d
    public e3.a d() {
        return this.f23501c;
    }

    public a f(Object obj) {
        this.f23500b0 = e.a.BASELINE_TO_BASELINE;
        this.V = obj;
        return this;
    }

    public a g(Object obj) {
        this.f23500b0 = e.a.BOTTOM_TO_BOTTOM;
        this.U = obj;
        return this;
    }

    @Override // d3.d
    public Object getKey() {
        return this.f23497a;
    }

    public a h(Object obj) {
        this.f23500b0 = e.a.BOTTOM_TO_TOP;
        this.T = obj;
        return this;
    }

    public f3.e i() {
        return new f3.e(p().g(), n().g());
    }

    public a k(Object obj) {
        this.f23500b0 = e.a.END_TO_END;
        this.Q = obj;
        return this;
    }

    public a l(Object obj) {
        this.f23500b0 = e.a.END_TO_START;
        this.P = obj;
        return this;
    }

    public b n() {
        return this.f23504d0;
    }

    public b p() {
        return this.f23502c0;
    }

    public a q(Object obj) {
        this.f23500b0 = e.a.LEFT_TO_LEFT;
        this.J = obj;
        return this;
    }

    public a r(Object obj) {
        this.f23500b0 = e.a.LEFT_TO_RIGHT;
        this.K = obj;
        return this;
    }

    public a s(int i11) {
        e.a aVar = this.f23500b0;
        if (aVar != null) {
            switch (C0453a.f23531a[aVar.ordinal()]) {
                case 1:
                case 2:
                    this.f23514j = i11;
                    break;
                case 3:
                case 4:
                    this.f23515k = i11;
                    break;
                case 5:
                case 6:
                    this.f23516l = i11;
                    break;
                case 7:
                case 8:
                    this.f23517m = i11;
                    break;
                case 9:
                case 10:
                    this.f23518n = i11;
                    break;
                case 11:
                case 12:
                    this.f23519o = i11;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f23526v = i11;
                    break;
                case 16:
                    this.f23498a0 = i11;
                    break;
            }
        } else {
            this.f23514j = i11;
            this.f23515k = i11;
            this.f23516l = i11;
            this.f23517m = i11;
            this.f23518n = i11;
            this.f23519o = i11;
        }
        return this;
    }

    public a t(Object obj) {
        return s(this.f23499b.c(obj));
    }

    public a u(int i11) {
        e.a aVar = this.f23500b0;
        if (aVar != null) {
            switch (C0453a.f23531a[aVar.ordinal()]) {
                case 1:
                case 2:
                    this.f23520p = i11;
                    break;
                case 3:
                case 4:
                    this.f23521q = i11;
                    break;
                case 5:
                case 6:
                    this.f23522r = i11;
                    break;
                case 7:
                case 8:
                    this.f23523s = i11;
                    break;
                case 9:
                case 10:
                    this.f23524t = i11;
                    break;
                case 11:
                case 12:
                    this.f23525u = i11;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f23527w = i11;
                    break;
            }
        } else {
            this.f23520p = i11;
            this.f23521q = i11;
            this.f23522r = i11;
            this.f23523s = i11;
            this.f23524t = i11;
            this.f23525u = i11;
        }
        return this;
    }

    public a v(Object obj) {
        return u(this.f23499b.c(obj));
    }

    public a w(Object obj) {
        this.f23500b0 = e.a.RIGHT_TO_LEFT;
        this.L = obj;
        return this;
    }

    public a x(Object obj) {
        this.f23500b0 = e.a.RIGHT_TO_RIGHT;
        this.M = obj;
        return this;
    }

    public a y(b bVar) {
        this.f23504d0 = bVar;
        return this;
    }

    public void z(String str) {
    }
}