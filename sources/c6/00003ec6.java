package com.ijzerenhein.sharedelement;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.ijzerenhein.sharedelement.d;

/* loaded from: classes2.dex */
class o extends View {

    /* renamed from: a  reason: collision with root package name */
    private final d f17837a;

    /* renamed from: b  reason: collision with root package name */
    private d.b f17838b;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17839a;

        static {
            int[] iArr = new int[i.values().length];
            f17839a = iArr;
            try {
                iArr[i.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17839a[i.STRETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17839a[i.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17839a[i.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(n0 n0Var) {
        super(n0Var);
        this.f17838b = d.b.NONE;
        d dVar = new d();
        this.f17837a = dVar;
        setBackground(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RectF rectF, RectF rectF2, RectF rectF3, Rect rect, c cVar, j jVar, float f11, i iVar, com.ijzerenhein.sharedelement.a aVar, float f12) {
        d.b f13 = this.f17837a.f(cVar, jVar, f12);
        boolean z11 = iVar != i.CLIP && (f13 == d.b.GENERIC || f13 == d.b.PLAIN);
        if (this.f17838b != f13) {
            this.f17838b = f13;
            setLayerType(z11 ? 2 : 0, null);
        }
        float width = rectF.width();
        float height = rectF.height();
        if (z11) {
            int width2 = rect.width();
            int height2 = rect.height();
            layout(0, 0, width2, height2);
            setTranslationX(rectF.left - rectF2.left);
            setTranslationY(rectF.top - rectF2.top);
            float f14 = width2;
            float f15 = width / f14;
            float f16 = height2;
            float f17 = height / f16;
            if (!Float.isInfinite(f15) && !Float.isNaN(f15) && !Float.isInfinite(f17) && !Float.isNaN(f17)) {
                int i11 = a.f17839a[iVar.ordinal()];
                if (i11 == 3 || i11 == 4) {
                    f15 = f14 / rectF3.width();
                    f17 = f16 / rectF3.height();
                }
                setScaleX(f15);
                setScaleY(f17);
            }
            setPivotX(BitmapDescriptorFactory.HUE_RED);
            setPivotY(BitmapDescriptorFactory.HUE_RED);
        } else {
            layout(0, 0, (int) Math.ceil(width), (int) Math.ceil(height));
            setTranslationX(rectF.left - rectF2.left);
            setTranslationY(rectF.top - rectF2.top);
        }
        setAlpha(f11);
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation(jVar.f17807o);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f17838b == d.b.GENERIC;
    }
}