package k7;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    private final View f34476a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f34477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View rootView) {
        super(rootView);
        s.g(rootView, "rootView");
        this.f34476a = rootView;
        View findViewById = rootView.findViewById(j7.c.textView_text);
        s.f(findViewById, "rootView.findViewById(R.id.textView_text)");
        this.f34477b = (TextView) findViewById;
    }

    public final void a(c item) {
        s.g(item, "item");
        this.f34477b.setText(item.a());
    }
}