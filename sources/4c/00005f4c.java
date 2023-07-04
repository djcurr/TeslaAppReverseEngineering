package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.provider.CalendarContract;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.contacts.EXColumns;
import ezvcard.property.Kind;
import kotlin.Metadata;
import org.spongycastle.i18n.MessageBundle;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/AddToCalendarModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lcom/facebook/react/bridge/ReadableMap;", "event", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "createCalendarEvent", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "", "getCalendarID", "()I", "calendarID", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AddToCalendarModule extends ReactContextBaseJavaModule {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCalendarModule(ReactApplicationContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        Context applicationContext = reactContext.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "reactContext.applicationContext");
        this.context = applicationContext;
    }

    private final int getCalendarID() {
        String[] strArr = {EXColumns.ID, "calendar_displayName"};
        Cursor query = this.context.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, strArr, "visible = 1 AND isPrimary=1", null, "_id ASC");
        if (query != null && query.getCount() <= 0) {
            query = this.context.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, strArr, "visible = 1", null, "_id ASC");
        }
        if (query == null || !query.moveToFirst()) {
            return 1;
        }
        String string = query.getString(query.getColumnIndex(strArr[0]));
        kotlin.jvm.internal.s.f(string, "cursor.getString(idCol)");
        return Integer.parseInt(string);
    }

    @ReactMethod
    public final void createCalendarEvent(ReadableMap event, Promise promise) {
        kotlin.jvm.internal.s.g(event, "event");
        kotlin.jvm.internal.s.g(promise, "promise");
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI).putExtra(MessageBundle.TITLE_ENTRY, event.getString(MessageBundle.TITLE_ENTRY)).putExtra("eventLocation", event.getString(Kind.LOCATION)).putExtra("beginTime", (long) event.getDouble("startDate")).putExtra("endTime", (long) event.getDouble("endDate")).putExtra("calendar_id", getCalendarID());
        if (intent.resolveActivity(this.context.getPackageManager()) != null && getCurrentActivity() != null) {
            Activity currentActivity = getCurrentActivity();
            kotlin.jvm.internal.s.e(currentActivity);
            currentActivity.startActivity(intent);
            promise.resolve(null);
            return;
        }
        promise.reject(new IllegalStateException("intent resolve error"));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AddToCalendar";
    }
}