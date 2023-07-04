package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$HyperlinkContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.ic;

/* loaded from: classes2.dex */
public final class ic {
    public static final void a(TextView textView, final Common$HyperlinkContent common$HyperlinkContent, final h00.l<? super Common$LocalAction, vz.b0> lVar) {
        String a11;
        kotlin.jvm.internal.s.g(textView, "<this>");
        if (common$HyperlinkContent == null) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            return;
        }
        Common$LocalizedString text = common$HyperlinkContent.getText();
        if (text == null) {
            a11 = null;
        } else {
            Resources resources = textView.getResources();
            kotlin.jvm.internal.s.f(resources, "resources");
            Context context = textView.getContext();
            a11 = z6.a(text, resources, context == null ? null : context.getPackageName(), 0, 4);
        }
        if (a11 == null || a11.length() == 0) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            return;
        }
        textView.setText(Html.fromHtml(a11));
        textView.setOnClickListener(new View.OnClickListener() { // from class: qq.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ic.a(Common$HyperlinkContent.this, lVar, view);
            }
        });
        textView.setVisibility(0);
    }

    public static final void a(Common$HyperlinkContent common$HyperlinkContent, h00.l lVar, View view) {
        Common$LocalAction action = common$HyperlinkContent.getAction();
        if (action == null || lVar == null) {
            return;
        }
        lVar.invoke(action);
    }

    public static final void a(TextView textView, Common$AttributedLocalizedString common$AttributedLocalizedString, h00.l<? super Common$LocalAction, vz.b0> localActionListener) {
        String str;
        Common$LocalizedString localizedString;
        kotlin.jvm.internal.s.g(textView, "<this>");
        kotlin.jvm.internal.s.g(localActionListener, "localActionListener");
        if (common$AttributedLocalizedString == null || (localizedString = common$AttributedLocalizedString.getLocalizedString()) == null) {
            str = null;
        } else {
            Resources resources = textView.getResources();
            kotlin.jvm.internal.s.f(resources, "resources");
            Context context = textView.getContext();
            str = z6.a(localizedString, resources, context == null ? null : context.getPackageName(), 0, 4);
        }
        if (str == null || str.length() == 0) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        kotlin.jvm.internal.s.f(spans, "html.getSpans(0, html.length, URLSpan::class.java)");
        int length = spans.length;
        int i11 = 0;
        while (i11 < length) {
            Object obj = spans[i11];
            i11++;
            URLSpan uRLSpan = (URLSpan) obj;
            Common$LocalAction common$LocalAction = common$AttributedLocalizedString.getActions().get(uRLSpan.getURL());
            if (common$LocalAction != null) {
                spannableStringBuilder.setSpan(new r6(localActionListener, common$LocalAction), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 18);
                spannableStringBuilder.removeSpan(uRLSpan);
            }
        }
        textView.setVisibility(0);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}