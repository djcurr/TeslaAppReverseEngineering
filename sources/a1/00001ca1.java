package com.google.android.exoplayer2.ui;

import ak.k0;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class j extends FrameLayout implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.a f14568a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f14569b;

    /* renamed from: c  reason: collision with root package name */
    private List<nj.b> f14570c;

    /* renamed from: d  reason: collision with root package name */
    private nj.a f14571d;

    /* renamed from: e  reason: collision with root package name */
    private float f14572e;

    /* renamed from: f  reason: collision with root package name */
    private int f14573f;

    /* renamed from: g  reason: collision with root package name */
    private float f14574g;

    /* loaded from: classes3.dex */
    class a extends WebView {
        a(j jVar, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14575a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f14575a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14575a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14575a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    private static int b(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i11 = b.f14575a[alignment.ordinal()];
        return i11 != 1 ? i11 != 2 ? "center" : "end" : "start";
    }

    private static String d(nj.a aVar) {
        int i11 = aVar.f41690d;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return i11 != 4 ? "unset" : k0.D("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.b.b(aVar.f41691e));
                }
                return k0.D("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.b.b(aVar.f41691e));
            }
            return k0.D("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.b.b(aVar.f41691e));
        }
        return k0.D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.b.b(aVar.f41691e));
    }

    private String e(int i11, float f11) {
        float a11 = h.a(i11, f11, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return a11 == -3.4028235E38f ? "unset" : k0.D("%.2fpx", Float.valueOf(a11 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i11) {
        return i11 != 1 ? i11 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0144, code lost:
        if (r13 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
        if (r13 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
        r20 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014b, code lost:
        r21 = "top";
        r13 = 2;
        r22 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.j.h():void");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<nj.b> list, nj.a aVar, float f11, int i11, float f12) {
        this.f14571d = aVar;
        this.f14572e = f11;
        this.f14573f = i11;
        this.f14574g = f12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            nj.b bVar = list.get(i12);
            if (bVar.f41696c != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f14570c.isEmpty() || !arrayList2.isEmpty()) {
            this.f14570c = arrayList2;
            h();
        }
        this.f14568a.a(arrayList, aVar, f11, i11, f12);
        invalidate();
    }

    public void g() {
        this.f14569b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (!z11 || this.f14570c.isEmpty()) {
            return;
        }
        h();
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14570c = Collections.emptyList();
        this.f14571d = nj.a.f41686g;
        this.f14572e = 0.0533f;
        this.f14573f = 0;
        this.f14574g = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f14568a = aVar;
        a aVar2 = new a(this, context, attributeSet);
        this.f14569b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}