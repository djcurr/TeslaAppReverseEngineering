package yv;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.governmentid.network.CreateVerificationRequest;
import com.withpersona.sdk.inquiry.governmentid.network.CreateVerificationResponse;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.g;
import nr.n;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class c implements n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f59873b;

    /* renamed from: c  reason: collision with root package name */
    private final yv.b f59874c;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final yv.b f59875a;

        public a(yv.b service) {
            s.g(service, "service");
            this.f59875a = service;
        }

        public final c a(String sessionToken) {
            s.g(sessionToken, "sessionToken");
            return new c(sessionToken, this.f59875a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f59876a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: yv.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1365b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f59877a;

            /* renamed from: b  reason: collision with root package name */
            private final String f59878b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1365b(String verificationToken, String countryCode) {
                super(null);
                s.g(verificationToken, "verificationToken");
                s.g(countryCode, "countryCode");
                this.f59877a = verificationToken;
                this.f59878b = countryCode;
            }

            public final String a() {
                return this.f59878b;
            }

            public final String b() {
                return this.f59877a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1365b) {
                    C1365b c1365b = (C1365b) obj;
                    return s.c(this.f59877a, c1365b.f59877a) && s.c(this.f59878b, c1365b.f59878b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f59877a.hashCode() * 31) + this.f59878b.hashCode();
            }

            public String toString() {
                return "Success(verificationToken=" + this.f59877a + ", countryCode=" + this.f59878b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.governmentid.network.GovernmentIdVerificationWorker$run$1", f = "GovernmentIdVerificationWorker.kt", l = {18, 24, 26}, m = "invokeSuspend")
    /* renamed from: yv.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C1366c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59879a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59880b;

        C1366c(zz.d<? super C1366c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            C1366c c1366c = new C1366c(dVar);
            c1366c.f59880b = obj;
            return c1366c;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super b0> dVar) {
            return ((C1366c) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f59879a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f59880b;
                yv.b bVar = c.this.f59874c;
                String c11 = c.this.c();
                CreateVerificationRequest createVerificationRequest = new CreateVerificationRequest(null, 1, null);
                this.f59880b = fVar;
                this.f59879a = 1;
                obj = bVar.c(c11, createVerificationRequest, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return b0.f54756a;
            } else {
                fVar = (kotlinx.coroutines.flow.f) this.f59880b;
                r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a11 = sVar.a();
                s.e(a11);
                s.f(a11, "response.body()!!");
                CreateVerificationResponse createVerificationResponse = (CreateVerificationResponse) a11;
                b.C1365b c1365b = new b.C1365b(createVerificationResponse.a().b(), createVerificationResponse.a().a().a());
                this.f59880b = null;
                this.f59879a = 2;
                if (fVar.emit(c1365b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f59876a;
                this.f59880b = null;
                this.f59879a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public c(String sessionToken, yv.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(service, "service");
        this.f59873b = sessionToken;
        this.f59874c = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && s.c(this.f59873b, ((c) otherWorker).f59873b);
    }

    public final String c() {
        return this.f59873b;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new C1366c(null));
    }
}