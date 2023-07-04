package f9;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f26125a = true;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f26126a;

        /* renamed from: b  reason: collision with root package name */
        public int f26127b;
    }

    /* renamed from: f9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0512b extends a {

        /* renamed from: f  reason: collision with root package name */
        public static final int[] f26128f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g  reason: collision with root package name */
        public static final int[] f26129g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c  reason: collision with root package name */
        public int f26130c;

        /* renamed from: d  reason: collision with root package name */
        public int f26131d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f26132e;

        public C0512b(int i11, byte[] bArr) {
            this.f26126a = bArr;
            this.f26132e = (i11 & 8) == 0 ? f26128f : f26129g;
            this.f26130c = 0;
            this.f26131d = 0;
        }

        public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
            int i13 = this.f26130c;
            if (i13 == 6) {
                return false;
            }
            int i14 = i12 + i11;
            int i15 = this.f26131d;
            byte[] bArr2 = this.f26126a;
            int[] iArr = this.f26132e;
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
                                this.f26130c = 6;
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
                                this.f26130c = 6;
                                return false;
                            }
                        }
                        i23 |= i17 << 6;
                    } else if (i18 != 3) {
                        if (i18 != 4) {
                            if (i18 == 5 && i23 != -1) {
                                this.f26130c = 6;
                                return false;
                            }
                        } else if (i23 == -2) {
                            i18++;
                        } else if (i23 != -1) {
                            this.f26130c = 6;
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
                        this.f26130c = 6;
                        return false;
                    }
                    i18++;
                    i17 = i23;
                } else {
                    if (i23 < 0) {
                        if (i23 != -1) {
                            this.f26130c = 6;
                            return false;
                        }
                    }
                    i18++;
                    i17 = i23;
                }
                i19 = i22;
            }
            if (!z11) {
                this.f26130c = i18;
                this.f26131d = i17;
                this.f26127b = i16;
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
                    this.f26130c = 6;
                    return false;
                }
                this.f26130c = i18;
                this.f26127b = i16;
                return true;
            } else {
                this.f26130c = 6;
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: j  reason: collision with root package name */
        public static final byte[] f26133j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k  reason: collision with root package name */
        public static final byte[] f26134k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ boolean f26135l = true;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f26136c;

        /* renamed from: d  reason: collision with root package name */
        public int f26137d;

        /* renamed from: e  reason: collision with root package name */
        public int f26138e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f26139f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f26140g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f26141h;

        /* renamed from: i  reason: collision with root package name */
        public final byte[] f26142i;

        public c(int i11, byte[] bArr) {
            this.f26126a = bArr;
            this.f26139f = (i11 & 1) == 0;
            boolean z11 = (i11 & 2) == 0;
            this.f26140g = z11;
            this.f26141h = (i11 & 4) != 0;
            this.f26142i = (i11 & 8) == 0 ? f26133j : f26134k;
            this.f26136c = new byte[2];
            this.f26137d = 0;
            this.f26138e = z11 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:22:0x008a). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instructions count: 514
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f9.b.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i11) {
        return b(bArr, 0, bArr.length, i11);
    }

    public static byte[] b(byte[] bArr, int i11, int i12, int i13) {
        C0512b c0512b = new C0512b(i13, new byte[(i12 * 3) / 4]);
        if (c0512b.a(bArr, i11, i12, true)) {
            int i14 = c0512b.f26127b;
            byte[] bArr2 = c0512b.f26126a;
            if (i14 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr2, 0, bArr3, 0, i14);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] c(byte[] bArr, int i11) {
        return d(bArr, 0, bArr.length, i11);
    }

    public static byte[] d(byte[] bArr, int i11, int i12, int i13) {
        c cVar = new c(i13, null);
        int i14 = (i12 / 3) * 4;
        if (cVar.f26139f) {
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
        if (cVar.f26140g && i12 > 0) {
            i14 += (((i12 - 1) / 57) + 1) * (cVar.f26141h ? 2 : 1);
        }
        cVar.f26126a = new byte[i14];
        cVar.a(bArr, i11, i12, true);
        if (f26125a || cVar.f26127b == i14) {
            return cVar.f26126a;
        }
        throw new AssertionError();
    }

    public static String e(byte[] bArr, int i11) {
        try {
            return new String(c(bArr, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}