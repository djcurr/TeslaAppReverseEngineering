package q2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final int f47357a;

    /* renamed from: b  reason: collision with root package name */
    private final float f47358b;

    /* renamed from: c  reason: collision with root package name */
    private final float f47359c;

    /* renamed from: d  reason: collision with root package name */
    private final float f47360d;

    public h(int i11, float f11, float f12, float f13) {
        this.f47357a = i11;
        this.f47358b = f11;
        this.f47359c = f12;
        this.f47360d = f13;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp2) {
        s.g(tp2, "tp");
        tp2.setShadowLayer(this.f47360d, this.f47358b, this.f47359c, this.f47357a);
    }
}