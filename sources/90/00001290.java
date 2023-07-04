package com.adyen.checkout.card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u001f\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/card/api/model/AddressItem;", "Lp7/c;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", "id", "name", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", "card_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class AddressItem extends c {
    private static final String ID = "id";
    private static final String NAME = "name";

    /* renamed from: id  reason: collision with root package name */
    private final String f9538id;
    private final String name;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<AddressItem> CREATOR = new c.a(AddressItem.class);
    private static final c.b<AddressItem> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<AddressItem> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public AddressItem a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new AddressItem(p7.b.b(jsonObject, "id"), p7.b.b(jsonObject, "name"));
            } catch (JSONException e11) {
                throw new ModelSerializationException(AddressItem.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(AddressItem modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", modelObject.getId());
                jSONObject.putOpt("name", modelObject.getName());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(AddressItem.class, e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c.b<AddressItem> a() {
            return AddressItem.SERIALIZER;
        }
    }

    public AddressItem() {
        this(null, null, 3, null);
    }

    public /* synthetic */ AddressItem(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ AddressItem copy$default(AddressItem addressItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addressItem.f9538id;
        }
        if ((i11 & 2) != 0) {
            str2 = addressItem.name;
        }
        return addressItem.copy(str, str2);
    }

    public static final c.b<AddressItem> getSERIALIZER() {
        return Companion.a();
    }

    public final String component1() {
        return this.f9538id;
    }

    public final String component2() {
        return this.name;
    }

    public final AddressItem copy(String str, String str2) {
        return new AddressItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressItem) {
            AddressItem addressItem = (AddressItem) obj;
            return s.c(this.f9538id, addressItem.f9538id) && s.c(this.name, addressItem.name);
        }
        return false;
    }

    public final String getId() {
        return this.f9538id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.f9538id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AddressItem(id=" + ((Object) this.f9538id) + ", name=" + ((Object) this.name) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }

    public AddressItem(String str, String str2) {
        this.f9538id = str;
        this.name = str2;
    }
}