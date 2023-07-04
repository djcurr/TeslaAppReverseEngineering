package expo.modules.calendar;

import android.util.Log;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a \u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u001a \u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¨\u0006\u0018"}, d2 = {"", "constant", "", "reminderStringMatchingConstant", "string", "reminderConstantMatchingString", "dbString", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "calendarAllowedRemindersFromDBString", "calendarAllowedAvailabilitiesFromDBString", "availabilityStringMatchingConstant", "availabilityConstantMatchingString", "accessStringMatchingConstant", "accessConstantMatchingString", "calAccessStringMatchingConstant", "calAccessConstantMatchingString", "attendeeRelationshipStringMatchingConstant", "attendeeRelationshipConstantMatchingString", "attendeeTypeStringMatchingConstant", "attendeeTypeConstantMatchingString", "calendarAllowedAttendeeTypesFromDBString", "attendeeStatusStringMatchingConstant", "attendeeStatusConstantMatchingString", "expo-calendar_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class JsValuesMappersKt {
    public static final int accessConstantMatchingString(String string) {
        s.g(string, "string");
        int hashCode = string.hashCode();
        if (hashCode != -1952990840) {
            if (hashCode != -977423767) {
                if (hashCode == -314497661 && string.equals("private")) {
                    return 2;
                }
            } else if (string.equals("public")) {
                return 3;
            }
        } else if (string.equals("confidential")) {
            return 1;
        }
        return 0;
    }

    public static final String accessStringMatchingConstant(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? "default" : "public" : "private" : "confidential" : "default";
    }

    public static final int attendeeRelationshipConstantMatchingString(String string) {
        s.g(string, "string");
        switch (string.hashCode()) {
            case -2141605073:
                if (string.equals("organizer")) {
                    return 2;
                }
                break;
            case -2008522753:
                if (string.equals("speaker")) {
                    return 4;
                }
                break;
            case 481140686:
                if (string.equals("performer")) {
                    return 3;
                }
                break;
            case 542756026:
                if (string.equals("attendee")) {
                    return 1;
                }
                break;
        }
        return 0;
    }

    public static final String attendeeRelationshipStringMatchingConstant(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? PermissionsResponse.SCOPE_NONE : "speaker" : "performer" : "organizer" : "attendee" : PermissionsResponse.SCOPE_NONE;
    }

    public static final int attendeeStatusConstantMatchingString(String string) {
        s.g(string, "string");
        switch (string.hashCode()) {
            case -2146525273:
                if (string.equals("accepted")) {
                    return 1;
                }
                break;
            case -1320822226:
                if (string.equals("tentative")) {
                    return 4;
                }
                break;
            case 568196142:
                if (string.equals("declined")) {
                    return 2;
                }
                break;
            case 1960030843:
                if (string.equals("invited")) {
                    return 3;
                }
                break;
        }
        return 0;
    }

    public static final String attendeeStatusStringMatchingConstant(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? PermissionsResponse.SCOPE_NONE : "tentative" : "invited" : "declined" : "accepted" : PermissionsResponse.SCOPE_NONE;
    }

    public static final int attendeeTypeConstantMatchingString(String string) {
        s.g(string, "string");
        int hashCode = string.hashCode();
        if (hashCode != -393139297) {
            if (hashCode != -341064690) {
                if (hashCode == -79017120 && string.equals("optional")) {
                    return 2;
                }
            } else if (string.equals("resource")) {
                return 3;
            }
        } else if (string.equals("required")) {
            return 1;
        }
        return 0;
    }

    public static final String attendeeTypeStringMatchingConstant(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? PermissionsResponse.SCOPE_NONE : "resource" : "optional" : "required" : PermissionsResponse.SCOPE_NONE;
    }

    public static final int availabilityConstantMatchingString(String string) {
        s.g(string, "string");
        if (s.c(string, "free")) {
            return 1;
        }
        return s.c(string, "tentative") ? 2 : 0;
    }

    public static final String availabilityStringMatchingConstant(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? "busy" : "tentative" : "free" : "busy";
    }

    public static final int calAccessConstantMatchingString(String string) {
        s.g(string, "string");
        switch (string.hashCode()) {
            case -1895276325:
                if (string.equals("contributor")) {
                    return 500;
                }
                break;
            case -1537912219:
                if (string.equals("freebusy")) {
                    return 100;
                }
                break;
            case -1307827859:
                if (string.equals("editor")) {
                    return 600;
                }
                break;
            case 3496342:
                if (string.equals("read")) {
                    return 200;
                }
                break;
            case 3506402:
                if (string.equals("root")) {
                    return 800;
                }
                break;
            case 106164915:
                if (string.equals("owner")) {
                    return 700;
                }
                break;
            case 529996748:
                if (string.equals("override")) {
                    return 400;
                }
                break;
            case 1097400469:
                if (string.equals("respond")) {
                    return 300;
                }
                break;
        }
        return 0;
    }

    public static final String calAccessStringMatchingConstant(int i11) {
        return i11 != 0 ? i11 != 100 ? i11 != 200 ? i11 != 300 ? i11 != 400 ? i11 != 500 ? i11 != 600 ? i11 != 700 ? i11 != 800 ? PermissionsResponse.SCOPE_NONE : "root" : "owner" : "editor" : "contributor" : "override" : "respond" : "read" : "freebusy" : PermissionsResponse.SCOPE_NONE;
    }

    public static final ArrayList<String> calendarAllowedAttendeeTypesFromDBString(String dbString) {
        List E0;
        s.g(dbString, "dbString");
        ArrayList<String> arrayList = new ArrayList<>();
        E0 = w.E0(dbString, new String[]{","}, false, 0, 6, null);
        int i11 = 0;
        Object[] array = E0.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        int length = strArr.length;
        while (i11 < length) {
            String str = strArr[i11];
            i11++;
            try {
                arrayList.add(attendeeTypeStringMatchingConstant(Integer.parseInt(str)));
            } catch (NumberFormatException e11) {
                Log.e(CalendarModule.Companion.getTAG$expo_calendar_release(), "Couldn't convert attendee constant into an int.", e11);
            }
        }
        return arrayList;
    }

    public static final ArrayList<String> calendarAllowedAvailabilitiesFromDBString(String dbString) {
        List E0;
        s.g(dbString, "dbString");
        ArrayList<String> arrayList = new ArrayList<>();
        E0 = w.E0(dbString, new String[]{","}, false, 0, 6, null);
        int i11 = 0;
        Object[] array = E0.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        int length = strArr.length;
        while (i11 < length) {
            String str = strArr[i11];
            i11++;
            int parseInt = Integer.parseInt(str);
            if (parseInt == 0) {
                arrayList.add("busy");
            } else if (parseInt == 1) {
                arrayList.add("free");
            } else if (parseInt == 2) {
                arrayList.add("tentative");
            }
        }
        return arrayList;
    }

    public static final ArrayList<String> calendarAllowedRemindersFromDBString(String dbString) {
        List E0;
        s.g(dbString, "dbString");
        ArrayList<String> arrayList = new ArrayList<>();
        E0 = w.E0(dbString, new String[]{","}, false, 0, 6, null);
        int i11 = 0;
        Object[] array = E0.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        int length = strArr.length;
        while (i11 < length) {
            String str = strArr[i11];
            i11++;
            try {
                arrayList.add(reminderStringMatchingConstant(Integer.parseInt(str)));
            } catch (NumberFormatException e11) {
                Log.e(CalendarModule.Companion.getTAG$expo_calendar_release(), "Couldn't convert reminder constant into an int.", e11);
            }
        }
        return arrayList;
    }

    public static final int reminderConstantMatchingString(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 114009:
                    if (str.equals("sms")) {
                        return 3;
                    }
                    break;
                case 92895825:
                    if (str.equals("alarm")) {
                        return 4;
                    }
                    break;
                case 92899676:
                    if (str.equals("alert")) {
                        return 1;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        return 2;
                    }
                    break;
            }
        }
        return 0;
    }

    public static final String reminderStringMatchingConstant(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "default" : "alarm" : "sms" : "email" : "alert" : "default";
    }
}