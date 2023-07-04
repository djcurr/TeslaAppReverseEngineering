package net.time4j.history;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f41356c;

    /* renamed from: d  reason: collision with root package name */
    private static final h f41357d = h.f(j.AD, 8, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    private static final h f41358e = h.f(j.BC, 45, 1, 1);

    /* renamed from: f  reason: collision with root package name */
    public static final a f41359f;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f41360a;

    /* renamed from: b  reason: collision with root package name */
    private final b f41361b;

    /* renamed from: net.time4j.history.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0808a implements b {
        C0808a() {
        }

        private int a(int i11, int i12) {
            switch (i12) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return c(i11) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    throw new IllegalArgumentException("Invalid month: " + i12);
            }
        }

        private int b(h hVar) {
            return hVar.c().annoDomini(hVar.d());
        }

        private boolean c(int i11) {
            return Arrays.binarySearch(a.this.f41360a, i11) >= 0;
        }

        @Override // net.time4j.history.b
        public h fromMJD(long j11) {
            long j12 = -676021;
            if (j11 >= -676021) {
                return c.JULIAN.fromMJD(j11);
            }
            int i11 = 7;
            while (i11 >= -44) {
                j12 -= c(i11) ? 366L : 365L;
                if (j12 <= j11) {
                    int i12 = 1;
                    while (i12 <= 12) {
                        long a11 = a(i11, i12) + j12;
                        if (a11 > j11) {
                            j jVar = i11 <= 0 ? j.BC : j.AD;
                            if (i11 <= 0) {
                                i11 = 1 - i11;
                            }
                            return h.f(jVar, i11, i12, (int) ((j11 - j12) + 1));
                        }
                        i12++;
                        j12 = a11;
                    }
                    continue;
                }
                i11--;
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + j11);
        }

        @Override // net.time4j.history.b
        public int getMaximumDayOfMonth(h hVar) {
            if (hVar.compareTo(a.f41357d) < 0) {
                if (hVar.compareTo(a.f41358e) >= 0) {
                    return a(b(hVar), hVar.getMonth());
                }
                throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
            }
            return c.JULIAN.getMaximumDayOfMonth(hVar);
        }

        @Override // net.time4j.history.b
        public boolean isValid(h hVar) {
            int b11;
            if (hVar == null || (b11 = b(hVar)) < -44) {
                return false;
            }
            if (b11 >= 8) {
                return c.JULIAN.isValid(hVar);
            }
            return hVar.b() <= a(b11, hVar.getMonth());
        }

        @Override // net.time4j.history.b
        public long toMJD(h hVar) {
            if (hVar.compareTo(a.f41357d) < 0) {
                if (hVar.compareTo(a.f41358e) >= 0) {
                    long j11 = -676021;
                    int b11 = b(hVar);
                    for (int i11 = 7; i11 >= b11; i11--) {
                        j11 -= c(i11) ? 366L : 365L;
                    }
                    for (int i12 = 1; i12 < hVar.getMonth(); i12++) {
                        j11 += a(b11, i12);
                    }
                    return (j11 + hVar.b()) - 1;
                }
                throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
            }
            return c.JULIAN.toMJD(hVar);
        }
    }

    static {
        int[] iArr = {42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9};
        f41356c = iArr;
        f41359f = new a(iArr);
    }

    private a(int... iArr) {
        int i11;
        int[] iArr2 = new int[iArr.length];
        int i12 = 0;
        while (true) {
            if (i12 >= iArr.length) {
                break;
            }
            iArr2[i12] = 1 - iArr[i12];
            i12++;
        }
        Arrays.sort(iArr2);
        this.f41360a = iArr2;
        if (iArr2.length != 0) {
            if (iArr2[0] >= -44 && iArr2[iArr2.length - 1] < 8) {
                int i13 = iArr2[0];
                for (i11 = 1; i11 < iArr.length; i11++) {
                    if (iArr2[i11] != i13) {
                        i13 = iArr2[i11];
                    } else {
                        throw new IllegalArgumentException("Contains duplicates: " + Arrays.toString(iArr));
                    }
                }
                this.f41361b = new C0808a();
                return;
            }
            throw new IllegalArgumentException("Out of range: " + Arrays.toString(iArr));
        }
        throw new IllegalArgumentException("Missing leap years.");
    }

    public static a f(int... iArr) {
        if (Arrays.equals(iArr, f41356c)) {
            return f41359f;
        }
        return new a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b d() {
        return this.f41361b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e() {
        return this.f41360a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f41360a == ((a) obj).f41360a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f41360a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f41360a.length; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            int i12 = 1 - this.f41360a[i11];
            if (i12 > 0) {
                sb2.append("BC ");
                sb2.append(i12);
            } else {
                sb2.append("AD ");
                sb2.append(this.f41360a[i11]);
            }
        }
        return sb2.toString();
    }
}