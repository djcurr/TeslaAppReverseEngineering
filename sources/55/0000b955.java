package v6;

import android.util.LruCache;
import com.adyen.checkout.card.api.model.AddressItem;
import com.adyen.checkout.card.ui.AddressFormInput;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.j0;
import v20.o0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static final List<AddressFormInput.b> f54089e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f54090f;

    /* renamed from: a  reason: collision with root package name */
    private final y6.a f54091a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.coroutines.flow.u<List<AddressItem>> f54092b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.coroutines.flow.e<List<AddressItem>> f54093c;

    /* renamed from: d  reason: collision with root package name */
    private final LruCache<String, List<AddressItem>> f54094d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.card.AddressDelegate", f = "AddressDelegate.kt", l = {60}, m = "getCountryList")
    /* renamed from: v6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1218b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f54095a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f54096b;

        /* renamed from: d  reason: collision with root package name */
        int f54098d;

        C1218b(zz.d<? super C1218b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54096b = obj;
            this.f54098d |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.card.AddressDelegate$getStateList$2", f = "AddressDelegate.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54099a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e7.f f54101c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54102d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e7.f fVar, String str, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f54101c = fVar;
            this.f54102d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(this.f54101c, this.f54102d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f54099a;
            if (i11 == 0) {
                vz.r.b(obj);
                y6.a aVar = b.this.f54091a;
                com.adyen.checkout.core.api.d b11 = this.f54101c.b();
                w6.c cVar = w6.c.STATE;
                String languageTag = this.f54101c.c().toLanguageTag();
                kotlin.jvm.internal.s.f(languageTag, "configuration.shopperLocale.toLanguageTag()");
                String str = this.f54102d;
                this.f54099a = 1;
                obj = aVar.a(b11, cVar, languageTag, str, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                b.this.f54094d.put(this.f54102d, list);
            }
            b.this.f54092b.b(list);
            return vz.b0.f54756a;
        }
    }

    static {
        List<AddressFormInput.b> l11;
        new a(null);
        l11 = wz.w.l(AddressFormInput.b.BR, AddressFormInput.b.CA, AddressFormInput.b.US);
        f54089e = l11;
        f54090f = l11.size() + 1;
    }

    public b(y6.a addressRepository) {
        List i11;
        kotlin.jvm.internal.s.g(addressRepository, "addressRepository");
        this.f54091a = addressRepository;
        i11 = wz.w.i();
        kotlinx.coroutines.flow.u<List<AddressItem>> a11 = j0.a(i11);
        this.f54092b = a11;
        this.f54093c = a11;
        this.f54094d = new LruCache<>(f54090f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(e7.f r12, zz.d<? super java.util.List<com.adyen.checkout.card.api.model.AddressItem>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof v6.b.C1218b
            if (r0 == 0) goto L13
            r0 = r13
            v6.b$b r0 = (v6.b.C1218b) r0
            int r1 = r0.f54098d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54098d = r1
            goto L18
        L13:
            v6.b$b r0 = new v6.b$b
            r0.<init>(r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.f54096b
            java.lang.Object r0 = a00.b.d()
            int r1 = r6.f54098d
            java.lang.String r9 = "countries"
            r10 = 1
            if (r1 == 0) goto L38
            if (r1 != r10) goto L30
            java.lang.Object r12 = r6.f54095a
            v6.b r12 = (v6.b) r12
            vz.r.b(r13)
            goto L6a
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            vz.r.b(r13)
            android.util.LruCache<java.lang.String, java.util.List<com.adyen.checkout.card.api.model.AddressItem>> r13 = r11.f54094d
            java.lang.Object r13 = r13.get(r9)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L78
            y6.a r1 = r11.f54091a
            com.adyen.checkout.core.api.d r2 = r12.b()
            w6.c r3 = w6.c.COUNTRY
            java.util.Locale r12 = r12.c()
            java.lang.String r4 = r12.toLanguageTag()
            java.lang.String r12 = "configuration.shopperLocale.toLanguageTag()"
            kotlin.jvm.internal.s.f(r4, r12)
            r5 = 0
            r7 = 8
            r8 = 0
            r6.f54095a = r11
            r6.f54098d = r10
            java.lang.Object r13 = y6.a.b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L69
            return r0
        L69:
            r12 = r11
        L6a:
            java.util.List r13 = (java.util.List) r13
            boolean r0 = r13.isEmpty()
            r0 = r0 ^ r10
            if (r0 == 0) goto L78
            android.util.LruCache<java.lang.String, java.util.List<com.adyen.checkout.card.api.model.AddressItem>> r12 = r12.f54094d
            r12.put(r9, r13)
        L78:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.b.d(e7.f, zz.d):java.lang.Object");
    }

    public final void e(e7.f configuration, String str, o0 coroutineScope) {
        List<AddressItem> i11;
        kotlin.jvm.internal.s.g(configuration, "configuration");
        kotlin.jvm.internal.s.g(coroutineScope, "coroutineScope");
        boolean contains = f54089e.contains(AddressFormInput.b.Companion.a(str));
        if (!(str == null || str.length() == 0) && contains) {
            List<AddressItem> list = this.f54094d.get(str);
            if ((list == null ? null : Boolean.valueOf(this.f54092b.b(list))) == null) {
                v20.k.d(coroutineScope, null, null, new c(configuration, str, null), 3, null);
                return;
            }
            return;
        }
        kotlinx.coroutines.flow.u<List<AddressItem>> uVar = this.f54092b;
        i11 = wz.w.i();
        uVar.b(i11);
    }

    public final kotlinx.coroutines.flow.e<List<AddressItem>> f() {
        return this.f54093c;
    }
}