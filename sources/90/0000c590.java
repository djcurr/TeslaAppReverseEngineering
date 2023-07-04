package zv;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.internal.network.NextStep;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class d implements nr.n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f60836b;

    /* renamed from: c  reason: collision with root package name */
    private final com.withpersona.sdk.inquiry.internal.a f60837c;

    /* renamed from: d  reason: collision with root package name */
    private final String f60838d;

    /* renamed from: e  reason: collision with root package name */
    private final String f60839e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, z> f60840f;

    /* renamed from: g  reason: collision with root package name */
    private final String f60841g;

    /* renamed from: h  reason: collision with root package name */
    private final bw.n f60842h;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final bw.n f60843a;

        public a(bw.n service) {
            kotlin.jvm.internal.s.g(service, "service");
            this.f60843a = service;
        }

        public final d a(String templateId, com.withpersona.sdk.inquiry.internal.a environment, String str, String str2, Map<String, ? extends z> map, String str3) {
            kotlin.jvm.internal.s.g(templateId, "templateId");
            kotlin.jvm.internal.s.g(environment, "environment");
            return new d(templateId, environment, str, str2, map, str3, this.f60843a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f60844a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: zv.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1398b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1398b f60845a = new C1398b();

            private C1398b() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f60846a;

            /* renamed from: b  reason: collision with root package name */
            private final NextStep f60847b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String inquiryId, NextStep nextStep) {
                super(null);
                kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
                kotlin.jvm.internal.s.g(nextStep, "nextStep");
                this.f60846a = inquiryId;
                this.f60847b = nextStep;
            }

            public final String a() {
                return this.f60846a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return kotlin.jvm.internal.s.c(this.f60846a, cVar.f60846a) && kotlin.jvm.internal.s.c(this.f60847b, cVar.f60847b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f60846a.hashCode() * 31) + this.f60847b.hashCode();
            }

            public String toString() {
                return "Success(inquiryId=" + this.f60846a + ", nextStep=" + this.f60847b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.internal.CreateInquiryWorker$run$1", f = "CreateInquiryWorker.kt", l = {25, 29, 41, 43}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60848a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f60849b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f60849b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super vz.b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r14.f60848a
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 0
                r6 = 2
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r6) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                vz.r.b(r15)
                goto Ld6
            L23:
                java.lang.Object r1 = r14.f60849b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r15)
                goto L8f
            L2b:
                vz.r.b(r15)
                goto L51
            L2f:
                vz.r.b(r15)
                java.lang.Object r15 = r14.f60849b
                r1 = r15
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                zv.d r15 = zv.d.this
                java.lang.String r15 = r15.h()
                r7 = 0
                java.lang.String r8 = "tmpl_"
                boolean r15 = kotlin.text.m.H(r15, r8, r7, r6, r5)
                if (r15 != 0) goto L54
                zv.d$b$a r15 = zv.d.b.a.f60844a
                r14.f60848a = r4
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r0) goto L51
                return r0
            L51:
                vz.b0 r15 = vz.b0.f54756a
                return r15
            L54:
                zv.d r15 = zv.d.this
                bw.n r15 = zv.d.b(r15)
                com.withpersona.sdk.inquiry.internal.network.CreateInquiryRequest$b r7 = com.withpersona.sdk.inquiry.internal.network.CreateInquiryRequest.f22647b
                zv.d r4 = zv.d.this
                java.lang.String r8 = r4.h()
                zv.d r4 = zv.d.this
                com.withpersona.sdk.inquiry.internal.a r9 = r4.d()
                zv.d r4 = zv.d.this
                java.lang.String r10 = r4.c()
                zv.d r4 = zv.d.this
                java.lang.String r11 = r4.g()
                zv.d r4 = zv.d.this
                java.util.Map r12 = r4.e()
                zv.d r4 = zv.d.this
                java.lang.String r13 = r4.f()
                com.withpersona.sdk.inquiry.internal.network.CreateInquiryRequest r4 = r7.a(r8, r9, r10, r11, r12, r13)
                r14.f60849b = r1
                r14.f60848a = r6
                java.lang.Object r15 = r15.b(r4, r14)
                if (r15 != r0) goto L8f
                return r0
            L8f:
                retrofit2.s r15 = (retrofit2.s) r15
                boolean r4 = r15.f()
                if (r4 == 0) goto Lc9
                java.lang.Object r15 = r15.a()
                kotlin.jvm.internal.s.e(r15)
                java.lang.String r2 = "response.body()!!"
                kotlin.jvm.internal.s.f(r15, r2)
                com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse r15 = (com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse) r15
                zv.d$b$c r2 = new zv.d$b$c
                com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse$Data r4 = r15.a()
                java.lang.String r4 = r4.b()
                com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse$Data r15 = r15.a()
                com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse$Attributes r15 = r15.a()
                com.withpersona.sdk.inquiry.internal.network.NextStep r15 = r15.l()
                r2.<init>(r4, r15)
                r14.f60849b = r5
                r14.f60848a = r3
                java.lang.Object r15 = r1.emit(r2, r14)
                if (r15 != r0) goto Ld6
                return r0
            Lc9:
                zv.d$b$b r15 = zv.d.b.C1398b.f60845a
                r14.f60849b = r5
                r14.f60848a = r2
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r0) goto Ld6
                return r0
            Ld6:
                vz.b0 r15 = vz.b0.f54756a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: zv.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String templateId, com.withpersona.sdk.inquiry.internal.a environment, String str, String str2, Map<String, ? extends z> map, String str3, bw.n service) {
        kotlin.jvm.internal.s.g(templateId, "templateId");
        kotlin.jvm.internal.s.g(environment, "environment");
        kotlin.jvm.internal.s.g(service, "service");
        this.f60836b = templateId;
        this.f60837c = environment;
        this.f60838d = str;
        this.f60839e = str2;
        this.f60840f = map;
        this.f60841g = str3;
        this.f60842h = service;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof d) {
            d dVar = (d) otherWorker;
            if (kotlin.jvm.internal.s.c(this.f60836b, dVar.f60836b) && this.f60837c == dVar.f60837c) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        return this.f60838d;
    }

    public final com.withpersona.sdk.inquiry.internal.a d() {
        return this.f60837c;
    }

    public final Map<String, z> e() {
        return this.f60840f;
    }

    public final String f() {
        return this.f60841g;
    }

    public final String g() {
        return this.f60839e;
    }

    public final String h() {
        return this.f60836b;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return kotlinx.coroutines.flow.g.v(new c(null));
    }
}