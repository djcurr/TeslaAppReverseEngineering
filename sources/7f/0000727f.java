package h30;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final t f28843a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28844b;

    public g(t sb2) {
        kotlin.jvm.internal.s.g(sb2, "sb");
        this.f28843a = sb2;
        this.f28844b = true;
    }

    public final boolean a() {
        return this.f28844b;
    }

    public void b() {
        this.f28844b = true;
    }

    public void c() {
        this.f28844b = false;
    }

    public void d(byte b11) {
        this.f28843a.b(b11);
    }

    public final void e(char c11) {
        this.f28843a.a(c11);
    }

    public void f(double d11) {
        this.f28843a.c(String.valueOf(d11));
    }

    public void g(float f11) {
        this.f28843a.c(String.valueOf(f11));
    }

    public void h(int i11) {
        this.f28843a.b(i11);
    }

    public void i(long j11) {
        this.f28843a.b(j11);
    }

    public final void j(String v11) {
        kotlin.jvm.internal.s.g(v11, "v");
        this.f28843a.c(v11);
    }

    public void k(short s11) {
        this.f28843a.b(s11);
    }

    public void l(boolean z11) {
        this.f28843a.c(String.valueOf(z11));
    }

    public final void m(String value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f28843a.d(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(boolean z11) {
        this.f28844b = z11;
    }

    public void o() {
    }

    public void p() {
    }
}