package com.adyen.checkout.card.ui;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import o7.a;
import o7.b;
import q7.d;
import x6.c;

/* loaded from: classes.dex */
public class ExpiryDateInput extends AdyenTextInputEditText {

    /* renamed from: c  reason: collision with root package name */
    private static final String f9550c = a.c();

    /* renamed from: b  reason: collision with root package name */
    private final SimpleDateFormat f9551b;

    public ExpiryDateInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c(Calendar calendar) {
        if (calendar.get(1) / 100 < GregorianCalendar.getInstance().get(1) / 100) {
            calendar.add(1, 100);
        }
    }

    private boolean d(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText
    public void a(Editable editable) {
        String obj = editable.toString();
        String replaceAll = obj.replaceAll("\\D", "").replaceAll("(\\d{2})(?=\\d)", "$1/");
        if (replaceAll.length() == 1 && d(replaceAll) && Integer.parseInt(replaceAll) > 1) {
            replaceAll = "0" + replaceAll;
        }
        if (!obj.equals(replaceAll)) {
            editable.replace(0, obj.length(), replaceAll);
        }
        super.a(editable);
    }

    public c getDate() {
        String b11 = d.b(getRawValue(), new char[0]);
        String str = f9550c;
        b.f(str, "getDate - " + b11);
        try {
            Date parse = this.f9551b.parse(b11);
            Calendar gregorianCalendar = GregorianCalendar.getInstance();
            gregorianCalendar.setTime(parse);
            c(gregorianCalendar);
            return new c(gregorianCalendar.get(2) + 1, gregorianCalendar.get(1), true);
        } catch (ParseException e11) {
            String str2 = f9550c;
            b.a(str2, "getDate - value does not match expected pattern. " + e11.getLocalizedMessage());
            return getRawValue().isEmpty() ? c.f57131c : c.f57132d;
        }
    }

    public void setDate(c cVar) {
        if (cVar != null && cVar != c.f57131c) {
            String str = f9550c;
            b.f(str, "setDate - " + cVar.b() + " " + cVar.a());
            Calendar gregorianCalendar = GregorianCalendar.getInstance();
            gregorianCalendar.clear();
            gregorianCalendar.set(cVar.b(), cVar.a() - 1, 1);
            setText(this.f9551b.format(gregorianCalendar.getTime()));
            return;
        }
        setText("");
    }

    public ExpiryDateInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy", Locale.ROOT);
        this.f9551b = simpleDateFormat;
        b(5);
        simpleDateFormat.setLenient(false);
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardExpirationDate"});
        }
    }
}