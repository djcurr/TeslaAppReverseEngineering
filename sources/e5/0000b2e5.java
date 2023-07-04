package sv;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.g;
import nr.n;
import vz.b0;

/* loaded from: classes6.dex */
public final class a implements n<c> {

    /* renamed from: b  reason: collision with root package name */
    private final String f50664b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50665c;

    /* renamed from: d  reason: collision with root package name */
    private final sv.c f50666d;

    /* renamed from: sv.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1126a {
        private C1126a() {
        }

        public /* synthetic */ C1126a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final sv.c f50667a;

        public b(sv.c service) {
            s.g(service, "service");
            this.f50667a = service;
        }

        public final a a(String sessionToken, String verificationToken) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            return new a(sessionToken, verificationToken, this.f50667a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* renamed from: sv.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1127a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1127a f50668a = new C1127a();

            private C1127a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f50669a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: sv.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1128c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1128c f50670a = new C1128c();

            private C1128c() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.database.network.CheckVerificationWorker$run$1", f = "CheckVerificationWorker.kt", l = {23, 31, 34, 35, 38}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class d extends l implements p<kotlinx.coroutines.flow.f<? super c>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50671a;

        /* renamed from: b  reason: collision with root package name */
        int f50672b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f50673c;

        d(zz.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f50673c = obj;
            return dVar2;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super c> fVar, zz.d<? super b0> dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0098 -> B:41:0x00d9). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b3 -> B:34:0x00b6). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sv.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C1126a(null);
    }

    public a(String sessionToken, String verificationToken, sv.c service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(service, "service");
        this.f50664b = sessionToken;
        this.f50665c = verificationToken;
        this.f50666d = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof a) && s.c(this.f50665c, ((a) otherWorker).f50665c);
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<c> run() {
        return g.v(new d(null));
    }
}