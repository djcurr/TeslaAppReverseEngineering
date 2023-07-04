package s2;

import android.view.inputmethod.EditorInfo;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import s2.l;
import s2.r;
import s2.s;

/* loaded from: classes.dex */
public final class g0 {
    private static final boolean a(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    public static final void b(EditorInfo editorInfo, m imeOptions, a0 textFieldValue) {
        kotlin.jvm.internal.s.g(editorInfo, "<this>");
        kotlin.jvm.internal.s.g(imeOptions, "imeOptions");
        kotlin.jvm.internal.s.g(textFieldValue, "textFieldValue");
        int d11 = imeOptions.d();
        l.a aVar = l.f50115b;
        int i11 = 6;
        if (l.l(d11, aVar.a())) {
            if (!imeOptions.f()) {
                i11 = 0;
            }
        } else if (l.l(d11, aVar.e())) {
            i11 = 1;
        } else if (l.l(d11, aVar.c())) {
            i11 = 2;
        } else if (l.l(d11, aVar.d())) {
            i11 = 5;
        } else if (l.l(d11, aVar.f())) {
            i11 = 7;
        } else if (l.l(d11, aVar.g())) {
            i11 = 3;
        } else if (l.l(d11, aVar.h())) {
            i11 = 4;
        } else if (!l.l(d11, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i11;
        int e11 = imeOptions.e();
        s.a aVar2 = s.f50139b;
        if (s.l(e11, aVar2.g())) {
            editorInfo.inputType = 1;
        } else if (s.l(e11, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (s.l(e11, aVar2.c())) {
            editorInfo.inputType = 2;
        } else if (s.l(e11, aVar2.f())) {
            editorInfo.inputType = 3;
        } else if (s.l(e11, aVar2.h())) {
            editorInfo.inputType = 17;
        } else if (s.l(e11, aVar2.b())) {
            editorInfo.inputType = 33;
        } else if (s.l(e11, aVar2.e())) {
            editorInfo.inputType = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
        } else if (s.l(e11, aVar2.d())) {
            editorInfo.inputType = 18;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.f() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (l.l(imeOptions.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int c11 = imeOptions.c();
            r.a aVar3 = r.f50134a;
            if (r.f(c11, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (r.f(c11, aVar3.d())) {
                editorInfo.inputType |= PKIFailureInfo.certRevoked;
            } else if (r.f(c11, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = n2.y.n(textFieldValue.g());
        editorInfo.initialSelEnd = n2.y.i(textFieldValue.g());
        y3.a.f(editorInfo, textFieldValue.h());
        editorInfo.imeOptions |= 33554432;
    }
}