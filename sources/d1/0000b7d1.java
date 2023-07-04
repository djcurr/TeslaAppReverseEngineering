package uk;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import wk.g;
import wk.k;
import wk.n;

/* loaded from: classes3.dex */
public class a extends Drawable implements n, n3.b {

    /* renamed from: a  reason: collision with root package name */
    private b f53534a;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public a mutate() {
        this.f53534a = new b(this.f53534a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f53534a;
        if (bVar.f53536b) {
            bVar.f53535a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f53534a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f53534a.f53535a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f53534a.f53535a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f53534a.f53535a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b11 = uk.b.b(iArr);
        b bVar = this.f53534a;
        if (bVar.f53536b != b11) {
            bVar.f53536b = b11;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f53534a.f53535a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53534a.f53535a.setColorFilter(colorFilter);
    }

    @Override // wk.n
    public void setShapeAppearanceModel(k kVar) {
        this.f53534a.f53535a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTint(int i11) {
        this.f53534a.f53535a.setTint(i11);
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintList(ColorStateList colorStateList) {
        this.f53534a.f53535a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f53534a.f53535a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f53535a;

        /* renamed from: b  reason: collision with root package name */
        boolean f53536b;

        public b(g gVar) {
            this.f53535a = gVar;
            this.f53536b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f53535a = (g) bVar.f53535a.getConstantState().newDrawable();
            this.f53536b = bVar.f53536b;
        }
    }

    private a(b bVar) {
        this.f53534a = bVar;
    }
}