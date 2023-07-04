package sp;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.henninghall.date_picker.j;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final GradientDrawable f50488a;

    /* renamed from: b  reason: collision with root package name */
    private final GradientDrawable f50489b;

    /* renamed from: c  reason: collision with root package name */
    private final j f50490c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(j jVar, View view) {
        this.f50490c = jVar;
        this.f50488a = (GradientDrawable) ((ImageView) view.findViewById(com.henninghall.date_picker.h.overlay_top)).getDrawable();
        this.f50489b = (GradientDrawable) ((ImageView) view.findViewById(com.henninghall.date_picker.h.overlay_bottom)).getDrawable();
    }

    private boolean b(String str) {
        return str != null && str.length() == 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        String p11 = this.f50490c.p();
        int i11 = b(p11) ? 255 : 0;
        this.f50488a.setAlpha(i11);
        this.f50489b.setAlpha(i11);
        if (b(p11)) {
            int parseColor = Color.parseColor("#FF" + p11.substring(1));
            int parseColor2 = Color.parseColor("#00" + p11.substring(1));
            this.f50488a.setColors(new int[]{parseColor, parseColor2});
            this.f50489b.setColors(new int[]{parseColor, parseColor2});
        }
    }
}