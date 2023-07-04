package t5;

import android.graphics.Bitmap;
import g6.m;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.p0;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: b  reason: collision with root package name */
    private final u5.a<Integer, Bitmap> f51663b = new u5.a<>();

    /* renamed from: c  reason: collision with root package name */
    private final TreeMap<Integer, Integer> f51664c = new TreeMap<>();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    private final void e(int i11) {
        int intValue = ((Number) p0.j(this.f51664c, Integer.valueOf(i11))).intValue();
        if (intValue == 1) {
            this.f51664c.remove(Integer.valueOf(i11));
        } else {
            this.f51664c.put(Integer.valueOf(i11), Integer.valueOf(intValue - 1));
        }
    }

    @Override // t5.c
    public String a(int i11, int i12, Bitmap.Config config) {
        s.g(config, "config");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(m.f27804a.a(i11, i12, config));
        sb2.append(']');
        return sb2.toString();
    }

    @Override // t5.c
    public void b(Bitmap bitmap) {
        s.g(bitmap, "bitmap");
        int a11 = g6.a.a(bitmap);
        this.f51663b.d(Integer.valueOf(a11), bitmap);
        Integer num = this.f51664c.get(Integer.valueOf(a11));
        this.f51664c.put(Integer.valueOf(a11), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // t5.c
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        s.g(config, "config");
        int a11 = m.f27804a.a(i11, i12, config);
        Integer ceilingKey = this.f51664c.ceilingKey(Integer.valueOf(a11));
        if (ceilingKey != null) {
            if (!(ceilingKey.intValue() <= a11 * 4)) {
                ceilingKey = null;
            }
            if (ceilingKey != null) {
                a11 = ceilingKey.intValue();
            }
        }
        Bitmap g11 = this.f51663b.g(Integer.valueOf(a11));
        if (g11 != null) {
            e(a11);
            g11.reconfigure(i11, i12, config);
        }
        return g11;
    }

    @Override // t5.c
    public String d(Bitmap bitmap) {
        s.g(bitmap, "bitmap");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(g6.a.a(bitmap));
        sb2.append(']');
        return sb2.toString();
    }

    @Override // t5.c
    public Bitmap removeLast() {
        Bitmap f11 = this.f51663b.f();
        if (f11 != null) {
            e(f11.getAllocationByteCount());
        }
        return f11;
    }

    public String toString() {
        return "SizeStrategy: entries=" + this.f51663b + ", sizes=" + this.f51664c;
    }
}