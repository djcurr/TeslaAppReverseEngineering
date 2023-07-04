package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class z2 extends w8 {

    /* renamed from: a  reason: collision with root package name */
    public final Application f19945a;

    /* renamed from: b  reason: collision with root package name */
    public Provider<Application> f19946b;

    /* renamed from: c  reason: collision with root package name */
    public Provider<ma> f19947c;

    /* renamed from: d  reason: collision with root package name */
    public Provider<t8> f19948d;

    /* renamed from: e  reason: collision with root package name */
    public Provider<ja> f19949e;

    /* renamed from: f  reason: collision with root package name */
    public Provider<g9> f19950f;

    /* renamed from: g  reason: collision with root package name */
    public Provider<b9> f19951g;

    /* renamed from: h  reason: collision with root package name */
    public Provider<kotlinx.serialization.json.a> f19952h;

    /* renamed from: i  reason: collision with root package name */
    public Provider<y3> f19953i;

    /* renamed from: j  reason: collision with root package name */
    public Provider<l3> f19954j;

    /* renamed from: k  reason: collision with root package name */
    public Provider<WorkflowDatabase> f19955k;

    public z2(v9 v9Var, Application application, v9 v9Var2) {
        this.f19945a = application;
        a(v9Var, application);
    }

    public final void a(v9 v9Var, Application application) {
        tw.e a11 = tw.f.a(application);
        this.f19946b = a11;
        Provider<ma> b11 = tw.d.b(new ea(v9Var, a11));
        this.f19947c = b11;
        this.f19948d = tw.d.b(new ba(v9Var, b11));
        this.f19949e = tw.d.b(new da(v9Var, tw.d.b(new fa(v9Var, this.f19946b))));
        Provider<g9> b12 = tw.d.b(new ca(v9Var, this.f19946b));
        this.f19950f = b12;
        this.f19951g = tw.d.b(new w9(v9Var, this.f19946b, this.f19949e, b12));
        this.f19952h = tw.d.b(new aa(v9Var));
        tw.d.b(new z9(v9Var));
        this.f19953i = tw.d.b(new z3(this.f19947c, this.f19952h));
        this.f19954j = tw.d.b(new y9(v9Var, this.f19946b));
        this.f19955k = tw.d.b(new x9(v9Var, this.f19946b));
    }

    @Override // com.plaid.internal.g5
    public g9 b() {
        return this.f19950f.get();
    }

    @Override // com.plaid.internal.g5
    public j6 c() {
        return this.f19953i.get();
    }

    @Override // com.plaid.internal.g5
    public ja d() {
        return this.f19949e.get();
    }

    @Override // com.plaid.internal.g5
    public WorkflowDatabase e() {
        return this.f19955k.get();
    }

    @Override // com.plaid.internal.g5
    public l3 f() {
        return this.f19954j.get();
    }

    @Override // com.plaid.internal.g5
    public Application g() {
        return this.f19945a;
    }

    @Override // com.plaid.internal.g5
    public kotlinx.serialization.json.a h() {
        return this.f19952h.get();
    }

    public b9 i() {
        return this.f19951g.get();
    }

    @Override // com.plaid.internal.a6, com.plaid.internal.g5
    public t8 a() {
        return this.f19948d.get();
    }
}