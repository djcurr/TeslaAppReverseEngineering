package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import l3.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1977a;

    /* renamed from: b  reason: collision with root package name */
    private s0 f1978b;

    /* renamed from: c  reason: collision with root package name */
    private s0 f1979c;

    /* renamed from: d  reason: collision with root package name */
    private s0 f1980d;

    /* renamed from: e  reason: collision with root package name */
    private s0 f1981e;

    /* renamed from: f  reason: collision with root package name */
    private s0 f1982f;

    /* renamed from: g  reason: collision with root package name */
    private s0 f1983g;

    /* renamed from: h  reason: collision with root package name */
    private s0 f1984h;

    /* renamed from: i  reason: collision with root package name */
    private final y f1985i;

    /* renamed from: j  reason: collision with root package name */
    private int f1986j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1987k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1988l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1989m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f1992c;

        a(int i11, int i12, WeakReference weakReference) {
            this.f1990a = i11;
            this.f1991b = i12;
            this.f1992c = weakReference;
        }

        @Override // l3.h.d
        public void d(int i11) {
        }

        @Override // l3.h.d
        public void e(Typeface typeface) {
            int i11;
            if (Build.VERSION.SDK_INT >= 28 && (i11 = this.f1990a) != -1) {
                typeface = Typeface.create(typeface, i11, (this.f1991b & 2) != 0);
            }
            x.this.n(this.f1992c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f1994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f1995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1996c;

        b(x xVar, TextView textView, Typeface typeface, int i11) {
            this.f1994a = textView;
            this.f1995b = typeface;
            this.f1996c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1994a.setTypeface(this.f1995b, this.f1996c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(TextView textView) {
        this.f1977a = textView;
        this.f1985i = new y(textView);
    }

    private void B(int i11, float f11) {
        this.f1985i.y(i11, f11);
    }

    private void C(Context context, u0 u0Var) {
        String o11;
        this.f1986j = u0Var.k(g.j.J2, this.f1986j);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int k11 = u0Var.k(g.j.O2, -1);
            this.f1987k = k11;
            if (k11 != -1) {
                this.f1986j = (this.f1986j & 2) | 0;
            }
        }
        int i12 = g.j.N2;
        if (!u0Var.s(i12) && !u0Var.s(g.j.P2)) {
            int i13 = g.j.I2;
            if (u0Var.s(i13)) {
                this.f1989m = false;
                int k12 = u0Var.k(i13, 1);
                if (k12 == 1) {
                    this.f1988l = Typeface.SANS_SERIF;
                    return;
                } else if (k12 == 2) {
                    this.f1988l = Typeface.SERIF;
                    return;
                } else if (k12 != 3) {
                    return;
                } else {
                    this.f1988l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1988l = null;
        int i14 = g.j.P2;
        if (u0Var.s(i14)) {
            i12 = i14;
        }
        int i15 = this.f1987k;
        int i16 = this.f1986j;
        if (!context.isRestricted()) {
            try {
                Typeface j11 = u0Var.j(i12, this.f1986j, new a(i15, i16, new WeakReference(this.f1977a)));
                if (j11 != null) {
                    if (i11 >= 28 && this.f1987k != -1) {
                        this.f1988l = Typeface.create(Typeface.create(j11, 0), this.f1987k, (this.f1986j & 2) != 0);
                    } else {
                        this.f1988l = j11;
                    }
                }
                this.f1989m = this.f1988l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1988l != null || (o11 = u0Var.o(i12)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f1987k != -1) {
            this.f1988l = Typeface.create(Typeface.create(o11, 0), this.f1987k, (this.f1986j & 2) != 0);
        } else {
            this.f1988l = Typeface.create(o11, this.f1986j);
        }
    }

    private void a(Drawable drawable, s0 s0Var) {
        if (drawable == null || s0Var == null) {
            return;
        }
        i.i(drawable, s0Var, this.f1977a.getDrawableState());
    }

    private static s0 d(Context context, i iVar, int i11) {
        ColorStateList f11 = iVar.f(context, i11);
        if (f11 != null) {
            s0 s0Var = new s0();
            s0Var.f1925d = true;
            s0Var.f1922a = f11;
            return s0Var;
        }
        return null;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1977a.getCompoundDrawablesRelative();
            TextView textView = this.f1977a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (i11 >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1977a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f1977a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1977a.getCompoundDrawables();
            TextView textView3 = this.f1977a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void z() {
        s0 s0Var = this.f1984h;
        this.f1978b = s0Var;
        this.f1979c = s0Var;
        this.f1980d = s0Var;
        this.f1981e = s0Var;
        this.f1982f = s0Var;
        this.f1983g = s0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i11, float f11) {
        if (androidx.core.widget.b.f4641u || l()) {
            return;
        }
        B(i11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1978b != null || this.f1979c != null || this.f1980d != null || this.f1981e != null) {
            Drawable[] compoundDrawables = this.f1977a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1978b);
            a(compoundDrawables[1], this.f1979c);
            a(compoundDrawables[2], this.f1980d);
            a(compoundDrawables[3], this.f1981e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1982f == null && this.f1983g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1977a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1982f);
            a(compoundDrawablesRelative[2], this.f1983g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f1985i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f1985i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f1985i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f1985i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f1985i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f1985i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        s0 s0Var = this.f1984h;
        if (s0Var != null) {
            return s0Var.f1922a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        s0 s0Var = this.f1984h;
        if (s0Var != null) {
            return s0Var.f1923b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f1985i.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1989m) {
            this.f1988l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.a0.Y(textView)) {
                    textView.post(new b(this, textView, typeface, this.f1986j));
                } else {
                    textView.setTypeface(typeface, this.f1986j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z11, int i11, int i12, int i13, int i14) {
        if (androidx.core.widget.b.f4641u) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i11) {
        String o11;
        ColorStateList c11;
        ColorStateList c12;
        ColorStateList c13;
        u0 t11 = u0.t(context, i11, g.j.G2);
        int i12 = g.j.R2;
        if (t11.s(i12)) {
            s(t11.a(i12, false));
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 23) {
            int i14 = g.j.K2;
            if (t11.s(i14) && (c13 = t11.c(i14)) != null) {
                this.f1977a.setTextColor(c13);
            }
            int i15 = g.j.M2;
            if (t11.s(i15) && (c12 = t11.c(i15)) != null) {
                this.f1977a.setLinkTextColor(c12);
            }
            int i16 = g.j.L2;
            if (t11.s(i16) && (c11 = t11.c(i16)) != null) {
                this.f1977a.setHintTextColor(c11);
            }
        }
        int i17 = g.j.H2;
        if (t11.s(i17) && t11.f(i17, -1) == 0) {
            this.f1977a.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        C(context, t11);
        if (i13 >= 26) {
            int i18 = g.j.Q2;
            if (t11.s(i18) && (o11 = t11.o(i18)) != null) {
                this.f1977a.setFontVariationSettings(o11);
            }
        }
        t11.w();
        Typeface typeface = this.f1988l;
        if (typeface != null) {
            this.f1977a.setTypeface(typeface, this.f1986j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        y3.a.f(editorInfo, textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z11) {
        this.f1977a.setAllCaps(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i11, int i12, int i13, int i14) {
        this.f1985i.u(i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int[] iArr, int i11) {
        this.f1985i.v(iArr, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i11) {
        this.f1985i.w(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f1984h == null) {
            this.f1984h = new s0();
        }
        s0 s0Var = this.f1984h;
        s0Var.f1922a = colorStateList;
        s0Var.f1925d = colorStateList != null;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f1984h == null) {
            this.f1984h = new s0();
        }
        s0 s0Var = this.f1984h;
        s0Var.f1923b = mode;
        s0Var.f1924c = mode != null;
        z();
    }
}