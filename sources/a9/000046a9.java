package com.plaid.link.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.link.exception.LinkConfigurationMalformedLinkTokenException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public enum PlaidEnvironment implements Parcelable {
    PRODUCTION("production"),
    DEVELOPMENT("development"),
    SANDBOX("sandbox");
    
    public static final Parcelable.Creator<PlaidEnvironment> CREATOR;
    public static final Companion Companion;
    private static final Map<String, PlaidEnvironment> map;
    private final String json;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlaidEnvironment fromJson(String json) {
            s.g(json, "json");
            PlaidEnvironment plaidEnvironment = (PlaidEnvironment) PlaidEnvironment.map.get(json);
            return plaidEnvironment == null ? PlaidEnvironment.SANDBOX : plaidEnvironment;
        }

        public final PlaidEnvironment fromLinkToken(String token) {
            boolean M;
            s.g(token, "token");
            PlaidEnvironment[] values = PlaidEnvironment.values();
            int length = values.length;
            int i11 = 0;
            PlaidEnvironment plaidEnvironment = null;
            while (i11 < length) {
                PlaidEnvironment plaidEnvironment2 = values[i11];
                i11++;
                M = w.M(token, plaidEnvironment2.getJson(), false, 2, null);
                if (M) {
                    plaidEnvironment = plaidEnvironment2;
                }
            }
            if (plaidEnvironment != null) {
                return plaidEnvironment;
            }
            throw LinkConfigurationMalformedLinkTokenException.INSTANCE;
        }
    }

    static {
        Map<String, PlaidEnvironment> l11;
        PlaidEnvironment plaidEnvironment = PRODUCTION;
        PlaidEnvironment plaidEnvironment2 = DEVELOPMENT;
        PlaidEnvironment plaidEnvironment3 = SANDBOX;
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<PlaidEnvironment>() { // from class: com.plaid.link.configuration.PlaidEnvironment.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlaidEnvironment createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return PlaidEnvironment.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlaidEnvironment[] newArray(int i11) {
                return new PlaidEnvironment[i11];
            }
        };
        l11 = s0.l(v.a(plaidEnvironment.json, plaidEnvironment), v.a(plaidEnvironment2.json, plaidEnvironment2), v.a(plaidEnvironment3.json, plaidEnvironment3));
        map = l11;
    }

    PlaidEnvironment(String str) {
        this.json = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getJson() {
        return this.json;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(name());
    }
}