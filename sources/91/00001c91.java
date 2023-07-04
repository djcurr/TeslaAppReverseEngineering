package com.google.android.exoplayer2.ui;

import ak.k0;
import ak.x;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ci.m;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.ui.i;
import com.google.android.exoplayer2.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import yj.k;

/* loaded from: classes3.dex */
public class c extends FrameLayout {
    private final Drawable A;
    private final String B;
    private final String C;
    private final String E;
    private final Drawable F;
    private final Drawable G;
    private final float H;
    private final float K;
    private final String L;
    private final String O;
    private s0 P;
    private ci.c Q;
    private int Q1;
    private long Q2;
    private InterfaceC0256c R;
    private m T;
    private int V1;

    /* renamed from: a */
    private final b f14491a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<d> f14492b;

    /* renamed from: b1 */
    private boolean f14493b1;

    /* renamed from: b2 */
    private boolean f14494b2;

    /* renamed from: c */
    private final View f14495c;

    /* renamed from: d */
    private final View f14496d;

    /* renamed from: e */
    private final View f14497e;

    /* renamed from: f */
    private final View f14498f;

    /* renamed from: g */
    private final View f14499g;

    /* renamed from: g1 */
    private boolean f14500g1;

    /* renamed from: g2 */
    private boolean f14501g2;

    /* renamed from: h */
    private final View f14502h;

    /* renamed from: i */
    private final ImageView f14503i;

    /* renamed from: i3 */
    private long[] f14504i3;

    /* renamed from: j */
    private final ImageView f14505j;

    /* renamed from: j3 */
    private boolean[] f14506j3;

    /* renamed from: k */
    private final View f14507k;

    /* renamed from: k3 */
    private long[] f14508k3;

    /* renamed from: l */
    private final TextView f14509l;

    /* renamed from: l3 */
    private boolean[] f14510l3;

    /* renamed from: m */
    private final TextView f14511m;

    /* renamed from: m3 */
    private long f14512m3;

    /* renamed from: n */
    private final i f14513n;

    /* renamed from: o */
    private final StringBuilder f14514o;

    /* renamed from: p */
    private final Formatter f14515p;

    /* renamed from: p1 */
    private boolean f14516p1;

    /* renamed from: p2 */
    private boolean f14517p2;

    /* renamed from: q */
    private final z0.b f14518q;

    /* renamed from: t */
    private final z0.c f14519t;

    /* renamed from: w */
    private final Runnable f14520w;

    /* renamed from: x */
    private final Runnable f14521x;

    /* renamed from: x1 */
    private boolean f14522x1;

    /* renamed from: x2 */
    private boolean f14523x2;

    /* renamed from: y */
    private final Drawable f14524y;

    /* renamed from: y1 */
    private int f14525y1;

    /* renamed from: y2 */
    private boolean f14526y2;

    /* renamed from: z */
    private final Drawable f14527z;

    /* loaded from: classes3.dex */
    public final class b implements s0.a, i.a, View.OnClickListener {
        private b() {
            c.this = r1;
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void G(s0 s0Var, s0.b bVar) {
            if (bVar.c(5, 6)) {
                c.this.R();
            }
            if (bVar.c(5, 6, 8)) {
                c.this.S();
            }
            if (bVar.b(9)) {
                c.this.T();
            }
            if (bVar.b(10)) {
                c.this.U();
            }
            if (bVar.c(9, 10, 12, 0)) {
                c.this.Q();
            }
            if (bVar.c(12, 0)) {
                c.this.V();
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.a
        public void a(i iVar, long j11) {
            if (c.this.f14511m != null) {
                c.this.f14511m.setText(k0.f0(c.this.f14514o, c.this.f14515p, j11));
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.a
        public void b(i iVar, long j11, boolean z11) {
            c.this.f14522x1 = false;
            if (z11 || c.this.P == null) {
                return;
            }
            c cVar = c.this;
            cVar.L(cVar.P, j11);
        }

        @Override // com.google.android.exoplayer2.ui.i.a
        public void c(i iVar, long j11) {
            c.this.f14522x1 = true;
            if (c.this.f14511m != null) {
                c.this.f14511m.setText(k0.f0(c.this.f14514o, c.this.f14515p, j11));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s0 s0Var = c.this.P;
            if (s0Var == null) {
                return;
            }
            if (c.this.f14496d == view) {
                c.this.Q.i(s0Var);
            } else if (c.this.f14495c == view) {
                c.this.Q.h(s0Var);
            } else if (c.this.f14499g != view) {
                if (c.this.f14502h == view) {
                    c.this.Q.a(s0Var);
                } else if (c.this.f14497e == view) {
                    c.this.C(s0Var);
                } else if (c.this.f14498f == view) {
                    c.this.B(s0Var);
                } else if (c.this.f14503i != view) {
                    if (c.this.f14505j == view) {
                        c.this.Q.c(s0Var, !s0Var.A());
                    }
                } else {
                    c.this.Q.d(s0Var, x.a(s0Var.z(), c.this.V1));
                }
            } else if (s0Var.w() != 4) {
                c.this.Q.e(s0Var);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.c$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC0256c {
        void a(long j11, long j12);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(int i11);
    }

    static {
        ci.h.a("goog.exo.ui");
    }

    public c(Context context) {
        this(context, null);
    }

    public void B(s0 s0Var) {
        this.Q.k(s0Var, false);
    }

    public void C(s0 s0Var) {
        int w11 = s0Var.w();
        if (w11 == 1) {
            m mVar = this.T;
            if (mVar != null) {
                mVar.a();
            } else {
                this.Q.g(s0Var);
            }
        } else if (w11 == 4) {
            K(s0Var, s0Var.g(), -9223372036854775807L);
        }
        this.Q.k(s0Var, true);
    }

    private void D(s0 s0Var) {
        int w11 = s0Var.w();
        if (w11 != 1 && w11 != 4 && s0Var.o()) {
            B(s0Var);
        } else {
            C(s0Var);
        }
    }

    private static int E(TypedArray typedArray, int i11) {
        return typedArray.getInt(k.f59627u, i11);
    }

    private void G() {
        removeCallbacks(this.f14521x);
        if (this.f14525y1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i11 = this.f14525y1;
            this.Q2 = uptimeMillis + i11;
            if (this.f14493b1) {
                postDelayed(this.f14521x, i11);
                return;
            }
            return;
        }
        this.Q2 = -9223372036854775807L;
    }

    private static boolean H(int i11) {
        return i11 == 90 || i11 == 89 || i11 == 85 || i11 == 79 || i11 == 126 || i11 == 127 || i11 == 87 || i11 == 88;
    }

    private void J() {
        View view;
        View view2;
        boolean M = M();
        if (!M && (view2 = this.f14497e) != null) {
            view2.requestFocus();
        } else if (!M || (view = this.f14498f) == null) {
        } else {
            view.requestFocus();
        }
    }

    private boolean K(s0 s0Var, int i11, long j11) {
        return this.Q.b(s0Var, i11, j11);
    }

    public void L(s0 s0Var, long j11) {
        int g11;
        z0 l11 = s0Var.l();
        if (this.f14516p1 && !l11.q()) {
            int p11 = l11.p();
            g11 = 0;
            while (true) {
                long d11 = l11.n(g11, this.f14519t).d();
                if (j11 < d11) {
                    break;
                } else if (g11 == p11 - 1) {
                    j11 = d11;
                    break;
                } else {
                    j11 -= d11;
                    g11++;
                }
            }
        } else {
            g11 = s0Var.g();
        }
        if (K(s0Var, g11, j11)) {
            return;
        }
        S();
    }

    private boolean M() {
        s0 s0Var = this.P;
        return (s0Var == null || s0Var.w() == 4 || this.P.w() == 1 || !this.P.o()) ? false : true;
    }

    private void O() {
        R();
        Q();
        T();
        U();
        V();
    }

    private void P(boolean z11, boolean z12, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z12);
        view.setAlpha(z12 ? this.H : this.K);
        view.setVisibility(z11 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q() {
        /*
            r8 = this;
            boolean r0 = r8.I()
            if (r0 == 0) goto L9a
            boolean r0 = r8.f14493b1
            if (r0 != 0) goto Lc
            goto L9a
        Lc:
            com.google.android.exoplayer2.s0 r0 = r8.P
            r1 = 0
            if (r0 == 0) goto L73
            com.google.android.exoplayer2.z0 r2 = r0.l()
            boolean r3 = r2.q()
            if (r3 != 0) goto L73
            boolean r3 = r0.c()
            if (r3 != 0) goto L73
            int r3 = r0.g()
            com.google.android.exoplayer2.z0$c r4 = r8.f14519t
            r2.n(r3, r4)
            com.google.android.exoplayer2.z0$c r2 = r8.f14519t
            boolean r3 = r2.f14794h
            r4 = 1
            if (r3 != 0) goto L40
            boolean r2 = r2.f()
            if (r2 == 0) goto L40
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L3e
            goto L40
        L3e:
            r2 = r1
            goto L41
        L40:
            r2 = r4
        L41:
            if (r3 == 0) goto L4d
            ci.c r5 = r8.Q
            boolean r5 = r5.f()
            if (r5 == 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r1
        L4e:
            if (r3 == 0) goto L5a
            ci.c r6 = r8.Q
            boolean r6 = r6.j()
            if (r6 == 0) goto L5a
            r6 = r4
            goto L5b
        L5a:
            r6 = r1
        L5b:
            com.google.android.exoplayer2.z0$c r7 = r8.f14519t
            boolean r7 = r7.f()
            if (r7 == 0) goto L69
            com.google.android.exoplayer2.z0$c r7 = r8.f14519t
            boolean r7 = r7.f14795i
            if (r7 != 0) goto L6f
        L69:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L70
        L6f:
            r1 = r4
        L70:
            r0 = r1
            r1 = r2
            goto L77
        L73:
            r0 = r1
            r3 = r0
            r5 = r3
            r6 = r5
        L77:
            boolean r2 = r8.f14517p2
            android.view.View r4 = r8.f14495c
            r8.P(r2, r1, r4)
            boolean r1 = r8.f14494b2
            android.view.View r2 = r8.f14502h
            r8.P(r1, r5, r2)
            boolean r1 = r8.f14501g2
            android.view.View r2 = r8.f14499g
            r8.P(r1, r6, r2)
            boolean r1 = r8.f14523x2
            android.view.View r2 = r8.f14496d
            r8.P(r1, r0, r2)
            com.google.android.exoplayer2.ui.i r0 = r8.f14513n
            if (r0 == 0) goto L9a
            r0.setEnabled(r3)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.c.Q():void");
    }

    public void R() {
        boolean z11;
        if (I() && this.f14493b1) {
            boolean M = M();
            View view = this.f14497e;
            boolean z12 = true;
            if (view != null) {
                z11 = (M && view.isFocused()) | false;
                this.f14497e.setVisibility(M ? 8 : 0);
            } else {
                z11 = false;
            }
            View view2 = this.f14498f;
            if (view2 != null) {
                if (M || !view2.isFocused()) {
                    z12 = false;
                }
                z11 |= z12;
                this.f14498f.setVisibility(M ? 0 : 8);
            }
            if (z11) {
                J();
            }
        }
    }

    public void S() {
        long j11;
        float f11;
        if (I() && this.f14493b1) {
            s0 s0Var = this.P;
            long j12 = 0;
            if (s0Var != null) {
                j12 = this.f14512m3 + s0Var.t();
                j11 = this.f14512m3 + s0Var.B();
            } else {
                j11 = 0;
            }
            TextView textView = this.f14511m;
            if (textView != null && !this.f14522x1) {
                textView.setText(k0.f0(this.f14514o, this.f14515p, j12));
            }
            i iVar = this.f14513n;
            if (iVar != null) {
                iVar.setPosition(j12);
                this.f14513n.setBufferedPosition(j11);
            }
            InterfaceC0256c interfaceC0256c = this.R;
            if (interfaceC0256c != null) {
                interfaceC0256c.a(j12, j11);
            }
            removeCallbacks(this.f14520w);
            int w11 = s0Var == null ? 1 : s0Var.w();
            if (s0Var == null || !s0Var.isPlaying()) {
                if (w11 == 4 || w11 == 1) {
                    return;
                }
                postDelayed(this.f14520w, 1000L);
                return;
            }
            i iVar2 = this.f14513n;
            long min = Math.min(iVar2 != null ? iVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j12 % 1000));
            postDelayed(this.f14520w, k0.s(s0Var.b().f9245a > BitmapDescriptorFactory.HUE_RED ? ((float) min) / f11 : 1000L, this.Q1, 1000L));
        }
    }

    public void T() {
        ImageView imageView;
        if (I() && this.f14493b1 && (imageView = this.f14503i) != null) {
            if (this.V1 == 0) {
                P(false, false, imageView);
                return;
            }
            s0 s0Var = this.P;
            if (s0Var == null) {
                P(true, false, imageView);
                this.f14503i.setImageDrawable(this.f14524y);
                this.f14503i.setContentDescription(this.B);
                return;
            }
            P(true, true, imageView);
            int z11 = s0Var.z();
            if (z11 == 0) {
                this.f14503i.setImageDrawable(this.f14524y);
                this.f14503i.setContentDescription(this.B);
            } else if (z11 == 1) {
                this.f14503i.setImageDrawable(this.f14527z);
                this.f14503i.setContentDescription(this.C);
            } else if (z11 == 2) {
                this.f14503i.setImageDrawable(this.A);
                this.f14503i.setContentDescription(this.E);
            }
            this.f14503i.setVisibility(0);
        }
    }

    public void U() {
        ImageView imageView;
        String str;
        if (I() && this.f14493b1 && (imageView = this.f14505j) != null) {
            s0 s0Var = this.P;
            if (!this.f14526y2) {
                P(false, false, imageView);
            } else if (s0Var == null) {
                P(true, false, imageView);
                this.f14505j.setImageDrawable(this.G);
                this.f14505j.setContentDescription(this.O);
            } else {
                P(true, true, imageView);
                this.f14505j.setImageDrawable(s0Var.A() ? this.F : this.G);
                ImageView imageView2 = this.f14505j;
                if (s0Var.A()) {
                    str = this.L;
                } else {
                    str = this.O;
                }
                imageView2.setContentDescription(str);
            }
        }
    }

    public void V() {
        int i11;
        z0.c cVar;
        s0 s0Var = this.P;
        if (s0Var == null) {
            return;
        }
        boolean z11 = true;
        this.f14516p1 = this.f14500g1 && z(s0Var.l(), this.f14519t);
        long j11 = 0;
        this.f14512m3 = 0L;
        z0 l11 = s0Var.l();
        if (l11.q()) {
            i11 = 0;
        } else {
            int g11 = s0Var.g();
            boolean z12 = this.f14516p1;
            int i12 = z12 ? 0 : g11;
            int p11 = z12 ? l11.p() - 1 : g11;
            long j12 = 0;
            i11 = 0;
            while (true) {
                if (i12 > p11) {
                    break;
                }
                if (i12 == g11) {
                    this.f14512m3 = ci.b.d(j12);
                }
                l11.n(i12, this.f14519t);
                z0.c cVar2 = this.f14519t;
                if (cVar2.f14802p == -9223372036854775807L) {
                    ak.a.f(this.f14516p1 ^ z11);
                    break;
                }
                int i13 = cVar2.f14799m;
                while (true) {
                    cVar = this.f14519t;
                    if (i13 <= cVar.f14800n) {
                        l11.f(i13, this.f14518q);
                        int c11 = this.f14518q.c();
                        for (int i14 = 0; i14 < c11; i14++) {
                            long f11 = this.f14518q.f(i14);
                            if (f11 == Long.MIN_VALUE) {
                                long j13 = this.f14518q.f14782d;
                                if (j13 != -9223372036854775807L) {
                                    f11 = j13;
                                }
                            }
                            long l12 = f11 + this.f14518q.l();
                            if (l12 >= 0) {
                                long[] jArr = this.f14504i3;
                                if (i11 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f14504i3 = Arrays.copyOf(jArr, length);
                                    this.f14506j3 = Arrays.copyOf(this.f14506j3, length);
                                }
                                this.f14504i3[i11] = ci.b.d(j12 + l12);
                                this.f14506j3[i11] = this.f14518q.m(i14);
                                i11++;
                            }
                        }
                        i13++;
                    }
                }
                j12 += cVar.f14802p;
                i12++;
                z11 = true;
            }
            j11 = j12;
        }
        long d11 = ci.b.d(j11);
        TextView textView = this.f14509l;
        if (textView != null) {
            textView.setText(k0.f0(this.f14514o, this.f14515p, d11));
        }
        i iVar = this.f14513n;
        if (iVar != null) {
            iVar.setDuration(d11);
            int length2 = this.f14508k3.length;
            int i15 = i11 + length2;
            long[] jArr2 = this.f14504i3;
            if (i15 > jArr2.length) {
                this.f14504i3 = Arrays.copyOf(jArr2, i15);
                this.f14506j3 = Arrays.copyOf(this.f14506j3, i15);
            }
            System.arraycopy(this.f14508k3, 0, this.f14504i3, i11, length2);
            System.arraycopy(this.f14510l3, 0, this.f14506j3, i11, length2);
            this.f14513n.b(this.f14504i3, this.f14506j3, i15);
        }
        S();
    }

    public static /* synthetic */ void a(c cVar) {
        cVar.S();
    }

    private static boolean z(z0 z0Var, z0.c cVar) {
        if (z0Var.p() > 100) {
            return false;
        }
        int p11 = z0Var.p();
        for (int i11 = 0; i11 < p11; i11++) {
            if (z0Var.n(i11, cVar).f14802p == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public boolean A(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        s0 s0Var = this.P;
        if (s0Var == null || !H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (s0Var.w() != 4) {
                    this.Q.e(s0Var);
                    return true;
                }
                return true;
            } else if (keyCode == 89) {
                this.Q.a(s0Var);
                return true;
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    D(s0Var);
                    return true;
                } else if (keyCode == 87) {
                    this.Q.i(s0Var);
                    return true;
                } else if (keyCode == 88) {
                    this.Q.h(s0Var);
                    return true;
                } else if (keyCode == 126) {
                    C(s0Var);
                    return true;
                } else if (keyCode != 127) {
                    return true;
                } else {
                    B(s0Var);
                    return true;
                }
            } else {
                return true;
            }
        }
        return true;
    }

    public void F() {
        if (I()) {
            setVisibility(8);
            Iterator<d> it2 = this.f14492b.iterator();
            while (it2.hasNext()) {
                it2.next().a(getVisibility());
            }
            removeCallbacks(this.f14520w);
            removeCallbacks(this.f14521x);
            this.Q2 = -9223372036854775807L;
        }
    }

    public boolean I() {
        return getVisibility() == 0;
    }

    public void N() {
        if (!I()) {
            setVisibility(0);
            Iterator<d> it2 = this.f14492b.iterator();
            while (it2.hasNext()) {
                it2.next().a(getVisibility());
            }
            O();
            J();
        }
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f14521x);
        } else if (motionEvent.getAction() == 1) {
            G();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public s0 getPlayer() {
        return this.P;
    }

    public int getRepeatToggleModes() {
        return this.V1;
    }

    public boolean getShowShuffleButton() {
        return this.f14526y2;
    }

    public int getShowTimeoutMs() {
        return this.f14525y1;
    }

    public boolean getShowVrButton() {
        View view = this.f14507k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14493b1 = true;
        long j11 = this.Q2;
        if (j11 != -9223372036854775807L) {
            long uptimeMillis = j11 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                F();
            } else {
                postDelayed(this.f14521x, uptimeMillis);
            }
        } else if (I()) {
            G();
        }
        O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14493b1 = false;
        removeCallbacks(this.f14520w);
        removeCallbacks(this.f14521x);
    }

    public void setControlDispatcher(ci.c cVar) {
        if (this.Q != cVar) {
            this.Q = cVar;
            Q();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i11) {
        ci.c cVar = this.Q;
        if (cVar instanceof com.google.android.exoplayer2.f) {
            ((com.google.android.exoplayer2.f) cVar).m(i11);
            Q();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(m mVar) {
        this.T = mVar;
    }

    public void setPlayer(s0 s0Var) {
        boolean z11 = true;
        ak.a.f(Looper.myLooper() == Looper.getMainLooper());
        if (s0Var != null && s0Var.m() != Looper.getMainLooper()) {
            z11 = false;
        }
        ak.a.a(z11);
        s0 s0Var2 = this.P;
        if (s0Var2 == s0Var) {
            return;
        }
        if (s0Var2 != null) {
            s0Var2.f(this.f14491a);
        }
        this.P = s0Var;
        if (s0Var != null) {
            s0Var.r(this.f14491a);
        }
        O();
    }

    public void setProgressUpdateListener(InterfaceC0256c interfaceC0256c) {
        this.R = interfaceC0256c;
    }

    public void setRepeatToggleModes(int i11) {
        this.V1 = i11;
        s0 s0Var = this.P;
        if (s0Var != null) {
            int z11 = s0Var.z();
            if (i11 == 0 && z11 != 0) {
                this.Q.d(this.P, 0);
            } else if (i11 == 1 && z11 == 2) {
                this.Q.d(this.P, 1);
            } else if (i11 == 2 && z11 == 1) {
                this.Q.d(this.P, 2);
            }
        }
        T();
    }

    @Deprecated
    public void setRewindIncrementMs(int i11) {
        ci.c cVar = this.Q;
        if (cVar instanceof com.google.android.exoplayer2.f) {
            ((com.google.android.exoplayer2.f) cVar).n(i11);
            Q();
        }
    }

    public void setShowFastForwardButton(boolean z11) {
        this.f14501g2 = z11;
        Q();
    }

    public void setShowMultiWindowTimeBar(boolean z11) {
        this.f14500g1 = z11;
        V();
    }

    public void setShowNextButton(boolean z11) {
        this.f14523x2 = z11;
        Q();
    }

    public void setShowPreviousButton(boolean z11) {
        this.f14517p2 = z11;
        Q();
    }

    public void setShowRewindButton(boolean z11) {
        this.f14494b2 = z11;
        Q();
    }

    public void setShowShuffleButton(boolean z11) {
        this.f14526y2 = z11;
        U();
    }

    public void setShowTimeoutMs(int i11) {
        this.f14525y1 = i11;
        if (I()) {
            G();
        }
    }

    public void setShowVrButton(boolean z11) {
        View view = this.f14507k;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.Q1 = k0.r(i11, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f14507k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            P(getShowVrButton(), onClickListener != null, this.f14507k);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) {
        super(context, attributeSet, i11);
        int i12 = yj.i.exo_player_control_view;
        int i13 = 5000;
        this.f14525y1 = 5000;
        this.V1 = 0;
        this.Q1 = 200;
        this.Q2 = -9223372036854775807L;
        this.f14494b2 = true;
        this.f14501g2 = true;
        this.f14517p2 = true;
        this.f14523x2 = true;
        this.f14526y2 = false;
        int i14 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k.f59624r, 0, 0);
            try {
                i13 = obtainStyledAttributes.getInt(k.f59628v, 5000);
                i14 = obtainStyledAttributes.getInt(k.f59626t, 15000);
                this.f14525y1 = obtainStyledAttributes.getInt(k.B, this.f14525y1);
                i12 = obtainStyledAttributes.getResourceId(k.f59625s, i12);
                this.V1 = E(obtainStyledAttributes, this.V1);
                this.f14494b2 = obtainStyledAttributes.getBoolean(k.f59632z, this.f14494b2);
                this.f14501g2 = obtainStyledAttributes.getBoolean(k.f59629w, this.f14501g2);
                this.f14517p2 = obtainStyledAttributes.getBoolean(k.f59631y, this.f14517p2);
                this.f14523x2 = obtainStyledAttributes.getBoolean(k.f59630x, this.f14523x2);
                this.f14526y2 = obtainStyledAttributes.getBoolean(k.A, this.f14526y2);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(k.C, this.Q1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14492b = new CopyOnWriteArrayList<>();
        this.f14518q = new z0.b();
        this.f14519t = new z0.c();
        StringBuilder sb2 = new StringBuilder();
        this.f14514o = sb2;
        this.f14515p = new Formatter(sb2, Locale.getDefault());
        this.f14504i3 = new long[0];
        this.f14506j3 = new boolean[0];
        this.f14508k3 = new long[0];
        this.f14510l3 = new boolean[0];
        b bVar = new b();
        this.f14491a = bVar;
        this.Q = new com.google.android.exoplayer2.f(i14, i13);
        this.f14520w = new Runnable() { // from class: yj.e
            {
                com.google.android.exoplayer2.ui.c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.c.a(com.google.android.exoplayer2.ui.c.this);
            }
        };
        this.f14521x = new Runnable() { // from class: yj.d
            {
                com.google.android.exoplayer2.ui.c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.c.this.F();
            }
        };
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        int i15 = yj.g.exo_progress;
        i iVar = (i) findViewById(i15);
        View findViewById = findViewById(yj.g.exo_progress_placeholder);
        if (iVar != null) {
            this.f14513n = iVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i15);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f14513n = defaultTimeBar;
        } else {
            this.f14513n = null;
        }
        this.f14509l = (TextView) findViewById(yj.g.exo_duration);
        this.f14511m = (TextView) findViewById(yj.g.exo_position);
        i iVar2 = this.f14513n;
        if (iVar2 != null) {
            iVar2.a(bVar);
        }
        View findViewById2 = findViewById(yj.g.f59606e);
        this.f14497e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(yj.g.f59605d);
        this.f14498f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(yj.g.exo_prev);
        this.f14495c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(yj.g.exo_next);
        this.f14496d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(yj.g.exo_rew);
        this.f14502h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(yj.g.exo_ffwd);
        this.f14499g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(yj.g.exo_repeat_toggle);
        this.f14503i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(yj.g.exo_shuffle);
        this.f14505j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(yj.g.exo_vr);
        this.f14507k = findViewById8;
        setShowVrButton(false);
        P(false, false, findViewById8);
        Resources resources = context.getResources();
        this.H = resources.getInteger(yj.h.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.K = resources.getInteger(yj.h.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f14524y = resources.getDrawable(yj.f.exo_controls_repeat_off);
        this.f14527z = resources.getDrawable(yj.f.exo_controls_repeat_one);
        this.A = resources.getDrawable(yj.f.exo_controls_repeat_all);
        this.F = resources.getDrawable(yj.f.exo_controls_shuffle_on);
        this.G = resources.getDrawable(yj.f.exo_controls_shuffle_off);
        this.B = resources.getString(yj.j.exo_controls_repeat_off_description);
        this.C = resources.getString(yj.j.exo_controls_repeat_one_description);
        this.E = resources.getString(yj.j.exo_controls_repeat_all_description);
        this.L = resources.getString(yj.j.exo_controls_shuffle_on_description);
        this.O = resources.getString(yj.j.exo_controls_shuffle_off_description);
    }
}