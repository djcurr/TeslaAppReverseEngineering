package com.reactnativestripesdk;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class a0 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.react.uimanager.n0 f20249a;

    /* renamed from: b  reason: collision with root package name */
    private String f20250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.facebook.react.uimanager.n0 context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        this.f20249a = context;
    }

    private final boolean b() {
        return (this.f20249a.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a() {
        int i11;
        String str = this.f20250b;
        if (str != null) {
            switch (str.hashCode()) {
                case -1993132104:
                    if (str.equals("standard_dark")) {
                        i11 = o0.googlepay_button_dark;
                        break;
                    }
                    break;
                case -1827522409:
                    if (str.equals("pay_shadow")) {
                        i11 = o0.pay_with_googlepay_button;
                        break;
                    }
                    break;
                case 110760:
                    if (str.equals("pay")) {
                        i11 = o0.pay_with_googlepay_button_no_shadow;
                        break;
                    }
                    break;
                case 590854370:
                    if (str.equals("standard_shadow")) {
                        i11 = o0.googlepay_button;
                        break;
                    }
                    break;
                case 1312628413:
                    if (str.equals("standard")) {
                        i11 = o0.googlepay_button_no_shadow;
                        break;
                    }
                    break;
                case 1369710765:
                    if (str.equals("pay_dark")) {
                        i11 = o0.pay_with_googlepay_button_dark;
                        break;
                    }
                    break;
            }
            addView(LayoutInflater.from(this.f20249a).inflate(i11, (ViewGroup) null));
        }
        i11 = b() ? o0.googlepay_button_dark : o0.googlepay_button;
        addView(LayoutInflater.from(this.f20249a).inflate(i11, (ViewGroup) null));
    }

    public final void setType(String type) {
        kotlin.jvm.internal.s.g(type, "type");
        this.f20250b = type;
    }
}