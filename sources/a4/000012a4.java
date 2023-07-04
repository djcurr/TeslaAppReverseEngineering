package com.adyen.checkout.card.ui;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CardNumberInput extends AdyenTextInputEditText {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f9547c = {4, 6, 5, 4};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f9548d = {4, 4, 4, 4, 3};

    /* renamed from: b  reason: collision with root package name */
    private boolean f9549b;

    public CardNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String c(String str) {
        return TextUtils.join(" ", d(str, this.f9549b ? f9547c : f9548d)).trim();
    }

    private String[] d(String str, int... iArr) {
        String[] strArr = new String[iArr.length];
        Arrays.fill(strArr, "");
        int i11 = 0;
        while (true) {
            if (i11 < iArr.length) {
                if (str.length() >= iArr[i11]) {
                    strArr[i11] = str.substring(0, iArr[i11]);
                    str = str.substring(iArr[i11]);
                    i11++;
                } else {
                    strArr[i11] = str;
                    break;
                }
            } else {
                break;
            }
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText
    public void a(Editable editable) {
        String obj = editable.toString();
        String c11 = c(obj.trim().replaceAll(String.valueOf(' '), ""));
        if (!obj.equals(c11)) {
            editable.replace(0, obj.length(), c11);
        }
        super.a(editable);
    }

    @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText
    public String getRawValue() {
        return getText().toString().replace(String.valueOf(' '), "");
    }

    public void setAmexCardFormat(boolean z11) {
        if (!this.f9549b && z11) {
            this.f9549b = true;
            a(getEditableText());
            return;
        }
        this.f9549b = z11;
    }

    public CardNumberInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        b(23);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardNumber"});
        }
    }
}