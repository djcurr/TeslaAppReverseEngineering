package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TimePicker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class i extends b {
    public i(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z11, k kVar) {
        super(context, onTimeSetListener, i11, i12, i13, z11, kVar);
        n(context, i11, i12, z11, kVar);
    }

    private void n(Context context, int i11, int i12, boolean z11, k kVar) {
        if (Build.VERSION.SDK_INT == 24 && kVar == k.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("TimePicker").get(null), 16843933, 0).recycle();
                TimePicker timePicker = (TimePicker) l.a(TimePickerDialog.class, TimePicker.class, "mTimePicker").get(this);
                Field a11 = l.a(TimePicker.class, Class.forName("android.widget.TimePicker$TimePickerDelegate"), "mDelegate");
                Object obj = a11.get(timePicker);
                Class<?> cls = Class.forName("android.widget.TimePickerSpinnerDelegate");
                if (obj.getClass() != cls) {
                    a11.set(timePicker, null);
                    timePicker.removeAllViews();
                    Class<?> cls2 = Integer.TYPE;
                    Constructor<?> constructor = cls.getConstructor(TimePicker.class, Context.class, AttributeSet.class, cls2, cls2);
                    constructor.setAccessible(true);
                    a11.set(timePicker, constructor.newInstance(timePicker, context, null, 16843933, 0));
                    timePicker.setIs24HourView(Boolean.valueOf(z11));
                    timePicker.setCurrentHour(Integer.valueOf(i11));
                    timePicker.setCurrentMinute(Integer.valueOf(i12));
                    timePicker.setOnTimeChangedListener(this);
                }
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    @Override // android.app.Dialog
    protected void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    public i(Context context, int i11, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i12, int i13, int i14, boolean z11, k kVar) {
        super(context, i11, onTimeSetListener, i12, i13, i14, z11, kVar);
        n(context, i12, i13, z11, kVar);
    }
}