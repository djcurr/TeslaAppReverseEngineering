package y6;

import com.adyen.checkout.card.api.model.AddressItem;
import h00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f59215a;

    /* renamed from: y6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1349a {
        private C1349a() {
        }

        public /* synthetic */ C1349a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.adyen.checkout.components.api.ConnectionExtKt$suspendedCall$2", f = "ConnectionExt.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<o0, d<? super List<? extends AddressItem>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.adyen.checkout.core.api.b f59217b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.adyen.checkout.core.api.b bVar, d dVar) {
            super(2, dVar);
            this.f59217b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new b(this.f59217b, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super List<? extends AddressItem>> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f59216a == 0) {
                r.b(obj);
                return this.f59217b.call();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.adyen.checkout.card.repository.AddressRepository", f = "AddressRepository.kt", l = {47}, m = "getAddressData")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f59218a;

        /* renamed from: c  reason: collision with root package name */
        int f59220c;

        c(d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59218a = obj;
            this.f59220c |= Integer.MIN_VALUE;
            return a.this.a(null, null, null, null, this);
        }
    }

    static {
        new C1349a(null);
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f59215a = c11;
    }

    public static /* synthetic */ Object b(a aVar, com.adyen.checkout.core.api.d dVar, w6.c cVar, String str, String str2, d dVar2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return aVar.a(dVar, cVar, str, str2, dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.adyen.checkout.core.api.d r6, w6.c r7, java.lang.String r8, java.lang.String r9, zz.d<? super java.util.List<com.adyen.checkout.card.api.model.AddressItem>> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof y6.a.c
            if (r0 == 0) goto L13
            r0 = r10
            y6.a$c r0 = (y6.a.c) r0
            int r1 = r0.f59220c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59220c = r1
            goto L18
        L13:
            y6.a$c r0 = new y6.a$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f59218a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f59220c
            java.lang.String r3 = "Unable to get address data."
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            vz.r.b(r10)     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            vz.r.b(r10)
            java.lang.String r10 = y6.a.f59215a
            java.lang.String r2 = "getting address data"
            o7.b.a(r10, r2)
            w6.a r10 = new w6.a     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            r10.<init>(r6, r7, r8, r9)     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            v20.j0 r6 = v20.e1.b()     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            y6.a$b r7 = new y6.a$b     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            r8 = 0
            r7.<init>(r10, r8)     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            r0.f59220c = r4     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            java.lang.Object r10 = v20.i.g(r6, r7, r0)     // Catch: org.json.JSONException -> L56 java.io.IOException -> L63
            if (r10 != r1) goto L55
            return r1
        L55:
            return r10
        L56:
            java.lang.String r6 = y6.a.f59215a
            java.lang.String r7 = "AddressConnection unexpected result"
            o7.b.c(r6, r7)
            com.adyen.checkout.core.exception.CheckoutException r6 = new com.adyen.checkout.core.exception.CheckoutException
            r6.<init>(r3)
            throw r6
        L63:
            java.lang.String r6 = y6.a.f59215a
            java.lang.String r7 = "AddressConnection Failed"
            o7.b.c(r6, r7)
            com.adyen.checkout.core.exception.CheckoutException r6 = new com.adyen.checkout.core.exception.CheckoutException
            r6.<init>(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.a(com.adyen.checkout.core.api.d, w6.c, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }
}