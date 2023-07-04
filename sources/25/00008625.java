package m20;

/* loaded from: classes5.dex */
public enum t {
    IN("in"),
    OUT("out"),
    INV("");
    
    private final String presentation;

    t(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}