package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.a0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import fk.h;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    private final Chip f15786a;

    /* renamed from: b  reason: collision with root package name */
    private final Chip f15787b;

    /* renamed from: c  reason: collision with root package name */
    private final MaterialButtonToggleGroup f15788c;

    /* renamed from: d  reason: collision with root package name */
    private final View.OnClickListener f15789d;

    /* renamed from: e  reason: collision with root package name */
    private f f15790e;

    /* renamed from: f  reason: collision with root package name */
    private g f15791f;

    /* renamed from: g  reason: collision with root package name */
    private e f15792g;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f15791f != null) {
                TimePickerView.this.f15791f.a(((Integer) view.getTag(fk.f.I)).intValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements MaterialButtonToggleGroup.e {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11) {
            int i12 = i11 == fk.f.f26440k ? 1 : 0;
            if (TimePickerView.this.f15790e == null || !z11) {
                return;
            }
            TimePickerView.this.f15790e.a(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            e eVar = TimePickerView.this.f15792g;
            if (eVar != null) {
                eVar.a();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GestureDetector f15796a;

        d(TimePickerView timePickerView, GestureDetector gestureDetector) {
            this.f15796a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f15796a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    interface e {
        void a();
    }

    /* loaded from: classes3.dex */
    interface f {
        void a(int i11);
    }

    /* loaded from: classes3.dex */
    interface g {
        void a(int i11);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void f() {
        Chip chip = this.f15786a;
        int i11 = fk.f.I;
        chip.setTag(i11, 12);
        this.f15787b.setTag(i11, 10);
        this.f15786a.setOnClickListener(this.f15789d);
        this.f15787b.setOnClickListener(this.f15789d);
    }

    private void g() {
        d dVar = new d(this, new GestureDetector(getContext(), new c()));
        this.f15786a.setOnTouchListener(dVar);
        this.f15787b.setOnTouchListener(dVar);
    }

    private void h() {
        if (this.f15788c.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.n(this);
            dVar.l(fk.f.f26437h, a0.F(this) == 0 ? 2 : 1);
            dVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            h();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15789d = new a();
        LayoutInflater.from(context).inflate(h.f26470l, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(fk.f.f26438i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(fk.f.f26441l);
        this.f15788c = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        Chip chip = (Chip) findViewById(fk.f.f26444o);
        this.f15786a = chip;
        Chip chip2 = (Chip) findViewById(fk.f.f26442m);
        this.f15787b = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(fk.f.f26439j);
        a0.y0(chip, 2);
        a0.y0(chip2, 2);
        g();
        f();
    }
}