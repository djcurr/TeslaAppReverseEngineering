package z8;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public long f60373a;

    /* renamed from: b  reason: collision with root package name */
    public String f60374b;

    /* renamed from: c  reason: collision with root package name */
    public String f60375c;

    /* renamed from: d  reason: collision with root package name */
    public int f60376d;

    public a(String str) {
        this.f60375c = str;
    }

    public void a(int i11) {
        this.f60376d = i11;
    }

    public void b(long j11) {
        this.f60373a = j11;
    }

    public void c(String str) {
        this.f60374b = str;
    }

    public boolean d() {
        return this.f60373a > System.currentTimeMillis();
    }

    public void e() {
        this.f60373a = 0L;
    }
}