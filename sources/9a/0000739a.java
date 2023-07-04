package hp;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f29368a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29369b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29370c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29371d;

    /* renamed from: e  reason: collision with root package name */
    private int f29372e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i11, int i12, int i13, int i14) {
        this.f29368a = i11;
        this.f29369b = i12;
        this.f29370c = i13;
        this.f29371d = i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f29370c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f29369b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f29372e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f29368a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f29371d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f29369b - this.f29368a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return h(this.f29372e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(int i11) {
        return i11 != -1 && this.f29370c == (i11 % 3) * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i11) {
        this.f29372e = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f29372e = ((this.f29371d / 30) * 3) + (this.f29370c / 3);
    }

    public String toString() {
        return this.f29372e + "|" + this.f29371d;
    }
}