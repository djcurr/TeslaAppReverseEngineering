package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.p;

/* loaded from: classes2.dex */
public final class t3 extends pd<u3> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f19495e = 0;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1", f = "HeadlessOAuthFragment.kt", l = {25}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19496a;

        @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1$1", f = "HeadlessOAuthFragment.kt", l = {26}, m = "invokeSuspend")
        /* renamed from: com.plaid.internal.t3$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0348a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f19498a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ t3 f19499b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0348a(t3 t3Var, zz.d<? super C0348a> dVar) {
                super(2, dVar);
                this.f19499b = t3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0348a(this.f19499b, dVar);
            }

            @Override // h00.p
            /* renamed from: invoke */
            public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return new C0348a(this.f19499b, dVar).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f19498a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    t3 t3Var = this.f19499b;
                    int i12 = t3.f19495e;
                    this.f19498a = 1;
                    if (t3Var.b().e(this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return vz.b0.f54756a;
            }
        }

        public a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19496a;
            if (i11 == 0) {
                vz.r.b(obj);
                t3 t3Var = t3.this;
                p.c cVar = p.c.STARTED;
                C0348a c0348a = new C0348a(t3Var, null);
                this.f19496a = 1;
                if (RepeatOnLifecycleKt.b(t3Var, cVar, c0348a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    public t3() {
        super(u3.class);
    }

    @Override // com.plaid.internal.pd
    public u3 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new u3(paneId, component);
    }

    @Override // com.plaid.internal.pd, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new a(null), 3, null);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        return null;
    }
}