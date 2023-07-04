package p0;

import o1.a;
import p0.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final f2.z f45331a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.s<Integer, int[], x2.q, x2.d, int[], vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45332a = new a();

        a() {
            super(5);
        }

        public final void a(int i11, int[] size, x2.q noName_2, x2.d density, int[] outPosition) {
            kotlin.jvm.internal.s.g(size, "size");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            kotlin.jvm.internal.s.g(density, "density");
            kotlin.jvm.internal.s.g(outPosition, "outPosition");
            p0.a.f45228a.h().b(density, i11, size, outPosition);
        }

        @Override // h00.s
        public /* bridge */ /* synthetic */ vz.b0 invoke(Integer num, int[] iArr, x2.q qVar, x2.d dVar, int[] iArr2) {
            a(num.intValue(), iArr, qVar, dVar, iArr2);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.s<Integer, int[], x2.q, x2.d, int[], vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.k f45333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.k kVar) {
            super(5);
            this.f45333a = kVar;
        }

        public final void a(int i11, int[] size, x2.q noName_2, x2.d density, int[] outPosition) {
            kotlin.jvm.internal.s.g(size, "size");
            kotlin.jvm.internal.s.g(noName_2, "$noName_2");
            kotlin.jvm.internal.s.g(density, "density");
            kotlin.jvm.internal.s.g(outPosition, "outPosition");
            this.f45333a.b(density, i11, size, outPosition);
        }

        @Override // h00.s
        public /* bridge */ /* synthetic */ vz.b0 invoke(Integer num, int[] iArr, x2.q qVar, x2.d dVar, int[] iArr2) {
            a(num.intValue(), iArr, qVar, dVar, iArr2);
            return vz.b0.f54756a;
        }
    }

    static {
        p pVar = p.Vertical;
        float a11 = p0.a.f45228a.h().a();
        k a12 = k.f45346a.a(o1.a.f42039a.h());
        f45331a = z.y(pVar, a.f45332a, a11, f0.Wrap, a12);
    }

    public static final f2.z a(a.k verticalArrangement, a.b horizontalAlignment, c1.i iVar, int i11) {
        f2.z y11;
        kotlin.jvm.internal.s.g(verticalArrangement, "verticalArrangement");
        kotlin.jvm.internal.s.g(horizontalAlignment, "horizontalAlignment");
        iVar.x(1466279533);
        iVar.x(-3686552);
        boolean O = iVar.O(verticalArrangement) | iVar.O(horizontalAlignment);
        Object y12 = iVar.y();
        if (O || y12 == c1.i.f8486a.a()) {
            if (kotlin.jvm.internal.s.c(verticalArrangement, p0.a.f45228a.h()) && kotlin.jvm.internal.s.c(horizontalAlignment, o1.a.f42039a.h())) {
                y11 = b();
            } else {
                p pVar = p.Vertical;
                float a11 = verticalArrangement.a();
                k a12 = k.f45346a.a(horizontalAlignment);
                y11 = z.y(pVar, new b(verticalArrangement), a11, f0.Wrap, a12);
            }
            y12 = y11;
            iVar.p(y12);
        }
        iVar.N();
        f2.z zVar = (f2.z) y12;
        iVar.N();
        return zVar;
    }

    public static final f2.z b() {
        return f45331a;
    }
}