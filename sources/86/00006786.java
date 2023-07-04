package e7;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.v;
import com.adyen.checkout.components.ActionComponentData;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import e7.f;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b<ConfigurationT extends f> extends f7.a<ConfigurationT> {

    /* renamed from: c  reason: collision with root package name */
    private final f0<ActionComponentData> f24931c;

    /* renamed from: d  reason: collision with root package name */
    private final f0<c7.d> f24932d;

    static {
        o7.a.c();
    }

    public b(l0 l0Var, Application application, ConfigurationT configurationt) {
        super(l0Var, application, configurationt);
        this.f24931c = new f0<>();
        this.f24932d = new f0<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String g() {
        return (String) getSavedStateHandle().c("payment_data");
    }

    public void h(Activity activity, Action action) {
        if (!a(action)) {
            k(new ComponentException("Action type not supported by this component - " + action.getType()));
            return;
        }
        p(action.getPaymentData());
        try {
            i(activity, action);
        } catch (ComponentException e11) {
            k(e11);
        }
    }

    protected abstract void i(Activity activity, Action action);

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(JSONObject jSONObject) {
        ActionComponentData actionComponentData = new ActionComponentData();
        actionComponentData.setDetails(jSONObject);
        actionComponentData.setPaymentData(g());
        this.f24931c.setValue(actionComponentData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(CheckoutException checkoutException) {
        this.f24932d.postValue(new c7.d(checkoutException));
    }

    public void l(v vVar, g0<ActionComponentData> g0Var) {
        this.f24931c.observe(vVar, g0Var);
    }

    public void m(v vVar, g0<c7.d> g0Var) {
        this.f24932d.observe(vVar, g0Var);
    }

    public void n(v vVar) {
        this.f24932d.removeObservers(vVar);
    }

    public void o(v vVar) {
        this.f24931c.removeObservers(vVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(String str) {
        getSavedStateHandle().h("payment_data", str);
    }
}