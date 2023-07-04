package i50;

/* loaded from: classes5.dex */
public class l implements org.bouncycastle.crypto.r {

    /* renamed from: g  reason: collision with root package name */
    private static long[] f30064g = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* renamed from: a  reason: collision with root package name */
    protected long[] f30065a;

    /* renamed from: b  reason: collision with root package name */
    protected byte[] f30066b;

    /* renamed from: c  reason: collision with root package name */
    protected int f30067c;

    /* renamed from: d  reason: collision with root package name */
    protected int f30068d;

    /* renamed from: e  reason: collision with root package name */
    protected int f30069e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f30070f;

    public l() {
        this(288);
    }

    public l(int i11) {
        this.f30065a = new long[25];
        this.f30066b = new byte[192];
        h(i11);
    }

    public l(l lVar) {
        long[] jArr = new long[25];
        this.f30065a = jArr;
        this.f30066b = new byte[192];
        long[] jArr2 = lVar.f30065a;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = lVar.f30066b;
        System.arraycopy(bArr, 0, this.f30066b, 0, bArr.length);
        this.f30067c = lVar.f30067c;
        this.f30068d = lVar.f30068d;
        this.f30069e = lVar.f30069e;
        this.f30070f = lVar.f30070f;
    }

    private void a(byte[] bArr, int i11) {
        int i12 = this.f30067c >>> 6;
        for (int i13 = 0; i13 < i12; i13++) {
            long[] jArr = this.f30065a;
            jArr[i13] = jArr[i13] ^ r70.i.p(bArr, i11);
            i11 += 8;
        }
        org.bouncycastle.util.encoders.b.f(g()).toLowerCase();
        c();
    }

    private void b() {
        c();
        g();
        r70.i.w(this.f30065a, 0, this.f30067c >>> 6, this.f30066b, 0);
        this.f30068d = this.f30067c;
    }

    private void c() {
        long[] jArr = this.f30065a;
        int i11 = 0;
        long j11 = jArr[0];
        char c11 = 1;
        long j12 = jArr[1];
        long j13 = jArr[2];
        char c12 = 3;
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = jArr[8];
        long j21 = jArr[9];
        long j22 = jArr[10];
        long j23 = jArr[11];
        long j24 = jArr[12];
        long j25 = jArr[13];
        long j26 = jArr[14];
        long j27 = jArr[15];
        long j28 = jArr[16];
        long j29 = jArr[17];
        long j31 = jArr[18];
        long j32 = jArr[19];
        long j33 = jArr[20];
        long j34 = jArr[21];
        long j35 = jArr[22];
        long j36 = jArr[23];
        int i12 = 24;
        long j37 = jArr[24];
        while (i11 < i12) {
            long j38 = (((j11 ^ j16) ^ j22) ^ j27) ^ j33;
            long j39 = (((j12 ^ j17) ^ j23) ^ j28) ^ j34;
            long j41 = (((j13 ^ j18) ^ j24) ^ j29) ^ j35;
            long j42 = (((j14 ^ j19) ^ j25) ^ j31) ^ j36;
            long j43 = (((j15 ^ j21) ^ j26) ^ j32) ^ j37;
            long j44 = ((j39 << c11) | (j39 >>> (-1))) ^ j43;
            long j45 = ((j41 << c11) | (j41 >>> (-1))) ^ j38;
            long j46 = ((j42 << c11) | (j42 >>> (-1))) ^ j39;
            long j47 = ((j43 << c11) | (j43 >>> (-1))) ^ j41;
            long j48 = ((j38 << c11) | (j38 >>> (-1))) ^ j42;
            long j49 = j11 ^ j44;
            long j51 = j16 ^ j44;
            long j52 = j22 ^ j44;
            long j53 = j27 ^ j44;
            long j54 = j33 ^ j44;
            long j55 = j12 ^ j45;
            long j56 = j17 ^ j45;
            long j57 = j23 ^ j45;
            long j58 = j28 ^ j45;
            long j59 = j34 ^ j45;
            long j61 = j13 ^ j46;
            long j62 = j18 ^ j46;
            long j63 = j24 ^ j46;
            long j64 = j29 ^ j46;
            long j65 = j35 ^ j46;
            long j66 = j14 ^ j47;
            long j67 = j19 ^ j47;
            long j68 = j25 ^ j47;
            long j69 = j31 ^ j47;
            long j71 = j36 ^ j47;
            long j72 = j15 ^ j48;
            long j73 = j21 ^ j48;
            long j74 = j26 ^ j48;
            long j75 = j32 ^ j48;
            long j76 = j37 ^ j48;
            long j77 = (j55 << c11) | (j55 >>> 63);
            long j78 = (j56 << 44) | (j56 >>> 20);
            long j79 = (j73 << 20) | (j73 >>> 44);
            long j81 = (j65 << 61) | (j65 >>> c12);
            long j82 = (j74 << 39) | (j74 >>> 25);
            long j83 = (j54 << 18) | (j54 >>> 46);
            long j84 = (j61 << 62) | (j61 >>> 2);
            long j85 = (j63 << 43) | (j63 >>> 21);
            long j86 = (j68 << 25) | (j68 >>> 39);
            long j87 = (j75 << 8) | (j75 >>> 56);
            long j88 = (j71 << 56) | (j71 >>> 8);
            long j89 = (j53 << 41) | (j53 >>> 23);
            long j90 = (j72 << 27) | (j72 >>> 37);
            long j91 = (j76 << 14) | (j76 >>> 50);
            long j92 = (j59 << 2) | (j59 >>> 62);
            long j93 = (j67 << 55) | (j67 >>> 9);
            long j94 = (j58 << 45) | (j58 >>> 19);
            long j95 = (j51 << 36) | (j51 >>> 28);
            long j96 = (j66 << 28) | (j66 >>> 36);
            long j97 = (j69 << 21) | (j69 >>> 43);
            long j98 = (j64 << 15) | (j64 >>> 49);
            long j99 = (j57 << 10) | (j57 >>> 54);
            long j100 = (j62 << 6) | (j62 >>> 58);
            long j101 = (j52 << 3) | (j52 >>> 61);
            long j102 = ((~j78) & j85) ^ j49;
            long j103 = ((~j85) & j97) ^ j78;
            j13 = j85 ^ ((~j97) & j91);
            j14 = j97 ^ ((~j91) & j49);
            long j104 = j91 ^ ((~j49) & j78);
            long j105 = j96 ^ ((~j79) & j101);
            long j106 = ((~j101) & j94) ^ j79;
            long j107 = ((~j94) & j81) ^ j101;
            long j108 = j94 ^ ((~j81) & j96);
            long j109 = ((~j96) & j79) ^ j81;
            j22 = j77 ^ ((~j100) & j86);
            long j110 = ((~j86) & j87) ^ j100;
            long j111 = ((~j87) & j83) ^ j86;
            long j112 = j87 ^ ((~j83) & j77);
            long j113 = ((~j77) & j100) ^ j83;
            long j114 = j90 ^ ((~j95) & j99);
            long j115 = ((~j99) & j98) ^ j95;
            long j116 = j99 ^ ((~j98) & j88);
            long j117 = ((~j88) & j90) ^ j98;
            long j118 = ((~j90) & j95) ^ j88;
            long j119 = ((~j82) & j89) ^ j93;
            j33 = j84 ^ ((~j93) & j82);
            long j120 = j102 ^ f30064g[i11];
            i11++;
            j17 = j106;
            j24 = j111;
            j23 = j110;
            j25 = j112;
            j34 = j119;
            c12 = 3;
            j36 = ((~j92) & j84) ^ j89;
            j35 = j82 ^ ((~j89) & j92);
            j21 = j109;
            jArr = jArr;
            j32 = j118;
            j26 = j113;
            j18 = j107;
            j19 = j108;
            j29 = j116;
            j27 = j114;
            j15 = j104;
            j16 = j105;
            i12 = 24;
            j31 = j117;
            j28 = j115;
            c11 = 1;
            j12 = j103;
            j37 = ((~j84) & j93) ^ j92;
            j11 = j120;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j11;
        jArr2[1] = j12;
        jArr2[2] = j13;
        jArr2[3] = j14;
        jArr2[4] = j15;
        jArr2[5] = j16;
        jArr2[6] = j17;
        jArr2[7] = j18;
        jArr2[8] = j19;
        jArr2[9] = j21;
        jArr2[10] = j22;
        jArr2[11] = j23;
        jArr2[12] = j24;
        jArr2[13] = j25;
        jArr2[14] = j26;
        jArr2[15] = j27;
        jArr2[16] = j28;
        jArr2[17] = j29;
        jArr2[18] = j31;
        jArr2[19] = j32;
        jArr2[20] = j33;
        jArr2[21] = j34;
        jArr2[22] = j35;
        jArr2[23] = j36;
        jArr2[24] = j37;
    }

    private void h(int i11) {
        if (i11 != 128 && i11 != 224 && i11 != 256 && i11 != 288 && i11 != 384 && i11 != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        i(1600 - (i11 << 1));
    }

    private void i(int i11) {
        if (i11 <= 0 || i11 >= 1600 || i11 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f30067c = i11;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f30065a;
            if (i12 >= jArr.length) {
                org.bouncycastle.util.a.y(this.f30066b, (byte) 0);
                this.f30068d = 0;
                this.f30070f = false;
                this.f30069e = (1600 - i11) / 2;
                return;
            }
            jArr[i12] = 0;
            i12++;
        }
    }

    private void j() {
        byte[] bArr = this.f30066b;
        int i11 = this.f30068d;
        int i12 = i11 >>> 3;
        bArr[i12] = (byte) (bArr[i12] | ((byte) (1 << (i11 & 7))));
        int i13 = i11 + 1;
        this.f30068d = i13;
        if (i13 == this.f30067c) {
            a(bArr, 0);
        } else {
            int i14 = i13 >>> 6;
            int i15 = i13 & 63;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                long[] jArr = this.f30065a;
                jArr[i17] = jArr[i17] ^ r70.i.p(this.f30066b, i16);
                i16 += 8;
            }
            g();
            if (i15 > 0) {
                long[] jArr2 = this.f30065a;
                jArr2[i14] = (((1 << i15) - 1) & r70.i.p(this.f30066b, i16)) ^ jArr2[i14];
            }
        }
        long[] jArr3 = this.f30065a;
        int i18 = (this.f30067c - 1) >>> 6;
        jArr3[i18] = jArr3[i18] ^ Long.MIN_VALUE;
        this.f30068d = 0;
        this.f30070f = true;
    }

    protected void d(byte b11) {
        int i11 = this.f30068d;
        if (i11 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f30070f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.f30066b;
        bArr[i11 >>> 3] = b11;
        int i12 = i11 + 8;
        this.f30068d = i12;
        if (i12 == this.f30067c) {
            a(bArr, 0);
            this.f30068d = 0;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        k(bArr, i11, this.f30069e);
        reset();
        return getDigestSize();
    }

    protected void e(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = this.f30068d;
        if (i16 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f30070f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i17 = i16 >>> 3;
        int i18 = this.f30067c >>> 3;
        int i19 = i18 - i17;
        if (i12 < i19) {
            System.arraycopy(bArr, i11, this.f30066b, i17, i12);
            i15 = this.f30068d + (i12 << 3);
        } else {
            if (i17 > 0) {
                System.arraycopy(bArr, i11, this.f30066b, i17, i19);
                i13 = i19 + 0;
                a(this.f30066b, 0);
            } else {
                i13 = 0;
            }
            while (true) {
                i14 = i12 - i13;
                if (i14 < i18) {
                    break;
                }
                a(bArr, i11 + i13);
                i13 += i18;
            }
            System.arraycopy(bArr, i11 + i13, this.f30066b, 0, i14);
            i15 = i14 << 3;
        }
        this.f30068d = i15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(int i11, int i12) {
        if (i12 < 1 || i12 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i13 = this.f30068d;
        if (i13 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f30070f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.f30066b[i13 >>> 3] = (byte) (i11 & ((1 << i12) - 1));
        this.f30068d = i13 + i12;
    }

    protected byte[] g() {
        byte[] bArr = new byte[this.f30065a.length * 8];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f30065a;
            if (i11 == jArr.length) {
                return bArr;
            }
            r70.i.v(jArr[i11], bArr, i12);
            i12 += 8;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "Keccak-" + this.f30069e;
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return this.f30067c / 8;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f30069e / 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(byte[] bArr, int i11, long j11) {
        if (!this.f30070f) {
            j();
        }
        g();
        long j12 = 0;
        if (j11 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j12 < j11) {
            if (this.f30068d == 0) {
                b();
            }
            int min = (int) Math.min(this.f30068d, j11 - j12);
            System.arraycopy(this.f30066b, (this.f30067c - this.f30068d) / 8, bArr, ((int) (j12 / 8)) + i11, min / 8);
            this.f30068d -= min;
            j12 += min;
        }
        g();
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        h(this.f30069e);
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        d(b11);
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        e(bArr, i11, i12);
    }
}