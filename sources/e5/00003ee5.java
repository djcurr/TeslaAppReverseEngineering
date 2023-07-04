package com.lwansbrough.RCTCamera;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import expo.modules.imagepicker.ImagePickerConstants;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class RCTCameraViewManager extends ViewGroupManager<c> {
    public static final int COMMAND_START_PREVIEW = 2;
    public static final int COMMAND_STOP_PREVIEW = 1;
    private static final String REACT_CLASS = "RCTCamera";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.e("stopPreview", 1, "startPreview", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = ImagePickerConstants.OPTION_ASPECT)
    public void setAspect(c cVar, int i11) {
        cVar.setAspect(i11);
    }

    @ng.a(name = "barCodeTypes")
    public void setBarCodeTypes(c cVar, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(readableArray.getString(i11));
        }
        cVar.setBarCodeTypes(arrayList);
    }

    @ng.a(name = "barcodeScannerEnabled")
    public void setBarcodeScannerEnabled(c cVar, boolean z11) {
        cVar.setBarcodeScannerEnabled(z11);
    }

    @ng.a(name = "captureAudio")
    public void setCaptureAudio(c cVar, boolean z11) {
    }

    @ng.a(name = "captureMode")
    public void setCaptureMode(c cVar, int i11) {
        cVar.setCaptureMode(i11);
    }

    @ng.a(name = "captureQuality")
    public void setCaptureQuality(c cVar, String str) {
        cVar.setCaptureQuality(str);
    }

    @ng.a(name = "captureTarget")
    public void setCaptureTarget(c cVar, int i11) {
    }

    @ng.a(name = "clearWindowBackground")
    public void setClearWindowBackground(c cVar, boolean z11) {
        cVar.setClearWindowBackground(z11);
    }

    @ng.a(name = "flashMode")
    public void setFlashMode(c cVar, int i11) {
        cVar.setFlashMode(i11);
    }

    @ng.a(name = "orientation")
    public void setOrientation(c cVar, int i11) {
        cVar.setOrientation(i11);
    }

    @ng.a(name = "torchMode")
    public void setTorchMode(c cVar, int i11) {
        cVar.setTorchMode(i11);
    }

    @ng.a(name = "type")
    public void setType(c cVar, int i11) {
        cVar.setCameraType(i11);
    }

    @ng.a(name = "zoom")
    public void setZoom(c cVar, int i11) {
        cVar.setZoom(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(n0 n0Var) {
        return new c(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c cVar, int i11, ReadableArray readableArray) {
        if (cVar == null) {
            throw new AssertionError();
        }
        if (i11 == 1) {
            cVar.i();
        } else if (i11 == 2) {
            cVar.h();
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i11), getClass().getSimpleName()));
        }
    }
}