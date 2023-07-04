package ds;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.c0;
import com.facebook.react.v;
import com.tesla.TeslaV4.reactnative.module.AddToCalendarModule;
import com.tesla.TeslaV4.reactnative.module.ClientModuleNativeModule;
import com.tesla.TeslaV4.reactnative.module.CommandCenterNativeModule;
import com.tesla.TeslaV4.reactnative.module.HermesReactNativeModule;
import com.tesla.TeslaV4.reactnative.module.JsLifeCycleNativeModule;
import com.tesla.TeslaV4.reactnative.module.LocalizationModuleNativeModule;
import com.tesla.TeslaV4.reactnative.module.LocationNativeModule;
import com.tesla.TeslaV4.reactnative.module.MapUtilsModule;
import com.tesla.TeslaV4.reactnative.module.MonitoringServiceModule;
import com.tesla.TeslaV4.reactnative.module.NetInfoModule;
import com.tesla.TeslaV4.reactnative.module.OwnerApiModuleNativeModule;
import com.tesla.TeslaV4.reactnative.module.PlacesNativeModule;
import com.tesla.TeslaV4.reactnative.module.PowerstreamApiGrpcNativeModule;
import com.tesla.TeslaV4.reactnative.module.ProfileBackupNativeModule;
import com.tesla.TeslaV4.reactnative.module.ProximitySensorModule;
import com.tesla.TeslaV4.reactnative.module.ReportNativeModule;
import com.tesla.TeslaV4.reactnative.module.ScreenUtilsNativeModule;
import com.tesla.data.devicestorage.DeviceStorageModule;
import com.tesla.widget.rn.AppWidgetReactNativeModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes6.dex */
public final class a implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> o11;
        s.g(reactContext, "reactContext");
        o11 = w.o(new CommandCenterNativeModule(reactContext), new ReportNativeModule(reactContext), new ScreenUtilsNativeModule(reactContext), new MonitoringServiceModule(reactContext), new HermesReactNativeModule(reactContext), new LocalizationModuleNativeModule(reactContext), new LocationNativeModule(reactContext), new PlacesNativeModule(reactContext), new MapUtilsModule(reactContext), new ClientModuleNativeModule(reactContext), new DeviceStorageModule(reactContext), new OwnerApiModuleNativeModule(reactContext), new ProximitySensorModule(reactContext), new NetInfoModule(reactContext), new AppWidgetReactNativeModule(reactContext), new JsLifeCycleNativeModule(reactContext), new AddToCalendarModule(reactContext), new ProfileBackupNativeModule(reactContext), new PowerstreamApiGrpcNativeModule(reactContext));
        return o11;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<View, c0<?>>> createViewManagers(ReactApplicationContext reactContext) {
        s.g(reactContext, "reactContext");
        return new ArrayList();
    }
}