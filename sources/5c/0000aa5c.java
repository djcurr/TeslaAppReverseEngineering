package p6;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.components.model.payments.response.Threeds2Action;
import com.adyen.checkout.components.model.payments.response.Threeds2ChallengeAction;
import com.adyen.checkout.components.model.payments.response.Threeds2FingerprintAction;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.w;

/* loaded from: classes.dex */
public final class b implements c7.b<p6.a, c> {

    /* loaded from: classes.dex */
    public static final class a extends androidx.lifecycle.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.savedstate.c f46361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f46362b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f46363c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s6.a f46364d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f46365e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s7.a f46366f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.savedstate.c cVar, Bundle bundle, Application application, c cVar2, s6.a aVar, d dVar, s7.a aVar2) {
            super(cVar, bundle);
            this.f46361a = cVar;
            this.f46362b = application;
            this.f46363c = cVar2;
            this.f46364d = aVar;
            this.f46365e = dVar;
            this.f46366f = aVar2;
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(handle, "handle");
            return new p6.a(handle, this.f46362b, this.f46363c, this.f46364d, this.f46365e, this.f46366f);
        }
    }

    @Override // c7.b
    public boolean a(Action action) {
        boolean T;
        s.g(action, "action");
        T = e0.T(e(), action.getType());
        return T;
    }

    @Override // c7.b
    /* renamed from: c */
    public <T extends androidx.savedstate.c & u0> p6.a b(T owner, Application application, c configuration) {
        s.g(owner, "owner");
        s.g(application, "application");
        s.g(configuration, "configuration");
        return d(owner, owner, application, configuration, null);
    }

    public p6.a d(androidx.savedstate.c savedStateRegistryOwner, u0 viewModelStoreOwner, Application application, c configuration, Bundle bundle) {
        s.g(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.g(viewModelStoreOwner, "viewModelStoreOwner");
        s.g(application, "application");
        s.g(configuration, "configuration");
        p0 a11 = new s0(viewModelStoreOwner, new a(savedStateRegistryOwner, bundle, application, configuration, new s6.a(), new d(), new s7.a())).a(p6.a.class);
        s.f(a11, "ViewModelProvider(viewModelStoreOwner, threeDS2Factory).get(Adyen3DS2Component::class.java)");
        return (p6.a) a11;
    }

    public List<String> e() {
        List<String> l11;
        l11 = w.l(Threeds2FingerprintAction.ACTION_TYPE, Threeds2ChallengeAction.ACTION_TYPE, Threeds2Action.ACTION_TYPE);
        return l11;
    }
}