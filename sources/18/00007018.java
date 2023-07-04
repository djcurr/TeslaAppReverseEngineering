package g50;

import org.bouncycastle.crypto.y;
import u50.s1;
import u50.t1;

/* loaded from: classes5.dex */
public final class i implements y {

    /* renamed from: a  reason: collision with root package name */
    private s1 f27788a;

    @Override // org.bouncycastle.crypto.y
    public void a(org.bouncycastle.crypto.i iVar, byte[] bArr, int i11) {
        this.f27788a.c((t1) iVar, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.y
    public int b() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f27788a = (s1) iVar;
    }
}