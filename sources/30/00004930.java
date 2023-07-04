package com.reactcommunity.rnlocalize;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

@fg.a(name = RNLocalizeModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class RNLocalizeModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String MODULE_NAME = "RNLocalize";
    private final List<String> USES_FAHRENHEIT;
    private final List<String> USES_IMPERIAL;
    private final List<String> USES_RTL_LAYOUT;
    private boolean emitChangeOnResume;
    private boolean mainActivityVisible;

    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() != null) {
                RNLocalizeModule.this.onLocalizationDidChange();
            }
        }
    }

    public RNLocalizeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.USES_FAHRENHEIT = Arrays.asList("BS", "BZ", "KY", "PR", "PW", "US");
        this.USES_IMPERIAL = Arrays.asList("LR", "MM", "US");
        this.USES_RTL_LAYOUT = Arrays.asList("ar", "ckb", "fa", "he", "ks", "lrc", "mzn", "ps", "ug", "ur", "yi");
        this.mainActivityVisible = true;
        this.emitChangeOnResume = false;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        a aVar = new a();
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.registerReceiver(aVar, intentFilter);
    }

    private String createLanguageTag(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "-" + str2;
        }
        return str + "-" + str3;
    }

    private void emitLocalizationDidChange() {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("localizationDidChange", getExportedConstants());
        }
    }

    private String getCountryCode(Locale locale) {
        try {
            String country = locale.getCountry();
            return country.equals("419") ? "UN" : TextUtils.isEmpty(country) ? "" : country;
        } catch (Exception unused) {
            return "";
        }
    }

    private String getCurrencyCode(Locale locale) {
        try {
            Currency currency = Currency.getInstance(locale);
            return currency == null ? "" : currency.getCurrencyCode();
        } catch (Exception unused) {
            return "";
        }
    }

    private WritableMap getExportedConstants() {
        List<Locale> locales = getLocales();
        Locale locale = locales.get(0);
        String regionCode = getRegionCode(locale);
        if (TextUtils.isEmpty(regionCode)) {
            regionCode = "US";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WritableArray createArray = Arguments.createArray();
        WritableArray createArray2 = Arguments.createArray();
        for (Locale locale2 : locales) {
            String languageCode = getLanguageCode(locale2);
            String scriptCode = getScriptCode(locale2);
            String countryCode = getCountryCode(locale2);
            String currencyCode = getCurrencyCode(locale2);
            if (TextUtils.isEmpty(countryCode)) {
                countryCode = regionCode;
            }
            String createLanguageTag = createLanguageTag(languageCode, scriptCode, countryCode);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("languageCode", languageCode);
            createMap.putString("countryCode", countryCode);
            createMap.putString("languageTag", createLanguageTag);
            createMap.putBoolean("isRTL", getIsRTL(locale2));
            if (!TextUtils.isEmpty(scriptCode)) {
                createMap.putString("scriptCode", scriptCode);
            }
            if (!arrayList.contains(createLanguageTag)) {
                arrayList.add(createLanguageTag);
                createArray.pushMap(createMap);
            }
            if (!TextUtils.isEmpty(currencyCode) && !arrayList2.contains(currencyCode)) {
                arrayList2.add(currencyCode);
                createArray2.pushString(currencyCode);
            }
        }
        if (createArray2.size() == 0) {
            createArray2.pushString("USD");
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("calendar", "gregorian");
        createMap2.putString("country", regionCode);
        createMap2.putArray("currencies", createArray2);
        createMap2.putArray("locales", createArray);
        createMap2.putMap("numberFormatSettings", getNumberFormatSettings(locale));
        createMap2.putString("temperatureUnit", this.USES_FAHRENHEIT.contains(regionCode) ? "fahrenheit" : "celsius");
        createMap2.putString("timeZone", TimeZone.getDefault().getID());
        createMap2.putBoolean("uses24HourClock", DateFormat.is24HourFormat(getReactApplicationContext()));
        createMap2.putBoolean("usesAutoDateAndTime", getUsesAutoDateAndTime());
        createMap2.putBoolean("usesAutoTimeZone", getUsesAutoTimeZone());
        createMap2.putBoolean("usesMetricSystem", !this.USES_IMPERIAL.contains(regionCode));
        return createMap2;
    }

    private boolean getIsRTL(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        }
        return this.USES_RTL_LAYOUT.contains(getLanguageCode(locale));
    }

    private String getLanguageCode(Locale locale) {
        String language = locale.getLanguage();
        language.hashCode();
        char c11 = 65535;
        switch (language.hashCode()) {
            case 3365:
                if (language.equals("in")) {
                    c11 = 0;
                    break;
                }
                break;
            case 3374:
                if (language.equals("iw")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3391:
                if (language.equals("ji")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return "id";
            case 1:
                return "he";
            case 2:
                return "yi";
            default:
                return language;
        }
    }

    private List<Locale> getLocales() {
        ArrayList arrayList = new ArrayList();
        Configuration configuration = getReactApplicationContext().getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 24) {
            arrayList.add(configuration.locale);
        } else {
            LocaleList locales = configuration.getLocales();
            for (int i11 = 0; i11 < locales.size(); i11++) {
                arrayList.add(locales.get(i11));
            }
        }
        return arrayList;
    }

    private WritableMap getNumberFormatSettings(Locale locale) {
        WritableMap createMap = Arguments.createMap();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        createMap.putString("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        createMap.putString("groupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
        return createMap;
    }

    private String getRegionCode(Locale locale) {
        String systemProperty = getSystemProperty("ro.miui.region");
        return !TextUtils.isEmpty(systemProperty) ? systemProperty : getCountryCode(locale);
    }

    private String getScriptCode(Locale locale) {
        if (Build.VERSION.SDK_INT < 21) {
            return "";
        }
        String script = locale.getScript();
        return TextUtils.isEmpty(script) ? "" : script;
    }

    private String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return "";
        }
    }

    private boolean getUsesAutoDateAndTime() {
        int i11;
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        if (Build.VERSION.SDK_INT >= 17) {
            i11 = Settings.Global.getInt(contentResolver, "auto_time", 0);
        } else {
            i11 = Settings.System.getInt(contentResolver, "auto_time", 0);
        }
        return i11 != 0;
    }

    private boolean getUsesAutoTimeZone() {
        int i11;
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        if (Build.VERSION.SDK_INT >= 17) {
            i11 = Settings.Global.getInt(contentResolver, "auto_time_zone", 0);
        } else {
            i11 = Settings.System.getInt(contentResolver, "auto_time_zone", 0);
        }
        return i11 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLocalizationDidChange() {
        if (this.mainActivityVisible) {
            emitLocalizationDidChange();
        } else {
            this.emitChangeOnResume = true;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("initialConstants", getExportedConstants());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mainActivityVisible = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mainActivityVisible = true;
        if (this.emitChangeOnResume) {
            emitLocalizationDidChange();
            this.emitChangeOnResume = false;
        }
    }
}