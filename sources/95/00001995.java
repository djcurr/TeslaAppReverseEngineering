package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.p;
import com.stripe.android.networking.FraudDetectionData;

/* loaded from: classes3.dex */
public class m {

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12291a;

        static {
            int[] iArr = new int[l.values().length];
            f12291a = iArr;
            try {
                iArr[l.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12291a[l.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12291a[l.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12291a[l.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static WritableMap[] a(j jVar) {
        MotionEvent a11 = jVar.a();
        WritableMap[] writableMapArr = new WritableMap[a11.getPointerCount()];
        float x11 = a11.getX() - jVar.c();
        float y11 = a11.getY() - jVar.d();
        for (int i11 = 0; i11 < a11.getPointerCount(); i11++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", p.a(a11.getX(i11)));
            createMap.putDouble("pageY", p.a(a11.getY(i11)));
            createMap.putDouble("locationX", p.a(a11.getX(i11) - x11));
            createMap.putDouble("locationY", p.a(a11.getY(i11) - y11));
            createMap.putInt("targetSurface", jVar.getSurfaceId());
            createMap.putInt("target", jVar.getViewTag());
            createMap.putDouble(FraudDetectionData.KEY_TIMESTAMP, jVar.getTimestampMs());
            createMap.putDouble("identifier", a11.getPointerId(i11));
            writableMapArr[i11] = createMap;
        }
        return writableMapArr;
    }

    private static WritableArray b(boolean z11, WritableMap... writableMapArr) {
        WritableArray createArray = Arguments.createArray();
        for (WritableMap writableMap : writableMapArr) {
            if (writableMap != null) {
                if (z11) {
                    writableMap = writableMap.copy();
                }
                createArray.pushMap(writableMap);
            }
        }
        return createArray;
    }

    public static void c(RCTModernEventEmitter rCTModernEventEmitter, j jVar) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        com.facebook.systrace.a.c(0L, "TouchesHelper.sentTouchEventModern(" + jVar.getEventName() + ")");
        l b11 = jVar.b();
        MotionEvent a11 = jVar.a();
        if (a11 == null) {
            ReactSoftExceptionLogger.logSoftException("TouchesHelper", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return;
        }
        WritableMap[] a12 = a(jVar);
        int i11 = a.f12291a[b11.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                int actionIndex = a11.getActionIndex();
                WritableMap writableMap = a12[actionIndex];
                a12[actionIndex] = null;
                writableMapArr2 = new WritableMap[]{writableMap};
            } else if (i11 == 3) {
                writableMapArr2 = new WritableMap[a12.length];
                for (int i12 = 0; i12 < a12.length; i12++) {
                    writableMapArr2[i12] = a12[i12].copy();
                }
            } else if (i11 != 4) {
                writableMapArr = a12;
                a12 = null;
            } else {
                writableMapArr = new WritableMap[0];
            }
            a12 = writableMapArr2;
            writableMapArr = a12;
        } else {
            writableMapArr = a12;
            a12 = new WritableMap[]{a12[a11.getActionIndex()].copy()};
        }
        for (WritableMap writableMap2 : a12) {
            WritableMap copy = writableMap2.copy();
            WritableArray b12 = b(true, a12);
            WritableArray b13 = b(true, writableMapArr);
            copy.putArray("changedTouches", b12);
            copy.putArray("touches", b13);
            rCTModernEventEmitter.receiveEvent(jVar.getSurfaceId(), jVar.getViewTag(), jVar.getEventName(), jVar.canCoalesce(), 0, copy, jVar.getEventCategory());
        }
        com.facebook.systrace.a.g(0L);
    }

    public static void d(RCTEventEmitter rCTEventEmitter, j jVar) {
        l b11 = jVar.b();
        WritableArray b12 = b(false, a(jVar));
        MotionEvent a11 = jVar.a();
        WritableArray createArray = Arguments.createArray();
        if (b11 != l.MOVE && b11 != l.CANCEL) {
            if (b11 != l.START && b11 != l.END) {
                throw new RuntimeException("Unknown touch type: " + b11);
            }
            createArray.pushInt(a11.getActionIndex());
        } else {
            for (int i11 = 0; i11 < a11.getPointerCount(); i11++) {
                createArray.pushInt(i11);
            }
        }
        rCTEventEmitter.receiveTouches(l.getJSEventName(b11), b12, createArray);
    }
}