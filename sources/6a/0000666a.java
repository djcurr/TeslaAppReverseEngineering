package dw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class p implements nr.n<a> {

    /* renamed from: b  reason: collision with root package name */
    private final String f24351b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24352c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24353d;

    /* renamed from: e  reason: collision with root package name */
    private final fw.a f24354e;

    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: dw.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0471a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0471a f24355a = new C0471a();

            private C0471a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f24356a = new b();

            private b() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f24357a = new c();

            private c() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f24358a = new d();

            private d() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.phone.SubmitConfirmationCodeWorker$run$1", f = "SubmitConfirmationCodeWorker.kt", l = {25, 31, 38, 44, 50, 57, 62, 65, 69}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super a>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24359a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24360b;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f24360b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super a> fVar, zz.d<? super b0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x012d, code lost:
            if (r12.equals("confirmed") == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:
            if (r12.equals("requires_retry") == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
            if (r12.equals("failed") == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0158, code lost:
            r12 = dw.p.a.b.f24356a;
            r0.f24360b = null;
            r0.f24359a = 6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0163, code lost:
            if (r6.emit(r12, r0) != r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0165, code lost:
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0177 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0186 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0187 -> B:31:0x00cb). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 456
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dw.p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p(String sessionToken, String verificationToken, String confirmationCode, fw.a service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(confirmationCode, "confirmationCode");
        s.g(service, "service");
        this.f24351b = sessionToken;
        this.f24352c = verificationToken;
        this.f24353d = confirmationCode;
        this.f24354e = service;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof p) {
            p pVar = (p) otherWorker;
            if (s.c(this.f24351b, pVar.f24351b) && s.c(this.f24352c, pVar.f24352c) && s.c(this.f24353d, pVar.f24353d)) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        return this.f24353d;
    }

    public final String d() {
        return this.f24351b;
    }

    public final String e() {
        return this.f24352c;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<a> run() {
        return kotlinx.coroutines.flow.g.v(new b(null));
    }
}