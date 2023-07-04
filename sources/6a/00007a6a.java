package ix;

/* loaded from: classes5.dex */
public abstract class f extends freemarker.ext.beans.j {

    /* renamed from: h  reason: collision with root package name */
    private boolean f32826h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32827i;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(p pVar) {
        super(d.l(pVar), true);
        this.f32826h = c().c() >= q.f32845c;
        this.f32827i = true;
    }

    @Override // freemarker.ext.beans.j
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            f fVar = (f) obj;
            return this.f32826h == fVar.k() && this.f32827i == fVar.f32827i;
        }
        return false;
    }

    @Override // freemarker.ext.beans.j
    public int hashCode() {
        return (((super.hashCode() * 31) + (this.f32826h ? 1231 : 1237)) * 31) + (this.f32827i ? 1231 : 1237);
    }

    public boolean j() {
        return this.f32827i;
    }

    public boolean k() {
        return this.f32826h;
    }
}