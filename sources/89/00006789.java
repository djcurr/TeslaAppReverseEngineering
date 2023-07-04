package e7;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.v;
import c7.h;
import com.adyen.checkout.components.analytics.AnalyticsDispatcher;
import com.adyen.checkout.components.analytics.a;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import e7.f;
import e7.i;
import e7.j;

/* loaded from: classes.dex */
public abstract class e<ConfigurationT extends f, InputDataT extends i, OutputDataT extends j, ComponentStateT extends c7.h<? extends PaymentMethodDetails>> extends f7.b<ConfigurationT, ComponentStateT> implements c7.i<OutputDataT, ConfigurationT, ComponentStateT> {

    /* renamed from: h */
    private static final String f24937h = o7.a.c();

    /* renamed from: c */
    private final f0<ComponentStateT> f24938c;

    /* renamed from: d */
    private final f0<c7.d> f24939d;

    /* renamed from: e */
    private final f0<OutputDataT> f24940e;

    /* renamed from: f */
    private boolean f24941f;

    /* renamed from: g */
    private boolean f24942g;

    public e(l0 l0Var, k kVar, ConfigurationT configurationt) {
        super(l0Var, kVar, configurationt);
        this.f24938c = new f0<>();
        this.f24939d = new f0<>();
        this.f24940e = new f0<>();
        this.f24941f = false;
        this.f24942g = true;
        g(kVar.a());
    }

    public static /* synthetic */ void c(e eVar) {
        eVar.l();
    }

    private void g(String str) {
        if (k(str)) {
            return;
        }
        throw new IllegalArgumentException("Unsupported payment method type " + str);
    }

    private boolean k(String str) {
        for (String str2 : e()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void l() {
        try {
            this.f24938c.postValue(h());
        } catch (Exception e11) {
            String str = f24937h;
            o7.b.c(str, "notifyStateChanged - error:" + e11.getMessage());
            m(new ComponentException("Unexpected error", e11));
        }
    }

    @Override // c7.i
    public void b(Context context) {
        a.c cVar;
        if (this.f24942g) {
            if (this.f24941f) {
                cVar = a.c.DROPIN;
            } else {
                cVar = a.c.COMPONENT;
            }
            String a11 = this.f25914a.a();
            if (!TextUtils.isEmpty(a11)) {
                AnalyticsDispatcher.j(context, f().b(), com.adyen.checkout.components.analytics.a.a(context, cVar, a11, f().c()));
                return;
            }
            throw new CheckoutException("Payment method has empty or null type");
        }
    }

    protected abstract ComponentStateT h();

    public OutputDataT i() {
        return this.f24940e.getValue();
    }

    public final void j(InputDataT inputdatat) {
        o7.b.f(f24937h, "inputDataChanged");
        o(s(inputdatat));
    }

    public void m(CheckoutException checkoutException) {
        String str = f24937h;
        o7.b.c(str, "notifyException - " + checkoutException.getMessage());
        this.f24939d.postValue(new c7.d(checkoutException));
    }

    public void n() {
        o7.b.a(f24937h, "notifyStateChanged");
        com.adyen.checkout.core.api.g.f9591b.submit(new Runnable() { // from class: e7.d
            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.c(e.this);
            }
        });
    }

    public void o(OutputDataT outputdatat) {
        String str = f24937h;
        o7.b.a(str, "notifyStateChanged with OutputData");
        if (!outputdatat.equals(this.f24940e.getValue())) {
            this.f24940e.setValue(outputdatat);
            n();
            return;
        }
        o7.b.a(str, "state has not changed");
    }

    public void p(v vVar, g0<ComponentStateT> g0Var) {
        this.f24938c.observe(vVar, g0Var);
    }

    public void q(v vVar, g0<c7.d> g0Var) {
        this.f24939d.observe(vVar, g0Var);
    }

    public void r(v vVar, g0<OutputDataT> g0Var) {
        this.f24940e.observe(vVar, g0Var);
    }

    protected abstract OutputDataT s(InputDataT inputdatat);

    public void t(v vVar) {
        this.f24939d.removeObservers(vVar);
    }

    public void u(v vVar) {
        this.f24938c.removeObservers(vVar);
    }
}