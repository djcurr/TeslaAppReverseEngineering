package s2;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    private final n f50156a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f50157b;

    /* renamed from: c  reason: collision with root package name */
    private int f50158c;

    /* renamed from: d  reason: collision with root package name */
    private a0 f50159d;

    /* renamed from: e  reason: collision with root package name */
    private int f50160e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f50161f;

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f50162g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f50163h;

    public w(a0 initState, n eventCallback, boolean z11) {
        kotlin.jvm.internal.s.g(initState, "initState");
        kotlin.jvm.internal.s.g(eventCallback, "eventCallback");
        this.f50156a = eventCallback;
        this.f50157b = z11;
        this.f50159d = initState;
        this.f50162g = new ArrayList();
        this.f50163h = true;
    }

    private final void a(d dVar) {
        b();
        try {
            this.f50162g.add(dVar);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.f50158c++;
        return true;
    }

    private final boolean c() {
        List<? extends d> Q0;
        int i11 = this.f50158c - 1;
        this.f50158c = i11;
        if (i11 == 0 && (!this.f50162g.isEmpty())) {
            n nVar = this.f50156a;
            Q0 = wz.e0.Q0(this.f50162g);
            nVar.c(Q0);
            this.f50162g.clear();
        }
        return this.f50158c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z11 = this.f50163h;
        return z11 ? b() : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f50163h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f50162g.clear();
        this.f50158c = 0;
        this.f50163h = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z11 = this.f50163h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        kotlin.jvm.internal.s.g(inputContentInfo, "inputContentInfo");
        boolean z11 = this.f50163h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f50163h;
        return z11 ? d() : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f50163h;
        if (z11) {
            a(new a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    public final boolean d() {
        return this.f50157b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f50163h;
        if (z11) {
            a(new b(i11, i12));
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f50163h;
        if (z11) {
            a(new c(i11, i12));
            return true;
        }
        return z11;
    }

    public final n e() {
        return this.f50156a;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    public final void f(a0 value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f50159d = value;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z11 = this.f50163h;
        if (z11) {
            a(new i());
            return true;
        }
        return z11;
    }

    public final void g(a0 state, o inputMethodManager, View view) {
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(inputMethodManager, "inputMethodManager");
        kotlin.jvm.internal.s.g(view, "view");
        if (this.f50163h) {
            f(state);
            if (this.f50161f) {
                inputMethodManager.d(view, this.f50160e, q.a(state));
            }
            n2.y f11 = state.f();
            int l11 = f11 == null ? -1 : n2.y.l(f11.r());
            n2.y f12 = state.f();
            inputMethodManager.b(view, n2.y.l(state.g()), n2.y.k(state.g()), l11, f12 != null ? n2.y.k(f12.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i11) {
        return TextUtils.getCapsMode(this.f50159d.h(), n2.y.l(this.f50159d.g()), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.f50161f = z11;
        if (z11) {
            this.f50160e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return q.a(this.f50159d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i11) {
        if (n2.y.h(this.f50159d.g())) {
            return null;
        }
        return b0.a(this.f50159d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i11, int i12) {
        return b0.b(this.f50159d, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i11, int i12) {
        return b0.c(this.f50159d, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i11) {
        boolean z11 = this.f50163h;
        if (z11) {
            Log.w("RecordingIC", "performContextMenuAction is not supported");
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i11) {
        int a11;
        boolean z11 = this.f50163h;
        if (z11) {
            if (i11 != 0) {
                switch (i11) {
                    case 2:
                        a11 = l.f50115b.c();
                        break;
                    case 3:
                        a11 = l.f50115b.g();
                        break;
                    case 4:
                        a11 = l.f50115b.h();
                        break;
                    case 5:
                        a11 = l.f50115b.d();
                        break;
                    case 6:
                        a11 = l.f50115b.b();
                        break;
                    case 7:
                        a11 = l.f50115b.f();
                        break;
                    default:
                        Log.w("RecordingIC", kotlin.jvm.internal.s.p("IME sends unsupported Editor Action: ", Integer.valueOf(i11)));
                        a11 = l.f50115b.a();
                        break;
                }
            } else {
                a11 = l.f50115b.a();
            }
            e().b(a11);
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f50163h;
        if (z11) {
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i11) {
        boolean z11 = this.f50163h;
        if (z11) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.s.g(event, "event");
        boolean z11 = this.f50163h;
        if (z11) {
            e().a(event);
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f50163h;
        if (z11) {
            a(new x(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f50163h;
        if (z11) {
            a(new y(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i11, int i12) {
        boolean z11 = this.f50163h;
        if (z11) {
            a(new z(i11, i12));
            return true;
        }
        return z11;
    }
}