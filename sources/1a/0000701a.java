package g50;

import org.bouncycastle.crypto.y;
import u50.x1;
import u50.y1;

/* loaded from: classes5.dex */
public class k implements y {

    /* renamed from: a  reason: collision with root package name */
    private final y f27790a;

    /* renamed from: b  reason: collision with root package name */
    private x1 f27791b;

    public k(y yVar) {
        this.f27790a = yVar;
    }

    @Override // org.bouncycastle.crypto.y
    public void a(org.bouncycastle.crypto.i iVar, byte[] bArr, int i11) {
        y1 y1Var = (y1) iVar;
        this.f27790a.init(this.f27791b.a());
        this.f27790a.a(y1Var.a(), bArr, i11);
        this.f27790a.init(this.f27791b.b());
        this.f27790a.a(y1Var.b(), bArr, i11 + this.f27790a.b());
    }

    @Override // org.bouncycastle.crypto.y
    public int b() {
        return this.f27790a.b() * 2;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f27791b = (x1) iVar;
    }
}