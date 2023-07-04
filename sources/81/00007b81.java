package je;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class h extends g {

    /* renamed from: e  reason: collision with root package name */
    private Matrix f33368e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f33369f;

    /* renamed from: g  reason: collision with root package name */
    private int f33370g;

    /* renamed from: h  reason: collision with root package name */
    private int f33371h;

    private void x() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f33370g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f33371h = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f33369f = this.f33368e;
            return;
        }
        current.setBounds(bounds);
        this.f33369f = null;
    }

    private void y() {
        if (this.f33370g == getCurrent().getIntrinsicWidth() && this.f33371h == getCurrent().getIntrinsicHeight()) {
            return;
        }
        x();
    }

    @Override // je.g, je.s
    public void d(Matrix matrix) {
        super.d(matrix);
        Matrix matrix2 = this.f33369f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        y();
        if (this.f33369f != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f33369f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        x();
    }

    @Override // je.g
    public Drawable v(Drawable drawable) {
        Drawable v11 = super.v(drawable);
        x();
        return v11;
    }
}