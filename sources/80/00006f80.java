package g20;

import k20.k1;
import kotlin.NoWhenBranchMatchedException;
import p10.c;
import p10.q;
import p10.s;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f27479a = new z();

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27480a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f27481b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f27482c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f27483d;

        static {
            int[] iArr = new int[p10.k.values().length];
            iArr[p10.k.FINAL.ordinal()] = 1;
            iArr[p10.k.OPEN.ordinal()] = 2;
            iArr[p10.k.ABSTRACT.ordinal()] = 3;
            iArr[p10.k.SEALED.ordinal()] = 4;
            f27480a = iArr;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.descriptors.f.values().length];
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN.ordinal()] = 2;
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT.ordinal()] = 3;
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED.ordinal()] = 4;
            int[] iArr3 = new int[p10.x.values().length];
            iArr3[p10.x.INTERNAL.ordinal()] = 1;
            iArr3[p10.x.PRIVATE.ordinal()] = 2;
            iArr3[p10.x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[p10.x.PROTECTED.ordinal()] = 4;
            iArr3[p10.x.PUBLIC.ordinal()] = 5;
            iArr3[p10.x.LOCAL.ordinal()] = 6;
            int[] iArr4 = new int[c.EnumC0974c.values().length];
            iArr4[c.EnumC0974c.CLASS.ordinal()] = 1;
            iArr4[c.EnumC0974c.INTERFACE.ordinal()] = 2;
            iArr4[c.EnumC0974c.ENUM_CLASS.ordinal()] = 3;
            iArr4[c.EnumC0974c.ENUM_ENTRY.ordinal()] = 4;
            iArr4[c.EnumC0974c.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[c.EnumC0974c.OBJECT.ordinal()] = 6;
            iArr4[c.EnumC0974c.COMPANION_OBJECT.ordinal()] = 7;
            f27481b = iArr4;
            int[] iArr5 = new int[kotlin.reflect.jvm.internal.impl.descriptors.c.values().length];
            iArr5[kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS.ordinal()] = 1;
            iArr5[kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE.ordinal()] = 2;
            iArr5[kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS.ordinal()] = 3;
            iArr5[kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY.ordinal()] = 4;
            iArr5[kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[kotlin.reflect.jvm.internal.impl.descriptors.c.OBJECT.ordinal()] = 6;
            int[] iArr6 = new int[s.c.values().length];
            iArr6[s.c.IN.ordinal()] = 1;
            iArr6[s.c.OUT.ordinal()] = 2;
            iArr6[s.c.INV.ordinal()] = 3;
            f27482c = iArr6;
            int[] iArr7 = new int[q.b.c.values().length];
            iArr7[q.b.c.IN.ordinal()] = 1;
            iArr7[q.b.c.OUT.ordinal()] = 2;
            iArr7[q.b.c.INV.ordinal()] = 3;
            iArr7[q.b.c.STAR.ordinal()] = 4;
            f27483d = iArr7;
            int[] iArr8 = new int[k1.values().length];
            iArr8[k1.IN_VARIANCE.ordinal()] = 1;
            iArr8[k1.OUT_VARIANCE.ordinal()] = 2;
            iArr8[k1.INVARIANT.ordinal()] = 3;
        }
    }

    private z() {
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.c a(c.EnumC0974c enumC0974c) {
        switch (enumC0974c == null ? -1 : a.f27481b[enumC0974c.ordinal()]) {
            case 1:
                return kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS;
            case 2:
                return kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE;
            case 3:
                return kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS;
            case 4:
                return kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY;
            case 5:
                return kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS;
            case 6:
            case 7:
                return kotlin.reflect.jvm.internal.impl.descriptors.c.OBJECT;
            default:
                return kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.f b(p10.k kVar) {
        int i11 = kVar == null ? -1 : a.f27480a[kVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
                    }
                    return kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED;
                }
                return kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
            }
            return kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
    }

    public final k1 c(q.b.c projection) {
        kotlin.jvm.internal.s.g(projection, "projection");
        int i11 = a.f27483d[projection.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Only IN, OUT and INV are supported. Actual argument: ", projection));
                }
                return k1.INVARIANT;
            }
            return k1.OUT_VARIANCE;
        }
        return k1.IN_VARIANCE;
    }

    public final k1 d(s.c variance) {
        kotlin.jvm.internal.s.g(variance, "variance");
        int i11 = a.f27482c[variance.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return k1.INVARIANT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return k1.OUT_VARIANCE;
        }
        return k1.IN_VARIANCE;
    }
}