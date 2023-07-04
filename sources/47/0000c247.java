package ya;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import za.b;

/* loaded from: classes.dex */
public abstract class f<Z> extends l<ImageView, Z> implements b.a {

    /* renamed from: g  reason: collision with root package name */
    private Animatable f59415g;

    public f(ImageView imageView) {
        super(imageView);
    }

    private void f(Z z11) {
        if (z11 instanceof Animatable) {
            Animatable animatable = (Animatable) z11;
            this.f59415g = animatable;
            animatable.start();
            return;
        }
        this.f59415g = null;
    }

    private void i(Z z11) {
        h(z11);
        f(z11);
    }

    public void g(Drawable drawable) {
        ((ImageView) this.f59419a).setImageDrawable(drawable);
    }

    protected abstract void h(Z z11);

    @Override // ya.l, ya.a, ya.k
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f59415g;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        g(drawable);
    }

    @Override // ya.a, ya.k
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        i(null);
        g(drawable);
    }

    @Override // ya.l, ya.a, ya.k
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        i(null);
        g(drawable);
    }

    @Override // ya.k
    public void onResourceReady(Z z11, za.b<? super Z> bVar) {
        if (bVar != null && bVar.a(z11, this)) {
            f(z11);
        } else {
            i(z11);
        }
    }

    @Override // ya.a, va.m
    public void onStart() {
        Animatable animatable = this.f59415g;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // ya.a, va.m
    public void onStop() {
        Animatable animatable = this.f59415g;
        if (animatable != null) {
            animatable.stop();
        }
    }
}