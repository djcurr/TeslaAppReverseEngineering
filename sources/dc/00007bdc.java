package ji;

import bj.h;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final ak.v f33765a = new ak.v(10);

    public wi.a a(i iVar, h.a aVar) {
        wi.a aVar2 = null;
        int i11 = 0;
        while (true) {
            try {
                iVar.n(this.f33765a.d(), 0, 10);
                this.f33765a.O(0);
                if (this.f33765a.F() != 4801587) {
                    break;
                }
                this.f33765a.P(3);
                int B = this.f33765a.B();
                int i12 = B + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(this.f33765a.d(), 0, bArr, 0, 10);
                    iVar.n(bArr, 10, B);
                    aVar2 = new bj.h(aVar).e(bArr, i12);
                } else {
                    iVar.g(B);
                }
                i11 += i12;
            } catch (EOFException unused) {
            }
        }
        iVar.d();
        iVar.g(i11);
        return aVar2;
    }
}