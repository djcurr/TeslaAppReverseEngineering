package ezvcard.parameter;

/* loaded from: classes5.dex */
public class ImppType extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<ImppType> f25395b = new d<>(ImppType.class);

    static {
        new ImppType("personal");
        new ImppType("business");
        new ImppType("home");
        new ImppType("work");
        new ImppType("mobile");
        new ImppType("pref");
    }

    private ImppType(String str) {
        super(str);
    }

    public static ImppType d(String str) {
        return (ImppType) f25395b.e(str);
    }
}