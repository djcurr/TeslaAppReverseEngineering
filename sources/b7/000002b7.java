package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class t0 extends l0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1927b;

    public t0(Context context, Resources resources) {
        super(resources);
        this.f1927b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.l0, android.content.res.Resources
    public Drawable getDrawable(int i11) {
        Drawable drawable = super.getDrawable(i11);
        Context context = this.f1927b.get();
        if (drawable != null && context != null) {
            k0.h().x(context, i11, drawable);
        }
        return drawable;
    }
}