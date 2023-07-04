package je;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class b extends g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private int f33341e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f33342f;

    /* renamed from: g  reason: collision with root package name */
    float f33343g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33344h;

    public b(Drawable drawable, int i11) {
        this(drawable, i11, true);
    }

    private int x() {
        return (int) ((20.0f / this.f33341e) * 360.0f);
    }

    private void y() {
        if (this.f33344h) {
            return;
        }
        this.f33344h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i11 = bounds.right;
        int i12 = bounds.left;
        int i13 = i11 - i12;
        int i14 = bounds.bottom;
        int i15 = bounds.top;
        int i16 = i14 - i15;
        float f11 = this.f33343g;
        if (!this.f33342f) {
            f11 = 360.0f - f11;
        }
        canvas.rotate(f11, i12 + (i13 / 2), i15 + (i16 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        y();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33344h = false;
        this.f33343g += x();
        invalidateSelf();
    }

    public b(Drawable drawable, int i11, boolean z11) {
        super((Drawable) md.k.g(drawable));
        this.f33343g = BitmapDescriptorFactory.HUE_RED;
        this.f33344h = false;
        this.f33341e = i11;
        this.f33342f = z11;
    }
}