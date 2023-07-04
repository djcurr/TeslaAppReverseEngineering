package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: x  reason: collision with root package name */
    private static final int f12683x;

    /* renamed from: y  reason: collision with root package name */
    private static final int f12684y;

    /* renamed from: z  reason: collision with root package name */
    private static final int f12685z;

    /* renamed from: d  reason: collision with root package name */
    protected int f12689d;

    /* renamed from: f  reason: collision with root package name */
    protected int f12691f;

    /* renamed from: a  reason: collision with root package name */
    protected float f12686a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f12687b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f12688c = true;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f12690e = false;

    /* renamed from: g  reason: collision with root package name */
    protected int f12692g = -1;

    /* renamed from: h  reason: collision with root package name */
    protected float f12693h = -1.0f;

    /* renamed from: i  reason: collision with root package name */
    protected float f12694i = -1.0f;

    /* renamed from: j  reason: collision with root package name */
    protected float f12695j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    protected e0 f12696k = e0.NONE;

    /* renamed from: l  reason: collision with root package name */
    protected float f12697l = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: m  reason: collision with root package name */
    protected float f12698m = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: n  reason: collision with root package name */
    protected float f12699n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    protected int f12700o = 1426063360;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f12701p = false;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f12702q = false;

    /* renamed from: r  reason: collision with root package name */
    protected s.d f12703r = null;

    /* renamed from: s  reason: collision with root package name */
    protected int f12704s = -1;

    /* renamed from: t  reason: collision with root package name */
    protected int f12705t = -1;

    /* renamed from: u  reason: collision with root package name */
    protected String f12706u = null;

    /* renamed from: v  reason: collision with root package name */
    protected String f12707v = null;

    /* renamed from: w  reason: collision with root package name */
    protected float f12708w = Float.NaN;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f12683x = 0;
        f12684y = i11 < 23 ? 0 : 1;
        f12685z = 0;
    }

    private y() {
    }

    private void A(float f11) {
        this.f12695j = f11;
    }

    private void B(float f11) {
        float c11;
        this.f12694i = f11;
        if (f11 == -1.0f) {
            this.f12686a = Float.NaN;
            return;
        }
        if (this.f12688c) {
            c11 = com.facebook.react.uimanager.p.e(f11);
        } else {
            c11 = com.facebook.react.uimanager.p.c(f11);
        }
        this.f12686a = c11;
    }

    private void C(int i11) {
    }

    private void D(String str) {
        String[] split;
        this.f12701p = false;
        this.f12702q = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f12701p = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f12702q = true;
                }
            }
        }
    }

    private void E(int i11) {
        if (i11 != this.f12700o) {
            this.f12700o = i11;
        }
    }

    private void F(ReadableMap readableMap) {
        this.f12697l = BitmapDescriptorFactory.HUE_RED;
        this.f12698m = BitmapDescriptorFactory.HUE_RED;
        if (readableMap != null) {
            if (readableMap.hasKey(Snapshot.WIDTH) && !readableMap.isNull(Snapshot.WIDTH)) {
                this.f12697l = com.facebook.react.uimanager.p.b(readableMap.getDouble(Snapshot.WIDTH));
            }
            if (!readableMap.hasKey(Snapshot.HEIGHT) || readableMap.isNull(Snapshot.HEIGHT)) {
                return;
            }
            this.f12698m = com.facebook.react.uimanager.p.b(readableMap.getDouble(Snapshot.HEIGHT));
        }
    }

    private void G(float f11) {
        if (f11 != this.f12699n) {
            this.f12699n = f11;
        }
    }

    private void H(String str) {
        if (str != null && !PermissionsResponse.SCOPE_NONE.equals(str)) {
            if ("uppercase".equals(str)) {
                this.f12696k = e0.UPPERCASE;
                return;
            } else if ("lowercase".equals(str)) {
                this.f12696k = e0.LOWERCASE;
                return;
            } else if ("capitalize".equals(str)) {
                this.f12696k = e0.CAPITALIZE;
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
            }
        }
        this.f12696k = e0.NONE;
    }

    public static y a(com.facebook.react.uimanager.e0 e0Var) {
        y yVar = new y();
        yVar.C(h(e0Var, "numberOfLines", -1));
        yVar.B(f(e0Var, "lineHeight", -1.0f));
        yVar.A(f(e0Var, "letterSpacing", Float.NaN));
        yVar.p(d(e0Var, "allowFontScaling", true));
        yVar.t(f(e0Var, "fontSize", -1.0f));
        yVar.r(e0Var.g("color") ? Integer.valueOf(e0Var.d("color", 0)) : null);
        yVar.r(e0Var.g("foregroundColor") ? Integer.valueOf(e0Var.d("foregroundColor", 0)) : null);
        yVar.q(e0Var.g("backgroundColor") ? Integer.valueOf(e0Var.d("backgroundColor", 0)) : null);
        yVar.s(l(e0Var, "fontFamily"));
        yVar.x(l(e0Var, "fontWeight"));
        yVar.u(l(e0Var, "fontStyle"));
        yVar.v(c(e0Var, "fontVariant"));
        yVar.y(d(e0Var, "includeFontPadding", true));
        yVar.D(l(e0Var, "textDecorationLine"));
        yVar.F(e0Var.g("textShadowOffset") ? e0Var.e("textShadowOffset") : null);
        yVar.G(h(e0Var, "textShadowRadius", 1));
        yVar.E(h(e0Var, "textShadowColor", 1426063360));
        yVar.H(l(e0Var, "textTransform"));
        yVar.z(l(e0Var, "layoutDirection"));
        yVar.o(l(e0Var, "accessibilityRole"));
        return yVar;
    }

    public static y b(ReadableMapBuffer readableMapBuffer) {
        y yVar = new y();
        Iterator<ReadableMapBuffer.c> it2 = readableMapBuffer.iterator();
        while (it2.hasNext()) {
            ReadableMapBuffer.c next = it2.next();
            int e11 = next.e();
            if (e11 == 0) {
                yVar.r(Integer.valueOf(next.d()));
            } else if (e11 == 1) {
                yVar.q(Integer.valueOf(next.d()));
            } else if (e11 == 3) {
                yVar.s(next.g());
            } else if (e11 == 4) {
                yVar.t((float) next.c());
            } else if (e11 == 15) {
                yVar.D(next.g());
            } else if (e11 == 18) {
                yVar.G(next.d());
            } else if (e11 == 19) {
                yVar.E(next.d());
            } else if (e11 == 21) {
                yVar.z(next.g());
            } else if (e11 != 22) {
                switch (e11) {
                    case 6:
                        yVar.x(next.g());
                        continue;
                    case 7:
                        yVar.u(next.g());
                        continue;
                    case 8:
                        yVar.w(next.f());
                        continue;
                    case 9:
                        yVar.p(next.b());
                        continue;
                    case 10:
                        yVar.A((float) next.c());
                        continue;
                    case 11:
                        yVar.B((float) next.c());
                        continue;
                }
            } else {
                yVar.o(next.g());
            }
        }
        return yVar;
    }

    private static ReadableArray c(com.facebook.react.uimanager.e0 e0Var, String str) {
        if (e0Var.g(str)) {
            return e0Var.a(str);
        }
        return null;
    }

    private static boolean d(com.facebook.react.uimanager.e0 e0Var, String str, boolean z11) {
        return e0Var.g(str) ? e0Var.b(str, z11) : z11;
    }

    private static float f(com.facebook.react.uimanager.e0 e0Var, String str, float f11) {
        return e0Var.g(str) ? e0Var.c(str, f11) : f11;
    }

    public static int g(String str) {
        int i11 = f12685z;
        if (str != null) {
            if (str.equals("normal")) {
                return 1;
            }
            return !str.equals(PermissionsResponse.SCOPE_NONE) ? 2 : 0;
        }
        return i11;
    }

    private static int h(com.facebook.react.uimanager.e0 e0Var, String str, int i11) {
        return e0Var.g(str) ? e0Var.d(str, i11) : i11;
    }

    public static int i(com.facebook.react.uimanager.e0 e0Var) {
        if (!"justify".equals(e0Var.g("textAlign") ? e0Var.f("textAlign") : null) || Build.VERSION.SDK_INT < 26) {
            return f12683x;
        }
        return 1;
    }

    public static int j(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        throw new JSApplicationIllegalArgumentException("Invalid layoutDirection: " + str);
    }

    private static String l(com.facebook.react.uimanager.e0 e0Var, String str) {
        if (e0Var.g(str)) {
            return e0Var.f(str);
        }
        return null;
    }

    public static int m(com.facebook.react.uimanager.e0 e0Var, boolean z11) {
        String f11 = e0Var.g("textAlign") ? e0Var.f("textAlign") : null;
        if ("justify".equals(f11)) {
            return 3;
        }
        if (f11 == null || "auto".equals(f11)) {
            return 0;
        }
        if ("left".equals(f11)) {
            if (!z11) {
                return 3;
            }
        } else if (!"right".equals(f11)) {
            if ("center".equals(f11)) {
                return 1;
            }
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + f11);
        } else if (z11) {
            return 3;
        }
        return 5;
    }

    public static int n(String str) {
        int i11 = f12684y;
        if (str != null) {
            if (str.equals("balanced")) {
                return 2;
            }
            return !str.equals("simple") ? 1 : 0;
        }
        return i11;
    }

    private void o(String str) {
        if (str != null) {
            this.f12703r = s.d.fromValue(str);
        }
    }

    private void p(boolean z11) {
        if (z11 != this.f12688c) {
            this.f12688c = z11;
            t(this.f12693h);
            B(this.f12694i);
            A(this.f12695j);
        }
    }

    private void q(Integer num) {
        boolean z11 = num != null;
        this.f12690e = z11;
        if (z11) {
            this.f12691f = num.intValue();
        }
    }

    private void r(Integer num) {
        boolean z11 = num != null;
        this.f12687b = z11;
        if (z11) {
            this.f12689d = num.intValue();
        }
    }

    private void s(String str) {
        this.f12706u = str;
    }

    private void t(float f11) {
        double ceil;
        this.f12693h = f11;
        if (f11 != -1.0f) {
            if (this.f12688c) {
                ceil = Math.ceil(com.facebook.react.uimanager.p.e(f11));
            } else {
                ceil = Math.ceil(com.facebook.react.uimanager.p.c(f11));
            }
            f11 = (float) ceil;
        }
        this.f12692g = (int) f11;
    }

    private void u(String str) {
        this.f12704s = u.b(str);
    }

    private void v(ReadableArray readableArray) {
        this.f12707v = u.c(readableArray);
    }

    private void w(ReadableMapBuffer readableMapBuffer) {
        if (readableMapBuffer != null && readableMapBuffer.getCount() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<ReadableMapBuffer.c> it2 = readableMapBuffer.iterator();
            while (it2.hasNext()) {
                String g11 = it2.next().g();
                if (g11 != null) {
                    char c11 = 65535;
                    switch (g11.hashCode()) {
                        case -1195362251:
                            if (g11.equals("proportional-nums")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case -1061392823:
                            if (g11.equals("lining-nums")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case -771984547:
                            if (g11.equals("tabular-nums")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case -659678800:
                            if (g11.equals("oldstyle-nums")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case 1183323111:
                            if (g11.equals("small-caps")) {
                                c11 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c11) {
                        case 0:
                            arrayList.add("'pnum'");
                            continue;
                        case 1:
                            arrayList.add("'lnum'");
                            continue;
                        case 2:
                            arrayList.add("'tnum'");
                            continue;
                        case 3:
                            arrayList.add("'onum'");
                            continue;
                        case 4:
                            arrayList.add("'smcp'");
                            continue;
                    }
                }
            }
            this.f12707v = TextUtils.join(", ", arrayList);
            return;
        }
        this.f12707v = null;
    }

    private void x(String str) {
        this.f12705t = u.d(str);
    }

    private void y(boolean z11) {
    }

    private void z(String str) {
        j(str);
    }

    public float e() {
        return !Float.isNaN(this.f12686a) && !Float.isNaN(this.f12708w) && (this.f12708w > this.f12686a ? 1 : (this.f12708w == this.f12686a ? 0 : -1)) > 0 ? this.f12708w : this.f12686a;
    }

    public float k() {
        float c11;
        if (this.f12688c) {
            c11 = com.facebook.react.uimanager.p.e(this.f12695j);
        } else {
            c11 = com.facebook.react.uimanager.p.c(this.f12695j);
        }
        int i11 = this.f12692g;
        if (i11 > 0) {
            return c11 / i11;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f12692g);
    }
}