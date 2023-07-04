package p50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.v;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class p implements v {

    /* renamed from: a  reason: collision with root package name */
    private byte f46308a;

    /* renamed from: b  reason: collision with root package name */
    private byte f46309b = 0;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f46310c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte f46311d = 0;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f46312e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f46313f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f46314g;

    /* renamed from: h  reason: collision with root package name */
    private byte f46315h;

    /* renamed from: i  reason: collision with root package name */
    private byte f46316i;

    /* renamed from: j  reason: collision with root package name */
    private byte f46317j;

    /* renamed from: k  reason: collision with root package name */
    private byte f46318k;

    private void a(byte[] bArr, byte[] bArr2) {
        this.f46311d = (byte) 0;
        this.f46310c = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.f46310c[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.f46310c;
            int i13 = i12 & 255;
            byte b11 = bArr3[(this.f46311d + bArr3[i13] + bArr[i12 % bArr.length]) & 255];
            this.f46311d = b11;
            byte b12 = bArr3[i13];
            bArr3[i13] = bArr3[b11 & 255];
            bArr3[b11 & 255] = b12;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.f46310c;
            int i15 = i14 & 255;
            byte b13 = bArr4[(this.f46311d + bArr4[i15] + bArr2[i14 % bArr2.length]) & 255];
            this.f46311d = b13;
            byte b14 = bArr4[i15];
            bArr4[i15] = bArr4[b13 & 255];
            bArr4[b13 & 255] = b14;
        }
        this.f46309b = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        for (int i12 = 1; i12 < 25; i12++) {
            byte[] bArr2 = this.f46310c;
            byte b11 = this.f46311d;
            byte b12 = this.f46309b;
            byte b13 = bArr2[(b11 + bArr2[b12 & 255]) & 255];
            this.f46311d = b13;
            byte b14 = this.f46318k;
            byte b15 = this.f46317j;
            byte b16 = bArr2[(b14 + b15 + i12) & 255];
            this.f46318k = b16;
            byte b17 = this.f46316i;
            byte b18 = bArr2[(b15 + b17 + i12) & 255];
            this.f46317j = b18;
            byte b19 = this.f46315h;
            byte b21 = bArr2[(b17 + b19 + i12) & 255];
            this.f46316i = b21;
            byte b22 = bArr2[(b19 + b13 + i12) & 255];
            this.f46315h = b22;
            byte[] bArr3 = this.f46312e;
            byte b23 = this.f46308a;
            bArr3[b23 & 31] = (byte) (b22 ^ bArr3[b23 & 31]);
            bArr3[(b23 + 1) & 31] = (byte) (b21 ^ bArr3[(b23 + 1) & 31]);
            bArr3[(b23 + 2) & 31] = (byte) (b18 ^ bArr3[(b23 + 2) & 31]);
            bArr3[(b23 + 3) & 31] = (byte) (b16 ^ bArr3[(b23 + 3) & 31]);
            this.f46308a = (byte) ((b23 + 4) & 31);
            byte b24 = bArr2[b12 & 255];
            bArr2[b12 & 255] = bArr2[b13 & 255];
            bArr2[b13 & 255] = b24;
            this.f46309b = (byte) ((b12 + 1) & 255);
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.f46310c;
            int i14 = i13 & 255;
            byte b25 = bArr4[(this.f46311d + bArr4[i14] + this.f46312e[i13 & 31]) & 255];
            this.f46311d = b25;
            byte b26 = bArr4[i14];
            bArr4[i14] = bArr4[b25 & 255];
            bArr4[b25 & 255] = b26;
        }
        byte[] bArr5 = new byte[20];
        for (int i15 = 0; i15 < 20; i15++) {
            byte[] bArr6 = this.f46310c;
            int i16 = i15 & 255;
            byte b27 = bArr6[(this.f46311d + bArr6[i16]) & 255];
            this.f46311d = b27;
            bArr5[i15] = bArr6[(bArr6[bArr6[b27 & 255] & 255] + 1) & 255];
            byte b28 = bArr6[i16];
            bArr6[i16] = bArr6[b27 & 255];
            bArr6[b27 & 255] = b28;
        }
        System.arraycopy(bArr5, 0, bArr, i11, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        f1 f1Var = (f1) iVar;
        b1 b1Var = (b1) f1Var.b();
        if (!(f1Var.b() instanceof b1)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] a11 = f1Var.a();
        this.f46313f = a11;
        if (a11 == null || a11.length < 1 || a11.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.f46314g = b1Var.a();
        reset();
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        a(this.f46314g, this.f46313f);
        this.f46309b = (byte) 0;
        this.f46318k = (byte) 0;
        this.f46317j = (byte) 0;
        this.f46316i = (byte) 0;
        this.f46315h = (byte) 0;
        this.f46308a = (byte) 0;
        this.f46312e = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            this.f46312e[i11] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        byte[] bArr = this.f46310c;
        byte b12 = this.f46311d;
        byte b13 = this.f46309b;
        byte b14 = bArr[(b12 + bArr[b13 & 255]) & 255];
        this.f46311d = b14;
        byte b15 = this.f46318k;
        byte b16 = this.f46317j;
        byte b17 = bArr[(b15 + b16) & 255];
        this.f46318k = b17;
        byte b18 = this.f46316i;
        byte b19 = bArr[(b16 + b18) & 255];
        this.f46317j = b19;
        byte b21 = this.f46315h;
        byte b22 = bArr[(b18 + b21) & 255];
        this.f46316i = b22;
        byte b23 = bArr[(b21 + b14 + ((byte) (b11 ^ bArr[(bArr[bArr[b14 & 255] & 255] + 1) & 255]))) & 255];
        this.f46315h = b23;
        byte[] bArr2 = this.f46312e;
        byte b24 = this.f46308a;
        bArr2[b24 & 31] = (byte) (b23 ^ bArr2[b24 & 31]);
        bArr2[(b24 + 1) & 31] = (byte) (b22 ^ bArr2[(b24 + 1) & 31]);
        bArr2[(b24 + 2) & 31] = (byte) (b19 ^ bArr2[(b24 + 2) & 31]);
        bArr2[(b24 + 3) & 31] = (byte) (b17 ^ bArr2[(b24 + 3) & 31]);
        this.f46308a = (byte) ((b24 + 4) & 31);
        byte b25 = bArr[b13 & 255];
        bArr[b13 & 255] = bArr[b14 & 255];
        bArr[b14 & 255] = b25;
        this.f46309b = (byte) ((b13 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            update(bArr[i11 + i13]);
        }
    }
}