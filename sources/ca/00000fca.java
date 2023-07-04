package c8;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final a f8948a;

    /* renamed from: b  reason: collision with root package name */
    private final b8.h f8949b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.d f8950c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8951d;

    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public h(a aVar, b8.h hVar, b8.d dVar, boolean z11) {
        this.f8948a = aVar;
        this.f8949b = hVar;
        this.f8950c = dVar;
        this.f8951d = z11;
    }

    public a a() {
        return this.f8948a;
    }

    public b8.h b() {
        return this.f8949b;
    }

    public b8.d c() {
        return this.f8950c;
    }

    public boolean d() {
        return this.f8951d;
    }
}