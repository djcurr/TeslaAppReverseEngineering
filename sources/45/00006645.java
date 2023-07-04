package dw;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.phone.network.CreateVerificationRequest;
import com.withpersona.sdk.inquiry.phone.network.CreateVerificationResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class l implements nr.n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f24288b;

    /* renamed from: c  reason: collision with root package name */
    private final fw.a f24289c;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final fw.a f24290a;

        public a(fw.a service) {
            s.g(service, "service");
            this.f24290a = service;
        }

        public final l a(String sessionToken) {
            s.g(sessionToken, "sessionToken");
            return new l(sessionToken, this.f24290a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24291a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: dw.l$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0468b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f24292a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0468b(String verificationToken) {
                super(null);
                s.g(verificationToken, "verificationToken");
                this.f24292a = verificationToken;
            }

            public final String a() {
                return this.f24292a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0468b) && s.c(this.f24292a, ((C0468b) obj).f24292a);
            }

            public int hashCode() {
                return this.f24292a.hashCode();
            }

            public String toString() {
                return "Success(verificationToken=" + this.f24292a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.phone.PhoneVerificationWorker$run$1", f = "PhoneVerificationWorker.kt", l = {22, 28, 30}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24293a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24294b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f24294b = obj;
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
            int i11 = this.f24293a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f24294b;
                fw.a aVar = l.this.f24289c;
                String c11 = l.this.c();
                CreateVerificationRequest createVerificationRequest = new CreateVerificationRequest(null, 1, null);
                this.f24294b = fVar;
                this.f24293a = 1;
                obj = aVar.a(c11, createVerificationRequest, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f24294b;
                r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a11 = sVar.a();
                s.e(a11);
                s.f(a11, "response.body()!!");
                b.C0468b c0468b = new b.C0468b(((CreateVerificationResponse) a11).a().a());
                this.f24294b = null;
                this.f24293a = 2;
                if (fVar.emit(c0468b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar2 = b.a.f24291a;
                this.f24294b = null;
                this.f24293a = 3;
                if (fVar.emit(aVar2, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public l(String sessionToken, fw.a service) {
        s.g(sessionToken, "sessionToken");
        s.g(service, "service");
        this.f24288b = sessionToken;
        this.f24289c = service;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof l) && s.c(this.f24288b, ((l) otherWorker).f24288b);
    }

    public final String c() {
        return this.f24288b;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return kotlinx.coroutines.flow.g.v(new c(null));
    }
}