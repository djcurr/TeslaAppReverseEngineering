package ezvcard.parameter;

/* loaded from: classes5.dex */
public class RelatedType extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<RelatedType> f25400b = new d<>(RelatedType.class);

    static {
        new RelatedType("acquaintance");
        new RelatedType("agent");
        new RelatedType("child");
        new RelatedType("co-resident");
        new RelatedType("co-worker");
        new RelatedType("colleague");
        new RelatedType("contact");
        new RelatedType("crush");
        new RelatedType("date");
        new RelatedType("emergency");
        new RelatedType("friend");
        new RelatedType("kin");
        new RelatedType("me");
        new RelatedType("met");
        new RelatedType("muse");
        new RelatedType("neighbor");
        new RelatedType("parent");
        new RelatedType("sibling");
        new RelatedType("spouse");
        new RelatedType("sweetheart");
    }

    private RelatedType(String str) {
        super(str);
    }

    public static RelatedType d(String str) {
        return (RelatedType) f25400b.e(str);
    }
}