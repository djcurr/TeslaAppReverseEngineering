package com.stripe.android.view;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.stripe.android.CustomerSession;
import com.stripe.android.R;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;

/* loaded from: classes6.dex */
public final class DeletePaymentMethodDialogFactory {
    private final PaymentMethodsAdapter adapter;
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Context context;
    private final Object customerSession;
    private final h00.l<PaymentMethod, vz.b0> onDeletedPaymentMethodCallback;
    private final Set<String> productUsage;

    /* loaded from: classes6.dex */
    public static final class PaymentMethodDeleteListener implements CustomerSession.PaymentMethodRetrievalListener {
        @Override // com.stripe.android.CustomerSession.RetrievalListener
        public void onError(int i11, String errorMessage, StripeError stripeError) {
            kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
        }

        @Override // com.stripe.android.CustomerSession.PaymentMethodRetrievalListener
        public void onPaymentMethodRetrieved(PaymentMethod paymentMethod) {
            kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletePaymentMethodDialogFactory(Context context, PaymentMethodsAdapter adapter, CardDisplayTextFactory cardDisplayTextFactory, Object obj, Set<String> productUsage, h00.l<? super PaymentMethod, vz.b0> onDeletedPaymentMethodCallback) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(adapter, "adapter");
        kotlin.jvm.internal.s.g(cardDisplayTextFactory, "cardDisplayTextFactory");
        kotlin.jvm.internal.s.g(productUsage, "productUsage");
        kotlin.jvm.internal.s.g(onDeletedPaymentMethodCallback, "onDeletedPaymentMethodCallback");
        this.context = context;
        this.adapter = adapter;
        this.cardDisplayTextFactory = cardDisplayTextFactory;
        this.customerSession = obj;
        this.productUsage = productUsage;
        this.onDeletedPaymentMethodCallback = onDeletedPaymentMethodCallback;
    }

    public static /* synthetic */ void a(DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory, PaymentMethod paymentMethod, DialogInterface dialogInterface) {
        m526create$lambda3(deletePaymentMethodDialogFactory, paymentMethod, dialogInterface);
    }

    public static /* synthetic */ void b(DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        m524create$lambda1(deletePaymentMethodDialogFactory, paymentMethod, dialogInterface, i11);
    }

    public static /* synthetic */ void c(DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        m525create$lambda2(deletePaymentMethodDialogFactory, paymentMethod, dialogInterface, i11);
    }

    /* renamed from: create$lambda-1 */
    public static final void m524create$lambda1(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(paymentMethod, "$paymentMethod");
        this$0.onDeletedPaymentMethod$payments_core_release(paymentMethod);
    }

    /* renamed from: create$lambda-2 */
    public static final void m525create$lambda2(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(paymentMethod, "$paymentMethod");
        this$0.adapter.resetPaymentMethod$payments_core_release(paymentMethod);
    }

    /* renamed from: create$lambda-3 */
    public static final void m526create$lambda3(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(paymentMethod, "$paymentMethod");
        this$0.adapter.resetPaymentMethod$payments_core_release(paymentMethod);
    }

    public final /* synthetic */ androidx.appcompat.app.c create(final PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        androidx.appcompat.app.c create = new c.a(this.context, R.style.AlertDialogStyle).i(R.string.delete_payment_method_prompt_title).e(card == null ? null : this.cardDisplayTextFactory.createUnstyled$payments_core_release(card)).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DeletePaymentMethodDialogFactory.b(DeletePaymentMethodDialogFactory.this, paymentMethod, dialogInterface, i11);
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DeletePaymentMethodDialogFactory.c(DeletePaymentMethodDialogFactory.this, paymentMethod, dialogInterface, i11);
            }
        }).f(new DialogInterface.OnCancelListener() { // from class: com.stripe.android.view.t
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DeletePaymentMethodDialogFactory.a(DeletePaymentMethodDialogFactory.this, paymentMethod, dialogInterface);
            }
        }).create();
        kotlin.jvm.internal.s.f(create, "Builder(context, R.style…  }\n            .create()");
        return create;
    }

    public final /* synthetic */ void onDeletedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        this.adapter.deletePaymentMethod$payments_core_release(paymentMethod);
        String str = paymentMethod.f20932id;
        if (str != null) {
            Object obj = this.customerSession;
            if (vz.q.g(obj)) {
                obj = null;
            }
            CustomerSession customerSession = (CustomerSession) obj;
            if (customerSession != null) {
                customerSession.detachPaymentMethod$payments_core_release(str, this.productUsage, new PaymentMethodDeleteListener());
            }
        }
        this.onDeletedPaymentMethodCallback.invoke(paymentMethod);
    }
}