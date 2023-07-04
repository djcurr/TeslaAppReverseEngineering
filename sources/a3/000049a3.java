package com.reactnativedocumentpicker;

import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ String a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        Objects.requireNonNull(charSequence, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb2.append(charSequenceArr[0]);
            for (int i11 = 1; i11 < charSequenceArr.length; i11++) {
                sb2.append(charSequence);
                sb2.append(charSequenceArr[i11]);
            }
        }
        return sb2.toString();
    }
}