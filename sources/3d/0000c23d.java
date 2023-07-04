package y70;

/* loaded from: classes5.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    final Object f59395a;

    /* renamed from: b  reason: collision with root package name */
    final m f59396b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f59397c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Object obj, m mVar) {
        this.f59395a = obj;
        this.f59396b = mVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f59395a == oVar.f59395a && this.f59396b.equals(oVar.f59396b);
        }
        return false;
    }

    public int hashCode() {
        return this.f59395a.hashCode() + this.f59396b.f59382f.hashCode();
    }
}