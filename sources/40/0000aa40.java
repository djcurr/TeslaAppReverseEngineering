package p50;

import org.bouncycastle.crypto.v;

/* loaded from: classes5.dex */
public class b implements v {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f46216a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f46217b;

    /* renamed from: c  reason: collision with root package name */
    private int f46218c;

    /* renamed from: d  reason: collision with root package name */
    private j f46219d;

    /* renamed from: e  reason: collision with root package name */
    private t50.a f46220e;

    /* renamed from: f  reason: collision with root package name */
    private int f46221f;

    public b(org.bouncycastle.crypto.e eVar) {
        this(eVar, 8, (eVar.getBlockSize() * 8) / 2, null);
    }

    public b(org.bouncycastle.crypto.e eVar, int i11, int i12, t50.a aVar) {
        this.f46220e = null;
        if (i12 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f46216a = new byte[eVar.getBlockSize()];
        j jVar = new j(eVar, i11);
        this.f46219d = jVar;
        this.f46220e = aVar;
        this.f46221f = i12 / 8;
        this.f46217b = new byte[jVar.b()];
        this.f46218c = 0;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        int b11 = this.f46219d.b();
        t50.a aVar = this.f46220e;
        if (aVar == null) {
            while (true) {
                int i12 = this.f46218c;
                if (i12 >= b11) {
                    break;
                }
                this.f46217b[i12] = 0;
                this.f46218c = i12 + 1;
            }
        } else {
            aVar.addPadding(this.f46217b, this.f46218c);
        }
        this.f46219d.e(this.f46217b, 0, this.f46216a, 0);
        this.f46219d.c(this.f46216a);
        System.arraycopy(this.f46216a, 0, bArr, i11, this.f46221f);
        reset();
        return this.f46221f;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return this.f46219d.a();
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46221f;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        reset();
        this.f46219d.d(iVar);
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f46217b;
            if (i11 >= bArr.length) {
                this.f46218c = 0;
                this.f46219d.f();
                return;
            }
            bArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        int i11 = this.f46218c;
        byte[] bArr = this.f46217b;
        if (i11 == bArr.length) {
            this.f46219d.e(bArr, 0, this.f46216a, 0);
            this.f46218c = 0;
        }
        byte[] bArr2 = this.f46217b;
        int i12 = this.f46218c;
        this.f46218c = i12 + 1;
        bArr2[i12] = b11;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int b11 = this.f46219d.b();
        int i13 = this.f46218c;
        int i14 = b11 - i13;
        if (i12 > i14) {
            System.arraycopy(bArr, i11, this.f46217b, i13, i14);
            this.f46219d.e(this.f46217b, 0, this.f46216a, 0);
            this.f46218c = 0;
            i12 -= i14;
            i11 += i14;
            while (i12 > b11) {
                this.f46219d.e(bArr, i11, this.f46216a, 0);
                i12 -= b11;
                i11 += b11;
            }
        }
        System.arraycopy(bArr, i11, this.f46217b, this.f46218c, i12);
        this.f46218c += i12;
    }
}