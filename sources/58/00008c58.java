package nf;

/* loaded from: classes3.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private bf.e f41633c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f41634d;

    public a(bf.e eVar) {
        this(eVar, true);
    }

    public synchronized bf.e C() {
        return this.f41633c;
    }

    @Override // nf.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            bf.e eVar = this.f41633c;
            if (eVar == null) {
                return;
            }
            this.f41633c = null;
            eVar.a();
        }
    }

    @Override // nf.c
    public synchronized int g() {
        bf.e eVar;
        eVar = this.f41633c;
        return eVar == null ? 0 : eVar.d().g();
    }

    @Override // nf.h
    public synchronized int getHeight() {
        bf.e eVar;
        eVar = this.f41633c;
        return eVar == null ? 0 : eVar.d().getHeight();
    }

    @Override // nf.h
    public synchronized int getWidth() {
        bf.e eVar;
        eVar = this.f41633c;
        return eVar == null ? 0 : eVar.d().getWidth();
    }

    @Override // nf.c
    public synchronized boolean isClosed() {
        return this.f41633c == null;
    }

    @Override // nf.c
    public boolean j() {
        return this.f41634d;
    }

    public synchronized bf.c p() {
        bf.e eVar;
        eVar = this.f41633c;
        return eVar == null ? null : eVar.d();
    }

    public a(bf.e eVar, boolean z11) {
        this.f41633c = eVar;
        this.f41634d = z11;
    }
}