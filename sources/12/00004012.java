package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.swmansion.reanimated.BuildConfig;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nn.c;
import wz.s0;

/* loaded from: classes2.dex */
public final class Breadcrumb {
    @c("category")
    private final String category;
    @c(MessageExtension.FIELD_DATA)
    private final Map<String, String> data;
    @c("level")
    private final CrashLogLevel level;
    @c("message")
    private final String message;
    @c(FraudDetectionData.KEY_TIMESTAMP)
    private final Date timestamp;
    @c("type")
    private final Type type;

    /* loaded from: classes2.dex */
    public enum Level {
        DEBUG(BuildConfig.BUILD_TYPE),
        INFO("info"),
        WARNING("warning"),
        ERROR("error"),
        CRITICAL("critical");
        
        @c("value")
        private final String value;

        Level(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* loaded from: classes2.dex */
    public enum Type {
        DEFAULT("default"),
        HTTP("http"),
        NAVIGATION("navigation"),
        USER("user"),
        USER_ACTION("user_action");
        
        @c("value")
        private final String value;

        Type(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Breadcrumb() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Breadcrumb(Type type, Date timestamp, CrashLogLevel level, String message, String category, Map<String, String> data) {
        s.g(timestamp, "timestamp");
        s.g(level, "level");
        s.g(message, "message");
        s.g(category, "category");
        s.g(data, "data");
        this.type = type;
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
        this.category = category;
        this.data = data;
    }

    public static /* synthetic */ Breadcrumb copy$default(Breadcrumb breadcrumb, Type type, Date date, CrashLogLevel crashLogLevel, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            type = breadcrumb.type;
        }
        if ((i11 & 2) != 0) {
            date = breadcrumb.timestamp;
        }
        Date date2 = date;
        if ((i11 & 4) != 0) {
            crashLogLevel = breadcrumb.level;
        }
        CrashLogLevel crashLogLevel2 = crashLogLevel;
        if ((i11 & 8) != 0) {
            str = breadcrumb.message;
        }
        String str3 = str;
        if ((i11 & 16) != 0) {
            str2 = breadcrumb.category;
        }
        String str4 = str2;
        Map<String, String> map2 = map;
        if ((i11 & 32) != 0) {
            map2 = breadcrumb.data;
        }
        return breadcrumb.copy(type, date2, crashLogLevel2, str3, str4, map2);
    }

    public final Type component1() {
        return this.type;
    }

    public final Date component2() {
        return this.timestamp;
    }

    public final CrashLogLevel component3() {
        return this.level;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.category;
    }

    public final Map<String, String> component6() {
        return this.data;
    }

    public final Breadcrumb copy(Type type, Date timestamp, CrashLogLevel level, String message, String category, Map<String, String> data) {
        s.g(timestamp, "timestamp");
        s.g(level, "level");
        s.g(message, "message");
        s.g(category, "category");
        s.g(data, "data");
        return new Breadcrumb(type, timestamp, level, message, category, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Breadcrumb) {
            Breadcrumb breadcrumb = (Breadcrumb) obj;
            return this.type == breadcrumb.type && s.c(this.timestamp, breadcrumb.timestamp) && this.level == breadcrumb.level && s.c(this.message, breadcrumb.message) && s.c(this.category, breadcrumb.category) && s.c(this.data, breadcrumb.data);
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final CrashLogLevel getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = this.type;
        int hashCode = type == null ? 0 : type.hashCode();
        int hashCode2 = this.timestamp.hashCode();
        int hashCode3 = this.level.hashCode();
        int hashCode4 = this.message.hashCode();
        return this.data.hashCode() + ((this.category.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("Breadcrumb(type=");
        a11.append(this.type);
        a11.append(", timestamp=");
        a11.append(this.timestamp);
        a11.append(", level=");
        a11.append(this.level);
        a11.append(", message=");
        a11.append(this.message);
        a11.append(", category=");
        a11.append(this.category);
        a11.append(", data=");
        a11.append(this.data);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    public /* synthetic */ Breadcrumb(Type type, Date date, CrashLogLevel crashLogLevel, String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : type, (i11 & 2) != 0 ? new Date() : date, (i11 & 4) != 0 ? CrashLogLevel.INFO : crashLogLevel, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? "" : str2, (i11 & 32) != 0 ? s0.i() : map);
    }
}