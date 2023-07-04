package expo.modules.interfaces.facedetector;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes5.dex */
public interface FaceDetectorInterface {
    void detectFaces(Uri uri, FacesDetectionCompleted facesDetectionCompleted, FaceDetectionError faceDetectionError);

    void detectFaces(byte[] bArr, int i11, int i12, int i13, boolean z11, double d11, double d12, FacesDetectionCompleted facesDetectionCompleted, FaceDetectionError faceDetectionError, FaceDetectionSkipped faceDetectionSkipped);

    void release();

    void setSettings(Map<String, Object> map);
}