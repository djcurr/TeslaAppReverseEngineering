package fb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.canhub.cropper.CropImageView;
import db.d;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final CropImageView f26195a;

    /* renamed from: b  reason: collision with root package name */
    public final CropImageView f26196b;

    private a(CropImageView cropImageView, CropImageView cropImageView2) {
        this.f26195a = cropImageView;
        this.f26196b = cropImageView2;
    }

    public static a a(View view) {
        Objects.requireNonNull(view, "rootView");
        CropImageView cropImageView = (CropImageView) view;
        return new a(cropImageView, cropImageView);
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(d.f23881a, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public CropImageView getRoot() {
        return this.f26195a;
    }
}