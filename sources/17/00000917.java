package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class n0 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f6194a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(View view) {
        this.f6194a = view.getOverlay();
    }

    @Override // androidx.transition.o0
    public void a(Drawable drawable) {
        this.f6194a.add(drawable);
    }

    @Override // androidx.transition.o0
    public void b(Drawable drawable) {
        this.f6194a.remove(drawable);
    }
}