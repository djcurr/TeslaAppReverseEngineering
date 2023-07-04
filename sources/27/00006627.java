package dv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import av.f;
import av.g;

/* loaded from: classes6.dex */
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f24252a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentLoadingProgressBar f24253b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f24254c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24255d;

    private b(ConstraintLayout constraintLayout, ContentLoadingProgressBar contentLoadingProgressBar, RecyclerView recyclerView, TextView textView) {
        this.f24252a = constraintLayout;
        this.f24253b = contentLoadingProgressBar;
        this.f24254c = recyclerView;
        this.f24255d = textView;
    }

    public static b a(View view) {
        int i11 = f.f6978g;
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) b5.b.a(view, i11);
        if (contentLoadingProgressBar != null) {
            i11 = f.recyclerview;
            RecyclerView recyclerView = (RecyclerView) b5.b.a(view, i11);
            if (recyclerView != null) {
                i11 = f.selection_title;
                TextView textView = (TextView) b5.b.a(view, i11);
                if (textView != null) {
                    return new b((ConstraintLayout) view, contentLoadingProgressBar, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(g.vehicle_status_widget_configuration_activity, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f24252a;
    }
}