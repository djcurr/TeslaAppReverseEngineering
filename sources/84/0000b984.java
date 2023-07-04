package v6;

import com.adyen.checkout.card.api.model.AddressItem;
import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.components.model.paymentmethods.PaymentMethod;
import j7.f;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;

/* loaded from: classes.dex */
public final class v extends l {

    /* renamed from: d  reason: collision with root package name */
    private final PaymentMethod f54220d;

    /* renamed from: e  reason: collision with root package name */
    private final y6.b f54221e;

    /* renamed from: f  reason: collision with root package name */
    private final b f54222f;

    /* renamed from: g  reason: collision with root package name */
    private final o f54223g;

    /* renamed from: h  reason: collision with root package name */
    private final kotlinx.coroutines.flow.t<List<x6.b>> f54224h;

    /* renamed from: i  reason: collision with root package name */
    private final kotlinx.coroutines.flow.e<List<x6.b>> f54225i;

    /* renamed from: j  reason: collision with root package name */
    private final kotlinx.coroutines.flow.e<List<AddressItem>> f54226j;

    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.card.NewCardDelegate$detectCardType$1", f = "NewCardDelegate.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54227a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54229c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54230d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f54229c = str;
            this.f54230d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f54229c, this.f54230d, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            String str;
            d11 = a00.d.d();
            int i11 = this.f54227a;
            if (i11 == 0) {
                vz.r.b(obj);
                y6.b bVar = v.this.f54221e;
                String str2 = this.f54229c;
                String str3 = this.f54230d;
                k e11 = v.this.e();
                this.f54227a = 1;
                obj = bVar.b(str2, str3, e11, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            str = w.f54231a;
            o7.b.a(str, "Emitting new detectedCardTypes");
            v.this.f54224h.b((List) obj);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PaymentMethod paymentMethod, k cardConfiguration, y6.b binLookupRepository, i7.a publicKeyRepository, b addressDelegate, o cardValidationMapper) {
        super(cardConfiguration, publicKeyRepository);
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        kotlin.jvm.internal.s.g(cardConfiguration, "cardConfiguration");
        kotlin.jvm.internal.s.g(binLookupRepository, "binLookupRepository");
        kotlin.jvm.internal.s.g(publicKeyRepository, "publicKeyRepository");
        kotlin.jvm.internal.s.g(addressDelegate, "addressDelegate");
        kotlin.jvm.internal.s.g(cardValidationMapper, "cardValidationMapper");
        this.f54220d = paymentMethod;
        this.f54221e = binLookupRepository;
        this.f54222f = addressDelegate;
        this.f54223g = cardValidationMapper;
        kotlinx.coroutines.flow.t<List<x6.b>> a11 = kotlinx.coroutines.flow.a0.a(0, 1, kotlinx.coroutines.channels.a.DROP_OLDEST);
        this.f54224h = a11;
        this.f54225i = a11;
        this.f54226j = addressDelegate.f();
    }

    private final x6.b C(x6.a aVar, List<? extends x6.a> list) {
        return new x6.b(aVar, false, true, h().contains(aVar) ? Brand.c.HIDDEN : Brand.c.REQUIRED, Brand.c.REQUIRED, list.contains(aVar), false, 64, null);
    }

    private final List<x6.b> y(String str) {
        String str2;
        int t11;
        List<x6.b> i11;
        str2 = w.f54231a;
        o7.b.a(str2, "detectCardLocally");
        if (str.length() == 0) {
            i11 = wz.w.i();
            return i11;
        }
        List<x6.a> j11 = e().j();
        kotlin.jvm.internal.s.f(j11, "cardConfiguration.supportedCardTypes");
        List<x6.a> estimate = x6.a.estimate(str);
        kotlin.jvm.internal.s.f(estimate, "estimate(cardNumber)");
        t11 = wz.x.t(estimate, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (x6.a it2 : estimate) {
            kotlin.jvm.internal.s.f(it2, "it");
            arrayList.add(C(it2, j11));
        }
        return arrayList;
    }

    public final Object A(zz.d<? super List<AddressItem>> dVar) {
        return this.f54222f.d(e(), dVar);
    }

    public final kotlinx.coroutines.flow.e<List<AddressItem>> B() {
        return this.f54226j;
    }

    public final void D(String str, o0 coroutineScope) {
        kotlin.jvm.internal.s.g(coroutineScope, "coroutineScope");
        this.f54222f.e(e(), str, coroutineScope);
    }

    @Override // e7.k
    public String a() {
        String type = this.f54220d.getType();
        return type == null ? "unknown" : type;
    }

    @Override // v6.l
    public List<x6.b> b(String cardNumber, String str, o0 coroutineScope) {
        String str2;
        String str3;
        String str4;
        kotlin.jvm.internal.s.g(cardNumber, "cardNumber");
        kotlin.jvm.internal.s.g(coroutineScope, "coroutineScope");
        str2 = w.f54231a;
        o7.b.a(str2, "detectCardType");
        if (this.f54221e.e(cardNumber)) {
            if (this.f54221e.a(cardNumber)) {
                str4 = w.f54231a;
                o7.b.a(str4, "Returning cashed result.");
                return this.f54221e.c(cardNumber);
            } else if (str != null) {
                str3 = w.f54231a;
                o7.b.a(str3, "Launching Bin Lookup");
                v20.k.d(coroutineScope, null, null, new a(cardNumber, str, null), 3, null);
            }
        }
        return y(cardNumber);
    }

    @Override // v6.l
    public c d(v6.a aVar, e7.a addressVisibility) {
        kotlin.jvm.internal.s.g(addressVisibility, "addressVisibility");
        return b7.a.f7519a.a(aVar, addressVisibility);
    }

    @Override // v6.l
    public String f() {
        return this.f54220d.getFundingSource();
    }

    @Override // v6.l
    public List<r> g(q qVar, x6.a aVar, boolean z11) {
        List<r> i11;
        if (kotlin.jvm.internal.s.c(f(), "debit")) {
            i11 = wz.w.i();
            return i11;
        }
        return b7.f.f7525a.e(qVar, aVar, z11);
    }

    @Override // v6.l
    public boolean i(c addressFormUIState) {
        kotlin.jvm.internal.s.g(addressFormUIState, "addressFormUIState");
        return b7.a.f7519a.d(addressFormUIState);
    }

    @Override // v6.l
    public boolean j() {
        return e().k();
    }

    @Override // v6.l
    public boolean k() {
        return e().m();
    }

    @Override // v6.l
    public boolean l() {
        return e().g() == u.SHOW;
    }

    @Override // v6.l
    public boolean m() {
        return e().i() == b0.SHOW;
    }

    @Override // v6.l
    public boolean n() {
        return true;
    }

    @Override // v6.l
    public e o(d addressInputModel, c addressFormUIState) {
        kotlin.jvm.internal.s.g(addressInputModel, "addressInputModel");
        kotlin.jvm.internal.s.g(addressFormUIState, "addressFormUIState");
        return b7.b.f7521a.d(addressInputModel, addressFormUIState);
    }

    @Override // v6.l
    public j7.a<String> p(String cardNumber, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(cardNumber, "cardNumber");
        return this.f54223g.a(cardNumber, b7.d.f7523a.e(cardNumber, z11, z12));
    }

    @Override // v6.l
    public j7.a<x6.c> q(x6.c expiryDate, Brand.c cVar) {
        kotlin.jvm.internal.s.g(expiryDate, "expiryDate");
        return b7.d.f7523a.f(expiryDate, cVar);
    }

    @Override // v6.l
    public j7.a<String> r(String holderName) {
        boolean w11;
        kotlin.jvm.internal.s.g(holderName, "holderName");
        if (e().m()) {
            w11 = kotlin.text.v.w(holderName);
            if (w11) {
                return new j7.a<>(holderName, new f.a(z.checkout_holder_name_not_valid));
            }
        }
        return new j7.a<>(holderName, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> s(String kcpBirthDateOrTaxNumber) {
        kotlin.jvm.internal.s.g(kcpBirthDateOrTaxNumber, "kcpBirthDateOrTaxNumber");
        if (l()) {
            return b7.g.f7527a.a(kcpBirthDateOrTaxNumber);
        }
        return new j7.a<>(kcpBirthDateOrTaxNumber, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> t(String kcpCardPassword) {
        kotlin.jvm.internal.s.g(kcpCardPassword, "kcpCardPassword");
        if (l()) {
            return b7.g.f7527a.b(kcpCardPassword);
        }
        return new j7.a<>(kcpCardPassword, f.b.f33276a);
    }

    @Override // v6.l
    public j7.a<String> u(String securityCode, x6.b bVar) {
        kotlin.jvm.internal.s.g(securityCode, "securityCode");
        if (e().k()) {
            return new j7.a<>(securityCode, f.b.f33276a);
        }
        return b7.d.f7523a.g(securityCode, bVar);
    }

    @Override // v6.l
    public j7.a<String> v(String socialSecurityNumber) {
        kotlin.jvm.internal.s.g(socialSecurityNumber, "socialSecurityNumber");
        if (m()) {
            return b7.h.f7528a.c(socialSecurityNumber);
        }
        return new j7.a<>(socialSecurityNumber, f.b.f33276a);
    }

    public final kotlinx.coroutines.flow.e<List<x6.b>> z() {
        return this.f54225i;
    }
}