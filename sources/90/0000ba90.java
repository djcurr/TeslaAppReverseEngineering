package vz;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class m {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54769a;

        static {
            int[] iArr = new int[kotlin.b.values().length];
            iArr[kotlin.b.SYNCHRONIZED.ordinal()] = 1;
            iArr[kotlin.b.PUBLICATION.ordinal()] = 2;
            iArr[kotlin.b.NONE.ordinal()] = 3;
            f54769a = iArr;
        }
    }

    public static <T> k<T> a(h00.a<? extends T> initializer) {
        kotlin.jvm.internal.s.g(initializer, "initializer");
        return new t(initializer, null, 2, null);
    }

    public static <T> k<T> b(kotlin.b mode, h00.a<? extends T> initializer) {
        kotlin.jvm.internal.s.g(mode, "mode");
        kotlin.jvm.internal.s.g(initializer, "initializer");
        int i11 = a.f54769a[mode.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return new c0(initializer);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new s(initializer);
        }
        return new t(initializer, null, 2, null);
    }
}