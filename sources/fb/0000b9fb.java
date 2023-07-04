package vb;

import cc.e;
import rc.d;

/* loaded from: classes.dex */
public abstract class a<T extends d> {

    /* renamed from: a  reason: collision with root package name */
    protected e f54461a;

    /* renamed from: b  reason: collision with root package name */
    protected T f54462b;

    public a(e eVar) {
        this.f54461a = eVar;
        T b11 = b();
        this.f54462b = b11;
        eVar.a(b11);
    }

    public void a(String str) {
        this.f54462b.a(str);
    }

    protected abstract T b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract a c(sc.a aVar, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public a d(sc.a aVar) {
        return c(aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e(sc.a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean f(sc.a aVar);
}