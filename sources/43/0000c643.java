package zv;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse;
import com.withpersona.sdk.inquiry.internal.network.UpdateInquiryRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class p0 implements nr.n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f61206b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61207c;

    /* renamed from: d  reason: collision with root package name */
    private final UpdateInquiryRequest f61208d;

    /* renamed from: e  reason: collision with root package name */
    private final bw.n f61209e;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final bw.n f61210a;

        public a(bw.n service) {
            kotlin.jvm.internal.s.g(service, "service");
            this.f61210a = service;
        }

        public final p0 a(String sessionToken, String inquiryId) {
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            return new p0(sessionToken, inquiryId, UpdateInquiryRequest.f22772b.a(), this.f61210a);
        }

        public final p0 b(String sessionToken, String inquiryId, String countryCode) {
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            return new p0(sessionToken, inquiryId, UpdateInquiryRequest.f22772b.b(countryCode), this.f61210a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f61211a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: zv.p0$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1408b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final i0 f61212a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1408b(i0 nextState) {
                super(null);
                kotlin.jvm.internal.s.g(nextState, "nextState");
                this.f61212a = nextState;
            }

            public final i0 a() {
                return this.f61212a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1408b) && kotlin.jvm.internal.s.c(this.f61212a, ((C1408b) obj).f61212a);
            }

            public int hashCode() {
                return this.f61212a.hashCode();
            }

            public String toString() {
                return "Success(nextState=" + this.f61212a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.internal.UpdateInquiryWorker$run$1", f = "UpdateInquiryWorker.kt", l = {17, 24, 32}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f61213a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f61214b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f61214b = obj;
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
            int i11 = this.f61213a;
            if (i11 == 0) {
                vz.r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f61214b;
                bw.n nVar = p0.this.f61209e;
                String str = p0.this.f61206b;
                String str2 = p0.this.f61207c;
                UpdateInquiryRequest updateInquiryRequest = p0.this.f61208d;
                this.f61214b = fVar;
                this.f61213a = 1;
                obj = nVar.c(str, str2, updateInquiryRequest, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f61214b;
                vz.r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                Object a11 = sVar.a();
                kotlin.jvm.internal.s.e(a11);
                kotlin.jvm.internal.s.f(a11, "response.body()!!");
                b.C1408b c1408b = new b.C1408b(((CheckInquiryResponse) a11).e(p0.this.f61206b));
                this.f61214b = null;
                this.f61213a = 2;
                if (fVar.emit(c1408b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f61211a;
                this.f61214b = null;
                this.f61213a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return vz.b0.f54756a;
        }
    }

    public p0(String sessionToken, String inquiryId, UpdateInquiryRequest request, bw.n service) {
        kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
        kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(service, "service");
        this.f61206b = sessionToken;
        this.f61207c = inquiryId;
        this.f61208d = request;
        this.f61209e = service;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof p0) {
            p0 p0Var = (p0) otherWorker;
            if (kotlin.jvm.internal.s.c(this.f61206b, p0Var.f61206b) && kotlin.jvm.internal.s.c(this.f61207c, p0Var.f61207c)) {
                return true;
            }
        }
        return false;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return kotlinx.coroutines.flow.g.v(new c(null));
    }
}