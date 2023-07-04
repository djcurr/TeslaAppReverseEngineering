package androidx.fragment.app;

import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;

/* loaded from: classes.dex */
public final class e0 {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<s0.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f4858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f4858a = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final s0.b invoke() {
            s0.b defaultViewModelProviderFactory = this.f4858a.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.f(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final <VM extends p0> vz.k<VM> a(Fragment fragment, n00.d<VM> viewModelClass, h00.a<? extends t0> storeProducer, h00.a<? extends s0.b> aVar) {
        kotlin.jvm.internal.s.g(fragment, "<this>");
        kotlin.jvm.internal.s.g(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.s.g(storeProducer, "storeProducer");
        if (aVar == null) {
            aVar = new a(fragment);
        }
        return new r0(viewModelClass, storeProducer, aVar);
    }
}