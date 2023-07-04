package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements s {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f6394a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f6395b;

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        if (bVar == p.b.ON_DESTROY) {
            this.f6394a.removeCallbacks(this.f6395b);
            vVar.getLifecycle().c(this);
        }
    }
}