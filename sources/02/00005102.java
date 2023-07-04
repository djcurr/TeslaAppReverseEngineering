package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes6.dex */
public final class ConsumerSession implements StripeModel {
    private final String authSessionClientSecret;
    private final String clientSecret;
    private final String emailAddress;
    private final String redactedPhoneNumber;
    private final List<VerificationSession> verificationSessions;
    public static final Parcelable.Creator<ConsumerSession> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ConsumerSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSession createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(VerificationSession.CREATOR.createFromParcel(parcel));
            }
            return new ConsumerSession(readString, readString2, readString3, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSession[] newArray(int i11) {
            return new ConsumerSession[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static final class VerificationSession implements StripeModel {
        private final SessionState state;
        private final SessionType type;
        public static final Parcelable.Creator<VerificationSession> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<VerificationSession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSession createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new VerificationSession(SessionType.CREATOR.createFromParcel(parcel), SessionState.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSession[] newArray(int i11) {
                return new VerificationSession[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum SessionState implements Parcelable {
            Unknown(""),
            Started("started"),
            Failed("failed"),
            Verified("verified"),
            Canceled("canceled"),
            Expired("expired");
            
            private final String value;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<SessionState> CREATOR = new Creator();

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SessionState fromValue(String value) {
                    SessionState sessionState;
                    boolean u11;
                    s.g(value, "value");
                    SessionState[] values = SessionState.values();
                    int length = values.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            sessionState = null;
                            break;
                        }
                        sessionState = values[i11];
                        u11 = v.u(sessionState.getValue(), value, true);
                        if (u11) {
                            break;
                        }
                        i11++;
                    }
                    return sessionState == null ? SessionState.Unknown : sessionState;
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<SessionState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionState createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return SessionState.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionState[] newArray(int i11) {
                    return new SessionState[i11];
                }
            }

            SessionState(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(name());
            }
        }

        /* loaded from: classes6.dex */
        public enum SessionType implements Parcelable {
            Unknown(""),
            SignUp("signup"),
            Email("email"),
            Sms("sms");
            
            private final String value;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<SessionType> CREATOR = new Creator();

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SessionType fromValue(String value) {
                    SessionType sessionType;
                    boolean u11;
                    s.g(value, "value");
                    SessionType[] values = SessionType.values();
                    int length = values.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            sessionType = null;
                            break;
                        }
                        sessionType = values[i11];
                        u11 = v.u(sessionType.getValue(), value, true);
                        if (u11) {
                            break;
                        }
                        i11++;
                    }
                    return sessionType == null ? SessionType.Unknown : sessionType;
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<SessionType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionType createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return SessionType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionType[] newArray(int i11) {
                    return new SessionType[i11];
                }
            }

            SessionType(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(name());
            }
        }

        public VerificationSession(SessionType type, SessionState state) {
            s.g(type, "type");
            s.g(state, "state");
            this.type = type;
            this.state = state;
        }

        public static /* synthetic */ VerificationSession copy$default(VerificationSession verificationSession, SessionType sessionType, SessionState sessionState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sessionType = verificationSession.type;
            }
            if ((i11 & 2) != 0) {
                sessionState = verificationSession.state;
            }
            return verificationSession.copy(sessionType, sessionState);
        }

        public final SessionType component1() {
            return this.type;
        }

        public final SessionState component2() {
            return this.state;
        }

        public final VerificationSession copy(SessionType type, SessionState state) {
            s.g(type, "type");
            s.g(state, "state");
            return new VerificationSession(type, state);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VerificationSession) {
                VerificationSession verificationSession = (VerificationSession) obj;
                return this.type == verificationSession.type && this.state == verificationSession.state;
            }
            return false;
        }

        public final SessionState getState() {
            return this.state;
        }

        public final SessionType getType() {
            return this.type;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return (this.type.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "VerificationSession(type=" + this.type + ", state=" + this.state + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.type.writeToParcel(out, i11);
            this.state.writeToParcel(out, i11);
        }
    }

    public ConsumerSession(String clientSecret, String emailAddress, String redactedPhoneNumber, List<VerificationSession> verificationSessions, String str) {
        s.g(clientSecret, "clientSecret");
        s.g(emailAddress, "emailAddress");
        s.g(redactedPhoneNumber, "redactedPhoneNumber");
        s.g(verificationSessions, "verificationSessions");
        this.clientSecret = clientSecret;
        this.emailAddress = emailAddress;
        this.redactedPhoneNumber = redactedPhoneNumber;
        this.verificationSessions = verificationSessions;
        this.authSessionClientSecret = str;
    }

    public static /* synthetic */ ConsumerSession copy$default(ConsumerSession consumerSession, String str, String str2, String str3, List list, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = consumerSession.clientSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = consumerSession.emailAddress;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = consumerSession.redactedPhoneNumber;
        }
        String str6 = str3;
        List<VerificationSession> list2 = list;
        if ((i11 & 8) != 0) {
            list2 = consumerSession.verificationSessions;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            str4 = consumerSession.authSessionClientSecret;
        }
        return consumerSession.copy(str, str5, str6, list3, str4);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.emailAddress;
    }

    public final String component3() {
        return this.redactedPhoneNumber;
    }

    public final List<VerificationSession> component4() {
        return this.verificationSessions;
    }

    public final String component5() {
        return this.authSessionClientSecret;
    }

    public final ConsumerSession copy(String clientSecret, String emailAddress, String redactedPhoneNumber, List<VerificationSession> verificationSessions, String str) {
        s.g(clientSecret, "clientSecret");
        s.g(emailAddress, "emailAddress");
        s.g(redactedPhoneNumber, "redactedPhoneNumber");
        s.g(verificationSessions, "verificationSessions");
        return new ConsumerSession(clientSecret, emailAddress, redactedPhoneNumber, verificationSessions, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsumerSession) {
            ConsumerSession consumerSession = (ConsumerSession) obj;
            return s.c(this.clientSecret, consumerSession.clientSecret) && s.c(this.emailAddress, consumerSession.emailAddress) && s.c(this.redactedPhoneNumber, consumerSession.redactedPhoneNumber) && s.c(this.verificationSessions, consumerSession.verificationSessions) && s.c(this.authSessionClientSecret, consumerSession.authSessionClientSecret);
        }
        return false;
    }

    public final String getAuthSessionClientSecret() {
        return this.authSessionClientSecret;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final List<VerificationSession> getVerificationSessions() {
        return this.verificationSessions;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.clientSecret.hashCode() * 31) + this.emailAddress.hashCode()) * 31) + this.redactedPhoneNumber.hashCode()) * 31) + this.verificationSessions.hashCode()) * 31;
        String str = this.authSessionClientSecret;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConsumerSession(clientSecret=" + this.clientSecret + ", emailAddress=" + this.emailAddress + ", redactedPhoneNumber=" + this.redactedPhoneNumber + ", verificationSessions=" + this.verificationSessions + ", authSessionClientSecret=" + ((Object) this.authSessionClientSecret) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.emailAddress);
        out.writeString(this.redactedPhoneNumber);
        List<VerificationSession> list = this.verificationSessions;
        out.writeInt(list.size());
        for (VerificationSession verificationSession : list) {
            verificationSession.writeToParcel(out, i11);
        }
        out.writeString(this.authSessionClientSecret);
    }
}