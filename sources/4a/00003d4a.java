package com.google.protobuf;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TextFormatParseLocation {
    public static final TextFormatParseLocation EMPTY = new TextFormatParseLocation(-1, -1);
    private final int column;
    private final int line;

    private TextFormatParseLocation(int i11, int i12) {
        this.line = i11;
        this.column = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TextFormatParseLocation create(int i11, int i12) {
        if (i11 == -1 && i12 == -1) {
            return EMPTY;
        }
        if (i11 >= 0 && i12 >= 0) {
            return new TextFormatParseLocation(i11, i12);
        }
        throw new IllegalArgumentException(String.format("line and column values must be >= 0: line %d, column: %d", Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TextFormatParseLocation) {
            TextFormatParseLocation textFormatParseLocation = (TextFormatParseLocation) obj;
            return this.line == textFormatParseLocation.getLine() && this.column == textFormatParseLocation.getColumn();
        }
        return false;
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int hashCode() {
        return Arrays.hashCode(new int[]{this.line, this.column});
    }

    public String toString() {
        return String.format("ParseLocation{line=%d, column=%d}", Integer.valueOf(this.line), Integer.valueOf(this.column));
    }
}