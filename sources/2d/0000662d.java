package dw;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.phone.network.GenerateConfirmationCodeRequest;
import com.withpersona.sdk.inquiry.phone.network.GenerateConfirmationCodeResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class c implements nr.n<a> {

    /* renamed from: b  reason: collision with root package name */
    private final String f24262b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24263c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24264d;

    /* renamed from: e  reason: collision with root package name */
    private final fw.a f24265e;

    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: dw.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0466a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0466a f24266a = new C0466a();

            private C0466a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f24267a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String status) {
                super(null);
                s.g(status, "status");
                this.f24267a = status;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.c(this.f24267a, ((b) obj).f24267a);
            }

            public int hashCode() {
                return this.f24267a.hashCode();
            }

            public String toString() {
                return "Success(status=" + this.f24267a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.phone.GenerateConfirmationCodeWorker$run$1", f = "GenerateConfirmationCodeWorker.kt", l = {20, 27, 29}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super a>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24268a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24269b;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f24269b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super a> fVar, zz.d<? super b0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f24268a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f24269b;
                fw.a aVar = c.this.f24265e;
                String d12 = c.this.d();
                String e11 = c.this.e();
                GenerateConfirmationCodeRequest a11 = GenerateConfirmationCodeRequest.f22808b.a(c.this.c());
                this.f24269b = fVar;
                this.f24268a = 1;
                obj = aVar.c(d12, e11, a11, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f24269b;
                r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a12 = sVar.a();
                s.e(a12);
                s.f(a12, "response.body()!!");
                a.b bVar = new a.b(((GenerateConfirmationCodeResponse) a12).a().a().a());
                this.f24269b = null;
                this.f24268a = 2;
                if (fVar.emit(bVar, this) == d11) {
                    return d11;
                }
            } else {
                a.C0466a c0466a = a.C0466a.f24266a;
                this.f24269b = null;
                this.f24268a = 3;
                if (fVar.emit(c0466a, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public c(String sessionToken, String verificationToken, String phoneNumber, fw.a service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(phoneNumber, "phoneNumber");
        s.g(service, "service");
        this.f24262b = sessionToken;
        this.f24263c = verificationToken;
        this.f24264d = phoneNumber;
        this.f24265e = service;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && s.c(this.f24262b, ((c) otherWorker).f24262b);
    }

    public final String c() {
        return this.f24264d;
    }

    public final String d() {
        return this.f24262b;
    }

    public final String e() {
        return this.f24263c;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<a> run() {
        return kotlinx.coroutines.flow.g.v(new b(null));
    }
}