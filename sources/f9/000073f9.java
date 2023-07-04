package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private d f29512a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f29513b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f29514c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f29515d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29517f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29519h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f29520i;

    /* renamed from: j  reason: collision with root package name */
    private long f29521j;

    /* renamed from: k  reason: collision with root package name */
    private long f29522k;

    /* renamed from: l  reason: collision with root package name */
    private c f29523l;

    /* renamed from: e  reason: collision with root package name */
    private int f29516e = 255;

    /* renamed from: g  reason: collision with root package name */
    private int f29518g = -1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0565b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f29525a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f29525a;
            this.f29525a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f29525a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            Drawable.Callback callback = this.f29525a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j11);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f29525a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f29526a;

        /* renamed from: b  reason: collision with root package name */
        Resources f29527b;

        /* renamed from: c  reason: collision with root package name */
        int f29528c;

        /* renamed from: d  reason: collision with root package name */
        int f29529d;

        /* renamed from: e  reason: collision with root package name */
        int f29530e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f29531f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f29532g;

        /* renamed from: h  reason: collision with root package name */
        int f29533h;

        /* renamed from: i  reason: collision with root package name */
        boolean f29534i;

        /* renamed from: j  reason: collision with root package name */
        boolean f29535j;

        /* renamed from: k  reason: collision with root package name */
        Rect f29536k;

        /* renamed from: l  reason: collision with root package name */
        boolean f29537l;

        /* renamed from: m  reason: collision with root package name */
        boolean f29538m;

        /* renamed from: n  reason: collision with root package name */
        int f29539n;

        /* renamed from: o  reason: collision with root package name */
        int f29540o;

        /* renamed from: p  reason: collision with root package name */
        int f29541p;

        /* renamed from: q  reason: collision with root package name */
        int f29542q;

        /* renamed from: r  reason: collision with root package name */
        boolean f29543r;

        /* renamed from: s  reason: collision with root package name */
        int f29544s;

        /* renamed from: t  reason: collision with root package name */
        boolean f29545t;

        /* renamed from: u  reason: collision with root package name */
        boolean f29546u;

        /* renamed from: v  reason: collision with root package name */
        boolean f29547v;

        /* renamed from: w  reason: collision with root package name */
        boolean f29548w;

        /* renamed from: x  reason: collision with root package name */
        boolean f29549x;

        /* renamed from: y  reason: collision with root package name */
        boolean f29550y;

        /* renamed from: z  reason: collision with root package name */
        int f29551z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            this.f29534i = false;
            this.f29537l = false;
            this.f29549x = true;
            this.A = 0;
            this.B = 0;
            this.f29526a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f29527b : null;
            }
            this.f29527b = resources2;
            int f11 = b.f(resources, dVar != null ? dVar.f29528c : 0);
            this.f29528c = f11;
            if (dVar != null) {
                this.f29529d = dVar.f29529d;
                this.f29530e = dVar.f29530e;
                this.f29547v = true;
                this.f29548w = true;
                this.f29534i = dVar.f29534i;
                this.f29537l = dVar.f29537l;
                this.f29549x = dVar.f29549x;
                this.f29550y = dVar.f29550y;
                this.f29551z = dVar.f29551z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f29528c == f11) {
                    if (dVar.f29535j) {
                        this.f29536k = dVar.f29536k != null ? new Rect(dVar.f29536k) : null;
                        this.f29535j = true;
                    }
                    if (dVar.f29538m) {
                        this.f29539n = dVar.f29539n;
                        this.f29540o = dVar.f29540o;
                        this.f29541p = dVar.f29541p;
                        this.f29542q = dVar.f29542q;
                        this.f29538m = true;
                    }
                }
                if (dVar.f29543r) {
                    this.f29544s = dVar.f29544s;
                    this.f29543r = true;
                }
                if (dVar.f29545t) {
                    this.f29546u = dVar.f29546u;
                    this.f29545t = true;
                }
                Drawable[] drawableArr = dVar.f29532g;
                this.f29532g = new Drawable[drawableArr.length];
                this.f29533h = dVar.f29533h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f29531f;
                if (sparseArray != null) {
                    this.f29531f = sparseArray.clone();
                } else {
                    this.f29531f = new SparseArray<>(this.f29533h);
                }
                int i11 = this.f29533h;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (drawableArr[i12] != null) {
                        Drawable.ConstantState constantState = drawableArr[i12].getConstantState();
                        if (constantState != null) {
                            this.f29531f.put(i12, constantState);
                        } else {
                            this.f29532g[i12] = drawableArr[i12];
                        }
                    }
                }
                return;
            }
            this.f29532g = new Drawable[10];
            this.f29533h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f29531f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f29532g[this.f29531f.keyAt(i11)] = s(this.f29531f.valueAt(i11).newDrawable(this.f29527b));
                }
                this.f29531f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                n3.a.m(drawable, this.f29551z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f29526a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i11 = this.f29533h;
            if (i11 >= this.f29532g.length) {
                o(i11, i11 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f29526a);
            this.f29532g[i11] = drawable;
            this.f29533h++;
            this.f29530e = drawable.getChangingConfigurations() | this.f29530e;
            p();
            this.f29536k = null;
            this.f29535j = false;
            this.f29538m = false;
            this.f29547v = false;
            return i11;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i11 = this.f29533h;
                Drawable[] drawableArr = this.f29532g;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (drawableArr[i12] != null && n3.a.b(drawableArr[i12])) {
                        n3.a.a(drawableArr[i12], theme);
                        this.f29530e |= drawableArr[i12].getChangingConfigurations();
                    }
                }
                y(C0565b.c(theme));
            }
        }

        public boolean c() {
            if (this.f29547v) {
                return this.f29548w;
            }
            e();
            this.f29547v = true;
            int i11 = this.f29533h;
            Drawable[] drawableArr = this.f29532g;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].getConstantState() == null) {
                    this.f29548w = false;
                    return false;
                }
            }
            this.f29548w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i11 = this.f29533h;
            Drawable[] drawableArr = this.f29532g;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    if (n3.a.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f29531f.get(i12);
                    if (constantState != null && C0565b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        protected void d() {
            this.f29538m = true;
            e();
            int i11 = this.f29533h;
            Drawable[] drawableArr = this.f29532g;
            this.f29540o = -1;
            this.f29539n = -1;
            this.f29542q = 0;
            this.f29541p = 0;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f29539n) {
                    this.f29539n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f29540o) {
                    this.f29540o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f29541p) {
                    this.f29541p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f29542q) {
                    this.f29542q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f29532g.length;
        }

        public final Drawable g(int i11) {
            int indexOfKey;
            Drawable drawable = this.f29532g[i11];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f29531f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i11)) < 0) {
                return null;
            }
            Drawable s11 = s(this.f29531f.valueAt(indexOfKey).newDrawable(this.f29527b));
            this.f29532g[i11] = s11;
            this.f29531f.removeAt(indexOfKey);
            if (this.f29531f.size() == 0) {
                this.f29531f = null;
            }
            return s11;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29529d | this.f29530e;
        }

        public final int h() {
            return this.f29533h;
        }

        public final int i() {
            if (!this.f29538m) {
                d();
            }
            return this.f29540o;
        }

        public final int j() {
            if (!this.f29538m) {
                d();
            }
            return this.f29542q;
        }

        public final int k() {
            if (!this.f29538m) {
                d();
            }
            return this.f29541p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f29534i) {
                return null;
            }
            Rect rect2 = this.f29536k;
            if (rect2 != null || this.f29535j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i11 = this.f29533h;
            Drawable[] drawableArr = this.f29532g;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i13 = rect3.left;
                    if (i13 > rect.left) {
                        rect.left = i13;
                    }
                    int i14 = rect3.top;
                    if (i14 > rect.top) {
                        rect.top = i14;
                    }
                    int i15 = rect3.right;
                    if (i15 > rect.right) {
                        rect.right = i15;
                    }
                    int i16 = rect3.bottom;
                    if (i16 > rect.bottom) {
                        rect.bottom = i16;
                    }
                }
            }
            this.f29535j = true;
            this.f29536k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f29538m) {
                d();
            }
            return this.f29539n;
        }

        public final int n() {
            if (this.f29543r) {
                return this.f29544s;
            }
            e();
            int i11 = this.f29533h;
            Drawable[] drawableArr = this.f29532g;
            int opacity = i11 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i12 = 1; i12 < i11; i12++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i12].getOpacity());
            }
            this.f29544s = opacity;
            this.f29543r = true;
            return opacity;
        }

        public void o(int i11, int i12) {
            Drawable[] drawableArr = new Drawable[i12];
            Drawable[] drawableArr2 = this.f29532g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i11);
            }
            this.f29532g = drawableArr;
        }

        void p() {
            this.f29543r = false;
            this.f29545t = false;
        }

        public final boolean q() {
            return this.f29537l;
        }

        abstract void r();

        public final void t(boolean z11) {
            this.f29537l = z11;
        }

        public final void u(int i11) {
            this.A = i11;
        }

        public final void v(int i11) {
            this.B = i11;
        }

        final boolean w(int i11, int i12) {
            int i13 = this.f29533h;
            Drawable[] drawableArr = this.f29532g;
            boolean z11 = false;
            for (int i14 = 0; i14 < i13; i14++) {
                if (drawableArr[i14] != null) {
                    boolean m11 = Build.VERSION.SDK_INT >= 23 ? n3.a.m(drawableArr[i14], i11) : false;
                    if (i14 == i12) {
                        z11 = m11;
                    }
                }
            }
            this.f29551z = i11;
            return z11;
        }

        public final void x(boolean z11) {
            this.f29534i = z11;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f29527b = resources;
                int f11 = b.f(resources, this.f29528c);
                int i11 = this.f29528c;
                this.f29528c = f11;
                if (i11 != f11) {
                    this.f29538m = false;
                    this.f29535j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f29523l == null) {
            this.f29523l = new c();
        }
        drawable.setCallback(this.f29523l.b(drawable.getCallback()));
        try {
            if (this.f29512a.A <= 0 && this.f29517f) {
                drawable.setAlpha(this.f29516e);
            }
            d dVar = this.f29512a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    n3.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f29512a;
                if (dVar2.I) {
                    n3.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f29512a.f29549x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                n3.a.m(drawable, n3.a.f(this));
            }
            if (i11 >= 19) {
                n3.a.j(drawable, this.f29512a.C);
            }
            Rect rect = this.f29513b;
            if (i11 >= 21 && rect != null) {
                n3.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f29523l.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && n3.a.f(this) == 1;
    }

    static int f(Resources resources, int i11) {
        if (resources != null) {
            i11 = resources.getDisplayMetrics().densityDpi;
        }
        if (i11 == 0) {
            return 160;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f29517f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f29514c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f29521j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f29516e
            r3.setAlpha(r9)
            r13.f29521j = r7
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            i.b$d r10 = r13.f29512a
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f29516e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f29521j = r7
        L38:
            r3 = r6
        L39:
            android.graphics.drawable.Drawable r9 = r13.f29515d
            if (r9 == 0) goto L61
            long r10 = r13.f29522k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f29515d = r0
            r13.f29522k = r7
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$d r4 = r13.f29512a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f29516e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f29522k = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f29520i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f29512a.b(theme);
    }

    d b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f29518g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f29512a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f29515d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f29518g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$d r0 = r9.f29512a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f29515d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f29514c
            if (r0 == 0) goto L29
            r9.f29515d = r0
            i.b$d r0 = r9.f29512a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f29522k = r0
            goto L35
        L29:
            r9.f29515d = r4
            r9.f29522k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f29514c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            i.b$d r0 = r9.f29512a
            int r1 = r0.f29533h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f29514c = r0
            r9.f29518g = r10
            if (r0 == 0) goto L5a
            i.b$d r10 = r9.f29512a
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f29521j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f29514c = r4
            r10 = -1
            r9.f29518g = r10
        L5a:
            long r0 = r9.f29521j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f29522k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f29520i
            if (r10 != 0) goto L73
            i.b$a r10 = new i.b$a
            r10.<init>()
            r9.f29520i = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29516e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f29512a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f29512a.c()) {
            this.f29512a.f29529d = getChangingConfigurations();
            return this.f29512a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f29514c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f29513b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f29512a.q()) {
            return this.f29512a.i();
        }
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f29512a.q()) {
            return this.f29512a.m();
        }
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f29512a.q()) {
            return this.f29512a.j();
        }
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f29512a.q()) {
            return this.f29512a.k();
        }
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f29514c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f29512a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            C0565b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l11 = this.f29512a.l();
        if (l11 != null) {
            rect.set(l11);
            padding = (l11.right | ((l11.left | l11.top) | l11.bottom)) != 0;
        } else {
            Drawable drawable = this.f29514c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (e()) {
            int i11 = rect.left;
            rect.left = rect.right;
            rect.right = i11;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f29512a = dVar;
        int i11 = this.f29518g;
        if (i11 >= 0) {
            Drawable g11 = dVar.g(i11);
            this.f29514c = g11;
            if (g11 != null) {
                d(g11);
            }
        }
        this.f29515d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f29512a.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f29512a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f29514c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f29512a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z11;
        Drawable drawable = this.f29515d;
        boolean z12 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f29515d = null;
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable2 = this.f29514c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f29517f) {
                this.f29514c.setAlpha(this.f29516e);
            }
        }
        if (this.f29522k != 0) {
            this.f29522k = 0L;
            z11 = true;
        }
        if (this.f29521j != 0) {
            this.f29521j = 0L;
        } else {
            z12 = z11;
        }
        if (z12) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f29519h && super.mutate() == this) {
            d b11 = b();
            b11.r();
            h(b11);
            this.f29519h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29515d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f29514c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        return this.f29512a.w(i11, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        Drawable drawable = this.f29515d;
        if (drawable != null) {
            return drawable.setLevel(i11);
        }
        Drawable drawable2 = this.f29514c;
        if (drawable2 != null) {
            return drawable2.setLevel(i11);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f29515d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f29514c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        if (drawable != this.f29514c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f29517f && this.f29516e == i11) {
            return;
        }
        this.f29517f = true;
        this.f29516e = i11;
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            if (this.f29521j == 0) {
                drawable.setAlpha(i11);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        d dVar = this.f29512a;
        if (dVar.C != z11) {
            dVar.C = z11;
            Drawable drawable = this.f29514c;
            if (drawable != null) {
                n3.a.j(drawable, z11);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f29512a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f29514c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        d dVar = this.f29512a;
        if (dVar.f29549x != z11) {
            dVar.f29549x = z11;
            Drawable drawable = this.f29514c;
            if (drawable != null) {
                drawable.setDither(z11);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f11, float f12) {
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            n3.a.k(drawable, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        Rect rect = this.f29513b;
        if (rect == null) {
            this.f29513b = new Rect(i11, i12, i13, i14);
        } else {
            rect.set(i11, i12, i13, i14);
        }
        Drawable drawable = this.f29514c;
        if (drawable != null) {
            n3.a.l(drawable, i11, i12, i13, i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f29512a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            n3.a.o(this.f29514c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f29512a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            n3.a.p(this.f29514c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Drawable drawable = this.f29515d;
        if (drawable != null) {
            drawable.setVisible(z11, z12);
        }
        Drawable drawable2 = this.f29514c;
        if (drawable2 != null) {
            drawable2.setVisible(z11, z12);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f29514c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}