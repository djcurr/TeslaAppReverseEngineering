package com.google.gson;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class c implements com.google.gson.d {
    private static final /* synthetic */ c[] $VALUES;
    public static final c IDENTITY;
    public static final c LOWER_CASE_WITH_DASHES;
    public static final c LOWER_CASE_WITH_DOTS;
    public static final c LOWER_CASE_WITH_UNDERSCORES;
    public static final c UPPER_CAMEL_CASE;
    public static final c UPPER_CAMEL_CASE_WITH_SPACES;
    public static final c UPPER_CASE_WITH_UNDERSCORES;

    /* loaded from: classes2.dex */
    enum a extends c {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.upperCaseFirstLetter(c.separateCamelCase(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), CoreConstants.DASH_CHAR).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), CoreConstants.DOT).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = cVar6;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    private c(String str, int i11) {
    }

    static String separateCamelCase(String str, char c11) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c11);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    static String upperCaseFirstLetter(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i11 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i11) + upperCase + str.substring(i11 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // com.google.gson.d
    public abstract /* synthetic */ String translateName(Field field);

    /* synthetic */ c(String str, int i11, a aVar) {
        this(str, i11);
    }
}