package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.k0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b */
    private static final PorterDuff.Mode f1825b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static i f1826c;

    /* renamed from: a */
    private k0 f1827a;

    /* loaded from: classes.dex */
    public class a implements k0.f {

        /* renamed from: a */
        private final int[] f1828a = {g.e.R, g.e.P, g.e.f27089a};

        /* renamed from: b */
        private final int[] f1829b = {g.e.f27103o, g.e.B, g.e.f27108t, g.e.f27104p, g.e.f27105q, g.e.f27107s, g.e.f27106r};

        /* renamed from: c */
        private final int[] f1830c = {g.e.O, g.e.Q, g.e.f27099k, g.e.K, g.e.L, g.e.M, g.e.N};

        /* renamed from: d */
        private final int[] f1831d = {g.e.f27111w, g.e.f27097i, g.e.f27110v};

        /* renamed from: e */
        private final int[] f1832e = {g.e.J, g.e.S};

        /* renamed from: f */
        private final int[] f1833f = {g.e.f27091c, g.e.f27095g, g.e.f27092d, g.e.f27096h};

        a() {
        }

        private boolean f(int[] iArr, int i11) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i11) {
            int c11 = p0.c(context, g.a.f27060v);
            return new ColorStateList(new int[][]{p0.f1907b, p0.f1909d, p0.f1908c, p0.f1911f}, new int[]{p0.b(context, g.a.f27058t), m3.a.g(c11, i11), m3.a.g(c11, i11), i11});
        }

        private ColorStateList i(Context context) {
            return h(context, p0.c(context, g.a.f27057s));
        }

        private ColorStateList j(Context context) {
            return h(context, p0.c(context, g.a.f27058t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i11 = g.a.f27062x;
            ColorStateList e11 = p0.e(context, i11);
            if (e11 != null && e11.isStateful()) {
                iArr[0] = p0.f1907b;
                iArr2[0] = e11.getColorForState(iArr[0], 0);
                iArr[1] = p0.f1910e;
                iArr2[1] = p0.c(context, g.a.f27059u);
                iArr[2] = p0.f1911f;
                iArr2[2] = e11.getDefaultColor();
            } else {
                iArr[0] = p0.f1907b;
                iArr2[0] = p0.b(context, i11);
                iArr[1] = p0.f1910e;
                iArr2[1] = p0.c(context, g.a.f27059u);
                iArr[2] = p0.f1911f;
                iArr2[2] = p0.c(context, i11);
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(k0 k0Var, Context context, int i11) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
            Drawable j11 = k0Var.j(context, g.e.F);
            Drawable j12 = k0Var.j(context, g.e.G);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j11;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j12 instanceof BitmapDrawable) && j12.getIntrinsicWidth() == dimensionPixelSize && j12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i11, PorterDuff.Mode mode) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.f1825b;
            }
            drawable.setColorFilter(i.e(i11, mode));
        }

        @Override // androidx.appcompat.widget.k0.f
        public Drawable a(k0 k0Var, Context context, int i11) {
            if (i11 == g.e.f27098j) {
                return new LayerDrawable(new Drawable[]{k0Var.j(context, g.e.f27097i), k0Var.j(context, g.e.f27099k)});
            }
            if (i11 == g.e.f27113y) {
                return l(k0Var, context, g.d.f27082i);
            }
            if (i11 == g.e.f27112x) {
                return l(k0Var, context, g.d.f27083j);
            }
            if (i11 == g.e.f27114z) {
                return l(k0Var, context, g.d.f27084k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.k0.f
        public ColorStateList b(Context context, int i11) {
            if (i11 == g.e.f27101m) {
                return h.a.c(context, g.c.f27070e);
            }
            if (i11 == g.e.I) {
                return h.a.c(context, g.c.f27073h);
            }
            if (i11 == g.e.H) {
                return k(context);
            }
            if (i11 == g.e.f27094f) {
                return j(context);
            }
            if (i11 == g.e.f27090b) {
                return g(context);
            }
            if (i11 == g.e.f27093e) {
                return i(context);
            }
            if (i11 != g.e.D && i11 != g.e.E) {
                if (f(this.f1829b, i11)) {
                    return p0.e(context, g.a.f27061w);
                }
                if (f(this.f1832e, i11)) {
                    return h.a.c(context, g.c.f27069d);
                }
                if (f(this.f1833f, i11)) {
                    return h.a.c(context, g.c.f27068c);
                }
                if (i11 == g.e.A) {
                    return h.a.c(context, g.c.f27071f);
                }
                return null;
            }
            return h.a.c(context, g.c.f27072g);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.k0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.i.a()
                int[] r1 = r6.f1828a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = g.a.f27061w
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f1830c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = g.a.f27059u
                goto L14
            L22:
                int[] r1 = r6.f1831d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = g.e.f27109u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = g.e.f27100l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.c0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.p0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.i.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.k0.f
        public PorterDuff.Mode d(int i11) {
            if (i11 == g.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.k0.f
        public boolean e(Context context, int i11, Drawable drawable) {
            if (i11 == g.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i12 = g.a.f27061w;
                m(findDrawableByLayerId, p0.c(context, i12), i.f1825b);
                m(layerDrawable.findDrawableByLayerId(16908303), p0.c(context, i12), i.f1825b);
                m(layerDrawable.findDrawableByLayerId(16908301), p0.c(context, g.a.f27059u), i.f1825b);
                return true;
            } else if (i11 == g.e.f27113y || i11 == g.e.f27112x || i11 == g.e.f27114z) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), p0.b(context, g.a.f27061w), i.f1825b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i13 = g.a.f27059u;
                m(findDrawableByLayerId2, p0.c(context, i13), i.f1825b);
                m(layerDrawable2.findDrawableByLayerId(16908301), p0.c(context, i13), i.f1825b);
                return true;
            } else {
                return false;
            }
        }
    }

    public static synchronized i b() {
        i iVar;
        synchronized (i.class) {
            if (f1826c == null) {
                h();
            }
            iVar = f1826c;
        }
        return iVar;
    }

    public static synchronized PorterDuffColorFilter e(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter l11;
        synchronized (i.class) {
            l11 = k0.l(i11, mode);
        }
        return l11;
    }

    public static synchronized void h() {
        synchronized (i.class) {
            if (f1826c == null) {
                i iVar = new i();
                f1826c = iVar;
                iVar.f1827a = k0.h();
                f1826c.f1827a.u(new a());
            }
        }
    }

    public static void i(Drawable drawable, s0 s0Var, int[] iArr) {
        k0.w(drawable, s0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i11) {
        return this.f1827a.j(context, i11);
    }

    public synchronized Drawable d(Context context, int i11, boolean z11) {
        return this.f1827a.k(context, i11, z11);
    }

    public synchronized ColorStateList f(Context context, int i11) {
        return this.f1827a.m(context, i11);
    }

    public synchronized void g(Context context) {
        this.f1827a.s(context);
    }
}