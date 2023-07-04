package yv;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.governmentid.network.SubmitVerificationRequest;
import com.withpersona.sdk.inquiry.governmentid.network.SubmitVerificationResponse;
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
public final class d implements n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f59882b;

    /* renamed from: c  reason: collision with root package name */
    private final String f59883c;

    /* renamed from: d  reason: collision with root package name */
    private final yv.b f59884d;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final yv.b f59885a;

        public a(yv.b service) {
            s.g(service, "service");
            this.f59885a = service;
        }

        public final d a(String sessionToken, String verificationToken) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            return new d(sessionToken, verificationToken, this.f59885a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f59886a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: yv.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1367b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f59887a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1367b(String verificationToken) {
                super(null);
                s.g(verificationToken, "verificationToken");
                this.f59887a = verificationToken;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1367b) && s.c(this.f59887a, ((C1367b) obj).f59887a);
            }

            public int hashCode() {
                return this.f59887a.hashCode();
            }

            public String toString() {
                return "Success(verificationToken=" + this.f59887a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.governmentid.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {19, 26, 28}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59888a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59889b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f59889b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f59888a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f59889b;
                yv.b bVar = d.this.f59884d;
                String c11 = d.this.c();
                String d12 = d.this.d();
                SubmitVerificationRequest submitVerificationRequest = new SubmitVerificationRequest(null, 1, null);
                this.f59889b = fVar;
                this.f59888a = 1;
                obj = bVar.d(c11, d12, submitVerificationRequest, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f59889b;
                r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a11 = sVar.a();
                s.e(a11);
                s.f(a11, "response.body()!!");
                b.C1367b c1367b = new b.C1367b(((SubmitVerificationResponse) a11).a().a());
                this.f59889b = null;
                this.f59888a = 2;
                if (fVar.emit(c1367b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f59886a;
                this.f59889b = null;
                this.f59888a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public d(String sessionToken, String verificationToken, yv.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(service, "service");
        this.f59882b = sessionToken;
        this.f59883c = verificationToken;
        this.f59884d = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof d) {
            d dVar = (d) otherWorker;
            if (s.c(this.f59882b, dVar.f59882b) && s.c(this.f59883c, dVar.f59883c)) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        return this.f59882b;
    }

    public final String d() {
        return this.f59883c;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new c(null));
    }
}