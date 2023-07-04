package com.stripe.android.ui.core.forms.resources;

import a00.b;
import android.content.res.Resources;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.ui.core.address.AddressFieldElementRepository;
import h00.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.a2;
import v20.i;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.r;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class AsyncResourceRepository implements ResourceRepository {
    public static final int $stable = 8;
    private AddressFieldElementRepository addressRepository;
    private final List<a2> loadingJobs;
    private final Locale locale;
    private final LpmRepository lpmRepository;
    private final Resources resources;
    private final g workContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$1", f = "AsyncResourceRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$1 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            AsyncResourceRepository.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.d();
            if (this.label == 0) {
                r.b(obj);
                AsyncResourceRepository.this.addressRepository = new AddressFieldElementRepository(AsyncResourceRepository.this.resources);
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$2", f = "AsyncResourceRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$2 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends l implements p<o0, d<? super b0>, Object> {
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            AsyncResourceRepository.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.d();
            if (this.label == 0) {
                r.b(obj);
                CountryUtils countryUtils = CountryUtils.INSTANCE;
                Locale locale = AsyncResourceRepository.this.locale;
                if (locale == null) {
                    locale = Locale.US;
                }
                s.f(locale, "locale ?: Locale.US");
                countryUtils.getOrderedCountries(locale);
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AsyncResourceRepository(Resources resources, @IOContext g workContext, Locale locale) {
        s.g(resources, "resources");
        s.g(workContext, "workContext");
        this.resources = resources;
        this.workContext = workContext;
        this.locale = locale;
        this.lpmRepository = new LpmRepository();
        ArrayList arrayList = new ArrayList();
        this.loadingJobs = arrayList;
        arrayList.add(i.d(p0.a(workContext), null, null, new AnonymousClass1(null), 3, null));
        arrayList.add(i.d(p0.a(workContext), null, null, new AnonymousClass2(null), 3, null));
    }

    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    public AddressFieldElementRepository getAddressRepository() {
        AddressFieldElementRepository addressFieldElementRepository = this.addressRepository;
        if (addressFieldElementRepository == null) {
            s.x("addressRepository");
            return null;
        }
        return addressFieldElementRepository;
    }

    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    public LpmRepository getLpmRepository() {
        return this.lpmRepository;
    }

    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    public boolean isLoaded() {
        return this.loadingJobs.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    @Override // com.stripe.android.ui.core.forms.resources.ResourceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object waitUntilLoaded(zz.d<? super vz.b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$waitUntilLoaded$1
            if (r0 == 0) goto L13
            r0 = r5
            com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$waitUntilLoaded$1 r0 = (com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$waitUntilLoaded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$waitUntilLoaded$1 r0 = new com.stripe.android.ui.core.forms.resources.AsyncResourceRepository$waitUntilLoaded$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.stripe.android.ui.core.forms.resources.AsyncResourceRepository r0 = (com.stripe.android.ui.core.forms.resources.AsyncResourceRepository) r0
            vz.r.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            vz.r.b(r5)
            java.util.List<v20.a2> r5 = r4.loadingJobs
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = v20.e.a(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.util.List<v20.a2> r5 = r0.loadingJobs
            r5.clear()
            vz.b0 r5 = vz.b0.f54756a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.forms.resources.AsyncResourceRepository.waitUntilLoaded(zz.d):java.lang.Object");
    }
}