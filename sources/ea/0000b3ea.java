package t00;

import kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum UBYTEARRAY uses external variables
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
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m UBYTEARRAY;
    public static final m UINTARRAY;
    public static final m ULONGARRAY;
    public static final m USHORTARRAY;
    private final u10.b classId;
    private final u10.f typeName;

    private static final /* synthetic */ m[] $values() {
        return new m[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        u10.b e11 = u10.b.e("kotlin/UByteArray");
        s.f(e11, "fromString(\"kotlin/UByteArray\")");
        UBYTEARRAY = new m("UBYTEARRAY", 0, e11);
        u10.b e12 = u10.b.e("kotlin/UShortArray");
        s.f(e12, "fromString(\"kotlin/UShortArray\")");
        USHORTARRAY = new m("USHORTARRAY", 1, e12);
        u10.b e13 = u10.b.e("kotlin/UIntArray");
        s.f(e13, "fromString(\"kotlin/UIntArray\")");
        UINTARRAY = new m("UINTARRAY", 2, e13);
        u10.b e14 = u10.b.e("kotlin/ULongArray");
        s.f(e14, "fromString(\"kotlin/ULongArray\")");
        ULONGARRAY = new m("ULONGARRAY", 3, e14);
        $VALUES = $values();
    }

    private m(String str, int i11, u10.b bVar) {
        this.classId = bVar;
        u10.f j11 = bVar.j();
        s.f(j11, "classId.shortClassName");
        this.typeName = j11;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final u10.f getTypeName() {
        return this.typeName;
    }
}