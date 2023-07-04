package q50;

import java.util.Objects;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class g implements b {

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f47589l = new byte[15];

    /* renamed from: a  reason: collision with root package name */
    private final l50.l f47590a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.crypto.v f47591b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f47592c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f47593d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f47594e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f47595f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f47596g;

    /* renamed from: h  reason: collision with root package name */
    private long f47597h;

    /* renamed from: i  reason: collision with root package name */
    private long f47598i;

    /* renamed from: j  reason: collision with root package name */
    private int f47599j;

    /* renamed from: k  reason: collision with root package name */
    private int f47600k;

    public g() {
        this(new p50.l());
    }

    public g(org.bouncycastle.crypto.v vVar) {
        this.f47592c = new byte[32];
        this.f47593d = new byte[12];
        this.f47594e = new byte[80];
        this.f47595f = new byte[16];
        this.f47599j = 0;
        Objects.requireNonNull(vVar, "'poly1305' cannot be null");
        if (16 != vVar.getMacSize()) {
            throw new IllegalArgumentException("'poly1305' must be a 128-bit MAC");
        }
        this.f47590a = new l50.l();
        this.f47591b = vVar;
    }

    private void a() {
        int i11 = this.f47599j;
        int i12 = 2;
        if (i11 != 1) {
            if (i11 == 2) {
                return;
            }
            if (i11 == 4) {
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            }
            i12 = 6;
            if (i11 != 5) {
                if (i11 != 6) {
                    throw new IllegalStateException();
                }
                return;
            }
        }
        this.f47599j = i12;
    }

    private void b() {
        int i11;
        switch (this.f47599j) {
            case 1:
            case 2:
                i11 = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i11 = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        c(i11);
    }

    private void c(int i11) {
        g(this.f47597h);
        this.f47599j = i11;
    }

    private void d(int i11) {
        g(this.f47598i);
        byte[] bArr = new byte[16];
        r70.i.v(this.f47597h, bArr, 0);
        r70.i.v(this.f47598i, bArr, 8);
        this.f47591b.update(bArr, 0, 16);
        this.f47591b.doFinal(this.f47595f, 0);
        this.f47599j = i11;
    }

    private long e(long j11, int i11, long j12) {
        long j13 = i11;
        if (j11 - Long.MIN_VALUE <= (j12 - j13) - Long.MIN_VALUE) {
            return j11 + j13;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    private void f() {
        byte[] bArr = new byte[64];
        try {
            this.f47590a.processBytes(bArr, 0, 64, bArr, 0);
            this.f47591b.init(new b1(bArr, 0, 32));
        } finally {
            org.bouncycastle.util.a.g(bArr);
        }
    }

    private void g(long j11) {
        int i11 = ((int) j11) & 15;
        if (i11 != 0) {
            this.f47591b.update(f47589l, 0, 16 - i11);
        }
    }

    private void h(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i13 > bArr2.length - i12) {
            throw new OutputLengthException("Output buffer too short");
        }
        this.f47590a.processBytes(bArr, i11, i12, bArr2, i13);
        this.f47598i = e(this.f47598i, i12, 274877906880L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void i(boolean z11, boolean z12) {
        org.bouncycastle.util.a.g(this.f47594e);
        if (z11) {
            org.bouncycastle.util.a.g(this.f47595f);
        }
        this.f47597h = 0L;
        this.f47598i = 0L;
        this.f47600k = 0;
        switch (this.f47599j) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.f47599j = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.f47599j = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z12) {
            this.f47590a.reset();
        }
        f();
        byte[] bArr = this.f47596g;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        Objects.requireNonNull(bArr, "'out' cannot be null");
        if (i11 >= 0) {
            b();
            org.bouncycastle.util.a.g(this.f47595f);
            int i13 = this.f47599j;
            if (i13 == 3) {
                int i14 = this.f47600k;
                i12 = i14 + 16;
                if (i11 > bArr.length - i12) {
                    throw new OutputLengthException("Output buffer too short");
                }
                if (i14 > 0) {
                    h(this.f47594e, 0, i14, bArr, i11);
                    this.f47591b.update(bArr, i11, this.f47600k);
                }
                d(4);
                System.arraycopy(this.f47595f, 0, bArr, i11 + this.f47600k, 16);
            } else if (i13 != 7) {
                throw new IllegalStateException();
            } else {
                int i15 = this.f47600k;
                if (i15 < 16) {
                    throw new InvalidCipherTextException("data too short");
                }
                i12 = i15 - 16;
                if (i11 > bArr.length - i12) {
                    throw new OutputLengthException("Output buffer too short");
                }
                if (i12 > 0) {
                    this.f47591b.update(this.f47594e, 0, i12);
                    h(this.f47594e, 0, i12, bArr, i11);
                }
                d(8);
                if (!org.bouncycastle.util.a.t(16, this.f47595f, 0, this.f47594e, i12)) {
                    throw new InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
                }
            }
            i(false, true);
            return i12;
        }
        throw new IllegalArgumentException("'outOff' cannot be negative");
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // q50.b
    public byte[] getMac() {
        return org.bouncycastle.util.a.h(this.f47595f);
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        int max = Math.max(0, i11) + this.f47600k;
        int i12 = this.f47599j;
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            return max + 16;
        }
        if (i12 == 5 || i12 == 6 || i12 == 7) {
            return Math.max(0, max - 16);
        }
        throw new IllegalStateException();
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        int max = Math.max(0, i11) + this.f47600k;
        int i12 = this.f47599j;
        if (i12 != 1 && i12 != 2 && i12 != 3) {
            if (i12 != 5 && i12 != 6 && i12 != 7) {
                throw new IllegalStateException();
            }
            max = Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        f1 f1Var;
        b1 b1Var;
        byte[] a11;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            int c11 = aVar.c();
            if (128 != c11) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c11);
            }
            b1Var = aVar.b();
            a11 = aVar.d();
            f1Var = new f1(b1Var, a11);
            this.f47596g = aVar.a();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
        } else {
            f1Var = (f1) iVar;
            b1Var = (b1) f1Var.b();
            a11 = f1Var.a();
            this.f47596g = null;
        }
        if (b1Var == null) {
            if (this.f47599j == 0) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != b1Var.a().length) {
            throw new IllegalArgumentException("Key must be 256 bits");
        }
        if (a11 == null || 12 != a11.length) {
            throw new IllegalArgumentException("Nonce must be 96 bits");
        }
        if (this.f47599j != 0 && z11 && org.bouncycastle.util.a.c(this.f47593d, a11) && (b1Var == null || org.bouncycastle.util.a.c(this.f47592c, b1Var.a()))) {
            throw new IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
        }
        if (b1Var != null) {
            System.arraycopy(b1Var.a(), 0, this.f47592c, 0, 32);
        }
        System.arraycopy(a11, 0, this.f47593d, 0, 12);
        this.f47590a.init(true, f1Var);
        this.f47599j = z11 ? 1 : 5;
        i(true, false);
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        Objects.requireNonNull(bArr, "'in' cannot be null");
        if (i11 < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i11 > bArr.length - i12) {
            throw new DataLengthException("Input buffer too short");
        }
        a();
        if (i12 > 0) {
            this.f47597h = e(this.f47597h, i12, -1L);
            this.f47591b.update(bArr, i11, i12);
        }
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        b();
        int i12 = this.f47599j;
        if (i12 == 3) {
            byte[] bArr2 = this.f47594e;
            int i13 = this.f47600k;
            bArr2[i13] = b11;
            int i14 = i13 + 1;
            this.f47600k = i14;
            if (i14 == 64) {
                h(bArr2, 0, 64, bArr, i11);
                this.f47591b.update(bArr, i11, 64);
                this.f47600k = 0;
                return 64;
            }
            return 0;
        } else if (i12 == 7) {
            byte[] bArr3 = this.f47594e;
            int i15 = this.f47600k;
            bArr3[i15] = b11;
            int i16 = i15 + 1;
            this.f47600k = i16;
            if (i16 == bArr3.length) {
                this.f47591b.update(bArr3, 0, 64);
                h(this.f47594e, 0, 64, bArr, i11);
                byte[] bArr4 = this.f47594e;
                System.arraycopy(bArr4, 64, bArr4, 0, 16);
                this.f47600k = 16;
                return 64;
            }
            return 0;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        int i15 = i11;
        int i16 = i12;
        Objects.requireNonNull(bArr, "'in' cannot be null");
        if (i15 >= 0) {
            if (i16 >= 0) {
                if (i15 <= bArr.length - i16) {
                    if (i13 >= 0) {
                        b();
                        int i17 = this.f47599j;
                        if (i17 == 3) {
                            if (this.f47600k != 0) {
                                while (i16 > 0) {
                                    i16--;
                                    byte[] bArr3 = this.f47594e;
                                    int i18 = this.f47600k;
                                    int i19 = i15 + 1;
                                    bArr3[i18] = bArr[i15];
                                    int i21 = i18 + 1;
                                    this.f47600k = i21;
                                    if (i21 == 64) {
                                        h(bArr3, 0, 64, bArr2, i13);
                                        this.f47591b.update(bArr2, i13, 64);
                                        this.f47600k = 0;
                                        i14 = 64;
                                        i15 = i19;
                                        break;
                                    }
                                    i15 = i19;
                                }
                            }
                            i14 = 0;
                            while (i16 >= 64) {
                                int i22 = i13 + i14;
                                h(bArr, i15, 64, bArr2, i22);
                                this.f47591b.update(bArr2, i22, 64);
                                i15 += 64;
                                i16 -= 64;
                                i14 += 64;
                            }
                            if (i16 > 0) {
                                System.arraycopy(bArr, i15, this.f47594e, 0, i16);
                                this.f47600k = i16;
                            }
                        } else if (i17 != 7) {
                            throw new IllegalStateException();
                        } else {
                            i14 = 0;
                            for (int i23 = 0; i23 < i16; i23++) {
                                byte[] bArr4 = this.f47594e;
                                int i24 = this.f47600k;
                                bArr4[i24] = bArr[i15 + i23];
                                int i25 = i24 + 1;
                                this.f47600k = i25;
                                if (i25 == bArr4.length) {
                                    this.f47591b.update(bArr4, 0, 64);
                                    h(this.f47594e, 0, 64, bArr2, i13 + i14);
                                    byte[] bArr5 = this.f47594e;
                                    System.arraycopy(bArr5, 64, bArr5, 0, 16);
                                    this.f47600k = 16;
                                    i14 += 64;
                                }
                            }
                        }
                        return i14;
                    }
                    throw new IllegalArgumentException("'outOff' cannot be negative");
                }
                throw new DataLengthException("Input buffer too short");
            }
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        throw new IllegalArgumentException("'inOff' cannot be negative");
    }
}