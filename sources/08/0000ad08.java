package q50;

import org.bouncycastle.crypto.a0;
import u50.b1;
import u50.f1;
import u50.g1;
import u50.h1;

/* loaded from: classes5.dex */
public class m extends a0 {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f47647f = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};

    /* renamed from: b  reason: collision with root package name */
    private final e f47648b;

    /* renamed from: c  reason: collision with root package name */
    private b1 f47649c;

    /* renamed from: d  reason: collision with root package name */
    private long f47650d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47651e;

    public m(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f47650d = 0L;
        this.f47648b = new e(eVar, eVar.getBlockSize() * 8);
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        long j11 = this.f47650d;
        if (j11 > 0 && j11 % 1024 == 0) {
            org.bouncycastle.crypto.e b12 = this.f47648b.b();
            b12.init(false, this.f47649c);
            byte[] bArr = new byte[32];
            byte[] bArr2 = f47647f;
            b12.processBlock(bArr2, 0, bArr, 0);
            b12.processBlock(bArr2, 8, bArr, 8);
            b12.processBlock(bArr2, 16, bArr, 16);
            b12.processBlock(bArr2, 24, bArr, 24);
            b1 b1Var = new b1(bArr);
            this.f47649c = b1Var;
            b12.init(true, b1Var);
            byte[] e11 = this.f47648b.e();
            b12.processBlock(e11, 0, e11, 0);
            this.f47648b.init(this.f47651e, new f1(this.f47649c, e11));
        }
        this.f47650d++;
        return this.f47648b.a(b11);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        String algorithmName = this.f47648b.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47648b.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f47650d = 0L;
        this.f47648b.init(z11, iVar);
        this.f47651e = z11;
        if (iVar instanceof f1) {
            iVar = ((f1) iVar).b();
        }
        if (iVar instanceof g1) {
            iVar = ((g1) iVar).a();
        }
        if (iVar instanceof h1) {
            iVar = ((h1) iVar).a();
        }
        this.f47649c = (b1) iVar;
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, this.f47648b.getBlockSize(), bArr2, i12);
        return this.f47648b.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f47650d = 0L;
        this.f47648b.reset();
    }
}