package g20;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t00.k;
import wz.w0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: c */
    public static final b f27386c = new b(null);

    /* renamed from: d */
    private static final Set<u10.b> f27387d;

    /* renamed from: a */
    private final j f27388a;

    /* renamed from: b */
    private final h00.l<a, w00.c> f27389b;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final u10.b f27390a;

        /* renamed from: b */
        private final f f27391b;

        public a(u10.b classId, f fVar) {
            kotlin.jvm.internal.s.g(classId, "classId");
            this.f27390a = classId;
            this.f27391b = fVar;
        }

        public final f a() {
            return this.f27391b;
        }

        public final u10.b b() {
            return this.f27390a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f27390a, ((a) obj).f27390a);
        }

        public int hashCode() {
            return this.f27390a.hashCode();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<u10.b> a() {
            return h.f27387d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<a, w00.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            h.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final w00.c mo12invoke(a key) {
            kotlin.jvm.internal.s.g(key, "key");
            return h.this.c(key);
        }
    }

    static {
        Set<u10.b> c11;
        c11 = w0.c(u10.b.m(k.a.f51328d.l()));
        f27387d = c11;
    }

    public h(j components) {
        kotlin.jvm.internal.s.g(components, "components");
        this.f27388a = components;
        this.f27389b = components.u().h(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b9 A[EDGE_INSN: B:104:0x00b9->B:96:0x00b9 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w00.c c(g20.h.a r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g20.h.c(g20.h$a):w00.c");
    }

    public static /* synthetic */ w00.c e(h hVar, u10.b bVar, f fVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = null;
        }
        return hVar.d(bVar, fVar);
    }

    public final w00.c d(u10.b classId, f fVar) {
        kotlin.jvm.internal.s.g(classId, "classId");
        return this.f27389b.mo12invoke(new a(classId, fVar));
    }
}