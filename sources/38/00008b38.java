package net.time4j.format;

/* loaded from: classes5.dex */
public enum e implements net.time4j.engine.x {
    FULL(0),
    LONG(1),
    MEDIUM(2),
    SHORT(3);
    
    private static e[] ENUMS = values();
    private final transient int style;

    e(int i11) {
        this.style = i11;
    }

    public static e ofStyle(int i11) {
        e[] eVarArr;
        for (e eVar : ENUMS) {
            if (eVar.getStyleValue() == i11) {
                return eVar;
            }
        }
        throw new UnsupportedOperationException("Unknown format style: " + i11);
    }

    @Override // net.time4j.engine.x
    public int getStyleValue() {
        return this.style;
    }
}