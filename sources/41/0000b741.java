package u50;

/* loaded from: classes5.dex */
public class f extends b {

    /* renamed from: b  reason: collision with root package name */
    private i f53205b;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(boolean z11, i iVar) {
        super(z11);
        this.f53205b = iVar;
    }

    public i b() {
        return this.f53205b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            i iVar = this.f53205b;
            i b11 = ((f) obj).b();
            return iVar == null ? b11 == null : iVar.equals(b11);
        }
        return false;
    }

    public int hashCode() {
        int i11 = !a();
        i iVar = this.f53205b;
        return iVar != null ? i11 ^ iVar.hashCode() : i11;
    }
}