package com.adyen.threeds2.internal.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adyen.threeds2.R;

/* loaded from: classes.dex */
public final class ToolbarView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f9713a;

    /* renamed from: b  reason: collision with root package name */
    private final Button f9714b;

    /* renamed from: c  reason: collision with root package name */
    private a f9715c;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public ToolbarView(Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f9715c == null || !view.equals(this.f9714b)) {
            return;
        }
        this.f9715c.a();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        getChildAt(0).setBackgroundColor(i11);
    }

    public void setCancelButtonBackgroundColor(int i11) {
        this.f9714b.setBackgroundColor(i11);
    }

    public void setCancelButtonText(String str) {
        this.f9714b.setText(str);
    }

    public void setCancelButtonTextColor(int i11) {
        this.f9714b.setTextColor(i11);
    }

    public void setCancelButtonTextTypeface(Typeface typeface) {
        this.f9714b.setTypeface(typeface);
    }

    public void setTitle(String str) {
        this.f9713a.setText(str);
    }

    public void setTitleFontSize(Integer num) {
        this.f9713a.setTextSize(num.intValue());
    }

    public void setTitleTextColor(int i11) {
        this.f9713a.setTextColor(i11);
    }

    public void setTitleTypeface(Typeface typeface) {
        this.f9713a.setTypeface(typeface);
    }

    public void setToolbarListener(a aVar) {
        this.f9715c = aVar;
    }

    public ToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LinearLayout.inflate(context, R.layout.a3ds2_widget_toolbar, this);
        CharSequence loadLabel = getContext().getApplicationInfo().loadLabel(getContext().getPackageManager());
        TextView textView = (TextView) findViewById(R.id.textView_title);
        this.f9713a = textView;
        textView.setText(loadLabel);
        Button button = (Button) findViewById(R.id.button_cancel);
        this.f9714b = button;
        button.setOnClickListener(this);
    }
}