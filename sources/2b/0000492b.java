package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class h extends DatePickerDialog {
    public h(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13, f fVar) {
        super(context, onDateSetListener, i11, i12, i13);
        a(context, i11, i12, i13, fVar);
    }

    private void a(Context context, int i11, int i12, int i13, f fVar) {
        if (Build.VERSION.SDK_INT == 24 && fVar == f.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("DatePicker").get(null), 16843612, 0).recycle();
                DatePicker datePicker = (DatePicker) l.a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field a11 = l.a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                if (a11.get(datePicker).getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    a11.set(datePicker, null);
                    datePicker.removeAllViews();
                    Class cls = Integer.TYPE;
                    Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, cls, cls);
                    declaredMethod.setAccessible(true);
                    a11.set(datePicker, declaredMethod.invoke(datePicker, context, null, 16843612, 0));
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(i11, i12, i13, this);
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

    public h(Context context, int i11, DatePickerDialog.OnDateSetListener onDateSetListener, int i12, int i13, int i14, f fVar) {
        super(context, i11, onDateSetListener, i12, i13, i14);
        a(context, i12, i13, i14, fVar);
    }
}