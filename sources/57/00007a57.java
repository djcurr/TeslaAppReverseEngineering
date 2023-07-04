package iw;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.selfie.network.SubmitVerificationRequest;
import com.withpersona.sdk.inquiry.selfie.network.SubmitVerificationResponse;
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
    private final String f32796b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32797c;

    /* renamed from: d  reason: collision with root package name */
    private final iw.b f32798d;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final iw.b f32799a;

        public a(iw.b service) {
            s.g(service, "service");
            this.f32799a = service;
        }

        public final d a(String sessionToken, String verificationToken) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            return new d(sessionToken, verificationToken, this.f32799a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f32800a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: iw.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0605b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f32801a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0605b(String verificationToken) {
                super(null);
                s.g(verificationToken, "verificationToken");
                this.f32801a = verificationToken;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0605b) && s.c(this.f32801a, ((C0605b) obj).f32801a);
            }

            public int hashCode() {
                return this.f32801a.hashCode();
            }

            public String toString() {
                return "Success(verificationToken=" + this.f32801a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.selfie.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {19, 26, 28}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32802a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f32803b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f32803b = obj;
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
            int i11 = this.f32802a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f32803b;
                iw.b bVar = d.this.f32798d;
                String c11 = d.this.c();
                String d12 = d.this.d();
                SubmitVerificationRequest submitVerificationRequest = new SubmitVerificationRequest(null, 1, null);
                this.f32803b = fVar;
                this.f32802a = 1;
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
                fVar = (kotlinx.coroutines.flow.f) this.f32803b;
                r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a11 = sVar.a();
                s.e(a11);
                s.f(a11, "response.body()!!");
                b.C0605b c0605b = new b.C0605b(((SubmitVerificationResponse) a11).a().a());
                this.f32803b = null;
                this.f32802a = 2;
                if (fVar.emit(c0605b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f32800a;
                this.f32803b = null;
                this.f32802a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public d(String sessionToken, String verificationToken, iw.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(service, "service");
        this.f32796b = sessionToken;
        this.f32797c = verificationToken;
        this.f32798d = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof d) {
            d dVar = (d) otherWorker;
            if (s.c(this.f32796b, dVar.f32796b) && s.c(this.f32797c, dVar.f32797c)) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        return this.f32796b;
    }

    public final String d() {
        return this.f32797c;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new c(null));
    }
}