package p0;

import o1.a;
import p0.a;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final f2.z f45246a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.s<Integer, int[], x2.q, x2.d, int[], vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45247a = new a();

        a() {
            super(5);
        }

        public final void a(int i11, int[] size, x2.q layoutDirection, x2.d density, int[] outPosition) {
            kotlin.jvm.internal.s.g(size, "size");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(density, "density");
            kotlin.jvm.internal.s.g(outPosition, "outPosition");
            p0.a.f45228a.g().c(density, i11, size, layoutDirection, outPosition);
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
        final /* synthetic */ a.d f45248a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.d dVar) {
            super(5);
            this.f45248a = dVar;
        }

        public final void a(int i11, int[] size, x2.q layoutDirection, x2.d density, int[] outPosition) {
            kotlin.jvm.internal.s.g(size, "size");
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(density, "density");
            kotlin.jvm.internal.s.g(outPosition, "outPosition");
            this.f45248a.c(density, i11, size, layoutDirection, outPosition);
        }

        @Override // h00.s
        public /* bridge */ /* synthetic */ vz.b0 invoke(Integer num, int[] iArr, x2.q qVar, x2.d dVar, int[] iArr2) {
            a(num.intValue(), iArr, qVar, dVar, iArr2);
            return vz.b0.f54756a;
        }
    }

    static {
        p pVar = p.Horizontal;
        float a11 = p0.a.f45228a.g().a();
        k b11 = k.f45346a.b(o1.a.f42039a.i());
        f45246a = z.y(pVar, a.f45247a, a11, f0.Wrap, b11);
    }

    public static final f2.z a() {
        return f45246a;
    }

    public static final f2.z b(a.d horizontalArrangement, a.c verticalAlignment, c1.i iVar, int i11) {
        f2.z y11;
        kotlin.jvm.internal.s.g(horizontalArrangement, "horizontalArrangement");
        kotlin.jvm.internal.s.g(verticalAlignment, "verticalAlignment");
        iVar.x(495203992);
        iVar.x(-3686552);
        boolean O = iVar.O(horizontalArrangement) | iVar.O(verticalAlignment);
        Object y12 = iVar.y();
        if (O || y12 == c1.i.f8486a.a()) {
            if (kotlin.jvm.internal.s.c(horizontalArrangement, p0.a.f45228a.g()) && kotlin.jvm.internal.s.c(verticalAlignment, o1.a.f42039a.i())) {
                y11 = a();
            } else {
                p pVar = p.Horizontal;
                float a11 = horizontalArrangement.a();
                k b11 = k.f45346a.b(verticalAlignment);
                y11 = z.y(pVar, new b(horizontalArrangement), a11, f0.Wrap, b11);
            }
            y12 = y11;
            iVar.p(y12);
        }
        iVar.N();
        f2.z zVar = (f2.z) y12;
        iVar.N();
        return zVar;
    }
}