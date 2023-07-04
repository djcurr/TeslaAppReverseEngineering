package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r DEFAULT;
    public static final r STRING;

    /* loaded from: classes2.dex */
    enum a extends r {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.r
        public k serialize(Long l11) {
            if (l11 == null) {
                return l.f17206a;
            }
            return new o(l11);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        r rVar = new r("STRING", 1) { // from class: com.google.gson.r.b
            @Override // com.google.gson.r
            public k serialize(Long l11) {
                if (l11 == null) {
                    return l.f17206a;
                }
                return new o(l11.toString());
            }
        };
        STRING = rVar;
        $VALUES = new r[]{aVar, rVar};
    }

    private r(String str, int i11) {
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public abstract k serialize(Long l11);

    /* synthetic */ r(String str, int i11, a aVar) {
        this(str, i11);
    }
}