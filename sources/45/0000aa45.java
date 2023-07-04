package p50;

import java.util.Hashtable;
import org.bouncycastle.crypto.v;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import u50.b1;

/* loaded from: classes5.dex */
public class g implements v {

    /* renamed from: h  reason: collision with root package name */
    private static Hashtable f46247h;

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.p f46248a;

    /* renamed from: b  reason: collision with root package name */
    private int f46249b;

    /* renamed from: c  reason: collision with root package name */
    private int f46250c;

    /* renamed from: d  reason: collision with root package name */
    private r70.h f46251d;

    /* renamed from: e  reason: collision with root package name */
    private r70.h f46252e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f46253f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f46254g;

    static {
        Hashtable hashtable = new Hashtable();
        f46247h = hashtable;
        hashtable.put("GOST3411", r70.f.d(32));
        f46247h.put("MD2", r70.f.d(16));
        f46247h.put("MD4", r70.f.d(64));
        f46247h.put("MD5", r70.f.d(64));
        f46247h.put("RIPEMD128", r70.f.d(64));
        f46247h.put("RIPEMD160", r70.f.d(64));
        f46247h.put(McElieceCCA2KeyGenParameterSpec.SHA1, r70.f.d(64));
        f46247h.put(McElieceCCA2KeyGenParameterSpec.SHA224, r70.f.d(64));
        f46247h.put(McElieceCCA2KeyGenParameterSpec.SHA256, r70.f.d(64));
        f46247h.put(McElieceCCA2KeyGenParameterSpec.SHA384, r70.f.d(128));
        f46247h.put(McElieceCCA2KeyGenParameterSpec.SHA512, r70.f.d(128));
        f46247h.put("Tiger", r70.f.d(64));
        f46247h.put("Whirlpool", r70.f.d(64));
    }

    public g(org.bouncycastle.crypto.p pVar) {
        this(pVar, a(pVar));
    }

    private g(org.bouncycastle.crypto.p pVar, int i11) {
        this.f46248a = pVar;
        int digestSize = pVar.getDigestSize();
        this.f46249b = digestSize;
        this.f46250c = i11;
        this.f46253f = new byte[i11];
        this.f46254g = new byte[i11 + digestSize];
    }

    private static int a(org.bouncycastle.crypto.p pVar) {
        if (pVar instanceof org.bouncycastle.crypto.r) {
            return ((org.bouncycastle.crypto.r) pVar).getByteLength();
        }
        Integer num = (Integer) f46247h.get(pVar.getAlgorithmName());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + pVar.getAlgorithmName());
    }

    private static void c(byte[] bArr, int i11, byte b11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ b11);
        }
    }

    public org.bouncycastle.crypto.p b() {
        return this.f46248a;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        this.f46248a.doFinal(this.f46254g, this.f46250c);
        r70.h hVar = this.f46252e;
        if (hVar != null) {
            ((r70.h) this.f46248a).a(hVar);
            org.bouncycastle.crypto.p pVar = this.f46248a;
            pVar.update(this.f46254g, this.f46250c, pVar.getDigestSize());
        } else {
            org.bouncycastle.crypto.p pVar2 = this.f46248a;
            byte[] bArr2 = this.f46254g;
            pVar2.update(bArr2, 0, bArr2.length);
        }
        int doFinal = this.f46248a.doFinal(bArr, i11);
        int i12 = this.f46250c;
        while (true) {
            byte[] bArr3 = this.f46254g;
            if (i12 >= bArr3.length) {
                break;
            }
            bArr3[i12] = 0;
            i12++;
        }
        r70.h hVar2 = this.f46251d;
        if (hVar2 != null) {
            ((r70.h) this.f46248a).a(hVar2);
        } else {
            org.bouncycastle.crypto.p pVar3 = this.f46248a;
            byte[] bArr4 = this.f46253f;
            pVar3.update(bArr4, 0, bArr4.length);
        }
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return this.f46248a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46249b;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        this.f46248a.reset();
        byte[] a11 = ((b1) iVar).a();
        int length = a11.length;
        if (length > this.f46250c) {
            this.f46248a.update(a11, 0, length);
            this.f46248a.doFinal(this.f46253f, 0);
            length = this.f46249b;
        } else {
            System.arraycopy(a11, 0, this.f46253f, 0, length);
        }
        while (true) {
            bArr = this.f46253f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.f46254g, 0, this.f46250c);
        c(this.f46253f, this.f46250c, (byte) 54);
        c(this.f46254g, this.f46250c, (byte) 92);
        org.bouncycastle.crypto.p pVar = this.f46248a;
        if (pVar instanceof r70.h) {
            r70.h copy = ((r70.h) pVar).copy();
            this.f46252e = copy;
            ((org.bouncycastle.crypto.p) copy).update(this.f46254g, 0, this.f46250c);
        }
        org.bouncycastle.crypto.p pVar2 = this.f46248a;
        byte[] bArr2 = this.f46253f;
        pVar2.update(bArr2, 0, bArr2.length);
        org.bouncycastle.crypto.p pVar3 = this.f46248a;
        if (pVar3 instanceof r70.h) {
            this.f46251d = ((r70.h) pVar3).copy();
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        this.f46248a.reset();
        org.bouncycastle.crypto.p pVar = this.f46248a;
        byte[] bArr = this.f46253f;
        pVar.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        this.f46248a.update(b11);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        this.f46248a.update(bArr, i11, i12);
    }
}