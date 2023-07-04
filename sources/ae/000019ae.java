package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes3.dex */
public class i extends d0 {

    /* renamed from: y */
    private final b f12320y = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12321a;

        static {
            int[] iArr = new int[com.facebook.yoga.u.values().length];
            f12321a = iArr;
            try {
                iArr[com.facebook.yoga.u.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12321a[com.facebook.yoga.u.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12321a[com.facebook.yoga.u.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12321a[com.facebook.yoga.u.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        float f12322a;

        /* renamed from: b */
        com.facebook.yoga.u f12323b;

        /* synthetic */ b(a aVar) {
            this();
        }

        void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f12323b = com.facebook.yoga.u.UNDEFINED;
                this.f12322a = Float.NaN;
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals("auto")) {
                    this.f12323b = com.facebook.yoga.u.AUTO;
                    this.f12322a = Float.NaN;
                } else if (asString.endsWith("%")) {
                    this.f12323b = com.facebook.yoga.u.PERCENT;
                    this.f12322a = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else {
                    throw new IllegalArgumentException("Unknown value: " + asString);
                }
            } else {
                this.f12323b = com.facebook.yoga.u.POINT;
                this.f12322a = p.b(dynamic.asDouble());
            }
        }

        private b() {
        }
    }

    private int o1(int i11) {
        if (jg.a.d().b(R())) {
            if (i11 != 0) {
                if (i11 != 2) {
                    return i11;
                }
                return 5;
            }
            return 4;
        }
        return i11;
    }

    @ng.a(name = "alignContent")
    public void setAlignContent(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            B0(com.facebook.yoga.a.FLEX_START);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c11 = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c11 = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c11 = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c11 = 7;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                B0(com.facebook.yoga.a.STRETCH);
                return;
            case 1:
                B0(com.facebook.yoga.a.BASELINE);
                return;
            case 2:
                B0(com.facebook.yoga.a.CENTER);
                return;
            case 3:
                B0(com.facebook.yoga.a.FLEX_START);
                return;
            case 4:
                B0(com.facebook.yoga.a.AUTO);
                return;
            case 5:
                B0(com.facebook.yoga.a.SPACE_BETWEEN);
                return;
            case 6:
                B0(com.facebook.yoga.a.FLEX_END);
                return;
            case 7:
                B0(com.facebook.yoga.a.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
        }
    }

    @ng.a(name = "alignItems")
    public void setAlignItems(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            C0(com.facebook.yoga.a.STRETCH);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c11 = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c11 = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c11 = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c11 = 7;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                C0(com.facebook.yoga.a.STRETCH);
                return;
            case 1:
                C0(com.facebook.yoga.a.BASELINE);
                return;
            case 2:
                C0(com.facebook.yoga.a.CENTER);
                return;
            case 3:
                C0(com.facebook.yoga.a.FLEX_START);
                return;
            case 4:
                C0(com.facebook.yoga.a.AUTO);
                return;
            case 5:
                C0(com.facebook.yoga.a.SPACE_BETWEEN);
                return;
            case 6:
                C0(com.facebook.yoga.a.FLEX_END);
                return;
            case 7:
                C0(com.facebook.yoga.a.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
        }
    }

    @ng.a(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            D0(com.facebook.yoga.a.AUTO);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c11 = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c11 = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c11 = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c11 = 7;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                D0(com.facebook.yoga.a.STRETCH);
                return;
            case 1:
                D0(com.facebook.yoga.a.BASELINE);
                return;
            case 2:
                D0(com.facebook.yoga.a.CENTER);
                return;
            case 3:
                D0(com.facebook.yoga.a.FLEX_START);
                return;
            case 4:
                D0(com.facebook.yoga.a.AUTO);
                return;
            case 5:
                D0(com.facebook.yoga.a.SPACE_BETWEEN);
                return;
            case 6:
                D0(com.facebook.yoga.a.FLEX_END);
                return;
            case 7:
                D0(com.facebook.yoga.a.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
        }
    }

    @ng.a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f11) {
        Z0(f11);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i11, float f11) {
        if (O()) {
            return;
        }
        F0(o1(g1.f12309a[i11]), p.c(f11));
    }

    @ng.a(name = "collapsable")
    public void setCollapsable(boolean z11) {
    }

    @ng.a(name = "display")
    public void setDisplay(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            H0(com.facebook.yoga.i.FLEX);
        } else if (str.equals("flex")) {
            H0(com.facebook.yoga.i.FLEX);
        } else if (str.equals(PermissionsResponse.SCOPE_NONE)) {
            H0(com.facebook.yoga.i.NONE);
        } else {
            throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
        }
    }

    @Override // com.facebook.react.uimanager.d0
    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "flex")
    public void setFlex(float f11) {
        if (O()) {
            return;
        }
        super.setFlex(f11);
    }

    @ng.a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (O()) {
            return;
        }
        this.f12320y.a(dynamic);
        int i11 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            I0(this.f12320y.f12322a);
        } else if (i11 == 3) {
            J0();
        } else if (i11 == 4) {
            K0(this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            L0(com.facebook.yoga.k.COLUMN);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1448970769:
                if (str.equals("row-reverse")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c11 = 1;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1272730475:
                if (str.equals("column-reverse")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                L0(com.facebook.yoga.k.ROW_REVERSE);
                return;
            case 1:
                L0(com.facebook.yoga.k.COLUMN);
                return;
            case 2:
                L0(com.facebook.yoga.k.ROW);
                return;
            case 3:
                L0(com.facebook.yoga.k.COLUMN_REVERSE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
        }
    }

    @Override // com.facebook.react.uimanager.d0
    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "flexGrow")
    public void setFlexGrow(float f11) {
        if (O()) {
            return;
        }
        super.setFlexGrow(f11);
    }

    @Override // com.facebook.react.uimanager.d0
    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "flexShrink")
    public void setFlexShrink(float f11) {
        if (O()) {
            return;
        }
        super.setFlexShrink(f11);
    }

    @ng.a(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            M0(com.facebook.yoga.w.NO_WRAP);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1039592053:
                if (str.equals("nowrap")) {
                    c11 = 0;
                    break;
                }
                break;
            case -749527969:
                if (str.equals("wrap-reverse")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                M0(com.facebook.yoga.w.NO_WRAP);
                return;
            case 1:
                M0(com.facebook.yoga.w.WRAP_REVERSE);
                return;
            case 2:
                M0(com.facebook.yoga.w.WRAP);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
        }
    }

    @ng.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        if (O()) {
            return;
        }
        this.f12320y.a(dynamic);
        int i11 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            d(this.f12320y.f12322a);
        } else if (i11 == 3) {
            a1();
        } else if (i11 == 4) {
            b1(this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            N0(com.facebook.yoga.l.FLEX_START);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c11 = 0;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c11 = 1;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c11 = 4;
                    break;
                }
                break;
            case 2055030478:
                if (str.equals("space-evenly")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                N0(com.facebook.yoga.l.CENTER);
                return;
            case 1:
                N0(com.facebook.yoga.l.FLEX_START);
                return;
            case 2:
                N0(com.facebook.yoga.l.SPACE_BETWEEN);
                return;
            case 3:
                N0(com.facebook.yoga.l.FLEX_END);
                return;
            case 4:
                N0(com.facebook.yoga.l.SPACE_AROUND);
                return;
            case 5:
                N0(com.facebook.yoga.l.SPACE_EVENLY);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
        }
    }

    @ng.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i11, Dynamic dynamic) {
        if (O()) {
            return;
        }
        int o12 = o1(g1.f12310b[i11]);
        this.f12320y.a(dynamic);
        int i12 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i12 == 1 || i12 == 2) {
            P0(o12, this.f12320y.f12322a);
        } else if (i12 == 3) {
            Q0(o12);
        } else if (i12 == 4) {
            R0(o12, this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (O()) {
            return;
        }
        this.f12320y.a(dynamic);
        int i11 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            c1(this.f12320y.f12322a);
        } else if (i11 == 4) {
            d1(this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (O()) {
            return;
        }
        this.f12320y.a(dynamic);
        int i11 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            e1(this.f12320y.f12322a);
        } else if (i11 == 4) {
            f1(this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (O()) {
            return;
        }
        this.f12320y.a(dynamic);
        int i11 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            g1(this.f12320y.f12322a);
        } else if (i11 == 4) {
            h1(this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (O()) {
            return;
        }
        this.f12320y.a(dynamic);
        int i11 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            i1(this.f12320y.f12322a);
        } else if (i11 == 4) {
            j1(this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "overflow")
    public void setOverflow(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            T0(com.facebook.yoga.s.VISIBLE);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1217487446:
                if (str.equals("hidden")) {
                    c11 = 0;
                    break;
                }
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    c11 = 1;
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                T0(com.facebook.yoga.s.HIDDEN);
                return;
            case 1:
                T0(com.facebook.yoga.s.SCROLL);
                return;
            case 2:
                T0(com.facebook.yoga.s.VISIBLE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
        }
    }

    @ng.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i11, Dynamic dynamic) {
        if (O()) {
            return;
        }
        int o12 = o1(g1.f12310b[i11]);
        this.f12320y.a(dynamic);
        int i12 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i12 == 1 || i12 == 2) {
            U0(o12, this.f12320y.f12322a);
        } else if (i12 == 4) {
            V0(o12, this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @ng.a(name = "position")
    public void setPosition(String str) {
        if (O()) {
            return;
        }
        if (str == null) {
            Y0(com.facebook.yoga.t.RELATIVE);
            return;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -892481938:
                if (str.equals("static")) {
                    c11 = 0;
                    break;
                }
                break;
            case -554435892:
                if (str.equals("relative")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1728122231:
                if (str.equals("absolute")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                Y0(com.facebook.yoga.t.STATIC);
                return;
            case 1:
                Y0(com.facebook.yoga.t.RELATIVE);
                return;
            case 2:
                Y0(com.facebook.yoga.t.ABSOLUTE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
        }
    }

    @ng.b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i11, Dynamic dynamic) {
        if (O()) {
            return;
        }
        int o12 = o1(new int[]{4, 5, 0, 2, 1, 3}[i11]);
        this.f12320y.a(dynamic);
        int i12 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i12 == 1 || i12 == 2) {
            W0(o12, this.f12320y.f12322a);
        } else if (i12 == 4) {
            X0(o12, this.f12320y.f12322a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.d0
    @ng.a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z11) {
        super.setShouldNotifyOnLayout(z11);
    }

    @ng.a(name = "pointerenter")
    public void setShouldNotifyPointerEnter(boolean z11) {
    }

    @ng.a(name = "pointerleave")
    public void setShouldNotifyPointerLeave(boolean z11) {
    }

    @ng.a(name = "pointermove")
    public void setShouldNotifyPointerMove(boolean z11) {
    }

    @ng.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        if (O()) {
            return;
        }
        this.f12320y.a(dynamic);
        int i11 = a.f12321a[this.f12320y.f12323b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            P(this.f12320y.f12322a);
        } else if (i11 == 3) {
            k1();
        } else if (i11 == 4) {
            l1(this.f12320y.f12322a);
        }
        dynamic.recycle();
    }
}