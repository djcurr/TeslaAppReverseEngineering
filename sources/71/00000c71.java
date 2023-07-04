package bf;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f7650a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7651b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7652c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7653d;

    /* renamed from: e  reason: collision with root package name */
    public final a f7654e;

    /* renamed from: f  reason: collision with root package name */
    public final EnumC0150b f7655f;

    /* loaded from: classes3.dex */
    public enum a {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    /* renamed from: bf.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0150b {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public b(int i11, int i12, int i13, int i14, int i15, a aVar, EnumC0150b enumC0150b) {
        this.f7650a = i12;
        this.f7651b = i13;
        this.f7652c = i14;
        this.f7653d = i15;
        this.f7654e = aVar;
        this.f7655f = enumC0150b;
    }
}