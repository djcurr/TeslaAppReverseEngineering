package n5;

/* loaded from: classes.dex */
public class f<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final e<TResult> f40526a = new e<>();

    public e<TResult> a() {
        return this.f40526a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f40526a.p();
    }

    public boolean f(Exception exc) {
        return this.f40526a.q(exc);
    }

    public boolean g(TResult tresult) {
        return this.f40526a.r(tresult);
    }
}