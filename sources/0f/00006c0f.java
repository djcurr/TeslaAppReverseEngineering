package ezvcard.parameter;

import java.util.Collection;

/* loaded from: classes5.dex */
public class Calscale extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<Calscale> f25389b = new d<>(Calscale.class);

    static {
        new Calscale("gregorian");
    }

    private Calscale(String str) {
        super(str);
    }

    public static Collection<Calscale> d() {
        return f25389b.a();
    }

    public static Calscale e(String str) {
        return (Calscale) f25389b.d(str);
    }

    public static Calscale f(String str) {
        return (Calscale) f25389b.e(str);
    }
}