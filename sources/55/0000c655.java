package zv;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class w extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    private final View f61238a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f61239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(View view) {
        super(view);
        kotlin.jvm.internal.s.g(view, "view");
        this.f61238a = view;
        View findViewById = view.findViewById(m0.f61176t);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.t…inquiry_countrylistlabel)");
        this.f61239b = (TextView) findViewById;
    }

    public final TextView b() {
        return this.f61239b;
    }

    public final View c() {
        return this.f61238a;
    }
}