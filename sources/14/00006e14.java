package fe;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f26214a;

    /* renamed from: b  reason: collision with root package name */
    private int f26215b;

    /* renamed from: c  reason: collision with root package name */
    private int f26216c;

    public d() {
        a();
    }

    public void a() {
        this.f26214a = false;
        this.f26215b = 4;
        c();
    }

    public void b() {
        this.f26216c++;
    }

    public void c() {
        this.f26216c = 0;
    }

    public void d(boolean z11) {
        this.f26214a = z11;
    }

    public boolean e() {
        return this.f26214a && this.f26216c < this.f26215b;
    }
}