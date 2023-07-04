package com.google.android.exoplayer2.ui;

import ak.k0;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nj.b;
import nj.k;

/* loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout implements k {

    /* renamed from: a  reason: collision with root package name */
    private List<nj.b> f14455a;

    /* renamed from: b  reason: collision with root package name */
    private nj.a f14456b;

    /* renamed from: c  reason: collision with root package name */
    private int f14457c;

    /* renamed from: d  reason: collision with root package name */
    private float f14458d;

    /* renamed from: e  reason: collision with root package name */
    private float f14459e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14460f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14461g;

    /* renamed from: h  reason: collision with root package name */
    private int f14462h;

    /* renamed from: i  reason: collision with root package name */
    private a f14463i;

    /* renamed from: j  reason: collision with root package name */
    private View f14464j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface a {
        void a(List<nj.b> list, nj.a aVar, float f11, int i11, float f12);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private nj.b a(nj.b bVar) {
        CharSequence charSequence = bVar.f41694a;
        if (!this.f14460f) {
            b.C0811b b11 = bVar.a().o(-3.4028235E38f, Integer.MIN_VALUE).b();
            if (charSequence != null) {
                b11.m(charSequence.toString());
            }
            return b11.a();
        } else if (this.f14461g || charSequence == null) {
            return bVar;
        } else {
            b.C0811b o11 = bVar.a().o(-3.4028235E38f, Integer.MIN_VALUE);
            if (charSequence instanceof Spanned) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                    valueOf.removeSpan(absoluteSizeSpan);
                }
                for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                    valueOf.removeSpan(relativeSizeSpan);
                }
                o11.m(valueOf);
            }
            return o11.a();
        }
    }

    private void c(int i11, float f11) {
        this.f14457c = i11;
        this.f14458d = f11;
        f();
    }

    private void f() {
        this.f14463i.a(getCuesWithStylingPreferencesApplied(), this.f14456b, this.f14458d, this.f14457c, this.f14459e);
    }

    private List<nj.b> getCuesWithStylingPreferencesApplied() {
        if (this.f14460f && this.f14461g) {
            return this.f14455a;
        }
        ArrayList arrayList = new ArrayList(this.f14455a.size());
        for (int i11 = 0; i11 < this.f14455a.size(); i11++) {
            arrayList.add(a(this.f14455a.get(i11)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (k0.f477a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private nj.a getUserCaptionStyle() {
        if (k0.f477a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return nj.a.a(captioningManager.getUserStyle());
            }
            return nj.a.f41686g;
        }
        return nj.a.f41686g;
    }

    private <T extends View & a> void setView(T t11) {
        removeView(this.f14464j);
        View view = this.f14464j;
        if (view instanceof j) {
            ((j) view).g();
        }
        this.f14464j = t11;
        this.f14463i = t11;
        addView(t11);
    }

    public void b(float f11, boolean z11) {
        c(z11 ? 1 : 0, f11);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z11) {
        this.f14461g = z11;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z11) {
        this.f14460f = z11;
        f();
    }

    public void setBottomPaddingFraction(float f11) {
        this.f14459e = f11;
        f();
    }

    public void setCues(List<nj.b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f14455a = list;
        f();
    }

    public void setFractionalTextSize(float f11) {
        b(f11, false);
    }

    public void setStyle(nj.a aVar) {
        this.f14456b = aVar;
        f();
    }

    public void setViewType(int i11) {
        if (this.f14462h == i11) {
            return;
        }
        if (i11 == 1) {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        } else if (i11 == 2) {
            setView(new j(getContext()));
        } else {
            throw new IllegalArgumentException();
        }
        this.f14462h = i11;
    }

    @Override // nj.k
    public void w(List<nj.b> list) {
        setCues(list);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14455a = Collections.emptyList();
        this.f14456b = nj.a.f41686g;
        this.f14457c = 0;
        this.f14458d = 0.0533f;
        this.f14459e = 0.08f;
        this.f14460f = true;
        this.f14461g = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f14463i = aVar;
        this.f14464j = aVar;
        addView(aVar);
        this.f14462h = 1;
    }
}