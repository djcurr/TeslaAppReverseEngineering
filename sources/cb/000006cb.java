package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0 implements androidx.lifecycle.o, androidx.savedstate.c, u0 {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f4847a;

    /* renamed from: b  reason: collision with root package name */
    private final t0 f4848b;

    /* renamed from: c  reason: collision with root package name */
    private s0.b f4849c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.lifecycle.x f4850d = null;

    /* renamed from: e  reason: collision with root package name */
    private androidx.savedstate.b f4851e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(Fragment fragment, t0 t0Var) {
        this.f4847a = fragment;
        this.f4848b = t0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(p.b bVar) {
        this.f4850d.i(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f4850d == null) {
            this.f4850d = new androidx.lifecycle.x(this);
            this.f4851e = androidx.savedstate.b.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f4850d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f4851e.c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f4851e.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(p.c cVar) {
        this.f4850d.p(cVar);
    }

    @Override // androidx.lifecycle.o
    public s0.b getDefaultViewModelProviderFactory() {
        s0.b defaultViewModelProviderFactory = this.f4847a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4847a.mDefaultFactory)) {
            this.f4849c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4849c == null) {
            Application application = null;
            Context applicationContext = this.f4847a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                } else if (applicationContext instanceof Application) {
                    application = applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f4849c = new m0(application, this, this.f4847a.getArguments());
        }
        return this.f4849c;
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.p getLifecycle() {
        b();
        return this.f4850d;
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f4851e.b();
    }

    @Override // androidx.lifecycle.u0
    public t0 getViewModelStore() {
        b();
        return this.f4848b;
    }
}