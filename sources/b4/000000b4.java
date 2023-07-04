package ak;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final b f457a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f458b;

    public e() {
        this(b.f439a);
    }

    public synchronized void a() {
        while (!this.f458b) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z11;
        z11 = this.f458b;
        this.f458b = false;
        return z11;
    }

    public synchronized boolean c() {
        return this.f458b;
    }

    public synchronized boolean d() {
        if (this.f458b) {
            return false;
        }
        this.f458b = true;
        notifyAll();
        return true;
    }

    public e(b bVar) {
        this.f457a = bVar;
    }
}