package h50;

import java.io.IOException;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.o;
import org.bouncycastle.crypto.p;
import org.spongycastle.asn1.ASN1Encoding;
import r70.i;

/* loaded from: classes5.dex */
public class c implements n {

    /* renamed from: a  reason: collision with root package name */
    private final p f28902a;

    /* renamed from: b  reason: collision with root package name */
    private k f28903b;

    /* renamed from: c  reason: collision with root package name */
    private int f28904c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f28905d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f28906e;

    public c(p pVar) {
        this.f28902a = pVar;
    }

    @Override // org.bouncycastle.crypto.n
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13 = i12;
        int i14 = i11;
        if (bArr.length - i13 >= i14) {
            long j11 = i13;
            int digestSize = this.f28902a.getDigestSize();
            if (j11 <= 8589934591L) {
                long j12 = digestSize;
                int i15 = (int) (((j11 + j12) - 1) / j12);
                byte[] bArr2 = new byte[this.f28902a.getDigestSize()];
                int i16 = 0;
                int i17 = 0;
                int i18 = 1;
                while (i17 < i15) {
                    p pVar = this.f28902a;
                    byte[] bArr3 = this.f28905d;
                    pVar.update(bArr3, i16, bArr3.length);
                    d dVar = new d();
                    d dVar2 = new d();
                    dVar2.a(this.f28903b);
                    dVar2.a(new s0(i.h(i18)));
                    dVar.a(new w0(dVar2));
                    byte[] bArr4 = this.f28906e;
                    if (bArr4 != null) {
                        dVar.a(new z0(true, i16, new s0(bArr4)));
                    }
                    dVar.a(new z0(true, 2, new s0(i.h(this.f28904c))));
                    try {
                        byte[] d11 = new w0(dVar).d(ASN1Encoding.DER);
                        this.f28902a.update(d11, 0, d11.length);
                        this.f28902a.doFinal(bArr2, 0);
                        if (i13 > digestSize) {
                            System.arraycopy(bArr2, 0, bArr, i14, digestSize);
                            i14 += digestSize;
                            i13 -= digestSize;
                        } else {
                            System.arraycopy(bArr2, 0, bArr, i14, i13);
                        }
                        i18++;
                        i17++;
                        i16 = 0;
                    } catch (IOException e11) {
                        throw new IllegalArgumentException("unable to encode parameter info: " + e11.getMessage());
                    }
                }
                this.f28902a.reset();
                return (int) j11;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    @Override // org.bouncycastle.crypto.n
    public void init(o oVar) {
        b bVar = (b) oVar;
        this.f28903b = bVar.a();
        this.f28904c = bVar.c();
        this.f28905d = bVar.d();
        this.f28906e = bVar.b();
    }
}