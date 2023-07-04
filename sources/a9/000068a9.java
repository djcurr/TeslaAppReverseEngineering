package expo.modules.calendar;

import android.content.ContentValues;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.core.arguments.ReadableArguments;
import h00.l;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J*\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0013J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u001e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J2\u0010\u0019\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0013J\u0006\u0010\u001b\u001a\u00020\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lexpo/modules/calendar/CalendarEventBuilder;", "", "", Action.KEY_ATTRIBUTE, "checkDetailsContainsRequiredKey", "", "getAsLong", "value", "put", "", "", "putNull", "", "keys", "checkIfContainsRequiredKeys", "([Ljava/lang/String;)Lexpo/modules/calendar/CalendarEventBuilder;", "eventKey", "detailsKey", "putEventString", "Lkotlin/Function1;", "mapper", "putEventBoolean", "putEventTimeZone", "OutputListItemType", "mappingMethod", "putEventDetailsList", "Landroid/content/ContentValues;", "build", "Lexpo/modules/core/arguments/ReadableArguments;", "eventDetails", "Lexpo/modules/core/arguments/ReadableArguments;", "eventValues", "Landroid/content/ContentValues;", "<init>", "(Lexpo/modules/core/arguments/ReadableArguments;)V", "expo-calendar_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CalendarEventBuilder {
    private final ReadableArguments eventDetails;
    private final ContentValues eventValues;

    public CalendarEventBuilder(ReadableArguments eventDetails) {
        s.g(eventDetails, "eventDetails");
        this.eventDetails = eventDetails;
        this.eventValues = new ContentValues();
    }

    private final CalendarEventBuilder checkDetailsContainsRequiredKey(String str) {
        if (this.eventDetails.containsKey(str)) {
            return this;
        }
        throw new Exception("new calendars require " + str);
    }

    public final ContentValues build() {
        return this.eventValues;
    }

    public final CalendarEventBuilder checkIfContainsRequiredKeys(String... keys) {
        s.g(keys, "keys");
        int length = keys.length;
        int i11 = 0;
        while (i11 < length) {
            String str = keys[i11];
            i11++;
            checkDetailsContainsRequiredKey(str);
        }
        return this;
    }

    public final long getAsLong(String key) {
        s.g(key, "key");
        Long asLong = this.eventValues.getAsLong(key);
        s.f(asLong, "eventValues.getAsLong(key)");
        return asLong.longValue();
    }

    public final CalendarEventBuilder put(String key, String value) {
        s.g(key, "key");
        s.g(value, "value");
        this.eventValues.put(key, value);
        return this;
    }

    public final CalendarEventBuilder putEventBoolean(String eventKey, String detailsKey) {
        s.g(eventKey, "eventKey");
        s.g(detailsKey, "detailsKey");
        if (this.eventDetails.containsKey(detailsKey)) {
            this.eventValues.put(eventKey, Integer.valueOf(this.eventDetails.getBoolean(detailsKey) ? 1 : 0));
        }
        return this;
    }

    public final <OutputListItemType> CalendarEventBuilder putEventDetailsList(String eventKey, String detailsKey, l<Object, ? extends OutputListItemType> mappingMethod) {
        int t11;
        s.g(eventKey, "eventKey");
        s.g(detailsKey, "detailsKey");
        s.g(mappingMethod, "mappingMethod");
        if (this.eventDetails.containsKey(eventKey)) {
            List<Object> array = this.eventDetails.getList(eventKey);
            s.f(array, "array");
            t11 = x.t(array, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (Object obj : array) {
                arrayList.add(mappingMethod.invoke(obj));
            }
            this.eventValues.put(detailsKey, TextUtils.join(",", arrayList));
        }
        return this;
    }

    public final CalendarEventBuilder putEventString(String eventKey, String detailsKey) {
        s.g(eventKey, "eventKey");
        s.g(detailsKey, "detailsKey");
        if (this.eventDetails.containsKey(detailsKey)) {
            this.eventValues.put(eventKey, this.eventDetails.getString(detailsKey));
        }
        return this;
    }

    public final CalendarEventBuilder putEventTimeZone(String eventKey, String detailsKey) {
        String id2;
        s.g(eventKey, "eventKey");
        s.g(detailsKey, "detailsKey");
        ContentValues contentValues = this.eventValues;
        if (this.eventDetails.containsKey(detailsKey)) {
            id2 = this.eventDetails.getString(detailsKey);
        } else {
            id2 = TimeZone.getDefault().getID();
        }
        contentValues.put(eventKey, id2);
        return this;
    }

    public final CalendarEventBuilder putNull(String key) {
        s.g(key, "key");
        this.eventValues.putNull(key);
        return this;
    }

    public final CalendarEventBuilder put(String key, int i11) {
        s.g(key, "key");
        this.eventValues.put(key, Integer.valueOf(i11));
        return this;
    }

    public final CalendarEventBuilder put(String key, long j11) {
        s.g(key, "key");
        this.eventValues.put(key, Long.valueOf(j11));
        return this;
    }

    public final CalendarEventBuilder putEventBoolean(String eventKey, String detailsKey, boolean z11) {
        s.g(eventKey, "eventKey");
        s.g(detailsKey, "detailsKey");
        if (this.eventDetails.containsKey(detailsKey)) {
            this.eventValues.put(eventKey, Boolean.valueOf(z11));
        }
        return this;
    }

    public final CalendarEventBuilder putEventString(String eventKey, String detailsKey, l<? super String, Integer> mapper) {
        s.g(eventKey, "eventKey");
        s.g(detailsKey, "detailsKey");
        s.g(mapper, "mapper");
        if (this.eventDetails.containsKey(detailsKey)) {
            ContentValues contentValues = this.eventValues;
            String string = this.eventDetails.getString(detailsKey);
            s.f(string, "eventDetails.getString(detailsKey)");
            contentValues.put(eventKey, mapper.invoke(string));
        }
        return this;
    }

    public final CalendarEventBuilder put(String key, boolean z11) {
        s.g(key, "key");
        this.eventValues.put(key, Boolean.valueOf(z11));
        return this;
    }
}