package je;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes3.dex */
public class o extends n {
    public o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // je.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (tf.b.d()) {
            tf.b.a("RoundedNinePatchDrawable#draw");
        }
        if (!d()) {
            super.draw(canvas);
            if (tf.b.d()) {
                tf.b.b();
                return;
            }
            return;
        }
        f();
        e();
        canvas.clipPath(this.f33414e);
        super.draw(canvas);
        if (tf.b.d()) {
            tf.b.b();
        }
    }
}