package com.henninghall.date_picker.pickers;

import android.graphics.Paint;
import android.view.View;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.henninghall.date_picker.pickers.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0316a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(a aVar, int i11, int i12);
    }

    void a(int i11, boolean z11);

    void b(int i11);

    boolean c();

    String[] getDisplayedValues();

    int getMaxValue();

    int getValue();

    View getView();

    boolean getWrapSelectorWheel();

    void setDisplayedValues(String[] strArr);

    void setDividerHeight(int i11);

    void setItemPaddingHorizontal(int i11);

    void setMaxValue(int i11);

    void setMinValue(int i11);

    void setOnValueChangeListenerInScrolling(b bVar);

    void setOnValueChangedListener(InterfaceC0316a interfaceC0316a);

    void setShownCount(int i11);

    void setTextAlign(Paint.Align align);

    void setTextColor(String str);

    void setValue(int i11);

    void setVisibility(int i11);

    void setWrapSelectorWheel(boolean z11);
}