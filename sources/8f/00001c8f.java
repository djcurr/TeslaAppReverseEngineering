package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nj.b;

/* loaded from: classes3.dex */
final class a extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<g> f14485a;

    /* renamed from: b  reason: collision with root package name */
    private List<nj.b> f14486b;

    /* renamed from: c  reason: collision with root package name */
    private int f14487c;

    /* renamed from: d  reason: collision with root package name */
    private float f14488d;

    /* renamed from: e  reason: collision with root package name */
    private nj.a f14489e;

    /* renamed from: f  reason: collision with root package name */
    private float f14490f;

    public a(Context context) {
        this(context, null);
    }

    private static nj.b b(nj.b bVar) {
        b.C0811b n11 = bVar.a().j(-3.4028235E38f).k(Integer.MIN_VALUE).n(null);
        if (bVar.f41698e == 0) {
            n11.h(1.0f - bVar.f41697d, 0);
        } else {
            n11.h((-bVar.f41697d) - 1.0f, 1);
        }
        int i11 = bVar.f41699f;
        if (i11 == 0) {
            n11.i(2);
        } else if (i11 == 2) {
            n11.i(0);
        }
        return n11.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<nj.b> list, nj.a aVar, float f11, int i11, float f12) {
        this.f14486b = list;
        this.f14489e = aVar;
        this.f14488d = f11;
        this.f14487c = i11;
        this.f14490f = f12;
        while (this.f14485a.size() < list.size()) {
            this.f14485a.add(new g(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<nj.b> list = this.f14486b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i11 = paddingBottom - paddingTop;
        float a11 = h.a(this.f14487c, this.f14488d, height, i11);
        if (a11 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            nj.b bVar = list.get(i12);
            if (bVar.f41708o != Integer.MIN_VALUE) {
                bVar = b(bVar);
            }
            nj.b bVar2 = bVar;
            int i13 = paddingBottom;
            this.f14485a.get(i12).b(bVar2, this.f14489e, a11, h.a(bVar2.f41706m, bVar2.f41707n, height, i11), this.f14490f, canvas, paddingLeft, paddingTop, width, i13);
            i12++;
            size = size;
            i11 = i11;
            paddingBottom = i13;
            width = width;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14485a = new ArrayList();
        this.f14486b = Collections.emptyList();
        this.f14487c = 0;
        this.f14488d = 0.0533f;
        this.f14489e = nj.a.f41686g;
        this.f14490f = 0.08f;
    }
}