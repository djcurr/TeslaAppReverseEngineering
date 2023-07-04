package je;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class f extends je.a {
    private boolean A;
    private boolean B;

    /* renamed from: i  reason: collision with root package name */
    private final Drawable[] f33350i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f33351j;

    /* renamed from: k  reason: collision with root package name */
    private final int f33352k;

    /* renamed from: l  reason: collision with root package name */
    private final int f33353l;

    /* renamed from: m  reason: collision with root package name */
    int f33354m;

    /* renamed from: n  reason: collision with root package name */
    int f33355n;

    /* renamed from: o  reason: collision with root package name */
    long f33356o;

    /* renamed from: p  reason: collision with root package name */
    int[] f33357p;

    /* renamed from: q  reason: collision with root package name */
    int[] f33358q;

    /* renamed from: t  reason: collision with root package name */
    int f33359t;

    /* renamed from: w  reason: collision with root package name */
    boolean[] f33360w;

    /* renamed from: x  reason: collision with root package name */
    int f33361x;

    /* renamed from: y  reason: collision with root package name */
    private a f33362y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f33363z;

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    public f(Drawable[] drawableArr, boolean z11, int i11) {
        super(drawableArr);
        this.B = true;
        md.k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f33350i = drawableArr;
        this.f33357p = new int[drawableArr.length];
        this.f33358q = new int[drawableArr.length];
        this.f33359t = 255;
        this.f33360w = new boolean[drawableArr.length];
        this.f33361x = 0;
        this.f33351j = z11;
        this.f33352k = z11 ? 255 : 0;
        this.f33353l = i11;
        u();
    }

    private void h(Canvas canvas, Drawable drawable, int i11) {
        if (drawable == null || i11 <= 0) {
            return;
        }
        this.f33361x++;
        if (this.B) {
            drawable.mutate();
        }
        drawable.setAlpha(i11);
        this.f33361x--;
        drawable.draw(canvas);
    }

    private void r() {
        if (this.f33363z) {
            this.f33363z = false;
            a aVar = this.f33362y;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    private void s() {
        int i11;
        if (!this.f33363z && (i11 = this.f33353l) >= 0) {
            boolean[] zArr = this.f33360w;
            if (i11 < zArr.length && zArr[i11]) {
                this.f33363z = true;
                a aVar = this.f33362y;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    private void t() {
        if (this.A && this.f33354m == 2 && this.f33360w[this.f33353l]) {
            a aVar = this.f33362y;
            if (aVar != null) {
                aVar.b();
            }
            this.A = false;
        }
    }

    private void u() {
        this.f33354m = 2;
        Arrays.fill(this.f33357p, this.f33352k);
        this.f33357p[0] = 255;
        Arrays.fill(this.f33358q, this.f33352k);
        this.f33358q[0] = 255;
        Arrays.fill(this.f33360w, this.f33351j);
        this.f33360w[0] = true;
    }

    private boolean x(float f11) {
        boolean z11 = true;
        for (int i11 = 0; i11 < this.f33350i.length; i11++) {
            boolean[] zArr = this.f33360w;
            int i12 = zArr[i11] ? 1 : -1;
            int[] iArr = this.f33358q;
            iArr[i11] = (int) (this.f33357p[i11] + (i12 * 255 * f11));
            if (iArr[i11] < 0) {
                iArr[i11] = 0;
            }
            if (iArr[i11] > 255) {
                iArr[i11] = 255;
            }
            if (zArr[i11] && iArr[i11] < 255) {
                z11 = false;
            }
            if (!zArr[i11] && iArr[i11] > 0) {
                z11 = false;
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[LOOP:0: B:25:0x0051->B:27:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[EDGE_INSN: B:32:0x0071->B:28:0x0071 ?: BREAK  , SYNTHETIC] */
    @Override // je.a, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f33354m
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto La
            goto L51
        La:
            int r0 = r8.f33355n
            if (r0 <= 0) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            md.k.i(r0)
            long r4 = r8.p()
            long r6 = r8.f33356o
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f33355n
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.x(r0)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = r3
        L28:
            r8.f33354m = r1
            goto L50
        L2b:
            int[] r0 = r8.f33358q
            int[] r4 = r8.f33357p
            android.graphics.drawable.Drawable[] r5 = r8.f33350i
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.p()
            r8.f33356o = r4
            int r0 = r8.f33355n
            if (r0 != 0) goto L42
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r0 = r8.x(r0)
            r8.s()
            if (r0 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r3
        L4e:
            r8.f33354m = r1
        L50:
            r3 = r0
        L51:
            android.graphics.drawable.Drawable[] r0 = r8.f33350i
            int r1 = r0.length
            if (r2 >= r1) goto L71
            r0 = r0[r2]
            int[] r1 = r8.f33358q
            r1 = r1[r2]
            int r4 = r8.f33359t
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.h(r9, r0, r1)
            int r2 = r2 + 1
            goto L51
        L71:
            if (r3 == 0) goto L7a
            r8.r()
            r8.t()
            goto L7d
        L7a:
            r8.invalidateSelf()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.f.draw(android.graphics.Canvas):void");
    }

    public void g() {
        this.f33361x++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f33359t;
    }

    public void i() {
        this.f33361x--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f33361x == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f33354m = 0;
        Arrays.fill(this.f33360w, true);
        invalidateSelf();
    }

    public void l(int i11) {
        this.f33354m = 0;
        this.f33360w[i11] = true;
        invalidateSelf();
    }

    public void m(int i11) {
        this.f33354m = 0;
        this.f33360w[i11] = false;
        invalidateSelf();
    }

    public void n() {
        this.f33354m = 2;
        for (int i11 = 0; i11 < this.f33350i.length; i11++) {
            this.f33358q[i11] = this.f33360w[i11] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long p() {
        return SystemClock.uptimeMillis();
    }

    public int q() {
        return this.f33355n;
    }

    @Override // je.a, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f33359t != i11) {
            this.f33359t = i11;
            invalidateSelf();
        }
    }

    public void v(a aVar) {
        this.f33362y = aVar;
    }

    public void w(int i11) {
        this.f33355n = i11;
        if (this.f33354m == 1) {
            this.f33354m = 0;
        }
    }
}