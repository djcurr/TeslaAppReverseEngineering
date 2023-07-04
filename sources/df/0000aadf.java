package pl;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f46647a = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f46648a;

        /* renamed from: b  reason: collision with root package name */
        public int f46649b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends a {

        /* renamed from: f  reason: collision with root package name */
        private static final int[] f46650f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g  reason: collision with root package name */
        private static final int[] f46651g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c  reason: collision with root package name */
        private int f46652c;

        /* renamed from: d  reason: collision with root package name */
        private int f46653d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f46654e;

        public b(int i11, byte[] bArr) {
            this.f46648a = bArr;
            this.f46654e = (i11 & 8) == 0 ? f46650f : f46651g;
            this.f46652c = 0;
            this.f46653d = 0;
        }

        public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
            int i13 = this.f46652c;
            if (i13 == 6) {
                return false;
            }
            int i14 = i12 + i11;
            int i15 = this.f46653d;
            byte[] bArr2 = this.f46648a;
            int[] iArr = this.f46654e;
            int i16 = 0;
            int i17 = i15;
            int i18 = i13;
            int i19 = i11;
            while (i19 < i14) {
                if (i18 == 0) {
                    while (true) {
                        int i21 = i19 + 4;
                        if (i21 > i14 || (i17 = (iArr[bArr[i19] & 255] << 18) | (iArr[bArr[i19 + 1] & 255] << 12) | (iArr[bArr[i19 + 2] & 255] << 6) | iArr[bArr[i19 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i16 + 2] = (byte) i17;
                        bArr2[i16 + 1] = (byte) (i17 >> 8);
                        bArr2[i16] = (byte) (i17 >> 16);
                        i16 += 3;
                        i19 = i21;
                    }
                    if (i19 >= i14) {
                        break;
                    }
                }
                int i22 = i19 + 1;
                int i23 = iArr[bArr[i19] & 255];
                if (i18 != 0) {
                    if (i18 == 1) {
                        if (i23 < 0) {
                            if (i23 != -1) {
                                this.f46652c = 6;
                                return false;
                            }
                        }
                        i23 |= i17 << 6;
                    } else if (i18 == 2) {
                        if (i23 < 0) {
                            if (i23 == -2) {
                                bArr2[i16] = (byte) (i17 >> 4);
                                i16++;
                                i18 = 4;
                            } else if (i23 != -1) {
                                this.f46652c = 6;
                                return false;
                            }
                        }
                        i23 |= i17 << 6;
                    } else if (i18 != 3) {
                        if (i18 != 4) {
                            if (i18 == 5 && i23 != -1) {
                                this.f46652c = 6;
                                return false;
                            }
                        } else if (i23 == -2) {
                            i18++;
                        } else if (i23 != -1) {
                            this.f46652c = 6;
                            return false;
                        }
                    } else if (i23 >= 0) {
                        int i24 = i23 | (i17 << 6);
                        bArr2[i16 + 2] = (byte) i24;
                        bArr2[i16 + 1] = (byte) (i24 >> 8);
                        bArr2[i16] = (byte) (i24 >> 16);
                        i16 += 3;
                        i17 = i24;
                        i18 = 0;
                    } else if (i23 == -2) {
                        bArr2[i16 + 1] = (byte) (i17 >> 2);
                        bArr2[i16] = (byte) (i17 >> 10);
                        i16 += 2;
                        i18 = 5;
                    } else if (i23 != -1) {
                        this.f46652c = 6;
                        return false;
                    }
                    i18++;
                    i17 = i23;
                } else {
                    if (i23 < 0) {
                        if (i23 != -1) {
                            this.f46652c = 6;
                            return false;
                        }
                    }
                    i18++;
                    i17 = i23;
                }
                i19 = i22;
            }
            if (!z11) {
                this.f46652c = i18;
                this.f46653d = i17;
                this.f46649b = i16;
                return true;
            } else if (i18 != 1) {
                if (i18 == 2) {
                    bArr2[i16] = (byte) (i17 >> 4);
                    i16++;
                } else if (i18 == 3) {
                    int i25 = i16 + 1;
                    bArr2[i16] = (byte) (i17 >> 10);
                    i16 = i25 + 1;
                    bArr2[i25] = (byte) (i17 >> 2);
                } else if (i18 == 4) {
                    this.f46652c = 6;
                    return false;
                }
                this.f46652c = i18;
                this.f46649b = i16;
                return true;
            } else {
                this.f46652c = 6;
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c extends a {

        /* renamed from: j  reason: collision with root package name */
        private static final byte[] f46655j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k  reason: collision with root package name */
        private static final byte[] f46656k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f46657c;

        /* renamed from: d  reason: collision with root package name */
        int f46658d;

        /* renamed from: e  reason: collision with root package name */
        private int f46659e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f46660f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f46661g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f46662h;

        /* renamed from: i  reason: collision with root package name */
        private final byte[] f46663i;

        public c(int i11, byte[] bArr) {
            this.f46648a = bArr;
            this.f46660f = (i11 & 1) == 0;
            boolean z11 = (i11 & 2) == 0;
            this.f46661g = z11;
            this.f46662h = (i11 & 4) != 0;
            this.f46663i = (i11 & 8) == 0 ? f46655j : f46656k;
            this.f46657c = new byte[2];
            this.f46658d = 0;
            this.f46659e = z11 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:22:0x008a). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.f.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(String str, int i11) {
        return b(str.getBytes(f46647a), i11);
    }

    public static byte[] b(byte[] bArr, int i11) {
        return c(bArr, 0, bArr.length, i11);
    }

    public static byte[] c(byte[] bArr, int i11, int i12, int i13) {
        b bVar = new b(i13, new byte[(i12 * 3) / 4]);
        if (bVar.a(bArr, i11, i12, true)) {
            int i14 = bVar.f46649b;
            byte[] bArr2 = bVar.f46648a;
            if (i14 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr2, 0, bArr3, 0, i14);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i11) {
        return f(bArr, 0, bArr.length, i11);
    }

    public static byte[] f(byte[] bArr, int i11, int i12, int i13) {
        c cVar = new c(i13, null);
        int i14 = (i12 / 3) * 4;
        if (cVar.f46660f) {
            if (i12 % 3 > 0) {
                i14 += 4;
            }
        } else {
            int i15 = i12 % 3;
            if (i15 == 1) {
                i14 += 2;
            } else if (i15 == 2) {
                i14 += 3;
            }
        }
        if (cVar.f46661g && i12 > 0) {
            i14 += (((i12 - 1) / 57) + 1) * (cVar.f46662h ? 2 : 1);
        }
        cVar.f46648a = new byte[i14];
        cVar.a(bArr, i11, i12, true);
        return cVar.f46648a;
    }

    public static String g(byte[] bArr, int i11) {
        try {
            return new String(e(bArr, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}