package fp;

/* loaded from: classes2.dex */
final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    private final String f26702b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26703c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f26704d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(int i11, String str) {
        super(i11);
        this.f26702b = str;
        this.f26704d = false;
        this.f26703c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f26702b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f26703c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f26704d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(int i11, String str, int i12) {
        super(i11);
        this.f26704d = true;
        this.f26703c = i12;
        this.f26702b = str;
    }
}