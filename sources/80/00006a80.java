package expo.modules.kotlin.events;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.events.d;
import expo.modules.core.interfaces.services.EventEmitter;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.JSTypeConverter;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u001f\u0010 J)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001J!\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n \u0004*\u0004\u0018\u00010\f0\fH\u0096\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0010H\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/events/KEventEmitterWrapper;", "Lexpo/modules/kotlin/events/EventEmitter;", "Lexpo/modules/core/interfaces/services/EventEmitter;", "", "kotlin.jvm.PlatformType", "eventName", "Landroid/os/Bundle;", "eventBody", "Lvz/b0;", "emit", "", "viewId", "Lexpo/modules/core/interfaces/services/EventEmitter$Event;", "event", "Lcom/facebook/react/bridge/WritableMap;", "Lexpo/modules/kotlin/records/Record;", "", "legacyEventEmitter", "Lexpo/modules/core/interfaces/services/EventEmitter;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "getDeviceEventEmitter", "()Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "deviceEventEmitter", "Lcom/facebook/react/uimanager/events/d;", "getUiEventDispatcher", "()Lcom/facebook/react/uimanager/events/d;", "uiEventDispatcher", "<init>", "(Lexpo/modules/core/interfaces/services/EventEmitter;Ljava/lang/ref/WeakReference;)V", "UIEvent", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class KEventEmitterWrapper implements EventEmitter, expo.modules.core.interfaces.services.EventEmitter {
    private final expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter;
    private final WeakReference<ReactApplicationContext> reactContextHolder;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/events/KEventEmitterWrapper$UIEvent;", "Lcom/facebook/react/uimanager/events/c;", "", "getEventName", "", "canCoalesce", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "Lvz/b0;", "dispatch", "", "viewId", "I", "eventName", "Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "eventBody", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    private static final class UIEvent extends c<UIEvent> {
        private final WritableMap eventBody;
        private final String eventName;
        private final int viewId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UIEvent(int i11, String eventName, WritableMap writableMap) {
            super(i11);
            s.g(eventName, "eventName");
            this.viewId = i11;
            this.eventName = eventName;
            this.eventBody = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.c
        public boolean canCoalesce() {
            return false;
        }

        @Override // com.facebook.react.uimanager.events.c
        public void dispatch(RCTEventEmitter rctEventEmitter) {
            s.g(rctEventEmitter, "rctEventEmitter");
            rctEventEmitter.receiveEvent(this.viewId, this.eventName, this.eventBody);
        }

        @Override // com.facebook.react.uimanager.events.c
        public short getCoalescingKey() {
            return (short) 0;
        }

        @Override // com.facebook.react.uimanager.events.c
        public String getEventName() {
            return this.eventName;
        }
    }

    public KEventEmitterWrapper(expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter, WeakReference<ReactApplicationContext> reactContextHolder) {
        s.g(legacyEventEmitter, "legacyEventEmitter");
        s.g(reactContextHolder, "reactContextHolder");
        this.legacyEventEmitter = legacyEventEmitter;
        this.reactContextHolder = reactContextHolder;
    }

    private final DeviceEventManagerModule.RCTDeviceEventEmitter getDeviceEventEmitter() {
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext == null) {
            return null;
        }
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    private final d getUiEventDispatcher() {
        UIManagerModule uIManagerModule;
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext == null || (uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)) == null) {
            return null;
        }
        return uIManagerModule.getEventDispatcher();
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int i11, EventEmitter.Event event) {
        this.legacyEventEmitter.emit(i11, event);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int i11, String str, Bundle bundle) {
        this.legacyEventEmitter.emit(i11, str, bundle);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(String str, Bundle bundle) {
        this.legacyEventEmitter.emit(str, bundle);
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, WritableMap writableMap) {
        s.g(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter == null) {
            return;
        }
        deviceEventEmitter.emit(eventName, writableMap);
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Record record) {
        s.g(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter == null) {
            return;
        }
        deviceEventEmitter.emit(eventName, JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, record, null, 2, null));
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Map<?, ?> map) {
        s.g(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter == null) {
            return;
        }
        deviceEventEmitter.emit(eventName, JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, map, null, 2, null));
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(int i11, String eventName, WritableMap writableMap) {
        s.g(eventName, "eventName");
        d uiEventDispatcher = getUiEventDispatcher();
        if (uiEventDispatcher == null) {
            return;
        }
        uiEventDispatcher.g(new UIEvent(i11, eventName, writableMap));
    }
}