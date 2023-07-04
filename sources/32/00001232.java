package coil.request;

/* loaded from: classes.dex */
public enum a {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);
    
    private final boolean readEnabled;
    private final boolean writeEnabled;

    a(boolean z11, boolean z12) {
        this.readEnabled = z11;
        this.writeEnabled = z12;
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}