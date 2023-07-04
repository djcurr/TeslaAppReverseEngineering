package com.swmansion.gesturehandler;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.GestureHandler;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.o;
import xr.h;
import xr.k;

/* loaded from: classes6.dex */
public class GestureHandler<ConcreteGestureHandlerT extends GestureHandler<ConcreteGestureHandlerT>> {
    public static final a H = new a(null);
    private static MotionEvent.PointerProperties[] I;
    private static MotionEvent.PointerCoords[] J;
    private static short K;
    private xr.f A;
    private k B;
    private xr.d C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;

    /* renamed from: a */
    private final int[] f21099a = new int[12];

    /* renamed from: b */
    private int f21100b;

    /* renamed from: c */
    private final int[] f21101c;

    /* renamed from: d */
    private int f21102d;

    /* renamed from: e */
    private View f21103e;

    /* renamed from: f */
    private int f21104f;

    /* renamed from: g */
    private float f21105g;

    /* renamed from: h */
    private float f21106h;

    /* renamed from: i */
    private boolean f21107i;

    /* renamed from: j */
    private boolean f21108j;

    /* renamed from: k */
    private boolean f21109k;

    /* renamed from: l */
    private WritableArray f21110l;

    /* renamed from: m */
    private WritableArray f21111m;

    /* renamed from: n */
    private int f21112n;

    /* renamed from: o */
    private int f21113o;

    /* renamed from: p */
    private final b[] f21114p;

    /* renamed from: q */
    private boolean f21115q;

    /* renamed from: r */
    private float[] f21116r;

    /* renamed from: s */
    private short f21117s;

    /* renamed from: t */
    private float f21118t;

    /* renamed from: u */
    private float f21119u;

    /* renamed from: v */
    private boolean f21120v;

    /* renamed from: w */
    private float f21121w;

    /* renamed from: x */
    private float f21122x;

    /* renamed from: y */
    private boolean f21123y;

    /* renamed from: z */
    private int f21124z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/swmansion/gesturehandler/GestureHandler$AdaptEventException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/swmansion/gesturehandler/GestureHandler;", "handler", "Landroid/view/MotionEvent;", "event", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "e", "<init>", "(Lcom/swmansion/gesturehandler/GestureHandler;Landroid/view/MotionEvent;Ljava/lang/IllegalArgumentException;)V", "react-native-gesture-handler_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class AdaptEventException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public AdaptEventException(com.swmansion.gesturehandler.GestureHandler<?> r12, android.view.MotionEvent r13, java.lang.IllegalArgumentException r14) {
            /*
                r11 = this;
                java.lang.String r0 = "handler"
                kotlin.jvm.internal.s.g(r12, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.s.g(r13, r0)
                java.lang.String r0 = "e"
                kotlin.jvm.internal.s.g(r14, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n    handler: "
                r0.append(r1)
                java.lang.Class r1 = r12.getClass()
                n00.d r1 = kotlin.jvm.internal.m0.b(r1)
                java.lang.String r1 = r1.o()
                r0.append(r1)
                java.lang.String r1 = "\n    state: "
                r0.append(r1)
                int r1 = r12.M()
                r0.append(r1)
                java.lang.String r1 = "\n    view: "
                r0.append(r1)
                android.view.View r1 = r12.R()
                r0.append(r1)
                java.lang.String r1 = "\n    orchestrator: "
                r0.append(r1)
                xr.f r1 = com.swmansion.gesturehandler.GestureHandler.b(r12)
                r0.append(r1)
                java.lang.String r1 = "\n    isEnabled: "
                r0.append(r1)
                boolean r1 = r12.X()
                r0.append(r1)
                java.lang.String r1 = "\n    isActive: "
                r0.append(r1)
                boolean r1 = r12.V()
                r0.append(r1)
                java.lang.String r1 = "\n    isAwaiting: "
                r0.append(r1)
                boolean r1 = r12.W()
                r0.append(r1)
                java.lang.String r1 = "\n    trackedPointersCount: "
                r0.append(r1)
                int r1 = r12.P()
                r0.append(r1)
                java.lang.String r1 = "\n    trackedPointers: "
                r0.append(r1)
                int[] r2 = com.swmansion.gesturehandler.GestureHandler.e(r12)
                java.lang.String r3 = ", "
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 62
                r10 = 0
                java.lang.String r12 = wz.l.X(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.append(r12)
                java.lang.String r12 = "\n    while handling event: "
                r0.append(r12)
                r0.append(r13)
                java.lang.String r12 = "\n  "
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                java.lang.String r12 = kotlin.text.m.f(r12)
                r11.<init>(r12, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.GestureHandler.AdaptEventException.<init>(com.swmansion.gesturehandler.GestureHandler, android.view.MotionEvent, java.lang.IllegalArgumentException):void");
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean c(float f11) {
            return !Float.isNaN(f11);
        }

        public final void d(int i11) {
            if (GestureHandler.I == null) {
                GestureHandler.I = new MotionEvent.PointerProperties[12];
                GestureHandler.J = new MotionEvent.PointerCoords[12];
            }
            while (i11 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = GestureHandler.I;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    s.x("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i12 = i11 - 1;
                if (pointerPropertiesArr[i12] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = GestureHandler.I;
                if (pointerPropertiesArr2 == null) {
                    s.x("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i12] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = GestureHandler.J;
                if (pointerCoordsArr2 == null) {
                    s.x("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
                i11--;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a */
        private final int f21125a;

        /* renamed from: b */
        private float f21126b;

        /* renamed from: c */
        private float f21127c;

        /* renamed from: d */
        private float f21128d;

        /* renamed from: e */
        private float f21129e;

        public b(int i11, float f11, float f12, float f13, float f14) {
            this.f21125a = i11;
            this.f21126b = f11;
            this.f21127c = f12;
            this.f21128d = f13;
            this.f21129e = f14;
        }

        public final float a() {
            return this.f21128d;
        }

        public final float b() {
            return this.f21129e;
        }

        public final int c() {
            return this.f21125a;
        }

        public final float d() {
            return this.f21126b;
        }

        public final float e() {
            return this.f21127c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f21125a == bVar.f21125a && s.c(Float.valueOf(this.f21126b), Float.valueOf(bVar.f21126b)) && s.c(Float.valueOf(this.f21127c), Float.valueOf(bVar.f21127c)) && s.c(Float.valueOf(this.f21128d), Float.valueOf(bVar.f21128d)) && s.c(Float.valueOf(this.f21129e), Float.valueOf(bVar.f21129e));
            }
            return false;
        }

        public final void f(float f11) {
            this.f21128d = f11;
        }

        public final void g(float f11) {
            this.f21129e = f11;
        }

        public final void h(float f11) {
            this.f21126b = f11;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f21125a) * 31) + Float.hashCode(this.f21126b)) * 31) + Float.hashCode(this.f21127c)) * 31) + Float.hashCode(this.f21128d)) * 31) + Float.hashCode(this.f21129e);
        }

        public final void i(float f11) {
            this.f21127c = f11;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f21125a + ", x=" + this.f21126b + ", y=" + this.f21127c + ", absoluteX=" + this.f21128d + ", absoluteY=" + this.f21129e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public GestureHandler() {
        int[] iArr = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr[i11] = 0;
        }
        this.f21101c = iArr;
        this.f21108j = true;
        b[] bVarArr = new b[12];
        for (int i12 = 0; i12 < 12; i12++) {
            bVarArr[i12] = null;
        }
        this.f21114p = bVarArr;
    }

    private final void A() {
        this.f21111m = null;
        b[] bVarArr = this.f21114p;
        int length = bVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            b bVar = bVarArr[i11];
            i11++;
            if (bVar != null) {
                m(bVar);
            }
        }
    }

    private final int C() {
        int[] iArr;
        int i11 = 0;
        while (i11 < this.f21100b) {
            int i12 = 0;
            while (true) {
                iArr = this.f21099a;
                if (i12 >= iArr.length || iArr[i12] == i11) {
                    break;
                }
                i12++;
            }
            if (i12 == iArr.length) {
                return i11;
            }
            i11++;
        }
        return i11;
    }

    private final Window S(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow();
        }
        if (context instanceof ContextWrapper) {
            return S(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static /* synthetic */ void a(GestureHandler gestureHandler) {
        p0(gestureHandler);
    }

    private final void a0(int i11) {
        UiThreadUtil.assertOnUiThread();
        if (this.f21104f == i11) {
            return;
        }
        if (this.f21113o > 0 && (i11 == 5 || i11 == 3 || i11 == 1)) {
            p();
        }
        int i12 = this.f21104f;
        this.f21104f = i11;
        if (i11 == 4) {
            short s11 = K;
            K = (short) (s11 + 1);
            this.f21117s = s11;
        }
        xr.f fVar = this.A;
        s.e(fVar);
        fVar.u(this, i11, i12);
        f0(i11, i12);
    }

    private final boolean b0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f21100b) {
            return true;
        }
        int length = this.f21099a.length - 1;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                int i13 = this.f21099a[i11];
                if (i13 != -1 && i13 != i11) {
                    return true;
                }
                if (i12 > length) {
                    break;
                }
                i11 = i12;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b4 A[EDGE_INSN: B:171:0x00b4->B:131:0x00b4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.MotionEvent$PointerProperties[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.MotionEvent k(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.GestureHandler.k(android.view.MotionEvent):android.view.MotionEvent");
    }

    private final void l(b bVar) {
        if (this.f21110l == null) {
            this.f21110l = Arguments.createArray();
        }
        WritableArray writableArray = this.f21110l;
        s.e(writableArray);
        writableArray.pushMap(s(bVar));
    }

    private final void m(b bVar) {
        if (this.f21111m == null) {
            this.f21111m = Arguments.createArray();
        }
        WritableArray writableArray = this.f21111m;
        s.e(writableArray);
        writableArray.pushMap(s(bVar));
    }

    private final void p() {
        this.f21112n = 4;
        this.f21110l = null;
        A();
        b[] bVarArr = this.f21114p;
        int length = bVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            b bVar = bVarArr[i11];
            i11++;
            if (bVar != null) {
                l(bVar);
            }
        }
        this.f21113o = 0;
        o.v(this.f21114p, null, 0, 0, 6, null);
        w();
    }

    public static final void p0(GestureHandler this_applySelf) {
        s.g(this_applySelf, "$this_applySelf");
        this_applySelf.o();
    }

    private final WritableMap s(b bVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", bVar.c());
        createMap.putDouble("x", p.a(bVar.d()));
        createMap.putDouble("y", p.a(bVar.e()));
        createMap.putDouble("absoluteX", p.a(bVar.a()));
        createMap.putDouble("absoluteY", p.a(bVar.b()));
        return createMap;
    }

    private final void v(MotionEvent motionEvent) {
        this.f21110l = null;
        this.f21112n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f21114p[pointerId] = new b(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - this.f21101c[0], (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - this.f21101c[1]);
        this.f21113o++;
        b bVar = this.f21114p[pointerId];
        s.e(bVar);
        l(bVar);
        A();
        w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x004f, code lost:
        if ((r7.e() == r12.getY(r4)) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 0
            r11.f21110l = r0
            r0 = 2
            r11.f21112n = r0
            float r0 = r12.getRawX()
            float r1 = r12.getX()
            float r0 = r0 - r1
            float r1 = r12.getRawY()
            float r2 = r12.getY()
            float r1 = r1 - r2
            int r2 = r12.getPointerCount()
            r3 = 0
            if (r2 <= 0) goto L86
            r4 = r3
            r5 = r4
        L21:
            int r6 = r4 + 1
            int r7 = r12.getPointerId(r4)
            com.swmansion.gesturehandler.GestureHandler$b[] r8 = r11.f21114p
            r7 = r8[r7]
            if (r7 != 0) goto L2e
            goto L80
        L2e:
            float r8 = r7.d()
            float r9 = r12.getX(r4)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            r9 = 1
            if (r8 != 0) goto L3d
            r8 = r9
            goto L3e
        L3d:
            r8 = r3
        L3e:
            if (r8 == 0) goto L51
            float r8 = r7.e()
            float r10 = r12.getY(r4)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L4e
            r8 = r9
            goto L4f
        L4e:
            r8 = r3
        L4f:
            if (r8 != 0) goto L80
        L51:
            float r8 = r12.getX(r4)
            r7.h(r8)
            float r8 = r12.getY(r4)
            r7.i(r8)
            float r8 = r12.getX(r4)
            float r8 = r8 + r0
            int[] r10 = r11.f21101c
            r10 = r10[r3]
            float r10 = (float) r10
            float r8 = r8 - r10
            r7.f(r8)
            float r4 = r12.getY(r4)
            float r4 = r4 + r1
            int[] r8 = r11.f21101c
            r8 = r8[r9]
            float r8 = (float) r8
            float r4 = r4 - r8
            r7.g(r4)
            r11.l(r7)
            int r5 = r5 + 1
        L80:
            if (r6 < r2) goto L84
            r3 = r5
            goto L86
        L84:
            r4 = r6
            goto L21
        L86:
            if (r3 <= 0) goto L8e
            r11.A()
            r11.w()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.GestureHandler.x(android.view.MotionEvent):void");
    }

    private final void y(MotionEvent motionEvent) {
        A();
        this.f21110l = null;
        this.f21112n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f21114p[pointerId] = new b(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - this.f21101c[0], (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - this.f21101c[1]);
        b bVar = this.f21114p[pointerId];
        s.e(bVar);
        l(bVar);
        this.f21114p[pointerId] = null;
        this.f21113o--;
        w();
    }

    public boolean A0(GestureHandler<?> handler) {
        s.g(handler, "handler");
        if (handler == this) {
            return true;
        }
        xr.d dVar = this.C;
        if (dVar == null) {
            return false;
        }
        return dVar.b(this, handler);
    }

    public final void B() {
        int i11 = this.f21104f;
        if (i11 == 4 || i11 == 0 || i11 == 2) {
            a0(1);
        }
    }

    public boolean B0(GestureHandler<?> handler) {
        xr.d dVar;
        s.g(handler, "handler");
        if (handler == this || (dVar = this.C) == null) {
            return false;
        }
        return dVar.c(this, handler);
    }

    public final boolean C0(GestureHandler<?> handler) {
        xr.d dVar;
        s.g(handler, "handler");
        if (handler == this || (dVar = this.C) == null) {
            return false;
        }
        return dVar.d(this, handler);
    }

    public final int D() {
        return this.D;
    }

    public final void D0(int i11) {
        int[] iArr = this.f21099a;
        if (iArr[i11] == -1) {
            iArr[i11] = C();
            this.f21100b++;
        }
    }

    public final short E() {
        return this.f21117s;
    }

    public final void E0(int i11) {
        int[] iArr = this.f21099a;
        if (iArr[i11] != -1) {
            iArr[i11] = -1;
            this.f21100b--;
        }
    }

    public final float F() {
        return this.f21118t - this.f21101c[0];
    }

    public final void F0(MotionEvent event) {
        s.g(event, "event");
        if (event.getActionMasked() != 0 && event.getActionMasked() != 5) {
            if (event.getActionMasked() != 1 && event.getActionMasked() != 6) {
                if (event.getActionMasked() == 2) {
                    x(event);
                    return;
                }
                return;
            }
            x(event);
            y(event);
            return;
        }
        v(event);
        x(event);
    }

    public final float G() {
        return this.f21119u - this.f21101c[1];
    }

    public final boolean G0() {
        int i11;
        return (!this.f21108j || (i11 = this.f21104f) == 1 || i11 == 3 || i11 == 5 || this.f21100b <= 0) ? false : true;
    }

    public final float H() {
        return this.f21118t - this.f21121w;
    }

    public final float I() {
        return this.f21119u - this.f21122x;
    }

    public final boolean J() {
        return this.f21115q;
    }

    public final int K() {
        return this.f21124z;
    }

    public final boolean L() {
        return this.G;
    }

    public final int M() {
        return this.f21104f;
    }

    public final int N() {
        return this.f21102d;
    }

    public final int O() {
        return this.f21112n;
    }

    public final int P() {
        return this.f21113o;
    }

    public final boolean Q() {
        return this.f21109k;
    }

    public final View R() {
        return this.f21103e;
    }

    public final void T(MotionEvent origEvent) {
        int i11;
        s.g(origEvent, "origEvent");
        if (!this.f21108j || (i11 = this.f21104f) == 3 || i11 == 1 || i11 == 5 || this.f21100b < 1) {
            return;
        }
        MotionEvent k11 = k(origEvent);
        this.f21105g = k11.getX();
        this.f21106h = k11.getY();
        this.f21124z = k11.getPointerCount();
        boolean Z = Z(this.f21103e, this.f21105g, this.f21106h);
        this.f21107i = Z;
        if (this.f21123y && !Z) {
            int i12 = this.f21104f;
            if (i12 == 4) {
                o();
                return;
            } else if (i12 == 2) {
                B();
                return;
            } else {
                return;
            }
        }
        h hVar = h.f57674a;
        this.f21118t = hVar.a(k11, true);
        this.f21119u = hVar.b(k11, true);
        this.f21121w = k11.getRawX() - k11.getX();
        this.f21122x = k11.getRawY() - k11.getY();
        d0(k11);
        if (s.c(k11, origEvent)) {
            return;
        }
        k11.recycle();
    }

    public final boolean U(GestureHandler<?> other) {
        s.g(other, "other");
        int length = this.f21099a.length - 1;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (this.f21099a[i11] != -1 && other.f21099a[i11] != -1) {
                    return true;
                }
                if (i12 > length) {
                    break;
                }
                i11 = i12;
            }
        }
        return false;
    }

    public final boolean V() {
        return this.E;
    }

    public final boolean W() {
        return this.F;
    }

    public final boolean X() {
        return this.f21108j;
    }

    public final boolean Y() {
        return this.f21107i;
    }

    public final boolean Z(View view, float f11, float f12) {
        float f13;
        s.e(view);
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f21116r;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        if (fArr != null) {
            s.e(fArr);
            float f15 = fArr[0];
            float[] fArr2 = this.f21116r;
            s.e(fArr2);
            float f16 = fArr2[1];
            float[] fArr3 = this.f21116r;
            s.e(fArr3);
            float f17 = fArr3[2];
            float[] fArr4 = this.f21116r;
            s.e(fArr4);
            float f18 = fArr4[3];
            a aVar = H;
            float f19 = aVar.c(f15) ? BitmapDescriptorFactory.HUE_RED - f15 : 0.0f;
            if (aVar.c(f16)) {
                f14 = BitmapDescriptorFactory.HUE_RED - f16;
            }
            if (aVar.c(f17)) {
                width += f17;
            }
            if (aVar.c(f18)) {
                height += f18;
            }
            float[] fArr5 = this.f21116r;
            s.e(fArr5);
            float f21 = fArr5[4];
            float[] fArr6 = this.f21116r;
            s.e(fArr6);
            float f22 = fArr6[5];
            if (aVar.c(f21)) {
                if (!aVar.c(f15)) {
                    f19 = width - f21;
                } else if (!aVar.c(f17)) {
                    width = f21 + f19;
                }
            }
            if (aVar.c(f22)) {
                if (!aVar.c(f16)) {
                    f14 = height - f22;
                } else if (!aVar.c(f18)) {
                    height = f14 + f22;
                }
            }
            f13 = f14;
            f14 = f19;
        } else {
            f13 = 0.0f;
        }
        if (f14 <= f11 && f11 <= width) {
            if (f13 <= f12 && f12 <= height) {
                return true;
            }
        }
        return false;
    }

    protected void c0() {
    }

    protected void d0(MotionEvent event) {
        s.g(event, "event");
        a0(1);
    }

    protected void e0() {
    }

    protected void f0(int i11, int i12) {
    }

    public final void g0(View view, xr.f fVar) {
        if (this.f21103e == null && this.A == null) {
            Arrays.fill(this.f21099a, -1);
            this.f21100b = 0;
            this.f21104f = 0;
            this.f21103e = view;
            this.A = fVar;
            Window S = S(view == null ? null : view.getContext());
            View decorView = S != null ? S.getDecorView() : null;
            if (decorView != null) {
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                int[] iArr = this.f21101c;
                iArr[0] = rect.left;
                iArr[1] = rect.top;
                return;
            }
            int[] iArr2 = this.f21101c;
            iArr2[0] = 0;
            iArr2[1] = 0;
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset".toString());
    }

    public final void h0() {
        this.f21103e = null;
        this.A = null;
        Arrays.fill(this.f21099a, -1);
        this.f21100b = 0;
        this.f21113o = 0;
        o.v(this.f21114p, null, 0, 0, 6, null);
        this.f21112n = 0;
        e0();
    }

    public final void i() {
        j(false);
    }

    public void i0() {
        this.f21115q = false;
        this.f21120v = false;
        this.f21123y = false;
        this.f21108j = true;
        this.f21116r = null;
    }

    public void j(boolean z11) {
        if (!this.f21120v || z11) {
            int i11 = this.f21104f;
            if (i11 == 0 || i11 == 2) {
                a0(4);
            }
        }
    }

    public void j0() {
    }

    public final ConcreteGestureHandlerT k0() {
        return this;
    }

    public final void l0(int i11) {
        this.D = i11;
    }

    public final void m0(boolean z11) {
        this.E = z11;
    }

    public final void n() {
        if (this.f21104f == 0) {
            a0(2);
        }
    }

    public final void n0(boolean z11) {
        this.F = z11;
    }

    public final void o() {
        int i11 = this.f21104f;
        if (i11 == 4 || i11 == 0 || i11 == 2) {
            c0();
            a0(3);
        }
    }

    public final ConcreteGestureHandlerT o0(boolean z11) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) k0();
        if (concretegesturehandlert.R() != null && concretegesturehandlert.X() != z11) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: xr.c
                {
                    GestureHandler.this = concretegesturehandlert;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GestureHandler.a(GestureHandler.this);
                }
            });
        }
        concretegesturehandlert.f21108j = z11;
        return concretegesturehandlert;
    }

    public final WritableArray q() {
        WritableArray writableArray = this.f21111m;
        this.f21111m = null;
        return writableArray;
    }

    public final ConcreteGestureHandlerT q0(float f11, float f12, float f13, float f14, float f15, float f16) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) k0();
        if (concretegesturehandlert.f21116r == null) {
            concretegesturehandlert.f21116r = new float[6];
        }
        float[] fArr = concretegesturehandlert.f21116r;
        s.e(fArr);
        boolean z11 = false;
        fArr[0] = f11;
        float[] fArr2 = concretegesturehandlert.f21116r;
        s.e(fArr2);
        fArr2[1] = f12;
        float[] fArr3 = concretegesturehandlert.f21116r;
        s.e(fArr3);
        fArr3[2] = f13;
        float[] fArr4 = concretegesturehandlert.f21116r;
        s.e(fArr4);
        fArr4[3] = f14;
        float[] fArr5 = concretegesturehandlert.f21116r;
        s.e(fArr5);
        fArr5[4] = f15;
        float[] fArr6 = concretegesturehandlert.f21116r;
        s.e(fArr6);
        fArr6[5] = f16;
        a aVar = H;
        if ((aVar.c(f15) && aVar.c(f11) && aVar.c(f13)) ? false : true) {
            if (!aVar.c(f15) || aVar.c(f11) || aVar.c(f13)) {
                if ((aVar.c(f16) && aVar.c(f14) && aVar.c(f12)) ? false : true) {
                    if (!aVar.c(f16) || aVar.c(f14) || aVar.c(f12)) {
                        z11 = true;
                    }
                    if (z11) {
                        return concretegesturehandlert;
                    }
                    throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined".toString());
                }
                throw new IllegalArgumentException("Cannot have all of top, bottom and height defined".toString());
            }
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined".toString());
        }
        throw new IllegalArgumentException("Cannot have all of left, right and width defined".toString());
    }

    public final WritableArray r() {
        WritableArray writableArray = this.f21110l;
        this.f21110l = null;
        return writableArray;
    }

    public final ConcreteGestureHandlerT r0(xr.d dVar) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) k0();
        concretegesturehandlert.C = dVar;
        return concretegesturehandlert;
    }

    public final ConcreteGestureHandlerT s0(boolean z11) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) k0();
        concretegesturehandlert.f21120v = z11;
        return concretegesturehandlert;
    }

    public void t(MotionEvent event) {
        s.g(event, "event");
        k kVar = this.B;
        if (kVar == null) {
            return;
        }
        kVar.c(k0(), event);
    }

    public final void t0(boolean z11) {
        this.f21115q = z11;
    }

    public String toString() {
        String simpleName;
        View view = this.f21103e;
        if (view == null) {
            simpleName = null;
        } else {
            s.e(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f21102d + "]:" + ((Object) simpleName);
    }

    public void u(int i11, int i12) {
        k kVar = this.B;
        if (kVar == null) {
            return;
        }
        kVar.a(k0(), i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GestureHandler<?> u0(k kVar) {
        this.B = kVar;
        return this;
    }

    public final ConcreteGestureHandlerT v0(boolean z11) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) k0();
        concretegesturehandlert.f21123y = z11;
        return concretegesturehandlert;
    }

    public void w() {
        k kVar;
        if (this.f21110l == null || (kVar = this.B) == null) {
            return;
        }
        kVar.b(k0());
    }

    public final void w0(boolean z11) {
        this.G = z11;
    }

    public final void x0(int i11) {
        this.f21102d = i11;
    }

    public final void y0(boolean z11) {
        this.f21109k = z11;
    }

    public final void z() {
        int i11 = this.f21104f;
        if (i11 == 2 || i11 == 4) {
            a0(5);
        }
    }

    public boolean z0(GestureHandler<?> handler) {
        xr.d dVar;
        s.g(handler, "handler");
        if (handler == this || (dVar = this.C) == null) {
            return false;
        }
        return dVar.a(this, handler);
    }
}