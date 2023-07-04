package je;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public class i extends g {

    /* renamed from: e  reason: collision with root package name */
    final Matrix f33372e;

    /* renamed from: f  reason: collision with root package name */
    private int f33373f;

    /* renamed from: g  reason: collision with root package name */
    private int f33374g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f33375h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f33376i;

    public i(Drawable drawable, int i11, int i12) {
        super(drawable);
        this.f33375h = new Matrix();
        this.f33376i = new RectF();
        this.f33372e = new Matrix();
        this.f33373f = i11 - (i11 % 90);
        this.f33374g = (i12 < 0 || i12 > 8) ? 0 : 0;
    }

    @Override // je.g, je.s
    public void d(Matrix matrix) {
        t(matrix);
        if (this.f33372e.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f33372e);
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11;
        if (this.f33373f <= 0 && ((i11 = this.f33374g) == 0 || i11 == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f33372e);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i11 = this.f33374g;
        if (i11 != 5 && i11 != 7 && this.f33373f % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i11 = this.f33374g;
        if (i11 != 5 && i11 != 7 && this.f33373f % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i11;
        Drawable current = getCurrent();
        int i12 = this.f33373f;
        if (i12 <= 0 && ((i11 = this.f33374g) == 0 || i11 == 1)) {
            current.setBounds(rect);
            return;
        }
        int i13 = this.f33374g;
        if (i13 == 2) {
            this.f33372e.setScale(-1.0f, 1.0f);
        } else if (i13 == 7) {
            this.f33372e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f33372e.postScale(-1.0f, 1.0f);
        } else if (i13 == 4) {
            this.f33372e.setScale(1.0f, -1.0f);
        } else if (i13 != 5) {
            this.f33372e.setRotate(i12, rect.centerX(), rect.centerY());
        } else {
            this.f33372e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f33372e.postScale(1.0f, -1.0f);
        }
        this.f33375h.reset();
        this.f33372e.invert(this.f33375h);
        this.f33376i.set(rect);
        this.f33375h.mapRect(this.f33376i);
        RectF rectF = this.f33376i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}