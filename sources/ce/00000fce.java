package c8;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8955a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8956b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.b f8957c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.m<PointF, PointF> f8958d;

    /* renamed from: e  reason: collision with root package name */
    private final b8.b f8959e;

    /* renamed from: f  reason: collision with root package name */
    private final b8.b f8960f;

    /* renamed from: g  reason: collision with root package name */
    private final b8.b f8961g;

    /* renamed from: h  reason: collision with root package name */
    private final b8.b f8962h;

    /* renamed from: i  reason: collision with root package name */
    private final b8.b f8963i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f8964j;

    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        a(int i11) {
            this.value = i11;
        }

        public static a forValue(int i11) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.value == i11) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, b8.b bVar, b8.m<PointF, PointF> mVar, b8.b bVar2, b8.b bVar3, b8.b bVar4, b8.b bVar5, b8.b bVar6, boolean z11) {
        this.f8955a = str;
        this.f8956b = aVar;
        this.f8957c = bVar;
        this.f8958d = mVar;
        this.f8959e = bVar2;
        this.f8960f = bVar3;
        this.f8961g = bVar4;
        this.f8962h = bVar5;
        this.f8963i = bVar6;
        this.f8964j = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.n(aVar, bVar, this);
    }

    public b8.b b() {
        return this.f8960f;
    }

    public b8.b c() {
        return this.f8962h;
    }

    public String d() {
        return this.f8955a;
    }

    public b8.b e() {
        return this.f8961g;
    }

    public b8.b f() {
        return this.f8963i;
    }

    public b8.b g() {
        return this.f8957c;
    }

    public b8.m<PointF, PointF> h() {
        return this.f8958d;
    }

    public b8.b i() {
        return this.f8959e;
    }

    public a j() {
        return this.f8956b;
    }

    public boolean k() {
        return this.f8964j;
    }
}