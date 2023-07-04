package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1975a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1976b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(TextView textView) {
        this.f1975a = (TextView) v3.h.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1976b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1975a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1976b = textClassifier;
    }
}