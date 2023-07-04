package nj;

import ak.k0;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f41686g = new a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f41687a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41688b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41689c;

    /* renamed from: d  reason: collision with root package name */
    public final int f41690d;

    /* renamed from: e  reason: collision with root package name */
    public final int f41691e;

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f41692f;

    public a(int i11, int i12, int i13, int i14, int i15, Typeface typeface) {
        this.f41687a = i11;
        this.f41688b = i12;
        this.f41689c = i13;
        this.f41690d = i14;
        this.f41691e = i15;
        this.f41692f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        if (k0.f477a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f41686g.f41687a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f41686g.f41688b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f41686g.f41689c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f41686g.f41690d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f41686g.f41691e, captionStyle.getTypeface());
    }
}