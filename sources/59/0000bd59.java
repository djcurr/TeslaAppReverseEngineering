package wv;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class h implements nr.n<b> {

    /* renamed from: b  reason: collision with root package name */
    private final Context f56263b;

    /* renamed from: c  reason: collision with root package name */
    private final Id.b f56264c;

    /* renamed from: d  reason: collision with root package name */
    private final com.withpersona.sdk.inquiry.governmentid.network.b f56265d;

    /* renamed from: e  reason: collision with root package name */
    private final pv.n f56266e;

    /* renamed from: f  reason: collision with root package name */
    private final pv.l f56267f;

    /* renamed from: g  reason: collision with root package name */
    private final pv.p f56268g;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f56269a;

        /* renamed from: b  reason: collision with root package name */
        private final pv.n f56270b;

        /* renamed from: c  reason: collision with root package name */
        private final pv.l f56271c;

        /* renamed from: d  reason: collision with root package name */
        private final pv.p f56272d;

        public a(Context context, pv.n governmentIdFrontFeed, pv.l governmentIdBarcodePdf417Feed, pv.p governmentIdFrontOrBackFeed) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(governmentIdFrontFeed, "governmentIdFrontFeed");
            kotlin.jvm.internal.s.g(governmentIdBarcodePdf417Feed, "governmentIdBarcodePdf417Feed");
            kotlin.jvm.internal.s.g(governmentIdFrontOrBackFeed, "governmentIdFrontOrBackFeed");
            this.f56269a = context;
            this.f56270b = governmentIdFrontFeed;
            this.f56271c = governmentIdBarcodePdf417Feed;
            this.f56272d = governmentIdFrontOrBackFeed;
        }

        public final h a(Id.b side, com.withpersona.sdk.inquiry.governmentid.network.b idClass) {
            kotlin.jvm.internal.s.g(side, "side");
            kotlin.jvm.internal.s.g(idClass, "idClass");
            return new h(this.f56269a, side, idClass, this.f56270b, this.f56271c, this.f56272d);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final com.withpersona.sdk.inquiry.governmentid.a f56273a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.withpersona.sdk.inquiry.governmentid.a governmentId) {
                super(null);
                kotlin.jvm.internal.s.g(governmentId, "governmentId");
                this.f56273a = governmentId;
            }

            public final com.withpersona.sdk.inquiry.governmentid.a a() {
                return this.f56273a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f56273a, ((a) obj).f56273a);
            }

            public int hashCode() {
                return this.f56273a.hashCode();
            }

            public String toString() {
                return "Back(governmentId=" + this.f56273a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* renamed from: wv.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1276b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1276b f56274a = new C1276b();

            private C1276b() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$1", f = "GovernmentIdAnalyzeWorker.kt", l = {36, 38, 40, 48, 50, 59, 82, 84, 93, 109}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super b>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f56275a;

        /* renamed from: b  reason: collision with root package name */
        int f56276b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f56277c;

        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f56279a;

            static {
                int[] iArr = new int[Id.b.values().length];
                iArr[Id.b.Front.ordinal()] = 1;
                iArr[Id.b.Back.ordinal()] = 2;
                iArr[Id.b.BarcodePdf417.ordinal()] = 3;
                iArr[Id.b.FrontOrBack.ordinal()] = 4;
                iArr[Id.b.PassportSignature.ordinal()] = 5;
                f56279a = iArr;
            }
        }

        c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f56277c = obj;
            return cVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super b> fVar, zz.d<? super vz.b0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00f6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01c1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0270 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x017c -> B:36:0x017f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0185 -> B:36:0x017f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0195 -> B:36:0x017f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01d2 -> B:47:0x01b4). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0245 -> B:47:0x01b4). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0281 -> B:61:0x0264). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x028f -> B:61:0x0264). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 688
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: wv.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(Context context, Id.b side, com.withpersona.sdk.inquiry.governmentid.network.b idClass, pv.n governmentIdFrontFeed, pv.l governmentIdBarcodePdf417Feed, pv.p governmentIdFrontOrBackFeed) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(side, "side");
        kotlin.jvm.internal.s.g(idClass, "idClass");
        kotlin.jvm.internal.s.g(governmentIdFrontFeed, "governmentIdFrontFeed");
        kotlin.jvm.internal.s.g(governmentIdBarcodePdf417Feed, "governmentIdBarcodePdf417Feed");
        kotlin.jvm.internal.s.g(governmentIdFrontOrBackFeed, "governmentIdFrontOrBackFeed");
        this.f56263b = context;
        this.f56264c = side;
        this.f56265d = idClass;
        this.f56266e = governmentIdFrontFeed;
        this.f56267f = governmentIdBarcodePdf417Feed;
        this.f56268g = governmentIdFrontOrBackFeed;
    }

    @Override // nr.n
    public boolean a(nr.n<?> otherWorker) {
        kotlin.jvm.internal.s.g(otherWorker, "otherWorker");
        return (otherWorker instanceof h) && ((h) otherWorker).f56264c == this.f56264c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return kotlin.jvm.internal.s.c(this.f56263b, hVar.f56263b) && this.f56264c == hVar.f56264c && this.f56265d == hVar.f56265d && kotlin.jvm.internal.s.c(this.f56266e, hVar.f56266e) && kotlin.jvm.internal.s.c(this.f56267f, hVar.f56267f) && kotlin.jvm.internal.s.c(this.f56268g, hVar.f56268g);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f56263b.hashCode() * 31) + this.f56264c.hashCode()) * 31) + this.f56265d.hashCode()) * 31) + this.f56266e.hashCode()) * 31) + this.f56267f.hashCode()) * 31) + this.f56268g.hashCode();
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<b> run() {
        return kotlinx.coroutines.flow.g.v(new c(null));
    }

    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.f56263b + ", side=" + this.f56264c + ", idClass=" + this.f56265d + ", governmentIdFrontFeed=" + this.f56266e + ", governmentIdBarcodePdf417Feed=" + this.f56267f + ", governmentIdFrontOrBackFeed=" + this.f56268g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}