package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class i0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f6162a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(ViewGroup viewGroup) {
        this.f6162a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.o0
    public void a(Drawable drawable) {
        this.f6162a.add(drawable);
    }

    @Override // androidx.transition.o0
    public void b(Drawable drawable) {
        this.f6162a.remove(drawable);
    }

    @Override // androidx.transition.j0
    public void c(View view) {
        this.f6162a.add(view);
    }

    @Override // androidx.transition.j0
    public void d(View view) {
        this.f6162a.remove(view);
    }
}