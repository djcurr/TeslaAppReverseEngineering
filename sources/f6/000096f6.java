package org.godotengine.godot.input;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import org.godotengine.godot.GodotLib;
import org.godotengine.godot.GodotView;

/* loaded from: classes5.dex */
public class GodotTextInputWrapper implements TextWatcher, TextView.OnEditorActionListener {
    private static final String TAG = GodotTextInputWrapper.class.getSimpleName();
    private final GodotEditText mEdit;
    private boolean mHasSelection;
    private String mOriginText;
    private final GodotView mView;

    public GodotTextInputWrapper(GodotView godotView, GodotEditText godotEditText) {
        this.mView = godotView;
        this.mEdit = godotEditText;
    }

    private boolean isFullScreenEdit() {
        return ((InputMethodManager) this.mEdit.getContext().getSystemService("input_method")).isFullscreenMode();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, final int i12, int i13) {
        this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotTextInputWrapper.1
            {
                GodotTextInputWrapper.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i14 = 0; i14 < i12; i14++) {
                    GodotLib.key(67, 0, true);
                    GodotLib.key(67, 0, false);
                    if (GodotTextInputWrapper.this.mHasSelection) {
                        GodotTextInputWrapper.this.mHasSelection = false;
                        return;
                    }
                }
            }
        });
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        if (this.mEdit == textView && isFullScreenEdit()) {
            final String characters = keyEvent.getCharacters();
            this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotTextInputWrapper.3
                {
                    GodotTextInputWrapper.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    for (int i12 = 0; i12 < characters.length(); i12++) {
                        int codePointAt = characters.codePointAt(i12);
                        GodotLib.key(0, codePointAt, true);
                        GodotLib.key(0, codePointAt, false);
                    }
                }
            });
        }
        if (i11 == 0) {
            GodotLib.key(66, 0, true);
            GodotLib.key(66, 0, false);
            this.mView.requestFocus();
            return true;
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, final int i13) {
        final int[] iArr = new int[i13];
        for (int i14 = i11; i14 < i11 + i13; i14++) {
            iArr[i14 - i11] = charSequence.charAt(i14);
        }
        this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotTextInputWrapper.2
            {
                GodotTextInputWrapper.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i15 = 0; i15 < i13; i15++) {
                    int i16 = iArr[i15];
                    if (i16 != 10) {
                        GodotLib.key(0, i16, true);
                        GodotLib.key(0, i16, false);
                    }
                }
            }
        });
    }

    public void setOriginText(String str) {
        this.mOriginText = str;
    }

    public void setSelection(boolean z11) {
        this.mHasSelection = z11;
    }
}