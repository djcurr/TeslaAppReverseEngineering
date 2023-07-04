package p50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.f1;

/* loaded from: classes5.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f46265a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f46266b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f46267c;

    /* renamed from: d  reason: collision with root package name */
    private int f46268d;

    /* renamed from: e  reason: collision with root package name */
    private org.bouncycastle.crypto.e f46269e;

    public j(org.bouncycastle.crypto.e eVar, int i11) {
        this.f46269e = null;
        this.f46269e = eVar;
        this.f46268d = i11 / 8;
        this.f46265a = new byte[eVar.getBlockSize()];
        this.f46266b = new byte[eVar.getBlockSize()];
        this.f46267c = new byte[eVar.getBlockSize()];
    }

    public String a() {
        return this.f46269e.getAlgorithmName() + "/CFB" + (this.f46268d * 8);
    }

    public int b() {
        return this.f46268d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(byte[] bArr) {
        this.f46269e.processBlock(this.f46266b, 0, bArr, 0);
    }

    public void d(org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            int length = a11.length;
            byte[] bArr = this.f46265a;
            if (length < bArr.length) {
                System.arraycopy(a11, 0, bArr, bArr.length - a11.length, a11.length);
            } else {
                System.arraycopy(a11, 0, bArr, 0, bArr.length);
            }
            f();
            eVar = this.f46269e;
            iVar = f1Var.b();
        } else {
            f();
            eVar = this.f46269e;
        }
        eVar.init(true, iVar);
    }

    public int e(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.f46268d;
        if (i11 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.f46269e.processBlock(this.f46266b, 0, this.f46267c, 0);
        int i14 = 0;
        while (true) {
            int i15 = this.f46268d;
            if (i14 >= i15) {
                byte[] bArr3 = this.f46266b;
                System.arraycopy(bArr3, i15, bArr3, 0, bArr3.length - i15);
                byte[] bArr4 = this.f46266b;
                int length = bArr4.length;
                int i16 = this.f46268d;
                System.arraycopy(bArr2, i12, bArr4, length - i16, i16);
                return this.f46268d;
            }
            bArr2[i12 + i14] = (byte) (this.f46267c[i14] ^ bArr[i11 + i14]);
            i14++;
        }
    }

    public void f() {
        byte[] bArr = this.f46265a;
        System.arraycopy(bArr, 0, this.f46266b, 0, bArr.length);
        this.f46269e.reset();
    }
}