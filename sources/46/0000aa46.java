package p50;

import org.bouncycastle.crypto.v;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class h implements v {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f46255a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f46256b;

    /* renamed from: c  reason: collision with root package name */
    private int f46257c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.crypto.e f46258d;

    /* renamed from: e  reason: collision with root package name */
    private t50.a f46259e;

    /* renamed from: f  reason: collision with root package name */
    private int f46260f;

    /* renamed from: g  reason: collision with root package name */
    private b1 f46261g;

    /* renamed from: h  reason: collision with root package name */
    private b1 f46262h;

    public h(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.getBlockSize() * 8, null);
    }

    public h(org.bouncycastle.crypto.e eVar, int i11, t50.a aVar) {
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(eVar instanceof l50.o)) {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
        this.f46258d = new q50.c(eVar);
        this.f46259e = aVar;
        this.f46260f = i11 / 8;
        this.f46255a = new byte[eVar.getBlockSize()];
        this.f46256b = new byte[eVar.getBlockSize()];
        this.f46257c = 0;
    }

    public h(org.bouncycastle.crypto.e eVar, t50.a aVar) {
        this(eVar, eVar.getBlockSize() * 8, aVar);
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        int blockSize = this.f46258d.getBlockSize();
        if (this.f46259e == null) {
            while (true) {
                int i12 = this.f46257c;
                if (i12 >= blockSize) {
                    break;
                }
                this.f46256b[i12] = 0;
                this.f46257c = i12 + 1;
            }
        } else {
            if (this.f46257c == blockSize) {
                this.f46258d.processBlock(this.f46256b, 0, this.f46255a, 0);
                this.f46257c = 0;
            }
            this.f46259e.addPadding(this.f46256b, this.f46257c);
        }
        this.f46258d.processBlock(this.f46256b, 0, this.f46255a, 0);
        l50.o oVar = new l50.o();
        oVar.init(false, this.f46261g);
        byte[] bArr2 = this.f46255a;
        oVar.processBlock(bArr2, 0, bArr2, 0);
        oVar.init(true, this.f46262h);
        byte[] bArr3 = this.f46255a;
        oVar.processBlock(bArr3, 0, bArr3, 0);
        System.arraycopy(this.f46255a, 0, bArr, i11, this.f46260f);
        reset();
        return this.f46260f;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46260f;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        b1 b1Var;
        reset();
        boolean z11 = iVar instanceof b1;
        if (!z11 && !(iVar instanceof f1)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] a11 = (z11 ? (b1) iVar : (b1) ((f1) iVar).b()).a();
        if (a11.length == 16) {
            b1Var = new b1(a11, 0, 8);
            this.f46261g = new b1(a11, 8, 8);
            this.f46262h = b1Var;
        } else if (a11.length != 24) {
            throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
        } else {
            b1Var = new b1(a11, 0, 8);
            this.f46261g = new b1(a11, 8, 8);
            this.f46262h = new b1(a11, 16, 8);
        }
        if (iVar instanceof f1) {
            this.f46258d.init(true, new f1(b1Var, ((f1) iVar).a()));
        } else {
            this.f46258d.init(true, b1Var);
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f46256b;
            if (i11 >= bArr.length) {
                this.f46257c = 0;
                this.f46258d.reset();
                return;
            }
            bArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        int i11 = this.f46257c;
        byte[] bArr = this.f46256b;
        if (i11 == bArr.length) {
            this.f46258d.processBlock(bArr, 0, this.f46255a, 0);
            this.f46257c = 0;
        }
        byte[] bArr2 = this.f46256b;
        int i12 = this.f46257c;
        this.f46257c = i12 + 1;
        bArr2[i12] = b11;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.f46258d.getBlockSize();
        int i13 = this.f46257c;
        int i14 = blockSize - i13;
        if (i12 > i14) {
            System.arraycopy(bArr, i11, this.f46256b, i13, i14);
            this.f46258d.processBlock(this.f46256b, 0, this.f46255a, 0);
            this.f46257c = 0;
            i12 -= i14;
            i11 += i14;
            while (i12 > blockSize) {
                this.f46258d.processBlock(bArr, i11, this.f46255a, 0);
                i12 -= blockSize;
                i11 += blockSize;
            }
        }
        System.arraycopy(bArr, i11, this.f46256b, this.f46257c, i12);
        this.f46257c += i12;
    }
}