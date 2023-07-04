package yv;

import ch.qos.logback.core.CoreConstants;
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
    private final String f59862b;

    /* renamed from: c  reason: collision with root package name */
    private final String f59863c;

    /* renamed from: d  reason: collision with root package name */
    private final yv.b f59864d;

    /* renamed from: yv.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1362a {
        private C1362a() {
        }

        public /* synthetic */ C1362a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final yv.b f59865a;

        public b(yv.b service) {
            s.g(service, "service");
            this.f59865a = service;
        }

        public final a a(String sessionToken, String verificationToken) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            return new a(sessionToken, verificationToken, this.f59865a);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* renamed from: yv.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1363a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1363a f59866a = new C1363a();

            private C1363a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final com.withpersona.sdk.inquiry.governmentid.network.a f59867a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.withpersona.sdk.inquiry.governmentid.network.a reason) {
                super(null);
                s.g(reason, "reason");
                this.f59867a = reason;
            }

            public final com.withpersona.sdk.inquiry.governmentid.network.a a() {
                return this.f59867a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f59867a == ((b) obj).f59867a;
            }

            public int hashCode() {
                return this.f59867a.hashCode();
            }

            public String toString() {
                return "Failure(reason=" + this.f59867a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* renamed from: yv.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1364c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1364c f59868a = new C1364c();

            private C1364c() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f59869a = new d();

            private d() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.governmentid.network.CheckVerificationWorker$run$1", f = "CheckVerificationWorker.kt", l = {21, 31, 38, 41, 44, 48}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class d extends l implements p<kotlinx.coroutines.flow.f<? super c>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59870a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59871b;

        d(zz.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f59871b = obj;
            return dVar2;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super c> fVar, zz.d<? super b0> dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x012a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x012b -> B:12:0x003a). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 338
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yv.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C1362a(null);
    }

    public a(String sessionToken, String verificationToken, yv.b service) {
        s.g(sessionToken, "sessionToken");
        s.g(verificationToken, "verificationToken");
        s.g(service, "service");
        this.f59862b = sessionToken;
        this.f59863c = verificationToken;
        this.f59864d = service;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof a) {
            a aVar = (a) otherWorker;
            if (s.c(this.f59862b, aVar.f59862b) && s.c(this.f59863c, aVar.f59863c)) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        return this.f59862b;
    }

    public final String d() {
        return this.f59863c;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<c> run() {
        return g.v(new d(null));
    }
}