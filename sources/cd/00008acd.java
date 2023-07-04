package net.time4j.calendar;

/* loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a extends j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f40900a;

        a(int i11) {
            this.f40900a = i11;
        }

        @Override // net.time4j.calendar.j
        public int d() {
            return net.time4j.base.c.e(this.f40900a, 2636);
        }
    }

    public static j a(int i11) {
        if (i11 >= 1) {
            return b(net.time4j.base.c.e(i11, -2333));
        }
        throw new IllegalArgumentException("Dangi year must not be smaller than 1: " + i11);
    }

    public static j b(int i11) {
        return new a(i11);
    }

    public final int c() {
        return net.time4j.base.c.a((d() + 1) - 1, 60) + 1;
    }

    public abstract int d();

    public final c e() {
        int c11 = net.time4j.base.c.c(d() + 1, 60);
        return c.q(c11 != 0 ? c11 : 60);
    }
}