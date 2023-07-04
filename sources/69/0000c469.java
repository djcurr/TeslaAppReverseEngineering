package z5;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: b  reason: collision with root package name */
    private final c f60295b;

    /* renamed from: c  reason: collision with root package name */
    private final w f60296c;

    /* renamed from: d  reason: collision with root package name */
    private final t5.d f60297d;

    /* renamed from: e  reason: collision with root package name */
    private final g6.k f60298e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements o.a {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f60299a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f60300b;

        /* renamed from: c  reason: collision with root package name */
        private final int f60301c;

        public b(Bitmap bitmap, boolean z11, int i11) {
            kotlin.jvm.internal.s.g(bitmap, "bitmap");
            this.f60299a = bitmap;
            this.f60300b = z11;
            this.f60301c = i11;
        }

        @Override // z5.o.a
        public boolean a() {
            return this.f60300b;
        }

        @Override // z5.o.a
        public Bitmap b() {
            return this.f60299a;
        }

        public final int c() {
            return this.f60301c;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends androidx.collection.e<l, b> {
        c(int i11, int i12) {
            super(i12);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.e
        /* renamed from: a */
        public void entryRemoved(boolean z11, l key, b oldValue, b bVar) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(oldValue, "oldValue");
            if (p.this.f60297d.b(oldValue.b())) {
                return;
            }
            p.this.f60296c.d(key, oldValue.b(), oldValue.a(), oldValue.c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.e
        /* renamed from: b */
        public int sizeOf(l key, b value) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(value, "value");
            return value.c();
        }
    }

    static {
        new a(null);
    }

    public p(w weakMemoryCache, t5.d referenceCounter, int i11, g6.k kVar) {
        kotlin.jvm.internal.s.g(weakMemoryCache, "weakMemoryCache");
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        this.f60296c = weakMemoryCache;
        this.f60297d = referenceCounter;
        this.f60298e = kVar;
        this.f60295b = new c(i11, i11);
    }

    @Override // z5.s
    public synchronized void a(int i11) {
        g6.k kVar = this.f60298e;
        if (kVar != null && kVar.getLevel() <= 2) {
            kVar.a("RealStrongMemoryCache", 2, "trimMemory, level=" + i11, null);
        }
        if (i11 >= 40) {
            f();
        } else if (10 <= i11 && 20 > i11) {
            this.f60295b.trimToSize(i() / 2);
        }
    }

    @Override // z5.s
    public synchronized void c(l key, Bitmap bitmap, boolean z11) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(bitmap, "bitmap");
        int a11 = g6.a.a(bitmap);
        if (a11 > h()) {
            if (this.f60295b.remove(key) == null) {
                this.f60296c.d(key, bitmap, z11, a11);
            }
            return;
        }
        this.f60297d.c(bitmap);
        this.f60295b.put(key, new b(bitmap, z11, a11));
    }

    public synchronized void f() {
        g6.k kVar = this.f60298e;
        if (kVar != null && kVar.getLevel() <= 2) {
            kVar.a("RealStrongMemoryCache", 2, "clearMemory", null);
        }
        this.f60295b.trimToSize(-1);
    }

    @Override // z5.s
    /* renamed from: g */
    public synchronized b b(l key) {
        kotlin.jvm.internal.s.g(key, "key");
        return this.f60295b.get(key);
    }

    public int h() {
        return this.f60295b.maxSize();
    }

    public int i() {
        return this.f60295b.size();
    }
}