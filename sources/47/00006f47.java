package g20;

import kotlin.reflect.jvm.internal.impl.descriptors.b;

/* loaded from: classes5.dex */
public final class a0 {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27358a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f27359b;

        static {
            int[] iArr = new int[p10.j.values().length];
            iArr[p10.j.DECLARATION.ordinal()] = 1;
            iArr[p10.j.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[p10.j.DELEGATION.ordinal()] = 3;
            iArr[p10.j.SYNTHESIZED.ordinal()] = 4;
            f27358a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            iArr2[b.a.DECLARATION.ordinal()] = 1;
            iArr2[b.a.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[b.a.DELEGATION.ordinal()] = 3;
            iArr2[b.a.SYNTHESIZED.ordinal()] = 4;
            int[] iArr3 = new int[p10.x.values().length];
            iArr3[p10.x.INTERNAL.ordinal()] = 1;
            iArr3[p10.x.PRIVATE.ordinal()] = 2;
            iArr3[p10.x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[p10.x.PROTECTED.ordinal()] = 4;
            iArr3[p10.x.PUBLIC.ordinal()] = 5;
            iArr3[p10.x.LOCAL.ordinal()] = 6;
            f27359b = iArr3;
        }
    }

    public static final w00.q a(z zVar, p10.x xVar) {
        kotlin.jvm.internal.s.g(zVar, "<this>");
        switch (xVar == null ? -1 : a.f27359b[xVar.ordinal()]) {
            case 1:
                w00.q INTERNAL = w00.p.f55308d;
                kotlin.jvm.internal.s.f(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                w00.q PRIVATE = w00.p.f55305a;
                kotlin.jvm.internal.s.f(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                w00.q PRIVATE_TO_THIS = w00.p.f55306b;
                kotlin.jvm.internal.s.f(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                w00.q PROTECTED = w00.p.f55307c;
                kotlin.jvm.internal.s.f(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                w00.q PUBLIC = w00.p.f55309e;
                kotlin.jvm.internal.s.f(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                w00.q LOCAL = w00.p.f55310f;
                kotlin.jvm.internal.s.f(LOCAL, "LOCAL");
                return LOCAL;
            default:
                w00.q PRIVATE2 = w00.p.f55305a;
                kotlin.jvm.internal.s.f(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final b.a b(z zVar, p10.j jVar) {
        kotlin.jvm.internal.s.g(zVar, "<this>");
        int i11 = jVar == null ? -1 : a.f27358a[jVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return b.a.DECLARATION;
                    }
                    return b.a.SYNTHESIZED;
                }
                return b.a.DELEGATION;
            }
            return b.a.FAKE_OVERRIDE;
        }
        return b.a.DECLARATION;
    }
}