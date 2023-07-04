package ke;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import je.g;
import je.t;
import je.u;

/* loaded from: classes3.dex */
public class c extends g implements t {

    /* renamed from: e  reason: collision with root package name */
    Drawable f34598e;

    /* renamed from: f  reason: collision with root package name */
    private u f34599f;

    public c(Drawable drawable) {
        super(drawable);
        this.f34598e = null;
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            u uVar = this.f34599f;
            if (uVar != null) {
                uVar.a();
            }
            super.draw(canvas);
            Drawable drawable = this.f34598e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f34598e.draw(canvas);
            }
        }
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // je.t
    public void h(u uVar) {
        this.f34599f = uVar;
    }

    @Override // je.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        u uVar = this.f34599f;
        if (uVar != null) {
            uVar.b(z11);
        }
        return super.setVisible(z11, z12);
    }

    public void x(Drawable drawable) {
        this.f34598e = drawable;
        invalidateSelf();
    }
}