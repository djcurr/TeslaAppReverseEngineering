package ka;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
class c implements l {

    /* renamed from: a  reason: collision with root package name */
    private final b f34505a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final h<a, Bitmap> f34506b = new h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f34507a;

        /* renamed from: b  reason: collision with root package name */
        private int f34508b;

        /* renamed from: c  reason: collision with root package name */
        private int f34509c;

        /* renamed from: d  reason: collision with root package name */
        private Bitmap.Config f34510d;

        public a(b bVar) {
            this.f34507a = bVar;
        }

        @Override // ka.m
        public void a() {
            this.f34507a.c(this);
        }

        public void b(int i11, int i12, Bitmap.Config config) {
            this.f34508b = i11;
            this.f34509c = i12;
            this.f34510d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f34508b == aVar.f34508b && this.f34509c == aVar.f34509c && this.f34510d == aVar.f34510d;
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f34508b * 31) + this.f34509c) * 31;
            Bitmap.Config config = this.f34510d;
            return i11 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.f(this.f34508b, this.f34509c, this.f34510d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ka.d
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        a e(int i11, int i12, Bitmap.Config config) {
            a b11 = b();
            b11.b(i11, i12, config);
            return b11;
        }
    }

    static String f(int i11, int i12, Bitmap.Config config) {
        return "[" + i11 + "x" + i12 + "], " + config;
    }

    private static String g(Bitmap bitmap) {
        return f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // ka.l
    public String a(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // ka.l
    public void b(Bitmap bitmap) {
        this.f34506b.d(this.f34505a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // ka.l
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        return this.f34506b.a(this.f34505a.e(i11, i12, config));
    }

    @Override // ka.l
    public String d(int i11, int i12, Bitmap.Config config) {
        return f(i11, i12, config);
    }

    @Override // ka.l
    public int e(Bitmap bitmap) {
        return bb.k.h(bitmap);
    }

    @Override // ka.l
    public Bitmap removeLast() {
        return this.f34506b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f34506b;
    }
}