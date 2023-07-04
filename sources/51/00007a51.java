package iw;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.selfie.network.CreateVerificationRequest;
import com.withpersona.sdk.inquiry.selfie.network.CreateVerificationResponse;
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
    private final String f32788b;

    /* renamed from: c  reason: collision with root package name */
    private final iw.b f32789c;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final iw.b f32790a;

        public a(iw.b service) {
            s.g(service, "service");
            this.f32790a = service;
        }

        public final c a(String sessionToken) {
            s.g(sessionToken, "sessionToken");
            return new c(sessionToken, this.f32790a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f32791a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: iw.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0603b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f32792a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0603b(String verificationToken) {
                super(null);
                s.g(verificationToken, "verificationToken");
                this.f32792a = verificationToken;
            }

            public final String a() {
                return this.f32792a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0603b) && s.c(this.f32792a, ((C0603b) obj).f32792a);
            }

            public int hashCode() {
                return this.f32792a.hashCode();
            }

            public String toString() {
                return "Success(verificationToken=" + this.f32792a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.selfie.network.SelfieVerificationWorker$run$1", f = "SelfieVerificationWorker.kt", l = {18, 24, 26}, m = "invokeSuspend")
    /* renamed from: iw.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0604c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32793a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f32794b;

        C0604c(zz.d<? super C0604c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            C0604c c0604c = new C0604c(dVar);
            c0604c.f32794b = obj;
            return c0604c;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super b0> dVar) {
            return ((C0604c) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f32793a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f32794b;
                iw.b bVar = c.this.f32789c;
                String c11 = c.this.c();
                CreateVerificationRequest createVerificationRequest = new CreateVerificationRequest(null, 1, null);
                this.f32794b = fVar;
                this.f32793a = 1;
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
                fVar = (kotlinx.coroutines.flow.f) this.f32794b;
                r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a11 = sVar.a();
                s.e(a11);
                s.f(a11, "response.body()!!");
                b.C0603b c0603b = new b.C0603b(((CreateVerificationResponse) a11).a().a());
                this.f32794b = null;
                this.f32793a = 2;
                if (fVar.emit(c0603b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f32791a;
                this.f32794b = null;
                this.f32793a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public c(String sessionToken, iw.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(service, "service");
        this.f32788b = sessionToken;
        this.f32789c = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && s.c(this.f32788b, ((c) otherWorker).f32788b);
    }

    public final String c() {
        return this.f32788b;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new C0604c(null));
    }
}