package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
enum j0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");
    
    private static final Map<String, j0> weightToEnum = new HashMap();
    private final String weight;

    static {
        j0[] values;
        for (j0 j0Var : values()) {
            weightToEnum.put(j0Var.weight, j0Var);
        }
    }

    j0(String str) {
        this.weight = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 get(String str) {
        return weightToEnum.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasEnum(String str) {
        return weightToEnum.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.weight;
    }
}