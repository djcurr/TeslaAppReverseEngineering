package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class b extends TimePickerDialog {

    /* renamed from: a  reason: collision with root package name */
    private TimePicker f20011a;

    /* renamed from: b  reason: collision with root package name */
    private int f20012b;

    /* renamed from: c  reason: collision with root package name */
    private k f20013c;

    /* renamed from: d  reason: collision with root package name */
    private final TimePickerDialog.OnTimeSetListener f20014d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f20015e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f20016f;

    /* renamed from: g  reason: collision with root package name */
    private Context f20017g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TimePicker f20018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f20019b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f20020c;

        a(TimePicker timePicker, int i11, int i12) {
            this.f20018a = timePicker;
            this.f20019b = i11;
            this.f20020c = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f20018a.setHour(this.f20019b);
                this.f20018a.setMinute(this.f20020c);
            } else {
                this.f20018a.setCurrentHour(Integer.valueOf(this.f20019b));
                this.f20018a.setCurrentMinute(0);
                this.f20018a.setCurrentMinute(Integer.valueOf(this.f20020c));
            }
            if (b.this.i()) {
                View findFocus = this.f20018a.findFocus();
                if (findFocus instanceof EditText) {
                    EditText editText = (EditText) findFocus;
                    editText.setSelection(editText.getText().length());
                    return;
                }
                Log.e("RN-datetimepicker", "could not set selection on time picker, this is a known issue on some Huawei devices");
            }
        }
    }

    public b(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z11, k kVar) {
        super(context, onTimeSetListener, i11, i12, z11);
        this.f20015e = new Handler();
        this.f20012b = i13;
        this.f20014d = onTimeSetListener;
        this.f20013c = kVar;
        this.f20017g = context;
    }

    private void b(String str) {
        if (f()) {
            throw new RuntimeException(str);
        }
    }

    private void c(TimePicker timePicker, int i11, int i12) {
        b("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
        a aVar = new a(timePicker, i11, i12);
        this.f20016f = aVar;
        this.f20015e.postDelayed(aVar, 500L);
    }

    private int d() {
        return e(this.f20011a.getCurrentMinute().intValue());
    }

    private int e(int i11) {
        return this.f20013c == k.SPINNER ? i11 * this.f20012b : i11;
    }

    private boolean f() {
        return this.f20013c == k.SPINNER;
    }

    public static boolean g(int i11) {
        return i11 >= 1 && i11 <= 30 && 60 % i11 == 0;
    }

    private boolean h(int i11) {
        b("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
        return m() && i11 != l(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        View findViewById = findViewById(this.f20017g.getResources().getIdentifier("input_mode", "id", "android"));
        return findViewById != null && findViewById.hasFocus();
    }

    private void j() {
        NumberPicker numberPicker = (NumberPicker) findViewById(this.f20017g.getResources().getIdentifier("minute", "id", "android"));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((60 / this.f20012b) - 1);
        ArrayList arrayList = new ArrayList(60 / this.f20012b);
        int i11 = 0;
        while (i11 < 60) {
            arrayList.add(String.format("%02d", Integer.valueOf(i11)));
            i11 += this.f20012b;
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    private void k() {
        TimePicker timePicker = (TimePicker) findViewById(this.f20017g.getResources().getIdentifier("timePicker", "id", "android"));
        this.f20011a = timePicker;
        int intValue = timePicker.getCurrentMinute().intValue();
        if (f()) {
            j();
            this.f20011a.setCurrentMinute(Integer.valueOf(l(intValue) / this.f20012b));
            return;
        }
        this.f20011a.setCurrentMinute(Integer.valueOf(l(intValue)));
    }

    private int l(int i11) {
        int round = Math.round(i11 / this.f20012b);
        int i12 = this.f20012b;
        int i13 = round * i12;
        return i13 == 60 ? i13 - i12 : i13;
    }

    private boolean m() {
        return this.f20012b != 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            k();
        }
    }

    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        if (this.f20011a != null && i11 == -1 && m()) {
            int intValue = this.f20011a.getCurrentHour().intValue();
            int d11 = d();
            if (!f()) {
                d11 = l(d11);
            }
            TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f20014d;
            if (onTimeSetListener != null) {
                onTimeSetListener.onTimeSet(this.f20011a, intValue, d11);
                return;
            }
            return;
        }
        super.onClick(dialogInterface, i11);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f20015e.removeCallbacks(this.f20016f);
        super.onDetachedFromWindow();
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public void onTimeChanged(TimePicker timePicker, int i11, int i12) {
        int e11 = e(i12);
        this.f20015e.removeCallbacks(this.f20016f);
        if (!f() && h(e11)) {
            c(timePicker, i11, l(e11));
        } else {
            super.onTimeChanged(timePicker, i11, i12);
        }
    }

    @Override // android.app.TimePickerDialog
    public void updateTime(int i11, int i12) {
        if (m()) {
            if (f()) {
                super.updateTime(i11, l(d()) / this.f20012b);
                return;
            } else {
                super.updateTime(i11, l(i12));
                return;
            }
        }
        super.updateTime(i11, i12);
    }

    public b(Context context, int i11, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i12, int i13, int i14, boolean z11, k kVar) {
        super(context, i11, onTimeSetListener, i12, i13, z11);
        this.f20015e = new Handler();
        this.f20012b = i14;
        this.f20014d = onTimeSetListener;
        this.f20013c = kVar;
        this.f20017g = context;
    }
}