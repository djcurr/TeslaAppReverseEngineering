package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class f implements yf.g {

    /* renamed from: a  reason: collision with root package name */
    private View f11838a;

    /* renamed from: b  reason: collision with root package name */
    private e f11839b;

    /* renamed from: c  reason: collision with root package name */
    private final bg.d f11840c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(bg.d dVar) {
        this.f11840c = dVar;
    }

    private boolean d() {
        return this.f11839b != null;
    }

    @Override // yf.g
    public boolean a() {
        return this.f11838a != null;
    }

    @Override // yf.g
    public void b(String str) {
        wf.a.b(str.equals(LogBoxModule.NAME), "This surface manager can only create LogBox React application");
        View c11 = this.f11840c.c(LogBoxModule.NAME);
        this.f11838a = c11;
        if (c11 == null) {
            rg.c.a("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // yf.g
    public void c() {
        View view = this.f11838a;
        if (view != null) {
            this.f11840c.k(view);
            this.f11838a = null;
        }
    }

    @Override // yf.g
    public void hide() {
        if (d()) {
            View view = this.f11838a;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.f11838a.getParent()).removeView(this.f11838a);
            }
            this.f11839b.dismiss();
            this.f11839b = null;
        }
    }

    @Override // yf.g
    public void show() {
        if (d() || !a()) {
            return;
        }
        Activity currentActivity = this.f11840c.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            e eVar = new e(currentActivity, this.f11838a);
            this.f11839b = eVar;
            eVar.setCancelable(false);
            this.f11839b.show();
            return;
        }
        rg.c.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
    }
}