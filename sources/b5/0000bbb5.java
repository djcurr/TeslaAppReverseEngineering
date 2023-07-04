package w00;

import java.util.List;

/* loaded from: classes5.dex */
public final class s {

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.o implements h00.l<u10.b, u10.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55323a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final u10.b invoke(u10.b p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return p02.g();
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return kotlin.jvm.internal.m0.b(u10.b.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<u10.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55324a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Integer invoke(u10.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return 0;
        }
    }

    public static final c a(x xVar, u10.b classId) {
        kotlin.jvm.internal.s.g(xVar, "<this>");
        kotlin.jvm.internal.s.g(classId, "classId");
        e b11 = b(xVar, classId);
        if (b11 instanceof c) {
            return (c) b11;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final w00.e b(w00.x r10, u10.b r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w00.s.b(w00.x, u10.b):w00.e");
    }

    public static final c c(x xVar, u10.b classId, z notFoundClasses) {
        u20.h k11;
        u20.h B;
        List<Integer> I;
        kotlin.jvm.internal.s.g(xVar, "<this>");
        kotlin.jvm.internal.s.g(classId, "classId");
        kotlin.jvm.internal.s.g(notFoundClasses, "notFoundClasses");
        c a11 = a(xVar, classId);
        if (a11 != null) {
            return a11;
        }
        k11 = u20.n.k(classId, a.f55323a);
        B = u20.p.B(k11, b.f55324a);
        I = u20.p.I(B);
        return notFoundClasses.d(classId, I);
    }

    public static final r0 d(x xVar, u10.b classId) {
        kotlin.jvm.internal.s.g(xVar, "<this>");
        kotlin.jvm.internal.s.g(classId, "classId");
        e b11 = b(xVar, classId);
        if (b11 instanceof r0) {
            return (r0) b11;
        }
        return null;
    }
}