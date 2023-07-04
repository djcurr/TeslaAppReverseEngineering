package kh;

import p0.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Center uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d Center;
    public static final d End;
    public static final d SpaceAround;
    public static final d SpaceBetween;
    public static final d SpaceEvenly;
    public static final d Start;
    private final a.k arrangement;

    private static final /* synthetic */ d[] $values() {
        return new d[]{Center, Start, End, SpaceEvenly, SpaceBetween, SpaceAround};
    }

    static {
        p0.a aVar = p0.a.f45228a;
        Center = new d("Center", 0, aVar.b());
        Start = new d("Start", 1, aVar.h());
        End = new d("End", 2, aVar.a());
        SpaceEvenly = new d("SpaceEvenly", 3, aVar.f());
        SpaceBetween = new d("SpaceBetween", 4, aVar.e());
        SpaceAround = new d("SpaceAround", 5, aVar.d());
        $VALUES = $values();
    }

    private d(String str, int i11, a.k kVar) {
        this.arrangement = kVar;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final a.k getArrangement$flowlayout_release() {
        return this.arrangement;
    }
}