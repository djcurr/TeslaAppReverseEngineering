package expo.modules.calendar;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.model.Stripe3ds2AuthParams;
import e00.b;
import expo.modules.contacts.EXColumns;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.Promise;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;
import h00.a;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import org.spongycastle.i18n.ErrorBundle;
import org.spongycastle.i18n.MessageBundle;
import v20.e1;
import v20.i;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.k;
import vz.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001mB\u0019\u0012\u0006\u0010Y\u001a\u00020X\u0012\b\b\u0002\u0010\\\u001a\u00020[¢\u0006\u0004\bk\u0010lJ\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u00000\u0004\"\u0006\b\u0000\u0010\u0003\u0018\u0001H\u0082\bJ!\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082\bJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082\bJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u001a\u0010%\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0014H\u0002J\u001c\u0010)\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001e2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001eH\u0002J5\u0010.\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b.\u0010/J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00101\u001a\u000200H\u0002J\u0010\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u000200H\u0002J \u00107\u001a\u0012\u0012\u0004\u0012\u00020\u000f05j\b\u0012\u0004\u0012\u00020\u000f`62\u0006\u0010\u0017\u001a\u000204H\u0002J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00101\u001a\u000200H\u0002J\u0010\u00109\u001a\u00020\u000f2\u0006\u00101\u001a\u000200H\u0002J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u00101\u001a\u000200H\u0002J\u0010\u0010;\u001a\u00020\u000f2\u0006\u00101\u001a\u000200H\u0002J\u001a\u0010=\u001a\u0004\u0018\u00010\u00142\u0006\u00101\u001a\u0002002\u0006\u0010<\u001a\u00020\u0014H\u0002J\u0018\u0010>\u001a\u00020\u00142\u0006\u00101\u001a\u0002002\u0006\u0010<\u001a\u00020\u0014H\u0002J\u0018\u0010?\u001a\u00020\u001e2\u0006\u00101\u001a\u0002002\u0006\u0010<\u001a\u00020\u0014H\u0002J\u0010\u0010@\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010D\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u0011H\u0002J\b\u0010E\u001a\u00020\u0014H\u0016J\u0010\u0010G\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020FH\u0016J\b\u0010H\u001a\u00020\nH\u0016J\u001a\u0010J\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010K\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010L\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0007J.\u0010M\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010N\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0007J\"\u0010P\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\"\u0010Q\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010R\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0007J\"\u0010S\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010T\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010U\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010V\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010W\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001d\u0010f\u001a\u00020a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001e\u0010j\u001a\n \u0005*\u0004\u0018\u00010g0g8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006n"}, d2 = {"Lexpo/modules/calendar/CalendarModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/core/interfaces/RegistryLifecycleListener;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lkotlin/Function0;", "Lvz/b0;", "block", "launchAsyncWithModuleScope", "withPermissions", "", "Landroid/os/Bundle;", "findCalendars", "", "startDate", "endDate", "", "calendars", "findEvents", "eventID", "findEventById", "calendarID", "findCalendarById", "findAttendeesByEventId", "Lexpo/modules/core/arguments/ReadableArguments;", ErrorBundle.DETAIL_ENTRY, "", "saveCalendar", "calendarId", "", "deleteCalendar", "saveEvent", "removeEvent", "saveAttendeeForEvent", "attendeeID", "deleteAttendee", "reminders", "createRemindersForEvent", "removeRemindersForEvent", "recurrence", "interval", "occurrence", "createRecurrenceRule", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "Landroid/database/Cursor;", "cursor", "serializeEvents", "serializeEvent", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "serializeAlarms", "serializeEventCalendars", "serializeEventCalendar", "serializeAttendees", "serializeAttendee", "columnName", "optStringFromCursor", "stringFromCursor", "optIntFromCursor", "checkPermissions", "Ljava/util/Calendar;", "calendar", "date", "setDateInCalendar", "getName", "Lexpo/modules/core/ModuleRegistry;", "onCreate", "onDestroy", "type", "getCalendarsAsync", "saveCalendarAsync", "deleteCalendarAsync", "getEventsAsync", "getEventByIdAsync", "options", "saveEventAsync", "deleteEventAsync", "getAttendeesForEventAsync", "saveAttendeeForEventAsync", "deleteAttendeeAsync", "openEventInCalendar", "requestCalendarPermissionsAsync", "getCalendarPermissionsAsync", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/text/SimpleDateFormat;", "Lexpo/modules/interfaces/permissions/Permissions;", "mPermissions$delegate", "Lvz/k;", "getMPermissions", "()Lexpo/modules/interfaces/permissions/Permissions;", "mPermissions", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistryDelegate;)V", "Companion", "expo-calendar_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CalendarModule extends ExportedModule {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = CalendarModule.class.getSimpleName();
    private final Context mContext;
    private final k mPermissions$delegate;
    private final o0 moduleCoroutineScope;
    private final ModuleRegistryDelegate moduleRegistryDelegate;
    private final SimpleDateFormat sdf;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/calendar/CalendarModule$Companion;", "", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG$expo_calendar_release", "()Ljava/lang/String;", "<init>", "()V", "expo-calendar_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG$expo_calendar_release() {
            return CalendarModule.TAG;
        }
    }

    public /* synthetic */ CalendarModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new ModuleRegistryDelegate() : moduleRegistryDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPermissions(Promise promise) {
        if (getMPermissions().hasGrantedPermissions("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR")) {
            return true;
        }
        promise.reject("E_MISSING_PERMISSIONS", "CALENDAR permission is required to do this operation.");
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final String createRecurrenceRule(String str, Integer num, String str2, Integer num2) {
        String str3;
        switch (str.hashCode()) {
            case -791707519:
                if (str.equals("weekly")) {
                    str3 = "FREQ=WEEKLY";
                    break;
                }
                str3 = "";
                break;
            case -734561654:
                if (str.equals("yearly")) {
                    str3 = "FREQ=YEARLY";
                    break;
                }
                str3 = "";
                break;
            case 95346201:
                if (str.equals("daily")) {
                    str3 = "FREQ=DAILY";
                    break;
                }
                str3 = "";
                break;
            case 1236635661:
                if (str.equals("monthly")) {
                    str3 = "FREQ=MONTHLY";
                    break;
                }
                str3 = "";
                break;
            default:
                str3 = "";
                break;
        }
        if (num != null) {
            str3 = str3 + ";INTERVAL=" + num;
        }
        if (str2 != null) {
            return str3 + ";UNTIL=" + str2;
        } else if (num2 != null) {
            return str3 + ";COUNT=" + num2;
        } else {
            return str3;
        }
    }

    private final void createRemindersForEvent(int i11, List<?> list) {
        int i12;
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            Object obj = list.get(i13);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Map map = (Map) obj;
            Object obj2 = map.get("relativeOffset");
            if (obj2 instanceof Number) {
                int i15 = -((Number) obj2).intValue();
                ContentValues contentValues = new ContentValues();
                if (map.containsKey("method")) {
                    Object obj3 = map.get("method");
                    i12 = JsValuesMappersKt.reminderConstantMatchingString(obj3 instanceof String ? (String) obj3 : null);
                } else {
                    i12 = 0;
                }
                contentValues.put("event_id", Integer.valueOf(i11));
                contentValues.put("minutes", Integer.valueOf(i15));
                contentValues.put("method", Integer.valueOf(i12));
                getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues);
            }
            if (i14 > size) {
                return;
            }
            i13 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deleteAttendee(String str) {
        Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Attendees.CONTENT_URI, Integer.parseInt(str));
        s.f(withAppendedId, "withAppendedId(CalendarC…endeeID.toInt().toLong())");
        return getContentResolver().delete(withAppendedId, null, null) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deleteCalendar(String str) {
        Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Calendars.CONTENT_URI, Integer.parseInt(str));
        s.f(withAppendedId, "withAppendedId(CalendarC…endarId.toInt().toLong())");
        return getContentResolver().delete(withAppendedId, null, null) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Bundle> findAttendeesByEventId(String str) {
        Cursor query = CalendarContract.Attendees.query(getContentResolver(), Long.parseLong(str), ConstantsKt.getFindAttendeesByEventIdQueryParameters());
        try {
            List<Bundle> serializeAttendees = serializeAttendees(query);
            b.a(query, null);
            return serializeAttendees;
        } finally {
        }
    }

    private final Bundle findCalendarById(String str) {
        Bundle bundle;
        Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Calendars.CONTENT_URI, Integer.parseInt(str));
        s.f(withAppendedId, "withAppendedId(CalendarC…endarID.toInt().toLong())");
        Cursor query = getContentResolver().query(withAppendedId, ConstantsKt.getFindCalendarByIdQueryFields(), null, null, null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    bundle = serializeEventCalendar(query);
                } else {
                    bundle = null;
                }
                b.a(query, null);
                return bundle;
            } finally {
            }
        } else {
            throw new IllegalArgumentException("Cursor shouldn't be null".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Bundle> findCalendars() {
        Cursor query = getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, ConstantsKt.getFindCalendarsQueryParameters(), null, null, null);
        if (query != null) {
            try {
                List<Bundle> serializeEventCalendars = serializeEventCalendars(query);
                b.a(query, null);
                return serializeEventCalendars;
            } finally {
            }
        } else {
            throw new IllegalArgumentException("Cursor shouldn't be null".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle findEventById(String str) {
        Bundle bundle;
        Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, Integer.parseInt(str));
        s.f(withAppendedId, "withAppendedId(CalendarC…eventID.toInt().toLong())");
        Cursor query = getContentResolver().query(withAppendedId, ConstantsKt.getFindEventByIdQueryParameters(), "((deleted != 1))", null, null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    bundle = serializeEvent(query);
                } else {
                    bundle = null;
                }
                b.a(query, null);
                return bundle;
            } finally {
            }
        } else {
            throw new IllegalArgumentException("Cursor shouldn't be null".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Bundle> findEvents(Object obj, Object obj2, List<String> list) {
        Calendar eStartDate = Calendar.getInstance();
        Calendar eEndDate = Calendar.getInstance();
        try {
            s.f(eStartDate, "eStartDate");
            setDateInCalendar(eStartDate, obj);
            s.f(eEndDate, "eEndDate");
            setDateInCalendar(eEndDate, obj2);
        } catch (ParseException e11) {
            Log.e(TAG, "error parsing", e11);
        } catch (Exception e12) {
            Log.e(TAG, "misc error parsing", e12);
        }
        Uri.Builder buildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
        ContentUris.appendId(buildUpon, eStartDate.getTimeInMillis());
        ContentUris.appendId(buildUpon, eEndDate.getTimeInMillis());
        Uri build = buildUpon.build();
        String str = "((begin >= " + eStartDate.getTimeInMillis() + ") AND (end <= " + eEndDate.getTimeInMillis() + ") AND (visible = 1) ";
        if (!list.isEmpty()) {
            String str2 = "AND (";
            int i11 = 0;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i12 = i11 + 1;
                    String str3 = list.get(i11);
                    str2 = str2 + "calendar_id = '" + ((Object) str3) + "'";
                    if (i11 != list.size() - 1) {
                        str2 = str2 + " OR ";
                    }
                    if (i12 > size) {
                        break;
                    }
                    i11 = i12;
                }
            }
            str = str + (str2 + ")");
        }
        Cursor query = getContentResolver().query(build, ConstantsKt.getFindEventsQueryParameters(), str + ")", null, null);
        if (query != null) {
            try {
                List<Bundle> serializeEvents = serializeEvents(query);
                b.a(query, null);
                return serializeEvents;
            } finally {
            }
        } else {
            throw new IllegalArgumentException("Cursor shouldn't be null".toString());
        }
    }

    private final ContentResolver getContentResolver() {
        return this.mContext.getContentResolver();
    }

    private final Permissions getMPermissions() {
        Object value = this.mPermissions$delegate.getValue();
        s.f(value, "<get-mPermissions>(...)");
        return (Permissions) value;
    }

    private final void launchAsyncWithModuleScope(Promise promise, a<b0> aVar) {
        i.d(this.moduleCoroutineScope, null, null, new CalendarModule$launchAsyncWithModuleScope$1(aVar, promise, null), 3, null);
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        return l.a(new CalendarModule$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
    }

    private final int optIntFromCursor(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    private final String optStringFromCursor(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeEvent(ReadableArguments readableArguments) {
        String string = readableArguments.getString("id");
        s.f(string, "details.getString(\"id\")");
        int parseInt = Integer.parseInt(string);
        if (!readableArguments.containsKey("instanceStartDate")) {
            Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, parseInt);
            s.f(withAppendedId, "withAppendedId(CalendarC…NT_URI, eventID.toLong())");
            return getContentResolver().delete(withAppendedId, null, null) > 0;
        }
        ContentValues contentValues = new ContentValues();
        Calendar calendar = Calendar.getInstance();
        Object obj = readableArguments.get("instanceStartDate");
        try {
            if (obj instanceof String) {
                Date parse = this.sdf.parse((String) obj);
                if (parse != null) {
                    calendar.setTime(parse);
                    contentValues.put("originalInstanceTime", Long.valueOf(calendar.getTimeInMillis()));
                } else {
                    Log.e(TAG, "Parsed date is null");
                }
            } else if (obj instanceof Number) {
                contentValues.put("originalInstanceTime", Long.valueOf(((Number) obj).longValue()));
            }
            contentValues.put("eventStatus", (Integer) 2);
            Uri withAppendedId2 = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_EXCEPTION_URI, parseInt);
            s.f(withAppendedId2, "withAppendedId(CalendarC…ON_URI, eventID.toLong())");
            getContentResolver().insert(withAppendedId2, contentValues);
            return true;
        } catch (ParseException e11) {
            Log.e(TAG, "error", e11);
            throw e11;
        }
    }

    private final void removeRemindersForEvent(int i11) {
        Cursor query = CalendarContract.Reminders.query(getContentResolver(), i11, new String[]{EXColumns.ID});
        while (query.moveToNext()) {
            Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Reminders.CONTENT_URI, query.getLong(0));
            s.f(withAppendedId, "withAppendedId(CalendarC…T_URI, cursor.getLong(0))");
            getContentResolver().delete(withAppendedId, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int saveAttendeeForEvent(ReadableArguments readableArguments, String str) {
        boolean z11 = !readableArguments.containsKey("id");
        AttendeeBuilder putString = new AttendeeBuilder(readableArguments).putString("name", "attendeeName").putString("email", "attendeeEmail", z11).putString("role", "attendeeRelationship", Boolean.valueOf(z11), CalendarModule$saveAttendeeForEvent$attendeeBuilder$1.INSTANCE).putString("type", "attendeeType", Boolean.valueOf(z11), CalendarModule$saveAttendeeForEvent$attendeeBuilder$2.INSTANCE).putString(PermissionsResponse.STATUS_KEY, "attendeeStatus", Boolean.valueOf(z11), CalendarModule$saveAttendeeForEvent$attendeeBuilder$3.INSTANCE);
        if (z11) {
            putString.put("event_id", str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
            Uri insert = getContentResolver().insert(CalendarContract.Attendees.CONTENT_URI, putString.build());
            s.e(insert);
            String lastPathSegment = insert.getLastPathSegment();
            s.e(lastPathSegment);
            s.f(lastPathSegment, "attendeeUri!!.lastPathSegment!!");
            return Integer.parseInt(lastPathSegment);
        }
        String string = readableArguments.getString("id");
        s.f(string, "details.getString(\"id\")");
        int parseInt = Integer.parseInt(string);
        Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Attendees.CONTENT_URI, parseInt);
        s.f(withAppendedId, "withAppendedId(CalendarC…URI, attendeeID.toLong())");
        getContentResolver().update(withAppendedId, putString.build(), null, null);
        return parseInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int saveCalendar(ReadableArguments readableArguments) {
        CalendarEventBuilder calendarEventBuilder = new CalendarEventBuilder(readableArguments);
        calendarEventBuilder.putEventString("name", "name").putEventString("calendar_displayName", MessageBundle.TITLE_ENTRY).putEventBoolean("visible", "isVisible").putEventBoolean("sync_events", "isSynced");
        if (readableArguments.containsKey("id")) {
            String string = readableArguments.getString("id");
            s.f(string, "details.getString(\"id\")");
            int parseInt = Integer.parseInt(string);
            Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Calendars.CONTENT_URI, parseInt);
            s.f(withAppendedId, "withAppendedId(CalendarC…URI, calendarID.toLong())");
            getContentResolver().update(withAppendedId, calendarEventBuilder.build(), null, null);
            return parseInt;
        }
        calendarEventBuilder.checkIfContainsRequiredKeys("name", MessageBundle.TITLE_ENTRY, Stripe3ds2AuthParams.FIELD_SOURCE, "color", "accessLevel", "ownerAccount");
        ReadableArguments arguments = readableArguments.getArguments(Stripe3ds2AuthParams.FIELD_SOURCE);
        if (arguments.containsKey("name")) {
            boolean z11 = arguments.containsKey("isLocalAccount") ? arguments.getBoolean("isLocalAccount") : false;
            if (!arguments.containsKey("type") && !z11) {
                throw new Exception("new calendars require a `source` object with a `type`, or `isLocalAccount`: true");
            }
            String string2 = arguments.getString("name");
            s.f(string2, "source.getString(\"name\")");
            CalendarEventBuilder put = calendarEventBuilder.put("account_name", string2);
            String string3 = z11 ? "LOCAL" : arguments.getString("type");
            s.f(string3, "if (isLocalAccount) Cale… source.getString(\"type\")");
            CalendarEventBuilder put2 = put.put("account_type", string3).put("calendar_color", readableArguments.getInt("color"));
            String string4 = readableArguments.getString("accessLevel");
            s.f(string4, "details.getString(\"accessLevel\")");
            CalendarEventBuilder put3 = put2.put("calendar_access_level", JsValuesMappersKt.calAccessConstantMatchingString(string4));
            String string5 = readableArguments.getString("ownerAccount");
            s.f(string5, "details.getString(\"ownerAccount\")");
            put3.put("ownerAccount", string5).putEventTimeZone("calendar_timezone", "timeZone").putEventDetailsList("allowedReminders", "allowedReminders", CalendarModule$saveCalendar$1.INSTANCE).putEventDetailsList("allowedAvailability", "allowedAvailabilities", CalendarModule$saveCalendar$2.INSTANCE).putEventDetailsList("allowedAttendeeTypes", "allowedAttendeeTypes", CalendarModule$saveCalendar$3.INSTANCE);
            Uri insert = getContentResolver().insert(CalendarContract.Calendars.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", arguments.getString("name")).appendQueryParameter("account_type", z11 ? "LOCAL" : arguments.getString("type")).build(), calendarEventBuilder.build());
            s.e(insert);
            String lastPathSegment = insert.getLastPathSegment();
            s.e(lastPathSegment);
            s.f(lastPathSegment, "calendarUri!!.lastPathSegment!!");
            return Integer.parseInt(lastPathSegment);
        }
        throw new Exception("new calendars require a `source` object with a `name`");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int saveEvent(expo.modules.core.arguments.ReadableArguments r15) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.calendar.CalendarModule.saveEvent(expo.modules.core.arguments.ReadableArguments):int");
    }

    private final ArrayList<Bundle> serializeAlarms(long j11) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Cursor query = CalendarContract.Reminders.query(getContentResolver(), j11, new String[]{"minutes", "method"});
        while (query.moveToNext()) {
            Bundle bundle = new Bundle();
            bundle.putInt("relativeOffset", -query.getInt(0));
            bundle.putString("method", JsValuesMappersKt.reminderStringMatchingConstant(query.getInt(1)));
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final Bundle serializeAttendee(Cursor cursor) {
        Bundle bundle = new Bundle();
        bundle.putString("id", optStringFromCursor(cursor, EXColumns.ID));
        bundle.putString("name", optStringFromCursor(cursor, "attendeeName"));
        bundle.putString("email", optStringFromCursor(cursor, "attendeeEmail"));
        bundle.putString("role", JsValuesMappersKt.attendeeRelationshipStringMatchingConstant(optIntFromCursor(cursor, "attendeeRelationship")));
        bundle.putString("type", JsValuesMappersKt.attendeeTypeStringMatchingConstant(optIntFromCursor(cursor, "attendeeType")));
        bundle.putString(PermissionsResponse.STATUS_KEY, JsValuesMappersKt.attendeeStatusStringMatchingConstant(optIntFromCursor(cursor, "attendeeStatus")));
        return bundle;
    }

    private final List<Bundle> serializeAttendees(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(serializeAttendee(cursor));
        }
        return arrayList;
    }

    private final Bundle serializeEvent(Cursor cursor) {
        String str;
        Bundle bundle;
        List E0;
        List E02;
        List E03;
        List E04;
        List E05;
        List E06;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        String string = cursor.getString(3);
        String str2 = "";
        if (string != null) {
            calendar.setTimeInMillis(Long.parseLong(string));
            String format = this.sdf.format(calendar.getTime());
            s.f(format, "sdf.format(foundStartDate.time)");
            str = format;
        } else {
            str = "";
        }
        String string2 = cursor.getString(4);
        if (string2 != null) {
            calendar2.setTimeInMillis(Long.parseLong(string2));
            str2 = this.sdf.format(calendar2.getTime());
            s.f(str2, "sdf.format(foundEndDate.time)");
        }
        String optStringFromCursor = optStringFromCursor(cursor, "rrule");
        if (optStringFromCursor != null) {
            bundle = new Bundle();
            E0 = w.E0(optStringFromCursor, new String[]{";"}, false, 0, 6, null);
            Object[] array = E0.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            E02 = w.E0(strArr[0], new String[]{"="}, false, 0, 6, null);
            Object[] array2 = E02.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String str3 = ((String[]) array2)[1];
            Locale locale = Locale.getDefault();
            s.f(locale, "getDefault()");
            String lowerCase = str3.toLowerCase(locale);
            s.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            bundle.putString("frequency", lowerCase);
            if (strArr.length >= 2) {
                E05 = w.E0(strArr[1], new String[]{"="}, false, 0, 6, null);
                Object[] array3 = E05.toArray(new String[0]);
                Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                if (s.c(((String[]) array3)[0], "INTERVAL")) {
                    E06 = w.E0(strArr[1], new String[]{"="}, false, 0, 6, null);
                    Object[] array4 = E06.toArray(new String[0]);
                    Objects.requireNonNull(array4, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    bundle.putInt("interval", Integer.parseInt(((String[]) array4)[1]));
                }
            }
            if (strArr.length >= 3) {
                E03 = w.E0(strArr[2], new String[]{"="}, false, 0, 6, null);
                Object[] array5 = E03.toArray(new String[0]);
                Objects.requireNonNull(array5, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr2 = (String[]) array5;
                if (strArr2.length >= 2) {
                    if (s.c(strArr2[0], "UNTIL")) {
                        try {
                            Date parse = this.sdf.parse(strArr2[1]);
                            bundle.putString("endDate", parse == null ? null : parse.toString());
                        } catch (NullPointerException e11) {
                            Log.e(TAG, "endDate is null", e11);
                        } catch (ParseException e12) {
                            Log.e(TAG, "Couldn't parse the `endDate` property.", e12);
                        }
                    } else if (s.c(strArr2[0], "COUNT")) {
                        E04 = w.E0(strArr[2], new String[]{"="}, false, 0, 6, null);
                        Object[] array6 = E04.toArray(new String[0]);
                        Objects.requireNonNull(array6, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        bundle.putInt("occurrence", Integer.parseInt(((String[]) array6)[1]));
                    }
                }
                Log.e(TAG, "Couldn't parse termination rules: '" + strArr[2] + "'.", null);
            }
        } else {
            bundle = null;
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putBundle("recurrenceRule", bundle);
        }
        bundle2.putString("id", cursor.getString(0));
        bundle2.putString("calendarId", optStringFromCursor(cursor, "calendar_id"));
        bundle2.putString(MessageBundle.TITLE_ENTRY, optStringFromCursor(cursor, MessageBundle.TITLE_ENTRY));
        bundle2.putString("notes", optStringFromCursor(cursor, "description"));
        bundle2.putString("startDate", str);
        bundle2.putString("endDate", str2);
        bundle2.putBoolean("allDay", optIntFromCursor(cursor, "allDay") != 0);
        bundle2.putString(Kind.LOCATION, optStringFromCursor(cursor, "eventLocation"));
        bundle2.putString("availability", JsValuesMappersKt.availabilityStringMatchingConstant(optIntFromCursor(cursor, "availability")));
        bundle2.putParcelableArrayList("alarms", serializeAlarms(cursor.getLong(0)));
        bundle2.putString("organizerEmail", optStringFromCursor(cursor, "organizer"));
        bundle2.putString("timeZone", optStringFromCursor(cursor, "eventTimezone"));
        bundle2.putString("endTimeZone", optStringFromCursor(cursor, "eventEndTimezone"));
        bundle2.putString("accessLevel", JsValuesMappersKt.accessStringMatchingConstant(optIntFromCursor(cursor, "accessLevel")));
        bundle2.putBoolean("guestsCanModify", optIntFromCursor(cursor, "guestsCanModify") != 0);
        bundle2.putBoolean("guestsCanInviteOthers", optIntFromCursor(cursor, "guestsCanInviteOthers") != 0);
        bundle2.putBoolean("guestsCanSeeGuests", optIntFromCursor(cursor, "guestsCanSeeGuests") != 0);
        bundle2.putString("originalId", optStringFromCursor(cursor, "original_id"));
        if (cursor.getColumnCount() > 18) {
            bundle2.putString("instanceId", cursor.getString(18));
        }
        return bundle2;
    }

    private final Bundle serializeEventCalendar(Cursor cursor) {
        Bundle bundle = new Bundle();
        bundle.putString("id", optStringFromCursor(cursor, EXColumns.ID));
        bundle.putString(MessageBundle.TITLE_ENTRY, optStringFromCursor(cursor, "calendar_displayName"));
        boolean z11 = true;
        bundle.putBoolean("isPrimary", optStringFromCursor(cursor, "isPrimary") == "1");
        bundle.putStringArrayList("allowedAvailabilities", JsValuesMappersKt.calendarAllowedAvailabilitiesFromDBString(stringFromCursor(cursor, "allowedAvailability")));
        bundle.putString("name", optStringFromCursor(cursor, "name"));
        q0 q0Var = q0.f34921a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & optIntFromCursor(cursor, "calendar_color"))}, 1));
        s.f(format, "format(format, *args)");
        bundle.putString("color", format);
        bundle.putString("ownerAccount", optStringFromCursor(cursor, "ownerAccount"));
        bundle.putString("timeZone", optStringFromCursor(cursor, "calendar_timezone"));
        bundle.putStringArrayList("allowedReminders", JsValuesMappersKt.calendarAllowedRemindersFromDBString(stringFromCursor(cursor, "allowedReminders")));
        bundle.putStringArrayList("allowedAttendeeTypes", JsValuesMappersKt.calendarAllowedAttendeeTypesFromDBString(stringFromCursor(cursor, "allowedAttendeeTypes")));
        bundle.putBoolean("isVisible", optIntFromCursor(cursor, "visible") != 0);
        bundle.putBoolean("isSynced", optIntFromCursor(cursor, "sync_events") != 0);
        int optIntFromCursor = optIntFromCursor(cursor, "calendar_access_level");
        bundle.putString("accessLevel", JsValuesMappersKt.calAccessStringMatchingConstant(optIntFromCursor));
        if (optIntFromCursor != 800 && optIntFromCursor != 700 && optIntFromCursor != 600 && optIntFromCursor != 500) {
            z11 = false;
        }
        bundle.putBoolean("allowsModifications", z11);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", optStringFromCursor(cursor, "account_name"));
        String optStringFromCursor = optStringFromCursor(cursor, "account_type");
        bundle2.putString("type", optStringFromCursor);
        bundle2.putBoolean("isLocalAccount", s.c(optStringFromCursor, "LOCAL"));
        bundle.putBundle(Stripe3ds2AuthParams.FIELD_SOURCE, bundle2);
        return bundle;
    }

    private final List<Bundle> serializeEventCalendars(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(serializeEventCalendar(cursor));
        }
        return arrayList;
    }

    private final List<Bundle> serializeEvents(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(serializeEvent(cursor));
        }
        return arrayList;
    }

    private final void setDateInCalendar(Calendar calendar, Object obj) {
        if (obj instanceof String) {
            Date parse = this.sdf.parse((String) obj);
            if (parse != null) {
                calendar.setTime(parse);
            } else {
                Log.e(TAG, "Parsed date is null");
            }
        } else if (obj instanceof Number) {
            calendar.setTimeInMillis(((Number) obj).longValue());
        } else {
            Log.e(TAG, "date has unsupported type");
        }
    }

    private final String stringFromCursor(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            String string = cursor.getString(columnIndex);
            s.f(string, "cursor.getString(index)");
            return string;
        }
        throw new Exception("String not found");
    }

    private final void withPermissions(Promise promise, a<b0> aVar) {
        if (checkPermissions(promise)) {
            aVar.invoke();
        }
    }

    @ExpoMethod
    public final void deleteAttendeeAsync(String attendeeID, Promise promise) {
        s.g(attendeeID, "attendeeID");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$deleteAttendeeAsync$lambda20$$inlined$launchAsyncWithModuleScope$1(promise, null, this, attendeeID, promise), 3, null);
        }
    }

    @ExpoMethod
    public final void deleteCalendarAsync(String calendarID, Promise promise) {
        s.g(calendarID, "calendarID");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$deleteCalendarAsync$lambda6$$inlined$launchAsyncWithModuleScope$1(promise, null, this, calendarID, promise), 3, null);
        }
    }

    @ExpoMethod
    public final void deleteEventAsync(ReadableArguments details, ReadableArguments readableArguments, Promise promise) {
        s.g(details, "details");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$deleteEventAsync$lambda14$$inlined$launchAsyncWithModuleScope$1(promise, null, this, details, promise), 3, null);
        }
    }

    @ExpoMethod
    public final void getAttendeesForEventAsync(String eventID, Promise promise) {
        s.g(eventID, "eventID");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$getAttendeesForEventAsync$lambda16$$inlined$launchAsyncWithModuleScope$1(promise, null, this, eventID, promise), 3, null);
        }
    }

    @ExpoMethod
    public final void getCalendarPermissionsAsync(Promise promise) {
        s.g(promise, "promise");
        getMPermissions().getPermissionsWithPromise(promise, "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
    }

    @ExpoMethod
    public final void getCalendarsAsync(String str, Promise promise) {
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            if (str == null || !s.c(str, "reminder")) {
                i.d(this.moduleCoroutineScope, null, null, new CalendarModule$getCalendarsAsync$lambda2$$inlined$launchAsyncWithModuleScope$1(promise, null, this, promise), 3, null);
            } else {
                promise.reject("E_CALENDARS_NOT_FOUND", "Calendars of type `reminder` are not supported on Android");
            }
        }
    }

    @ExpoMethod
    public final void getEventByIdAsync(String eventID, Promise promise) {
        s.g(eventID, "eventID");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$getEventByIdAsync$lambda10$$inlined$launchAsyncWithModuleScope$1(promise, null, this, eventID, promise), 3, null);
        }
    }

    @ExpoMethod
    public final void getEventsAsync(Object startDate, Object endDate, List<String> calendars, Promise promise) {
        s.g(startDate, "startDate");
        s.g(endDate, "endDate");
        s.g(calendars, "calendars");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$getEventsAsync$lambda8$$inlined$launchAsyncWithModuleScope$1(promise, null, this, startDate, endDate, calendars, promise), 3, null);
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoCalendar";
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onDestroy() {
        try {
            p0.c(this.moduleCoroutineScope, new ModuleDestroyedException());
        } catch (IllegalStateException unused) {
            Log.e(TAG, "The scope does not have a job in it");
        }
    }

    @ExpoMethod
    public final void openEventInCalendar(int i11, Promise promise) {
        s.g(promise, "promise");
        Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, i11);
        s.f(withAppendedId, "withAppendedId(CalendarC…NT_URI, eventID.toLong())");
        Intent data = new Intent("android.intent.action.VIEW").addFlags(268435456).setData(withAppendedId);
        s.f(data, "Intent(Intent.ACTION_VIE…TY_NEW_TASK).setData(uri)");
        if (data.resolveActivity(this.mContext.getPackageManager()) != null) {
            this.mContext.startActivity(data);
        }
        promise.resolve(null);
    }

    @ExpoMethod
    public final void requestCalendarPermissionsAsync(Promise promise) {
        getMPermissions().askForPermissionsWithPromise(promise, "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
    }

    @ExpoMethod
    public final void saveAttendeeForEventAsync(ReadableArguments details, String str, Promise promise) {
        s.g(details, "details");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$saveAttendeeForEventAsync$lambda18$$inlined$launchAsyncWithModuleScope$1(promise, null, this, details, str, promise), 3, null);
        }
    }

    @ExpoMethod
    public final void saveCalendarAsync(ReadableArguments details, Promise promise) {
        s.g(details, "details");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$saveCalendarAsync$lambda4$$inlined$launchAsyncWithModuleScope$1(promise, null, this, details, promise), 3, null);
        }
    }

    @ExpoMethod
    public final void saveEventAsync(ReadableArguments details, ReadableArguments readableArguments, Promise promise) {
        s.g(details, "details");
        s.g(promise, "promise");
        if (checkPermissions(promise)) {
            i.d(this.moduleCoroutineScope, null, null, new CalendarModule$saveEventAsync$lambda12$$inlined$launchAsyncWithModuleScope$1(promise, null, this, details, promise), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarModule(Context mContext, ModuleRegistryDelegate moduleRegistryDelegate) {
        super(mContext);
        s.g(mContext, "mContext");
        s.g(moduleRegistryDelegate, "moduleRegistryDelegate");
        this.mContext = mContext;
        this.moduleRegistryDelegate = moduleRegistryDelegate;
        this.mPermissions$delegate = l.a(new CalendarModule$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        this.moduleCoroutineScope = p0.a(e1.a());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        b0 b0Var = b0.f54756a;
        this.sdf = simpleDateFormat;
    }
}