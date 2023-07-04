package io.realm;

/* loaded from: classes5.dex */
public enum d {
    SENSITIVE(true),
    INSENSITIVE(false);
    
    private final boolean value;

    d(boolean z11) {
        this.value = z11;
    }

    public boolean getValue() {
        return this.value;
    }
}