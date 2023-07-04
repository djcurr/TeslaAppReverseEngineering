package a8;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f347a;

    /* renamed from: b  reason: collision with root package name */
    public final float f348b;

    /* renamed from: c  reason: collision with root package name */
    public final float f349c;

    public h(String str, float f11, float f12) {
        this.f347a = str;
        this.f349c = f12;
        this.f348b = f11;
    }

    public boolean a(String str) {
        if (this.f347a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f347a.endsWith("\r")) {
            String str2 = this.f347a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}