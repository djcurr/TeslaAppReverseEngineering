package g80;

import android.graphics.PointF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f27842a = {"bottomMouthPosition", "leftCheekPosition", "leftEarPosition", "leftEarTipPosition", "leftEyePosition", "leftMouthPosition", "noseBasePosition", "rightCheekPosition", "rightEarPosition", "rightEarTipPosition", "rightEyePosition", "rightMouthPosition"};

    public static WritableMap a(WritableMap writableMap) {
        writableMap.putDouble("rollAngle", ((-writableMap.getDouble("rollAngle")) + 360.0d) % 360.0d);
        writableMap.putDouble("yawAngle", ((-writableMap.getDouble("yawAngle")) + 360.0d) % 360.0d);
        return writableMap;
    }

    public static WritableMap b(PointF pointF, double d11, double d12, int i11, int i12, int i13, int i14) {
        WritableMap createMap = Arguments.createMap();
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        float f11 = pointF.x;
        float f12 = i11 / 2;
        if (f11 < f12) {
            valueOf.floatValue();
            int i15 = i13 / 2;
        } else if (f11 > f12) {
            valueOf.floatValue();
            int i16 = i13 / 2;
        }
        float f13 = pointF.y;
        float f14 = i12 / 2;
        if (f13 < f14) {
            valueOf2.floatValue();
            int i17 = i14 / 2;
        } else if (f13 > f14) {
            valueOf2.floatValue();
            int i18 = i14 / 2;
        }
        createMap.putDouble("x", pointF.x * d11);
        createMap.putDouble("y", pointF.y * d12);
        return createMap;
    }

    public static WritableMap c(ReadableMap readableMap, int i11, double d11) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        createMap.putDouble("x", h(readableMap.getDouble("x"), i11, d11));
        return createMap;
    }

    public static WritableMap d(ReadableMap readableMap, double d11) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        createMap.putDouble("x", readableMap.getDouble("x") + d11);
        return createMap;
    }

    public static WritableMap e(WritableMap writableMap, int i11, double d11) {
        String[] strArr;
        ReadableMap map = writableMap.getMap("bounds");
        WritableMap d12 = d(c(map.getMap(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), i11, d11), -map.getMap("size").getDouble(Snapshot.WIDTH));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, d12);
        for (String str : f27842a) {
            ReadableMap map2 = writableMap.hasKey(str) ? writableMap.getMap(str) : null;
            if (map2 != null) {
                writableMap.putMap(str, c(map2, i11, d11));
            }
        }
        writableMap.putMap("bounds", createMap);
        return writableMap;
    }

    public static WritableMap f(Face face) {
        return g(face, 1.0d, 1.0d, 0, 0, 0, 0);
    }

    public static WritableMap g(Face face, double d11, double d12, int i11, int i12, int i13, int i14) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("faceID", face.getId());
        createMap.putDouble("rollAngle", face.getEulerZ());
        createMap.putDouble("yawAngle", face.getEulerY());
        if (face.getIsSmilingProbability() >= BitmapDescriptorFactory.HUE_RED) {
            createMap.putDouble("smilingProbability", face.getIsSmilingProbability());
        }
        if (face.getIsLeftEyeOpenProbability() >= BitmapDescriptorFactory.HUE_RED) {
            createMap.putDouble("leftEyeOpenProbability", face.getIsLeftEyeOpenProbability());
        }
        if (face.getIsRightEyeOpenProbability() >= BitmapDescriptorFactory.HUE_RED) {
            createMap.putDouble("rightEyeOpenProbability", face.getIsRightEyeOpenProbability());
        }
        for (Landmark landmark : face.getLandmarks()) {
            createMap.putMap(f27842a[landmark.getType()], b(landmark.getPosition(), d11, d12, i11, i12, i13, i14));
        }
        WritableMap createMap2 = Arguments.createMap();
        Float valueOf = Float.valueOf(face.getPosition().x);
        Float valueOf2 = Float.valueOf(face.getPosition().y);
        float f11 = i11 / 2;
        if (face.getPosition().x < f11) {
            valueOf = Float.valueOf(valueOf.floatValue() + (i13 / 2));
        } else if (face.getPosition().x > f11) {
            valueOf = Float.valueOf(valueOf.floatValue() - (i13 / 2));
        }
        float f12 = i12 / 2;
        if (face.getPosition().y < f12) {
            valueOf2 = Float.valueOf(valueOf2.floatValue() + (i14 / 2));
        } else if (face.getPosition().y > f12) {
            valueOf2 = Float.valueOf(valueOf2.floatValue() - (i14 / 2));
        }
        createMap2.putDouble("x", valueOf.floatValue() * d11);
        createMap2.putDouble("y", valueOf2.floatValue() * d12);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble(Snapshot.WIDTH, face.getWidth() * d11);
        createMap3.putDouble(Snapshot.HEIGHT, face.getHeight() * d12);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, createMap2);
        createMap4.putMap("size", createMap3);
        createMap.putMap("bounds", createMap4);
        return createMap;
    }

    public static double h(double d11, int i11, double d12) {
        return (i11 - (d11 / d12)) * d12;
    }
}