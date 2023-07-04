package com.facebook.imagepipeline.memory;

import md.k;

/* loaded from: classes3.dex */
public class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i11, int i12, int i13) {
        return Math.min(Math.max(0, i13 - i11), i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i11, int i12, int i13, int i14, int i15) {
        k.b(Boolean.valueOf(i14 >= 0));
        k.b(Boolean.valueOf(i11 >= 0));
        k.b(Boolean.valueOf(i13 >= 0));
        k.b(Boolean.valueOf(i11 + i14 <= i15));
        k.b(Boolean.valueOf(i13 + i14 <= i12));
    }
}