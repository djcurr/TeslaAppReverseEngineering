package je;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class a extends Drawable implements Drawable.Callback, s, r {

    /* renamed from: a  reason: collision with root package name */
    private s f33331a;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable[] f33333c;

    /* renamed from: d  reason: collision with root package name */
    private final c[] f33334d;

    /* renamed from: b  reason: collision with root package name */
    private final d f33332b = new d();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f33335e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private boolean f33336f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f33337g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33338h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: je.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0613a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f33339a;

        C0613a(int i11) {
            this.f33339a = i11;
        }

        @Override // je.c
        public Drawable g(Drawable drawable) {
            return a.this.f(this.f33339a, drawable);
        }

        @Override // je.c
        public Drawable r() {
            return a.this.b(this.f33339a);
        }
    }

    public a(Drawable[] drawableArr) {
        int i11 = 0;
        md.k.g(drawableArr);
        this.f33333c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f33333c;
            if (i11 < drawableArr2.length) {
                e.d(drawableArr2[i11], this, this);
                i11++;
            } else {
                this.f33334d = new c[drawableArr2.length];
                return;
            }
        }
    }

    private c a(int i11) {
        return new C0613a(i11);
    }

    public Drawable b(int i11) {
        md.k.b(Boolean.valueOf(i11 >= 0));
        md.k.b(Boolean.valueOf(i11 < this.f33333c.length));
        return this.f33333c[i11];
    }

    public c c(int i11) {
        md.k.b(Boolean.valueOf(i11 >= 0));
        md.k.b(Boolean.valueOf(i11 < this.f33334d.length));
        c[] cVarArr = this.f33334d;
        if (cVarArr[i11] == null) {
            cVarArr[i11] = a(i11);
        }
        return this.f33334d[i11];
    }

    @Override // je.s
    public void d(Matrix matrix) {
        s sVar = this.f33331a;
        if (sVar != null) {
            sVar.d(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i11++;
        }
    }

    public int e() {
        return this.f33333c.length;
    }

    public Drawable f(int i11, Drawable drawable) {
        md.k.b(Boolean.valueOf(i11 >= 0));
        md.k.b(Boolean.valueOf(i11 < this.f33333c.length));
        Drawable drawable2 = this.f33333c[i11];
        if (drawable != drawable2) {
            if (drawable != null && this.f33338h) {
                drawable.mutate();
            }
            e.d(this.f33333c[i11], null, null);
            e.d(drawable, null, null);
            e.e(drawable, this.f33332b);
            e.a(drawable, this);
            e.d(drawable, this, this);
            this.f33337g = false;
            this.f33333c[i11] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i11 = 0;
        int i12 = -1;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                i12 = Math.max(i12, drawable.getIntrinsicHeight());
            }
            i11++;
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i11 = 0;
        int i12 = -1;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                i12 = Math.max(i12, drawable.getIntrinsicWidth());
            }
            i11++;
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f33333c.length == 0) {
            return -2;
        }
        int i11 = -1;
        int i12 = 1;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i12 >= drawableArr.length) {
                return i11;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                i11 = Drawable.resolveOpacity(i11, drawable.getOpacity());
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i11 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f33335e;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f33337g) {
            this.f33336f = false;
            int i11 = 0;
            while (true) {
                Drawable[] drawableArr = this.f33333c;
                boolean z11 = true;
                if (i11 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i11];
                boolean z12 = this.f33336f;
                if (drawable == null || !drawable.isStateful()) {
                    z11 = false;
                }
                this.f33336f = z12 | z11;
                i11++;
            }
            this.f33337g = true;
        }
        return this.f33336f;
    }

    @Override // je.r
    public void k(s sVar) {
        this.f33331a = sVar;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 < drawableArr.length) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    drawable.mutate();
                }
                i11++;
            } else {
                this.f33338h = true;
                return this;
            }
        }
    }

    @Override // je.s
    public void o(RectF rectF) {
        s sVar = this.f33331a;
        if (sVar != null) {
            sVar.o(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i12 >= drawableArr.length) {
                return z11;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null && drawable.setLevel(i11)) {
                z11 = true;
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return z11;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setState(iArr)) {
                z11 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f33332b.b(i11);
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setAlpha(i11);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33332b.c(colorFilter);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f33332b.d(z11);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setDither(z11);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f33332b.e(z11);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setFilterBitmap(z11);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f11, float f12) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setHotspot(f11, f12);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f33333c;
            if (i11 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setVisible(z11, z12);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}