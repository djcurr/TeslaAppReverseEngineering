package t;

/* loaded from: classes.dex */
class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f51050a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private int f51051b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(u.d dVar, int i11) {
        this.f51051b = i11;
    }

    public int a() {
        int i11;
        synchronized (this.f51050a) {
            i11 = this.f51051b;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i11) {
        synchronized (this.f51050a) {
            this.f51051b = i11;
        }
    }
}