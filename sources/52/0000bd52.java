package wv;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nr.n;
import pv.r;
import v20.a2;
import v20.o0;
import v20.y0;

/* loaded from: classes6.dex */
public final class g implements nr.n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final Context f56248b;

    /* renamed from: c  reason: collision with root package name */
    private final x20.e<r.a> f56249c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f56250a;

        public b(String absolutePath) {
            kotlin.jvm.internal.s.g(absolutePath, "absolutePath");
            this.f56250a = absolutePath;
        }

        public final String a() {
            return this.f56250a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.governmentid.CountdownCameraWorker$run$1", f = "CountdownCameraWorker.kt", l = {23, 25, 26, 42}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f56251a;

        /* renamed from: b  reason: collision with root package name */
        Object f56252b;

        /* renamed from: c  reason: collision with root package name */
        int f56253c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f56254d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.governmentid.CountdownCameraWorker$run$1$delayTimer$1", f = "CountdownCameraWorker.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super a2>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f56256a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f56257b;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.governmentid.CountdownCameraWorker$run$1$delayTimer$1$1", f = "CountdownCameraWorker.kt", l = {23}, m = "invokeSuspend")
            /* renamed from: wv.g$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1275a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f56258a;

                C1275a(zz.d<? super C1275a> dVar) {
                    super(2, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    return new C1275a(dVar);
                }

                @Override // h00.p
                public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((C1275a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f56258a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        this.f56258a = 1;
                        if (y0.b(500L, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    return vz.b0.f54756a;
                }
            }

            a(zz.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f56257b = obj;
                return aVar;
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super a2> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a2 d11;
                a00.d.d();
                if (this.f56256a == 0) {
                    vz.r.b(obj);
                    d11 = v20.k.d((o0) this.f56257b, null, null, new C1275a(null), 3, null);
                    return d11;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f56254d = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super vz.b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009e -> B:27:0x00a5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: wv.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public g(Context context, x20.e<r.a> channel) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(channel, "channel");
        this.f56248b = context;
        this.f56249c = channel;
    }

    @Override // nr.n
    public boolean a(nr.n<?> nVar) {
        return n.b.a(this, nVar);
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return kotlinx.coroutines.flow.g.v(new c(null));
    }
}