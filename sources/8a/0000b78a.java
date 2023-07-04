package u7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Objects;
import t7.b;
import t7.c;

/* loaded from: classes.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final View f53355a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f53356b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f53357c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f53358d;

    private a(View view, ImageView imageView, TextView textView, TextView textView2) {
        this.f53355a = view;
        this.f53356b = imageView;
        this.f53357c = textView;
        this.f53358d = textView2;
    }

    public static a a(View view) {
        int i11 = b.imageView_logo;
        ImageView imageView = (ImageView) view.findViewById(i11);
        if (imageView != null) {
            i11 = b.textView_description;
            TextView textView = (TextView) view.findViewById(i11);
            if (textView != null) {
                i11 = b.textView_download;
                TextView textView2 = (TextView) view.findViewById(i11);
                if (textView2 != null) {
                    return new a(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(c.voucher_view, viewGroup);
        return a(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.f53355a;
    }
}