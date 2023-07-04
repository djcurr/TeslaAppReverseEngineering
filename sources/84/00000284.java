package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class g extends CheckedTextView {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1773b = {16843016};

    /* renamed from: a  reason: collision with root package name */
    private final x f1774a;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1774a;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i11) {
        setCheckMarkDrawable(h.a.d(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.p(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        x xVar = this.f1774a;
        if (xVar != null) {
            xVar.q(context, i11);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i11) {
        super(r0.b(context), attributeSet, i11);
        p0.a(this, getContext());
        x xVar = new x(this);
        this.f1774a = xVar;
        xVar.m(attributeSet, i11);
        xVar.b();
        u0 v11 = u0.v(getContext(), attributeSet, f1773b, i11, 0);
        setCheckMarkDrawable(v11.g(0));
        v11.w();
    }
}