package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
enum g0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    
    private static final Map<String, g0> alignmentToEnum = new HashMap();
    private final String alignment;

    static {
        g0[] values;
        for (g0 g0Var : values()) {
            alignmentToEnum.put(g0Var.alignment, g0Var);
        }
    }

    g0(String str) {
        this.alignment = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 getEnum(String str) {
        Map<String, g0> map = alignmentToEnum;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.alignment;
    }
}