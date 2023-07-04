package zv;

import com.withpersona.sdk.inquiry.internal.network.ContactSupportRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b implements nr.n<AbstractC1394b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f60814b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60815c;

    /* renamed from: d  reason: collision with root package name */
    private final bw.n f60816d;

    /* renamed from: e  reason: collision with root package name */
    private final ContactSupportRequest f60817e;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final bw.n f60818a;

        public a(bw.n service) {
            kotlin.jvm.internal.s.g(service, "service");
            this.f60818a = service;
        }

        public final b a(String sessionToken, String inquiryId, String name, String emailAddress, String comment) {
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(emailAddress, "emailAddress");
            kotlin.jvm.internal.s.g(comment, "comment");
            return new b(sessionToken, inquiryId, this.f60818a, ContactSupportRequest.f22638b.a(name, emailAddress, comment));
        }
    }

    /* renamed from: zv.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC1394b {

        /* renamed from: zv.b$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC1394b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f60819a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: zv.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1395b extends AbstractC1394b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1395b f60820a = new C1395b();

            private C1395b() {
                super(null);
            }
        }

        private AbstractC1394b() {
        }

        public /* synthetic */ AbstractC1394b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.internal.ContactSupportWorker$run$1", f = "ContactSupportWorker.kt", l = {17, 23, 25}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super AbstractC1394b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60821a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f60822b;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f60822b = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super AbstractC1394b> fVar, zz.d<? super vz.b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f60821a;
            if (i11 == 0) {
                vz.r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f60822b;
                bw.n nVar = b.this.f60816d;
                String str = b.this.f60814b;
                String str2 = b.this.f60815c;
                ContactSupportRequest contactSupportRequest = b.this.f60817e;
                this.f60822b = fVar;
                this.f60821a = 1;
                obj = nVar.e(str, str2, contactSupportRequest, this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f60822b;
                vz.r.b(obj);
            }
            if (((retrofit2.s) obj).f()) {
                AbstractC1394b.C1395b c1395b = AbstractC1394b.C1395b.f60820a;
                this.f60822b = null;
                this.f60821a = 2;
                if (fVar.emit(c1395b, this) == d11) {
                    return d11;
                }
            } else {
                AbstractC1394b.a aVar = AbstractC1394b.a.f60819a;
                this.f60822b = null;
                this.f60821a = 3;
                if (fVar.emit(aVar, this) == d11) {
                    return d11;
                }
            }
            return vz.b0.f54756a;
        }
    }

    public b(String sessionToken, String inquiryId, bw.n service, ContactSupportRequest request) {
        kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
        kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
        kotlin.jvm.internal.s.g(service, "service");
        kotlin.jvm.internal.s.g(request, "request");
        this.f60814b = sessionToken;
        this.f60815c = inquiryId;
        this.f60816d = service;
        this.f60817e = request;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof b) {
            b bVar = (b) otherWorker;
            if (kotlin.jvm.internal.s.c(this.f60814b, bVar.f60814b) && kotlin.jvm.internal.s.c(this.f60815c, bVar.f60815c)) {
                return true;
            }
        }
        return false;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<AbstractC1394b> run() {
        return kotlinx.coroutines.flow.g.v(new c(null));
    }
}