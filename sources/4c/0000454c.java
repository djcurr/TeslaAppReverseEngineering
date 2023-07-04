package com.plaid.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import com.plaid.internal.core.ui_components.PlaidInput;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class rc extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f19373a;

    /* renamed from: b  reason: collision with root package name */
    public final PlaidInput f19374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.plaid_user_input_prompt, (ViewGroup) this, true);
        setOrientation(1);
        View findViewById = findViewById(R.id.prompt);
        kotlin.jvm.internal.s.f(findViewById, "findViewById(R.id.prompt)");
        this.f19373a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.input);
        kotlin.jvm.internal.s.f(findViewById2, "findViewById(R.id.input)");
        this.f19374b = (PlaidInput) findViewById2;
    }

    public final PlaidInput getInput() {
        return this.f19374b;
    }

    public final String getResponse() {
        return this.f19374b.getText();
    }

    public final void setInputModel(Common$TextInput common$TextInput) {
        j9.a(this.f19374b, common$TextInput);
    }

    public final void setPrompt(String str) {
        this.f19373a.setText(str);
    }

    public final void setValue(String value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f19374b.setText(value);
    }
}