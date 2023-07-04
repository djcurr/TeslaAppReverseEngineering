package org.reactnative.camera;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Map;
import mh.j;
import yf.c;

/* loaded from: classes5.dex */
public class CameraViewManager extends ViewGroupManager<d> {
    private static final String REACT_CLASS = "RNCamera";

    /* loaded from: classes5.dex */
    public enum a {
        EVENT_CAMERA_READY("onCameraReady"),
        EVENT_ON_MOUNT_ERROR("onMountError"),
        EVENT_ON_BAR_CODE_READ("onBarCodeRead"),
        EVENT_ON_FACES_DETECTED("onFacesDetected"),
        EVENT_ON_BARCODES_DETECTED("onGoogleVisionBarcodesDetected"),
        EVENT_ON_FACE_DETECTION_ERROR("onFaceDetectionError"),
        EVENT_ON_BARCODE_DETECTION_ERROR("onGoogleVisionBarcodeDetectionError"),
        EVENT_ON_TEXT_RECOGNIZED("onTextRecognized"),
        EVENT_ON_PICTURE_TAKEN("onPictureTaken"),
        EVENT_ON_PICTURE_SAVED("onPictureSaved"),
        EVENT_ON_RECORDING_START("onRecordingStart"),
        EVENT_ON_RECORDING_END("onRecordingEnd"),
        EVENT_ON_TOUCH("onTouch");
        
        private final String mName;

        a(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        a[] values;
        c.b a11 = yf.c.a();
        for (a aVar : a.values()) {
            a11.b(aVar.toString(), yf.c.d("registrationName", aVar.toString()));
        }
        return a11.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "autoFocus")
    public void setAutoFocus(d dVar, boolean z11) {
        dVar.setAutoFocus(z11);
    }

    @ng.a(name = "autoFocusPointOfInterest")
    public void setAutoFocusPointOfInterest(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.v((float) readableMap.getDouble("x"), (float) readableMap.getDouble("y"));
        }
    }

    @ng.a(name = "barCodeScannerEnabled")
    public void setBarCodeScanning(d dVar, boolean z11) {
        dVar.setShouldScanBarCodes(z11);
    }

    @ng.a(name = "barCodeTypes")
    public void setBarCodeTypes(d dVar, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(readableArray.getString(i11));
        }
        dVar.setBarCodeTypes(arrayList);
    }

    @ng.a(name = "cameraId")
    public void setCameraId(d dVar, String str) {
        dVar.setCameraId(str);
    }

    @ng.a(name = "cameraViewDimensions")
    public void setCameraViewDimensions(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.p0((int) readableMap.getDouble(Snapshot.WIDTH), (int) readableMap.getDouble(Snapshot.HEIGHT));
        }
    }

    @ng.a(name = "detectedImageInEvent")
    public void setDetectedImageInEvent(d dVar, boolean z11) {
        dVar.setDetectedImageInEvent(z11);
    }

    @ng.a(name = "exposure")
    public void setExposureCompensation(d dVar, float f11) {
        dVar.setExposureCompensation(f11);
    }

    @ng.a(name = "faceDetectorEnabled")
    public void setFaceDetecting(d dVar, boolean z11) {
        dVar.setShouldDetectFaces(z11);
    }

    @ng.a(name = "faceDetectionClassifications")
    public void setFaceDetectionClassifications(d dVar, int i11) {
        dVar.setFaceDetectionClassifications(i11);
    }

    @ng.a(name = "faceDetectionLandmarks")
    public void setFaceDetectionLandmarks(d dVar, int i11) {
        dVar.setFaceDetectionLandmarks(i11);
    }

    @ng.a(name = "faceDetectionMode")
    public void setFaceDetectionMode(d dVar, int i11) {
        dVar.setFaceDetectionMode(i11);
    }

    @ng.a(name = "flashMode")
    public void setFlashMode(d dVar, int i11) {
        dVar.setFlash(i11);
    }

    @ng.a(name = "focusDepth")
    public void setFocusDepth(d dVar, float f11) {
        dVar.setFocusDepth(f11);
    }

    @ng.a(name = "googleVisionBarcodeDetectorEnabled")
    public void setGoogleVisionBarcodeDetecting(d dVar, boolean z11) {
        dVar.setShouldGoogleDetectBarcodes(z11);
    }

    @ng.a(name = "googleVisionBarcodeMode")
    public void setGoogleVisionBarcodeMode(d dVar, int i11) {
        dVar.setGoogleVisionBarcodeMode(i11);
    }

    @ng.a(name = "googleVisionBarcodeType")
    public void setGoogleVisionBarcodeType(d dVar, int i11) {
        dVar.setGoogleVisionBarcodeType(i11);
    }

    @ng.a(name = "pictureSize")
    public void setPictureSize(d dVar, String str) {
        dVar.setPictureSize(str.equals("None") ? null : j.d(str));
    }

    @ng.a(name = "playSoundOnCapture")
    public void setPlaySoundOnCapture(d dVar, boolean z11) {
        dVar.setPlaySoundOnCapture(z11);
    }

    @ng.a(name = "playSoundOnRecord")
    public void setPlaySoundOnRecord(d dVar, boolean z11) {
        dVar.setPlaySoundOnRecord(z11);
    }

    @ng.a(name = "ratio")
    public void setRatio(d dVar, String str) {
        dVar.setAspectRatio(mh.a.h(str));
    }

    @ng.a(name = "rectOfInterest")
    public void setRectOfInterest(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.q0((float) readableMap.getDouble("x"), (float) readableMap.getDouble("y"), (float) readableMap.getDouble(Snapshot.WIDTH), (float) readableMap.getDouble(Snapshot.HEIGHT));
        }
    }

    @ng.a(name = "textRecognizerEnabled")
    public void setTextRecognizing(d dVar, boolean z11) {
        dVar.setShouldRecognizeText(z11);
    }

    @ng.a(name = "touchDetectorEnabled")
    public void setTouchDetectorEnabled(d dVar, boolean z11) {
        dVar.setShouldDetectTouches(z11);
    }

    @ng.a(name = "trackingEnabled")
    public void setTracking(d dVar, boolean z11) {
        dVar.setTracking(z11);
    }

    @ng.a(name = "type")
    public void setType(d dVar, int i11) {
        dVar.setFacing(i11);
    }

    @ng.a(name = "useCamera2Api")
    public void setUseCamera2Api(d dVar, boolean z11) {
        dVar.setUsingCamera2Api(z11);
    }

    @ng.a(name = "useNativeZoom")
    public void setUseNativeZoom(d dVar, boolean z11) {
        dVar.setUseNativeZoom(z11);
    }

    @ng.a(name = "whiteBalance")
    public void setWhiteBalance(d dVar, int i11) {
        dVar.setWhiteBalance(i11);
    }

    @ng.a(name = "zoom")
    public void setZoom(d dVar, float f11) {
        dVar.setZoom(f11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(n0 n0Var) {
        return new d(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(d dVar) {
        dVar.onHostDestroy();
        super.onDropViewInstance((CameraViewManager) dVar);
    }
}