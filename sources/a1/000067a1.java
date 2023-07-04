package e8;

/* loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    c(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}