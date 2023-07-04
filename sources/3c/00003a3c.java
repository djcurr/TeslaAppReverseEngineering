package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class s implements t {
    private static final /* synthetic */ s[] $VALUES;
    public static final s BIG_DECIMAL;
    public static final s DOUBLE;
    public static final s LAZILY_PARSED_NUMBER;
    public static final s LONG_OR_DOUBLE;

    /* loaded from: classes2.dex */
    enum a extends s {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.s, com.google.gson.t
        public Double readNumber(tn.a aVar) {
            return Double.valueOf(aVar.t0());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        s sVar = new s("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.s.b
            @Override // com.google.gson.s, com.google.gson.t
            public Number readNumber(tn.a aVar2) {
                return new on.g(aVar2.J0());
            }
        };
        LAZILY_PARSED_NUMBER = sVar;
        s sVar2 = new s("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.s.c
            @Override // com.google.gson.s, com.google.gson.t
            public Number readNumber(tn.a aVar2) {
                String J0 = aVar2.J0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(J0));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(J0);
                        if ((valueOf.isInfinite() || valueOf.isNaN()) && !aVar2.a0()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.L());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e11) {
                    throw new JsonParseException("Cannot parse " + J0 + "; at path " + aVar2.L(), e11);
                }
            }
        };
        LONG_OR_DOUBLE = sVar2;
        s sVar3 = new s("BIG_DECIMAL", 3) { // from class: com.google.gson.s.d
            @Override // com.google.gson.s, com.google.gson.t
            public BigDecimal readNumber(tn.a aVar2) {
                String J0 = aVar2.J0();
                try {
                    return new BigDecimal(J0);
                } catch (NumberFormatException e11) {
                    throw new JsonParseException("Cannot parse " + J0 + "; at path " + aVar2.L(), e11);
                }
            }
        };
        BIG_DECIMAL = sVar3;
        $VALUES = new s[]{aVar, sVar, sVar2, sVar3};
    }

    private s(String str, int i11) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    @Override // com.google.gson.t
    public abstract /* synthetic */ Number readNumber(tn.a aVar);

    /* synthetic */ s(String str, int i11, a aVar) {
        this(str, i11);
    }
}