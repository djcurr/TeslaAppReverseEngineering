package zv;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class a implements nr.n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f60802b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60803c;

    /* renamed from: d  reason: collision with root package name */
    private final bw.n f60804d;

    /* renamed from: e  reason: collision with root package name */
    private final f f60805e;

    /* renamed from: zv.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1391a {

        /* renamed from: a  reason: collision with root package name */
        private final bw.n f60806a;

        /* renamed from: b  reason: collision with root package name */
        private final f f60807b;

        public C1391a(bw.n service, f deviceId) {
            kotlin.jvm.internal.s.g(service, "service");
            kotlin.jvm.internal.s.g(deviceId, "deviceId");
            this.f60806a = service;
            this.f60807b = deviceId;
        }

        public final a a(String sessionToken, String inquiryId) {
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            return new a(sessionToken, inquiryId, this.f60806a, this.f60807b);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* renamed from: zv.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1392a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1392a f60808a = new C1392a();

            private C1392a() {
                super(null);
            }
        }

        /* renamed from: zv.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1393b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final i0 f60809a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1393b(i0 nextState) {
                super(null);
                kotlin.jvm.internal.s.g(nextState, "nextState");
                this.f60809a = nextState;
            }

            public final i0 a() {
                return this.f60809a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1393b) && kotlin.jvm.internal.s.c(this.f60809a, ((C1393b) obj).f60809a);
            }

            public int hashCode() {
                return this.f60809a.hashCode();
            }

            public String toString() {
                return "Success(nextState=" + this.f60809a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.internal.CheckInquiryWorker$run$1", f = "CheckInquiryWorker.kt", l = {16, 26, 34}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60810a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f60811b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f60811b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super vz.b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f60810a;
            if (i11 == 0) {
                vz.r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f60811b;
                bw.n nVar = a.this.f60804d;
                String e11 = a.this.e();
                String a11 = a.this.f60805e.a();
                String d12 = a.this.d();
                this.f60811b = fVar;
                this.f60810a = 1;
                obj = nVar.a(e11, a11, d12, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vz.r.b(obj);
                return vz.b0.f54756a;
            } else {
                fVar = (kotlinx.coroutines.flow.f) this.f60811b;
                vz.r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                String str = sVar.e().get("persona-device-id");
                if (str != null) {
                    a.this.f60805e.b(str);
                }
                Object a12 = sVar.a();
                kotlin.jvm.internal.s.e(a12);
                kotlin.jvm.internal.s.f(a12, "response.body()!!");
                b.C1393b c1393b = new b.C1393b(((CheckInquiryResponse) a12).e(a.this.e()));
                this.f60811b = null;
                this.f60810a = 2;
                if (fVar.emit(c1393b, this) == d11) {
                    return d11;
                }
            } else {
                b.C1392a c1392a = b.C1392a.f60808a;
                this.f60811b = null;
                this.f60810a = 3;
                if (fVar.emit(c1392a, this) == d11) {
                    return d11;
                }
            }
            return vz.b0.f54756a;
        }
    }

    public a(String sessionToken, String inquiryId, bw.n service, f deviceId) {
        kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
        kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
        kotlin.jvm.internal.s.g(service, "service");
        kotlin.jvm.internal.s.g(deviceId, "deviceId");
        this.f60802b = sessionToken;
        this.f60803c = inquiryId;
        this.f60804d = service;
        this.f60805e = deviceId;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof a) {
            a aVar = (a) otherWorker;
            if (kotlin.jvm.internal.s.c(this.f60802b, aVar.f60802b) && kotlin.jvm.internal.s.c(this.f60803c, aVar.f60803c)) {
                return true;
            }
        }
        return false;
    }

    public final String d() {
        return this.f60803c;
    }

    public final String e() {
        return this.f60802b;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return kotlinx.coroutines.flow.g.v(new c(null));
    }
}