package fj;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public interface s {

    /* loaded from: classes3.dex */
    public static class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final Random f26334a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f26335b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f26336c;

        public a(int i11) {
            this(i11, new Random());
        }

        private static int[] h(int i11, Random random) {
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                int nextInt = random.nextInt(i13);
                iArr[i12] = iArr[nextInt];
                iArr[nextInt] = i12;
                i12 = i13;
            }
            return iArr;
        }

        @Override // fj.s
        public s a(int i11, int i12) {
            int i13 = i12 - i11;
            int[] iArr = new int[this.f26335b.length - i13];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int[] iArr2 = this.f26335b;
                if (i14 < iArr2.length) {
                    if (iArr2[i14] < i11 || iArr2[i14] >= i12) {
                        iArr[i14 - i15] = iArr2[i14] >= i11 ? iArr2[i14] - i13 : iArr2[i14];
                    } else {
                        i15++;
                    }
                    i14++;
                } else {
                    return new a(iArr, new Random(this.f26334a.nextLong()));
                }
            }
        }

        @Override // fj.s
        public int b(int i11) {
            int i12 = this.f26336c[i11] - 1;
            if (i12 >= 0) {
                return this.f26335b[i12];
            }
            return -1;
        }

        @Override // fj.s
        public int c(int i11) {
            int i12 = this.f26336c[i11] + 1;
            int[] iArr = this.f26335b;
            if (i12 < iArr.length) {
                return iArr[i12];
            }
            return -1;
        }

        @Override // fj.s
        public int d() {
            int[] iArr = this.f26335b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // fj.s
        public s e() {
            return new a(0, new Random(this.f26334a.nextLong()));
        }

        @Override // fj.s
        public int f() {
            int[] iArr = this.f26335b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // fj.s
        public s g(int i11, int i12) {
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int i13 = 0;
            int i14 = 0;
            while (i14 < i12) {
                iArr[i14] = this.f26334a.nextInt(this.f26335b.length + 1);
                int i15 = i14 + 1;
                int nextInt = this.f26334a.nextInt(i15);
                iArr2[i14] = iArr2[nextInt];
                iArr2[nextInt] = i14 + i11;
                i14 = i15;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f26335b.length + i12];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f26335b;
                if (i13 < iArr4.length + i12) {
                    if (i16 < i12 && i17 == iArr[i16]) {
                        iArr3[i13] = iArr2[i16];
                        i16++;
                    } else {
                        int i18 = i17 + 1;
                        iArr3[i13] = iArr4[i17];
                        if (iArr3[i13] >= i11) {
                            iArr3[i13] = iArr3[i13] + i12;
                        }
                        i17 = i18;
                    }
                    i13++;
                } else {
                    return new a(iArr3, new Random(this.f26334a.nextLong()));
                }
            }
        }

        @Override // fj.s
        public int getLength() {
            return this.f26335b.length;
        }

        private a(int i11, Random random) {
            this(h(i11, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f26335b = iArr;
            this.f26334a = random;
            this.f26336c = new int[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                this.f26336c[iArr[i11]] = i11;
            }
        }
    }

    s a(int i11, int i12);

    int b(int i11);

    int c(int i11);

    int d();

    s e();

    int f();

    s g(int i11, int i12);

    int getLength();
}