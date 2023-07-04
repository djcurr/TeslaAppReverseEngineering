package com.swmansion.reanimated.transitions;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.transition.c0;
import androidx.transition.d;
import androidx.transition.e;
import androidx.transition.f;
import androidx.transition.w;
import androidx.transition.w0;
import androidx.transition.y;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;

/* loaded from: classes6.dex */
class TransitionUtils {
    TransitionUtils() {
    }

    private static void configureTransition(y yVar, ReadableMap readableMap) {
        if (readableMap.hasKey("durationMs")) {
            yVar.setDuration(readableMap.getInt("durationMs"));
        }
        if (readableMap.hasKey("interpolation")) {
            String string = readableMap.getString("interpolation");
            if (string.equals("easeIn")) {
                yVar.setInterpolator(new AccelerateInterpolator());
            } else if (string.equals("easeOut")) {
                yVar.setInterpolator(new DecelerateInterpolator());
            } else if (string.equals("easeInOut")) {
                yVar.setInterpolator(new AccelerateDecelerateInterpolator());
            } else if (string.equals("linear")) {
                yVar.setInterpolator(new LinearInterpolator());
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid interpolation type " + string);
            }
        }
        if (readableMap.hasKey("propagation")) {
            String string2 = readableMap.getString("propagation");
            SaneSidePropagation saneSidePropagation = new SaneSidePropagation();
            if ("top".equals(string2)) {
                saneSidePropagation.setSide(80);
            } else if ("bottom".equals(string2)) {
                saneSidePropagation.setSide(48);
            } else if ("left".equals(string2)) {
                saneSidePropagation.setSide(5);
            } else if ("right".equals(string2)) {
                saneSidePropagation.setSide(3);
            }
            yVar.setPropagation(saneSidePropagation);
        } else {
            yVar.setPropagation(null);
        }
        if (readableMap.hasKey("delayMs")) {
            yVar.setStartDelay(readableMap.getInt("delayMs"));
        }
    }

    private static w0 createTransition(String str) {
        if (str == null || PermissionsResponse.SCOPE_NONE.equals(str)) {
            return null;
        }
        if ("fade".equals(str)) {
            return new f(3);
        }
        if ("scale".equals(str)) {
            return new Scale();
        }
        if ("slide-top".equals(str)) {
            return new w(48);
        }
        if ("slide-bottom".equals(str)) {
            return new w(80);
        }
        if ("slide-right".equals(str)) {
            return new w(5);
        }
        if ("slide-left".equals(str)) {
            return new w(3);
        }
        throw new JSApplicationIllegalArgumentException("Invalid transition type " + str);
    }

    static w0 createVisibilityTransition(String str) {
        if (str == null || PermissionsResponse.SCOPE_NONE.equals(str)) {
            return null;
        }
        if ("fade".equals(str)) {
            return new f(3);
        }
        if ("scale".equals(str)) {
            return new Scale();
        }
        if ("slide-top".equals(str)) {
            return new w(48);
        }
        if ("slide-bottom".equals(str)) {
            return new w(80);
        }
        if ("slide-right".equals(str)) {
            return new w(5);
        }
        if ("slide-left".equals(str)) {
            return new w(3);
        }
        throw new JSApplicationIllegalArgumentException("Invalid transition type " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y inflate(ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if (Kind.GROUP.equals(string)) {
            return inflateGroup(readableMap);
        }
        if ("in".equals(string)) {
            return inflateIn(readableMap);
        }
        if ("out".equals(string)) {
            return inflateOut(readableMap);
        }
        if ("change".equals(string)) {
            return inflateChange(readableMap);
        }
        throw new JSApplicationIllegalArgumentException("Unrecognized transition type " + string);
    }

    private static y inflateChange(ReadableMap readableMap) {
        d dVar = new d();
        e eVar = new e();
        configureTransition(dVar, readableMap);
        configureTransition(eVar, readableMap);
        return new c0().f(dVar).f(eVar);
    }

    private static y inflateGroup(ReadableMap readableMap) {
        c0 c0Var = new c0();
        if (readableMap.hasKey("sequence") && readableMap.getBoolean("sequence")) {
            c0Var.q(1);
        } else {
            c0Var.q(0);
        }
        ReadableArray array = readableMap.getArray("transitions");
        int size = array.size();
        for (int i11 = 0; i11 < size; i11++) {
            y inflate = inflate(array.getMap(i11));
            if (inflate != null) {
                c0Var.f(inflate);
            }
        }
        return c0Var;
    }

    private static y inflateIn(ReadableMap readableMap) {
        w0 createTransition = createTransition(readableMap.getString("animation"));
        if (createTransition == null) {
            return null;
        }
        createTransition.setMode(1);
        configureTransition(createTransition, readableMap);
        return createTransition;
    }

    private static y inflateOut(ReadableMap readableMap) {
        w0 createTransition = createTransition(readableMap.getString("animation"));
        if (createTransition == null) {
            return null;
        }
        createTransition.setMode(2);
        configureTransition(createTransition, readableMap);
        return createTransition;
    }
}