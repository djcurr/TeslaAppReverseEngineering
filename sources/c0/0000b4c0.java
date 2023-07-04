package t7;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.components.model.payments.response.VoucherAction;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.v;

/* loaded from: classes.dex */
public final class e implements c7.b<d, g> {

    /* loaded from: classes.dex */
    public static final class a extends androidx.lifecycle.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.savedstate.c f51748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f51749b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f51750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.savedstate.c cVar, Bundle bundle, Application application, g gVar) {
            super(cVar, bundle);
            this.f51748a = cVar;
            this.f51749b = application;
            this.f51750c = gVar;
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(handle, "handle");
            return new d(handle, this.f51749b, this.f51750c);
        }
    }

    @Override // c7.b
    public boolean a(Action action) {
        boolean T;
        List list;
        boolean T2;
        s.g(action, "action");
        T = e0.T(e(), action.getType());
        if (T) {
            list = f.f51751a;
            T2 = e0.T(list, action.getPaymentMethodType());
            if (T2) {
                return true;
            }
        }
        return false;
    }

    @Override // c7.b
    /* renamed from: c */
    public <T extends androidx.savedstate.c & u0> d b(T owner, Application application, g configuration) {
        s.g(owner, "owner");
        s.g(application, "application");
        s.g(configuration, "configuration");
        return d(owner, owner, application, configuration, null);
    }

    public d d(androidx.savedstate.c savedStateRegistryOwner, u0 viewModelStoreOwner, Application application, g configuration, Bundle bundle) {
        s.g(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.g(viewModelStoreOwner, "viewModelStoreOwner");
        s.g(application, "application");
        s.g(configuration, "configuration");
        p0 a11 = new s0(viewModelStoreOwner, new a(savedStateRegistryOwner, bundle, application, configuration)).a(d.class);
        s.f(a11, "ViewModelProvider(viewModelStoreOwner, voucherFactory).get(VoucherComponent::class.java)");
        return (d) a11;
    }

    public List<String> e() {
        List<String> d11;
        d11 = v.d(VoucherAction.ACTION_TYPE);
        return d11;
    }
}