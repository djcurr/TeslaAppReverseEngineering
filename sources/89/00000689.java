package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.v;

/* loaded from: classes.dex */
public final class n implements v {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        static CharSequence a(Context context, ClipData.Item item, int i11) {
            if ((i11 & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        static CharSequence a(Context context, ClipData.Item item, int i11) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i11 & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    private static CharSequence b(Context context, ClipData.Item item, int i11) {
        if (Build.VERSION.SDK_INT >= 16) {
            return a.a(context, item, i11);
        }
        return b.a(context, item, i11);
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.v
    public androidx.core.view.c a(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        if (cVar.d() == 2) {
            return cVar;
        }
        ClipData b11 = cVar.b();
        int c11 = cVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z11 = false;
        for (int i11 = 0; i11 < b11.getItemCount(); i11++) {
            CharSequence b12 = b(context, b11.getItemAt(i11), c11);
            if (b12 != null) {
                if (!z11) {
                    c(editable, b12);
                    z11 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b12);
                }
            }
        }
        return null;
    }
}