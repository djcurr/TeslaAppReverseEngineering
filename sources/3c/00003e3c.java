package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.henninghall.date_picker.pickers.a;
import q5.a;

/* loaded from: classes2.dex */
public class IosClone extends q5.a implements com.henninghall.date_picker.pickers.a {
    private a.b P3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.henninghall.date_picker.pickers.a f17514a;

        a(com.henninghall.date_picker.pickers.a aVar) {
            this.f17514a = aVar;
        }

        @Override // q5.a.e
        public void a(q5.a aVar, int i11, int i12) {
            sp.a.g(this.f17514a, i12);
            if (IosClone.this.P3 != null) {
                IosClone.this.P3.a(this.f17514a, i11, i12);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0316a f17516a;

        b(IosClone iosClone, a.InterfaceC0316a interfaceC0316a) {
            this.f17516a = interfaceC0316a;
        }

        @Override // q5.a.d
        public void a(q5.a aVar, int i11, int i12) {
            this.f17516a.a();
        }
    }

    public IosClone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q0();
    }

    private void q0() {
        r0();
        s0();
    }

    private void r0() {
        sp.a.k(this);
    }

    private void s0() {
        super.setOnValueChangeListenerInScrolling(new a(this));
    }

    @Override // com.henninghall.date_picker.pickers.a
    public boolean c() {
        return super.O();
    }

    @Override // com.henninghall.date_picker.pickers.a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        sp.a.i(this, accessibilityNodeInfo);
    }

    @Override // q5.a, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (sp.a.j(this)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangeListenerInScrolling(a.b bVar) {
        this.P3 = bVar;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangedListener(a.InterfaceC0316a interfaceC0316a) {
        super.setOnValueChangedListener(new b(this, interfaceC0316a));
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextColor(String str) {
        int parseColor = Color.parseColor(str);
        setNormalTextColor(Color.parseColor("#70" + str.substring(1)));
        setSelectedTextColor(parseColor);
    }
}