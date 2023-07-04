package t5;

import android.graphics.Bitmap;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b  reason: collision with root package name */
    private final u5.a<C1145a, Bitmap> f51634b = new u5.a<>();

    /* renamed from: t5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C1145a {

        /* renamed from: a  reason: collision with root package name */
        private final int f51635a;

        /* renamed from: b  reason: collision with root package name */
        private final int f51636b;

        /* renamed from: c  reason: collision with root package name */
        private final Bitmap.Config f51637c;

        public C1145a(int i11, int i12, Bitmap.Config config) {
            s.g(config, "config");
            this.f51635a = i11;
            this.f51636b = i12;
            this.f51637c = config;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C1145a) {
                    C1145a c1145a = (C1145a) obj;
                    return this.f51635a == c1145a.f51635a && this.f51636b == c1145a.f51636b && s.c(this.f51637c, c1145a.f51637c);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f51635a) * 31) + Integer.hashCode(this.f51636b)) * 31;
            Bitmap.Config config = this.f51637c;
            return hashCode + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return "Key(width=" + this.f51635a + ", height=" + this.f51636b + ", config=" + this.f51637c + ")";
        }
    }

    @Override // t5.c
    public String a(int i11, int i12, Bitmap.Config config) {
        s.g(config, "config");
        return '[' + i11 + " x " + i12 + "], " + config;
    }

    @Override // t5.c
    public void b(Bitmap bitmap) {
        s.g(bitmap, "bitmap");
        u5.a<C1145a, Bitmap> aVar = this.f51634b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        s.f(config, "bitmap.config");
        aVar.d(new C1145a(width, height, config), bitmap);
    }

    @Override // t5.c
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        s.g(config, "config");
        return this.f51634b.g(new C1145a(i11, i12, config));
    }

    @Override // t5.c
    public String d(Bitmap bitmap) {
        s.g(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        s.f(config, "bitmap.config");
        return a(width, height, config);
    }

    @Override // t5.c
    public Bitmap removeLast() {
        return this.f51634b.f();
    }

    public String toString() {
        return "AttributeStrategy: entries=" + this.f51634b;
    }
}