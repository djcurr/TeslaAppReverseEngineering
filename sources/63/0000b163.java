package s0;

import f2.a0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements q0.f, a0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f49856a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49857b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f49858c;

    /* renamed from: d  reason: collision with root package name */
    private final float f49859d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f49860e;

    /* renamed from: f  reason: collision with root package name */
    private final List<q0.e> f49861f;

    /* renamed from: g  reason: collision with root package name */
    private final int f49862g;

    /* loaded from: classes.dex */
    public static final class a implements r0.h, a0 {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ a0 f49863a;

        /* renamed from: s0.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1092a implements r0.e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q0.e f49865a;

            C1092a(q0.e eVar) {
                this.f49865a = eVar;
            }

            @Override // r0.e
            public int getIndex() {
                return this.f49865a.getIndex();
            }
        }

        a() {
            this.f49863a = p.this.j();
        }

        @Override // r0.h
        public List<r0.e> a() {
            List<q0.e> a11 = p.this.a();
            ArrayList arrayList = new ArrayList(a11.size());
            int size = a11.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new C1092a(a11.get(i11)));
            }
            return arrayList;
        }

        @Override // f2.a0
        public void b() {
            this.f49863a.b();
        }

        @Override // f2.a0
        public Map<f2.a, Integer> c() {
            return this.f49863a.c();
        }

        @Override // f2.a0
        public int getHeight() {
            return this.f49863a.getHeight();
        }

        @Override // f2.a0
        public int getWidth() {
            return this.f49863a.getWidth();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(u uVar, int i11, boolean z11, float f11, a0 measureResult, List<? extends q0.e> visibleItemsInfo, int i12, int i13, int i14) {
        kotlin.jvm.internal.s.g(measureResult, "measureResult");
        kotlin.jvm.internal.s.g(visibleItemsInfo, "visibleItemsInfo");
        this.f49856a = uVar;
        this.f49857b = i11;
        this.f49858c = z11;
        this.f49859d = f11;
        this.f49860e = measureResult;
        this.f49861f = visibleItemsInfo;
        this.f49862g = i14;
    }

    @Override // q0.f
    public List<q0.e> a() {
        return this.f49861f;
    }

    @Override // f2.a0
    public void b() {
        this.f49860e.b();
    }

    @Override // f2.a0
    public Map<f2.a, Integer> c() {
        return this.f49860e.c();
    }

    @Override // q0.f
    public int d() {
        return this.f49862g;
    }

    public final boolean e() {
        return this.f49858c;
    }

    public final float f() {
        return this.f49859d;
    }

    public final u g() {
        return this.f49856a;
    }

    @Override // f2.a0
    public int getHeight() {
        return this.f49860e.getHeight();
    }

    @Override // f2.a0
    public int getWidth() {
        return this.f49860e.getWidth();
    }

    public final int h() {
        return this.f49857b;
    }

    public final r0.h i() {
        return new a();
    }

    public final a0 j() {
        return this.f49860e;
    }
}