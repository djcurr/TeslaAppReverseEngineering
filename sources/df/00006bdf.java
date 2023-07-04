package expo.modules.sms;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J,\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J@\u0010\u0015\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lexpo/modules/sms/SMSModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "", "", "attachment", Action.KEY_ATTRIBUTE, "getAttachment", "getName", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "Lvz/b0;", "onCreate", "onDestroy", "Ljava/util/ArrayList;", "addresses", "message", "", "options", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "sendSMSAsync", "isAvailableAsync", "onHostResume", "onHostPause", "onHostDestroy", "smsPackage", "Ljava/lang/String;", "mModuleRegistry", "Lexpo/modules/core/ModuleRegistry;", "mPendingPromise", "Lexpo/modules/core/Promise;", "", "mSMSComposerOpened", "Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "expo-sms_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class SMSModule extends ExportedModule implements LifecycleEventListener {
    private ModuleRegistry mModuleRegistry;
    private Promise mPendingPromise;
    private boolean mSMSComposerOpened;
    private final String smsPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMSModule(Context context, String str) {
        super(context);
        s.g(context, "context");
        this.smsPackage = str;
    }

    private final String getAttachment(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoSMS";
    }

    @ExpoMethod
    public final void isAvailableAsync(Promise promise) {
        s.g(promise, "promise");
        promise.resolve(Boolean.valueOf(getContext().getPackageManager().hasSystemFeature("android.hardware.telephony")));
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.mModuleRegistry = moduleRegistry;
        if (moduleRegistry == null) {
            s.x("mModuleRegistry");
            moduleRegistry = null;
        }
        UIManager uIManager = (UIManager) moduleRegistry.getModule(UIManager.class);
        if (uIManager == null) {
            return;
        }
        uIManager.registerLifecycleEventListener(this);
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onDestroy() {
        ModuleRegistry moduleRegistry = this.mModuleRegistry;
        if (moduleRegistry == null) {
            s.x("mModuleRegistry");
            moduleRegistry = null;
        }
        UIManager uIManager = (UIManager) moduleRegistry.getModule(UIManager.class);
        if (uIManager == null) {
            return;
        }
        uIManager.unregisterLifecycleEventListener(this);
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        Promise promise = this.mPendingPromise;
        if (this.mSMSComposerOpened && promise != null) {
            Bundle bundle = new Bundle();
            bundle.putString("result", "unknown");
            b0 b0Var = b0.f54756a;
            promise.resolve(bundle);
            this.mPendingPromise = null;
        }
        this.mSMSComposerOpened = false;
    }

    @ExpoMethod
    public final void sendSMSAsync(ArrayList<String> addresses, String message, Map<String, ? extends Object> map, Promise promise) {
        String l02;
        Intent intent;
        ModuleRegistry moduleRegistry;
        String l03;
        s.g(addresses, "addresses");
        s.g(message, "message");
        s.g(promise, "promise");
        if (this.mPendingPromise != null) {
            promise.reject("E_SMS_SENDING_IN_PROGRESS", "Different SMS sending in progress. Await the old request and then try again.");
            return;
        }
        Object obj = map == null ? null : map.get("attachments");
        List list = obj instanceof List ? (List) obj : null;
        if (list != null && (list.isEmpty() ^ true)) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            l03 = e0.l0(addresses, ";", null, null, 0, null, null, 62, null);
            intent2.putExtra("address", l03);
            Object obj2 = list.get(0);
            Map<String, String> map2 = obj2 instanceof Map ? (Map) obj2 : null;
            intent2.putExtra("android.intent.extra.STREAM", Uri.parse(getAttachment(map2, "uri")));
            intent2.setType(getAttachment(map2, "mimeType"));
            intent2.addFlags(1);
            intent = intent2;
        } else {
            Intent intent3 = new Intent("android.intent.action.SENDTO");
            l02 = e0.l0(addresses, ";", null, null, 0, null, null, 62, null);
            intent3.setData(Uri.parse("smsto:" + l02));
            intent = intent3;
        }
        String str = this.smsPackage;
        if (str == null) {
            str = Telephony.Sms.getDefaultSmsPackage(getContext());
        }
        if (str != null) {
            intent.setPackage(str);
            intent.putExtra("exit_on_sent", true);
            intent.putExtra("compose_mode", true);
            intent.putExtra("sms_body", message);
            this.mPendingPromise = promise;
            ModuleRegistry moduleRegistry2 = this.mModuleRegistry;
            if (moduleRegistry2 == null) {
                s.x("mModuleRegistry");
                moduleRegistry = null;
            } else {
                moduleRegistry = moduleRegistry2;
            }
            ((ActivityProvider) moduleRegistry.getModule(ActivityProvider.class)).getCurrentActivity().startActivity(intent);
            this.mSMSComposerOpened = true;
            return;
        }
        promise.reject("E_SMS_NO_SMS_APP", "No messaging application available");
    }

    public /* synthetic */ SMSModule(Context context, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : str);
    }
}