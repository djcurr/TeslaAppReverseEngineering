package th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ph.l;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final f f51928a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f51929b;

    /* renamed from: c  reason: collision with root package name */
    private final b f51930c;

    /* renamed from: d  reason: collision with root package name */
    private final String f51931d;

    /* renamed from: th.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1154a {

        /* renamed from: a  reason: collision with root package name */
        private f f51932a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f51933b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f51934c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f51935d = "";

        C1154a() {
        }

        public C1154a a(d dVar) {
            this.f51933b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f51932a, Collections.unmodifiableList(this.f51933b), this.f51934c, this.f51935d);
        }

        public C1154a c(String str) {
            this.f51935d = str;
            return this;
        }

        public C1154a d(b bVar) {
            this.f51934c = bVar;
            return this;
        }

        public C1154a e(f fVar) {
            this.f51932a = fVar;
            return this;
        }
    }

    static {
        new C1154a().b();
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f51928a = fVar;
        this.f51929b = list;
        this.f51930c = bVar;
        this.f51931d = str;
    }

    public static C1154a e() {
        return new C1154a();
    }

    @om.d(tag = 4)
    public String a() {
        return this.f51931d;
    }

    @om.d(tag = 3)
    public b b() {
        return this.f51930c;
    }

    @om.d(tag = 2)
    public List<d> c() {
        return this.f51929b;
    }

    @om.d(tag = 1)
    public f d() {
        return this.f51928a;
    }

    public byte[] f() {
        return l.a(this);
    }
}