package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.q;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;

@fg.a(name = RNTimePickerDialogModule.FRAGMENT_TAG)
/* loaded from: classes2.dex */
public class RNTimePickerDialogModule extends ReactContextBaseJavaModule {
    public static final String FRAGMENT_TAG = "RNTimePickerAndroid";

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f20004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f20005b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f20006c;

        a(q qVar, ReadableMap readableMap, Promise promise) {
            this.f20004a = qVar;
            this.f20005b = readableMap;
            this.f20006c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReadableMap readableMap;
            j jVar = (j) this.f20004a.h0(RNTimePickerDialogModule.FRAGMENT_TAG);
            if (jVar != null && (readableMap = this.f20005b) != null) {
                jVar.f(RNTimePickerDialogModule.this.createFragmentArguments(readableMap));
                return;
            }
            j jVar2 = new j();
            ReadableMap readableMap2 = this.f20005b;
            if (readableMap2 != null) {
                jVar2.setArguments(RNTimePickerDialogModule.this.createFragmentArguments(readableMap2));
            }
            b bVar = new b(this.f20006c);
            jVar2.c(bVar);
            jVar2.e(bVar);
            jVar2.d(bVar);
            jVar2.show(this.f20004a, RNTimePickerDialogModule.FRAGMENT_TAG);
        }
    }

    /* loaded from: classes2.dex */
    private class b implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final Promise f20008a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f20009b = false;

        public b(Promise promise) {
            this.f20008a = promise;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            if (this.f20009b || !RNTimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f20008a.resolve(writableNativeMap);
            this.f20009b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f20009b || !RNTimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f20008a.resolve(writableNativeMap);
            this.f20009b = true;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i11, int i12) {
            if (this.f20009b || !RNTimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "timeSetAction");
            writableNativeMap.putInt("hour", i11);
            writableNativeMap.putInt("minute", i12);
            this.f20008a.resolve(writableNativeMap);
            this.f20009b = true;
        }
    }

    public RNTimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            bundle.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundle.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("neutralButtonLabel") && !readableMap.isNull("neutralButtonLabel")) {
            bundle.putString("neutralButtonLabel", readableMap.getString("neutralButtonLabel"));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            bundle.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundle.putInt("timeZoneOffsetInMinutes", readableMap.getInt("timeZoneOffsetInMinutes"));
        }
        return bundle;
    }

    @ReactMethod
    public void dismiss(Promise promise) {
        com.reactcommunity.rndatetimepicker.a.a((androidx.fragment.app.h) getCurrentActivity(), FRAGMENT_TAG, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        androidx.fragment.app.h hVar = (androidx.fragment.app.h) getCurrentActivity();
        if (hVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else {
            UiThreadUtil.runOnUiThread(new a(hVar.getSupportFragmentManager(), readableMap, promise));
        }
    }
}