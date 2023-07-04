package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public abstract class m<E> extends j {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f4892a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4893b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f4894c;

    /* renamed from: d  reason: collision with root package name */
    final q f4895d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(h hVar) {
        this(hVar, hVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.j
    public View c(int i11) {
        return null;
    }

    @Override // androidx.fragment.app.j
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f4892a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f4893b;
    }

    public Handler g() {
        return this.f4894c;
    }

    public abstract E h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f4893b);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i11) {
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, Intent intent, int i11, Bundle bundle) {
        if (i11 == -1) {
            androidx.core.content.b.startActivity(this.f4893b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void n(Fragment fragment, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        if (i11 == -1) {
            androidx.core.app.a.j(this.f4892a, intentSender, i11, intent, i12, i13, i14, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void o() {
    }

    m(Activity activity, Context context, Handler handler, int i11) {
        this.f4895d = new r();
        this.f4892a = activity;
        this.f4893b = (Context) v3.h.g(context, "context == null");
        this.f4894c = (Handler) v3.h.g(handler, "handler == null");
    }
}