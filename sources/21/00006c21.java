package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Collection;

/* loaded from: classes5.dex */
public class a extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<a> f25406b = new d<>(a.class);
    @vw.b({VCardVersion.V2_1})

    /* renamed from: c  reason: collision with root package name */
    public static final a f25407c;
    @vw.b({VCardVersion.V3_0})

    /* renamed from: d  reason: collision with root package name */
    public static final a f25408d;

    static {
        new a("QUOTED-PRINTABLE", true);
        f25407c = new a("BASE64", true);
        new a("8BIT", true);
        new a("7BIT", true);
        f25408d = new a("b");
    }

    private a(String str) {
        super(str);
    }

    public static Collection<a> d() {
        return f25406b.a();
    }

    public static a e(String str) {
        return (a) f25406b.d(str);
    }

    public static a f(String str) {
        return (a) f25406b.e(str);
    }

    private a(String str, boolean z11) {
        super(str, z11);
    }
}