package q40;

import org.bouncycastle.asn1.j0;

/* loaded from: classes5.dex */
public class d extends j0 {
    public d(j0 j0Var) {
        super(j0Var.q(), j0Var.s());
    }

    @Override // org.bouncycastle.asn1.b
    public String toString() {
        return "NetscapeCertType: 0x" + Integer.toHexString(this.f43019a[0] & 255);
    }
}