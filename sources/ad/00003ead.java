package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
class y {

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<y> f17737d;

    /* renamed from: e  reason: collision with root package name */
    private static int f17738e;

    /* renamed from: f  reason: collision with root package name */
    private static w f17739f;

    /* renamed from: g  reason: collision with root package name */
    private static w f17740g;

    /* renamed from: h  reason: collision with root package name */
    private static w f17741h;

    /* renamed from: i  reason: collision with root package name */
    private static w f17742i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f17743j;

    /* renamed from: a  reason: collision with root package name */
    z f17744a;

    /* renamed from: b  reason: collision with root package name */
    w f17745b;

    /* renamed from: c  reason: collision with root package name */
    double f17746c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17747a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f17748b;

        static {
            int[] iArr = new int[f.values().length];
            f17748b = iArr;
            try {
                iArr[f.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17748b[f.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17748b[f.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17748b[f.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17748b[f.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[z.values().length];
            f17747a = iArr2;
            try {
                iArr2[z.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17747a[z.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17747a[z.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private y(z zVar, w wVar, double d11) {
        this.f17744a = zVar;
        this.f17745b = wVar;
        this.f17746c = d11;
    }

    private static double a(double d11, double d12) {
        if (Math.abs(d11 - d12) > 180.0d) {
            d11 += 360.0d;
        }
        return (d11 + d12) / 2.0d;
    }

    private static void b(c0 c0Var, w wVar, w wVar2, w wVar3) {
        c0Var.f17565a = k(wVar2, wVar);
        c0Var.f17566b = k(wVar3, wVar2);
        if (i(c0Var.f17565a)) {
            c0Var.f17565a = c0Var.f17566b;
        } else if (i(c0Var.f17566b)) {
            c0Var.f17566b = c0Var.f17565a;
        }
    }

    private static double c(z zVar) {
        double j11 = j(f(f17741h));
        double j12 = j(f(f17742i));
        int i11 = a.f17747a[zVar.ordinal()];
        if (i11 == 1) {
            return f17743j ? j12 + 180.0d : j12;
        } else if (i11 != 2) {
            if (i11 != 3) {
                return 0.0d;
            }
            return j11;
        } else {
            return a(j11, j12);
        }
    }

    private static c0 d(s sVar) {
        c0 c0Var = new c0();
        w[] wVarArr = sVar.f17700b;
        int i11 = a.f17748b[sVar.f17699a.ordinal()];
        if (i11 == 1) {
            c0Var.f17567c = wVarArr[2];
            c0Var.f17565a = k(wVarArr[0], f17739f);
            c0Var.f17566b = k(wVarArr[2], wVarArr[1]);
            if (i(c0Var.f17565a)) {
                b(c0Var, wVarArr[0], wVarArr[1], wVarArr[2]);
            } else if (i(c0Var.f17566b)) {
                b(c0Var, f17739f, wVarArr[0], wVarArr[1]);
            }
        } else if (i11 == 2) {
            c0Var.f17567c = wVarArr[1];
            b(c0Var, f17739f, wVarArr[0], wVarArr[1]);
        } else if (i11 == 3 || i11 == 4) {
            w wVar = wVarArr[0];
            c0Var.f17567c = wVar;
            c0Var.f17565a = k(wVar, f17739f);
            c0Var.f17566b = k(c0Var.f17567c, f17739f);
        } else if (i11 == 5) {
            w wVar2 = f17740g;
            c0Var.f17567c = wVar2;
            c0Var.f17565a = k(wVar2, f17739f);
            c0Var.f17566b = k(c0Var.f17567c, f17739f);
        }
        return c0Var;
    }

    private static void e() {
        z zVar = z.kEndMarker;
        f17737d.add(new y(zVar, f17739f, c(zVar)));
    }

    private static double f(w wVar) {
        return Math.atan2(wVar.f17735b, wVar.f17734a);
    }

    private static void g(s sVar) {
        c0 d11 = d(sVar);
        f17742i = d11.f17565a;
        int i11 = f17738e;
        if (i11 > 0) {
            z zVar = i11 == 1 ? z.kStartMarker : z.kMidMarker;
            f17737d.add(new y(zVar, f17739f, c(zVar)));
        }
        f17741h = d11.f17566b;
        f17739f = d11.f17567c;
        f fVar = sVar.f17699a;
        if (fVar == f.kCGPathElementMoveToPoint) {
            f17740g = sVar.f17700b[0];
        } else if (fVar == f.kCGPathElementCloseSubpath) {
            f17740g = new w(0.0d, 0.0d);
        }
        f17738e++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<y> h(ArrayList<s> arrayList) {
        f17737d = new ArrayList<>();
        f17738e = 0;
        f17739f = new w(0.0d, 0.0d);
        f17740g = new w(0.0d, 0.0d);
        Iterator<s> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            g(it2.next());
        }
        e();
        return f17737d;
    }

    private static boolean i(w wVar) {
        return wVar.f17734a == 0.0d && wVar.f17735b == 0.0d;
    }

    private static double j(double d11) {
        return d11 * 57.29577951308232d;
    }

    private static w k(w wVar, w wVar2) {
        return new w(wVar2.f17734a - wVar.f17734a, wVar2.f17735b - wVar.f17735b);
    }
}