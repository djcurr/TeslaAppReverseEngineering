package rb;

import cc.e;
import vc.d;

/* loaded from: classes.dex */
public abstract class a<T extends d> {

    /* renamed from: a  reason: collision with root package name */
    protected e f49332a;

    /* renamed from: b  reason: collision with root package name */
    protected T f49333b;

    public a(e eVar) {
        this.f49332a = eVar;
        T b11 = b();
        this.f49333b = b11;
        eVar.a(b11);
    }

    public void a(String str) {
        this.f49333b.a(str);
    }

    protected abstract T b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract a c(wc.b bVar, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public a d(wc.b bVar) {
        return c(bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e(wc.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean f(wc.b bVar);
}