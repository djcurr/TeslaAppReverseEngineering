package net.time4j.tz.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i STANDARD_TIME;
    public static final i UTC_TIME;
    static final i[] VALUES;
    public static final i WALL_TIME;

    /* loaded from: classes5.dex */
    enum a extends i {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.time4j.tz.model.i
        public char getSymbol() {
            return 'u';
        }
    }

    static {
        a aVar = new a("UTC_TIME", 0);
        UTC_TIME = aVar;
        i iVar = new i("STANDARD_TIME", 1) { // from class: net.time4j.tz.model.i.b
            @Override // net.time4j.tz.model.i
            public char getSymbol() {
                return 's';
            }
        };
        STANDARD_TIME = iVar;
        i iVar2 = new i("WALL_TIME", 2) { // from class: net.time4j.tz.model.i.c
            @Override // net.time4j.tz.model.i
            public char getSymbol() {
                return 'w';
            }
        };
        WALL_TIME = iVar2;
        $VALUES = new i[]{aVar, iVar, iVar2};
        VALUES = values();
    }

    private i(String str, int i11) {
    }

    public static i parseSymbol(char c11) {
        if (c11 != 'g') {
            if (c11 == 's') {
                return STANDARD_TIME;
            }
            if (c11 != 'u') {
                if (c11 == 'w') {
                    return WALL_TIME;
                }
                if (c11 != 'z') {
                    throw new IllegalArgumentException("Unknown offset indicator: " + c11);
                }
            }
        }
        return UTC_TIME;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public char getSymbol() {
        throw new AbstractMethodError();
    }

    /* synthetic */ i(String str, int i11, a aVar) {
        this(str, i11);
    }
}