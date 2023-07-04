package expo.modules.calendar;

import android.content.ContentValues;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.core.arguments.ReadableArguments;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ;\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\n\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lexpo/modules/calendar/AttendeeBuilder;", "", "", Action.KEY_ATTRIBUTE, "", "value", "put", "(Ljava/lang/String;Ljava/lang/Integer;)Lexpo/modules/calendar/AttendeeBuilder;", "detailsKey", "detailsString", "putString", "", "isRequired", "Lkotlin/Function1;", "mapper", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lh00/l;)Lexpo/modules/calendar/AttendeeBuilder;", "Landroid/content/ContentValues;", "build", "Lexpo/modules/core/arguments/ReadableArguments;", "attendeeDetails", "Lexpo/modules/core/arguments/ReadableArguments;", "attendeeValues", "Landroid/content/ContentValues;", "<init>", "(Lexpo/modules/core/arguments/ReadableArguments;)V", "expo-calendar_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AttendeeBuilder {
    private final ReadableArguments attendeeDetails;
    private final ContentValues attendeeValues;

    public AttendeeBuilder(ReadableArguments attendeeDetails) {
        s.g(attendeeDetails, "attendeeDetails");
        this.attendeeDetails = attendeeDetails;
        this.attendeeValues = new ContentValues();
    }

    public final ContentValues build() {
        return this.attendeeValues;
    }

    public final AttendeeBuilder put(String key, Integer num) {
        s.g(key, "key");
        this.attendeeValues.put(key, num);
        return this;
    }

    public final AttendeeBuilder putString(String detailsKey, String detailsString) {
        s.g(detailsKey, "detailsKey");
        s.g(detailsString, "detailsString");
        if (this.attendeeDetails.containsKey(detailsKey)) {
            this.attendeeValues.put(detailsString, this.attendeeDetails.getString(detailsKey));
        }
        return this;
    }

    public final AttendeeBuilder putString(String detailsKey, String detailsString, boolean z11) {
        s.g(detailsKey, "detailsKey");
        s.g(detailsString, "detailsString");
        if (this.attendeeDetails.containsKey(detailsKey)) {
            this.attendeeValues.put(detailsString, this.attendeeDetails.getString(detailsKey));
        } else if (z11) {
            throw new Exception("new attendees require `" + detailsKey + "`");
        }
        return this;
    }

    public final AttendeeBuilder putString(String detailsKey, String detailsString, Boolean bool, l<? super String, Integer> mapper) {
        s.g(detailsKey, "detailsKey");
        s.g(detailsString, "detailsString");
        s.g(mapper, "mapper");
        if (this.attendeeDetails.containsKey(detailsKey)) {
            ContentValues contentValues = this.attendeeValues;
            String string = this.attendeeDetails.getString(detailsKey);
            s.f(string, "attendeeDetails.getString(detailsKey)");
            contentValues.put(detailsString, mapper.invoke(string));
        } else if (s.c(bool, Boolean.TRUE)) {
            throw new Exception("new attendees require `" + detailsKey + "`");
        }
        return this;
    }
}