package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    Size f2631a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f2632b;

    /* renamed from: c  reason: collision with root package name */
    private final f f2633c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2634d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(FrameLayout frameLayout, f fVar) {
        this.f2632b = frameLayout;
        this.f2633c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap a() {
        Bitmap c11 = c();
        if (c11 == null) {
            return null;
        }
        return this.f2633c.a(c11, new Size(this.f2632b.getWidth(), this.f2632b.getHeight()), this.f2632b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f2634d = true;
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g(e1 e1Var, a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        View b11 = b();
        if (b11 == null || !this.f2634d) {
            return;
        }
        this.f2633c.q(new Size(this.f2632b.getWidth(), this.f2632b.getHeight()), this.f2632b.getLayoutDirection(), b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract com.google.common.util.concurrent.c<Void> i();
}