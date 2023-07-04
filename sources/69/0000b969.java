package v6;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import v6.k;

/* loaded from: classes.dex */
public final class h implements c7.g {

    /* loaded from: classes.dex */
    public static final class a extends androidx.lifecycle.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.savedstate.c f54141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaymentMethod f54142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f54143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ y6.b f54144d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i7.a f54145e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f54146f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o f54147g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.savedstate.c cVar, Bundle bundle, PaymentMethod paymentMethod, k kVar, y6.b bVar, i7.a aVar, b bVar2, o oVar) {
            super(cVar, bundle);
            this.f54141a = cVar;
            this.f54142b = paymentMethod;
            this.f54143c = kVar;
            this.f54144d = bVar;
            this.f54145e = aVar;
            this.f54146f = bVar2;
            this.f54147g = oVar;
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            kotlin.jvm.internal.s.g(handle, "handle");
            return new f(handle, new v(this.f54142b, this.f54143c, this.f54144d, this.f54145e, this.f54146f, this.f54147g), this.f54143c);
        }
    }

    private final k b(PaymentMethod paymentMethod, k kVar) {
        List<x6.a> j11;
        String str;
        String str2;
        kotlin.jvm.internal.s.f(kVar.j(), "cardConfiguration.supportedCardTypes");
        boolean z11 = true;
        if (!j11.isEmpty()) {
            return kVar;
        }
        List<String> brands = paymentMethod.getBrands();
        List supportedCardTypes = k.f54150p;
        if (brands != null && !brands.isEmpty()) {
            z11 = false;
        }
        if (z11) {
            str = i.f54148a;
            o7.b.a(str, "Falling back to DEFAULT_SUPPORTED_CARDS_LIST");
        } else {
            supportedCardTypes = new ArrayList();
            for (String str3 : brands) {
                x6.a byBrandName = x6.a.getByBrandName(str3);
                if (byBrandName == null) {
                    str2 = i.f54148a;
                    o7.b.c(str2, kotlin.jvm.internal.s.p("Failed to get card type for brand: ", str3));
                } else {
                    supportedCardTypes.add(byBrandName);
                }
            }
        }
        k.b o11 = kVar.o();
        kotlin.jvm.internal.s.f(supportedCardTypes, "supportedCardTypes");
        Object[] array = supportedCardTypes.toArray(new x6.a[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        x6.a[] aVarArr = (x6.a[]) array;
        k a11 = o11.t((x6.a[]) Arrays.copyOf(aVarArr, aVarArr.length)).a();
        kotlin.jvm.internal.s.f(a11, "cardConfiguration.newBuilder()\n            .setSupportedCardTypes(*supportedCardTypes.toTypedArray())\n            .build()");
        return a11;
    }

    public f c(androidx.savedstate.c savedStateRegistryOwner, u0 viewModelStoreOwner, PaymentMethod paymentMethod, k configuration, Bundle bundle) {
        kotlin.jvm.internal.s.g(savedStateRegistryOwner, "savedStateRegistryOwner");
        kotlin.jvm.internal.s.g(viewModelStoreOwner, "viewModelStoreOwner");
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        kotlin.jvm.internal.s.g(configuration, "configuration");
        p0 a11 = new s0(viewModelStoreOwner, new a(savedStateRegistryOwner, bundle, paymentMethod, b(paymentMethod, configuration), new y6.b(), new i7.a(), new b(new y6.a()), new o())).a(f.class);
        kotlin.jvm.internal.s.f(a11, "ViewModelProvider(viewModelStoreOwner, factory).get(CardComponent::class.java)");
        return (f) a11;
    }

    @Override // c7.g
    /* renamed from: d */
    public <T extends androidx.savedstate.c & u0> f a(T owner, PaymentMethod paymentMethod, k configuration) {
        kotlin.jvm.internal.s.g(owner, "owner");
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        kotlin.jvm.internal.s.g(configuration, "configuration");
        return c(owner, owner, paymentMethod, configuration, null);
    }
}