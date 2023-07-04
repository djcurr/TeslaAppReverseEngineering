package hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.withpersona.sdk.inquiry.selfie.view.CircleMaskView;
import com.withpersona.sdk.inquiry.selfie.view.PreviewBlurView;
import com.withpersona.sdk.inquiry.selfie.view.ProgressArcView;
import gw.j;
import gw.k;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class e implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final View f29462a;

    /* renamed from: b  reason: collision with root package name */
    public final CircleMaskView f29463b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f29464c;

    /* renamed from: d  reason: collision with root package name */
    public final PreviewBlurView f29465d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressArcView f29466e;

    private e(View view, CircleMaskView circleMaskView, ImageView imageView, PreviewBlurView previewBlurView, ProgressArcView progressArcView) {
        this.f29462a = view;
        this.f29463b = circleMaskView;
        this.f29464c = imageView;
        this.f29465d = previewBlurView;
        this.f29466e = progressArcView;
    }

    public static e a(View view) {
        int i11 = j.f28405c;
        CircleMaskView circleMaskView = (CircleMaskView) b5.b.a(view, i11);
        if (circleMaskView != null) {
            i11 = j.f28408f;
            ImageView imageView = (ImageView) b5.b.a(view, i11);
            if (imageView != null) {
                i11 = j.f28413k;
                PreviewBlurView previewBlurView = (PreviewBlurView) b5.b.a(view, i11);
                if (previewBlurView != null) {
                    i11 = j.f28415m;
                    ProgressArcView progressArcView = (ProgressArcView) b5.b.a(view, i11);
                    if (progressArcView != null) {
                        return new e(view, circleMaskView, imageView, previewBlurView, progressArcView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static e b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(k.f28430e, viewGroup);
        return a(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.f29462a;
    }
}