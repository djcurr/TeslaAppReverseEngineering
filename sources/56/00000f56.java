package c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<z, y> f8710a;

    /* renamed from: b  reason: collision with root package name */
    private y f8711b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(h00.l<? super z, ? extends y> effect) {
        kotlin.jvm.internal.s.g(effect, "effect");
        this.f8710a = effect;
    }

    @Override // c1.d1
    public void b() {
        z zVar;
        h00.l<z, y> lVar = this.f8710a;
        zVar = b0.f8438a;
        this.f8711b = lVar.invoke(zVar);
    }

    @Override // c1.d1
    public void d() {
    }

    @Override // c1.d1
    public void e() {
        y yVar = this.f8711b;
        if (yVar != null) {
            yVar.dispose();
        }
        this.f8711b = null;
    }
}