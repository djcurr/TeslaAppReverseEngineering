package t7;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.v;
import com.adyen.checkout.components.ActionComponentData;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.components.model.payments.response.VoucherAction;
import com.adyen.checkout.core.exception.ComponentException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends e7.b<g> implements c7.i<h, g, ActionComponentData> {

    /* renamed from: g  reason: collision with root package name */
    public static final c7.b<d, g> f51745g;

    /* renamed from: e  reason: collision with root package name */
    private final f0<h> f51746e;

    /* renamed from: f  reason: collision with root package name */
    private String f51747f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f51745g = new e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0 savedStateHandle, Application application, g configuration) {
        super(savedStateHandle, application, configuration);
        s.g(savedStateHandle, "savedStateHandle");
        s.g(application, "application");
        s.g(configuration, "configuration");
        this.f51746e = new f0<>();
    }

    @Override // c7.a
    public boolean a(Action action) {
        s.g(action, "action");
        return f51745g.a(action);
    }

    @Override // c7.i
    public void b(Context context) {
        s.g(context, "context");
    }

    @Override // e7.b
    protected void i(Activity activity, Action action) {
        s.g(activity, "activity");
        s.g(action, "action");
        if (action instanceof VoucherAction) {
            VoucherAction voucherAction = (VoucherAction) action;
            this.f51747f = voucherAction.getUrl();
            this.f51746e.postValue(new h(true, voucherAction.getPaymentMethodType()));
            return;
        }
        throw new ComponentException("Unsupported action");
    }

    public final String q() {
        return this.f51747f;
    }

    public void r(v lifecycleOwner, g0<h> observer) {
        s.g(lifecycleOwner, "lifecycleOwner");
        s.g(observer, "observer");
        this.f51746e.observe(lifecycleOwner, observer);
    }
}