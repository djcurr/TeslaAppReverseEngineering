package gw;

import android.content.Context;
import gw.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pv.z;
import v20.e1;

/* loaded from: classes6.dex */
public final class o implements nr.n<c> {

    /* renamed from: b  reason: collision with root package name */
    private final Context f28447b;

    /* renamed from: c  reason: collision with root package name */
    private final pv.x f28448c;

    /* renamed from: d  reason: collision with root package name */
    private final n.c f28449d;

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
        private final Context f28450a;

        /* renamed from: b  reason: collision with root package name */
        private final pv.x f28451b;

        public b(Context context, pv.x selfieDirectionFeed) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(selfieDirectionFeed, "selfieDirectionFeed");
            this.f28450a = context;
            this.f28451b = selfieDirectionFeed;
        }

        public final o a(n.c direction) {
            kotlin.jvm.internal.s.g(direction, "direction");
            return new o(this.f28450a, this.f28451b, direction);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28452a = new a();

            private a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final n f28453a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n selfie) {
                super(null);
                kotlin.jvm.internal.s.g(selfie, "selfie");
                this.f28453a = selfie;
            }

            public final n a() {
                return this.f28453a;
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.selfie.SelfieAnalyzeWorker$run$1", f = "SelfieAnalyzeWorker.kt", l = {28, 29, 37, 50, 53}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super c>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f28454a;

        /* renamed from: b  reason: collision with root package name */
        int f28455b;

        /* renamed from: c  reason: collision with root package name */
        int f28456c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f28457d;

        d(zz.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f28457d = obj;
            return dVar2;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super c> fVar, zz.d<? super vz.b0> dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0148 -> B:43:0x014b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0152 -> B:43:0x014b). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.o.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public o(Context context, pv.x selfieDirectionFeed, n.c direction) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(selfieDirectionFeed, "selfieDirectionFeed");
        kotlin.jvm.internal.s.g(direction, "direction");
        this.f28447b = context;
        this.f28448c = selfieDirectionFeed;
        this.f28449d = direction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.c f(pv.z zVar) {
        if (zVar instanceof z.a) {
            return n.c.CENTER;
        }
        if (zVar instanceof z.b) {
            return n.c.LEFT;
        }
        if (zVar instanceof z.d) {
            return n.c.RIGHT;
        }
        if (kotlin.jvm.internal.s.c(zVar, z.c.f47000b) || kotlin.jvm.internal.s.c(zVar, z.e.f47001b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof o) && ((o) otherWorker).f28449d == this.f28449d;
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<c> run() {
        return kotlinx.coroutines.flow.g.y(kotlinx.coroutines.flow.g.v(new d(null)), e1.d());
    }
}