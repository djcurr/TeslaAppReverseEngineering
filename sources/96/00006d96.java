package f7;

import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import c7.h;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;
import e7.f;
import e7.k;

/* loaded from: classes.dex */
public abstract class b<ConfigurationT extends f, ComponentStateT extends h<? extends PaymentMethodDetails>> extends p0 implements c7.f<ComponentStateT, ConfigurationT> {

    /* renamed from: a  reason: collision with root package name */
    protected final k f25914a;

    /* renamed from: b  reason: collision with root package name */
    protected final ConfigurationT f25915b;

    public b(l0 l0Var, k kVar, ConfigurationT configurationt) {
        this.f25914a = kVar;
        this.f25915b = configurationt;
    }

    @Override // c7.c
    public ConfigurationT f() {
        return this.f25915b;
    }
}