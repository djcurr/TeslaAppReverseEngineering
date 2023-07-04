package dv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import av.f;
import av.g;

/* loaded from: classes6.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f24249a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f24250b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24251c;

    private a(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f24249a = linearLayout;
        this.f24250b = imageView;
        this.f24251c = textView;
    }

    public static a a(View view) {
        int i11 = f.vehicle_image;
        ImageView imageView = (ImageView) b5.b.a(view, i11);
        if (imageView != null) {
            i11 = f.vehicle_name;
            TextView textView = (TextView) b5.b.a(view, i11);
            if (textView != null) {
                return new a((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(g.vehicle_status_configuration_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f24249a;
    }
}