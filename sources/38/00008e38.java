package oj;

import ak.k0;
import fi.f;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import nj.g;
import nj.i;
import nj.j;
import oj.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f42622a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<j> f42623b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<b> f42624c;

    /* renamed from: d  reason: collision with root package name */
    private b f42625d;

    /* renamed from: e  reason: collision with root package name */
    private long f42626e;

    /* renamed from: f  reason: collision with root package name */
    private long f42627f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b extends i implements Comparable<b> {

        /* renamed from: j  reason: collision with root package name */
        private long f42628j;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: y */
        public int compareTo(b bVar) {
            if (l() != bVar.l()) {
                return l() ? 1 : -1;
            }
            long j11 = this.f13266e - bVar.f13266e;
            if (j11 == 0) {
                j11 = this.f42628j - bVar.f42628j;
                if (j11 == 0) {
                    return 0;
                }
            }
            return j11 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c extends j {

        /* renamed from: e  reason: collision with root package name */
        private f.a<c> f42629e;

        public c(f.a<c> aVar) {
            this.f42629e = aVar;
        }

        @Override // fi.f
        public final void q() {
            this.f42629e.a(this);
        }
    }

    public e() {
        for (int i11 = 0; i11 < 10; i11++) {
            this.f42622a.add(new b());
        }
        this.f42623b = new ArrayDeque<>();
        for (int i12 = 0; i12 < 2; i12++) {
            this.f42623b.add(new c(new f.a() { // from class: oj.d
                @Override // fi.f.a
                public final void a(fi.f fVar) {
                    e.this.n((e.c) fVar);
                }
            }));
        }
        this.f42624c = new PriorityQueue<>();
    }

    private void m(b bVar) {
        bVar.f();
        this.f42622a.add(bVar);
    }

    @Override // nj.g
    public void a(long j11) {
        this.f42626e = j11;
    }

    protected abstract nj.f e();

    protected abstract void f(i iVar);

    @Override // fi.c
    public void flush() {
        this.f42627f = 0L;
        this.f42626e = 0L;
        while (!this.f42624c.isEmpty()) {
            m((b) k0.j(this.f42624c.poll()));
        }
        b bVar = this.f42625d;
        if (bVar != null) {
            m(bVar);
            this.f42625d = null;
        }
    }

    @Override // fi.c
    /* renamed from: g */
    public i d() {
        ak.a.f(this.f42625d == null);
        if (this.f42622a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f42622a.pollFirst();
        this.f42625d = pollFirst;
        return pollFirst;
    }

    @Override // fi.c
    /* renamed from: h */
    public j b() {
        if (this.f42623b.isEmpty()) {
            return null;
        }
        while (!this.f42624c.isEmpty() && ((b) k0.j(this.f42624c.peek())).f13266e <= this.f42626e) {
            b bVar = (b) k0.j(this.f42624c.poll());
            if (bVar.l()) {
                j jVar = (j) k0.j(this.f42623b.pollFirst());
                jVar.e(4);
                m(bVar);
                return jVar;
            }
            f(bVar);
            if (k()) {
                nj.f e11 = e();
                j jVar2 = (j) k0.j(this.f42623b.pollFirst());
                jVar2.r(bVar.f13266e, e11, Long.MAX_VALUE);
                m(bVar);
                return jVar2;
            }
            m(bVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j i() {
        return this.f42623b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long j() {
        return this.f42626e;
    }

    protected abstract boolean k();

    @Override // fi.c
    /* renamed from: l */
    public void c(i iVar) {
        ak.a.a(iVar == this.f42625d);
        b bVar = (b) iVar;
        if (bVar.k()) {
            m(bVar);
        } else {
            long j11 = this.f42627f;
            this.f42627f = 1 + j11;
            bVar.f42628j = j11;
            this.f42624c.add(bVar);
        }
        this.f42625d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(j jVar) {
        jVar.f();
        this.f42623b.add(jVar);
    }

    @Override // fi.c
    public void release() {
    }
}