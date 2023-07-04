package p8;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f46397a;

    public c(b bVar) {
        this.f46397a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f46397a.d();
        } catch (Exception e11) {
            d.c(e11);
        }
    }
}