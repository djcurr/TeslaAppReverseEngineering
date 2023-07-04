package c1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private int f8443a;

    public d(int i11) {
        this.f8443a = i11;
    }

    public final int a() {
        return this.f8443a;
    }

    public final boolean b() {
        return this.f8443a != Integer.MIN_VALUE;
    }

    public final void c(int i11) {
        this.f8443a = i11;
    }

    public final int d(i1 slots) {
        kotlin.jvm.internal.s.g(slots, "slots");
        return slots.b(this);
    }

    public final int e(k1 writer) {
        kotlin.jvm.internal.s.g(writer, "writer");
        return writer.e(this);
    }
}