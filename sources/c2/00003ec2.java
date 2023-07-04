package com.ijzerenhein.sharedelement;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.ijzerenhein.sharedelement.d;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.cms.CMSAttributeTableGenerator;

/* loaded from: classes2.dex */
public class m extends ViewGroup {

    /* renamed from: a */
    private final g f17812a;

    /* renamed from: b */
    private com.ijzerenhein.sharedelement.b f17813b;

    /* renamed from: c */
    private i f17814c;

    /* renamed from: d */
    private com.ijzerenhein.sharedelement.a f17815d;

    /* renamed from: e */
    private float f17816e;

    /* renamed from: f */
    private boolean f17817f;

    /* renamed from: g */
    private boolean f17818g;

    /* renamed from: h */
    private boolean f17819h;

    /* renamed from: i */
    private final ArrayList<n> f17820i;

    /* renamed from: j */
    private final int[] f17821j;

    /* renamed from: k */
    private boolean f17822k;

    /* renamed from: l */
    private final o f17823l;

    /* renamed from: m */
    private final o f17824m;

    /* renamed from: n */
    private int f17825n;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17826a;

        static {
            int[] iArr = new int[com.ijzerenhein.sharedelement.b.values().length];
            f17826a = iArr;
            try {
                iArr[com.ijzerenhein.sharedelement.b.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17826a[com.ijzerenhein.sharedelement.b.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17826a[com.ijzerenhein.sharedelement.b.FADE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17826a[com.ijzerenhein.sharedelement.b.FADE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        START(0),
        END(1);
        
        private final int value;

        b(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    public m(n0 n0Var, g gVar) {
        super(n0Var);
        this.f17813b = com.ijzerenhein.sharedelement.b.MOVE;
        this.f17814c = i.STRETCH;
        this.f17815d = com.ijzerenhein.sharedelement.a.CENTER_CENTER;
        this.f17816e = BitmapDescriptorFactory.HUE_RED;
        this.f17817f = false;
        this.f17818g = false;
        this.f17819h = false;
        ArrayList<n> arrayList = new ArrayList<>();
        this.f17820i = arrayList;
        this.f17821j = new int[2];
        this.f17822k = false;
        this.f17825n = -1;
        this.f17812a = gVar;
        arrayList.add(new n(gVar, "start"));
        arrayList.add(new n(gVar, "end"));
        o oVar = new o(n0Var);
        this.f17823l = oVar;
        addView(oVar);
        o oVar2 = new o(n0Var);
        this.f17824m = oVar2;
        addView(oVar2);
    }

    public static /* synthetic */ void a(m mVar, n nVar, Object[] objArr) {
        mVar.f(nVar, objArr);
    }

    public static /* synthetic */ void b(m mVar, n nVar, Object[] objArr) {
        mVar.g(nVar, objArr);
    }

    private void c(String str, n nVar, RectF rectF, RectF rectF2) {
        d.b bVar;
        ReactContext reactContext = (ReactContext) getContext();
        j h11 = nVar.h();
        c b11 = nVar.b();
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", com.facebook.react.uimanager.p.a(rectF.left - this.f17821j[0]));
        createMap.putDouble("y", com.facebook.react.uimanager.p.a(rectF.top - this.f17821j[1]));
        createMap.putDouble(Snapshot.WIDTH, com.facebook.react.uimanager.p.a(rectF.width()));
        createMap.putDouble(Snapshot.HEIGHT, com.facebook.react.uimanager.p.a(rectF.height()));
        createMap.putDouble("visibleX", com.facebook.react.uimanager.p.a(rectF2.left - this.f17821j[0]));
        createMap.putDouble("visibleY", com.facebook.react.uimanager.p.a(rectF2.top - this.f17821j[1]));
        createMap.putDouble("visibleWidth", com.facebook.react.uimanager.p.a(rectF2.width()));
        createMap.putDouble("visibleHeight", com.facebook.react.uimanager.p.a(rectF2.height()));
        createMap.putDouble("contentX", com.facebook.react.uimanager.p.a(rectF.left - this.f17821j[0]));
        createMap.putDouble("contentY", com.facebook.react.uimanager.p.a(rectF.top - this.f17821j[1]));
        createMap.putDouble("contentWidth", com.facebook.react.uimanager.p.a(rectF.width()));
        createMap.putDouble("contentHeight", com.facebook.react.uimanager.p.a(rectF.height()));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("borderTopLeftRadius", com.facebook.react.uimanager.p.a(h11.f17800h));
        createMap2.putDouble("borderTopRightRadius", com.facebook.react.uimanager.p.a(h11.f17801i));
        createMap2.putDouble("borderBottomLeftRadius", com.facebook.react.uimanager.p.a(h11.f17802j));
        createMap2.putDouble("borderBottomRightRadius", com.facebook.react.uimanager.p.a(h11.f17803k));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putString("node", str);
        createMap3.putMap("layout", createMap);
        if (b11 != null) {
            bVar = d.e(b11.f17749a, h11);
        } else {
            bVar = d.b.NONE;
        }
        createMap3.putString(CMSAttributeTableGenerator.CONTENT_TYPE, bVar.getValue());
        createMap3.putMap("style", createMap2);
        ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMeasureNode", createMap3);
    }

    private static RectF d(RectF rectF, RectF rectF2) {
        return new RectF(rectF2.left - rectF.left, rectF2.top - rectF.top, rectF.right - rectF2.right, rectF.bottom - rectF2.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.RectF e(android.graphics.RectF r6, android.graphics.RectF r7, android.graphics.RectF r8, android.graphics.RectF r9, android.graphics.RectF r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ijzerenhein.sharedelement.m.e(android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, float):android.graphics.RectF");
    }

    public /* synthetic */ void f(n nVar, Object[] objArr) {
        nVar.p((j) objArr[0]);
        k();
        l();
    }

    public /* synthetic */ void g(n nVar, Object[] objArr) {
        nVar.j((c) objArr[0]);
        k();
        l();
    }

    private void i(boolean z11) {
        if (this.f17818g || z11) {
            Iterator<n> it2 = this.f17820i.iterator();
            while (it2.hasNext()) {
                final n next = it2.next();
                if (next.f()) {
                    next.n(false);
                    next.g().r(new Callback() { // from class: com.ijzerenhein.sharedelement.k
                        {
                            m.this = this;
                        }

                        @Override // com.facebook.react.bridge.Callback
                        public final void invoke(Object[] objArr) {
                            m.a(m.this, next, objArr);
                        }
                    });
                }
                if (next.e()) {
                    next.m(false);
                    next.g().q(new Callback() { // from class: com.ijzerenhein.sharedelement.l
                        {
                            m.this = this;
                        }

                        @Override // com.facebook.react.bridge.Callback
                        public final void invoke(Object[] objArr) {
                            m.b(m.this, next, objArr);
                        }
                    });
                }
            }
        }
    }

    private void k() {
        j jVar;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        char c11;
        RectF rectF4;
        float f11;
        float f12;
        j jVar2;
        RectF rectF5;
        RectF rectF6;
        j jVar3;
        RectF rectF7;
        boolean z11;
        if (this.f17818g) {
            n nVar = this.f17820i.get(b.START.getValue());
            n nVar2 = this.f17820i.get(b.END.getValue());
            View view = (View) getParent();
            view.getLocationInWindow(this.f17821j);
            j h11 = nVar.h();
            j h12 = nVar2.h();
            if (h11 == null && h12 == null) {
                return;
            }
            c b11 = nVar.b();
            c b12 = nVar2.b();
            com.ijzerenhein.sharedelement.b bVar = this.f17813b;
            com.ijzerenhein.sharedelement.b bVar2 = com.ijzerenhein.sharedelement.b.MOVE;
            c cVar = (bVar == bVar2 && b11 == null && b12 != null) ? b12 : b11;
            if (this.f17825n < 0) {
                if (h11 != null && h12 == null) {
                    this.f17825n = nVar2.g() == null ? 1 : 0;
                } else if (h12 != null && h11 == null) {
                    this.f17825n = nVar.g() == null ? 0 : 1;
                } else if (h11 != null && h12 != null) {
                    this.f17825n = j.d(view, h12) > j.d(view, h11) ? 1 : 0;
                }
            }
            boolean z12 = this.f17825n == 1;
            RectF l11 = j.l(z12, h11, this.f17821j);
            Rect rect = h11 != null ? h11.f17794b : j.f17782p;
            boolean z13 = this.f17825n == 0;
            RectF l12 = j.l(z13, h12, this.f17821j);
            Rect rect2 = h12 != null ? h12.f17794b : j.f17782p;
            RectF k11 = j.k(z12, h11 != null ? nVar.a() : j.f17783q, h11, this.f17821j);
            RectF d11 = d(l11, k11);
            RectF k12 = j.k(z13, h12 != null ? nVar2.a() : j.f17783q, h12, this.f17821j);
            RectF d12 = d(l12, k12);
            if (h11 != null && h12 != null) {
                RectF f13 = j.f(l11, l12, this.f17816e);
                rectF2 = e(f13, d11, k11, d12, k12, this.f17816e);
                rectF = f13;
                jVar = j.g(h11, l11, h12, l12, this.f17816e);
            } else if (h11 != null) {
                jVar = h11;
                rectF = l11;
                rectF2 = d11;
            } else {
                if (!this.f17819h) {
                    this.f17816e = 1.0f;
                    this.f17819h = true;
                }
                jVar = h12;
                rectF = l12;
                rectF2 = d12;
            }
            if (rectF2.left <= BitmapDescriptorFactory.HUE_RED && rectF2.top <= BitmapDescriptorFactory.HUE_RED && rectF2.right <= BitmapDescriptorFactory.HUE_RED && rectF2.bottom <= BitmapDescriptorFactory.HUE_RED) {
                RectF rectF8 = new RectF(l11);
                rectF8.union(l12);
                this.f17822k = false;
                rectF3 = k12;
                rectF4 = rectF8;
                c11 = 1;
            } else {
                RectF rectF9 = new RectF(rectF);
                rectF3 = k12;
                rectF9.left += rectF2.left;
                rectF9.top += rectF2.top;
                rectF9.right -= rectF2.right;
                rectF9.bottom -= rectF2.bottom;
                c11 = 1;
                this.f17822k = true;
                rectF4 = rectF9;
            }
            int[] iArr = this.f17821j;
            super.layout(-iArr[0], -iArr[c11], (int) Math.ceil(rectF4.width() - this.f17821j[0]), (int) Math.ceil(rectF4.height() - this.f17821j[1]));
            setTranslationX(rectF4.left);
            setTranslationY(rectF4.top);
            int i11 = a.f17826a[this.f17813b.ordinal()];
            if (i11 == 1) {
                float f14 = jVar.f17799g;
                f11 = h11 == null ? f14 : BitmapDescriptorFactory.HUE_RED;
                f12 = f14;
            } else if (i11 == 2) {
                float f15 = h11 != null ? h11.f17799g : 1.0f;
                float f16 = this.f17816e;
                float f17 = f15 * (1.0f - f16);
                float f18 = (h12 != null ? h12.f17799g : 1.0f) * f16;
                f12 = f17;
                f11 = f18;
            } else if (i11 == 3) {
                f11 = (h12 != null ? h12.f17799g : 1.0f) * this.f17816e;
                f12 = BitmapDescriptorFactory.HUE_RED;
            } else if (i11 != 4) {
                f12 = 1.0f;
                f11 = 1.0f;
            } else {
                f12 = (1.0f - this.f17816e) * (h11 != null ? h11.f17799g : 1.0f);
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            com.ijzerenhein.sharedelement.b bVar3 = this.f17813b;
            com.ijzerenhein.sharedelement.b bVar4 = com.ijzerenhein.sharedelement.b.FADE_IN;
            if (bVar3 != bVar4) {
                jVar2 = jVar;
                rectF5 = rectF;
                this.f17823l.b(rectF, rectF4, l11, rect, cVar, jVar2, f12, this.f17814c, this.f17815d, this.f17816e);
            } else {
                jVar2 = jVar;
                rectF5 = rectF;
            }
            com.ijzerenhein.sharedelement.b bVar5 = this.f17813b;
            if (bVar5 != com.ijzerenhein.sharedelement.b.FADE && bVar5 != bVar4 && (bVar5 != bVar2 || h11 != null)) {
                this.f17824m.a();
                jVar3 = h12;
                rectF7 = rectF3;
                rectF6 = l12;
            } else {
                rectF6 = l12;
                jVar3 = h12;
                rectF7 = rectF3;
                float f19 = f11;
                this.f17824m.b(rectF5, rectF4, rectF6, rect2, b12, jVar2, f19, this.f17814c, this.f17815d, this.f17816e);
                if (jVar2.f17807o > BitmapDescriptorFactory.HUE_RED && Build.VERSION.SDK_INT >= 28) {
                    this.f17823l.setOutlineAmbientShadowColor(Color.argb(f12, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED));
                    this.f17823l.setOutlineSpotShadowColor(Color.argb(f12, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED));
                    this.f17824m.setOutlineAmbientShadowColor(Color.argb(f19, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED));
                    this.f17824m.setOutlineSpotShadowColor(Color.argb(f19, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED));
                }
            }
            if (h11 == null || nVar.c()) {
                z11 = true;
            } else {
                z11 = true;
                nVar.k(true);
                c("startNode", nVar, l11, k11);
            }
            if (jVar3 == null || nVar2.c()) {
                return;
            }
            nVar2.k(z11);
            c("endNode", nVar2, rectF6, rectF7);
        }
    }

    private void l() {
        Iterator<n> it2 = this.f17820i.iterator();
        while (it2.hasNext()) {
            n next = it2.next();
            boolean z11 = false;
            boolean z12 = (!this.f17818g || next.h() == null || next.b() == null) ? false : true;
            if (z12 && this.f17813b == com.ijzerenhein.sharedelement.b.FADE_IN && next.d().equals("start")) {
                z12 = false;
            }
            if (!z12 || this.f17813b != com.ijzerenhein.sharedelement.b.FADE_OUT || !next.d().equals("end")) {
                z11 = z12;
            }
            next.l(z11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f17822k) {
            canvas.clipRect(0, 0, getWidth(), getHeight());
        }
        super.dispatchDraw(canvas);
    }

    public g getNodeManager() {
        return this.f17812a;
    }

    public void h() {
        Iterator<n> it2 = this.f17820i.iterator();
        while (it2.hasNext()) {
            it2.next().o(null);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void j(b bVar, f fVar) {
        this.f17820i.get(bVar.getValue()).o(fVar);
        i(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f17817f) {
            return;
        }
        this.f17817f = true;
        i(true);
        this.f17818g = true;
        k();
        l();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void setAlign(com.ijzerenhein.sharedelement.a aVar) {
        if (this.f17815d != aVar) {
            this.f17815d = aVar;
            k();
        }
    }

    public void setAnimation(com.ijzerenhein.sharedelement.b bVar) {
        if (this.f17813b != bVar) {
            this.f17813b = bVar;
            k();
        }
    }

    public void setNodePosition(float f11) {
        if (this.f17816e != f11) {
            this.f17816e = f11;
            this.f17819h = true;
            k();
        }
    }

    public void setResize(i iVar) {
        if (this.f17814c != iVar) {
            this.f17814c = iVar;
            k();
        }
    }
}