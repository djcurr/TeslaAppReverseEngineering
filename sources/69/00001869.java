package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;

@fg.a(name = JSCHeapCapture.TAG, needsEagerInit = true)
/* loaded from: classes3.dex */
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    public static final String TAG = "JSCHeapCapture";
    private a mCaptureInProgress;

    /* loaded from: classes3.dex */
    public static class CaptureException extends Exception {
        /* JADX INFO: Access modifiers changed from: package-private */
        public CaptureException(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a(CaptureException captureException);

        void b(File file);
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCaptureInProgress = null;
    }

    @Override // com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec
    public synchronized void captureComplete(String str, String str2) {
        a aVar = this.mCaptureInProgress;
        if (aVar != null) {
            if (str2 == null) {
                aVar.b(new File(str));
            } else {
                aVar.a(new CaptureException(str2));
            }
            this.mCaptureInProgress = null;
        }
    }

    public synchronized void captureHeap(String str, a aVar) {
        if (this.mCaptureInProgress != null) {
            aVar.a(new CaptureException("Heap capture already in progress."));
            return;
        }
        File file = new File(str + "/capture.json");
        file.delete();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.getJSModule(HeapCapture.class);
            if (heapCapture == null) {
                aVar.a(new CaptureException("Heap capture js module not registered."));
            } else {
                this.mCaptureInProgress = aVar;
                heapCapture.captureHeap(file.getPath());
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }
}