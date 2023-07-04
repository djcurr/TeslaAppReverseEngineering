package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes3.dex */
class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private c f12768a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.react.uimanager.events.d f12769b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12770c;

    /* renamed from: d  reason: collision with root package name */
    private String f12771d;

    public d(InputConnection inputConnection, ReactContext reactContext, c cVar, com.facebook.react.uimanager.events.d dVar) {
        super(inputConnection, false);
        this.f12771d = null;
        this.f12769b = dVar;
        this.f12768a = cVar;
    }

    private void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f12769b.g(new j(this.f12768a.getId(), str));
    }

    private void b(String str) {
        if (this.f12770c) {
            this.f12771d = str;
        } else {
            a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f12770c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i11) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            b(charSequence2);
        }
        return super.commitText(charSequence, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        a("Backspace");
        return super.deleteSurroundingText(i11, i12);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f12770c = false;
        String str = this.f12771d;
        if (str != null) {
            a(str);
            this.f12771d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z11 = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                a("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                a("Enter");
            } else if (z11) {
                a(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i11) {
        int selectionStart = this.f12768a.getSelectionStart();
        int selectionEnd = this.f12768a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i11);
        int selectionStart2 = this.f12768a.getSelectionStart();
        boolean z11 = false;
        boolean z12 = selectionStart == selectionEnd;
        boolean z13 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0) {
            z11 = true;
        }
        b((z11 || (!z12 && z13)) ? "Backspace" : String.valueOf(this.f12768a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}