package w6;

/* loaded from: classes.dex */
public enum c {
    COUNTRY("countries"),
    STATE("states");
    
    private final String pathParam;

    c(String str) {
        this.pathParam = str;
    }

    public final String getPathParam() {
        return this.pathParam;
    }
}