package lv;

import bu.ClosureState;
import bu.g0;
import bu.u3;
import bu.w3;
import java.util.LinkedList;
import nv.j;

/* loaded from: classes6.dex */
public class f {

    /* renamed from: a */
    private w3 f37748a = null;

    /* renamed from: b */
    private double f37749b = 0.0d;

    /* renamed from: c */
    private double f37750c = 0.0d;

    /* renamed from: d */
    public String[] f37751d = new String[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f37752a;

        static {
            int[] iArr = new int[ClosureState.values().length];
            f37752a = iArr;
            try {
                iArr[ClosureState.CLOSURESTATE_FAILED_UNLATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37752a[ClosureState.CLOSURESTATE_AJAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37752a[ClosureState.CLOSURESTATE_OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37752a[ClosureState.CLOSURESTATE_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37752a[ClosureState.CLOSURESTATE_UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    private static Boolean doorOpen(ClosureState closureState) {
        if (closureState == ClosureState.CLOSURESTATE_OPEN) {
            return Boolean.TRUE;
        }
        if (closureState == ClosureState.CLOSURESTATE_CLOSED) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Integer b(ClosureState closureState) {
        int i11 = a.f37752a[closureState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public static String i(w3 w3Var) {
        if (w3Var == null) {
            return "unknown";
        }
        LinkedList linkedList = new LinkedList();
        u3 d11 = w3Var.d();
        if (d11 != u3.VEHICLELOCKSTATE_LOCKED && d11 != u3.VEHICLELOCKSTATE_INTERNAL_LOCKED) {
            if (d11 == u3.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED) {
                linkedList.add("selective-unlocked");
            } else {
                linkedList.add("unlocked");
            }
        } else {
            linkedList.add("locked");
        }
        g0 c11 = w3Var.c();
        if (c11 != null) {
            linkedList.add("open closures:");
            ClosureState d12 = c11.d();
            ClosureState closureState = ClosureState.CLOSURESTATE_OPEN;
            if (d12 == closureState) {
                linkedList.add("df");
            }
            if (c11.g() == closureState) {
                linkedList.add("dr");
            }
            if (c11.e() == closureState) {
                linkedList.add("pf");
            }
            if (c11.h() == closureState) {
                linkedList.add("pr");
            }
            if (c11.f() == closureState) {
                linkedList.add("ft");
            }
            if (c11.i() == closureState) {
                linkedList.add("rt");
            }
            if (c11.c() == closureState) {
                linkedList.add("cp");
            }
        }
        return linkedList.toString();
    }

    public double c() {
        return this.f37749b;
    }

    public double d() {
        return this.f37750c;
    }

    public void e(double d11) {
        this.f37749b = d11;
    }

    public void f(w3 w3Var) {
        this.f37748a = w3Var;
    }

    public void g(double d11) {
        this.f37750c = d11;
    }

    public String h() {
        return i(this.f37748a);
    }

    public void j(j jVar) {
        w3 w3Var = this.f37748a;
        if (w3Var != null) {
            g0 c11 = w3Var.c();
            if (c11 == null) {
                ClosureState closureState = ClosureState.CLOSURESTATE_CLOSED;
                jVar.c(b(closureState), b(closureState), b(closureState), b(closureState), doorOpen(closureState), doorOpen(closureState), doorOpen(closureState));
            } else {
                jVar.c(b(c11.d()), b(c11.e()), b(c11.g()), b(c11.h()), doorOpen(c11.f()), doorOpen(c11.i()), doorOpen(c11.c()));
            }
            u3 d11 = this.f37748a.d();
            boolean z11 = false;
            if (d11 == null) {
                jVar.f41916i = false;
            } else {
                jVar.f41916i = (d11.equals(u3.VEHICLELOCKSTATE_LOCKED) || d11.equals(u3.VEHICLELOCKSTATE_INTERNAL_LOCKED) || d11.equals(u3.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED)) ? true : true;
            }
        }
    }
}