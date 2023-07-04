package ezvcard;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum V3_0 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class VCardVersion {
    private static final /* synthetic */ VCardVersion[] $VALUES;
    public static final VCardVersion V2_1;
    public static final VCardVersion V3_0;
    public static final VCardVersion V4_0;
    private final gh.a syntaxStyle;
    private final String version;
    private final String xmlNamespace;

    static {
        VCardVersion vCardVersion = new VCardVersion("V2_1", 0, "2.1", gh.a.OLD, null);
        V2_1 = vCardVersion;
        gh.a aVar = gh.a.NEW;
        VCardVersion vCardVersion2 = new VCardVersion("V3_0", 1, "3.0", aVar, null);
        V3_0 = vCardVersion2;
        VCardVersion vCardVersion3 = new VCardVersion("V4_0", 2, "4.0", aVar, "urn:ietf:params:xml:ns:vcard-4.0");
        V4_0 = vCardVersion3;
        $VALUES = new VCardVersion[]{vCardVersion, vCardVersion2, vCardVersion3};
    }

    private VCardVersion(String str, int i11, String str2, gh.a aVar, String str3) {
        this.version = str2;
        this.syntaxStyle = aVar;
        this.xmlNamespace = str3;
    }

    public static VCardVersion valueOf(String str) {
        return (VCardVersion) Enum.valueOf(VCardVersion.class, str);
    }

    public static VCardVersion valueOfByStr(String str) {
        VCardVersion[] values;
        for (VCardVersion vCardVersion : values()) {
            if (vCardVersion.getVersion().equals(str)) {
                return vCardVersion;
            }
        }
        return null;
    }

    public static VCardVersion valueOfByXmlNamespace(String str) {
        VCardVersion[] values;
        for (VCardVersion vCardVersion : values()) {
            String xmlNamespace = vCardVersion.getXmlNamespace();
            if (xmlNamespace != null && xmlNamespace.equals(str)) {
                return vCardVersion;
            }
        }
        return null;
    }

    public static VCardVersion[] values() {
        return (VCardVersion[]) $VALUES.clone();
    }

    public gh.a getSyntaxStyle() {
        return this.syntaxStyle;
    }

    public String getVersion() {
        return this.version;
    }

    public String getXmlNamespace() {
        return this.xmlNamespace;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.version;
    }
}