package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.text.h;
import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes3.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends h> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final String TAG = "ReactTextAnchorViewManager";

    @ng.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(s sVar, boolean z11) {
        sVar.setAdjustFontSizeToFit(z11);
    }

    @ng.a(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(s sVar, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            nd.a.G(TAG, "android_hyphenationFrequency only available since android 23");
        } else if (str != null && !str.equals(PermissionsResponse.SCOPE_NONE)) {
            if (str.equals("full")) {
                sVar.setHyphenationFrequency(2);
            } else if (str.equals("normal")) {
                sVar.setHyphenationFrequency(1);
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid android_hyphenationFrequency: " + str);
            }
        } else {
            sVar.setHyphenationFrequency(0);
        }
    }

    @ng.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(s sVar, int i11, Integer num) {
        sVar.f(SPACING_TYPES[i11], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(s sVar, int i11, float f11) {
        if (!com.facebook.yoga.g.a(f11)) {
            f11 = com.facebook.react.uimanager.p.c(f11);
        }
        if (i11 == 0) {
            sVar.setBorderRadius(f11);
        } else {
            sVar.g(f11, i11 - 1);
        }
    }

    @ng.a(name = "borderStyle")
    public void setBorderStyle(s sVar, String str) {
        sVar.setBorderStyle(str);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(s sVar, int i11, float f11) {
        if (!com.facebook.yoga.g.a(f11)) {
            f11 = com.facebook.react.uimanager.p.c(f11);
        }
        sVar.h(SPACING_TYPES[i11], f11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ng.a(name = "dataDetectorType")
    public void setDataDetectorType(s sVar, String str) {
        char c11;
        switch (str.hashCode()) {
            case -1192969641:
                if (str.equals("phoneNumber")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 96673:
                if (str.equals("all")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 3321850:
                if (str.equals("link")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 3387192:
                if (str.equals(PermissionsResponse.SCOPE_NONE)) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0) {
            sVar.setLinkifyMask(4);
        } else if (c11 == 1) {
            sVar.setLinkifyMask(1);
        } else if (c11 == 2) {
            sVar.setLinkifyMask(2);
        } else if (c11 != 3) {
            sVar.setLinkifyMask(0);
        } else {
            sVar.setLinkifyMask(15);
        }
    }

    @ng.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(s sVar, boolean z11) {
        sVar.setEnabled(!z11);
    }

    @ng.a(name = "ellipsizeMode")
    public void setEllipsizeMode(s sVar, String str) {
        if (str != null && !str.equals("tail")) {
            if (str.equals("head")) {
                sVar.setEllipsizeLocation(TextUtils.TruncateAt.START);
                return;
            } else if (str.equals("middle")) {
                sVar.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
                return;
            } else if (str.equals("clip")) {
                sVar.setEllipsizeLocation(null);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
            }
        }
        sVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
    }

    @ng.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(s sVar, boolean z11) {
        sVar.setIncludeFontPadding(z11);
    }

    @ng.a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(s sVar, boolean z11) {
        sVar.setNotifyOnInlineViewLayout(z11);
    }

    @ng.a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(s sVar, int i11) {
        sVar.setNumberOfLines(i11);
    }

    @ng.a(name = "selectable")
    public void setSelectable(s sVar, boolean z11) {
        sVar.setTextIsSelectable(z11);
    }

    @ng.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(s sVar, Integer num) {
        if (num == null) {
            sVar.setHighlightColor(d.c(sVar.getContext()));
        } else {
            sVar.setHighlightColor(num.intValue());
        }
    }

    @ng.a(name = "textAlignVertical")
    public void setTextAlignVertical(s sVar, String str) {
        if (str != null && !"auto".equals(str)) {
            if ("top".equals(str)) {
                sVar.setGravityVertical(48);
                return;
            } else if ("bottom".equals(str)) {
                sVar.setGravityVertical(80);
                return;
            } else if ("center".equals(str)) {
                sVar.setGravityVertical(16);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
            }
        }
        sVar.setGravityVertical(0);
    }
}