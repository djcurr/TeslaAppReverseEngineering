package ezvcard.parameter;

/* loaded from: classes5.dex */
public class ExpertiseLevel extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<ExpertiseLevel> f25392b = new d<>(ExpertiseLevel.class);

    static {
        new ExpertiseLevel("beginner");
        new ExpertiseLevel("average");
        new ExpertiseLevel("expert");
    }

    private ExpertiseLevel(String str) {
        super(str);
    }

    public static ExpertiseLevel d(String str) {
        return (ExpertiseLevel) f25392b.e(str);
    }
}