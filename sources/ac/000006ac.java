package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.p;
import java.util.Map;

/* loaded from: classes.dex */
class FragmentManager$5 implements androidx.lifecycle.s {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f4766a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f4767b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.p f4768c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f4769d;

    @Override // androidx.lifecycle.s
    public void g(androidx.lifecycle.v vVar, p.b bVar) {
        Map map;
        Map map2;
        if (bVar == p.b.ON_START) {
            map2 = this.f4769d.f4914k;
            Bundle bundle = (Bundle) map2.get(this.f4766a);
            if (bundle != null) {
                this.f4767b.a(this.f4766a, bundle);
                this.f4769d.r(this.f4766a);
            }
        }
        if (bVar == p.b.ON_DESTROY) {
            this.f4768c.c(this);
            map = this.f4769d.f4915l;
            map.remove(this.f4766a);
        }
    }
}