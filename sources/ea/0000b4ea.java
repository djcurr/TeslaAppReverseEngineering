package ta;

/* loaded from: classes.dex */
public class e extends ra.b<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // ja.c
    public int a() {
        return ((c) this.f49330a).i();
    }

    @Override // ja.c
    public Class<c> b() {
        return c.class;
    }

    @Override // ra.b, ja.b
    public void initialize() {
        ((c) this.f49330a).e().prepareToDraw();
    }

    @Override // ja.c
    public void recycle() {
        ((c) this.f49330a).stop();
        ((c) this.f49330a).k();
    }
}