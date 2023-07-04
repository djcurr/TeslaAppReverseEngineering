package t6;

import androidx.lifecycle.l0;
import com.adyen.checkout.components.model.payments.request.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.components.model.payments.request.PaymentComponentData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a extends e7.e<c, d, p, b> {

    /* renamed from: j  reason: collision with root package name */
    public static final C1146a f51668j = new C1146a(null);

    /* renamed from: k  reason: collision with root package name */
    private static final c7.g<a, c> f51669k = new e7.g(a.class);

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f51670l = {BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE};

    /* renamed from: i  reason: collision with root package name */
    private final d f51671i;

    /* renamed from: t6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1146a {
        private C1146a() {
        }

        public /* synthetic */ C1146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c7.g<a, c> a() {
            return a.f51669k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l0 savedStateHandle, e7.h paymentMethodDelegate, c configuration) {
        super(savedStateHandle, paymentMethodDelegate, configuration);
        kotlin.jvm.internal.s.g(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.s.g(paymentMethodDelegate, "paymentMethodDelegate");
        kotlin.jvm.internal.s.g(configuration, "configuration");
        this.f51671i = new d(null, null, null, null, false, false, null, 127, null);
    }

    public static final c7.g<a, c> y() {
        return f51668j.a();
    }

    public final void A() {
        this.f51671i.l(com.adyen.checkout.bacs.a.CONFIRMATION);
        j(this.f51671i);
    }

    public final void B() {
        this.f51671i.l(com.adyen.checkout.bacs.a.INPUT);
        j(this.f51671i);
    }

    @Override // c7.f
    public String[] e() {
        return f51670l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e7.e
    /* renamed from: w */
    public b h() {
        j7.a<String> b11;
        j7.a<String> a11;
        j7.a<String> d11;
        j7.a<String> c11;
        PaymentComponentData paymentComponentData = new PaymentComponentData();
        BacsDirectDebitPaymentMethod bacsDirectDebitPaymentMethod = new BacsDirectDebitPaymentMethod();
        bacsDirectDebitPaymentMethod.setType(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE);
        p i11 = i();
        String str = null;
        bacsDirectDebitPaymentMethod.setHolderName((i11 == null || (b11 = i11.b()) == null) ? null : b11.b());
        p i12 = i();
        bacsDirectDebitPaymentMethod.setBankAccountNumber((i12 == null || (a11 = i12.a()) == null) ? null : a11.b());
        p i13 = i();
        bacsDirectDebitPaymentMethod.setBankLocationId((i13 == null || (d11 = i13.d()) == null) ? null : d11.b());
        p i14 = i();
        if (i14 != null && (c11 = i14.c()) != null) {
            str = c11.b();
        }
        paymentComponentData.setShopperEmail(str);
        paymentComponentData.setPaymentMethod(bacsDirectDebitPaymentMethod);
        p i15 = i();
        return new b(paymentComponentData, i15 == null ? false : i15.g(), true, this.f51671i.c());
    }

    public final d x() {
        return this.f51671i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e7.e
    /* renamed from: z */
    public p s(d inputData) {
        kotlin.jvm.internal.s.g(inputData, "inputData");
        q qVar = q.f51698a;
        return new p(qVar.b(inputData.b()), qVar.a(inputData.a()), qVar.d(inputData.e()), qVar.c(inputData.d()), inputData.g(), inputData.f());
    }
}