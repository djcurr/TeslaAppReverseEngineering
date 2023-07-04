package y70;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class a implements Runnable, k {

    /* renamed from: a  reason: collision with root package name */
    private final j f59315a = new j();

    /* renamed from: b  reason: collision with root package name */
    private final c f59316b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c cVar) {
        this.f59316b = cVar;
    }

    @Override // y70.k
    public void a(o oVar, Object obj) {
        this.f59315a.a(i.a(oVar, obj));
        this.f59316b.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i b11 = this.f59315a.b();
        if (b11 != null) {
            this.f59316b.g(b11);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}