package d2;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    private f2.o f23295a;

    public boolean a() {
        return false;
    }

    public final long e() {
        f2.o oVar = this.f23295a;
        x2.o b11 = oVar == null ? null : x2.o.b(oVar.e());
        return b11 == null ? x2.o.f56954b.a() : b11.j();
    }

    public final f2.o t0() {
        return this.f23295a;
    }

    public boolean u0() {
        return false;
    }

    public final boolean v0() {
        f2.o oVar = this.f23295a;
        return oVar != null && oVar.h();
    }

    public abstract void w0();

    public abstract void x0(m mVar, androidx.compose.ui.input.pointer.a aVar, long j11);

    public final void y0(f2.o oVar) {
        this.f23295a = oVar;
    }
}