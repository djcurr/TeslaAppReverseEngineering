package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class t0 implements org.bouncycastle.crypto.b0 {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f36904j = r70.i.o(r70.m.f("expand 16-byte kexpand 32-byte k"), 0, 8);

    /* renamed from: a  reason: collision with root package name */
    protected int f36905a;

    /* renamed from: b  reason: collision with root package name */
    private int f36906b;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f36907c;

    /* renamed from: d  reason: collision with root package name */
    protected int[] f36908d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f36909e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36910f;

    /* renamed from: g  reason: collision with root package name */
    private int f36911g;

    /* renamed from: h  reason: collision with root package name */
    private int f36912h;

    /* renamed from: i  reason: collision with root package name */
    private int f36913i;

    static {
        r70.m.f("expand 32-byte k");
        r70.m.f("expand 16-byte k");
    }

    public t0() {
        this(20);
    }

    public t0(int i11) {
        this.f36906b = 0;
        this.f36907c = new int[16];
        this.f36908d = new int[16];
        this.f36909e = new byte[64];
        this.f36910f = false;
        if (i11 <= 0 || (i11 & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.f36905a = i11;
    }

    private boolean d(int i11) {
        int i12 = this.f36911g + i11;
        this.f36911g = i12;
        if (i12 >= i11 || i12 < 0) {
            return false;
        }
        int i13 = this.f36912h + 1;
        this.f36912h = i13;
        if (i13 == 0) {
            int i14 = this.f36913i + 1;
            this.f36913i = i14;
            return (i14 & 32) != 0;
        }
        return false;
    }

    private void g() {
        this.f36911g = 0;
        this.f36912h = 0;
        this.f36913i = 0;
    }

    public static void h(int i11, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i11 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        char c11 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = 7;
        int i21 = iArr[7];
        int i22 = iArr[8];
        int i23 = 9;
        int i24 = iArr[9];
        int i25 = iArr[10];
        int i26 = iArr[11];
        int i27 = iArr[12];
        int i28 = 13;
        int i29 = iArr[13];
        int i31 = iArr[14];
        int i32 = iArr[15];
        int i33 = i31;
        int i34 = i29;
        int i35 = i27;
        int i36 = i26;
        int i37 = i25;
        int i38 = i24;
        int i39 = i22;
        int i41 = i21;
        int i42 = i18;
        int i43 = i17;
        int i44 = i16;
        int i45 = i15;
        int i46 = i14;
        int i47 = i13;
        int i48 = i12;
        int i49 = i11;
        while (i49 > 0) {
            int c12 = r70.f.c(i48 + i35, i19) ^ i44;
            int c13 = i39 ^ r70.f.c(c12 + i48, i23);
            int c14 = i35 ^ r70.f.c(c13 + c12, i28);
            int c15 = r70.f.c(c14 + c13, 18) ^ i48;
            int c16 = i38 ^ r70.f.c(i43 + i47, i19);
            int c17 = i34 ^ r70.f.c(c16 + i43, i23);
            int c18 = i47 ^ r70.f.c(c17 + c16, i28);
            int c19 = r70.f.c(c18 + c17, 18) ^ i43;
            int c21 = i33 ^ r70.f.c(i37 + i42, 7);
            int c22 = i46 ^ r70.f.c(c21 + i37, 9);
            int c23 = i42 ^ r70.f.c(c22 + c21, 13);
            int c24 = i37 ^ r70.f.c(c23 + c22, 18);
            int c25 = i45 ^ r70.f.c(i32 + i36, 7);
            int c26 = i41 ^ r70.f.c(c25 + i32, 9);
            int i51 = i49;
            int c27 = i36 ^ r70.f.c(c26 + c25, 13);
            int c28 = i32 ^ r70.f.c(c27 + c26, 18);
            i47 = c18 ^ r70.f.c(c15 + c25, 7);
            i46 = c22 ^ r70.f.c(i47 + c15, 9);
            int c29 = c25 ^ r70.f.c(i46 + i47, 13);
            int c31 = c15 ^ r70.f.c(c29 + i46, 18);
            i42 = c23 ^ r70.f.c(c19 + c12, 7);
            i41 = c26 ^ r70.f.c(i42 + c19, 9);
            int c32 = r70.f.c(i41 + i42, 13) ^ c12;
            i43 = c19 ^ r70.f.c(c32 + i41, 18);
            i36 = c27 ^ r70.f.c(c24 + c16, 7);
            int c33 = r70.f.c(i36 + c24, 9) ^ c13;
            i38 = c16 ^ r70.f.c(c33 + i36, 13);
            i37 = c24 ^ r70.f.c(i38 + c33, 18);
            i35 = c14 ^ r70.f.c(c28 + c21, 7);
            i34 = c17 ^ r70.f.c(i35 + c28, 9);
            i33 = c21 ^ r70.f.c(i34 + i35, 13);
            i32 = c28 ^ r70.f.c(i33 + i34, 18);
            i45 = c29;
            i39 = c33;
            i48 = c31;
            i44 = c32;
            c11 = 0;
            i28 = 13;
            i23 = 9;
            i19 = 7;
            i49 = i51 - 2;
        }
        char c34 = c11;
        iArr2[c34] = i48 + iArr[c34];
        iArr2[1] = i47 + iArr[1];
        iArr2[2] = i46 + iArr[2];
        iArr2[3] = i45 + iArr[3];
        iArr2[4] = i44 + iArr[4];
        iArr2[5] = i43 + iArr[5];
        iArr2[6] = i42 + iArr[6];
        iArr2[7] = i41 + iArr[7];
        iArr2[8] = i39 + iArr[8];
        iArr2[9] = i38 + iArr[9];
        iArr2[10] = i37 + iArr[10];
        iArr2[11] = i36 + iArr[11];
        iArr2[12] = i35 + iArr[12];
        iArr2[13] = i34 + iArr[13];
        iArr2[14] = i33 + iArr[14];
        iArr2[15] = i32 + iArr[15];
    }

    protected void a() {
        int[] iArr = this.f36907c;
        int i11 = iArr[8] + 1;
        iArr[8] = i11;
        if (i11 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void b(byte[] bArr) {
        h(this.f36905a, this.f36907c, this.f36908d);
        r70.i.j(this.f36908d, bArr, 0);
    }

    protected int c() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(int i11, int[] iArr, int i12) {
        int i13 = (i11 - 16) / 4;
        int[] iArr2 = f36904j;
        iArr[i12] = iArr2[i13];
        iArr[i12 + 1] = iArr2[i13 + 1];
        iArr[i12 + 2] = iArr2[i13 + 2];
        iArr[i12 + 3] = iArr2[i13 + 3];
    }

    protected void f() {
        int[] iArr = this.f36907c;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        if (this.f36905a != 20) {
            return "Salsa20/" + this.f36905a;
        }
        return "Salsa20";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.f36907c;
            int[] iArr2 = f36904j;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            r70.i.n(bArr, 0, iArr, 1, 4);
            r70.i.n(bArr, bArr.length - 16, this.f36907c, 11, 4);
        }
        r70.i.n(bArr2, 0, this.f36907c, 6, 2);
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.f1)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        u50.f1 f1Var = (u50.f1) iVar;
        byte[] a11 = f1Var.a();
        if (a11 == null || a11.length != c()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + c() + " bytes of IV");
        }
        org.bouncycastle.crypto.i b11 = f1Var.b();
        if (b11 == null) {
            if (!this.f36910f) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            i(null, a11);
        } else if (!(b11 instanceof u50.b1)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
        } else {
            i(((u50.b1) b11).a(), a11);
        }
        reset();
        this.f36910f = true;
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.f36910f) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                if (d(i12)) {
                    throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    byte[] bArr3 = this.f36909e;
                    int i15 = this.f36906b;
                    bArr2[i14 + i13] = (byte) (bArr3[i15] ^ bArr[i14 + i11]);
                    int i16 = (i15 + 1) & 63;
                    this.f36906b = i16;
                    if (i16 == 0) {
                        a();
                        b(this.f36909e);
                    }
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.b0
    public void reset() {
        this.f36906b = 0;
        g();
        f();
        b(this.f36909e);
    }
}