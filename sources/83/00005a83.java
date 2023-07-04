package com.stripe.android.ui.core.elements;

import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import kotlin.text.c;
import kotlin.text.v;
import n2.a;
import s2.i0;
import s2.k0;
import s2.t;

/* loaded from: classes6.dex */
public final class ExpiryDateVisualTransformation implements k0 {
    private final String separator = " / ";

    public static final /* synthetic */ String access$getSeparator$p(ExpiryDateVisualTransformation expiryDateVisualTransformation) {
        return expiryDateVisualTransformation.separator;
    }

    @Override // s2.k0
    public i0 filter(a text) {
        boolean w11;
        int d11;
        s.g(text, "text");
        final j0 j0Var = new j0();
        j0Var.f34912a = 1;
        w11 = v.w(text);
        int i11 = 0;
        if ((!w11) && text.charAt(0) != '0' && text.charAt(0) != '1') {
            j0Var.f34912a = 0;
        } else if (text.length() > 1 && text.charAt(0) == '1') {
            d11 = c.d(text.charAt(1));
            if (d11 > 2) {
                j0Var.f34912a = 0;
            }
        }
        int length = text.length();
        String str = "";
        while (i11 < length) {
            int i12 = i11 + 1;
            str = s.p(str, Character.valueOf(text.charAt(i11)));
            if (i11 == j0Var.f34912a) {
                str = s.p(str, this.separator);
            }
            i11 = i12;
        }
        return new i0(new a(str, null, null, 6, null), new t() { // from class: com.stripe.android.ui.core.elements.ExpiryDateVisualTransformation$filter$offsetTranslator$1
            @Override // s2.t
            public int originalToTransformed(int i13) {
                return i13 <= j0Var.f34912a ? i13 : i13 + ExpiryDateVisualTransformation.access$getSeparator$p(this).length();
            }

            @Override // s2.t
            public int transformedToOriginal(int i13) {
                return i13 <= j0Var.f34912a + 1 ? i13 : i13 - ExpiryDateVisualTransformation.access$getSeparator$p(this).length();
            }
        });
    }
}