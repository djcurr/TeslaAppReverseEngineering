package f3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.d;
import g3.n;
import g3.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: w0  reason: collision with root package name */
    public static float f25701w0 = 0.5f;
    public int A;
    public int B;
    public float C;
    int D;
    float E;
    private int[] F;
    private float G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    public d M;
    public d N;
    public d O;
    public d P;
    public d Q;
    d R;
    d S;
    public d T;
    public d[] U;
    protected ArrayList<d> V;
    private boolean[] W;
    public b[] X;
    public e Y;
    int Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25702a;

    /* renamed from: a0  reason: collision with root package name */
    int f25703a0;

    /* renamed from: b  reason: collision with root package name */
    public g3.c f25704b;

    /* renamed from: b0  reason: collision with root package name */
    public float f25705b0;

    /* renamed from: c  reason: collision with root package name */
    public g3.c f25706c;

    /* renamed from: c0  reason: collision with root package name */
    protected int f25707c0;

    /* renamed from: d  reason: collision with root package name */
    public g3.l f25708d;

    /* renamed from: d0  reason: collision with root package name */
    protected int f25709d0;

    /* renamed from: e  reason: collision with root package name */
    public n f25710e;

    /* renamed from: e0  reason: collision with root package name */
    protected int f25711e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f25712f;

    /* renamed from: f0  reason: collision with root package name */
    int f25713f0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25714g;

    /* renamed from: g0  reason: collision with root package name */
    protected int f25715g0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25716h;

    /* renamed from: h0  reason: collision with root package name */
    protected int f25717h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f25718i;

    /* renamed from: i0  reason: collision with root package name */
    float f25719i0;

    /* renamed from: j  reason: collision with root package name */
    private int f25720j;

    /* renamed from: j0  reason: collision with root package name */
    float f25721j0;

    /* renamed from: k  reason: collision with root package name */
    private int f25722k;

    /* renamed from: k0  reason: collision with root package name */
    private Object f25723k0;

    /* renamed from: l  reason: collision with root package name */
    public d3.f f25724l;

    /* renamed from: l0  reason: collision with root package name */
    private int f25725l0;

    /* renamed from: m  reason: collision with root package name */
    public String f25726m;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f25727m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f25728n;

    /* renamed from: n0  reason: collision with root package name */
    private String f25729n0;

    /* renamed from: o  reason: collision with root package name */
    private boolean f25730o;

    /* renamed from: o0  reason: collision with root package name */
    private String f25731o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25732p;

    /* renamed from: p0  reason: collision with root package name */
    int f25733p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f25734q;

    /* renamed from: q0  reason: collision with root package name */
    int f25735q0;

    /* renamed from: r  reason: collision with root package name */
    public int f25736r;

    /* renamed from: r0  reason: collision with root package name */
    public float[] f25737r0;

    /* renamed from: s  reason: collision with root package name */
    public int f25738s;

    /* renamed from: s0  reason: collision with root package name */
    protected e[] f25739s0;

    /* renamed from: t  reason: collision with root package name */
    private int f25740t;

    /* renamed from: t0  reason: collision with root package name */
    protected e[] f25741t0;

    /* renamed from: u  reason: collision with root package name */
    public int f25742u;

    /* renamed from: u0  reason: collision with root package name */
    public int f25743u0;

    /* renamed from: v  reason: collision with root package name */
    public int f25744v;

    /* renamed from: v0  reason: collision with root package name */
    public int f25745v0;

    /* renamed from: w  reason: collision with root package name */
    public int[] f25746w;

    /* renamed from: x  reason: collision with root package name */
    public int f25747x;

    /* renamed from: y  reason: collision with root package name */
    public int f25748y;

    /* renamed from: z  reason: collision with root package name */
    public float f25749z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25750a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f25751b;

        static {
            int[] iArr = new int[b.values().length];
            f25751b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25751b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25751b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25751b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f25750a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25750a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25750a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25750a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25750a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25750a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25750a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25750a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25750a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        this.f25702a = false;
        this.f25708d = null;
        this.f25710e = null;
        this.f25712f = new boolean[]{true, true};
        this.f25714g = true;
        this.f25716h = false;
        this.f25718i = true;
        this.f25720j = -1;
        this.f25722k = -1;
        this.f25724l = new d3.f(this);
        this.f25728n = false;
        this.f25730o = false;
        this.f25732p = false;
        this.f25734q = false;
        this.f25736r = -1;
        this.f25738s = -1;
        this.f25740t = 0;
        this.f25742u = 0;
        this.f25744v = 0;
        this.f25746w = new int[2];
        this.f25747x = 0;
        this.f25748y = 0;
        this.f25749z = 1.0f;
        this.A = 0;
        this.B = 0;
        this.C = 1.0f;
        this.D = -1;
        this.E = 1.0f;
        this.F = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.G = BitmapDescriptorFactory.HUE_RED;
        this.H = false;
        this.J = false;
        this.K = 0;
        this.L = 0;
        this.M = new d(this, d.b.LEFT);
        this.N = new d(this, d.b.TOP);
        this.O = new d(this, d.b.RIGHT);
        this.P = new d(this, d.b.BOTTOM);
        this.Q = new d(this, d.b.BASELINE);
        this.R = new d(this, d.b.CENTER_X);
        this.S = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.T = dVar;
        this.U = new d[]{this.M, this.O, this.N, this.P, this.Q, dVar};
        this.V = new ArrayList<>();
        this.W = new boolean[2];
        b bVar = b.FIXED;
        this.X = new b[]{bVar, bVar};
        this.Y = null;
        this.Z = 0;
        this.f25703a0 = 0;
        this.f25705b0 = BitmapDescriptorFactory.HUE_RED;
        this.f25707c0 = -1;
        this.f25709d0 = 0;
        this.f25711e0 = 0;
        this.f25713f0 = 0;
        float f11 = f25701w0;
        this.f25719i0 = f11;
        this.f25721j0 = f11;
        this.f25725l0 = 0;
        this.f25727m0 = false;
        this.f25729n0 = null;
        this.f25731o0 = null;
        this.f25733p0 = 0;
        this.f25735q0 = 0;
        this.f25737r0 = new float[]{-1.0f, -1.0f};
        this.f25739s0 = new e[]{null, null};
        this.f25741t0 = new e[]{null, null};
        this.f25743u0 = -1;
        this.f25745v0 = -1;
        d();
    }

    private void O(StringBuilder sb2, String str, int i11, int i12, int i13, int i14, int i15, int i16, float f11, float f12) {
        sb2.append(str);
        sb2.append(" :  {\n");
        x0(sb2, "      size", i11, 0);
        x0(sb2, "      min", i12, 0);
        x0(sb2, "      max", i13, Integer.MAX_VALUE);
        x0(sb2, "      matchMin", i15, 0);
        x0(sb2, "      matchDef", i16, 0);
        w0(sb2, "      matchPercent", f11, 1.0f);
        sb2.append("    },\n");
    }

    private void P(StringBuilder sb2, String str, d dVar) {
        if (dVar.f25696f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f25696f);
        sb2.append("'");
        if (dVar.f25698h != Integer.MIN_VALUE || dVar.f25697g != 0) {
            sb2.append(",");
            sb2.append(dVar.f25697g);
            if (dVar.f25698h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f25698h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.V.add(this.M);
        this.V.add(this.N);
        this.V.add(this.O);
        this.V.add(this.P);
        this.V.add(this.R);
        this.V.add(this.S);
        this.V.add(this.T);
        this.V.add(this.Q);
    }

    private boolean f0(int i11) {
        int i12 = i11 * 2;
        d[] dVarArr = this.U;
        if (dVarArr[i12].f25696f != null && dVarArr[i12].f25696f.f25696f != dVarArr[i12]) {
            int i13 = i12 + 1;
            if (dVarArr[i13].f25696f != null && dVarArr[i13].f25696f.f25696f == dVarArr[i13]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x049c, code lost:
        if ((r4 instanceof f3.a) != false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x055b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:386:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(a3.d r38, boolean r39, boolean r40, boolean r41, boolean r42, a3.i r43, a3.i r44, f3.e.b r45, boolean r46, f3.d r47, f3.d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.e.i(a3.d, boolean, boolean, boolean, boolean, a3.i, a3.i, f3.e$b, boolean, f3.d, f3.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void w0(StringBuilder sb2, String str, float f11, float f12) {
        if (f11 == f12) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f11);
        sb2.append(",\n");
    }

    private void x0(StringBuilder sb2, String str, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    private void y0(StringBuilder sb2, String str, float f11, int i11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f11);
        sb2.append(",");
        sb2.append(i11);
        sb2.append("");
        sb2.append("],\n");
    }

    public int A() {
        return this.K;
    }

    public void A0(Object obj) {
        this.f25723k0 = obj;
    }

    public int B() {
        return this.L;
    }

    public void B0(String str) {
        this.f25729n0 = str;
    }

    public int C() {
        return X();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void C0(String str) {
        float f11;
        int i11 = 0;
        if (str != null && str.length() != 0) {
            int i12 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i13 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i12 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i12 = 1;
                }
                i13 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i13, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > BitmapDescriptorFactory.HUE_RED && parseFloat2 > BitmapDescriptorFactory.HUE_RED) {
                        if (i12 == 1) {
                            f11 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f11 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f11 = i11;
            } else {
                String substring4 = str.substring(i13);
                if (substring4.length() > 0) {
                    f11 = Float.parseFloat(substring4);
                }
                f11 = i11;
            }
            i11 = (f11 > i11 ? 1 : (f11 == i11 ? 0 : -1));
            if (i11 > 0) {
                this.f25705b0 = f11;
                this.f25707c0 = i12;
                return;
            }
            return;
        }
        this.f25705b0 = BitmapDescriptorFactory.HUE_RED;
    }

    public int D(int i11) {
        if (i11 == 0) {
            return W();
        }
        if (i11 == 1) {
            return v();
        }
        return 0;
    }

    public void D0(int i11) {
        if (this.H) {
            int i12 = i11 - this.f25713f0;
            int i13 = this.f25703a0 + i12;
            this.f25711e0 = i12;
            this.N.s(i12);
            this.P.s(i13);
            this.Q.s(i11);
            this.f25730o = true;
        }
    }

    public int E() {
        return this.F[1];
    }

    public void E0(int i11, int i12) {
        if (this.f25728n) {
            return;
        }
        this.M.s(i11);
        this.O.s(i12);
        this.f25709d0 = i11;
        this.Z = i12 - i11;
        this.f25728n = true;
    }

    public int F() {
        return this.F[0];
    }

    public void F0(int i11) {
        this.M.s(i11);
        this.f25709d0 = i11;
    }

    public int G() {
        return this.f25717h0;
    }

    public void G0(int i11) {
        this.N.s(i11);
        this.f25711e0 = i11;
    }

    public int H() {
        return this.f25715g0;
    }

    public void H0(int i11, int i12) {
        if (this.f25730o) {
            return;
        }
        this.N.s(i11);
        this.P.s(i12);
        this.f25711e0 = i11;
        this.f25703a0 = i12 - i11;
        if (this.H) {
            this.Q.s(i11 + this.f25713f0);
        }
        this.f25730o = true;
    }

    public e I(int i11) {
        d dVar;
        d dVar2;
        if (i11 != 0) {
            if (i11 == 1 && (dVar2 = (dVar = this.P).f25696f) != null && dVar2.f25696f == dVar) {
                return dVar2.f25694d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f25696f;
        if (dVar4 == null || dVar4.f25696f != dVar3) {
            return null;
        }
        return dVar4.f25694d;
    }

    public void I0(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        this.f25709d0 = i11;
        this.f25711e0 = i12;
        if (this.f25725l0 == 8) {
            this.Z = 0;
            this.f25703a0 = 0;
            return;
        }
        b[] bVarArr = this.X;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i17 < (i16 = this.Z)) {
            i17 = i16;
        }
        if (bVarArr[1] == bVar2 && i18 < (i15 = this.f25703a0)) {
            i18 = i15;
        }
        this.Z = i17;
        this.f25703a0 = i18;
        int i19 = this.f25717h0;
        if (i18 < i19) {
            this.f25703a0 = i19;
        }
        int i21 = this.f25715g0;
        if (i17 < i21) {
            this.Z = i21;
        }
        int i22 = this.f25748y;
        if (i22 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.Z = Math.min(this.Z, i22);
        }
        int i23 = this.B;
        if (i23 > 0 && this.X[1] == b.MATCH_CONSTRAINT) {
            this.f25703a0 = Math.min(this.f25703a0, i23);
        }
        int i24 = this.Z;
        if (i17 != i24) {
            this.f25720j = i24;
        }
        int i25 = this.f25703a0;
        if (i18 != i25) {
            this.f25722k = i25;
        }
    }

    public e J() {
        return this.Y;
    }

    public void J0(boolean z11) {
        this.H = z11;
    }

    public e K(int i11) {
        d dVar;
        d dVar2;
        if (i11 != 0) {
            if (i11 == 1 && (dVar2 = (dVar = this.N).f25696f) != null && dVar2.f25696f == dVar) {
                return dVar2.f25694d;
            }
            return null;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f25696f;
        if (dVar4 == null || dVar4.f25696f != dVar3) {
            return null;
        }
        return dVar4.f25694d;
    }

    public void K0(int i11) {
        this.f25703a0 = i11;
        int i12 = this.f25717h0;
        if (i11 < i12) {
            this.f25703a0 = i12;
        }
    }

    public int L() {
        return X() + this.Z;
    }

    public void L0(float f11) {
        this.f25719i0 = f11;
    }

    public p M(int i11) {
        if (i11 == 0) {
            return this.f25708d;
        }
        if (i11 == 1) {
            return this.f25710e;
        }
        return null;
    }

    public void M0(int i11) {
        this.f25733p0 = i11;
    }

    public void N(StringBuilder sb2) {
        sb2.append("  " + this.f25726m + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.Z);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f25703a0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f25709d0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f25711e0);
        sb2.append("\n");
        P(sb2, "left", this.M);
        P(sb2, "top", this.N);
        P(sb2, "right", this.O);
        P(sb2, "bottom", this.P);
        P(sb2, "baseline", this.Q);
        P(sb2, "centerX", this.R);
        P(sb2, "centerY", this.S);
        O(sb2, "    width", this.Z, this.f25715g0, this.F[0], this.f25720j, this.f25747x, this.f25742u, this.f25749z, this.f25737r0[0]);
        O(sb2, "    height", this.f25703a0, this.f25717h0, this.F[1], this.f25722k, this.A, this.f25744v, this.C, this.f25737r0[1]);
        y0(sb2, "    dimensionRatio", this.f25705b0, this.f25707c0);
        w0(sb2, "    horizontalBias", this.f25719i0, f25701w0);
        w0(sb2, "    verticalBias", this.f25721j0, f25701w0);
        x0(sb2, "    horizontalChainStyle", this.f25733p0, 0);
        x0(sb2, "    verticalChainStyle", this.f25735q0, 0);
        sb2.append("  }");
    }

    public void N0(int i11, int i12) {
        this.f25709d0 = i11;
        int i13 = i12 - i11;
        this.Z = i13;
        int i14 = this.f25715g0;
        if (i13 < i14) {
            this.Z = i14;
        }
    }

    public void O0(b bVar) {
        this.X[0] = bVar;
    }

    public void P0(int i11, int i12, int i13, float f11) {
        this.f25742u = i11;
        this.f25747x = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.f25748y = i13;
        this.f25749z = f11;
        if (f11 <= BitmapDescriptorFactory.HUE_RED || f11 >= 1.0f || i11 != 0) {
            return;
        }
        this.f25742u = 2;
    }

    public int Q() {
        return Y();
    }

    public void Q0(float f11) {
        this.f25737r0[0] = f11;
    }

    public float R() {
        return this.f25721j0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void R0(int i11, boolean z11) {
        this.W[i11] = z11;
    }

    public int S() {
        return this.f25735q0;
    }

    public void S0(boolean z11) {
        this.I = z11;
    }

    public b T() {
        return this.X[1];
    }

    public void T0(boolean z11) {
        this.J = z11;
    }

    public int U() {
        int i11 = this.M != null ? 0 + this.N.f25697g : 0;
        return this.O != null ? i11 + this.P.f25697g : i11;
    }

    public void U0(int i11, int i12) {
        this.K = i11;
        this.L = i12;
        X0(false);
    }

    public int V() {
        return this.f25725l0;
    }

    public void V0(int i11) {
        this.F[1] = i11;
    }

    public int W() {
        if (this.f25725l0 == 8) {
            return 0;
        }
        return this.Z;
    }

    public void W0(int i11) {
        this.F[0] = i11;
    }

    public int X() {
        e eVar = this.Y;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).E0 + this.f25709d0;
        }
        return this.f25709d0;
    }

    public void X0(boolean z11) {
        this.f25714g = z11;
    }

    public int Y() {
        e eVar = this.Y;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).F0 + this.f25711e0;
        }
        return this.f25711e0;
    }

    public void Y0(int i11) {
        if (i11 < 0) {
            this.f25717h0 = 0;
        } else {
            this.f25717h0 = i11;
        }
    }

    public boolean Z() {
        return this.H;
    }

    public void Z0(int i11) {
        if (i11 < 0) {
            this.f25715g0 = 0;
        } else {
            this.f25715g0 = i11;
        }
    }

    public boolean a0(int i11) {
        if (i11 == 0) {
            return (this.M.f25696f != null ? 1 : 0) + (this.O.f25696f != null ? 1 : 0) < 2;
        }
        return ((this.N.f25696f != null ? 1 : 0) + (this.P.f25696f != null ? 1 : 0)) + (this.Q.f25696f != null ? 1 : 0) < 2;
    }

    public void a1(int i11, int i12) {
        this.f25709d0 = i11;
        this.f25711e0 = i12;
    }

    public boolean b0() {
        int size = this.V.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.V.get(i11).l()) {
                return true;
            }
        }
        return false;
    }

    public void b1(e eVar) {
        this.Y = eVar;
    }

    public boolean c0() {
        return (this.f25720j == -1 && this.f25722k == -1) ? false : true;
    }

    public void c1(float f11) {
        this.f25721j0 = f11;
    }

    public boolean d0(int i11, int i12) {
        d dVar;
        d dVar2;
        if (i11 == 0) {
            d dVar3 = this.M.f25696f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.O.f25696f) != null && dVar2.m() && (this.O.f25696f.d() - this.O.e()) - (this.M.f25696f.d() + this.M.e()) >= i12;
        }
        d dVar4 = this.N.f25696f;
        return dVar4 != null && dVar4.m() && (dVar = this.P.f25696f) != null && dVar.m() && (this.P.f25696f.d() - this.P.e()) - (this.N.f25696f.d() + this.N.e()) >= i12;
        return false;
    }

    public void d1(int i11) {
        this.f25735q0 = i11;
    }

    public void e(f fVar, a3.d dVar, HashSet<e> hashSet, int i11, boolean z11) {
        if (z11) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.S1(64));
        }
        if (i11 == 0) {
            HashSet<d> c11 = this.M.c();
            if (c11 != null) {
                Iterator<d> it2 = c11.iterator();
                while (it2.hasNext()) {
                    it2.next().f25694d.e(fVar, dVar, hashSet, i11, true);
                }
            }
            HashSet<d> c12 = this.O.c();
            if (c12 != null) {
                Iterator<d> it3 = c12.iterator();
                while (it3.hasNext()) {
                    it3.next().f25694d.e(fVar, dVar, hashSet, i11, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c13 = this.N.c();
        if (c13 != null) {
            Iterator<d> it4 = c13.iterator();
            while (it4.hasNext()) {
                it4.next().f25694d.e(fVar, dVar, hashSet, i11, true);
            }
        }
        HashSet<d> c14 = this.P.c();
        if (c14 != null) {
            Iterator<d> it5 = c14.iterator();
            while (it5.hasNext()) {
                it5.next().f25694d.e(fVar, dVar, hashSet, i11, true);
            }
        }
        HashSet<d> c15 = this.Q.c();
        if (c15 != null) {
            Iterator<d> it6 = c15.iterator();
            while (it6.hasNext()) {
                it6.next().f25694d.e(fVar, dVar, hashSet, i11, true);
            }
        }
    }

    public void e0(d.b bVar, e eVar, d.b bVar2, int i11, int i12) {
        m(bVar).a(eVar.m(bVar2), i11, i12, true);
    }

    public void e1(int i11, int i12) {
        this.f25711e0 = i11;
        int i13 = i12 - i11;
        this.f25703a0 = i13;
        int i14 = this.f25717h0;
        if (i13 < i14) {
            this.f25703a0 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public void f1(b bVar) {
        this.X[1] = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(a3.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.e.g(a3.d, boolean):void");
    }

    public boolean g0() {
        return this.f25732p;
    }

    public void g1(int i11, int i12, int i13, float f11) {
        this.f25744v = i11;
        this.A = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.B = i13;
        this.C = f11;
        if (f11 <= BitmapDescriptorFactory.HUE_RED || f11 >= 1.0f || i11 != 0) {
            return;
        }
        this.f25744v = 2;
    }

    public boolean h() {
        return this.f25725l0 != 8;
    }

    public boolean h0(int i11) {
        return this.W[i11];
    }

    public void h1(float f11) {
        this.f25737r0[1] = f11;
    }

    public boolean i0() {
        d dVar = this.M;
        d dVar2 = dVar.f25696f;
        if (dVar2 == null || dVar2.f25696f != dVar) {
            d dVar3 = this.O;
            d dVar4 = dVar3.f25696f;
            return dVar4 != null && dVar4.f25696f == dVar3;
        }
        return true;
    }

    public void i1(int i11) {
        this.f25725l0 = i11;
    }

    public void j(e eVar, float f11, int i11) {
        d.b bVar = d.b.CENTER;
        e0(bVar, eVar, bVar, i11, 0);
        this.G = f11;
    }

    public boolean j0() {
        return this.I;
    }

    public void j1(int i11) {
        this.Z = i11;
        int i12 = this.f25715g0;
        if (i11 < i12) {
            this.Z = i12;
        }
    }

    public void k(a3.d dVar) {
        dVar.q(this.M);
        dVar.q(this.N);
        dVar.q(this.O);
        dVar.q(this.P);
        if (this.f25713f0 > 0) {
            dVar.q(this.Q);
        }
    }

    public boolean k0() {
        d dVar = this.N;
        d dVar2 = dVar.f25696f;
        if (dVar2 == null || dVar2.f25696f != dVar) {
            d dVar3 = this.P;
            d dVar4 = dVar3.f25696f;
            return dVar4 != null && dVar4.f25696f == dVar3;
        }
        return true;
    }

    public void k1(int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        this.f25740t = i11;
    }

    public void l() {
        if (this.f25708d == null) {
            this.f25708d = new g3.l(this);
        }
        if (this.f25710e == null) {
            this.f25710e = new n(this);
        }
    }

    public boolean l0() {
        return this.J;
    }

    public void l1(int i11) {
        this.f25709d0 = i11;
    }

    public d m(d.b bVar) {
        switch (a.f25750a[bVar.ordinal()]) {
            case 1:
                return this.M;
            case 2:
                return this.N;
            case 3:
                return this.O;
            case 4:
                return this.P;
            case 5:
                return this.Q;
            case 6:
                return this.T;
            case 7:
                return this.R;
            case 8:
                return this.S;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f25714g && this.f25725l0 != 8;
    }

    public void m1(int i11) {
        this.f25711e0 = i11;
    }

    public int n() {
        return this.f25713f0;
    }

    public boolean n0() {
        return this.f25728n || (this.M.m() && this.O.m());
    }

    public void n1(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (this.D == -1) {
            if (z13 && !z14) {
                this.D = 0;
            } else if (!z13 && z14) {
                this.D = 1;
                if (this.f25707c0 == -1) {
                    this.E = 1.0f / this.E;
                }
            }
        }
        if (this.D == 0 && (!this.N.n() || !this.P.n())) {
            this.D = 1;
        } else if (this.D == 1 && (!this.M.n() || !this.O.n())) {
            this.D = 0;
        }
        if (this.D == -1 && (!this.N.n() || !this.P.n() || !this.M.n() || !this.O.n())) {
            if (this.N.n() && this.P.n()) {
                this.D = 0;
            } else if (this.M.n() && this.O.n()) {
                this.E = 1.0f / this.E;
                this.D = 1;
            }
        }
        if (this.D == -1) {
            int i11 = this.f25747x;
            if (i11 > 0 && this.A == 0) {
                this.D = 0;
            } else if (i11 != 0 || this.A <= 0) {
            } else {
                this.E = 1.0f / this.E;
                this.D = 1;
            }
        }
    }

    public float o(int i11) {
        if (i11 == 0) {
            return this.f25719i0;
        }
        if (i11 == 1) {
            return this.f25721j0;
        }
        return -1.0f;
    }

    public boolean o0() {
        return this.f25730o || (this.N.m() && this.P.m());
    }

    public void o1(boolean z11, boolean z12) {
        int i11;
        int i12;
        boolean k11 = z11 & this.f25708d.k();
        boolean k12 = z12 & this.f25710e.k();
        g3.l lVar = this.f25708d;
        int i13 = lVar.f27547h.f27516g;
        n nVar = this.f25710e;
        int i14 = nVar.f27547h.f27516g;
        int i15 = lVar.f27548i.f27516g;
        int i16 = nVar.f27548i.f27516g;
        int i17 = i16 - i14;
        if (i15 - i13 < 0 || i17 < 0 || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE) {
            i15 = 0;
            i13 = 0;
            i16 = 0;
            i14 = 0;
        }
        int i18 = i15 - i13;
        int i19 = i16 - i14;
        if (k11) {
            this.f25709d0 = i13;
        }
        if (k12) {
            this.f25711e0 = i14;
        }
        if (this.f25725l0 == 8) {
            this.Z = 0;
            this.f25703a0 = 0;
            return;
        }
        if (k11) {
            if (this.X[0] == b.FIXED && i18 < (i12 = this.Z)) {
                i18 = i12;
            }
            this.Z = i18;
            int i21 = this.f25715g0;
            if (i18 < i21) {
                this.Z = i21;
            }
        }
        if (k12) {
            if (this.X[1] == b.FIXED && i19 < (i11 = this.f25703a0)) {
                i19 = i11;
            }
            this.f25703a0 = i19;
            int i22 = this.f25717h0;
            if (i19 < i22) {
                this.f25703a0 = i22;
            }
        }
    }

    public int p() {
        return Y() + this.f25703a0;
    }

    public boolean p0() {
        return this.f25734q;
    }

    public void p1(a3.d dVar, boolean z11) {
        n nVar;
        g3.l lVar;
        int y11 = dVar.y(this.M);
        int y12 = dVar.y(this.N);
        int y13 = dVar.y(this.O);
        int y14 = dVar.y(this.P);
        if (z11 && (lVar = this.f25708d) != null) {
            g3.f fVar = lVar.f27547h;
            if (fVar.f27519j) {
                g3.f fVar2 = lVar.f27548i;
                if (fVar2.f27519j) {
                    y11 = fVar.f27516g;
                    y13 = fVar2.f27516g;
                }
            }
        }
        if (z11 && (nVar = this.f25710e) != null) {
            g3.f fVar3 = nVar.f27547h;
            if (fVar3.f27519j) {
                g3.f fVar4 = nVar.f27548i;
                if (fVar4.f27519j) {
                    y12 = fVar3.f27516g;
                    y14 = fVar4.f27516g;
                }
            }
        }
        int i11 = y14 - y12;
        if (y13 - y11 < 0 || i11 < 0 || y11 == Integer.MIN_VALUE || y11 == Integer.MAX_VALUE || y12 == Integer.MIN_VALUE || y12 == Integer.MAX_VALUE || y13 == Integer.MIN_VALUE || y13 == Integer.MAX_VALUE || y14 == Integer.MIN_VALUE || y14 == Integer.MAX_VALUE) {
            y14 = 0;
            y11 = 0;
            y12 = 0;
            y13 = 0;
        }
        I0(y11, y12, y13, y14);
    }

    public Object q() {
        return this.f25723k0;
    }

    public void q0() {
        this.f25732p = true;
    }

    public String r() {
        return this.f25729n0;
    }

    public void r0() {
        this.f25734q = true;
    }

    public b s(int i11) {
        if (i11 == 0) {
            return y();
        }
        if (i11 == 1) {
            return T();
        }
        return null;
    }

    public boolean s0() {
        b[] bVarArr = this.X;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public float t() {
        return this.f25705b0;
    }

    public void t0() {
        this.M.p();
        this.N.p();
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.Y = null;
        this.G = BitmapDescriptorFactory.HUE_RED;
        this.Z = 0;
        this.f25703a0 = 0;
        this.f25705b0 = BitmapDescriptorFactory.HUE_RED;
        this.f25707c0 = -1;
        this.f25709d0 = 0;
        this.f25711e0 = 0;
        this.f25713f0 = 0;
        this.f25715g0 = 0;
        this.f25717h0 = 0;
        float f11 = f25701w0;
        this.f25719i0 = f11;
        this.f25721j0 = f11;
        b[] bVarArr = this.X;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f25723k0 = null;
        this.f25725l0 = 0;
        this.f25731o0 = null;
        this.f25733p0 = 0;
        this.f25735q0 = 0;
        float[] fArr = this.f25737r0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f25736r = -1;
        this.f25738s = -1;
        int[] iArr = this.F;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f25742u = 0;
        this.f25744v = 0;
        this.f25749z = 1.0f;
        this.C = 1.0f;
        this.f25748y = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f25747x = 0;
        this.A = 0;
        this.D = -1;
        this.E = 1.0f;
        boolean[] zArr = this.f25712f;
        zArr[0] = true;
        zArr[1] = true;
        this.J = false;
        boolean[] zArr2 = this.W;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f25714g = true;
        int[] iArr2 = this.f25746w;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f25720j = -1;
        this.f25722k = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f25731o0 != null) {
            str = "type: " + this.f25731o0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f25729n0 != null) {
            str2 = "id: " + this.f25729n0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f25709d0);
        sb2.append(", ");
        sb2.append(this.f25711e0);
        sb2.append(") - (");
        sb2.append(this.Z);
        sb2.append(" x ");
        sb2.append(this.f25703a0);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f25707c0;
    }

    public void u0() {
        this.f25728n = false;
        this.f25730o = false;
        this.f25732p = false;
        this.f25734q = false;
        int size = this.V.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.V.get(i11).q();
        }
    }

    public int v() {
        if (this.f25725l0 == 8) {
            return 0;
        }
        return this.f25703a0;
    }

    public void v0(a3.c cVar) {
        this.M.r(cVar);
        this.N.r(cVar);
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.T.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
    }

    public float w() {
        return this.f25719i0;
    }

    public int x() {
        return this.f25733p0;
    }

    public b y() {
        return this.X[0];
    }

    public int z() {
        d dVar = this.M;
        int i11 = dVar != null ? 0 + dVar.f25697g : 0;
        d dVar2 = this.O;
        return dVar2 != null ? i11 + dVar2.f25697g : i11;
    }

    public void z0(int i11) {
        this.f25713f0 = i11;
        this.H = i11 > 0;
    }

    public e(int i11, int i12, int i13, int i14) {
        this.f25702a = false;
        this.f25708d = null;
        this.f25710e = null;
        this.f25712f = new boolean[]{true, true};
        this.f25714g = true;
        this.f25716h = false;
        this.f25718i = true;
        this.f25720j = -1;
        this.f25722k = -1;
        this.f25724l = new d3.f(this);
        this.f25728n = false;
        this.f25730o = false;
        this.f25732p = false;
        this.f25734q = false;
        this.f25736r = -1;
        this.f25738s = -1;
        this.f25740t = 0;
        this.f25742u = 0;
        this.f25744v = 0;
        this.f25746w = new int[2];
        this.f25747x = 0;
        this.f25748y = 0;
        this.f25749z = 1.0f;
        this.A = 0;
        this.B = 0;
        this.C = 1.0f;
        this.D = -1;
        this.E = 1.0f;
        this.F = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.G = BitmapDescriptorFactory.HUE_RED;
        this.H = false;
        this.J = false;
        this.K = 0;
        this.L = 0;
        this.M = new d(this, d.b.LEFT);
        this.N = new d(this, d.b.TOP);
        this.O = new d(this, d.b.RIGHT);
        this.P = new d(this, d.b.BOTTOM);
        this.Q = new d(this, d.b.BASELINE);
        this.R = new d(this, d.b.CENTER_X);
        this.S = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.T = dVar;
        this.U = new d[]{this.M, this.O, this.N, this.P, this.Q, dVar};
        this.V = new ArrayList<>();
        this.W = new boolean[2];
        b bVar = b.FIXED;
        this.X = new b[]{bVar, bVar};
        this.Y = null;
        this.Z = 0;
        this.f25703a0 = 0;
        this.f25705b0 = BitmapDescriptorFactory.HUE_RED;
        this.f25707c0 = -1;
        this.f25709d0 = 0;
        this.f25711e0 = 0;
        this.f25713f0 = 0;
        float f11 = f25701w0;
        this.f25719i0 = f11;
        this.f25721j0 = f11;
        this.f25725l0 = 0;
        this.f25727m0 = false;
        this.f25729n0 = null;
        this.f25731o0 = null;
        this.f25733p0 = 0;
        this.f25735q0 = 0;
        this.f25737r0 = new float[]{-1.0f, -1.0f};
        this.f25739s0 = new e[]{null, null};
        this.f25741t0 = new e[]{null, null};
        this.f25743u0 = -1;
        this.f25745v0 = -1;
        this.f25709d0 = i11;
        this.f25711e0 = i12;
        this.Z = i13;
        this.f25703a0 = i14;
        d();
    }

    public e(int i11, int i12) {
        this(0, 0, i11, i12);
    }
}