package jq;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f33902a;

    /* renamed from: b  reason: collision with root package name */
    private d f33903b;

    static {
        System.getProperty("JSON_SMART_SIMPLE");
    }

    public a(int i11) {
        this.f33902a = i11;
    }

    private d a() {
        if (this.f33903b == null) {
            this.f33903b = new d(this.f33902a);
        }
        return this.f33903b;
    }

    public Object b(String str) {
        return a().x(str);
    }
}