package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f4571a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f4572b;

    /* renamed from: c  reason: collision with root package name */
    private final View f4573c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4574d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f4575e;

    public p(View view) {
        this.f4573c = view;
    }

    private boolean h(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        ViewParent i16;
        int i17;
        int i18;
        int[] iArr3;
        if (!m() || (i16 = i(i15)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f4573c.getLocationInWindow(iArr);
            i17 = iArr[0];
            i18 = iArr[1];
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (iArr2 == null) {
            int[] j11 = j();
            j11[0] = 0;
            j11[1] = 0;
            iArr3 = j11;
        } else {
            iArr3 = iArr2;
        }
        f0.d(i16, this.f4573c, i11, i12, i13, i14, i15, iArr3);
        if (iArr != null) {
            this.f4573c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i17;
            iArr[1] = iArr[1] - i18;
        }
        return true;
    }

    private ViewParent i(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return this.f4572b;
        }
        return this.f4571a;
    }

    private int[] j() {
        if (this.f4575e == null) {
            this.f4575e = new int[2];
        }
        return this.f4575e;
    }

    private void o(int i11, ViewParent viewParent) {
        if (i11 == 0) {
            this.f4571a = viewParent;
        } else if (i11 != 1) {
        } else {
            this.f4572b = viewParent;
        }
    }

    public boolean a(float f11, float f12, boolean z11) {
        ViewParent i11;
        if (!m() || (i11 = i(0)) == null) {
            return false;
        }
        return f0.a(i11, this.f4573c, f11, f12, z11);
    }

    public boolean b(float f11, float f12) {
        ViewParent i11;
        if (!m() || (i11 = i(0)) == null) {
            return false;
        }
        return f0.b(i11, this.f4573c, f11, f12);
    }

    public boolean c(int i11, int i12, int[] iArr, int[] iArr2) {
        return d(i11, i12, iArr, iArr2, 0);
    }

    public boolean d(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        ViewParent i14;
        int i15;
        int i16;
        if (!m() || (i14 = i(i13)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f4573c.getLocationInWindow(iArr2);
            i15 = iArr2[0];
            i16 = iArr2[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        f0.c(i14, this.f4573c, i11, i12, iArr, i13);
        if (iArr2 != null) {
            this.f4573c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i15;
            iArr2[1] = iArr2[1] - i16;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        h(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public boolean f(int i11, int i12, int i13, int i14, int[] iArr) {
        return h(i11, i12, i13, i14, iArr, 0, null);
    }

    public boolean g(int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        return h(i11, i12, i13, i14, iArr, i15, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i11) {
        return i(i11) != null;
    }

    public boolean m() {
        return this.f4574d;
    }

    public void n(boolean z11) {
        if (this.f4574d) {
            a0.S0(this.f4573c);
        }
        this.f4574d = z11;
    }

    public boolean p(int i11) {
        return q(i11, 0);
    }

    public boolean q(int i11, int i12) {
        if (l(i12)) {
            return true;
        }
        if (m()) {
            View view = this.f4573c;
            for (ViewParent parent = this.f4573c.getParent(); parent != null; parent = parent.getParent()) {
                if (f0.f(parent, view, this.f4573c, i11, i12)) {
                    o(i12, parent);
                    f0.e(parent, view, this.f4573c, i11, i12);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i11) {
        ViewParent i12 = i(i11);
        if (i12 != null) {
            f0.g(i12, this.f4573c, i11);
            o(i11, null);
        }
    }
}