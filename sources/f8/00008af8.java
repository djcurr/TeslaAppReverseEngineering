package net.time4j.engine;

/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f40947a = a(0);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b extends d0 {

        /* renamed from: b  reason: collision with root package name */
        private final int f40948b;

        @Override // net.time4j.engine.d0
        public int b(g gVar, net.time4j.tz.k kVar) {
            return this.f40948b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f40948b == ((b) obj).f40948b;
        }

        public int hashCode() {
            return this.f40948b;
        }

        public String toString() {
            return "FixedStartOfDay[" + this.f40948b + "]";
        }

        private b(int i11) {
            this.f40948b = i11;
        }
    }

    static {
        a(-21600);
        a(21600);
    }

    protected d0() {
    }

    private static d0 a(int i11) {
        return new b(i11);
    }

    public abstract int b(g gVar, net.time4j.tz.k kVar);
}