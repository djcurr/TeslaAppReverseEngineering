package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import l.b;

/* loaded from: classes.dex */
public abstract class a {

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z11);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(boolean z11);

    public abstract void B(int i11);

    public abstract void C(CharSequence charSequence);

    public abstract void D(CharSequence charSequence);

    public l.b E(b.a aVar) {
        return null;
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z11);

    public abstract int j();

    public abstract Context k();

    public abstract void l();

    public boolean m() {
        return false;
    }

    public void n(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
    }

    public abstract boolean p(int i11, KeyEvent keyEvent);

    public boolean q(KeyEvent keyEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract void s(Drawable drawable);

    public abstract void t(View view, C0035a c0035a);

    public abstract void u(boolean z11);

    public abstract void v(boolean z11);

    public abstract void w(boolean z11);

    public abstract void x(boolean z11);

    public abstract void y(boolean z11);

    public abstract void z(Drawable drawable);

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1141a;

        public C0035a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1141a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f27274t);
            this.f1141a = obtainStyledAttributes.getInt(g.j.f27279u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0035a(int i11, int i12) {
            super(i11, i12);
            this.f1141a = 0;
            this.f1141a = 8388627;
        }

        public C0035a(int i11, int i12, int i13) {
            super(i11, i12);
            this.f1141a = 0;
            this.f1141a = i13;
        }

        public C0035a(C0035a c0035a) {
            super((ViewGroup.MarginLayoutParams) c0035a);
            this.f1141a = 0;
            this.f1141a = c0035a.f1141a;
        }

        public C0035a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1141a = 0;
        }
    }
}