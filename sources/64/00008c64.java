package nh;

import java.util.Objects;

/* loaded from: classes3.dex */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f41659a;

    /* renamed from: b  reason: collision with root package name */
    private final T f41660b;

    /* renamed from: c  reason: collision with root package name */
    private final d f41661c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, T t11, d dVar) {
        this.f41659a = num;
        Objects.requireNonNull(t11, "Null payload");
        this.f41660b = t11;
        Objects.requireNonNull(dVar, "Null priority");
        this.f41661c = dVar;
    }

    @Override // nh.c
    public Integer a() {
        return this.f41659a;
    }

    @Override // nh.c
    public T b() {
        return this.f41660b;
    }

    @Override // nh.c
    public d c() {
        return this.f41661c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f41659a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f41660b.equals(cVar.b()) && this.f41661c.equals(cVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f41659a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f41660b.hashCode()) * 1000003) ^ this.f41661c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f41659a + ", payload=" + this.f41660b + ", priority=" + this.f41661c + "}";
    }
}