package sp;

import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f50491a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(com.henninghall.date_picker.h.pickerWrapper);
        this.f50491a = linearLayout;
        linearLayout.setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        this.f50491a.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f50491a.removeAllViews();
    }
}