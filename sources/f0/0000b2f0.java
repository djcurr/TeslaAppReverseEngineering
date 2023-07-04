package sv;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.database.network.CreateDatabaseVerificationRequest;
import com.withpersona.sdk.inquiry.database.network.CreateDatabaseVerificationResponse;
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
    private final String f50687b;

    /* renamed from: c  reason: collision with root package name */
    private final sv.c f50688c;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final sv.c f50689a;

        public a(sv.c service) {
            s.g(service, "service");
            this.f50689a = service;
        }

        public final d a(String sessionToken) {
            s.g(sessionToken, "sessionToken");
            return new d(sessionToken, this.f50689a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f50690a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: sv.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1129b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f50691a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1129b(String verificationToken) {
                super(null);
                s.g(verificationToken, "verificationToken");
                this.f50691a = verificationToken;
            }

            public final String a() {
                return this.f50691a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1129b) && s.c(this.f50691a, ((C1129b) obj).f50691a);
            }

            public int hashCode() {
                return this.f50691a.hashCode();
            }

            public String toString() {
                return "Success(verificationToken=" + this.f50691a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.database.network.DatabaseVerificationWorker$run$1", f = "DatabaseVerificationWorker.kt", l = {18, 24, 26}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50692a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f50693b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f50693b = obj;
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
            int i11 = this.f50692a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f50693b;
                sv.c cVar = d.this.f50688c;
                String c11 = d.this.c();
                CreateDatabaseVerificationRequest createDatabaseVerificationRequest = new CreateDatabaseVerificationRequest(null, 1, null);
                this.f50693b = fVar;
                this.f50692a = 1;
                obj = cVar.c(c11, createDatabaseVerificationRequest, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f50693b;
                r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a11 = sVar.a();
                s.e(a11);
                s.f(a11, "response.body()!!");
                b.C1129b c1129b = new b.C1129b(((CreateDatabaseVerificationResponse) a11).a().a());
                this.f50693b = null;
                this.f50692a = 2;
                if (fVar.emit(c1129b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f50690a;
                this.f50693b = null;
                this.f50692a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public d(String sessionToken, sv.c service) {
        s.g(sessionToken, "sessionToken");
        s.g(service, "service");
        this.f50687b = sessionToken;
        this.f50688c = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof d) && s.c(this.f50687b, ((d) otherWorker).f50687b);
    }

    public final String c() {
        return this.f50687b;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return g.v(new c(null));
    }
}