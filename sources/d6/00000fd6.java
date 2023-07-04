package c8;

import android.graphics.Paint;
import java.util.List;

/* loaded from: classes.dex */
public class q implements c8.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8991a;

    /* renamed from: b  reason: collision with root package name */
    private final b8.b f8992b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b8.b> f8993c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.a f8994d;

    /* renamed from: e  reason: collision with root package name */
    private final b8.d f8995e;

    /* renamed from: f  reason: collision with root package name */
    private final b8.b f8996f;

    /* renamed from: g  reason: collision with root package name */
    private final b f8997g;

    /* renamed from: h  reason: collision with root package name */
    private final c f8998h;

    /* renamed from: i  reason: collision with root package name */
    private final float f8999i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f9000j;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9001a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f9002b;

        static {
            int[] iArr = new int[c.values().length];
            f9002b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9002b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9002b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f9001a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9001a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9001a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i11 = a.f9001a[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i11 = a.f9002b[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public q(String str, b8.b bVar, List<b8.b> list, b8.a aVar, b8.d dVar, b8.b bVar2, b bVar3, c cVar, float f11, boolean z11) {
        this.f8991a = str;
        this.f8992b = bVar;
        this.f8993c = list;
        this.f8994d = aVar;
        this.f8995e = dVar;
        this.f8996f = bVar2;
        this.f8997g = bVar3;
        this.f8998h = cVar;
        this.f8999i = f11;
        this.f9000j = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.r(aVar, bVar, this);
    }

    public b b() {
        return this.f8997g;
    }

    public b8.a c() {
        return this.f8994d;
    }

    public b8.b d() {
        return this.f8992b;
    }

    public c e() {
        return this.f8998h;
    }

    public List<b8.b> f() {
        return this.f8993c;
    }

    public float g() {
        return this.f8999i;
    }

    public String h() {
        return this.f8991a;
    }

    public b8.d i() {
        return this.f8995e;
    }

    public b8.b j() {
        return this.f8996f;
    }

    public boolean k() {
        return this.f9000j;
    }
}