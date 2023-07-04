package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.core.view.a0;

/* loaded from: classes3.dex */
public class CheckableImageButton extends androidx.appcompat.widget.l implements Checkable {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f15372f = {16842912};

    /* renamed from: c  reason: collision with root package name */
    private boolean f15373c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15374d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15375e;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.a0(CheckableImageButton.this.a());
            cVar.b0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends a4.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f15377c;

        /* loaded from: classes3.dex */
        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f15377c = parcel.readInt() == 1;
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f15377c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.B);
    }

    public boolean a() {
        return this.f15374d;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f15373c;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        if (this.f15373c) {
            int[] iArr = f15372f;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i11 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f15377c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f15377c = this.f15373c;
        return bVar;
    }

    public void setCheckable(boolean z11) {
        if (this.f15374d != z11) {
            this.f15374d = z11;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (!this.f15374d || this.f15373c == z11) {
            return;
        }
        this.f15373c = z11;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z11) {
        this.f15375e = z11;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        if (this.f15375e) {
            super.setPressed(z11);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f15373c);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15374d = true;
        this.f15375e = true;
        a0.w0(this, new a());
    }
}