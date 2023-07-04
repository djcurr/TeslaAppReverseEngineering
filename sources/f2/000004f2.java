package androidx.compose.ui.platform;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static h00.l<? super s2.v, ? extends s2.c0> f3143a = a.f3144a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<s2.v, s2.c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3144a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final s2.c0 invoke(s2.v it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return new s2.c0(it2);
        }
    }

    private static final float c(float[] fArr, int i11, float[] fArr2, int i12) {
        int i13 = i11 * 4;
        return (fArr[i13 + 0] * fArr2[0 + i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 3] * fArr2[12 + i12]);
    }

    public static final x2.q d(Configuration configuration) {
        kotlin.jvm.internal.s.g(configuration, "<this>");
        return f(configuration.getLayoutDirection());
    }

    public static final h00.l<s2.v, s2.c0> e() {
        return f3143a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x2.q f(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return x2.q.Ltr;
            }
            return x2.q.Rtl;
        }
        return x2.q.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(float[] fArr, float[] fArr2) {
        float c11 = c(fArr2, 0, fArr, 0);
        float c12 = c(fArr2, 0, fArr, 1);
        float c13 = c(fArr2, 0, fArr, 2);
        float c14 = c(fArr2, 0, fArr, 3);
        float c15 = c(fArr2, 1, fArr, 0);
        float c16 = c(fArr2, 1, fArr, 1);
        float c17 = c(fArr2, 1, fArr, 2);
        float c18 = c(fArr2, 1, fArr, 3);
        float c19 = c(fArr2, 2, fArr, 0);
        float c21 = c(fArr2, 2, fArr, 1);
        float c22 = c(fArr2, 2, fArr, 2);
        float c23 = c(fArr2, 2, fArr, 3);
        float c24 = c(fArr2, 3, fArr, 0);
        float c25 = c(fArr2, 3, fArr, 1);
        float c26 = c(fArr2, 3, fArr, 2);
        float c27 = c(fArr2, 3, fArr, 3);
        fArr[0] = c11;
        fArr[1] = c12;
        fArr[2] = c13;
        fArr[3] = c14;
        fArr[4] = c15;
        fArr[5] = c16;
        fArr[6] = c17;
        fArr[7] = c18;
        fArr[8] = c19;
        fArr[9] = c21;
        fArr[10] = c22;
        fArr[11] = c23;
        fArr[12] = c24;
        fArr[13] = c25;
        fArr[14] = c26;
        fArr[15] = c27;
    }
}