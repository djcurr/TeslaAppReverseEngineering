package yf;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private Thread f59494a = null;

    public void a() {
        Thread currentThread = Thread.currentThread();
        if (this.f59494a == null) {
            this.f59494a = currentThread;
        }
        wf.a.a(this.f59494a == currentThread);
    }
}