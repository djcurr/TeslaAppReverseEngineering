package ch;

import java.util.concurrent.atomic.AtomicReference;

@Deprecated
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ch.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0180b {
        public C0180b(int i11, int i12, int[] iArr, d[] dVarArr, a[] aVarArr, int i13, int i14, int i15) {
        }
    }

    private b(int i11, boolean z11, int i12, boolean z12) {
        int i13 = 16;
        if (i11 >= 16) {
            if (((i11 - 1) & i11) != 0) {
                while (i13 < i11) {
                    i13 += i13;
                }
            }
            new AtomicReference(c(i11));
        }
        i11 = i13;
        new AtomicReference(c(i11));
    }

    public static b a() {
        long currentTimeMillis = System.currentTimeMillis();
        return b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static b b(int i11) {
        return new b(64, true, i11, true);
    }

    private C0180b c(int i11) {
        return new C0180b(0, i11 - 1, new int[i11], new d[i11], null, 0, 0, 0);
    }
}