package g50;

import org.bouncycastle.crypto.y;
import u50.v1;
import u50.w1;

/* loaded from: classes5.dex */
public final class j implements y {

    /* renamed from: a  reason: collision with root package name */
    private v1 f27789a;

    @Override // org.bouncycastle.crypto.y
    public void a(org.bouncycastle.crypto.i iVar, byte[] bArr, int i11) {
        this.f27789a.c((w1) iVar, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.y
    public int b() {
        return 56;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f27789a = (v1) iVar;
    }
}