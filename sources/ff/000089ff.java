package n60;

/* loaded from: classes5.dex */
public class w implements q {

    /* renamed from: a  reason: collision with root package name */
    volatile int f40659a = 4;

    /* renamed from: b  reason: collision with root package name */
    protected int f40660b = -1;

    /* renamed from: c  reason: collision with root package name */
    protected i[] f40661c = null;

    /* renamed from: d  reason: collision with root package name */
    protected i[] f40662d = null;

    /* renamed from: e  reason: collision with root package name */
    protected i f40663e = null;

    /* renamed from: f  reason: collision with root package name */
    protected int f40664f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int i11 = this.f40659a;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f40659a = i12;
            return i12;
        }
        return i11;
    }

    public int b() {
        return this.f40660b;
    }

    public i[] c() {
        return this.f40661c;
    }

    public i[] d() {
        return this.f40662d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f40659a;
    }

    public i f() {
        return this.f40663e;
    }

    public int g() {
        return this.f40664f;
    }

    public boolean h() {
        return this.f40659a <= 0;
    }

    public void i(int i11) {
        this.f40660b = i11;
    }

    public void j(i[] iVarArr) {
        this.f40661c = iVarArr;
    }

    public void k(i[] iVarArr) {
        this.f40662d = iVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i11) {
        this.f40659a = i11;
    }

    public void m(i iVar) {
        this.f40663e = iVar;
    }

    public void n(int i11) {
        this.f40664f = i11;
    }
}