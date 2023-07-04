package pm;

import ul.z;

/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f46690a;

    /* renamed from: b  reason: collision with root package name */
    private final T f46691b;

    public a(Class<T> cls, T t11) {
        this.f46690a = (Class) z.b(cls);
        this.f46691b = (T) z.b(t11);
    }

    public T a() {
        return this.f46691b;
    }

    public Class<T> b() {
        return this.f46690a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f46690a, this.f46691b);
    }
}