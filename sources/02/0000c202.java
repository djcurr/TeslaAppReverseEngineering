package y6;

import com.adyen.checkout.card.api.model.BinLookupRequest;
import com.adyen.checkout.card.api.model.BinLookupResponse;
import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.cse.exception.EncryptionException;
import h00.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.y;
import v20.e1;
import v20.i;
import v20.j0;
import v20.o0;
import v20.p0;
import v20.v0;
import v6.k;
import vz.b0;
import vz.r;
import wz.w;
import wz.x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, List<x6.b>> f59221a = new HashMap<>();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.adyen.checkout.card.repository.BinLookupRepository", f = "BinLookupRepository.kt", l = {65}, m = "fetch")
    /* renamed from: y6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1350b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f59222a;

        /* renamed from: b  reason: collision with root package name */
        Object f59223b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f59224c;

        /* renamed from: e  reason: collision with root package name */
        int f59226e;

        C1350b(zz.d<? super C1350b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59224c = obj;
            this.f59226e |= Integer.MIN_VALUE;
            return b.this.b(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.adyen.checkout.card.repository.BinLookupRepository$makeBinLookup$2", f = "BinLookupRepository.kt", l = {80, 121}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<o0, zz.d<? super BinLookupResponse>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59227a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59228b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f59229c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59230d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59231e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "com.adyen.checkout.card.repository.BinLookupRepository$makeBinLookup$2$deferredEncryption$1", f = "BinLookupRepository.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements p<o0, zz.d<? super String>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59232a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f59233b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f59234c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f59233b = str;
                this.f59234c = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f59233b, this.f59234c, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super String> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f59232a == 0) {
                    r.b(obj);
                    return r7.a.a(this.f59233b, this.f59234c);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @f(c = "com.adyen.checkout.components.api.ConnectionExtKt$suspendedCall$2", f = "ConnectionExt.kt", l = {}, m = "invokeSuspend")
        /* renamed from: y6.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1351b extends l implements p<o0, zz.d<? super BinLookupResponse>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59235a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.adyen.checkout.core.api.b f59236b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1351b(com.adyen.checkout.core.api.b bVar, zz.d dVar) {
                super(2, dVar);
                this.f59236b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new C1351b(this.f59236b, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super BinLookupResponse> dVar) {
                return ((C1351b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f59235a == 0) {
                    r.b(obj);
                    return this.f59236b.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar, String str, String str2, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f59229c = kVar;
            this.f59230d = str;
            this.f59231e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(this.f59229c, this.f59230d, this.f59231e, dVar);
            cVar.f59228b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super BinLookupResponse> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            String str;
            String str2;
            v0 b11;
            int t11;
            d11 = a00.d.d();
            int i11 = this.f59227a;
            try {
                if (i11 == 0) {
                    r.b(obj);
                    b11 = v20.k.b((o0) this.f59228b, e1.a(), null, new a(this.f59230d, this.f59231e, null), 2, null);
                    this.f59227a = 1;
                    obj = b11.u0(this);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    if (i11 == 2) {
                        r.b(obj);
                        return (BinLookupResponse) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    r.b(obj);
                }
                s.f(obj, "deferredEncryption.await()");
                String str3 = (String) obj;
                List<x6.a> j11 = this.f59229c.j();
                s.f(j11, "cardConfiguration.supportedCardTypes");
                t11 = x.t(j11, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (x6.a aVar : j11) {
                    arrayList.add(aVar.getTxVariant());
                }
                w6.d dVar = new w6.d(new BinLookupRequest(str3, UUID.randomUUID().toString(), arrayList), this.f59229c.b(), this.f59229c.a());
                j0 b12 = e1.b();
                C1351b c1351b = new C1351b(dVar, null);
                this.f59227a = 2;
                obj = i.g(b12, c1351b, this);
                if (obj == d11) {
                    return d11;
                }
                return (BinLookupResponse) obj;
            } catch (EncryptionException e11) {
                str2 = y6.c.f59237a;
                o7.b.d(str2, "checkCardType - Failed to encrypt BIN", e11);
                return null;
            } catch (IOException e12) {
                str = y6.c.f59237a;
                o7.b.d(str, "checkCardType - Failed to call binLookup API.", e12);
                return null;
            }
        }
    }

    static {
        new a(null);
    }

    private final String d(String str) {
        String i12;
        n7.a aVar = n7.a.f40680a;
        i12 = y.i1(str, 11);
        return aVar.b(i12);
    }

    private final Object f(String str, String str2, k kVar, zz.d<? super BinLookupResponse> dVar) {
        return p0.e(new c(kVar, str, str2, null), dVar);
    }

    private final List<x6.b> g(BinLookupResponse binLookupResponse) {
        String str;
        String str2;
        x6.b bVar;
        str = y6.c.f59237a;
        o7.b.a(str, "handleBinLookupResponse");
        str2 = y6.c.f59237a;
        o7.b.f(str2, s.p("Brands: ", binLookupResponse == null ? null : binLookupResponse.getBrands()));
        List<Brand> brands = binLookupResponse == null ? null : binLookupResponse.getBrands();
        if (brands == null) {
            brands = w.i();
        }
        ArrayList arrayList = new ArrayList();
        for (Brand brand : brands) {
            if (brand.getBrand() == null) {
                bVar = null;
            } else {
                x6.a byBrandName = x6.a.getByBrandName(brand.getBrand());
                if (byBrandName == null) {
                    byBrandName = x6.a.UNKNOWN;
                    byBrandName.setTxVariant(brand.getBrand());
                }
                x6.a aVar = byBrandName;
                s.f(aVar, "CardType.getByBrandName(brandResponse.brand) ?: CardType.UNKNOWN.apply { txVariant = brandResponse.brand }");
                boolean c11 = s.c(brand.getEnableLuhnCheck(), Boolean.TRUE);
                Brand.c.a aVar2 = Brand.c.Companion;
                String cvcPolicy = brand.getCvcPolicy();
                if (cvcPolicy == null) {
                    cvcPolicy = Brand.c.REQUIRED.getValue();
                }
                Brand.c a11 = aVar2.a(cvcPolicy);
                String expiryDatePolicy = brand.getExpiryDatePolicy();
                if (expiryDatePolicy == null) {
                    expiryDatePolicy = Brand.c.REQUIRED.getValue();
                }
                bVar = new x6.b(aVar, true, c11, a11, aVar2.a(expiryDatePolicy), !s.c(brand.getSupported(), Boolean.FALSE), false, 64, null);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final boolean a(String cardNumber) {
        s.g(cardNumber, "cardNumber");
        if (e(cardNumber)) {
            return this.f59221a.containsKey(d(cardNumber));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, v6.k r7, zz.d<? super java.util.List<x6.b>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof y6.b.C1350b
            if (r0 == 0) goto L13
            r0 = r8
            y6.b$b r0 = (y6.b.C1350b) r0
            int r1 = r0.f59226e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59226e = r1
            goto L18
        L13:
            y6.b$b r0 = new y6.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f59224c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f59226e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f59223b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.f59222a
            y6.b r6 = (y6.b) r6
            vz.r.b(r8)
            goto L4a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            vz.r.b(r8)
            r0.f59222a = r4
            r0.f59223b = r5
            r0.f59226e = r3
            java.lang.Object r8 = r4.f(r5, r6, r7, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            r6 = r4
        L4a:
            com.adyen.checkout.card.api.model.BinLookupResponse r8 = (com.adyen.checkout.card.api.model.BinLookupResponse) r8
            java.util.List r7 = r6.g(r8)
            java.util.HashMap<java.lang.String, java.util.List<x6.b>> r8 = r6.f59221a
            java.lang.String r5 = r6.d(r5)
            r8.put(r5, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.b.b(java.lang.String, java.lang.String, v6.k, zz.d):java.lang.Object");
    }

    public final List<x6.b> c(String cardNumber) {
        s.g(cardNumber, "cardNumber");
        if (e(cardNumber)) {
            List<x6.b> list = this.f59221a.get(d(cardNumber));
            if (list != null) {
                return list;
            }
            throw new IllegalArgumentException("BinLookupRepository does not contain card number");
        }
        throw new IllegalArgumentException("Card number too small card number");
    }

    public final boolean e(String cardNumber) {
        s.g(cardNumber, "cardNumber");
        return cardNumber.length() >= 11;
    }
}