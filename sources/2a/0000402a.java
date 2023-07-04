package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nn.c;

/* loaded from: classes2.dex */
public final class User implements Serializable {
    @c(MessageExtension.FIELD_DATA)
    private final Map<String, Object> data;
    @c("email")
    private final String email;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f18275id;
    @c("ipAddress")
    private final String ipAddress;
    @c("username")
    private final String username;

    public User() {
        this(null, null, null, null, null, 31, null);
    }

    public User(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.f18275id = str;
        this.username = str2;
        this.ipAddress = str3;
        this.email = str4;
        this.data = map;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = user.f18275id;
        }
        if ((i11 & 2) != 0) {
            str2 = user.username;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = user.ipAddress;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = user.email;
        }
        String str7 = str4;
        Map<String, Object> map2 = map;
        if ((i11 & 16) != 0) {
            map2 = user.data;
        }
        return user.copy(str, str5, str6, str7, map2);
    }

    public final String component1() {
        return this.f18275id;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.ipAddress;
    }

    public final String component4() {
        return this.email;
    }

    public final Map<String, Object> component5() {
        return this.data;
    }

    public final User copy(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        return new User(str, str2, str3, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            return s.c(this.f18275id, user.f18275id) && s.c(this.username, user.username) && s.c(this.ipAddress, user.ipAddress) && s.c(this.email, user.email) && s.c(this.data, user.data);
        }
        return false;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.f18275id;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.f18275id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ipAddress;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.data;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("User(id=");
        a11.append((Object) this.f18275id);
        a11.append(", username=");
        a11.append((Object) this.username);
        a11.append(", ipAddress=");
        a11.append((Object) this.ipAddress);
        a11.append(", email=");
        a11.append((Object) this.email);
        a11.append(", data=");
        a11.append(this.data);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : map);
    }
}