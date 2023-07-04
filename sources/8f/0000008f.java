package af;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f395a = new c("JPEG", "jpeg");

    /* renamed from: b  reason: collision with root package name */
    public static final c f396b = new c("PNG", "png");

    /* renamed from: c  reason: collision with root package name */
    public static final c f397c = new c("GIF", "gif");

    /* renamed from: d  reason: collision with root package name */
    public static final c f398d = new c("BMP", "bmp");

    /* renamed from: e  reason: collision with root package name */
    public static final c f399e = new c("ICO", "ico");

    /* renamed from: f  reason: collision with root package name */
    public static final c f400f = new c("WEBP_SIMPLE", "webp");

    /* renamed from: g  reason: collision with root package name */
    public static final c f401g = new c("WEBP_LOSSLESS", "webp");

    /* renamed from: h  reason: collision with root package name */
    public static final c f402h = new c("WEBP_EXTENDED", "webp");

    /* renamed from: i  reason: collision with root package name */
    public static final c f403i = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j  reason: collision with root package name */
    public static final c f404j = new c("WEBP_ANIMATED", "webp");

    /* renamed from: k  reason: collision with root package name */
    public static final c f405k = new c("HEIF", "heif");

    /* renamed from: l  reason: collision with root package name */
    public static final c f406l = new c("DNG", "dng");

    public static boolean a(c cVar) {
        return cVar == f400f || cVar == f401g || cVar == f402h || cVar == f403i;
    }

    public static boolean b(c cVar) {
        return a(cVar) || cVar == f404j;
    }
}