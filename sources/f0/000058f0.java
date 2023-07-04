package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.n0;
import wz.s0;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class MessageExtension implements Parcelable {
    private static final int DATA_VALUE_MAX_LENGTH = 8059;
    public static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
    public static final String FIELD_DATA = "data";
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    private static final int ID_MAX_LENGTH = 64;
    private static final int MESSAGE_EXTENSIONS_MAX_COUNT = 10;
    private static final int NAME_MAX_LENGTH = 64;
    private static final List<String> SUPPORTED_MESSAGE_EXTENSIONS;
    private final boolean criticalityIndicator;
    private final Map<String, String> data;

    /* renamed from: id  reason: collision with root package name */
    private final String f21022id;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<MessageExtension> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MessageExtension(readString, readString2, z11, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension[] newArray(int i11) {
            return new MessageExtension[i11];
        }
    }

    static {
        List<String> i11;
        i11 = w.i();
        SUPPORTED_MESSAGE_EXTENSIONS = i11;
    }

    public MessageExtension(String name, String id2, boolean z11, Map<String, String> data) {
        s.g(name, "name");
        s.g(id2, "id");
        s.g(data, "data");
        this.name = name;
        this.f21022id = id2;
        this.criticalityIndicator = z11;
        this.data = data;
    }

    private final Map<String, String> component4() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageExtension copy$default(MessageExtension messageExtension, String str, String str2, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageExtension.name;
        }
        if ((i11 & 2) != 0) {
            str2 = messageExtension.f21022id;
        }
        if ((i11 & 4) != 0) {
            z11 = messageExtension.criticalityIndicator;
        }
        if ((i11 & 8) != 0) {
            map = messageExtension.data;
        }
        return messageExtension.copy(str, str2, z11, map);
    }

    public static final List<MessageExtension> fromJson(JSONArray jSONArray) {
        return Companion.fromJson(jSONArray);
    }

    public static final JSONArray toJsonArray(List<MessageExtension> list) {
        return Companion.toJsonArray(list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2$3ds2sdk_release() {
        return this.f21022id;
    }

    public final boolean component3() {
        return this.criticalityIndicator;
    }

    public final MessageExtension copy(String name, String id2, boolean z11, Map<String, String> data) {
        s.g(name, "name");
        s.g(id2, "id");
        s.g(data, "data");
        return new MessageExtension(name, id2, z11, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageExtension) {
            MessageExtension messageExtension = (MessageExtension) obj;
            return s.c(this.name, messageExtension.name) && s.c(this.f21022id, messageExtension.f21022id) && this.criticalityIndicator == messageExtension.criticalityIndicator && s.c(this.data, messageExtension.data);
        }
        return false;
    }

    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public final String getId$3ds2sdk_release() {
        return this.f21022id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.f21022id.hashCode()) * 31;
        boolean z11 = this.criticalityIndicator;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((hashCode + i11) * 31) + this.data.hashCode();
    }

    public final boolean isProcessable() {
        return SUPPORTED_MESSAGE_EXTENSIONS.contains(this.name);
    }

    public final JSONObject toJson$3ds2sdk_release() {
        JSONObject put = new JSONObject().put("name", this.name).put("id", this.f21022id).put(FIELD_CRITICALITY_INDICATOR, this.criticalityIndicator).put(FIELD_DATA, new JSONObject(this.data));
        s.f(put, "JSONObject()\n           …D_DATA, JSONObject(data))");
        return put;
    }

    public String toString() {
        return "MessageExtension(name=" + this.name + ", id=" + this.f21022id + ", criticalityIndicator=" + this.criticalityIndicator + ", data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.name);
        out.writeString(this.f21022id);
        out.writeInt(this.criticalityIndicator ? 1 : 0);
        Map<String, String> map = this.data;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public /* synthetic */ MessageExtension(String str, String str2, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11, (i11 & 8) != 0 ? s0.i() : map);
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<MessageExtension> fromJson(JSONArray jSONArray) {
            i r11;
            int t11;
            if (jSONArray == null) {
                return null;
            }
            r11 = l.r(0, jSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList();
            Iterator<Integer> it2 = r11.iterator();
            while (it2.hasNext()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(((n0) it2).a());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            t11 = x.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (JSONObject jSONObject : arrayList) {
                arrayList2.add(MessageExtension.Companion.fromJson(jSONObject));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeRequestData.FIELD_MESSAGE_EXTENSION);
        }

        public final JSONArray toJsonArray(List<MessageExtension> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (MessageExtension messageExtension : list) {
                jSONArray.put(messageExtension.toJson$3ds2sdk_release());
            }
            return jSONArray;
        }

        private final MessageExtension fromJson(JSONObject jSONObject) {
            String name = jSONObject.optString("name");
            if (name.length() <= 64) {
                String id2 = jSONObject.optString("id");
                if (id2.length() <= 64) {
                    HashMap hashMap = new HashMap();
                    JSONObject optJSONObject = jSONObject.optJSONObject(MessageExtension.FIELD_DATA);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String key = keys.next();
                            String value = optJSONObject.optString(key);
                            if (value.length() <= MessageExtension.DATA_VALUE_MAX_LENGTH) {
                                s.f(key, "key");
                                s.f(value, "value");
                                hashMap.put(key, value);
                            } else {
                                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.data.value");
                            }
                        }
                    }
                    s.f(name, "name");
                    s.f(id2, "id");
                    return new MessageExtension(name, id2, jSONObject.optBoolean(MessageExtension.FIELD_CRITICALITY_INDICATOR), hashMap);
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.id");
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.name");
        }
    }
}