package jw;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class d {

    /* loaded from: classes6.dex */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private String f33999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<String, b0> f34000b;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super String, b0> lVar) {
            this.f34000b = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.f33999a == null || s.c(String.valueOf(editable), this.f33999a)) {
                return;
            }
            this.f34000b.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f33999a = String.valueOf(charSequence);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public static final void a(TextView textView, l<? super String, b0> listener) {
        s.g(textView, "<this>");
        s.g(listener, "listener");
        int i11 = b.f33998a;
        Object tag = textView.getTag(i11);
        if (tag != null) {
            textView.removeTextChangedListener((TextWatcher) tag);
        }
        TextWatcher aVar = new a(listener);
        textView.addTextChangedListener(aVar);
        textView.setTag(i11, aVar);
    }
}