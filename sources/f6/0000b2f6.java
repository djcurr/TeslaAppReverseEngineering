package sv;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.g;
import nr.n;
import vz.b0;

/* loaded from: classes6.dex */
public final class e implements n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f50695b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50696c;

    /* renamed from: d  reason: collision with root package name */
    private final sv.b f50697d;

    /* renamed from: e  reason: collision with root package name */
    private final sv.c f50698e;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final sv.c f50699a;

        public a(sv.c service) {
            s.g(service, "service");
            this.f50699a = service;
        }

        public final e a(String sessionToken, String verificationToken, sv.b form) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            s.g(form, "form");
            return new e(sessionToken, verificationToken, form, this.f50699a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f50700a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: sv.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1130b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1130b f50701a = new C1130b();

            private C1130b() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.database.network.UpdateVerificationWorker$run$1", f = "UpdateVerificationWorker.kt", l = {20, 27, 30, 37, 39}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50702a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f50703b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f50703b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r13.f50702a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L3f
                if (r1 == r6) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L26
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L21:
                vz.r.b(r14)
                goto Lcb
            L26:
                java.lang.Object r1 = r13.f50703b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r14)
                goto La9
            L2f:
                java.lang.Object r1 = r13.f50703b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r14)
                goto L87
            L37:
                java.lang.Object r1 = r13.f50703b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r14)
                goto L72
            L3f:
                vz.r.b(r14)
                java.lang.Object r14 = r13.f50703b
                kotlinx.coroutines.flow.f r14 = (kotlinx.coroutines.flow.f) r14
                sv.e r1 = sv.e.this
                sv.c r1 = sv.e.c(r1)
                sv.e r8 = sv.e.this
                java.lang.String r8 = sv.e.d(r8)
                sv.e r9 = sv.e.this
                java.lang.String r9 = sv.e.e(r9)
                com.withpersona.sdk.inquiry.database.network.UpdateDatabaseVerificationRequest$a r10 = com.withpersona.sdk.inquiry.database.network.UpdateDatabaseVerificationRequest.f22327b
                sv.e r11 = sv.e.this
                sv.b r11 = sv.e.b(r11)
                com.withpersona.sdk.inquiry.database.network.UpdateDatabaseVerificationRequest r10 = r10.a(r11)
                r13.f50703b = r14
                r13.f50702a = r6
                java.lang.Object r1 = r1.b(r8, r9, r10, r13)
                if (r1 != r0) goto L6f
                return r0
            L6f:
                r12 = r1
                r1 = r14
                r14 = r12
            L72:
                retrofit2.s r14 = (retrofit2.s) r14
                boolean r14 = r14.f()
                if (r14 != 0) goto L87
                sv.e$b$a r14 = sv.e.b.a.f50700a
                r13.f50703b = r1
                r13.f50702a = r5
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto L87
                return r0
            L87:
                sv.e r14 = sv.e.this
                sv.c r14 = sv.e.c(r14)
                sv.e r5 = sv.e.this
                java.lang.String r5 = sv.e.d(r5)
                sv.e r8 = sv.e.this
                java.lang.String r8 = sv.e.e(r8)
                com.withpersona.sdk.inquiry.database.network.SubmitDatabaseVerificationRequest r9 = new com.withpersona.sdk.inquiry.database.network.SubmitDatabaseVerificationRequest
                r9.<init>(r7, r6, r7)
                r13.f50703b = r1
                r13.f50702a = r4
                java.lang.Object r14 = r14.d(r5, r8, r9, r13)
                if (r14 != r0) goto La9
                return r0
            La9:
                retrofit2.s r14 = (retrofit2.s) r14
                boolean r14 = r14.f()
                if (r14 == 0) goto Lbe
                sv.e$b$b r14 = sv.e.b.C1130b.f50701a
                r13.f50703b = r7
                r13.f50702a = r3
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto Lcb
                return r0
            Lbe:
                sv.e$b$a r14 = sv.e.b.a.f50700a
                r13.f50703b = r7
                r13.f50702a = r2
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto Lcb
                return r0
            Lcb:
                vz.b0 r14 = vz.b0.f54756a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: sv.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(String sessionToken, String verificationToken, sv.b form, sv.c service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(form, "form");
        s.g(service, "service");
        this.f50695b = sessionToken;
        this.f50696c = verificationToken;
        this.f50697d = form;
        this.f50698e = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof e) && s.c(this.f50696c, ((e) otherWorker).f50696c);
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new c(null));
    }
}