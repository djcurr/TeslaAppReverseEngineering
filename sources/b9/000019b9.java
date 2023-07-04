package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: e */
    private static final Map<d, BaseInterpolator> f12337e = yf.c.g(d.LINEAR, new LinearInterpolator(), d.EASE_IN, new AccelerateInterpolator(), d.EASE_OUT, new DecelerateInterpolator(), d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: a */
    private Interpolator f12338a;

    /* renamed from: b */
    private int f12339b;

    /* renamed from: c */
    protected b f12340c;

    /* renamed from: d */
    protected int f12341d;

    private static Interpolator c(d dVar, ReadableMap readableMap) {
        BaseInterpolator baseInterpolator;
        if (dVar.equals(d.SPRING)) {
            baseInterpolator = new n(n.a(readableMap));
        } else {
            baseInterpolator = f12337e.get(dVar);
        }
        if (baseInterpolator != null) {
            return baseInterpolator;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + dVar);
    }

    public final Animation a(View view, int i11, int i12, int i13, int i14) {
        if (e()) {
            Animation b11 = b(view, i11, i12, i13, i14);
            if (b11 != null) {
                b11.setDuration(this.f12341d * 1);
                b11.setStartOffset(this.f12339b * 1);
                b11.setInterpolator(this.f12338a);
            }
            return b11;
        }
        return null;
    }

    abstract Animation b(View view, int i11, int i12, int i13, int i14);

    public void d(ReadableMap readableMap, int i11) {
        this.f12340c = readableMap.hasKey("property") ? b.fromString(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i11 = readableMap.getInt("duration");
        }
        this.f12341d = i11;
        this.f12339b = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (readableMap.hasKey("type")) {
            this.f12338a = c(d.fromString(readableMap.getString("type")), readableMap);
            if (e()) {
                return;
            }
            throw new IllegalViewOperationException("Invalid layout animation : " + readableMap);
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    abstract boolean e();

    public void f() {
        this.f12340c = null;
        this.f12341d = 0;
        this.f12339b = 0;
        this.f12338a = null;
    }
}