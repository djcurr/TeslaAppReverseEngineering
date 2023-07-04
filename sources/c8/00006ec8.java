package freemarker.ext.beans;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected final Object f26898a;

    static {
        hx.b.i("freemarker.beans");
        new ix.j("UNKNOWN");
        new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Object obj, i iVar, boolean z11) {
        this.f26898a = obj;
        if (!z11 || obj == null) {
            return;
        }
        iVar.g().k(obj.getClass());
    }

    public String toString() {
        return this.f26898a.toString();
    }
}