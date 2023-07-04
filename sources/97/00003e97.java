package com.horcrux.svg;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
enum l0 {
    None(PermissionsResponse.SCOPE_NONE),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    
    private static final Map<String, l0> decorationToEnum = new HashMap();
    private final String decoration;

    static {
        l0[] values;
        for (l0 l0Var : values()) {
            decorationToEnum.put(l0Var.decoration, l0Var);
        }
    }

    l0(String str) {
        this.decoration = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 getEnum(String str) {
        Map<String, l0> map = decorationToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.decoration;
    }
}