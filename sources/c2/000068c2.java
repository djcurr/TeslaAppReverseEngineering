package expo.modules.calendar;

import expo.modules.contacts.EXColumns;
import kotlin.Metadata;
import org.spongycastle.i18n.MessageBundle;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\"\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005\"\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005\"\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"", "", "findCalendarByIdQueryFields", "[Ljava/lang/String;", "getFindCalendarByIdQueryFields", "()[Ljava/lang/String;", "findAttendeesByEventIdQueryParameters", "getFindAttendeesByEventIdQueryParameters", "findEventByIdQueryParameters", "getFindEventByIdQueryParameters", "findEventsQueryParameters", "getFindEventsQueryParameters", "findCalendarsQueryParameters", "getFindCalendarsQueryParameters", "expo-calendar_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ConstantsKt {
    private static final String[] findCalendarByIdQueryFields = {EXColumns.ID, "calendar_displayName", "account_name", "isPrimary", "calendar_access_level", "allowedAvailability", "name", "account_type", "calendar_color", "ownerAccount", "calendar_timezone", "allowedReminders", "allowedAttendeeTypes", "visible", "sync_events"};
    private static final String[] findAttendeesByEventIdQueryParameters = {EXColumns.ID, "attendeeName", "attendeeEmail", "attendeeRelationship", "attendeeType", "attendeeStatus"};
    private static final String[] findEventByIdQueryParameters = {EXColumns.ID, MessageBundle.TITLE_ENTRY, "description", "dtstart", "dtend", "allDay", "eventLocation", "rrule", "calendar_id", "availability", "organizer", "eventTimezone", "eventEndTimezone", "accessLevel", "guestsCanModify", "guestsCanInviteOthers", "guestsCanSeeGuests", "original_id"};
    private static final String[] findEventsQueryParameters = {"event_id", MessageBundle.TITLE_ENTRY, "description", "begin", "end", "allDay", "eventLocation", "rrule", "calendar_id", "availability", "organizer", "eventTimezone", "eventEndTimezone", "accessLevel", "guestsCanModify", "guestsCanInviteOthers", "guestsCanSeeGuests", "original_id", EXColumns.ID};
    private static final String[] findCalendarsQueryParameters = {EXColumns.ID, "calendar_displayName", "account_name", "isPrimary", "calendar_access_level", "allowedAvailability", "name", "account_type", "calendar_color", "ownerAccount", "calendar_timezone", "allowedReminders", "allowedAttendeeTypes", "visible", "sync_events"};

    public static final String[] getFindAttendeesByEventIdQueryParameters() {
        return findAttendeesByEventIdQueryParameters;
    }

    public static final String[] getFindCalendarByIdQueryFields() {
        return findCalendarByIdQueryFields;
    }

    public static final String[] getFindCalendarsQueryParameters() {
        return findCalendarsQueryParameters;
    }

    public static final String[] getFindEventByIdQueryParameters() {
        return findEventByIdQueryParameters;
    }

    public static final String[] getFindEventsQueryParameters() {
        return findEventsQueryParameters;
    }
}