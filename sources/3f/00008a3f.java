package na;

import java.util.Queue;

/* loaded from: classes.dex */
public class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final bb.g<b<A>, B> f40728a;

    /* loaded from: classes.dex */
    class a extends bb.g<b<A>, B> {
        a(m mVar, long j11) {
            super(j11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bb.g
        /* renamed from: n */
        public void j(b<A> bVar, B b11) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        private static final Queue<b<?>> f40729d = bb.k.f(0);

        /* renamed from: a  reason: collision with root package name */
        private int f40730a;

        /* renamed from: b  reason: collision with root package name */
        private int f40731b;

        /* renamed from: c  reason: collision with root package name */
        private A f40732c;

        private b() {
        }

        static <A> b<A> a(A a11, int i11, int i12) {
            b<A> bVar;
            Queue<b<?>> queue = f40729d;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a11, i11, i12);
            return bVar;
        }

        private void b(A a11, int i11, int i12) {
            this.f40732c = a11;
            this.f40731b = i11;
            this.f40730a = i12;
        }

        public void c() {
            Queue<b<?>> queue = f40729d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f40731b == bVar.f40731b && this.f40730a == bVar.f40730a && this.f40732c.equals(bVar.f40732c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f40730a * 31) + this.f40731b) * 31) + this.f40732c.hashCode();
        }
    }

    public m(long j11) {
        this.f40728a = new a(this, j11);
    }

    public B a(A a11, int i11, int i12) {
        b<A> a12 = b.a(a11, i11, i12);
        B g11 = this.f40728a.g(a12);
        a12.c();
        return g11;
    }

    public void b(A a11, int i11, int i12, B b11) {
        this.f40728a.k(b.a(a11, i11, i12), b11);
    }
}