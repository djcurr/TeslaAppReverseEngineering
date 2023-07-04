package kotlinx.serialization.json.internal;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public enum a {
    OBJ(CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT),
    LIST('[', ']'),
    MAP(CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT),
    POLY_OBJ('[', ']');
    
    public final char begin;
    public final char end;

    a(char c11, char c12) {
        this.begin = c11;
        this.end = c12;
    }
}