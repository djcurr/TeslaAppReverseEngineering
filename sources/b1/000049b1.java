package com.reactnativepagerview;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20210a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(ViewGroup parent) {
            s.g(parent, "parent");
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new g(frameLayout, null);
        }
    }

    private g(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public /* synthetic */ g(FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout);
    }

    public final FrameLayout b() {
        return (FrameLayout) this.itemView;
    }
}