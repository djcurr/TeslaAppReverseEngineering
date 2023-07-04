package h60;

import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.q0;

/* loaded from: classes5.dex */
public class o extends PBEKeySpec {

    /* renamed from: a  reason: collision with root package name */
    private e50.b f28955a;

    static {
        new e50.b(w40.n.f55524a2, q0.f43085a);
    }

    public o(char[] cArr, byte[] bArr, int i11, int i12, e50.b bVar) {
        super(cArr, bArr, i11, i12);
        this.f28955a = bVar;
    }

    public e50.b a() {
        return this.f28955a;
    }
}