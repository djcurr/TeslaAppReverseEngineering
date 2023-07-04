package com.facebook.imagepipeline.common;

/* loaded from: classes3.dex */
public enum a {
    LOW,
    MEDIUM,
    HIGH;

    public static a getHigherPriority(a aVar, a aVar2) {
        return aVar.ordinal() > aVar2.ordinal() ? aVar : aVar2;
    }
}