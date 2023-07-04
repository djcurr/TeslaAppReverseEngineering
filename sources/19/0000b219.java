package s6;

import com.adyen.checkout.adyen3ds2.model.SubmitFingerprintResponse;
import h00.p;
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
    private static final String f50290a;

    /* renamed from: s6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1114a {
        private C1114a() {
        }

        public /* synthetic */ C1114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.adyen.checkout.components.api.ConnectionExtKt$suspendedCall$2", f = "ConnectionExt.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<o0, d<? super SubmitFingerprintResponse>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.adyen.checkout.core.api.b f50292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.adyen.checkout.core.api.b bVar, d dVar) {
            super(2, dVar);
            this.f50292b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new b(this.f50292b, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super SubmitFingerprintResponse> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f50291a == 0) {
                r.b(obj);
                return this.f50292b.call();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.adyen.checkout.adyen3ds2.repository.SubmitFingerprintRepository", f = "SubmitFingerprintRepository.kt", l = {66}, m = "submitFingerprint")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f50293a;

        /* renamed from: c  reason: collision with root package name */
        int f50295c;

        c(d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50293a = obj;
            this.f50295c |= Integer.MIN_VALUE;
            return a.this.a(null, null, null, this);
        }
    }

    static {
        new C1114a(null);
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f50290a = c11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, p6.c r6, java.lang.String r7, zz.d<? super s6.b> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof s6.a.c
            if (r0 == 0) goto L13
            r0 = r8
            s6.a$c r0 = (s6.a.c) r0
            int r1 = r0.f50295c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50295c = r1
            goto L18
        L13:
            s6.a$c r0 = new s6.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f50293a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f50295c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r8)
            goto L60
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r8)
            java.lang.String r8 = s6.a.f50290a
            java.lang.String r2 = "Submitting fingerprint automatically"
            o7.b.a(r8, r2)
            com.adyen.checkout.adyen3ds2.model.SubmitFingerprintRequest r8 = new com.adyen.checkout.adyen3ds2.model.SubmitFingerprintRequest
            r8.<init>(r5, r7)
            q6.a r5 = new q6.a
            com.adyen.checkout.core.api.d r7 = r6.b()
            java.lang.String r6 = r6.a()
            r5.<init>(r8, r7, r6)
            v20.j0 r6 = v20.e1.b()
            s6.a$b r7 = new s6.a$b
            r8 = 0
            r7.<init>(r5, r8)
            r0.f50295c = r3
            java.lang.Object r8 = v20.i.g(r6, r7, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            com.adyen.checkout.adyen3ds2.model.SubmitFingerprintResponse r8 = (com.adyen.checkout.adyen3ds2.model.SubmitFingerprintResponse) r8
            java.lang.String r5 = r8.getType()
            java.lang.String r6 = "completed"
            boolean r5 = kotlin.jvm.internal.s.c(r5, r6)
            if (r5 == 0) goto L8a
            java.lang.String r5 = r8.getDetails()
            if (r5 == 0) goto L8a
            java.lang.String r5 = s6.a.f50290a
            java.lang.String r6 = "submitFingerprint: challenge completed"
            o7.b.a(r5, r6)
            s6.b$a r5 = new s6.b$a
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r7 = r8.getDetails()
            r6.<init>(r7)
            r5.<init>(r6)
            goto Ld5
        L8a:
            java.lang.String r5 = r8.getType()
            java.lang.String r6 = "action"
            boolean r5 = kotlin.jvm.internal.s.c(r5, r6)
            if (r5 == 0) goto Lb1
            com.adyen.checkout.components.model.payments.response.Action r5 = r8.getAction()
            boolean r5 = r5 instanceof com.adyen.checkout.components.model.payments.response.RedirectAction
            if (r5 == 0) goto Lb1
            java.lang.String r5 = s6.a.f50290a
            java.lang.String r6 = "submitFingerprint: received new RedirectAction"
            o7.b.a(r5, r6)
            s6.b$b r5 = new s6.b$b
            com.adyen.checkout.components.model.payments.response.Action r6 = r8.getAction()
            com.adyen.checkout.components.model.payments.response.RedirectAction r6 = (com.adyen.checkout.components.model.payments.response.RedirectAction) r6
            r5.<init>(r6)
            goto Ld5
        Lb1:
            java.lang.String r5 = r8.getType()
            boolean r5 = kotlin.jvm.internal.s.c(r5, r6)
            if (r5 == 0) goto Ld6
            com.adyen.checkout.components.model.payments.response.Action r5 = r8.getAction()
            boolean r5 = r5 instanceof com.adyen.checkout.components.model.payments.response.Threeds2Action
            if (r5 == 0) goto Ld6
            java.lang.String r5 = s6.a.f50290a
            java.lang.String r6 = "submitFingerprint: received new Threeds2Action"
            o7.b.a(r5, r6)
            s6.b$c r5 = new s6.b$c
            com.adyen.checkout.components.model.payments.response.Action r6 = r8.getAction()
            com.adyen.checkout.components.model.payments.response.Threeds2Action r6 = (com.adyen.checkout.components.model.payments.response.Threeds2Action) r6
            r5.<init>(r6)
        Ld5:
            return r5
        Ld6:
            java.lang.String r5 = s6.a.f50290a
            java.lang.String r6 = "submitFingerprint: unexpected response "
            java.lang.String r6 = kotlin.jvm.internal.s.p(r6, r8)
            o7.b.c(r5, r6)
            com.adyen.checkout.core.exception.ComponentException r5 = new com.adyen.checkout.core.exception.ComponentException
            java.lang.String r6 = "Failed to retrieve 3DS2 fingerprint result"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.a(java.lang.String, p6.c, java.lang.String, zz.d):java.lang.Object");
    }
}