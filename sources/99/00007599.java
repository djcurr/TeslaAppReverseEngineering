package im;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f30475a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30476b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f30477c;

    /* renamed from: d  reason: collision with root package name */
    public final e f30478d;

    public e(Throwable th2, d dVar) {
        this.f30475a = th2.getLocalizedMessage();
        this.f30476b = th2.getClass().getName();
        this.f30477c = dVar.a(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f30478d = cause != null ? new e(cause, dVar) : null;
    }
}