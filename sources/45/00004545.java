package com.plaid.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.plaid.link.R;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class r9 extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    public final vz.k f19365a;

    /* renamed from: b  reason: collision with root package name */
    public final vz.k f19366b;

    /* loaded from: classes2.dex */
    public enum a {
        LEADING_LABEL,
        TRAILING_LABEL
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19368a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.LEADING_LABEL.ordinal()] = 1;
            iArr[a.TRAILING_LABEL.ordinal()] = 2;
            f19368a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<TextView> {
        public c() {
            super(0);
        }

        @Override // h00.a
        public TextView invoke() {
            return (TextView) r9.this.findViewById(R.id.label);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<TextView> {
        public d() {
            super(0);
        }

        @Override // h00.a
        public TextView invoke() {
            return (TextView) r9.this.findViewById(R.id.title);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        vz.k a11;
        vz.k a12;
        kotlin.jvm.internal.s.g(context, "context");
        a11 = vz.m.a(new d());
        this.f19365a = a11;
        a12 = vz.m.a(new c());
        this.f19366b = a12;
        ViewGroup.inflate(context, R.layout.plaid_list_item_table_row, this);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaidListItemTableRow, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "context.obtainStyledAttr…temTableRow, 0, 0\n      )");
        setTitle(obtainStyledAttributes.getText(R.styleable.PlaidListItemTableRow_plaid_title));
        setLabel(obtainStyledAttributes.getText(R.styleable.PlaidListItemTableRow_plaid_label));
        obtainStyledAttributes.recycle();
    }

    private final TextView getTableRowLabel() {
        return (TextView) this.f19366b.getValue();
    }

    private final TextView getTableRowTitle() {
        return (TextView) this.f19365a.getValue();
    }

    public final void setLabel(CharSequence charSequence) {
        getTableRowLabel().setText(charSequence);
    }

    public final void setStyle(a style) {
        kotlin.jvm.internal.s.g(style, "style");
        int i11 = b.f19368a[style.ordinal()];
        if (i11 == 1) {
            int i12 = R.layout.plaid_list_item_table_row_leading;
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.m(getContext(), i12);
            dVar.i(this);
        } else if (i11 == 2) {
            int i13 = R.layout.plaid_list_item_table_row_trailing;
            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
            dVar2.m(getContext(), i13);
            dVar2.i(this);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        getTableRowTitle().setText(charSequence);
    }
}