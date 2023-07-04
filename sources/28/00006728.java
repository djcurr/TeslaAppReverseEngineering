package e40;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private String f24638a;

    /* renamed from: b  reason: collision with root package name */
    private int f24639b = 0;

    public i(String str) {
        this.f24638a = str;
    }

    public boolean a() {
        return this.f24639b != -1;
    }

    public String b() {
        int i11 = this.f24639b;
        if (i11 == -1) {
            return null;
        }
        int indexOf = this.f24638a.indexOf(46, i11);
        if (indexOf == -1) {
            String substring = this.f24638a.substring(this.f24639b);
            this.f24639b = -1;
            return substring;
        }
        String substring2 = this.f24638a.substring(this.f24639b, indexOf);
        this.f24639b = indexOf + 1;
        return substring2;
    }
}