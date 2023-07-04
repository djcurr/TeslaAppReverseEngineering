package zu;

import java.util.List;

/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f60792a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f60793b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f60794c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f60795d;

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f60796e;

    static {
        List<String> d11;
        List<String> l11;
        List<String> l12;
        List<String> l13;
        d11 = wz.v.d("honor");
        f60793b = d11;
        l11 = wz.w.l("xiaomi", "redmi", "blackshark", "poco");
        f60794c = l11;
        l12 = wz.w.l("oppo", "realme", "oneplus");
        f60795d = l12;
        l13 = wz.w.l("vivo", "iqoo");
        f60796e = l13;
    }

    private w() {
    }

    public final boolean a() {
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}