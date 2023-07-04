package xv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import wv.h0;
import wv.i0;

/* loaded from: classes6.dex */
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f57742a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f57743b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f57744c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f57745d;

    /* renamed from: e  reason: collision with root package name */
    public final ToggleButton f57746e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f57747f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f57748g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f57749h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f57750i;

    /* renamed from: j  reason: collision with root package name */
    public final PreviewView f57751j;

    /* renamed from: k  reason: collision with root package name */
    public final View f57752k;

    /* renamed from: l  reason: collision with root package name */
    public final View f57753l;

    private b(ConstraintLayout constraintLayout, ImageView imageView, Button button, ImageView imageView2, ToggleButton toggleButton, TextView textView, TextView textView2, TextView textView3, ImageView imageView3, PreviewView previewView, View view, View view2) {
        this.f57742a = constraintLayout;
        this.f57743b = imageView;
        this.f57744c = button;
        this.f57745d = imageView2;
        this.f57746e = toggleButton;
        this.f57747f = textView;
        this.f57748g = textView2;
        this.f57749h = textView3;
        this.f57750i = imageView3;
        this.f57751j = previewView;
        this.f57752k = view;
        this.f57753l = view2;
    }

    public static b a(View view) {
        View a11;
        View a12;
        int i11 = h0.f56282c;
        ImageView imageView = (ImageView) b5.b.a(view, i11);
        if (imageView != null) {
            i11 = h0.f56283d;
            Button button = (Button) b5.b.a(view, i11);
            if (button != null) {
                i11 = h0.f56286g;
                ImageView imageView2 = (ImageView) b5.b.a(view, i11);
                if (imageView2 != null) {
                    i11 = h0.f56288i;
                    ToggleButton toggleButton = (ToggleButton) b5.b.a(view, i11);
                    if (toggleButton != null) {
                        i11 = h0.f56291l;
                        TextView textView = (TextView) b5.b.a(view, i11);
                        if (textView != null) {
                            i11 = h0.f56292m;
                            TextView textView2 = (TextView) b5.b.a(view, i11);
                            if (textView2 != null) {
                                i11 = h0.f56295p;
                                TextView textView3 = (TextView) b5.b.a(view, i11);
                                if (textView3 != null) {
                                    i11 = h0.f56296q;
                                    ImageView imageView3 = (ImageView) b5.b.a(view, i11);
                                    if (imageView3 != null) {
                                        i11 = h0.f56297r;
                                        PreviewView previewView = (PreviewView) b5.b.a(view, i11);
                                        if (previewView != null && (a11 = b5.b.a(view, (i11 = h0.A))) != null && (a12 = b5.b.a(view, (i11 = h0.B))) != null) {
                                            return new b((ConstraintLayout) view, imageView, button, imageView2, toggleButton, textView, textView2, textView3, imageView3, previewView, a11, a12);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(i0.f56314b, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f57742a;
    }
}