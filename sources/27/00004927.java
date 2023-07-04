package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class e extends androidx.fragment.app.e {

    /* renamed from: d  reason: collision with root package name */
    private static DialogInterface.OnClickListener f20025d;

    /* renamed from: a  reason: collision with root package name */
    private DatePickerDialog f20026a;

    /* renamed from: b  reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f20027b;

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnDismissListener f20028c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20029a;

        static {
            int[] iArr = new int[f.values().length];
            f20029a = iArr;
            try {
                iArr[f.CALENDAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20029a[f.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static DatePickerDialog a(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog b11 = b(bundle, context, onDateSetListener);
        if (bundle != null && bundle.containsKey("neutralButtonLabel")) {
            b11.setButton(-3, bundle.getString("neutralButtonLabel"), f20025d);
        }
        DatePicker datePicker = b11.getDatePicker();
        Integer d11 = d(bundle);
        if (d11 != null) {
            calendar.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        }
        if (bundle != null && bundle.containsKey("minimumDate")) {
            calendar.setTimeInMillis(bundle.getLong("minimumDate"));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            datePicker.setMinDate(calendar.getTimeInMillis() - c(calendar, d11));
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle != null && bundle.containsKey("maximumDate")) {
            calendar.setTimeInMillis(bundle.getLong("maximumDate"));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            datePicker.setMaxDate(calendar.getTimeInMillis() - c(calendar, d11));
        }
        return b11;
    }

    static DatePickerDialog b(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        int i11;
        d dVar = new d(bundle);
        int f11 = dVar.f();
        int d11 = dVar.d();
        int a11 = dVar.a();
        f valueOf = (bundle == null || bundle.getString("display", null) == null) ? f.DEFAULT : f.valueOf(bundle.getString("display").toUpperCase(Locale.US));
        int i12 = a.f20029a[valueOf.ordinal()];
        if (i12 != 1 && i12 != 2) {
            return new h(context, onDateSetListener, f11, d11, a11, valueOf);
        }
        if (valueOf == f.CALENDAR) {
            i11 = c.f20022a;
        } else {
            i11 = c.f20023c;
        }
        return new h(context, i11, onDateSetListener, f11, d11, a11, valueOf);
    }

    private static int c(Calendar calendar, Integer num) {
        if (num != null) {
            return TimeZone.getDefault().getOffset(calendar.getTimeInMillis()) - num.intValue();
        }
        return 0;
    }

    private static Integer d(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("timeZoneOffsetInMinutes")) {
            return null;
        }
        return Integer.valueOf(bundle.getInt("timeZoneOffsetInMinutes", (int) bundle.getLong("timeZoneOffsetInMinutes")) * 60000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f20027b = onDateSetListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(DialogInterface.OnDismissListener onDismissListener) {
        this.f20028c = onDismissListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(DialogInterface.OnClickListener onClickListener) {
        f20025d = onClickListener;
    }

    public void h(Bundle bundle) {
        d dVar = new d(bundle);
        this.f20026a.updateDate(dVar.f(), dVar.d(), dVar.a());
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog a11 = a(getArguments(), getActivity(), this.f20027b);
        this.f20026a = a11;
        return a11;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f20028c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}