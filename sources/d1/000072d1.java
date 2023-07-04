package h8;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private float f28986a;

    /* renamed from: b  reason: collision with root package name */
    private int f28987b;

    public void a(float f11) {
        float f12 = this.f28986a + f11;
        this.f28986a = f12;
        int i11 = this.f28987b + 1;
        this.f28987b = i11;
        if (i11 == Integer.MAX_VALUE) {
            this.f28986a = f12 / 2.0f;
            this.f28987b = i11 / 2;
        }
    }
}