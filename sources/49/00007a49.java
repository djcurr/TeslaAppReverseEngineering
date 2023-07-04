package iw;

import ch.qos.logback.core.CoreConstants;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.g;
import nr.n;
import vz.b0;

/* loaded from: classes6.dex */
public final class a implements n<c> {

    /* renamed from: b  reason: collision with root package name */
    private final String f32779b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32780c;

    /* renamed from: d  reason: collision with root package name */
    private final iw.b f32781d;

    /* renamed from: iw.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0601a {
        private C0601a() {
        }

        public /* synthetic */ C0601a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final iw.b f32782a;

        public b(iw.b service) {
            s.g(service, "service");
            this.f32782a = service;
        }

        public final a a(String sessionToken, String verificationToken) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            return new a(sessionToken, verificationToken, this.f32782a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* renamed from: iw.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0602a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0602a f32783a = new C0602a();

            private C0602a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f32784a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String status) {
                super(null);
                s.g(status, "status");
                this.f32784a = status;
            }

            public final String a() {
                return this.f32784a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.c(this.f32784a, ((b) obj).f32784a);
            }

            public int hashCode() {
                return this.f32784a.hashCode();
            }

            public String toString() {
                return "Success(status=" + this.f32784a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.selfie.network.CheckVerificationWorker$run$1", f = "CheckVerificationWorker.kt", l = {21, 27, 29, 33}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class d extends l implements p<kotlinx.coroutines.flow.f<? super c>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32785a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f32786b;

        d(zz.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f32786b = obj;
            return dVar2;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super c> fVar, zz.d<? super b0> dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00aa -> B:16:0x0049). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r10.f32785a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L40
                if (r1 == r5) goto L35
                if (r1 == r4) goto L29
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r10.f32786b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r11)
                goto L48
            L1c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L24:
                vz.r.b(r11)
                goto Lbc
            L29:
                java.lang.Object r1 = r10.f32786b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r11)
                r6 = r1
                r1 = r0
                r0 = r10
                goto L9d
            L35:
                java.lang.Object r1 = r10.f32786b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r11)
                r6 = r1
                r1 = r0
                r0 = r10
                goto L6b
            L40:
                vz.r.b(r11)
                java.lang.Object r11 = r10.f32786b
                kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.f) r11
                r1 = r11
            L48:
                r11 = r10
            L49:
                iw.a r6 = iw.a.this
                iw.b r6 = iw.a.b(r6)
                iw.a r7 = iw.a.this
                java.lang.String r7 = r7.c()
                iw.a r8 = iw.a.this
                java.lang.String r8 = r8.d()
                r11.f32786b = r1
                r11.f32785a = r5
                java.lang.Object r6 = r6.a(r7, r8, r11)
                if (r6 != r0) goto L66
                return r0
            L66:
                r9 = r0
                r0 = r11
                r11 = r6
                r6 = r1
                r1 = r9
            L6b:
                retrofit2.s r11 = (retrofit2.s) r11
                boolean r7 = r11.f()
                if (r7 == 0) goto Lae
                java.lang.Object r11 = r11.a()
                kotlin.jvm.internal.s.e(r11)
                java.lang.String r7 = "response.body()!!"
                kotlin.jvm.internal.s.f(r11, r7)
                com.withpersona.sdk.inquiry.selfie.network.CheckVerificationResponse r11 = (com.withpersona.sdk.inquiry.selfie.network.CheckVerificationResponse) r11
                iw.a$c$b r7 = new iw.a$c$b
                com.withpersona.sdk.inquiry.selfie.network.CheckVerificationResponse$Data r11 = r11.a()
                com.withpersona.sdk.inquiry.selfie.network.CheckVerificationResponse$Attributes r11 = r11.a()
                java.lang.String r11 = r11.a()
                r7.<init>(r11)
                r0.f32786b = r6
                r0.f32785a = r4
                java.lang.Object r11 = r6.emit(r7, r0)
                if (r11 != r1) goto L9d
                return r1
            L9d:
                r7 = 1000(0x3e8, double:4.94E-321)
                r0.f32786b = r6
                r0.f32785a = r2
                java.lang.Object r11 = v20.y0.b(r7, r0)
                if (r11 != r1) goto Laa
                return r1
            Laa:
                r11 = r0
                r0 = r1
                r1 = r6
                goto L49
            Lae:
                iw.a$c$a r11 = iw.a.c.C0602a.f32783a
                r2 = 0
                r0.f32786b = r2
                r0.f32785a = r3
                java.lang.Object r11 = r6.emit(r11, r0)
                if (r11 != r1) goto Lbc
                return r1
            Lbc:
                vz.b0 r11 = vz.b0.f54756a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: iw.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C0601a(null);
    }

    public a(String sessionToken, String verificationToken, iw.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(service, "service");
        this.f32779b = sessionToken;
        this.f32780c = verificationToken;
        this.f32781d = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof a) {
            a aVar = (a) otherWorker;
            if (s.c(this.f32779b, aVar.f32779b) && s.c(this.f32780c, aVar.f32780c)) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        return this.f32779b;
    }

    public final String d() {
        return this.f32780c;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<c> run() {
        return g.v(new d(null));
    }
}