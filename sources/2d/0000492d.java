package com.reactcommunity.rndatetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class j extends androidx.fragment.app.e {

    /* renamed from: d  reason: collision with root package name */
    private static DialogInterface.OnClickListener f20030d;

    /* renamed from: a  reason: collision with root package name */
    private TimePickerDialog f20031a;

    /* renamed from: b  reason: collision with root package name */
    private TimePickerDialog.OnTimeSetListener f20032b;

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnDismissListener f20033c;

    static TimePickerDialog a(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        TimePickerDialog b11 = b(bundle, context, onTimeSetListener);
        if (bundle != null && bundle.containsKey("neutralButtonLabel")) {
            b11.setButton(-3, bundle.getString("neutralButtonLabel"), f20030d);
        }
        return b11;
    }

    static TimePickerDialog b(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        int i11;
        d dVar = new d(bundle);
        int b11 = dVar.b();
        int c11 = dVar.c();
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        int i12 = (bundle == null || !b.g(bundle.getInt("minuteInterval"))) ? 1 : bundle.getInt("minuteInterval");
        k kVar = k.DEFAULT;
        if (bundle != null && bundle.getString("display", null) != null) {
            kVar = k.valueOf(bundle.getString("display").toUpperCase(Locale.US));
        }
        k kVar2 = kVar;
        boolean z11 = bundle != null ? bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context)) : is24HourFormat;
        k kVar3 = k.CLOCK;
        if (kVar2 != kVar3 && kVar2 != k.SPINNER) {
            return new i(context, onTimeSetListener, b11, c11, i12, z11, kVar2);
        }
        if (kVar2 == kVar3) {
            i11 = c.ClockTimePickerDialog;
        } else {
            i11 = c.SpinnerTimePickerDialog;
        }
        return new i(context, i11, onTimeSetListener, b11, c11, i12, z11, kVar2);
    }

    public void c(DialogInterface.OnDismissListener onDismissListener) {
        this.f20033c = onDismissListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DialogInterface.OnClickListener onClickListener) {
        f20030d = onClickListener;
    }

    public void e(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f20032b = onTimeSetListener;
    }

    public void f(Bundle bundle) {
        d dVar = new d(bundle);
        this.f20031a.updateTime(dVar.b(), dVar.c());
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        TimePickerDialog a11 = a(getArguments(), getActivity(), this.f20032b);
        this.f20031a = a11;
        return a11;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f20033c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}