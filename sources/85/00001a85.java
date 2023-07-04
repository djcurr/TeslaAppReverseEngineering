package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.a0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.s;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.text.c0;
import com.facebook.react.views.text.r;
import com.facebook.react.views.text.u;
import com.facebook.react.views.text.z;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class c extends androidx.appcompat.widget.j implements d.a {
    private static final KeyListener P = QwertyKeyListener.getInstanceForFullKeyboard();
    private String A;
    private int B;
    private int C;
    private boolean E;
    private boolean F;
    private com.facebook.react.views.view.f G;
    private final com.facebook.react.uimanager.d H;
    protected boolean K;
    protected boolean L;
    private com.facebook.react.uimanager.events.d O;

    /* renamed from: a  reason: collision with root package name */
    private final InputMethodManager f12743a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12744b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f12745c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f12746d;

    /* renamed from: e  reason: collision with root package name */
    private int f12747e;

    /* renamed from: f  reason: collision with root package name */
    private int f12748f;

    /* renamed from: g  reason: collision with root package name */
    protected int f12749g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<TextWatcher> f12750h;

    /* renamed from: i  reason: collision with root package name */
    private C0238c f12751i;

    /* renamed from: j  reason: collision with root package name */
    private int f12752j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f12753k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f12754l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12755m;

    /* renamed from: n  reason: collision with root package name */
    private String f12756n;

    /* renamed from: o  reason: collision with root package name */
    private p f12757o;

    /* renamed from: p  reason: collision with root package name */
    private com.facebook.react.views.textinput.a f12758p;

    /* renamed from: q  reason: collision with root package name */
    private o f12759q;

    /* renamed from: t  reason: collision with root package name */
    private final b f12760t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f12761w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f12762x;

    /* renamed from: y  reason: collision with root package name */
    private z f12763y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f12764z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends s {
        a() {
        }

        @Override // com.facebook.react.uimanager.s, androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 == 16) {
                int length = c.this.getText().length();
                if (length > 0) {
                    c.this.setSelection(length);
                }
                return c.this.x();
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements KeyListener {

        /* renamed from: a  reason: collision with root package name */
        private int f12766a = 0;

        public void a(int i11) {
            this.f12766a = i11;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i11) {
            c.P.clearMetaKeyState(view, editable, i11);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f12766a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i11, KeyEvent keyEvent) {
            return c.P.onKeyDown(view, editable, i11, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return c.P.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i11, KeyEvent keyEvent) {
            return c.P.onKeyUp(view, editable, i11, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.textinput.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0238c implements TextWatcher {
        private C0238c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            c cVar = c.this;
            if (cVar.f12746d || cVar.f12745c || cVar.f12750h == null) {
                return;
            }
            Iterator it2 = c.this.f12750h.iterator();
            while (it2.hasNext()) {
                ((TextWatcher) it2.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            c cVar = c.this;
            if (cVar.f12746d || cVar.f12745c || cVar.f12750h == null) {
                return;
            }
            Iterator it2 = c.this.f12750h.iterator();
            while (it2.hasNext()) {
                ((TextWatcher) it2.next()).beforeTextChanged(charSequence, i11, i12, i13);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            c cVar = c.this;
            if (!cVar.f12746d) {
                if (!cVar.f12745c && cVar.f12750h != null) {
                    Iterator it2 = c.this.f12750h.iterator();
                    while (it2.hasNext()) {
                        ((TextWatcher) it2.next()).onTextChanged(charSequence, i11, i12, i13);
                    }
                }
                c cVar2 = c.this;
                cVar2.E(!cVar2.f12745c && !cVar2.L && i11 == 0 && i12 == 0);
            }
            c.this.v();
        }

        /* synthetic */ C0238c(c cVar, a aVar) {
            this();
        }
    }

    public c(Context context) {
        super(context);
        this.f12744b = c.class.getSimpleName();
        this.f12746d = false;
        this.f12761w = false;
        this.f12762x = false;
        this.f12764z = false;
        this.A = null;
        this.B = -1;
        this.C = -1;
        this.E = false;
        this.F = false;
        this.H = new com.facebook.react.uimanager.d();
        this.K = false;
        this.L = false;
        setFocusableInTouchMode(false);
        this.G = new com.facebook.react.views.view.f(this);
        this.f12743a = (InputMethodManager) wf.a.c(context.getSystemService("input_method"));
        this.f12747e = getGravity() & 8388615;
        this.f12748f = getGravity() & 112;
        this.f12749g = 0;
        this.f12745c = false;
        this.f12754l = null;
        this.f12755m = false;
        this.f12750h = null;
        this.f12751i = null;
        this.f12752j = getInputType();
        this.f12760t = new b();
        this.f12759q = null;
        this.f12763y = new z();
        g();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && i11 <= 27) {
            setLayerType(1, null);
        }
        a0.w0(this, new a());
    }

    private void C() {
        ReactContext d11 = t0.d(this);
        com.facebook.react.uimanager.d dVar = this.H;
        if (dVar == null || dVar.b() || d11.isBridgeless()) {
            return;
        }
        k kVar = new k(this);
        UIManagerModule uIManagerModule = (UIManagerModule) d11.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z11) {
        com.facebook.react.uimanager.d dVar = this.H;
        if ((dVar == null || dVar.b()) && getId() != -1) {
            boolean z12 = true;
            if (z11) {
                this.f12746d = true;
                f(getText());
                this.f12746d = false;
            }
            Editable text = getText();
            if (text == null || text.length() <= 0) {
                z12 = false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z12) {
                try {
                    spannableStringBuilder.append(text.subSequence(0, text.length()));
                } catch (IndexOutOfBoundsException e11) {
                    ReactSoftExceptionLogger.logSoftException(this.f12744b, e11);
                }
            }
            if (!z12) {
                if (getHint() != null && getHint().length() > 0) {
                    spannableStringBuilder.append(getHint());
                } else {
                    spannableStringBuilder.append((CharSequence) "I");
                }
                f(spannableStringBuilder);
            }
            c0.i(getId(), spannableStringBuilder);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f12756n
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 6
            if (r0 == 0) goto L70
            r0.hashCode()
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L58;
                case -906336856: goto L4d;
                case 3304: goto L42;
                case 3089282: goto L37;
                case 3377907: goto L2c;
                case 3387192: goto L21;
                case 3526536: goto L16;
                default: goto L15;
            }
        L15:
            goto L62
        L16:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L1f
            goto L62
        L1f:
            r7 = r6
            goto L62
        L21:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L2a
            goto L62
        L2a:
            r7 = r1
            goto L62
        L2c:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L35
            goto L62
        L35:
            r7 = r2
            goto L62
        L37:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L40
            goto L62
        L40:
            r7 = r3
            goto L62
        L42:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L4b
            goto L62
        L4b:
            r7 = r4
            goto L62
        L4d:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L56
            goto L62
        L56:
            r7 = r5
            goto L62
        L58:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L61
            goto L62
        L61:
            r7 = 0
        L62:
            switch(r7) {
                case 0: goto L6e;
                case 1: goto L6c;
                case 2: goto L6a;
                case 3: goto L70;
                case 4: goto L71;
                case 5: goto L68;
                case 6: goto L66;
                default: goto L65;
            }
        L65:
            goto L70
        L66:
            r1 = r2
            goto L71
        L68:
            r1 = r5
            goto L71
        L6a:
            r1 = r4
            goto L71
        L6c:
            r1 = r3
            goto L71
        L6e:
            r1 = 7
            goto L71
        L70:
            r1 = r6
        L71:
            boolean r0 = r9.f12755m
            if (r0 == 0) goto L7c
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            goto L7f
        L7c:
            r9.setImeOptions(r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.c.F():void");
    }

    private void f(Spannable spannable) {
        Object[] spans;
        if (this.H.b()) {
            boolean z11 = this.K;
            this.K = true;
            int length = spannable.length();
            int i11 = 0;
            for (Object obj : spannable.getSpans(0, length(), Object.class)) {
                int spanFlags = spannable.getSpanFlags(obj);
                if (((spanFlags & 18) == 18 || (spanFlags & 17) == 17) && (obj instanceof com.facebook.react.views.text.m) && spannable.getSpanStart(obj) == 0 && spannable.getSpanEnd(obj) == length) {
                    spannable.removeSpan(obj);
                }
            }
            ArrayList<c0.a> arrayList = new ArrayList();
            if (!Float.isNaN(this.f12763y.i())) {
                arrayList.add(new c0.a(0, length, new com.facebook.react.views.text.a(this.f12763y.i())));
            }
            arrayList.add(new c0.a(0, length, new com.facebook.react.views.text.f(this.f12763y.c())));
            if (this.C != -1 || this.B != -1 || this.A != null) {
                arrayList.add(new c0.a(0, length, new com.facebook.react.views.text.c(this.C, this.B, null, this.A, t0.d(this).getAssets())));
            }
            if (!Float.isNaN(this.f12763y.e())) {
                arrayList.add(new c0.a(0, length, new com.facebook.react.views.text.b(this.f12763y.e())));
            }
            for (c0.a aVar : arrayList) {
                aVar.a(spannable, i11);
                i11++;
            }
            this.K = z11;
        }
    }

    private C0238c getTextWatcherDelegator() {
        if (this.f12751i == null) {
            this.f12751i = new C0238c(this, null);
        }
        return this.f12751i;
    }

    private int i(int i11) {
        return Math.max(0, Math.min(i11, getText() == null ? 0 : getText().length()));
    }

    private boolean o() {
        return (getInputType() & 144) != 0;
    }

    private void p(SpannableStringBuilder spannableStringBuilder, boolean z11) {
        Object[] spans;
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z12 = (spanFlags & 33) == 33;
            if (obj instanceof com.facebook.react.views.text.m) {
                getText().removeSpan(obj);
            }
            if (z12) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (y(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        if (z11) {
            return;
        }
        f(getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.facebook.react.views.textinput.a aVar = this.f12758p;
        if (aVar != null) {
            aVar.a();
        }
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, null);
        if (getShowSoftInputOnFocus()) {
            D();
        }
        return requestFocus;
    }

    private static boolean y(Editable editable, SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
        if (i11 > spannableStringBuilder.length() || i12 > spannableStringBuilder.length()) {
            return false;
        }
        while (i11 < i12) {
            if (editable.charAt(i11) != spannableStringBuilder.charAt(i11)) {
                return false;
            }
            i11++;
        }
        return true;
    }

    public void A(float f11, int i11) {
        this.G.e(f11, i11);
    }

    public void B(int i11, float f11) {
        this.G.g(i11, f11);
    }

    protected boolean D() {
        return this.f12743a.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f12750h == null) {
            this.f12750h = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f12750h.add(textWatcher);
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        l();
    }

    protected void finalize() {
        c0.d(getId());
    }

    protected void g() {
        setTextSize(0, this.f12763y.c());
        float d11 = this.f12763y.d();
        if (Float.isNaN(d11)) {
            return;
        }
        setLetterSpacing(d11);
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.f12754l;
        if (bool == null) {
            return !n();
        }
        return bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.f12755m;
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.H;
    }

    public String getReturnKeyType() {
        return this.f12756n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.f12752j;
    }

    public boolean h(int i11) {
        return i11 >= this.f12749g;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f12753k) {
            Editable text = getText();
            for (com.facebook.react.views.text.a0 a0Var : (com.facebook.react.views.text.a0[]) text.getSpans(0, text.length(), com.facebook.react.views.text.a0.class)) {
                if (a0Var.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (getInputType() != this.f12752j) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f12752j);
            setSelection(selectionStart, selectionEnd);
        }
    }

    protected void l() {
        this.f12743a.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int m() {
        int i11 = this.f12749g + 1;
        this.f12749g = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return (getInputType() & 131072) != 0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.f12753k) {
            Editable text = getText();
            for (com.facebook.react.views.text.a0 a0Var : (com.facebook.react.views.text.a0[]) text.getSpans(0, text.length(), com.facebook.react.views.text.a0.class)) {
                a0Var.c();
            }
        }
        if (this.E && !this.F) {
            x();
        }
        this.F = true;
    }

    @Override // androidx.appcompat.widget.j, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext d11 = t0.d(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.f12762x) {
            onCreateInputConnection = new d(onCreateInputConnection, d11, this, this.O);
        }
        if (n() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12753k) {
            Editable text = getText();
            for (com.facebook.react.views.text.a0 a0Var : (com.facebook.react.views.text.a0[]) text.getSpans(0, text.length(), com.facebook.react.views.text.a0.class)) {
                a0Var.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f12753k) {
            Editable text = getText();
            for (com.facebook.react.views.text.a0 a0Var : (com.facebook.react.views.text.a0[]) text.getSpans(0, text.length(), com.facebook.react.views.text.a0.class)) {
                a0Var.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        p pVar;
        super.onFocusChanged(z11, i11, rect);
        if (!z11 || (pVar = this.f12757o) == null) {
            return;
        }
        pVar.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 66 && !n()) {
            l();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        v();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        o oVar = this.f12759q;
        if (oVar != null) {
            oVar.a(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i11, int i12) {
        super.onSelectionChanged(i11, i12);
        if (this.f12746d || this.f12757o == null || !hasFocus()) {
            return;
        }
        this.f12757o.a(i11, i12);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f12753k) {
            Editable text = getText();
            for (com.facebook.react.views.text.a0 a0Var : (com.facebook.react.views.text.a0[]) text.getSpans(0, text.length(), com.facebook.react.views.text.a0.class)) {
                a0Var.f();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && this.f12761w) {
                if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.f12761w = false;
            }
        } else {
            this.f12761w = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void q(int i11, int i12, int i13) {
        if (!h(i11) || i12 == -1 || i13 == -1) {
            return;
        }
        setSelection(i(i12), i(i13));
    }

    public void r(r rVar) {
        if (!(o() && TextUtils.equals(getText(), rVar.k())) && h(rVar.c())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.k());
            p(spannableStringBuilder, rVar.f12665m);
            this.f12753k = rVar.b();
            this.K = true;
            if (rVar.k().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.K = false;
            if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != rVar.m()) {
                setBreakStrategy(rVar.m());
            }
            E(false);
        }
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.f12750h;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f12750h.isEmpty()) {
                this.f12750h = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i11, Rect rect) {
        return isFocused();
    }

    public void s(r rVar) {
        this.f12745c = true;
        r(rVar);
        this.f12745c = false;
    }

    public void setAllowFontScaling(boolean z11) {
        if (this.f12763y.b() != z11) {
            this.f12763y.m(z11);
            g();
        }
    }

    public void setAutoFocus(boolean z11) {
        this.E = z11;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.G.b(i11);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.f12754l = bool;
    }

    public void setBorderRadius(float f11) {
        this.G.d(f11);
    }

    public void setBorderStyle(String str) {
        this.G.f(str);
    }

    public void setContentSizeWatcher(com.facebook.react.views.textinput.a aVar) {
        this.f12758p = aVar;
    }

    public void setDisableFullscreenUI(boolean z11) {
        this.f12755m = z11;
        F();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEventDispatcher(com.facebook.react.uimanager.events.d dVar) {
        this.O = dVar;
    }

    public void setFontFamily(String str) {
        this.A = str;
        this.f12764z = true;
    }

    public void setFontSize(float f11) {
        this.f12763y.n(f11);
        g();
    }

    public void setFontStyle(String str) {
        int b11 = u.b(str);
        if (b11 != this.C) {
            this.C = b11;
            this.f12764z = true;
        }
    }

    public void setFontWeight(String str) {
        int d11 = u.d(str);
        if (d11 != this.B) {
            this.B = d11;
            this.f12764z = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityHorizontal(int i11) {
        if (i11 == 0) {
            i11 = this.f12747e;
        }
        setGravity(i11 | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i11) {
        if (i11 == 0) {
            i11 = this.f12748f;
        }
        setGravity(i11 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i11) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i11);
        this.f12752j = i11;
        super.setTypeface(typeface);
        if (n()) {
            setSingleLine(false);
        }
        this.f12760t.a(i11);
        setKeyListener(this.f12760t);
    }

    public void setLetterSpacingPt(float f11) {
        this.f12763y.p(f11);
        g();
    }

    public void setMaxFontSizeMultiplier(float f11) {
        if (f11 != this.f12763y.k()) {
            this.f12763y.r(f11);
            g();
        }
    }

    public void setOnKeyPress(boolean z11) {
        this.f12762x = z11;
    }

    public void setReturnKeyType(String str) {
        this.f12756n = str;
        F();
    }

    public void setScrollWatcher(o oVar) {
        this.f12759q = oVar;
    }

    @Override // android.widget.EditText
    public void setSelection(int i11, int i12) {
        super.setSelection(i11, i12);
    }

    public void setSelectionWatcher(p pVar) {
        this.f12757o = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedInputType(int i11) {
        this.f12752j = i11;
    }

    public void t(r rVar) {
        this.L = true;
        r(rVar);
        this.L = false;
    }

    public void u() {
        if (this.f12764z) {
            this.f12764z = false;
            setTypeface(u.a(getTypeface(), this.C, this.B, this.A, getContext().getAssets()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f12753k) {
            Editable text = getText();
            for (com.facebook.react.views.text.a0 a0Var : (com.facebook.react.views.text.a0[]) text.getSpans(0, text.length(), com.facebook.react.views.text.a0.class)) {
                if (a0Var.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void w() {
        x();
    }

    public void z(int i11, float f11, float f12) {
        this.G.c(i11, f11, f12);
    }
}