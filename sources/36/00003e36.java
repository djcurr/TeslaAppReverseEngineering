package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.henninghall.date_picker.k;
import com.henninghall.date_picker.pickers.a;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class AndroidNative extends NumberPicker implements com.henninghall.date_picker.pickers.a {

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0316a f17500a;

    /* renamed from: b  reason: collision with root package name */
    private int f17501b;

    /* renamed from: c  reason: collision with root package name */
    private a.b f17502c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17503d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f17504e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f17503d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidNative f17506a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f17507b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f17508c;

        b(AndroidNative androidNative, boolean z11, boolean z12) {
            this.f17506a = androidNative;
            this.f17507b = z11;
            this.f17508c = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.l(this.f17506a, this.f17507b);
            if (this.f17508c) {
                AndroidNative.this.o();
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements NumberPicker.OnValueChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.henninghall.date_picker.pickers.a f17510a;

        c(com.henninghall.date_picker.pickers.a aVar) {
            this.f17510a = aVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i11, int i12) {
            if (AndroidNative.this.f17502c != null) {
                AndroidNative.this.f17502c.a(this.f17510a, i11, i12);
            }
            if (AndroidNative.this.f17501b == 0) {
                AndroidNative.this.o();
            }
        }
    }

    /* loaded from: classes2.dex */
    class d implements NumberPicker.OnScrollListener {
        d() {
        }

        @Override // android.widget.NumberPicker.OnScrollListener
        public void onScrollStateChange(NumberPicker numberPicker, int i11) {
            AndroidNative.this.n(i11);
            AndroidNative.this.f17501b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f17500a.a();
        }
    }

    public AndroidNative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17501b = 0;
        this.f17504e = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        setValue((r8 + r1) % getMaxValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.widget.NumberPicker r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "changeValueByOne"
            r1 = -1
            r2 = 1
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r0, r4)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r4[r6] = r5     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r3.invoke(r8, r4)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            goto L5d
        L26:
            r8 = move-exception
            goto L5e
        L28:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
            goto L53
        L33:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
            goto L53
        L3e:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
            goto L53
        L49:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
        L53:
            r1 = r2
        L54:
            int r8 = r8 + r1
            int r9 = r7.getMaxValue()
            int r8 = r8 % r9
            r7.setValue(r8)
        L5d:
            return
        L5e:
            int r0 = r7.getValue()
            if (r9 == 0) goto L65
            r1 = r2
        L65:
            int r0 = r0 + r1
            int r9 = r7.getMaxValue()
            int r0 = r0 % r9
            r7.setValue(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.henninghall.date_picker.pickers.AndroidNative.l(android.widget.NumberPicker, boolean):void");
    }

    private void m(boolean z11, int i11, boolean z12) {
        this.f17504e.postDelayed(new b(this, z11, z12), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i11) {
        if (this.f17501b != 0 && i11 == 0) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f17504e.postDelayed(new e(), 500L);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void a(int i11, boolean z11) {
        b(i11);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void b(int i11) {
        int value = getValue();
        if (i11 == value) {
            return;
        }
        int f11 = k.f(value, i11, getMaxValue(), getWrapSelectorWheel());
        int abs = Math.abs(f11);
        this.f17503d = true;
        this.f17504e.postDelayed(new a(), abs * 100);
        int i12 = 0;
        while (i12 < abs) {
            m(f11 > 0, i12 * 100, i12 == abs + (-1));
            i12++;
        }
    }

    @Override // com.henninghall.date_picker.pickers.a
    public boolean c() {
        return this.f17501b == 2 || this.f17503d;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public View getView() {
        return this;
    }

    @Override // android.widget.NumberPicker, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17504e.removeCallbacksAndMessages(null);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setDividerHeight(int i11) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setItemPaddingHorizontal(int i11) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangeListenerInScrolling(a.b bVar) {
        this.f17502c = bVar;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangedListener(a.InterfaceC0316a interfaceC0316a) {
        this.f17500a = interfaceC0316a;
        super.setOnValueChangedListener(new c(this));
        super.setOnScrollListener(new d());
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setShownCount(int i11) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextAlign(Paint.Align align) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextColor(String str) {
        int parseColor = Color.parseColor(str);
        if (Build.VERSION.SDK_INT >= 29) {
            super.setTextColor(parseColor);
            return;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            ((Paint) declaredField.get(this)).setColor(parseColor);
        } catch (IllegalAccessException e11) {
            Log.w("setSelectedTextColor", e11);
        } catch (IllegalArgumentException e12) {
            Log.w("setSelectedTextColor", e12);
        } catch (NoSuchFieldException e13) {
            Log.w("setSelectedTextColor", e13);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(parseColor);
            }
        }
        invalidate();
    }
}