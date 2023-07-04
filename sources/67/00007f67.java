package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public enum k {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);
    
    private final int mask;
    private final int value;

    k(int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    /* synthetic */ k(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? i11 : i12);
    }
}