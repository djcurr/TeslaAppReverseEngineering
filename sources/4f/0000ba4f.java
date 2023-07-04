package vv;

import com.plaid.internal.d;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import nr.n;
import vz.b0;

/* loaded from: classes6.dex */
public final class b implements n<AbstractC1233b> {

    /* renamed from: b  reason: collision with root package name */
    private final String f54633b;

    /* renamed from: c  reason: collision with root package name */
    private final vv.a f54634c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54635d;

    /* renamed from: e  reason: collision with root package name */
    private final String f54636e;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final vv.a f54637a;

        public a(vv.a service) {
            s.g(service, "service");
            this.f54637a = service;
        }

        public final b a(String sessionToken, String absoluteFilePath, String documentKind) {
            s.g(sessionToken, "sessionToken");
            s.g(absoluteFilePath, "absoluteFilePath");
            s.g(documentKind, "documentKind");
            return new b(sessionToken, this.f54637a, absoluteFilePath, documentKind);
        }
    }

    /* renamed from: vv.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC1233b {

        /* renamed from: vv.b$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC1233b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f54638a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: vv.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1234b extends AbstractC1233b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1234b f54639a = new C1234b();

            private C1234b() {
                super(null);
            }
        }

        private AbstractC1233b() {
        }

        public /* synthetic */ AbstractC1233b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.document.network.DocumentUploadWorker$run$1", f = "DocumentUploadWorker.kt", l = {34, 50, 55, 61, 66, 67, 74, 80, 85, 94, 99, 105, 110, 112, 119, 124, d.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<kotlinx.coroutines.flow.f<? super AbstractC1233b>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f54640a;

        /* renamed from: b  reason: collision with root package name */
        Object f54641b;

        /* renamed from: c  reason: collision with root package name */
        int f54642c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f54643d;

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f54643d = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super AbstractC1233b> fVar, zz.d<? super b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x031a  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x032d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x026c  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x028f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02f4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01d5 -> B:51:0x01d8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x02a8 -> B:81:0x02ab). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 870
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vv.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(String sessionToken, vv.a service, String absoluteFilePath, String documentKind) {
        s.g(sessionToken, "sessionToken");
        s.g(service, "service");
        s.g(absoluteFilePath, "absoluteFilePath");
        s.g(documentKind, "documentKind");
        this.f54633b = sessionToken;
        this.f54634c = service;
        this.f54635d = absoluteFilePath;
        this.f54636e = documentKind;
    }

    @Override // nr.n
    public boolean a(n<?> otherWorker) {
        s.g(otherWorker, "otherWorker");
        if (otherWorker instanceof b) {
            b bVar = (b) otherWorker;
            if (s.c(this.f54633b, bVar.f54633b) && s.c(this.f54635d, bVar.f54635d) && s.c(this.f54636e, bVar.f54636e)) {
                return true;
            }
        }
        return false;
    }

    public final String d() {
        return this.f54635d;
    }

    public final String e() {
        return this.f54636e;
    }

    @Override // nr.n
    public e<AbstractC1233b> run() {
        return g.v(new c(null));
    }
}