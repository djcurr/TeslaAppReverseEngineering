package k20;

/* loaded from: classes5.dex */
public enum k1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    k1(String str, boolean z11, boolean z12, int i11) {
        this.label = str;
        this.allowsInPosition = z11;
        this.allowsOutPosition = z12;
        this.superpositionFactor = i11;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.label;
    }
}