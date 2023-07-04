package com.tesla.data.oapi;

import ezvcard.property.Kind;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tesla/data/oapi/Calendar;", "", "", "name", "color", "", "Lcom/tesla/data/oapi/Calendar$Event;", "events", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Event", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Calendar {
    @ir.b(name = "name")

    /* renamed from: a  reason: collision with root package name */
    private final String f21532a;
    @ir.b(name = "color")

    /* renamed from: b  reason: collision with root package name */
    private final String f21533b;
    @ir.b(name = "events")

    /* renamed from: c  reason: collision with root package name */
    private final List<Event> f21534c;

    @com.squareup.moshi.g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/tesla/data/oapi/Calendar$Event;", "", "", "allDay", "", "Lcom/tesla/data/oapi/MillisecondsSince1970;", "start", "end", "", "name", Kind.LOCATION, "notes", "organizer", "cancelled", "tentative", "<init>", "(ZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Event {
        @ir.b(name = "all_day")

        /* renamed from: a  reason: collision with root package name */
        private final boolean f21535a;
        @ir.b(name = "start")

        /* renamed from: b  reason: collision with root package name */
        private final long f21536b;
        @ir.b(name = "end")

        /* renamed from: c  reason: collision with root package name */
        private final long f21537c;
        @ir.b(name = "name")

        /* renamed from: d  reason: collision with root package name */
        private final String f21538d;
        @ir.b(name = Kind.LOCATION)

        /* renamed from: e  reason: collision with root package name */
        private final String f21539e;
        @ir.b(name = "description")

        /* renamed from: f  reason: collision with root package name */
        private final String f21540f;
        @ir.b(name = "organizer")

        /* renamed from: g  reason: collision with root package name */
        private final String f21541g;
        @ir.b(name = "cancelled")

        /* renamed from: h  reason: collision with root package name */
        private final Boolean f21542h;
        @ir.b(name = "tentative")

        /* renamed from: i  reason: collision with root package name */
        private final Boolean f21543i;

        public Event(boolean z11, long j11, long j12, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
            this.f21535a = z11;
            this.f21536b = j11;
            this.f21537c = j12;
            this.f21538d = str;
            this.f21539e = str2;
            this.f21540f = str3;
            this.f21541g = str4;
            this.f21542h = bool;
            this.f21543i = bool2;
        }

        public final boolean a() {
            return this.f21535a;
        }

        public final Boolean b() {
            return this.f21542h;
        }

        public final long c() {
            return this.f21537c;
        }

        public final String d() {
            return this.f21539e;
        }

        public final String e() {
            return this.f21538d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Event) {
                Event event = (Event) obj;
                return this.f21535a == event.f21535a && this.f21536b == event.f21536b && this.f21537c == event.f21537c && s.c(this.f21538d, event.f21538d) && s.c(this.f21539e, event.f21539e) && s.c(this.f21540f, event.f21540f) && s.c(this.f21541g, event.f21541g) && s.c(this.f21542h, event.f21542h) && s.c(this.f21543i, event.f21543i);
            }
            return false;
        }

        public final String f() {
            return this.f21540f;
        }

        public final String g() {
            return this.f21541g;
        }

        public final long h() {
            return this.f21536b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        public int hashCode() {
            boolean z11 = this.f21535a;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int hashCode = ((((r02 * 31) + Long.hashCode(this.f21536b)) * 31) + Long.hashCode(this.f21537c)) * 31;
            String str = this.f21538d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f21539e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21540f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f21541g;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.f21542h;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f21543i;
            return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean i() {
            return this.f21543i;
        }

        public String toString() {
            boolean z11 = this.f21535a;
            long j11 = this.f21536b;
            long j12 = this.f21537c;
            String str = this.f21538d;
            String str2 = this.f21539e;
            String str3 = this.f21540f;
            String str4 = this.f21541g;
            Boolean bool = this.f21542h;
            Boolean bool2 = this.f21543i;
            return "Event(allDay=" + z11 + ", start=" + j11 + ", end=" + j12 + ", name=" + str + ", location=" + str2 + ", notes=" + str3 + ", organizer=" + str4 + ", cancelled=" + bool + ", tentative=" + bool2 + ")";
        }
    }

    public Calendar(String name, String color, List<Event> events) {
        s.g(name, "name");
        s.g(color, "color");
        s.g(events, "events");
        this.f21532a = name;
        this.f21533b = color;
        this.f21534c = events;
    }

    public final String a() {
        return this.f21533b;
    }

    public final List<Event> b() {
        return this.f21534c;
    }

    public final String c() {
        return this.f21532a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Calendar) {
            Calendar calendar = (Calendar) obj;
            return s.c(this.f21532a, calendar.f21532a) && s.c(this.f21533b, calendar.f21533b) && s.c(this.f21534c, calendar.f21534c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21532a.hashCode() * 31) + this.f21533b.hashCode()) * 31) + this.f21534c.hashCode();
    }

    public String toString() {
        String str = this.f21532a;
        String str2 = this.f21533b;
        List<Event> list = this.f21534c;
        return "Calendar(name=" + str + ", color=" + str2 + ", events=" + list + ")";
    }
}