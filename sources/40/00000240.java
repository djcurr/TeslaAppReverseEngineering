package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements androidx.core.view.y, androidx.core.widget.q {

    /* renamed from: a  reason: collision with root package name */
    private final d f1556a;

    /* renamed from: b  reason: collision with root package name */
    private final m f1557b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1556a;
        if (dVar != null) {
            dVar.b();
        }
        m mVar = this.f1557b;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1556a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1556a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.q
    public ColorStateList getSupportImageTintList() {
        m mVar = this.f1557b;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.q
    public PorterDuff.Mode getSupportImageTintMode() {
        m mVar = this.f1557b;
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1557b.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1556a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1556a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.f1557b;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.f1557b;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        m mVar = this.f1557b;
        if (mVar != null) {
            mVar.g(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.f1557b;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1556a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1556a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.q
    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.f1557b;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.q
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.f1557b;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i11) {
        super(r0.b(context), attributeSet, i11);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.f1556a = dVar;
        dVar.e(attributeSet, i11);
        m mVar = new m(this);
        this.f1557b = mVar;
        mVar.f(attributeSet, i11);
    }
}