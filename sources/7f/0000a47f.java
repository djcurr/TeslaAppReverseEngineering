package org.spongycastle.pqc.math.ntru.euclid;

/* loaded from: classes4.dex */
public class IntEuclidean {
    public int gcd;

    /* renamed from: x  reason: collision with root package name */
    public int f43882x;

    /* renamed from: y  reason: collision with root package name */
    public int f43883y;

    private IntEuclidean() {
    }

    public static IntEuclidean calculate(int i11, int i12) {
        int i13 = 1;
        int i14 = 0;
        int i15 = 1;
        int i16 = 0;
        int i17 = i11;
        int i18 = i12;
        while (i18 != 0) {
            int i19 = i17 / i18;
            int i21 = i17 % i18;
            int i22 = i16 - (i19 * i15);
            i17 = i18;
            i18 = i21;
            int i23 = i14;
            i14 = i13 - (i19 * i14);
            i13 = i23;
            i16 = i15;
            i15 = i22;
        }
        IntEuclidean intEuclidean = new IntEuclidean();
        intEuclidean.f43882x = i13;
        intEuclidean.f43883y = i16;
        intEuclidean.gcd = i17;
        return intEuclidean;
    }
}