package v6;

import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import com.adyen.checkout.card.api.model.AddressItem;
import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.adyen.checkout.components.model.payments.request.PaymentComponentData;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.cse.exception.EncryptionException;
import com.adyen.threeds2.ThreeDS2Service;
import j7.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.e;
import v20.o0;
import v6.a;

/* loaded from: classes.dex */
public final class f extends e7.e<k, m, n, j> {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f54122m;

    /* renamed from: i  reason: collision with root package name */
    private final l f54123i;

    /* renamed from: j  reason: collision with root package name */
    private final k f54124j;

    /* renamed from: k  reason: collision with root package name */
    private final m f54125k;

    /* renamed from: l  reason: collision with root package name */
    private String f54126l;

    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.card.CardComponent$1", f = "CardComponent.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f54127a;

        /* renamed from: b  reason: collision with root package name */
        int f54128b;

        a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            f fVar;
            d11 = a00.d.d();
            int i11 = this.f54128b;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    f fVar2 = f.this;
                    l lVar = fVar2.f54123i;
                    this.f54127a = fVar2;
                    this.f54128b = 1;
                    Object c11 = lVar.c(this);
                    if (c11 == d11) {
                        return d11;
                    }
                    fVar = fVar2;
                    obj = c11;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fVar = (f) this.f54127a;
                    vz.r.b(obj);
                }
                fVar.f54126l = (String) obj;
                f.this.n();
            } catch (CheckoutException e11) {
                f.this.m(new ComponentException("Unable to fetch publicKey.", e11));
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.card.CardComponent$2", f = "CardComponent.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<List<? extends x6.b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54130a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f54131b;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f54131b = obj;
            return bVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object mo160invoke(List<x6.b> list, zz.d<? super vz.b0> dVar) {
            return ((b) create(list, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            a00.d.d();
            if (this.f54130a == 0) {
                vz.r.b(obj);
                List list = (List) this.f54131b;
                str = g.f54140a;
                o7.b.a(str, "New binLookupFlow emitted");
                str2 = g.f54140a;
                o7.b.a(str2, kotlin.jvm.internal.s.p("Brands: ", list));
                n i11 = f.this.i();
                f fVar = f.this;
                n nVar = i11;
                if (nVar != null) {
                    fVar.o(fVar.K(nVar.c().b(), nVar.f().b(), nVar.l().b(), nVar.g().b(), nVar.m().b(), nVar.j().b(), nVar.k().b(), fVar.D().a(), nVar.o(), list, fVar.D().i(), fVar.D().e(), nVar.d(), nVar.n()));
                }
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54133a;

        static {
            int[] iArr = new int[Brand.c.values().length];
            iArr[Brand.c.OPTIONAL.ordinal()] = 1;
            iArr[Brand.c.HIDDEN.ordinal()] = 2;
            f54133a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.card.CardComponent$requestCountryList$1", f = "CardComponent.kt", l = {267}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f54135b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f54136c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(v vVar, f fVar, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f54135b = vVar;
            this.f54136c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new e(this.f54135b, this.f54136c, dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((e) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object A;
            Object obj2;
            d11 = a00.d.d();
            int i11 = this.f54134a;
            if (i11 == 0) {
                vz.r.b(obj);
                v vVar = this.f54135b;
                this.f54134a = 1;
                A = vVar.A(this);
                if (A == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
                A = obj;
            }
            List<a7.a> b11 = b7.a.f7519a.b(this.f54136c.f54124j.d(), (List) A);
            Iterator<T> it2 = b11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (kotlin.coroutines.jvm.internal.b.a(((a7.a) obj2).f()).booleanValue()) {
                    break;
                }
            }
            a7.a aVar = (a7.a) obj2;
            if (aVar != null) {
                f fVar = this.f54136c;
                v vVar2 = this.f54135b;
                fVar.D().a().k(aVar.d());
                vVar2.D(aVar.d(), q0.a(fVar));
            }
            n i12 = this.f54136c.i();
            f fVar2 = this.f54136c;
            n nVar = i12;
            if (nVar != null) {
                fVar2.o(fVar2.K(nVar.c().b(), nVar.f().b(), nVar.l().b(), nVar.g().b(), nVar.m().b(), nVar.j().b(), nVar.k().b(), fVar2.D().a(), nVar.o(), nVar.e(), fVar2.D().i(), fVar2.D().e(), b11, nVar.n()));
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.card.CardComponent$subscribeToStatesList$1", f = "CardComponent.kt", l = {}, m = "invokeSuspend")
    /* renamed from: v6.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1220f extends kotlin.coroutines.jvm.internal.l implements h00.p<List<? extends AddressItem>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54137a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f54138b;

        C1220f(zz.d<? super C1220f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            C1220f c1220f = new C1220f(dVar);
            c1220f.f54138b = obj;
            return c1220f;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object mo160invoke(List<AddressItem> list, zz.d<? super vz.b0> dVar) {
            return ((C1220f) create(list, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            a00.d.d();
            if (this.f54137a == 0) {
                vz.r.b(obj);
                List<AddressItem> list = (List) this.f54138b;
                str = g.f54140a;
                o7.b.a(str, "New states emitted");
                str2 = g.f54140a;
                o7.b.a(str2, kotlin.jvm.internal.s.p("States: ", list));
                n i11 = f.this.i();
                f fVar = f.this;
                n nVar = i11;
                if (nVar != null) {
                    fVar.o(fVar.K(nVar.c().b(), nVar.f().b(), nVar.l().b(), nVar.g().b(), nVar.m().b(), nVar.j().b(), nVar.k().b(), fVar.D().a(), nVar.o(), nVar.e(), fVar.D().i(), fVar.D().e(), nVar.d(), b7.a.f7519a.c(list)));
                }
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        new c(null);
        new h();
        f54122m = new String[]{CardPaymentMethod.PAYMENT_METHOD_TYPE};
    }

    private f(l0 l0Var, l lVar, k kVar) {
        super(l0Var, lVar, kVar);
        this.f54123i = lVar;
        this.f54124j = kVar;
        this.f54125k = new m(null, null, null, null, null, null, null, null, null, false, 0, null, 4095, null);
        v20.k.d(q0.a(this), null, null, new a(null), 3, null);
        if (lVar instanceof v) {
            kotlinx.coroutines.flow.g.z(kotlinx.coroutines.flow.g.B(((v) lVar).z(), new b(null)), q0.a(this));
            if (((k) f()).d() instanceof a.C1214a) {
                R((v) lVar);
                P((v) lVar);
            }
        }
    }

    private final boolean F(n nVar) {
        return !nVar.h().isEmpty();
    }

    private final p H(Brand.c cVar) {
        String str;
        str = g.f54140a;
        o7.b.a(str, kotlin.jvm.internal.s.p("makeCvcUIState: ", cVar));
        if (this.f54123i.j()) {
            return p.HIDDEN;
        }
        if (cVar != Brand.c.OPTIONAL && cVar != Brand.c.HIDDEN) {
            return p.REQUIRED;
        }
        return p.OPTIONAL;
    }

    private final p I(Brand.c cVar) {
        int i11 = cVar == null ? -1 : d.f54133a[cVar.ordinal()];
        if (i11 != 1 && i11 != 2) {
            return p.REQUIRED;
        }
        return p.OPTIONAL;
    }

    private final j7.a<r> J(r rVar) {
        return new j7.a<>(rVar, f.b.f33276a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n K(String str, x6.c cVar, String str2, String str3, String str4, String str5, String str6, v6.d dVar, boolean z11, List<x6.b> list, int i11, r rVar, List<a7.a> list2, List<a7.a> list3) {
        boolean z12;
        Object obj;
        Brand.c f11;
        x6.c cVar2;
        boolean z13 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (x6.b bVar : list) {
                if (bVar.g()) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((x6.b) obj2).i()) {
                arrayList.add(obj2);
            }
        }
        List<x6.b> N = N(b7.e.f7524a.a(arrayList), i11);
        Iterator<T> it2 = N.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((x6.b) obj).h()) {
                break;
            }
        }
        x6.b bVar2 = (x6.b) obj;
        if (bVar2 == null) {
            bVar2 = (x6.b) wz.u.d0(N);
        }
        boolean e11 = bVar2 == null ? true : bVar2.e();
        if (bVar2 == null && z12) {
            z13 = true;
        }
        l lVar = this.f54123i;
        v6.a d11 = ((k) f()).d();
        e7.a e12 = ((k) f()).e();
        kotlin.jvm.internal.s.f(e12, "configuration.addressVisibility");
        v6.c d12 = lVar.d(d11, e12);
        j7.a<String> p11 = this.f54123i.p(str, e11, !z13);
        l lVar2 = this.f54123i;
        if (bVar2 == null) {
            cVar2 = cVar;
            f11 = null;
        } else {
            f11 = bVar2.f();
            cVar2 = cVar;
        }
        return new n(p11, lVar2.q(cVar2, f11), this.f54123i.u(str2, bVar2), this.f54123i.r(str3), this.f54123i.v(str4), this.f54123i.s(str5), this.f54123i.t(str6), this.f54123i.o(dVar, d12), J(rVar), z11, H(bVar2 == null ? null : bVar2.d()), I(bVar2 == null ? null : bVar2.f()), N, this.f54123i.m(), this.f54123i.l(), d12, this.f54123i.g(((k) f()).f(), bVar2 != null ? bVar2.c() : null, z12), list2, list3);
    }

    private final PaymentComponentData<CardPaymentMethod> L(CardPaymentMethod cardPaymentMethod, n nVar) {
        PaymentComponentData<CardPaymentMethod> paymentComponentData = new PaymentComponentData<>();
        paymentComponentData.setPaymentMethod(cardPaymentMethod);
        paymentComponentData.setStorePaymentMethod(nVar.o());
        paymentComponentData.setShopperReference(((k) f()).h());
        if (this.f54123i.m()) {
            paymentComponentData.setSocialSecurityNumber(nVar.m().b());
        }
        if (this.f54123i.i(nVar.b())) {
            paymentComponentData.setBillingAddress(b7.a.f7519a.e(nVar.a(), nVar.b()));
        }
        if (F(nVar)) {
            paymentComponentData.setInstallments(b7.f.f7525a.d(nVar.i().b()));
        }
        return paymentComponentData;
    }

    private final j M(r7.c cVar, n nVar, String str, x6.a aVar, String str2) {
        String str3;
        String str4;
        String j12;
        vz.b0 b0Var;
        CardPaymentMethod cardPaymentMethod = new CardPaymentMethod();
        cardPaymentMethod.setType(CardPaymentMethod.PAYMENT_METHOD_TYPE);
        if (!G()) {
            cardPaymentMethod.setEncryptedCardNumber(cVar.a());
            cardPaymentMethod.setEncryptedExpiryMonth(cVar.b());
            cardPaymentMethod.setEncryptedExpiryYear(cVar.c());
        } else {
            e7.k kVar = this.f25914a;
            Objects.requireNonNull(kVar, "null cannot be cast to non-null type com.adyen.checkout.card.StoredCardDelegate");
            cardPaymentMethod.setStoredPaymentMethodId(((c0) kVar).w());
        }
        if (!this.f54123i.j()) {
            cardPaymentMethod.setEncryptedSecurityCode(cVar.d());
        }
        if (this.f54123i.k()) {
            cardPaymentMethod.setHolderName(nVar.g().b());
        }
        if (this.f54123i.l()) {
            String str5 = this.f54126l;
            if (str5 == null) {
                b0Var = null;
            } else {
                cardPaymentMethod.setEncryptedPassword(r7.d.b("password", nVar.k().b(), str5));
                b0Var = vz.b0.f54756a;
            }
            if (b0Var != null) {
                cardPaymentMethod.setTaxNumber(nVar.j().b());
            } else {
                throw new CheckoutException("Encryption failed because public key cannot be found.");
            }
        }
        if (E(nVar)) {
            for (x6.b bVar : nVar.e()) {
                if (bVar.h()) {
                    cardPaymentMethod.setBrand(bVar.c().getTxVariant());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        cardPaymentMethod.setFundingSource(this.f54123i.f());
        try {
            cardPaymentMethod.setThreeDS2SdkVersion(ThreeDS2Service.INSTANCE.getSDKVersion());
        } catch (ClassNotFoundException unused) {
            str4 = g.f54140a;
            o7.b.c(str4, "threeDS2SdkVersion not set because 3DS2 SDK is not present in project.");
        } catch (NoClassDefFoundError unused2) {
            str3 = g.f54140a;
            o7.b.c(str3, "threeDS2SdkVersion not set because 3DS2 SDK is not present in project.");
        }
        PaymentComponentData<CardPaymentMethod> L = L(cardPaymentMethod, nVar);
        j12 = kotlin.text.y.j1(str, 4);
        return new j(L, true, true, aVar, str2, j12);
    }

    private final List<x6.b> N(List<x6.b> list, int i11) {
        int t11;
        if (list.size() <= 1) {
            return list;
        }
        t11 = wz.x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                wz.w.s();
            }
            x6.b bVar = (x6.b) obj;
            if (i12 == i11) {
                bVar = x6.b.b(bVar, null, false, false, null, null, false, true, 63, null);
            }
            arrayList.add(bVar);
            i12 = i13;
        }
        return arrayList;
    }

    private final void P(v vVar) {
        v20.k.d(q0.a(this), null, null, new e(vVar, this, null), 3, null);
    }

    private final void R(v vVar) {
        kotlinx.coroutines.flow.g.z(kotlinx.coroutines.flow.g.B(kotlinx.coroutines.flow.g.k(vVar.B()), new C1220f(null)), q0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e7.e
    /* renamed from: C */
    public j mo232h() {
        String str;
        String i12;
        str = g.f54140a;
        o7.b.f(str, "createComponentState");
        n i11 = i();
        if (i11 != null) {
            String b11 = i11.c().b();
            x6.b bVar = (x6.b) wz.u.d0(i11.e());
            x6.a c11 = bVar == null ? null : bVar.c();
            i12 = kotlin.text.y.i1(b11, 6);
            String str2 = this.f54126l;
            boolean z11 = true;
            if (i11.p() && str2 != null) {
                e.a aVar = new e.a();
                try {
                    if (!G()) {
                        aVar.f(i11.c().b());
                    }
                    if (!this.f54123i.j()) {
                        String b12 = i11.l().b();
                        if (b12.length() <= 0) {
                            z11 = false;
                        }
                        if (z11) {
                            aVar.c(b12);
                        }
                    }
                    x6.c b13 = i11.f().b();
                    if (b13.b() != 0 && b13.a() != 0) {
                        aVar.d(String.valueOf(b13.a()));
                        aVar.e(String.valueOf(b13.b()));
                    }
                    r7.c b14 = r7.a.b(aVar.a(), str2);
                    kotlin.jvm.internal.s.f(b14, "{\n            if (!isStoredPaymentMethod()) {\n                unencryptedCardBuilder.setNumber(stateOutputData.cardNumberState.value)\n            }\n            if (!cardDelegate.isCvcHidden()) {\n                val cvc = stateOutputData.securityCodeState.value\n                if (cvc.isNotEmpty()) unencryptedCardBuilder.setCvc(cvc)\n            }\n            val expiryDateResult = stateOutputData.expiryDateState.value\n            if (expiryDateResult.expiryYear != ExpiryDate.EMPTY_VALUE && expiryDateResult.expiryMonth != ExpiryDate.EMPTY_VALUE) {\n                unencryptedCardBuilder.setExpiryMonth(expiryDateResult.expiryMonth.toString())\n                unencryptedCardBuilder.setExpiryYear(expiryDateResult.expiryYear.toString())\n            }\n\n            CardEncrypter.encryptFields(unencryptedCardBuilder.build(), publicKey)\n        }");
                    return M(b14, i11, b11, c11, i12);
                } catch (EncryptionException e11) {
                    m(e11);
                    return new j(new PaymentComponentData(), false, true, c11, i12, null);
                }
            }
            return new j(new PaymentComponentData(), i11.p(), str2 != null, c11, i12, null);
        }
        throw new CheckoutException("Cannot create state with null outputData");
    }

    public final m D() {
        return this.f54125k;
    }

    public final boolean E(n cardOutputData) {
        boolean z11;
        kotlin.jvm.internal.s.g(cardOutputData, "cardOutputData");
        List<x6.b> e11 = cardOutputData.e();
        ArrayList<x6.b> arrayList = new ArrayList();
        for (Object obj : e11) {
            if (((x6.b) obj).g()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            if (!arrayList.isEmpty()) {
                for (x6.b bVar : arrayList) {
                    if (bVar.h()) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            return z11;
        }
        return false;
    }

    public final boolean G() {
        return this.f54123i instanceof c0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e7.e
    /* renamed from: O */
    public n s(m inputData) {
        String str;
        kotlin.jvm.internal.s.g(inputData, "inputData");
        str = g.f54140a;
        o7.b.f(str, "onInputDataChanged");
        List<x6.b> b11 = this.f54123i.b(inputData.b(), this.f54126l, q0.a(this));
        l lVar = this.f54123i;
        if (lVar instanceof v) {
            ((v) lVar).D(inputData.a().c(), q0.a(this));
        }
        String b12 = inputData.b();
        x6.c c11 = inputData.c();
        String h11 = inputData.h();
        String d11 = inputData.d();
        String j11 = inputData.j();
        String f11 = inputData.f();
        String g11 = inputData.g();
        v6.d a11 = inputData.a();
        boolean k11 = inputData.k();
        int i11 = inputData.i();
        r e11 = inputData.e();
        b7.a aVar = b7.a.f7519a;
        n i12 = i();
        List<a7.a> d12 = i12 == null ? null : i12.d();
        if (d12 == null) {
            d12 = wz.w.i();
        }
        List<a7.a> h12 = aVar.h(d12, inputData.a().c());
        n i13 = i();
        List<a7.a> n11 = i13 != null ? i13.n() : null;
        if (n11 == null) {
            n11 = wz.w.i();
        }
        return K(b12, c11, h11, d11, j11, f11, g11, a11, k11, b11, i11, e11, h12, aVar.h(n11, inputData.a().f()));
    }

    public boolean Q() {
        return this.f54123i.n();
    }

    @Override // c7.f
    public String[] e() {
        return f54122m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(l0 savedStateHandle, c0 storedCardDelegate, k cardConfiguration) {
        this(savedStateHandle, (l) storedCardDelegate, cardConfiguration);
        kotlin.jvm.internal.s.g(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.s.g(storedCardDelegate, "storedCardDelegate");
        kotlin.jvm.internal.s.g(cardConfiguration, "cardConfiguration");
        storedCardDelegate.x(this.f54125k);
        if (Q()) {
            return;
        }
        j(this.f54125k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(l0 savedStateHandle, v cardDelegate, k cardConfiguration) {
        this(savedStateHandle, (l) cardDelegate, cardConfiguration);
        kotlin.jvm.internal.s.g(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.s.g(cardDelegate, "cardDelegate");
        kotlin.jvm.internal.s.g(cardConfiguration, "cardConfiguration");
    }
}