package zv;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk.inquiry.internal.network.CreateInquirySessionResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class c implements nr.n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f60825b;

    /* renamed from: c  reason: collision with root package name */
    private final bw.n f60826c;

    /* renamed from: d  reason: collision with root package name */
    private final f f60827d;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final bw.n f60828a;

        /* renamed from: b  reason: collision with root package name */
        private final f f60829b;

        public a(bw.n service, f deviceId) {
            kotlin.jvm.internal.s.g(service, "service");
            kotlin.jvm.internal.s.g(deviceId, "deviceId");
            this.f60828a = service;
            this.f60829b = deviceId;
        }

        public final c a(String inquiryId) {
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            return new c(inquiryId, this.f60828a, this.f60829b);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f60830a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: zv.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1396b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f60831a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1396b(String sessionToken) {
                super(null);
                kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
                this.f60831a = sessionToken;
            }

            public final String a() {
                return this.f60831a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1396b) && kotlin.jvm.internal.s.c(this.f60831a, ((C1396b) obj).f60831a);
            }

            public int hashCode() {
                return this.f60831a.hashCode();
            }

            public String toString() {
                return "Success(sessionToken=" + this.f60831a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.internal.CreateInquirySessionWorker$run$1", f = "CreateInquirySessionWorker.kt", l = {19, 28, 30}, m = "invokeSuspend")
    /* renamed from: zv.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C1397c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60832a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f60833b;

        C1397c(zz.d<? super C1397c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            C1397c c1397c = new C1397c(dVar);
            c1397c.f60833b = obj;
            return c1397c;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super vz.b0> dVar) {
            return ((C1397c) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f60832a;
            if (i11 == 0) {
                vz.r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f60833b;
                bw.n nVar = c.this.f60826c;
                CreateInquirySessionRequest a11 = CreateInquirySessionRequest.f22659c.a(c.this.f60825b);
                String a12 = c.this.f60827d.a();
                this.f60833b = fVar;
                this.f60832a = 1;
                obj = nVar.d(a11, a12, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f60833b;
                vz.r.b(obj);
            }
            retrofit2.s sVar = (retrofit2.s) obj;
            if (sVar.f()) {
                String str = sVar.e().get("persona-device-id");
                if (str != null) {
                    c.this.f60827d.b(str);
                }
                Object a13 = sVar.a();
                kotlin.jvm.internal.s.e(a13);
                kotlin.jvm.internal.s.f(a13, "response.body()!!");
                b.C1396b c1396b = new b.C1396b(kotlin.jvm.internal.s.p("Bearer ", ((CreateInquirySessionResponse) a13).b().a()));
                this.f60833b = null;
                this.f60832a = 2;
                if (fVar.emit(c1396b, this) == d11) {
                    return d11;
                }
            } else {
                b.a aVar = b.a.f60830a;
                this.f60833b = null;
                this.f60832a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return vz.b0.f54756a;
        }
    }

    public c(String inquiryId, bw.n service, f deviceId) {
        kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
        kotlin.jvm.internal.s.g(service, "service");
        kotlin.jvm.internal.s.g(deviceId, "deviceId");
        this.f60825b = inquiryId;
        this.f60826c = service;
        this.f60827d = deviceId;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && kotlin.jvm.internal.s.c(this.f60825b, ((c) otherWorker).f60825b);
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return kotlinx.coroutines.flow.g.v(new C1397c(null));
    }
}