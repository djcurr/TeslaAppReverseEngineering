package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.q;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;

@fg.a(name = RNDatePickerDialogModule.FRAGMENT_TAG)
/* loaded from: classes2.dex */
public class RNDatePickerDialogModule extends ReactContextBaseJavaModule {
    public static final String FRAGMENT_TAG = "RNDatePickerAndroid";

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f19997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f19998b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f19999c;

        a(q qVar, ReadableMap readableMap, Promise promise) {
            this.f19997a = qVar;
            this.f19998b = readableMap;
            this.f19999c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReadableMap readableMap;
            e eVar = (e) this.f19997a.h0(RNDatePickerDialogModule.FRAGMENT_TAG);
            if (eVar != null && (readableMap = this.f19998b) != null) {
                eVar.h(RNDatePickerDialogModule.this.createFragmentArguments(readableMap));
                return;
            }
            e eVar2 = new e();
            ReadableMap readableMap2 = this.f19998b;
            if (readableMap2 != null) {
                eVar2.setArguments(RNDatePickerDialogModule.this.createFragmentArguments(readableMap2));
            }
            b bVar = new b(this.f19999c);
            eVar2.f(bVar);
            eVar2.e(bVar);
            eVar2.g(bVar);
            eVar2.show(this.f19997a, RNDatePickerDialogModule.FRAGMENT_TAG);
        }
    }

    /* loaded from: classes2.dex */
    private class b implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final Promise f20001a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f20002b = false;

        public b(Promise promise) {
            this.f20001a = promise;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            if (this.f20002b || !RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f20001a.resolve(writableNativeMap);
            this.f20002b = true;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i11, int i12, int i13) {
            if (this.f20002b || !RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putInt("year", i11);
            writableNativeMap.putInt("month", i12);
            writableNativeMap.putInt("day", i13);
            this.f20001a.resolve(writableNativeMap);
            this.f20002b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f20002b || !RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f20001a.resolve(writableNativeMap);
            this.f20002b = true;
        }
    }

    public RNDatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            bundle.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            bundle.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundle.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("neutralButtonLabel") && !readableMap.isNull("neutralButtonLabel")) {
            bundle.putString("neutralButtonLabel", readableMap.getString("neutralButtonLabel"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundle.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
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
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else {
            UiThreadUtil.runOnUiThread(new a(hVar.getSupportFragmentManager(), readableMap, promise));
        }
    }
}