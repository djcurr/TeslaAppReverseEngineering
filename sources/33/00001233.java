package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.v;
import ch.qos.logback.core.CoreConstants;
import d6.a;
import f6.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/target/ImageViewTarget;", "Ld6/a;", "Landroid/widget/ImageView;", "Lf6/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "view", "<init>", "(Landroid/widget/ImageView;)V", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public class ImageViewTarget implements a<ImageView>, c, DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9315a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f9316b;

    public ImageViewTarget(ImageView view) {
        s.g(view, "view");
        this.f9316b = view;
    }

    @Override // d6.b
    public void a(Drawable result) {
        s.g(result, "result");
        h(result);
    }

    @Override // d6.b
    public void b(Drawable drawable) {
        h(drawable);
    }

    @Override // d6.b
    public void d(Drawable drawable) {
        h(drawable);
    }

    @Override // d6.a
    public void e() {
        h(null);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImageViewTarget) && s.c(getView(), ((ImageViewTarget) obj).getView()));
    }

    @Override // d6.c
    /* renamed from: f */
    public ImageView getView() {
        return this.f9316b;
    }

    protected void h(Drawable drawable) {
        Drawable drawable2 = getView().getDrawable();
        if (!(drawable2 instanceof Animatable)) {
            drawable2 = null;
        }
        Animatable animatable = (Animatable) drawable2;
        if (animatable != null) {
            animatable.stop();
        }
        getView().setImageDrawable(drawable);
        i();
    }

    public int hashCode() {
        return getView().hashCode();
    }

    protected void i() {
        Drawable drawable = getView().getDrawable();
        if (!(drawable instanceof Animatable)) {
            drawable = null;
        }
        Animatable animatable = (Animatable) drawable;
        if (animatable != null) {
            if (this.f9315a) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onStart(v owner) {
        s.g(owner, "owner");
        this.f9315a = true;
        i();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.m
    public void onStop(v owner) {
        s.g(owner, "owner");
        this.f9315a = false;
        i();
    }

    public String toString() {
        return "ImageViewTarget(view=" + getView() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}