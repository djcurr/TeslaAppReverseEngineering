package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    private static final b f16375a;

    /* loaded from: classes3.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) {
            if (!m(b12) && (((b11 << 28) + (b12 + 112)) >> 30) == 0 && !m(b13) && !m(b14)) {
                int r11 = ((b11 & 7) << 18) | (r(b12) << 12) | (r(b13) << 6) | r(b14);
                cArr[i11] = l(r11);
                cArr[i11 + 1] = q(r11);
                return;
            }
            throw InvalidProtocolBufferException.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b11, char[] cArr, int i11) {
            cArr[i11] = (char) b11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b11, byte b12, byte b13, char[] cArr, int i11) {
            if (!m(b12) && ((b11 != -32 || b12 >= -96) && ((b11 != -19 || b12 < -96) && !m(b13)))) {
                cArr[i11] = (char) (((b11 & 15) << 12) | (r(b12) << 6) | r(b13));
                return;
            }
            throw InvalidProtocolBufferException.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b11, byte b12, char[] cArr, int i11) {
            if (b11 >= -62 && !m(b12)) {
                cArr[i11] = (char) (((b11 & 31) << 6) | r(b12));
                return;
            }
            throw InvalidProtocolBufferException.c();
        }

        private static char l(int i11) {
            return (char) ((i11 >>> 10) + 55232);
        }

        private static boolean m(byte b11) {
            return b11 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b11) {
            return b11 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b11) {
            return b11 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b11) {
            return b11 < -32;
        }

        private static char q(int i11) {
            return (char) ((i11 & 1023) + 56320);
        }

        private static int r(byte b11) {
            return b11 & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i11, int i12);

        abstract int b(CharSequence charSequence, byte[] bArr, int i11, int i12);

        final boolean c(byte[] bArr, int i11, int i12) {
            return d(0, bArr, i11, i12) == 0;
        }

        abstract int d(int i11, byte[] bArr, int i12, int i13);
    }

    /* loaded from: classes3.dex */
    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            return f(bArr, i11, i12);
        }

        private static int f(byte[] bArr, int i11, int i12) {
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i11 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    } else if (b11 >= -16) {
                        if (i13 >= i12 - 2) {
                            return q1.l(bArr, i13, i12);
                        }
                        int i14 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i13 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i13 >= i12 - 1) {
                        return q1.l(bArr, i13, i12);
                    } else {
                        int i16 = i13 + 1;
                        byte b13 = bArr[i13];
                        if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                            i11 = i16 + 1;
                            if (bArr[i16] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                i11 = i13;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.b
        String a(byte[] bArr, int i11, int i12) {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
                int i13 = i11 + i12;
                char[] cArr = new char[i12];
                int i14 = 0;
                while (i11 < i13) {
                    byte b11 = bArr[i11];
                    if (!a.n(b11)) {
                        break;
                    }
                    i11++;
                    a.i(b11, cArr, i14);
                    i14++;
                }
                int i15 = i14;
                while (i11 < i13) {
                    int i16 = i11 + 1;
                    byte b12 = bArr[i11];
                    if (a.n(b12)) {
                        int i17 = i15 + 1;
                        a.i(b12, cArr, i15);
                        while (i16 < i13) {
                            byte b13 = bArr[i16];
                            if (!a.n(b13)) {
                                break;
                            }
                            i16++;
                            a.i(b13, cArr, i17);
                            i17++;
                        }
                        i11 = i16;
                        i15 = i17;
                    } else if (a.p(b12)) {
                        if (i16 < i13) {
                            a.k(b12, bArr[i16], cArr, i15);
                            i11 = i16 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (a.o(b12)) {
                        if (i16 < i13 - 1) {
                            int i18 = i16 + 1;
                            a.j(b12, bArr[i16], bArr[i18], cArr, i15);
                            i11 = i18 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (i16 < i13 - 2) {
                        int i19 = i16 + 1;
                        byte b14 = bArr[i16];
                        int i21 = i19 + 1;
                        a.h(b12, b14, bArr[i19], bArr[i21], cArr, i15);
                        i11 = i21 + 1;
                        i15 = i15 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.c();
                    }
                }
                return new String(cArr, 0, i15);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q1.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
            if (r8[r9] > (-65)) goto L51;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.q1.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.crypto.tink.shaded.protobuf.q1.a(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = com.google.crypto.tink.shaded.protobuf.q1.b(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q1.c.d(int, byte[], int, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class d extends IllegalArgumentException {
        d(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    /* loaded from: classes3.dex */
    static final class e extends b {
        e() {
        }

        static boolean e() {
            return p1.C() && p1.D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int f(byte[] r8, long r9, int r11) {
            /*
                int r0 = g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.p1.s(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.p1.s(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = h(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.p1.s(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.crypto.tink.shaded.protobuf.p1.s(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = h(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.p1.s(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.p1.s(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.p1.s(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q1.e.f(byte[], long, int):int");
        }

        private static int g(byte[] bArr, long j11, int i11) {
            int i12 = 0;
            if (i11 < 16) {
                return 0;
            }
            while (i12 < i11) {
                long j12 = 1 + j11;
                if (p1.s(bArr, j11) < 0) {
                    return i12;
                }
                i12++;
                j11 = j12;
            }
            return i11;
        }

        private static int h(byte[] bArr, int i11, long j11, int i12) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        return q1.k(i11, p1.s(bArr, j11), p1.s(bArr, j11 + 1));
                    }
                    throw new AssertionError();
                }
                return q1.j(i11, p1.s(bArr, j11));
            }
            return q1.i(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.b
        String a(byte[] bArr, int i11, int i12) {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
                int i13 = i11 + i12;
                char[] cArr = new char[i12];
                int i14 = 0;
                while (i11 < i13) {
                    byte s11 = p1.s(bArr, i11);
                    if (!a.n(s11)) {
                        break;
                    }
                    i11++;
                    a.i(s11, cArr, i14);
                    i14++;
                }
                int i15 = i14;
                while (i11 < i13) {
                    int i16 = i11 + 1;
                    byte s12 = p1.s(bArr, i11);
                    if (a.n(s12)) {
                        int i17 = i15 + 1;
                        a.i(s12, cArr, i15);
                        while (i16 < i13) {
                            byte s13 = p1.s(bArr, i16);
                            if (!a.n(s13)) {
                                break;
                            }
                            i16++;
                            a.i(s13, cArr, i17);
                            i17++;
                        }
                        i11 = i16;
                        i15 = i17;
                    } else if (a.p(s12)) {
                        if (i16 < i13) {
                            a.k(s12, p1.s(bArr, i16), cArr, i15);
                            i11 = i16 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (a.o(s12)) {
                        if (i16 < i13 - 1) {
                            int i18 = i16 + 1;
                            a.j(s12, p1.s(bArr, i16), p1.s(bArr, i18), cArr, i15);
                            i11 = i18 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (i16 < i13 - 2) {
                        int i19 = i16 + 1;
                        int i21 = i19 + 1;
                        a.h(s12, p1.s(bArr, i16), p1.s(bArr, i19), p1.s(bArr, i21), cArr, i15);
                        i11 = i21 + 1;
                        i15 = i15 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.c();
                    }
                }
                return new String(cArr, 0, i15);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.b
        int b(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            char c11;
            long j11;
            long j12;
            long j13;
            char c12;
            int i13;
            char charAt;
            long j14 = i11;
            long j15 = i12 + j14;
            int length = charSequence.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                c11 = 128;
                j11 = 1;
                if (i14 >= length || (charAt = charSequence.charAt(i14)) >= 128) {
                    break;
                }
                p1.H(bArr, j14, (byte) charAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char charAt2 = charSequence.charAt(i14);
                if (charAt2 < c11 && j14 < j15) {
                    long j16 = j14 + j11;
                    p1.H(bArr, j14, (byte) charAt2);
                    j13 = j11;
                    j12 = j16;
                    c12 = c11;
                } else if (charAt2 < 2048 && j14 <= j15 - 2) {
                    long j17 = j14 + j11;
                    p1.H(bArr, j14, (byte) ((charAt2 >>> 6) | 960));
                    long j18 = j17 + j11;
                    p1.H(bArr, j17, (byte) ((charAt2 & '?') | 128));
                    long j19 = j11;
                    c12 = 128;
                    j12 = j18;
                    j13 = j19;
                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j14 > j15 - 3) {
                    if (j14 <= j15 - 4) {
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char charAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j21 = j14 + 1;
                                p1.H(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                long j22 = j21 + 1;
                                c12 = 128;
                                p1.H(bArr, j21, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j23 = j22 + 1;
                                p1.H(bArr, j22, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 = 1;
                                j12 = j23 + 1;
                                p1.H(bArr, j23, (byte) ((codePoint & 63) | 128));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new d(i14 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                        throw new d(i14, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j14);
                    }
                } else {
                    long j24 = j14 + j11;
                    p1.H(bArr, j14, (byte) ((charAt2 >>> '\f') | 480));
                    long j25 = j24 + j11;
                    p1.H(bArr, j24, (byte) (((charAt2 >>> 6) & 63) | 128));
                    p1.H(bArr, j25, (byte) ((charAt2 & '?') | 128));
                    j12 = j25 + 1;
                    j13 = 1;
                    c12 = 128;
                }
                i14++;
                c11 = c12;
                long j26 = j13;
                j14 = j12;
                j11 = j26;
            }
            return (int) j14;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
            if (com.google.crypto.tink.shaded.protobuf.p1.s(r13, r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
            if (com.google.crypto.tink.shaded.protobuf.p1.s(r13, r2) > (-65)) goto L56;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q1.e.d(int, byte[], int, int):int");
        }
    }

    static {
        b cVar;
        if (e.e() && !com.google.crypto.tink.shaded.protobuf.d.c()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        f16375a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr, int i11, int i12) {
        return f16375a.a(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return f16375a.b(charSequence, bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = charSequence.charAt(i11);
                if (charAt >= 2048) {
                    i12 += h(charSequence, i11);
                    break;
                }
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) < 65536) {
                        throw new d(i11, length);
                    }
                    i11++;
                }
            }
            i11++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return k(b11, bArr[i11], bArr[i11 + 1]);
                }
                throw new AssertionError();
            }
            return j(b11, bArr[i11]);
        }
        return i(b11);
    }

    public static boolean m(byte[] bArr) {
        return f16375a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i11, int i12) {
        return f16375a.c(bArr, i11, i12);
    }
}