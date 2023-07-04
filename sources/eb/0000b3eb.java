package t00;

import kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum UBYTE uses external variables
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
/* loaded from: classes5.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n UBYTE;
    public static final n UINT;
    public static final n ULONG;
    public static final n USHORT;
    private final u10.b arrayClassId;
    private final u10.b classId;
    private final u10.f typeName;

    private static final /* synthetic */ n[] $values() {
        return new n[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        u10.b e11 = u10.b.e("kotlin/UByte");
        s.f(e11, "fromString(\"kotlin/UByte\")");
        UBYTE = new n("UBYTE", 0, e11);
        u10.b e12 = u10.b.e("kotlin/UShort");
        s.f(e12, "fromString(\"kotlin/UShort\")");
        USHORT = new n("USHORT", 1, e12);
        u10.b e13 = u10.b.e("kotlin/UInt");
        s.f(e13, "fromString(\"kotlin/UInt\")");
        UINT = new n("UINT", 2, e13);
        u10.b e14 = u10.b.e("kotlin/ULong");
        s.f(e14, "fromString(\"kotlin/ULong\")");
        ULONG = new n("ULONG", 3, e14);
        $VALUES = $values();
    }

    private n(String str, int i11, u10.b bVar) {
        this.classId = bVar;
        u10.f j11 = bVar.j();
        s.f(j11, "classId.shortClassName");
        this.typeName = j11;
        this.arrayClassId = new u10.b(bVar.h(), u10.f.f(s.p(j11.b(), "Array")));
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final u10.b getArrayClassId() {
        return this.arrayClassId;
    }

    public final u10.b getClassId() {
        return this.classId;
    }

    public final u10.f getTypeName() {
        return this.typeName;
    }
}