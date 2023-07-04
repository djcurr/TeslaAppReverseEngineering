package v6;

import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.components.model.paymentmethods.StoredPaymentMethod;
import j7.f;
import java.util.List;
import v20.o0;
import wz.e0;

/* loaded from: classes.dex */
public final class c0 extends l {

    /* renamed from: d  reason: collision with root package name */
    private final StoredPaymentMethod f54104d;

    /* renamed from: e  reason: collision with root package name */
    private final x6.a f54105e;

    /* renamed from: f  reason: collision with root package name */
    private final List<x6.b> f54106f;

    @Override // e7.k
    public String a() {
        String type = this.f54104d.getType();
        return type == null ? "unknown" : type;
    }

    @Override // v6.l
    public List<x6.b> b(String cardNumber, String str, o0 coroutineScope) {
        kotlin.jvm.internal.s.g(cardNumber, "cardNumber");
        kotlin.jvm.internal.s.g(coroutineScope, "coroutineScope");
        return this.f54106f;
    }

    @Override // v6.l
    public c d(a aVar, e7.a addressVisibility) {
        kotlin.jvm.internal.s.g(addressVisibility, "addressVisibility");
        return c.NONE;
    }

    @Override // v6.l
    public String f() {
        return null;
    }

    @Override // v6.l
    public List<r> g(q qVar, x6.a aVar, boolean z11) {
        List<r> i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // v6.l
    public boolean i(c addressFormUIState) {
        kotlin.jvm.internal.s.g(addressFormUIState, "addressFormUIState");
        return false;
    }

    @Override // v6.l
    public boolean j() {
        boolean T;
        if (!e().l()) {
            T = e0.T(h(), this.f54105e);
            if (!T) {
                return false;
            }
        }
        return true;
    }

    @Override // v6.l
    public boolean k() {
        return false;
    }

    @Override // v6.l
    public boolean l() {
        return false;
    }

    @Override // v6.l
    public boolean m() {
        return false;
    }

    @Override // v6.l
    public boolean n() {
        return !e().l();
    }

    @Override // v6.l
    public e o(d addressInputModel, c addressFormUIState) {
        kotlin.jvm.internal.s.g(addressInputModel, "addressInputModel");
        kotlin.jvm.internal.s.g(addressFormUIState, "addressFormUIState");
        return b7.b.f7521a.a(addressInputModel);
    }

    @Override // v6.l
    public j7.a<String> p(String cardNumber, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(cardNumber, "cardNumber");
        return new j7.a<>(cardNumber, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<x6.c> q(x6.c expiryDate, Brand.c cVar) {
        kotlin.jvm.internal.s.g(expiryDate, "expiryDate");
        return new j7.a<>(expiryDate, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> r(String holderName) {
        kotlin.jvm.internal.s.g(holderName, "holderName");
        return new j7.a<>(holderName, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> s(String kcpBirthDateOrTaxNumber) {
        kotlin.jvm.internal.s.g(kcpBirthDateOrTaxNumber, "kcpBirthDateOrTaxNumber");
        return new j7.a<>(kcpBirthDateOrTaxNumber, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> t(String kcpCardPassword) {
        kotlin.jvm.internal.s.g(kcpCardPassword, "kcpCardPassword");
        return new j7.a<>(kcpCardPassword, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> u(String securityCode, x6.b bVar) {
        boolean T;
        kotlin.jvm.internal.s.g(securityCode, "securityCode");
        if (!e().l()) {
            T = e0.T(h(), bVar == null ? null : bVar.c());
            if (!T) {
                return b7.d.f7523a.g(securityCode, bVar);
            }
        }
        return new j7.a<>(securityCode, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> v(String socialSecurityNumber) {
        kotlin.jvm.internal.s.g(socialSecurityNumber, "socialSecurityNumber");
        return new j7.a<>(socialSecurityNumber, f.b.f33276a);
    }

    public final String w() {
        String id2 = this.f54104d.getId();
        return id2 == null ? "ID_NOT_FOUND" : id2;
    }

    public final void x(m inputData) {
        String str;
        kotlin.jvm.internal.s.g(inputData, "inputData");
        String lastFour = this.f54104d.getLastFour();
        if (lastFour == null) {
            lastFour = "";
        }
        inputData.l(lastFour);
        try {
            String expiryMonth = this.f54104d.getExpiryMonth();
            if (expiryMonth == null) {
                expiryMonth = "";
            }
            int parseInt = Integer.parseInt(expiryMonth);
            String expiryYear = this.f54104d.getExpiryYear();
            inputData.m(new x6.c(parseInt, Integer.parseInt(expiryYear != null ? expiryYear : ""), true));
        } catch (NumberFormatException e11) {
            str = d0.f54114a;
            o7.b.d(str, "Failed to parse stored Date", e11);
            x6.c EMPTY_DATE = x6.c.f57131c;
            kotlin.jvm.internal.s.f(EMPTY_DATE, "EMPTY_DATE");
            inputData.m(EMPTY_DATE);
        }
    }
}