package com.nimbusds.jose.shaded.ow2asm;

/* loaded from: classes2.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    public MethodTooLargeException(String str, String str2, String str3, int i11) {
        super("Method too large: " + str + "." + str2 + " " + str3);
    }
}