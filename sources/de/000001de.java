package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import l.b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static int f1147a = -100;

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<f>> f1148b = new androidx.collection.b<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1149c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(f fVar) {
        synchronized (f1149c) {
            z(fVar);
            f1148b.add(new WeakReference<>(fVar));
        }
    }

    public static f g(Activity activity, e eVar) {
        return new g(activity, eVar);
    }

    public static f h(Dialog dialog, e eVar) {
        return new g(dialog, eVar);
    }

    public static int j() {
        return f1147a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(f fVar) {
        synchronized (f1149c) {
            z(fVar);
        }
    }

    private static void z(f fVar) {
        synchronized (f1149c) {
            Iterator<WeakReference<f>> it2 = f1148b.iterator();
            while (it2.hasNext()) {
                f fVar2 = it2.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it2.remove();
                }
            }
        }
    }

    public abstract boolean A(int i11);

    public abstract void B(int i11);

    public abstract void C(View view);

    public abstract void D(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void E(Toolbar toolbar);

    public void F(int i11) {
    }

    public abstract void G(CharSequence charSequence);

    public abstract l.b H(b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i11);

    public abstract b k();

    public int l() {
        return -100;
    }

    public abstract MenuInflater m();

    public abstract a n();

    public abstract void o();

    public abstract void p();

    public abstract void q(Configuration configuration);

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();
}