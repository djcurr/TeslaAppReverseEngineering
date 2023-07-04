package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.t0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i extends ClickableSpan implements m {

    /* renamed from: a  reason: collision with root package name */
    private final int f12637a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12638b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i11, int i12) {
        this.f12637a = i11;
        this.f12638b = i12;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        com.facebook.react.uimanager.events.d c11 = t0.c(reactContext, this.f12637a);
        if (c11 != null) {
            c11.g(new com.facebook.react.views.view.h(t0.e(reactContext), this.f12637a));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f12638b);
        textPaint.setUnderlineText(false);
    }
}