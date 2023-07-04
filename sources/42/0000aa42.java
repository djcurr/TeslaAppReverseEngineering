package p50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.v;
import u50.b1;

/* loaded from: classes5.dex */
public class d implements v {

    /* renamed from: a  reason: collision with root package name */
    private i50.c f46231a;

    /* renamed from: b  reason: collision with root package name */
    private int f46232b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f46233c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f46234d = null;

    /* renamed from: e  reason: collision with root package name */
    private long f46235e;

    public d(int i11) {
        this.f46231a = new i50.c(i11);
        this.f46232b = i11 / 8;
    }

    private void a() {
        int byteLength = this.f46231a.getByteLength() - ((int) (this.f46235e % this.f46231a.getByteLength()));
        if (byteLength < 13) {
            byteLength += this.f46231a.getByteLength();
        }
        byte[] bArr = new byte[byteLength];
        bArr[0] = Byte.MIN_VALUE;
        r70.i.v(this.f46235e * 8, bArr, byteLength - 12);
        this.f46231a.update(bArr, 0, byteLength);
    }

    private byte[] b(byte[] bArr) {
        int length = (((bArr.length + this.f46231a.getByteLength()) - 1) / this.f46231a.getByteLength()) * this.f46231a.getByteLength();
        if (length - bArr.length < 13) {
            length += this.f46231a.getByteLength();
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = Byte.MIN_VALUE;
        r70.i.i(bArr.length * 8, bArr2, length - 12);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        if (this.f46233c == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (bArr.length - i11 >= this.f46232b) {
            a();
            i50.c cVar = this.f46231a;
            byte[] bArr2 = this.f46234d;
            cVar.update(bArr2, 0, bArr2.length);
            this.f46235e = 0L;
            int doFinal = this.f46231a.doFinal(bArr, i11);
            reset();
            return doFinal;
        } else {
            throw new OutputLengthException("Output buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46232b;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f46233c = null;
        reset();
        if (!(iVar instanceof b1)) {
            throw new IllegalArgumentException("Bad parameter passed");
        }
        byte[] a11 = ((b1) iVar).a();
        this.f46234d = new byte[a11.length];
        this.f46233c = b(a11);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f46234d;
            if (i11 >= bArr.length) {
                i50.c cVar = this.f46231a;
                byte[] bArr2 = this.f46233c;
                cVar.update(bArr2, 0, bArr2.length);
                return;
            }
            bArr[i11] = (byte) (~a11[i11]);
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        this.f46235e = 0L;
        this.f46231a.reset();
        byte[] bArr = this.f46233c;
        if (bArr != null) {
            this.f46231a.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        this.f46231a.update(b11);
        this.f46235e++;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        if (bArr.length - i11 < i12) {
            throw new DataLengthException("Input buffer too short");
        }
        if (this.f46233c != null) {
            this.f46231a.update(bArr, i11, i12);
            this.f46235e += i12;
            return;
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}