package fp;

/* loaded from: classes2.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f26699a = 0;

    /* renamed from: b  reason: collision with root package name */
    private a f26700b = a.NUMERIC;

    /* loaded from: classes2.dex */
    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f26699a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i11) {
        this.f26699a += i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f26700b == a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f26700b == a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f26700b = a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f26700b = a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.f26700b = a.NUMERIC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i11) {
        this.f26699a = i11;
    }
}