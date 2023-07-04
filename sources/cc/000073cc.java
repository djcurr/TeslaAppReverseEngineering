package hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk.inquiry.selfie.view.SelfieOverlayView;
import gw.j;
import gw.k;

/* loaded from: classes6.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f29440a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f29441b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f29442c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f29443d;

    /* renamed from: e  reason: collision with root package name */
    public final View f29444e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f29445f;

    /* renamed from: g  reason: collision with root package name */
    public final PreviewView f29446g;

    /* renamed from: h  reason: collision with root package name */
    public final SelfieOverlayView f29447h;

    /* renamed from: i  reason: collision with root package name */
    public final View f29448i;

    /* renamed from: j  reason: collision with root package name */
    public final View f29449j;

    private a(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, View view, TextView textView2, PreviewView previewView, SelfieOverlayView selfieOverlayView, View view2, View view3) {
        this.f29440a = constraintLayout;
        this.f29441b = button;
        this.f29442c = imageView;
        this.f29443d = textView;
        this.f29444e = view;
        this.f29445f = textView2;
        this.f29446g = previewView;
        this.f29447h = selfieOverlayView;
        this.f29448i = view2;
        this.f29449j = view3;
    }

    public static a a(View view) {
        View a11;
        View a12;
        View a13;
        int i11 = j.f28403a;
        Button button = (Button) b5.b.a(view, i11);
        if (button != null) {
            i11 = j.f28404b;
            ImageView imageView = (ImageView) b5.b.a(view, i11);
            if (imageView != null) {
                i11 = j.f28406d;
                TextView textView = (TextView) b5.b.a(view, i11);
                if (textView != null && (a11 = b5.b.a(view, (i11 = j.f28407e))) != null) {
                    i11 = j.f28409g;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        i11 = j.f28414l;
                        PreviewView previewView = (PreviewView) b5.b.a(view, i11);
                        if (previewView != null) {
                            i11 = j.f28416n;
                            SelfieOverlayView selfieOverlayView = (SelfieOverlayView) b5.b.a(view, i11);
                            if (selfieOverlayView != null && (a12 = b5.b.a(view, (i11 = j.f28424v))) != null && (a13 = b5.b.a(view, (i11 = j.f28425w))) != null) {
                                return new a((ConstraintLayout) view, button, imageView, textView, a11, textView2, previewView, selfieOverlayView, a12, a13);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(k.f28426a, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f29440a;
    }
}