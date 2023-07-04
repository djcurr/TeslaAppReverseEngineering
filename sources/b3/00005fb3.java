package com.tesla.data.devicestorage;

import android.content.SharedPreferences;
import android.util.Pair;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.tesla.logging.g;
import ct.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ku.e;
import tt.h;

/* loaded from: classes6.dex */
public class DeviceStorageModule extends ReactContextBaseJavaModule {
    private static final String ERROR_NO_VALUE = "ERROR_NO_VALUE";
    private static final String ERROR_UNABLE_TO_CREATE = "ERROR_UNABLE_TO_CREATE";
    private static final String ERROR_UNABLE_TO_DELETE = "ERROR_UNABLE_TO_DELETE";
    private static final String IDENTIFIER = "identifier";
    private static final String NO_ERROR = "NO_ERROR";
    private static final String REACT_CLASS = "TMDeviceStorageAccess";
    private static final String RESULT = "result";
    private static final String TAG = "DeviceStorageModule";
    private static final String VALUE = "value";
    private final g logger;
    private final SharedPreferences mLegacyNonSecurePrefs;
    private final SharedPreferences mLegacySecurePrefs;

    public DeviceStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.logger = g.g(TAG);
        this.mLegacySecurePrefs = at.g.i(reactApplicationContext);
        this.mLegacyNonSecurePrefs = at.g.d(reactApplicationContext);
    }

    private WritableMap genResult(boolean z11, String str, String str2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (!z11) {
            str = str2;
        }
        writableNativeMap.putString(RESULT, str);
        return writableNativeMap;
    }

    private static List<String> getStrFromArray(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray != null) {
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                arrayList.add(readableArray.getString(i11));
            }
        }
        return arrayList;
    }

    private void incrementRealmSet() {
        e.d().l(h.REALM_SET, 1L);
    }

    private void retrieveLegacyValues(ReadableArray readableArray, boolean z11, Promise promise) {
        String g11;
        WritableArray createArray = Arguments.createArray();
        if (readableArray == null) {
            promise.resolve(createArray);
            return;
        }
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (z11) {
                g11 = at.g.c().g(string, this.mLegacySecurePrefs);
            } else {
                g11 = at.g.c().g(string, this.mLegacyNonSecurePrefs);
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            if (g11 != null) {
                g gVar = this.logger;
                gVar.a("Retrieving Legacy Value " + string + " : " + g11);
                writableNativeMap.putString(IDENTIFIER, string);
                writableNativeMap.putString("value", g11);
                writableNativeMap.putString(RESULT, NO_ERROR);
            } else {
                g gVar2 = this.logger;
                gVar2.a("Retrieving Legacy Value Failed : " + string);
                writableNativeMap.putString(IDENTIFIER, string);
                writableNativeMap.putString(RESULT, ERROR_NO_VALUE);
            }
            createArray.pushMap(writableNativeMap);
        }
        promise.resolve(createArray);
    }

    @ReactMethod
    public void clearNonSecureLegacyValues(ReadableArray readableArray, Promise promise) {
        at.g.c().a(this.mLegacyNonSecurePrefs, false);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(RESULT, at.g.c().b() ? NO_ERROR : ERROR_UNABLE_TO_DELETE);
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void clearSecureLegacyValues(ReadableArray readableArray, Promise promise) {
        at.g.c().a(this.mLegacySecurePrefs, false);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(RESULT, at.g.c().b() ? NO_ERROR : ERROR_UNABLE_TO_DELETE);
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void clearValuesExcept(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        incrementRealmSet();
        promise.resolve(genResult(i.i().d(getStrFromArray(readableArray), getStrFromArray(readableArray2)), NO_ERROR, ERROR_UNABLE_TO_DELETE));
    }

    @ReactMethod
    public void deleteValues(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        incrementRealmSet();
        promise.resolve(genResult(i.i().r(getStrFromArray(readableArray), getStrFromArray(readableArray2)), NO_ERROR, ERROR_UNABLE_TO_DELETE));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void retrieveNonSecureLegacyValues(ReadableArray readableArray, Promise promise) {
        this.logger.a("Retrieving Legacy NonSecure Value");
        retrieveLegacyValues(readableArray, false, promise);
    }

    @ReactMethod
    public void retrieveSecureLegacyValues(ReadableArray readableArray, Promise promise) {
        this.logger.a("Retrieving Legacy Secure Value");
        retrieveLegacyValues(readableArray, true, promise);
    }

    @ReactMethod
    public void retrieveValues(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        e.d().l(h.REALM_GET, 1L);
        WritableArray createArray = Arguments.createArray();
        List<String> strFromArray = getStrFromArray(readableArray);
        List<Pair<String, String>> h11 = i.i().h(strFromArray, getStrFromArray(readableArray2));
        HashSet hashSet = new HashSet();
        for (Pair<String, String> pair : h11) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(IDENTIFIER, (String) pair.first);
            writableNativeMap.putString("value", (String) pair.second);
            writableNativeMap.putString(RESULT, NO_ERROR);
            hashSet.add((String) pair.first);
            createArray.pushMap(writableNativeMap);
        }
        for (String str : strFromArray) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            if (!hashSet.contains(str)) {
                writableNativeMap2.putString(IDENTIFIER, str);
                writableNativeMap2.putString(RESULT, ERROR_NO_VALUE);
            }
            createArray.pushMap(writableNativeMap2);
        }
        promise.resolve(createArray);
    }

    @ReactMethod
    public void storeValues(ReadableMap readableMap, Promise promise) {
        incrementRealmSet();
        promise.resolve(genResult(readableMap == null || i.i().s(Arguments.toBundle(readableMap)), NO_ERROR, ERROR_UNABLE_TO_CREATE));
    }
}