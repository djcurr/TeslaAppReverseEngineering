package m6;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f38428a;

    /* renamed from: b  reason: collision with root package name */
    private int f38429b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38430c;

    /* renamed from: d  reason: collision with root package name */
    private int f38431d;

    public d(String str, int i11) {
        this.f38428a = str;
        this.f38429b = i11;
    }

    public int a() {
        return this.f38431d;
    }

    public int b() {
        return this.f38429b;
    }

    public String c() {
        return this.f38428a;
    }

    public boolean d() {
        return this.f38430c;
    }

    public void e(boolean z11) {
        this.f38430c = z11;
    }

    public void f(int i11) {
        this.f38431d = i11;
    }

    public void g(int i11) {
        this.f38429b = i11;
    }

    public void h(String str) {
        this.f38428a = str;
    }

    public String toString() {
        switch (this.f38429b) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.f38428a;
            case 5:
            case 6:
                return this.f38428a;
            default:
                return this.f38428a;
        }
    }
}