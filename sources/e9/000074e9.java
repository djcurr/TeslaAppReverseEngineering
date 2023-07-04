package i8;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private float f30207a;

    /* renamed from: b  reason: collision with root package name */
    private float f30208b;

    public d(float f11, float f12) {
        this.f30207a = f11;
        this.f30208b = f12;
    }

    public boolean a(float f11, float f12) {
        return this.f30207a == f11 && this.f30208b == f12;
    }

    public float b() {
        return this.f30207a;
    }

    public float c() {
        return this.f30208b;
    }

    public void d(float f11, float f12) {
        this.f30207a = f11;
        this.f30208b = f12;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}