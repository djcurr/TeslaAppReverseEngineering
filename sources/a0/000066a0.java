package e10;

/* loaded from: classes5.dex */
public enum a {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");
    
    private final String javaTarget;

    a(String str) {
        this.javaTarget = str;
    }

    public final String getJavaTarget() {
        return this.javaTarget;
    }
}