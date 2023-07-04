package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tesla/domain/model/ReverseGeocodedObject;", "", "", "component1", "component2", "name", "city", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getCity", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ReverseGeocodedObject {
    @b(name = "city")
    private final String city;
    @b(name = "name")
    private final String name;

    public ReverseGeocodedObject(String str, String str2) {
        this.name = str;
        this.city = str2;
    }

    public static /* synthetic */ ReverseGeocodedObject copy$default(ReverseGeocodedObject reverseGeocodedObject, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reverseGeocodedObject.name;
        }
        if ((i11 & 2) != 0) {
            str2 = reverseGeocodedObject.city;
        }
        return reverseGeocodedObject.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.city;
    }

    public final ReverseGeocodedObject copy(String str, String str2) {
        return new ReverseGeocodedObject(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReverseGeocodedObject) {
            ReverseGeocodedObject reverseGeocodedObject = (ReverseGeocodedObject) obj;
            return s.c(this.name, reverseGeocodedObject.name) && s.c(this.city, reverseGeocodedObject.city);
        }
        return false;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.city;
        return "ReverseGeocodedObject(name=" + str + ", city=" + str2 + ")";
    }
}