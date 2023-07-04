package je;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import je.q;

/* loaded from: classes3.dex */
public class p extends g {

    /* renamed from: e */
    q.c f33432e;

    /* renamed from: f */
    Object f33433f;

    /* renamed from: g */
    PointF f33434g;

    /* renamed from: h */
    int f33435h;

    /* renamed from: i */
    int f33436i;

    /* renamed from: j */
    Matrix f33437j;

    /* renamed from: k */
    private Matrix f33438k;

    public p(Drawable drawable, q.c cVar) {
        super((Drawable) md.k.g(drawable));
        this.f33434g = null;
        this.f33435h = 0;
        this.f33436i = 0;
        this.f33438k = new Matrix();
        this.f33432e = cVar;
    }

    private void y() {
        boolean z11;
        q.c cVar = this.f33432e;
        boolean z12 = true;
        if (cVar instanceof q.o) {
            Object state = ((q.o) cVar).getState();
            z11 = state == null || !state.equals(this.f33433f);
            this.f33433f = state;
        } else {
            z11 = false;
        }
        if (this.f33435h == getCurrent().getIntrinsicWidth() && this.f33436i == getCurrent().getIntrinsicHeight()) {
            z12 = false;
        }
        if (z12 || z11) {
            x();
        }
    }

    public q.c A() {
        return this.f33432e;
    }

    public void B(PointF pointF) {
        if (md.j.a(this.f33434g, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f33434g = null;
        } else {
            if (this.f33434g == null) {
                this.f33434g = new PointF();
            }
            this.f33434g.set(pointF);
        }
        x();
        invalidateSelf();
    }

    public void C(q.c cVar) {
        if (md.j.a(this.f33432e, cVar)) {
            return;
        }
        this.f33432e = cVar;
        this.f33433f = null;
        x();
        invalidateSelf();
    }

    @Override // je.g, je.s
    public void d(Matrix matrix) {
        t(matrix);
        y();
        Matrix matrix2 = this.f33437j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        y();
        if (this.f33437j != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f33437j);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        x();
    }

    @Override // je.g
    public Drawable v(Drawable drawable) {
        Drawable v11 = super.v(drawable);
        x();
        return v11;
    }

    void x() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f33435h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f33436i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f33437j = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f33437j = null;
        } else if (this.f33432e == q.c.f33449a) {
            current.setBounds(bounds);
            this.f33437j = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            q.c cVar = this.f33432e;
            Matrix matrix = this.f33438k;
            PointF pointF = this.f33434g;
            cVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f33437j = this.f33438k;
        }
    }

    public PointF z() {
        return this.f33434g;
    }
}