package expo.modules.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.ReactApplicationContext;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.interfaces.barcodescanner.BarCodeScannerInterface;
import expo.modules.interfaces.camera.CameraViewInterface;
import expo.modules.interfaces.constants.ConstantsInterface;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.font.FontManagerInterface;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.sensors.SensorServiceInterface;
import expo.modules.interfaces.taskManager.TaskManagerInterface;
import expo.modules.kotlin.defaultmodules.ErrorManagerModule;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.KEventEmitterWrapper;
import expo.modules.kotlin.events.KModuleEventEmitterWrapper;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.modules.Module;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b^\u0010_J\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tJ(\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013R\u0019\u0010\u0019\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0019\u0010\"\u001a\u00020!8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0015\u0010,\u001a\u0004\u0018\u00010)8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u00100\u001a\u0004\u0018\u00010-8F@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0015\u00104\u001a\u0004\u0018\u0001018F@\u0006¢\u0006\u0006\u001a\u0004\b2\u00103R\u0015\u00108\u001a\u0004\u0018\u0001058F@\u0006¢\u0006\u0006\u001a\u0004\b6\u00107R\u0015\u0010<\u001a\u0004\u0018\u0001098F@\u0006¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0015\u0010@\u001a\u0004\u0018\u00010=8F@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010D\u001a\u0004\u0018\u00010A8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0015\u0010H\u001a\u0004\u0018\u00010E8F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0015\u0010L\u001a\u0004\u0018\u00010I8F@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0015\u0010P\u001a\u0004\u0018\u00010M8F@\u0006¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0015\u0010T\u001a\u0004\u0018\u00010Q8F@\u0006¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010\u00078@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006`"}, d2 = {"Lexpo/modules/kotlin/AppContext;", "", "Module", "legacyModule", "()Ljava/lang/Object;", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/events/EventEmitter;", "eventEmitter", "Lvz/b0;", "onDestroy", "onHostResume", "onHostPause", "onHostDestroy", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "intent", "onNewIntent", "Lexpo/modules/core/ModuleRegistry;", "legacyModuleRegistry", "Lexpo/modules/core/ModuleRegistry;", "getLegacyModuleRegistry", "()Lexpo/modules/core/ModuleRegistry;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/ModuleRegistry;", "registry", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "Lexpo/modules/kotlin/ReactLifecycleDelegate;", "reactLifecycleDelegate", "Lexpo/modules/kotlin/ReactLifecycleDelegate;", "Lexpo/modules/interfaces/constants/ConstantsInterface;", "getConstants", "()Lexpo/modules/interfaces/constants/ConstantsInterface;", "constants", "Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;", "getFilePermission", "()Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;", "filePermission", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissions", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissions", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "getImageLoader", "()Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "imageLoader", "Lexpo/modules/interfaces/barcodescanner/BarCodeScannerInterface;", "getBarcodeScanner", "()Lexpo/modules/interfaces/barcodescanner/BarCodeScannerInterface;", "barcodeScanner", "Lexpo/modules/interfaces/camera/CameraViewInterface;", "getCamera", "()Lexpo/modules/interfaces/camera/CameraViewInterface;", "camera", "Lexpo/modules/interfaces/font/FontManagerInterface;", "getFont", "()Lexpo/modules/interfaces/font/FontManagerInterface;", PaymentSheetEvent.FIELD_FONT, "Lexpo/modules/interfaces/sensors/SensorServiceInterface;", "getSensor", "()Lexpo/modules/interfaces/sensors/SensorServiceInterface;", "sensor", "Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "getTaskManager", "()Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "taskManager", "Lexpo/modules/core/interfaces/ActivityProvider;", "getActivityProvider", "()Lexpo/modules/core/interfaces/ActivityProvider;", "activityProvider", "Landroid/content/Context;", "getReactContext", "()Landroid/content/Context;", "reactContext", "getCallbackInvoker$expo_modules_core_release", "()Lexpo/modules/kotlin/events/EventEmitter;", "callbackInvoker", "Lexpo/modules/kotlin/defaultmodules/ErrorManagerModule;", "getErrorManager$expo_modules_core_release", "()Lexpo/modules/kotlin/defaultmodules/ErrorManagerModule;", "errorManager", "Lexpo/modules/kotlin/ModulesProvider;", "modulesProvider", "<init>", "(Lexpo/modules/kotlin/ModulesProvider;Lexpo/modules/core/ModuleRegistry;Ljava/lang/ref/WeakReference;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AppContext {
    private final expo.modules.core.ModuleRegistry legacyModuleRegistry;
    private final WeakReference<ReactApplicationContext> reactContextHolder;
    private final ReactLifecycleDelegate reactLifecycleDelegate;
    private final ModuleRegistry registry;

    public AppContext(ModulesProvider modulesProvider, expo.modules.core.ModuleRegistry legacyModuleRegistry, WeakReference<ReactApplicationContext> reactContextHolder) {
        s.g(modulesProvider, "modulesProvider");
        s.g(legacyModuleRegistry, "legacyModuleRegistry");
        s.g(reactContextHolder, "reactContextHolder");
        this.legacyModuleRegistry = legacyModuleRegistry;
        this.reactContextHolder = reactContextHolder;
        ModuleRegistry moduleRegistry = new ModuleRegistry(new WeakReference(this));
        moduleRegistry.register(new ErrorManagerModule());
        moduleRegistry.register(modulesProvider);
        b0 b0Var = b0.f54756a;
        this.registry = moduleRegistry;
        ReactLifecycleDelegate reactLifecycleDelegate = new ReactLifecycleDelegate(this);
        this.reactLifecycleDelegate = reactLifecycleDelegate;
        ReactApplicationContext reactApplicationContext = reactContextHolder.get();
        if (reactApplicationContext != null) {
            ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
            reactApplicationContext2.addLifecycleEventListener(reactLifecycleDelegate);
            reactApplicationContext2.addActivityEventListener(reactLifecycleDelegate);
            return;
        }
        throw new IllegalArgumentException("The app context should be created with valid react context.".toString());
    }

    public final EventEmitter eventEmitter(Module module) {
        Object obj;
        s.g(module, "module");
        try {
            obj = getLegacyModuleRegistry().getModule(expo.modules.core.interfaces.services.EventEmitter.class);
        } catch (Exception unused) {
            obj = null;
        }
        expo.modules.core.interfaces.services.EventEmitter eventEmitter = (expo.modules.core.interfaces.services.EventEmitter) obj;
        if (eventEmitter == null) {
            return null;
        }
        ModuleHolder moduleHolder = this.registry.getModuleHolder(module);
        if (moduleHolder != null) {
            return new KModuleEventEmitterWrapper(moduleHolder, eventEmitter, this.reactContextHolder);
        }
        throw new IllegalArgumentException("Cannot create an event emitter for the module that isn't present in the module registry.".toString());
    }

    public final ActivityProvider getActivityProvider() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(ActivityProvider.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (ActivityProvider) obj;
    }

    public final BarCodeScannerInterface getBarcodeScanner() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(BarCodeScannerInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (BarCodeScannerInterface) obj;
    }

    public final EventEmitter getCallbackInvoker$expo_modules_core_release() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(expo.modules.core.interfaces.services.EventEmitter.class);
        } catch (Exception unused) {
            obj = null;
        }
        expo.modules.core.interfaces.services.EventEmitter eventEmitter = (expo.modules.core.interfaces.services.EventEmitter) obj;
        if (eventEmitter == null) {
            return null;
        }
        return new KEventEmitterWrapper(eventEmitter, this.reactContextHolder);
    }

    public final CameraViewInterface getCamera() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(CameraViewInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (CameraViewInterface) obj;
    }

    public final ConstantsInterface getConstants() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(ConstantsInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (ConstantsInterface) obj;
    }

    public final ErrorManagerModule getErrorManager$expo_modules_core_release() {
        Object obj;
        boolean z11;
        Iterator<T> it2 = this.registry.getRegistry().values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Module module = ((ModuleHolder) obj).getModule();
            if (module != null) {
                z11 = module instanceof ErrorManagerModule;
                continue;
            } else {
                z11 = true;
                continue;
            }
            if (z11) {
                break;
            }
        }
        ModuleHolder moduleHolder = (ModuleHolder) obj;
        Module module2 = moduleHolder == null ? null : moduleHolder.getModule();
        return module2 instanceof ErrorManagerModule ? module2 : null;
    }

    public final FilePermissionModuleInterface getFilePermission() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(FilePermissionModuleInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (FilePermissionModuleInterface) obj;
    }

    public final FontManagerInterface getFont() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(FontManagerInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (FontManagerInterface) obj;
    }

    public final ImageLoaderInterface getImageLoader() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(ImageLoaderInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (ImageLoaderInterface) obj;
    }

    public final expo.modules.core.ModuleRegistry getLegacyModuleRegistry() {
        return this.legacyModuleRegistry;
    }

    public final Permissions getPermissions() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(Permissions.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (Permissions) obj;
    }

    public final Context getReactContext() {
        return this.reactContextHolder.get();
    }

    public final ModuleRegistry getRegistry() {
        return this.registry;
    }

    public final SensorServiceInterface getSensor() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(SensorServiceInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (SensorServiceInterface) obj;
    }

    public final TaskManagerInterface getTaskManager() {
        Object obj;
        try {
            obj = getLegacyModuleRegistry().getModule(TaskManagerInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (TaskManagerInterface) obj;
    }

    public final /* synthetic */ <Module> Module legacyModule() {
        try {
            expo.modules.core.ModuleRegistry legacyModuleRegistry = getLegacyModuleRegistry();
            s.m(4, "Module");
            return (Module) legacyModuleRegistry.getModule(Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        s.g(activity, "activity");
        this.registry.post(EventName.ON_ACTIVITY_RESULT, activity, new OnActivityResultPayload(i11, i12, intent));
    }

    public final void onDestroy() {
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this.reactLifecycleDelegate);
        }
        this.registry.post(EventName.MODULE_DESTROY);
        this.registry.cleanUp();
    }

    public final void onHostDestroy() {
        this.registry.post(EventName.ACTIVITY_DESTROYS);
    }

    public final void onHostPause() {
        this.registry.post(EventName.ACTIVITY_ENTERS_BACKGROUND);
    }

    public final void onHostResume() {
        this.registry.post(EventName.ACTIVITY_ENTERS_FOREGROUND);
    }

    public final void onNewIntent(Intent intent) {
        this.registry.post(EventName.ON_NEW_INTENT, intent);
    }
}