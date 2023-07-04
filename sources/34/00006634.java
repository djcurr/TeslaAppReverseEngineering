package dw;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class f {
    public static /* synthetic */ boolean a(h00.a aVar, View view, int i11, KeyEvent keyEvent) {
        return c(aVar, view, i11, keyEvent);
    }

    public static final void b(TextView textView, final h00.a<b0> onEnter) {
        s.g(textView, "<this>");
        s.g(onEnter, "onEnter");
        textView.setOnKeyListener(new View.OnKeyListener() { // from class: dw.e
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                return f.a(h00.a.this, view, i11, keyEvent);
            }
        });
    }

    public static final boolean c(h00.a onEnter, View view, int i11, KeyEvent keyEvent) {
        s.g(onEnter, "$onEnter");
        if (i11 == 66 && keyEvent.getAction() == 1) {
            onEnter.invoke();
            return true;
        }
        return false;
    }
}