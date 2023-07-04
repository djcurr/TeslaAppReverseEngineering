package org.godotengine.godot.input;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import org.godotengine.godot.GodotView;

/* loaded from: classes5.dex */
public class GodotEditText extends EditText {
    private static final int HANDLER_CLOSE_IME_KEYBOARD = 3;
    private static final int HANDLER_OPEN_IME_KEYBOARD = 2;
    private GodotTextInputWrapper mInputWrapper;
    private int mMaxInputLength;
    private String mOriginText;
    private GodotView mView;
    private EditHandler sHandler;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class EditHandler extends Handler {
        private final WeakReference<GodotEditText> mEdit;

        public EditHandler(GodotEditText godotEditText) {
            this.mEdit = new WeakReference<>(godotEditText);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            GodotEditText godotEditText = this.mEdit.get();
            if (godotEditText != null) {
                godotEditText.handleMessage(message);
            }
        }
    }

    public GodotEditText(Context context) {
        super(context);
        this.sHandler = new EditHandler(this);
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            GodotEditText godotEditText = (GodotEditText) message.obj;
            godotEditText.removeTextChangedListener(this.mInputWrapper);
            ((InputMethodManager) this.mView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(godotEditText.getWindowToken(), 0);
            godotEditText.mView.requestFocus();
            return;
        }
        GodotEditText godotEditText2 = (GodotEditText) message.obj;
        String str = godotEditText2.mOriginText;
        if (godotEditText2.requestFocus()) {
            godotEditText2.removeTextChangedListener(godotEditText2.mInputWrapper);
            setMaxInputLength(godotEditText2);
            godotEditText2.setText("");
            godotEditText2.append(str);
            int i12 = message.arg2;
            if (i12 != -1) {
                godotEditText2.setSelection(message.arg1, i12);
                godotEditText2.mInputWrapper.setSelection(true);
            } else {
                godotEditText2.mInputWrapper.setSelection(false);
            }
            godotEditText2.mInputWrapper.setOriginText(str);
            godotEditText2.addTextChangedListener(godotEditText2.mInputWrapper);
            ((InputMethodManager) this.mView.getContext().getSystemService("input_method")).showSoftInput(godotEditText2, 0);
        }
    }

    private void setMaxInputLength(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.mMaxInputLength)});
    }

    public void hideKeyboard() {
        Message message = new Message();
        message.what = 3;
        message.obj = this;
        this.sHandler.sendMessage(message);
    }

    protected void initView() {
        setPadding(0, 0, 0, 0);
        setImeOptions(268435456);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        super.onKeyDown(i11, keyEvent);
        if (i11 == 4) {
            this.mView.requestFocus();
            return true;
        }
        return true;
    }

    public void setView(GodotView godotView) {
        this.mView = godotView;
        if (this.mInputWrapper == null) {
            this.mInputWrapper = new GodotTextInputWrapper(this.mView, this);
        }
        setOnEditorActionListener(this.mInputWrapper);
        godotView.requestFocus();
    }

    public void showKeyboard(String str, int i11, int i12, int i13) {
        if (i11 <= 0) {
            i11 = Integer.MAX_VALUE;
        }
        if (i12 == -1) {
            this.mOriginText = str;
            this.mMaxInputLength = i11;
        } else if (i13 == -1) {
            this.mOriginText = str.substring(0, i12);
            this.mMaxInputLength = i11 - (str.length() - i12);
        } else {
            this.mOriginText = str.substring(0, i13);
            this.mMaxInputLength = i11 - (str.length() - i13);
        }
        Message message = new Message();
        message.what = 2;
        message.obj = this;
        message.arg1 = i12;
        message.arg2 = i13;
        this.sHandler.sendMessage(message);
    }

    public GodotEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sHandler = new EditHandler(this);
        initView();
    }

    public GodotEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.sHandler = new EditHandler(this);
        initView();
    }
}