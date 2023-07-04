package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class h extends com.facebook.react.uimanager.i {
    protected z A;
    protected boolean B;
    protected int C;
    protected boolean D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected int I;
    protected int J;
    protected float K;
    protected float L;
    protected float M;
    protected int N;
    protected boolean O;
    protected boolean P;
    protected boolean Q;
    protected boolean R;
    protected float S;
    protected int T;
    protected int U;
    protected String V;
    protected String W;
    protected boolean X;
    protected Map<Integer, com.facebook.react.uimanager.c0> Y;

    /* renamed from: z  reason: collision with root package name */
    protected t f12633z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f12634a;

        /* renamed from: b  reason: collision with root package name */
        protected int f12635b;

        /* renamed from: c  reason: collision with root package name */
        protected m f12636c;

        a(int i11, int i12, m mVar) {
            this.f12634a = i11;
            this.f12635b = i12;
            this.f12636c = mVar;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i11) {
            int i12 = this.f12634a;
            spannableStringBuilder.setSpan(this.f12636c, i12, this.f12635b, ((i11 << 16) & 16711680) | ((i12 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    public h() {
        this(null);
    }

    private static void p1(h hVar, SpannableStringBuilder spannableStringBuilder, List<a> list, z zVar, boolean z11, Map<Integer, com.facebook.react.uimanager.c0> map, int i11) {
        z zVar2;
        float b02;
        float g11;
        if (zVar != null) {
            zVar2 = zVar.a(hVar.A);
        } else {
            zVar2 = hVar.A;
        }
        z zVar3 = zVar2;
        int b11 = hVar.b();
        for (int i12 = 0; i12 < b11; i12++) {
            com.facebook.react.uimanager.d0 a11 = hVar.a(i12);
            if (a11 instanceof l) {
                spannableStringBuilder.append((CharSequence) e0.apply(((l) a11).o1(), zVar3.l()));
            } else if (a11 instanceof h) {
                p1((h) a11, spannableStringBuilder, list, zVar3, z11, map, spannableStringBuilder.length());
            } else if (a11 instanceof p) {
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((p) a11).p1()));
            } else if (z11) {
                int L = a11.L();
                com.facebook.yoga.v q11 = a11.q();
                com.facebook.yoga.v J = a11.J();
                com.facebook.yoga.u uVar = q11.f12955b;
                com.facebook.yoga.u uVar2 = com.facebook.yoga.u.POINT;
                if (uVar == uVar2 && J.f12955b == uVar2) {
                    b02 = q11.f12954a;
                    g11 = J.f12954a;
                } else {
                    a11.N();
                    b02 = a11.b0();
                    g11 = a11.g();
                }
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new b0(L, (int) b02, (int) g11)));
                map.put(Integer.valueOf(L), a11);
                a11.c();
            } else {
                throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + a11.getClass());
            }
            a11.c();
        }
        int length = spannableStringBuilder.length();
        if (length >= i11) {
            if (hVar.B) {
                list.add(new a(i11, length, new k(hVar.C)));
            }
            if (hVar.D) {
                list.add(new a(i11, length, new g(hVar.E)));
            }
            float d11 = zVar3.d();
            if (!Float.isNaN(d11) && (zVar == null || zVar.d() != d11)) {
                list.add(new a(i11, length, new com.facebook.react.views.text.a(d11)));
            }
            int c11 = zVar3.c();
            if (zVar == null || zVar.c() != c11) {
                list.add(new a(i11, length, new f(c11)));
            }
            if (hVar.T != -1 || hVar.U != -1 || hVar.V != null) {
                list.add(new a(i11, length, new c(hVar.T, hVar.U, hVar.W, hVar.V, hVar.R().getAssets())));
            }
            if (hVar.O) {
                list.add(new a(i11, length, new v()));
            }
            if (hVar.P) {
                list.add(new a(i11, length, new n()));
            }
            if ((hVar.K != BitmapDescriptorFactory.HUE_RED || hVar.L != BitmapDescriptorFactory.HUE_RED || hVar.M != BitmapDescriptorFactory.HUE_RED) && Color.alpha(hVar.N) != 0) {
                list.add(new a(i11, length, new x(hVar.K, hVar.L, hVar.M, hVar.N)));
            }
            float e11 = zVar3.e();
            if (!Float.isNaN(e11) && (zVar == null || zVar.e() != e11)) {
                list.add(new a(i11, length, new b(e11)));
            }
            list.add(new a(i11, length, new o(hVar.L())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Spannable q1(h hVar, String str, boolean z11, com.facebook.react.uimanager.n nVar) {
        int i11;
        int i12 = 0;
        wf.a.b((z11 && nVar == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap hashMap = z11 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) e0.apply(str, hVar.A.l()));
        }
        p1(hVar, spannableStringBuilder, arrayList, null, z11, hashMap, 0);
        hVar.X = false;
        hVar.Y = hashMap;
        float f11 = Float.NaN;
        for (a aVar : arrayList) {
            m mVar = aVar.f12636c;
            boolean z12 = mVar instanceof a0;
            if (z12 || (mVar instanceof b0)) {
                if (z12) {
                    i11 = ((a0) mVar).b();
                    hVar.X = true;
                } else {
                    b0 b0Var = (b0) mVar;
                    int a11 = b0Var.a();
                    com.facebook.react.uimanager.c0 c0Var = (com.facebook.react.uimanager.c0) hashMap.get(Integer.valueOf(b0Var.b()));
                    nVar.h(c0Var);
                    c0Var.v(hVar);
                    i11 = a11;
                }
                if (Float.isNaN(f11) || i11 > f11) {
                    f11 = i11;
                }
            }
            aVar.a(spannableStringBuilder, i12);
            i12++;
        }
        hVar.A.o(f11);
        t tVar = this.f12633z;
        if (tVar != null) {
            tVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    @ng.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z11) {
        if (z11 != this.R) {
            this.R = z11;
            w0();
        }
    }

    @ng.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z11) {
        if (z11 != this.A.b()) {
            this.A.m(z11);
            w0();
        }
    }

    @ng.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (O()) {
            boolean z11 = num != null;
            this.D = z11;
            if (z11) {
                this.E = num.intValue();
            }
            w0();
        }
    }

    @ng.a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z11 = num != null;
        this.B = z11;
        if (z11) {
            this.C = num.intValue();
        }
        w0();
    }

    @ng.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.V = str;
        w0();
    }

    @ng.a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f11) {
        this.A.n(f11);
        w0();
    }

    @ng.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int b11 = u.b(str);
        if (b11 != this.T) {
            this.T = b11;
            w0();
        }
    }

    @ng.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String c11 = u.c(readableArray);
        if (TextUtils.equals(c11, this.W)) {
            return;
        }
        this.W = c11;
        w0();
    }

    @ng.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int d11 = u.d(str);
        if (d11 != this.U) {
            this.U = d11;
            w0();
        }
    }

    @ng.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z11) {
        this.Q = z11;
    }

    @ng.a(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f11) {
        this.A.p(f11);
        w0();
    }

    @ng.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f11) {
        this.A.q(f11);
        w0();
    }

    @ng.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f11) {
        if (f11 != this.A.k()) {
            this.A.r(f11);
            w0();
        }
    }

    @ng.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f11) {
        if (f11 != this.S) {
            this.S = f11;
            w0();
        }
    }

    @ng.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i11) {
        if (i11 == 0) {
            i11 = -1;
        }
        this.F = i11;
        w0();
    }

    @ng.a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.J = 1;
            }
            this.G = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.J = 0;
            }
            if (str != null && !"auto".equals(str)) {
                if ("left".equals(str)) {
                    this.G = 3;
                } else if ("right".equals(str)) {
                    this.G = 5;
                } else if ("center".equals(str)) {
                    this.G = 1;
                } else {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
            } else {
                this.G = 0;
            }
        }
        w0();
    }

    @ng.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str != null && !"highQuality".equals(str)) {
            if ("simple".equals(str)) {
                this.H = 0;
            } else if ("balanced".equals(str)) {
                this.H = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
        } else {
            this.H = 1;
        }
        w0();
    }

    @ng.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        String[] split;
        this.O = false;
        this.P = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.O = true;
                } else if ("line-through".equals(str2)) {
                    this.P = true;
                }
            }
        }
        w0();
    }

    @ng.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i11) {
        if (i11 != this.N) {
            this.N = i11;
            w0();
        }
    }

    @ng.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.K = BitmapDescriptorFactory.HUE_RED;
        this.L = BitmapDescriptorFactory.HUE_RED;
        if (readableMap != null) {
            if (readableMap.hasKey(Snapshot.WIDTH) && !readableMap.isNull(Snapshot.WIDTH)) {
                this.K = com.facebook.react.uimanager.p.b(readableMap.getDouble(Snapshot.WIDTH));
            }
            if (readableMap.hasKey(Snapshot.HEIGHT) && !readableMap.isNull(Snapshot.HEIGHT)) {
                this.L = com.facebook.react.uimanager.p.b(readableMap.getDouble(Snapshot.HEIGHT));
            }
        }
        w0();
    }

    @ng.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f11) {
        if (f11 != this.M) {
            this.M = f11;
            w0();
        }
    }

    @ng.a(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.A.s(e0.UNSET);
        } else if (PermissionsResponse.SCOPE_NONE.equals(str)) {
            this.A.s(e0.NONE);
        } else if ("uppercase".equals(str)) {
            this.A.s(e0.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.A.s(e0.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.A.s(e0.CAPITALIZE);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
        w0();
    }

    public h(t tVar) {
        this.B = false;
        this.D = false;
        this.F = -1;
        this.G = 0;
        this.H = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        this.I = 0;
        this.J = 0;
        this.K = BitmapDescriptorFactory.HUE_RED;
        this.L = BitmapDescriptorFactory.HUE_RED;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = 1426063360;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = BitmapDescriptorFactory.HUE_RED;
        this.T = -1;
        this.U = -1;
        this.V = null;
        this.W = null;
        this.X = false;
        this.A = new z();
        this.f12633z = tVar;
    }
}