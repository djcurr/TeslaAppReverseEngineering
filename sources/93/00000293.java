package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class j extends EditText implements androidx.core.view.y, androidx.core.view.w {
    private final d mBackgroundTintHelper;
    private final androidx.core.widget.n mDefaultOnReceiveContentListener;
    private final w mTextClassifierHelper;
    private final x mTextHelper;

    public j(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.b();
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        if (Build.VERSION.SDK_INT < 28 && (wVar = this.mTextClassifierHelper) != null) {
            return wVar.a();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        InputConnection a11 = k.a(onCreateInputConnection, editorInfo, this);
        String[] I = androidx.core.view.a0.I(this);
        if (a11 == null || I == null) {
            return a11;
        }
        y3.a.d(editorInfo, I);
        return y3.b.a(a11, editorInfo, s.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (s.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.w
    public androidx.core.view.c onReceiveContent(androidx.core.view.c cVar) {
        return this.mDefaultOnReceiveContentListener.a(this, cVar);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        if (s.c(this, i11)) {
            return true;
        }
        return super.onTextContextMenuItem(i11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.p(this, callback));
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.q(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT < 28 && (wVar = this.mTextClassifierHelper) != null) {
            wVar.b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.A);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public j(Context context, AttributeSet attributeSet, int i11) {
        super(r0.b(context), attributeSet, i11);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.e(attributeSet, i11);
        x xVar = new x(this);
        this.mTextHelper = xVar;
        xVar.m(attributeSet, i11);
        xVar.b();
        this.mTextClassifierHelper = new w(this);
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.n();
    }
}