package pv;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class f implements nr.n<a> {

    /* renamed from: b  reason: collision with root package name */
    private final androidx.activity.result.d<String> f46935b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f46936c;

    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: pv.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1007a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1007a f46937a = new C1007a();

            private C1007a() {
                super(null);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f46938a = new b();

            private b() {
                super(null);
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f46939a = new c();

            private c() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.camera.CameraPermissionWorker$run$1", f = "CameraPermissionWorker.kt", l = {30, 34, 35, 37}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super a>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f46940a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f46941b;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f46941b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super a> fVar, zz.d<? super vz.b0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r9.f46940a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L2b
                if (r1 == r6) goto L26
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L26
                if (r1 != r2) goto L16
                goto L26
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r1 = r9.f46941b
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                vz.r.b(r10)
                goto L7f
            L26:
                vz.r.b(r10)
                goto La1
            L2b:
                vz.r.b(r10)
                java.lang.Object r10 = r9.f46941b
                r1 = r10
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                pv.f r10 = pv.f.this
                androidx.activity.result.d r10 = pv.f.c(r10)
                f.a r10 = r10.a()
                pv.f r7 = pv.f.this
                android.content.Context r7 = pv.f.b(r7)
                java.lang.String r8 = "android.permission.CAMERA"
                f.a$a r10 = r10.getSynchronousResult(r7, r8)
                if (r10 != 0) goto L4d
                r10 = r5
                goto L51
            L4d:
                java.lang.Object r10 = r10.a()
            L51:
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r6)
                boolean r10 = kotlin.jvm.internal.s.c(r10, r7)
                if (r10 == 0) goto L66
                pv.f$a$c r10 = pv.f.a.c.f46939a
                r9.f46940a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto La1
                return r0
            L66:
                pv.f r10 = pv.f.this
                androidx.activity.result.d r10 = pv.f.c(r10)
                r10.b(r8)
                cw.m r10 = new cw.m
                r10.<init>()
                r9.f46941b = r1
                r9.f46940a = r4
                java.lang.Object r10 = r10.e(r9)
                if (r10 != r0) goto L7f
                return r0
            L7f:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L94
                pv.f$a$c r10 = pv.f.a.c.f46939a
                r9.f46941b = r5
                r9.f46940a = r3
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto La1
                return r0
            L94:
                pv.f$a$a r10 = pv.f.a.C1007a.f46937a
                r9.f46941b = r5
                r9.f46940a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto La1
                return r0
            La1:
                vz.b0 r10 = vz.b0.f54756a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(androidx.activity.result.d<String> requestPermissionsLauncher, Context context) {
        kotlin.jvm.internal.s.g(requestPermissionsLauncher, "requestPermissionsLauncher");
        kotlin.jvm.internal.s.g(context, "context");
        this.f46935b = requestPermissionsLauncher;
        this.f46936c = context;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        return otherWorker instanceof f;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<a> run() {
        return kotlinx.coroutines.flow.g.v(new b(null));
    }
}