package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.view.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import md.j;
import me.b;

/* loaded from: classes3.dex */
public class c<DH extends me.b> extends ImageView {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f11100f = false;

    /* renamed from: a  reason: collision with root package name */
    private final a.C0210a f11101a;

    /* renamed from: b  reason: collision with root package name */
    private float f11102b;

    /* renamed from: c  reason: collision with root package name */
    private b<DH> f11103c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11104d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11105e;

    public c(Context context) {
        super(context);
        this.f11101a = new a.C0210a();
        this.f11102b = BitmapDescriptorFactory.HUE_RED;
        this.f11104d = false;
        this.f11105e = false;
        c(context);
    }

    private void c(Context context) {
        boolean d11;
        try {
            if (tf.b.d()) {
                tf.b.a("DraweeView#init");
            }
            if (this.f11104d) {
                if (d11) {
                    return;
                }
                return;
            }
            boolean z11 = true;
            this.f11104d = true;
            this.f11103c = b.e(null, context);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    if (tf.b.d()) {
                        tf.b.b();
                        return;
                    }
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!f11100f || context.getApplicationInfo().targetSdkVersion < 24) {
                z11 = false;
            }
            this.f11105e = z11;
            if (tf.b.d()) {
                tf.b.b();
            }
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f11105e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z11) {
        f11100f = z11;
    }

    protected void a() {
        this.f11103c.k();
    }

    protected void b() {
        this.f11103c.l();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f11102b;
    }

    public me.a getController() {
        return this.f11103c.g();
    }

    public DH getHierarchy() {
        return this.f11103c.h();
    }

    public Drawable getTopLevelDrawable() {
        return this.f11103c.i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        a.C0210a c0210a = this.f11101a;
        c0210a.f11092a = i11;
        c0210a.f11093b = i12;
        a.b(c0210a, this.f11102b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0210a c0210a2 = this.f11101a;
        super.onMeasure(c0210a2.f11092a, c0210a2.f11093b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11103c.m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        d();
    }

    public void setAspectRatio(float f11) {
        if (f11 == this.f11102b) {
            return;
        }
        this.f11102b = f11;
        requestLayout();
    }

    public void setController(me.a aVar) {
        this.f11103c.o(aVar);
        super.setImageDrawable(this.f11103c.i());
    }

    public void setHierarchy(DH dh2) {
        this.f11103c.p(dh2);
        super.setImageDrawable(this.f11103c.i());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f11103c.o(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f11103c.o(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i11) {
        c(getContext());
        this.f11103c.o(null);
        super.setImageResource(i11);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f11103c.o(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z11) {
        this.f11105e = z11;
    }

    @Override // android.view.View
    public String toString() {
        j.b c11 = j.c(this);
        b<DH> bVar = this.f11103c;
        return c11.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}