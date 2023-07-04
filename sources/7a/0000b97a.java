package v6;

/* loaded from: classes.dex */
public enum s {
    ONE_TIME(null),
    REGULAR("regular"),
    REVOLVING("revolving");
    
    private final String type;

    s(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}