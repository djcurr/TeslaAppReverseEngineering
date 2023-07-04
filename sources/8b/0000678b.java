package e7;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import e7.e;
import e7.f;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g<BaseComponentT extends e<?, ?, ?, ?>, ConfigurationT extends f> implements c7.g<BaseComponentT, ConfigurationT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<BaseComponentT> f24946a;

    /* loaded from: classes.dex */
    public static final class a extends androidx.lifecycle.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.savedstate.c f24947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f24948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f24949c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PaymentMethod f24950d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.savedstate.c cVar, Bundle bundle, g gVar, f fVar, PaymentMethod paymentMethod) {
            super(cVar, bundle);
            this.f24947a = cVar;
            this.f24948b = gVar;
            this.f24949c = fVar;
            this.f24950d = paymentMethod;
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            s.g(key, "key");
            s.g(modelClass, "modelClass");
            s.g(handle, "handle");
            return (e) this.f24948b.f24946a.getConstructor(l0.class, h.class, this.f24949c.getClass()).newInstance(handle, new h(this.f24950d), this.f24949c);
        }
    }

    public g(Class<BaseComponentT> componentClass) {
        s.g(componentClass, "componentClass");
        this.f24946a = componentClass;
    }

    public BaseComponentT c(androidx.savedstate.c savedStateRegistryOwner, u0 viewModelStoreOwner, PaymentMethod paymentMethod, ConfigurationT configuration, Bundle bundle) {
        s.g(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.g(viewModelStoreOwner, "viewModelStoreOwner");
        s.g(paymentMethod, "paymentMethod");
        s.g(configuration, "configuration");
        p0 a11 = new s0(viewModelStoreOwner, new a(savedStateRegistryOwner, bundle, this, configuration, paymentMethod)).a(this.f24946a);
        s.f(a11, "ViewModelProvider(viewModelStoreOwner, genericFactory).get(componentClass)");
        return (BaseComponentT) a11;
    }

    @Override // c7.g
    /* renamed from: d */
    public <T extends androidx.savedstate.c & u0> BaseComponentT a(T owner, PaymentMethod paymentMethod, ConfigurationT configuration) {
        s.g(owner, "owner");
        s.g(paymentMethod, "paymentMethod");
        s.g(configuration, "configuration");
        return c(owner, owner, paymentMethod, configuration, null);
    }
}