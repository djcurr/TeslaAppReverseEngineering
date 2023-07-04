package vw;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f54645a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54646b;

    public c(int i11, Object... objArr) {
        this.f54645a = Integer.valueOf(i11);
        this.f54646b = ezvcard.a.INSTANCE.getValidationWarning(i11, objArr);
    }

    public Integer a() {
        return this.f54645a;
    }

    public String b() {
        return this.f54646b;
    }

    public String toString() {
        if (this.f54645a == null) {
            return this.f54646b;
        }
        return "(" + this.f54645a + ") " + this.f54646b;
    }
}