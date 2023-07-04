package wv;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class d0 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    private final View f56232a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f56233b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f56234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(View view) {
        super(view);
        kotlin.jvm.internal.s.g(view, "view");
        this.f56232a = view;
        View findViewById = view.findViewById(h0.f56294o);
        kotlin.jvm.internal.s.f(findViewById, "view.findViewById(R.id.i…ew_governmentid_listicon)");
        ImageView imageView = (ImageView) findViewById;
        this.f56233b = imageView;
        View findViewById2 = view.findViewById(h0.f56303x);
        kotlin.jvm.internal.s.f(findViewById2, "view.findViewById(R.id.t…w_governmentid_listlabel)");
        this.f56234c = (TextView) findViewById2;
        Context context = view.getContext();
        kotlin.jvm.internal.s.f(context, "view.context");
        TypedValue a11 = y.a(context, "personaGovIdSelectHideIcon");
        if (a11.type != 18 || a11.data == 0) {
            return;
        }
        imageView.setVisibility(8);
    }

    public final ImageView b() {
        return this.f56233b;
    }

    public final TextView c() {
        return this.f56234c;
    }

    public final View d() {
        return this.f56232a;
    }
}